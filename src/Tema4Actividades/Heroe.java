package Tema4Actividades;

import java.util.Random;
import java.util.Scanner;

public class Heroe {
    Random random = new Random();

    //ATRIBUTOS
    String nombre;
    int level, health, maxHealth, experience, attack, defense;
    private static final int pocionVida = 10;
    private static final int pocionGrandeVida = 50;
    private static final int danoMinimo = 10;
    private static final int expGanada = 10;
    private static final int expSubirNivel = 50;


    //CONSTRUCTOR VACÍO


    public Heroe(String nombre, int level, int health, int maxHealth, int experience, int attack, int defense) {
        this.nombre= nombre;
        this.level = 1;
        this.health = maxHealth;
        this.maxHealth = maxHealth;
        this.experience = experience;
        this.attack = attack;
        this.defense = defense;
    }


    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getLevel() {
        return level;
    }
    public void setLevel(int level) {
        this.level = level;
    }
    public int getHealth() {
        return health;
    }
    public void setHealth(int health) {
        this.health = health;
    }
    public int getMaxHealth() {
        return maxHealth;
    }
    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }
    public int getExperience() {
        return experience;
    }
    public void setExperience(int experience) {
        this.experience = experience;
    }
    public int getAttack() {
        return attack;
    }
    public void setAttack(int attack) {
        this.attack = attack;
    }
    public int getDefense() {
        return defense;
    }
    public void setDefense(int defense) {
        this.defense = defense;
    }

    //METODOS
    public int pocionVida () {
        this.health = this.health + pocionVida;
        if  (this.health > maxHealth) {
            this.health = maxHealth;
        }
        return health;
    }
    public int rest() {
        this.health = this.health + pocionGrandeVida;
          if  (this.health > maxHealth) {
              this.health = maxHealth;
          }
          return health;
    }
    public String toString() {
        return "Nombre: " +nombre+ " / " + "Nivel: "+level+ " / " + "Vida: "+health+ " / " +
                "Vida Maxima " +maxHealth+ " / " + "Experiencia: " +experience+ " / " +
                "Ataque: " +attack+ " / " + "Defensa: " +defense;
    }
    public void attack(Heroe enemigo) {
        int limiteMaximo = Math.max(this.attack - enemigo.getDefense(), danoMinimo);
        int danoProducido = random.nextInt(limiteMaximo) + 1;

        enemigo.setHealth(enemigo.getHealth() - danoProducido);
        if (enemigo.getHealth() < 0) {
            enemigo.setHealth(0);
        }
        this.experience += expGanada;
        if (this.experience >= expSubirNivel) {
            levelUp();
            this.experience = 0;
        }
    }
    public void levelUp() {
        this.level++;
        this.maxHealth += 5;
        this.health += 5;
        this.attack += 1;
        this.defense += 1;
}
}
