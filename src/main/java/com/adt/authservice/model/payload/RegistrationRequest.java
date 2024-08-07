/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.adt.authservice.model.payload;

import java.util.Set;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.adt.authservice.model.Role;
import com.adt.authservice.validation.annotation.NullOrNotBlank;
import lombok.Data;

@Data
public class RegistrationRequest {

	@NotBlank(message = "FirstName cannot be null or blank")
	private String firstName;

	private String middleName;

	@NotBlank(message = "LastName cannot be null or blank")
	private String lastName;

	@NotBlank(message = "Registration email can be null but not blank")
	private String email;

	@NotBlank(message = "Registration password cannot be null")
	private String password;

	@NotBlank(message = "Registration password cannot be null")
	private String confirmPassword;

	private String employeeType;

	public RegistrationRequest(@NotNull(message = "FirstName cannot be null") String firstName, String middleName,
			@NotNull(message = "LastName cannot be null") String lastName, String email,
			@NotNull(message = "Registration password cannot be null") String password,
			@NotNull(message = "Registration password cannot be null") String confirmPassword, String employeeType) {

		super();
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.confirmPassword = confirmPassword;
		this.employeeType = employeeType;
	}

	public RegistrationRequest() {
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmployeeType() {
		return employeeType;
	}

	public void setEmployeeType(String employeeType) {
		this.employeeType = employeeType;
	}

}
