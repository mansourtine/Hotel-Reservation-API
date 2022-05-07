package com.cancun.hotelreservationapi.payload;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Getter
@Setter
public class BookingRequest {
  @NotBlank
  @Size(max = 50)
  private String firstname;

  @NotBlank
  @Size(max = 30)
  private String lastname;

  @NotBlank
  @Size(min = 6, max = 15)
  private String phone;

  @NotBlank
  @Size(max = 50)
  @Email
  private String email;

  @NotBlank
  @Size(max = 5)
  private String roomNumber;

}
