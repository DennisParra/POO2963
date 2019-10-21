def validate_dni (dni: str):
    naked_dni = dni[:9]
    digit = dni[-1]
    coeficients = [2, 1, 2, 1, 2, 1, 2, 1, 2]
    coeficient_sum = sum([mult_result-9 if mult_result >= 10 else mult_result for mult_result in [
        int(coeficient)*int(digit) for coeficient, digit in zip (coeficients, naked_dni)]])

    verification_digit = 10-(coeficient_sum %10)
    verification_digit = 0 if verification_digit == 10 else verification_digit

    return True if verification_digit == int (digit) else False

if __name__ == "__main__":
    dni = input ('Enter your DNI: ')
    print(validate_dni(dni))