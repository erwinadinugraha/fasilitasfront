/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.go.pajak.fasilitashibah.domain.dto;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;


@Data
public class UserAuth implements Serializable {
    private String access_token;
    private String token_type;
    private String refresh_token;
    private String expires_in;
    private String scope;
}
