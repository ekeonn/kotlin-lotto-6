package lotto.enums

enum class Exception(val message: String) {
    ERROR_HEADER("[ERROR]"),
    NOT_NUMBER("숫자가 아닙니다"),
    INPUT_IS_BLANK("입력값이 공백입니다"),
    AMOUNT_MUST_BE_THOUSAND_WON("구입금액은 1000원 단위 여야 합니다"),
    DUPLICATED_NUMBER("중복된 숫자가 있습니다."),
    INVALID_COUNT("쉼표로 구분된 6개의 숫자를 입력해주세요."),
    INVALID_CHARACTER("잘못된 입력입니다."),
    INVALID_RANGE_NUMBER("1부터 45 사이의 숫자를 입력해주세요."),
    DUPLICATED_BONUS_NUMBER("당첨번호와 중복 됩니다");
}