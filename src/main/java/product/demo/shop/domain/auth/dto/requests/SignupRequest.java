package product.demo.shop.domain.auth.dto.requests;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@Builder
public class SignupRequest {
    @Email @NotNull private String email;

    @NotNull private String userAccountId;

    @NotNull private String name;

    @NotNull private String password;

    @NotNull private String phoneNumber;

    @NotNull private String address;
}
