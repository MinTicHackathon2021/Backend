/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PlataformaGame.Game.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author eduar
 */
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="newGame")
public class CrearJuego {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idGame;
    private String titulo;
    private String categoria;
    private int nivel;
    private String objetivo;
    private int usuarioId;
    
    
}
