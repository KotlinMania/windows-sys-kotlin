package io.github.kotlinmania.windowssys.windows.win32.globalization

import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.s

public val UDAT_FULL: UDateFormatStyle = 0

public val UDAT_FULL_RELATIVE: UDateFormatStyle = 128

public val UDAT_GENERIC_TZ: Pcstr = s("vvvv")

public val UDAT_HOUR: Pcstr = s("j")

public val UDAT_HOUR0_FIELD: UDateFormatField = 16

public val UDAT_HOUR1_FIELD: UDateFormatField = 15

public val UDAT_HOUR24: Pcstr = s("H")

public val UDAT_HOUR24_MINUTE: Pcstr = s("Hm")

public val UDAT_HOUR24_MINUTE_SECOND: Pcstr = s("Hms")

public val UDAT_HOUR_MINUTE: Pcstr = s("jm")

public val UDAT_HOUR_MINUTE_SECOND: Pcstr = s("jms")

public val UDAT_HOUR_OF_DAY0_FIELD: UDateFormatField = 5

public val UDAT_HOUR_OF_DAY1_FIELD: UDateFormatField = 4

public val UDAT_JULIAN_DAY_FIELD: UDateFormatField = 21

public val UDAT_LOCALIZED_CHARS: UDateFormatSymbolType = 6

public val UDAT_LOCATION_TZ: Pcstr = s("VVVV")

public val UDAT_LONG: UDateFormatStyle = 1

public val UDAT_LONG_RELATIVE: UDateFormatStyle = 129

public val UDAT_MEDIUM: UDateFormatStyle = 2

public val UDAT_MEDIUM_RELATIVE: UDateFormatStyle = 130

public val UDAT_MILLISECONDS_IN_DAY_FIELD: UDateFormatField = 22

public val UDAT_MINUTE: Pcstr = s("m")

public val UDAT_MINUTE_FIELD: UDateFormatField = 6

public val UDAT_MINUTE_SECOND: Pcstr = s("ms")

public val UDAT_MONTH: Pcstr = s("MMMM")

public val UDAT_MONTHS: UDateFormatSymbolType = 1

public val UDAT_MONTH_DAY: Pcstr = s("MMMMd")

public val UDAT_MONTH_FIELD: UDateFormatField = 2

public val UDAT_MONTH_WEEKDAY_DAY: Pcstr = s("MMMMEEEEd")

public val UDAT_NARROW_MONTHS: UDateFormatSymbolType = 8

public val UDAT_NARROW_WEEKDAYS: UDateFormatSymbolType = 9

public val UDAT_NONE: UDateFormatStyle = -1

public val UDAT_NUM_MONTH: Pcstr = s("M")

public val UDAT_NUM_MONTH_DAY: Pcstr = s("Md")

public val UDAT_NUM_MONTH_WEEKDAY_DAY: Pcstr = s("MEd")

public val UDAT_PARSE_ALLOW_NUMERIC: UDateFormatBooleanAttribute = 1

public val UDAT_PARSE_ALLOW_WHITESPACE: UDateFormatBooleanAttribute = 0

public val UDAT_PARSE_MULTIPLE_PATTERNS_FOR_MATCH: UDateFormatBooleanAttribute = 3

public val UDAT_PARSE_PARTIAL_LITERAL_MATCH: UDateFormatBooleanAttribute = 2

public val UDAT_PATTERN: UDateFormatStyle = -2

public val UDAT_QUARTER: Pcstr = s("QQQQ")

public val UDAT_QUARTERS: UDateFormatSymbolType = 16

public val UDAT_QUARTER_FIELD: UDateFormatField = 27

public val UDAT_RELATIVE: UDateFormatStyle = 128

public val UDAT_RELATIVE_DAYS: UDateRelativeUnit = 3

public val UDAT_RELATIVE_HOURS: UDateRelativeUnit = 2

public val UDAT_RELATIVE_MINUTES: UDateRelativeUnit = 1

public val UDAT_RELATIVE_MONTHS: UDateRelativeUnit = 5

public val UDAT_RELATIVE_SECONDS: UDateRelativeUnit = 0

public val UDAT_RELATIVE_UNIT_COUNT: UDateRelativeUnit = 7

public val UDAT_RELATIVE_WEEKS: UDateRelativeUnit = 4

public val UDAT_RELATIVE_YEARS: UDateRelativeUnit = 6

public val UDAT_REL_LITERAL_FIELD: URelativeDateTimeFormatterField = 0

public val UDAT_REL_NUMERIC_FIELD: URelativeDateTimeFormatterField = 1

public val UDAT_REL_UNIT_DAY: URelativeDateTimeUnit = 4

public val UDAT_REL_UNIT_FRIDAY: URelativeDateTimeUnit = 13

public val UDAT_REL_UNIT_HOUR: URelativeDateTimeUnit = 5

public val UDAT_REL_UNIT_MINUTE: URelativeDateTimeUnit = 6

public val UDAT_REL_UNIT_MONDAY: URelativeDateTimeUnit = 9

public val UDAT_REL_UNIT_MONTH: URelativeDateTimeUnit = 2

public val UDAT_REL_UNIT_QUARTER: URelativeDateTimeUnit = 1

public val UDAT_REL_UNIT_SATURDAY: URelativeDateTimeUnit = 14

public val UDAT_REL_UNIT_SECOND: URelativeDateTimeUnit = 7

public val UDAT_REL_UNIT_SUNDAY: URelativeDateTimeUnit = 8

public val UDAT_REL_UNIT_THURSDAY: URelativeDateTimeUnit = 12

public val UDAT_REL_UNIT_TUESDAY: URelativeDateTimeUnit = 10

public val UDAT_REL_UNIT_WEDNESDAY: URelativeDateTimeUnit = 11

public val UDAT_REL_UNIT_WEEK: URelativeDateTimeUnit = 3

public val UDAT_REL_UNIT_YEAR: URelativeDateTimeUnit = 0

public val UDAT_SECOND: Pcstr = s("s")

public val UDAT_SECOND_FIELD: UDateFormatField = 7

public val UDAT_SHORT: UDateFormatStyle = 3

public val UDAT_SHORTER_WEEKDAYS: UDateFormatSymbolType = 20

public val UDAT_SHORT_MONTHS: UDateFormatSymbolType = 2

public val UDAT_SHORT_QUARTERS: UDateFormatSymbolType = 17

public val UDAT_SHORT_RELATIVE: UDateFormatStyle = 131

public val UDAT_SHORT_WEEKDAYS: UDateFormatSymbolType = 4

public val UDAT_SPECIFIC_TZ: Pcstr = s("zzzz")

public val UDAT_STANDALONE_DAY_FIELD: UDateFormatField = 25

public val UDAT_STANDALONE_MONTHS: UDateFormatSymbolType = 10

public val UDAT_STANDALONE_MONTH_FIELD: UDateFormatField = 26

public val UDAT_STANDALONE_NARROW_MONTHS: UDateFormatSymbolType = 12

public val UDAT_STANDALONE_NARROW_WEEKDAYS: UDateFormatSymbolType = 15

public val UDAT_STANDALONE_QUARTERS: UDateFormatSymbolType = 18

public val UDAT_STANDALONE_QUARTER_FIELD: UDateFormatField = 28

public val UDAT_STANDALONE_SHORTER_WEEKDAYS: UDateFormatSymbolType = 21

public val UDAT_STANDALONE_SHORT_MONTHS: UDateFormatSymbolType = 11

public val UDAT_STANDALONE_SHORT_QUARTERS: UDateFormatSymbolType = 19

public val UDAT_STANDALONE_SHORT_WEEKDAYS: UDateFormatSymbolType = 14

public val UDAT_STANDALONE_WEEKDAYS: UDateFormatSymbolType = 13

public val UDAT_STYLE_LONG: UDateRelativeDateTimeFormatterStyle = 0

public val UDAT_STYLE_NARROW: UDateRelativeDateTimeFormatterStyle = 2

public val UDAT_STYLE_SHORT: UDateRelativeDateTimeFormatterStyle = 1

public val UDAT_TIMEZONE_FIELD: UDateFormatField = 17

public val UDAT_TIMEZONE_GENERIC_FIELD: UDateFormatField = 24

public val UDAT_TIMEZONE_ISO_FIELD: UDateFormatField = 32

public val UDAT_TIMEZONE_ISO_LOCAL_FIELD: UDateFormatField = 33

public val UDAT_TIMEZONE_LOCALIZED_GMT_OFFSET_FIELD: UDateFormatField = 31

public val UDAT_TIMEZONE_RFC_FIELD: UDateFormatField = 23

public val UDAT_TIMEZONE_SPECIAL_FIELD: UDateFormatField = 29

public val UDAT_WEEKDAY: Pcstr = s("EEEE")

public val UDAT_WEEKDAYS: UDateFormatSymbolType = 3

public val UDAT_WEEK_OF_MONTH_FIELD: UDateFormatField = 13

public val UDAT_WEEK_OF_YEAR_FIELD: UDateFormatField = 12

public val UDAT_YEAR: Pcstr = s("y")

public val UDAT_YEAR_ABBR_MONTH: Pcstr = s("yMMM")

public val UDAT_YEAR_ABBR_MONTH_DAY: Pcstr = s("yMMMd")

public val UDAT_YEAR_ABBR_MONTH_WEEKDAY_DAY: Pcstr = s("yMMMEd")

public val UDAT_YEAR_ABBR_QUARTER: Pcstr = s("yQQQ")

public val UDAT_YEAR_FIELD: UDateFormatField = 1

public val UDAT_YEAR_MONTH: Pcstr = s("yMMMM")

public val UDAT_YEAR_MONTH_DAY: Pcstr = s("yMMMMd")

public val UDAT_YEAR_MONTH_WEEKDAY_DAY: Pcstr = s("yMMMMEEEEd")

public val UDAT_YEAR_NAME_FIELD: UDateFormatField = 30

public val UDAT_YEAR_NUM_MONTH: Pcstr = s("yM")

public val UDAT_YEAR_NUM_MONTH_DAY: Pcstr = s("yMd")

public val UDAT_YEAR_NUM_MONTH_WEEKDAY_DAY: Pcstr = s("yMEd")

public val UDAT_YEAR_QUARTER: Pcstr = s("yQQQQ")

public val UDAT_YEAR_WOY_FIELD: UDateFormatField = 18

public val UDAT_ZODIAC_NAMES_ABBREVIATED: UDateFormatSymbolType = 26

public val UDAT_ZODIAC_NAMES_NARROW: UDateFormatSymbolType = 27

public val UDAT_ZODIAC_NAMES_WIDE: UDateFormatSymbolType = 25

public val UDISPCTX_CAPITALIZATION_FOR_BEGINNING_OF_SENTENCE: UDisplayContext = 258

public val UDISPCTX_CAPITALIZATION_FOR_MIDDLE_OF_SENTENCE: UDisplayContext = 257

public val UDISPCTX_CAPITALIZATION_FOR_STANDALONE: UDisplayContext = 260

public val UDISPCTX_CAPITALIZATION_FOR_UI_LIST_OR_MENU: UDisplayContext = 259

public val UDISPCTX_CAPITALIZATION_NONE: UDisplayContext = 256

public val UDISPCTX_DIALECT_NAMES: UDisplayContext = 1

public val UDISPCTX_LENGTH_FULL: UDisplayContext = 512

public val UDISPCTX_LENGTH_SHORT: UDisplayContext = 513

public val UDISPCTX_NO_SUBSTITUTE: UDisplayContext = 769

public val UDISPCTX_STANDARD_NAMES: UDisplayContext = 0

public val UDISPCTX_SUBSTITUTE: UDisplayContext = 768

public val UDISPCTX_TYPE_CAPITALIZATION: UDisplayContextType = 1

public val UDISPCTX_TYPE_DIALECT_HANDLING: UDisplayContextType = 0

public val UDISPCTX_TYPE_DISPLAY_LENGTH: UDisplayContextType = 2

public val UDISPCTX_TYPE_SUBSTITUTE_HANDLING: UDisplayContextType = 3

public val UDTS_DB2_TIME: UDateTimeScale = 8

public val UDTS_DOTNET_DATE_TIME: UDateTimeScale = 4

public val UDTS_EXCEL_TIME: UDateTimeScale = 7

public val UDTS_ICU4C_TIME: UDateTimeScale = 2

public val UDTS_JAVA_TIME: UDateTimeScale = 0

public val UDTS_MAC_OLD_TIME: UDateTimeScale = 5

public val UDTS_MAC_TIME: UDateTimeScale = 6

public val UDTS_UNIX_MICROSECONDS_TIME: UDateTimeScale = 9

public val UDTS_UNIX_TIME: UDateTimeScale = 1

public val UDTS_WINDOWS_FILE_TIME: UDateTimeScale = 3

public val UFIELD_CATEGORY_DATE: UFieldCategory = 1

public val UFIELD_CATEGORY_DATE_INTERVAL: UFieldCategory = 5

public val UFIELD_CATEGORY_DATE_INTERVAL_SPAN: UFieldCategory = 4101

public val UFIELD_CATEGORY_LIST: UFieldCategory = 3

public val UFIELD_CATEGORY_LIST_SPAN: UFieldCategory = 4099

public val UFIELD_CATEGORY_NUMBER: UFieldCategory = 2

public val UFIELD_CATEGORY_RELATIVE_DATETIME: UFieldCategory = 4

public val UFIELD_CATEGORY_UNDEFINED: UFieldCategory = 0

public val UFMT_ARRAY: UFormattableType = 4

public val UFMT_DATE: UFormattableType = 0

public val UFMT_DOUBLE: UFormattableType = 1

public val UFMT_INT64: UFormattableType = 5

public val UFMT_LONG: UFormattableType = 2

public val UFMT_OBJECT: UFormattableType = 6

public val UFMT_STRING: UFormattableType = 3

public val UGENDER_FEMALE: UGender = 1

public val UGENDER_MALE: UGender = 0

public val UGENDER_OTHER: UGender = 2

public val UIDNA_CHECK_BIDI: Int = 4

public val UIDNA_CHECK_CONTEXTJ: Int = 8

public val UIDNA_CHECK_CONTEXTO: Int = 64

public val UIDNA_DEFAULT: Int = 0

public val UIDNA_ERROR_BIDI: Int = 2048

public val UIDNA_ERROR_CONTEXTJ: Int = 4096

public val UIDNA_ERROR_CONTEXTO_DIGITS: Int = 16384

public val UIDNA_ERROR_CONTEXTO_PUNCTUATION: Int = 8192

public val UIDNA_ERROR_DISALLOWED: Int = 128

public val UIDNA_ERROR_DOMAIN_NAME_TOO_LONG: Int = 4

public val UIDNA_ERROR_EMPTY_LABEL: Int = 1

public val UIDNA_ERROR_HYPHEN_3_4: Int = 32

public val UIDNA_ERROR_INVALID_ACE_LABEL: Int = 1024

public val UIDNA_ERROR_LABEL_HAS_DOT: Int = 512

public val UIDNA_ERROR_LABEL_TOO_LONG: Int = 2

public val UIDNA_ERROR_LEADING_COMBINING_MARK: Int = 64

public val UIDNA_ERROR_LEADING_HYPHEN: Int = 8

public val UIDNA_ERROR_PUNYCODE: Int = 256

public val UIDNA_ERROR_TRAILING_HYPHEN: Int = 16

public val UIDNA_NONTRANSITIONAL_TO_ASCII: Int = 16

public val UIDNA_NONTRANSITIONAL_TO_UNICODE: Int = 32

public val UIDNA_USE_STD3_RULES: Int = 2

public val UITER_CURRENT: UCharIteratorOrigin = 1

public val UITER_LENGTH: UCharIteratorOrigin = 4

public val UITER_LIMIT: UCharIteratorOrigin = 2

public val UITER_START: UCharIteratorOrigin = 0

public val UITER_UNKNOWN_INDEX: Int = -2

public val UITER_ZERO: UCharIteratorOrigin = 3

public val ULDN_DIALECT_NAMES: UDialectHandling = 1

public val ULDN_STANDARD_NAMES: UDialectHandling = 0

public val ULISTFMT_ELEMENT_FIELD: UListFormatterField = 1

public val ULISTFMT_LITERAL_FIELD: UListFormatterField = 0

public val ULISTFMT_TYPE_AND: UListFormatterType = 0

public val ULISTFMT_TYPE_OR: UListFormatterType = 1

public val ULISTFMT_TYPE_UNITS: UListFormatterType = 2

public val ULISTFMT_WIDTH_NARROW: UListFormatterWidth = 2

public val ULISTFMT_WIDTH_SHORT: UListFormatterWidth = 1

public val ULISTFMT_WIDTH_WIDE: UListFormatterWidth = 0

public val ULOCDATA_ALT_QUOTATION_END: ULocaleDataDelimiterType = 3

public val ULOCDATA_ALT_QUOTATION_START: ULocaleDataDelimiterType = 2

public val ULOCDATA_ES_AUXILIARY: ULocaleDataExemplarSetType = 1

public val ULOCDATA_ES_INDEX: ULocaleDataExemplarSetType = 2

public val ULOCDATA_ES_PUNCTUATION: ULocaleDataExemplarSetType = 3

public val ULOCDATA_ES_STANDARD: ULocaleDataExemplarSetType = 0

public val ULOCDATA_QUOTATION_END: ULocaleDataDelimiterType = 1

public val ULOCDATA_QUOTATION_START: ULocaleDataDelimiterType = 0

public val ULOC_ACCEPT_FAILED: UAcceptResult = 0

public val ULOC_ACCEPT_FALLBACK: UAcceptResult = 2

public val ULOC_ACCEPT_VALID: UAcceptResult = 1

public val ULOC_ACTUAL_LOCALE: ULocDataLocaleType = 0

public val ULOC_AVAILABLE_DEFAULT: ULocAvailableType = 0

public val ULOC_AVAILABLE_ONLY_LEGACY_ALIASES: ULocAvailableType = 1

public val ULOC_AVAILABLE_WITH_LEGACY_ALIASES: ULocAvailableType = 2

public val ULOC_CANADA: Pcstr = s("en_CA")

public val ULOC_CANADA_FRENCH: Pcstr = s("fr_CA")

public val ULOC_CHINA: Pcstr = s("zh_CN")

public val ULOC_CHINESE: Pcstr = s("zh")

public val ULOC_COUNTRY_CAPACITY: UInt = 4u

public val ULOC_ENGLISH: Pcstr = s("en")

public val ULOC_FRANCE: Pcstr = s("fr_FR")

public val ULOC_FRENCH: Pcstr = s("fr")

public val ULOC_FULLNAME_CAPACITY: UInt = 157u

public val ULOC_GERMAN: Pcstr = s("de")

public val ULOC_GERMANY: Pcstr = s("de_DE")

public val ULOC_ITALIAN: Pcstr = s("it")

public val ULOC_ITALY: Pcstr = s("it_IT")

public val ULOC_JAPAN: Pcstr = s("ja_JP")

public val ULOC_JAPANESE: Pcstr = s("ja")

public val ULOC_KEYWORDS_CAPACITY: UInt = 96u

public val ULOC_KEYWORD_AND_VALUES_CAPACITY: UInt = 100u

public val ULOC_KEYWORD_ASSIGN_UNICODE: UInt = 61u

public val ULOC_KEYWORD_ITEM_SEPARATOR_UNICODE: UInt = 59u

public val ULOC_KEYWORD_SEPARATOR_UNICODE: UInt = 64u

public val ULOC_KOREA: Pcstr = s("ko_KR")

public val ULOC_KOREAN: Pcstr = s("ko")

public val ULOC_LANG_CAPACITY: UInt = 12u

public val ULOC_LAYOUT_BTT: ULayoutType = 3

public val ULOC_LAYOUT_LTR: ULayoutType = 0

public val ULOC_LAYOUT_RTL: ULayoutType = 1

public val ULOC_LAYOUT_TTB: ULayoutType = 2

public val ULOC_LAYOUT_UNKNOWN: ULayoutType = 4

public val ULOC_PRC: Pcstr = s("zh_CN")

public val ULOC_SCRIPT_CAPACITY: UInt = 6u

public val ULOC_SIMPLIFIED_CHINESE: Pcstr = s("zh_CN")

public val ULOC_TAIWAN: Pcstr = s("zh_TW")

public val ULOC_TRADITIONAL_CHINESE: Pcstr = s("zh_TW")

public val ULOC_UK: Pcstr = s("en_GB")

public val ULOC_US: Pcstr = s("en_US")

public val ULOC_VALID_LOCALE: ULocDataLocaleType = 1

public val UMEASFMT_WIDTH_COUNT: UMeasureFormatWidth = 4

public val UMEASFMT_WIDTH_NARROW: UMeasureFormatWidth = 2

public val UMEASFMT_WIDTH_NUMERIC: UMeasureFormatWidth = 3

public val UMEASFMT_WIDTH_SHORT: UMeasureFormatWidth = 1

public val UMEASFMT_WIDTH_WIDE: UMeasureFormatWidth = 0

public val UMSGPAT_APOS_DOUBLE_OPTIONAL: UMessagePatternApostropheMode = 0

public val UMSGPAT_APOS_DOUBLE_REQUIRED: UMessagePatternApostropheMode = 1

public val UMSGPAT_ARG_NAME_NOT_NUMBER: Int = -1

public val UMSGPAT_ARG_NAME_NOT_VALID: Int = -2

public val UMSGPAT_ARG_TYPE_CHOICE: UMessagePatternArgType = 2

public val UMSGPAT_ARG_TYPE_NONE: UMessagePatternArgType = 0

public val UMSGPAT_ARG_TYPE_PLURAL: UMessagePatternArgType = 3

public val UMSGPAT_ARG_TYPE_SELECT: UMessagePatternArgType = 4

public val UMSGPAT_ARG_TYPE_SELECTORDINAL: UMessagePatternArgType = 5

public val UMSGPAT_ARG_TYPE_SIMPLE: UMessagePatternArgType = 1

public val UMSGPAT_PART_TYPE_ARG_DOUBLE: UMessagePatternPartType = 13

public val UMSGPAT_PART_TYPE_ARG_INT: UMessagePatternPartType = 12

public val UMSGPAT_PART_TYPE_ARG_LIMIT: UMessagePatternPartType = 6

public val UMSGPAT_PART_TYPE_ARG_NAME: UMessagePatternPartType = 8

public val UMSGPAT_PART_TYPE_ARG_NUMBER: UMessagePatternPartType = 7

public val UMSGPAT_PART_TYPE_ARG_SELECTOR: UMessagePatternPartType = 11

public val UMSGPAT_PART_TYPE_ARG_START: UMessagePatternPartType = 5

public val UMSGPAT_PART_TYPE_ARG_STYLE: UMessagePatternPartType = 10

public val UMSGPAT_PART_TYPE_ARG_TYPE: UMessagePatternPartType = 9

public val UMSGPAT_PART_TYPE_INSERT_CHAR: UMessagePatternPartType = 3

public val UMSGPAT_PART_TYPE_MSG_LIMIT: UMessagePatternPartType = 1

public val UMSGPAT_PART_TYPE_MSG_START: UMessagePatternPartType = 0

public val UMSGPAT_PART_TYPE_REPLACE_NUMBER: UMessagePatternPartType = 4

public val UMSGPAT_PART_TYPE_SKIP_SYNTAX: UMessagePatternPartType = 2

public val UMS_SI: UMeasurementSystem = 0

public val UMS_UK: UMeasurementSystem = 2

public val UMS_US: UMeasurementSystem = 1

public val UNISCRIBE_OPENTYPE: UInt = 256u

public val UNORM2_COMPOSE: UNormalization2Mode = 0

public val UNORM2_COMPOSE_CONTIGUOUS: UNormalization2Mode = 3

public val UNORM2_DECOMPOSE: UNormalization2Mode = 1

public val UNORM2_FCD: UNormalization2Mode = 2

public val UNORM_DEFAULT: UNormalizationMode = 4

public val UNORM_FCD: UNormalizationMode = 6

public val UNORM_INPUT_IS_FCD: UInt = 131072u

public val UNORM_MAYBE: UNormalizationCheckResult = 2

public val UNORM_MODE_COUNT: UNormalizationMode = 7

public val UNORM_NFC: UNormalizationMode = 4

public val UNORM_NFD: UNormalizationMode = 2

public val UNORM_NFKC: UNormalizationMode = 5

public val UNORM_NFKD: UNormalizationMode = 3

public val UNORM_NO: UNormalizationCheckResult = 0

public val UNORM_NONE: UNormalizationMode = 1

public val UNORM_YES: UNormalizationCheckResult = 1

public val UNUM_CASH_CURRENCY: UNumberFormatStyle = 13

public val UNUM_COMPACT_FIELD: UNumberFormatFields = 12

public val UNUM_CURRENCY: UNumberFormatStyle = 2

public val UNUM_CURRENCY_ACCOUNTING: UNumberFormatStyle = 12

public val UNUM_CURRENCY_CODE: UNumberFormatTextAttribute = 5

public val UNUM_CURRENCY_FIELD: UNumberFormatFields = 7

public val UNUM_CURRENCY_INSERT: UCurrencySpacing = 2

public val UNUM_CURRENCY_ISO: UNumberFormatStyle = 10

public val UNUM_CURRENCY_MATCH: UCurrencySpacing = 0

public val UNUM_CURRENCY_PLURAL: UNumberFormatStyle = 11

public val UNUM_CURRENCY_SPACING_COUNT: UCurrencySpacing = 3

public val UNUM_CURRENCY_STANDARD: UNumberFormatStyle = 16

public val UNUM_CURRENCY_SURROUNDING_MATCH: UCurrencySpacing = 1

public val UNUM_CURRENCY_SYMBOL: UNumberFormatSymbol = 8

public val UNUM_CURRENCY_USAGE: UNumberFormatAttribute = 23

public val UNUM_DECIMAL: UNumberFormatStyle = 1

public val UNUM_DECIMAL_ALWAYS_SHOWN: UNumberFormatAttribute = 2

public val UNUM_DECIMAL_COMPACT_LONG: UNumberFormatStyle = 15

public val UNUM_DECIMAL_COMPACT_SHORT: UNumberFormatStyle = 14

public val UNUM_DECIMAL_SEPARATOR_ALWAYS: UNumberDecimalSeparatorDisplay = 1

public val UNUM_DECIMAL_SEPARATOR_AUTO: UNumberDecimalSeparatorDisplay = 0

public val UNUM_DECIMAL_SEPARATOR_COUNT: UNumberDecimalSeparatorDisplay = 2

public val UNUM_DECIMAL_SEPARATOR_FIELD: UNumberFormatFields = 2

public val UNUM_DECIMAL_SEPARATOR_SYMBOL: UNumberFormatSymbol = 0

public val UNUM_DEFAULT: UNumberFormatStyle = 1

public val UNUM_DEFAULT_RULESET: UNumberFormatTextAttribute = 6

public val UNUM_DIGIT_SYMBOL: UNumberFormatSymbol = 5

public val UNUM_DURATION: UNumberFormatStyle = 7

public val UNUM_EIGHT_DIGIT_SYMBOL: UNumberFormatSymbol = 25

public val UNUM_EXPONENTIAL_SYMBOL: UNumberFormatSymbol = 11

public val UNUM_EXPONENT_FIELD: UNumberFormatFields = 5

public val UNUM_EXPONENT_MULTIPLICATION_SYMBOL: UNumberFormatSymbol = 27

public val UNUM_EXPONENT_SIGN_FIELD: UNumberFormatFields = 4

public val UNUM_EXPONENT_SYMBOL_FIELD: UNumberFormatFields = 3

public val UNUM_FIVE_DIGIT_SYMBOL: UNumberFormatSymbol = 22

public val UNUM_FORMAT_ATTRIBUTE_VALUE_HIDDEN: UNumberFormatAttributeValue = 0

public val UNUM_FORMAT_FAIL_IF_MORE_THAN_MAX_DIGITS: UNumberFormatAttribute = 4096

public val UNUM_FORMAT_WIDTH: UNumberFormatAttribute = 13

public val UNUM_FOUR_DIGIT_SYMBOL: UNumberFormatSymbol = 21

public val UNUM_FRACTION_DIGITS: UNumberFormatAttribute = 8

public val UNUM_FRACTION_FIELD: UNumberFormatFields = 1

public val UNUM_GROUPING_AUTO: UNumberGroupingStrategy = 2

public val UNUM_GROUPING_MIN2: UNumberGroupingStrategy = 1

public val UNUM_GROUPING_OFF: UNumberGroupingStrategy = 0

public val UNUM_GROUPING_ON_ALIGNED: UNumberGroupingStrategy = 3

public val UNUM_GROUPING_SEPARATOR_FIELD: UNumberFormatFields = 6

public val UNUM_GROUPING_SEPARATOR_SYMBOL: UNumberFormatSymbol = 1

public val UNUM_GROUPING_SIZE: UNumberFormatAttribute = 10

public val UNUM_GROUPING_THOUSANDS: UNumberGroupingStrategy = 4

public val UNUM_GROUPING_USED: UNumberFormatAttribute = 1

public val UNUM_IDENTITY_FALLBACK_APPROXIMATELY: UNumberRangeIdentityFallback = 2

public val UNUM_IDENTITY_FALLBACK_APPROXIMATELY_OR_SINGLE_VALUE: UNumberRangeIdentityFallback = 1

public val UNUM_IDENTITY_FALLBACK_RANGE: UNumberRangeIdentityFallback = 3

public val UNUM_IDENTITY_FALLBACK_SINGLE_VALUE: UNumberRangeIdentityFallback = 0

public val UNUM_IDENTITY_RESULT_EQUAL_AFTER_ROUNDING: UNumberRangeIdentityResult = 1

public val UNUM_IDENTITY_RESULT_EQUAL_BEFORE_ROUNDING: UNumberRangeIdentityResult = 0

public val UNUM_IDENTITY_RESULT_NOT_EQUAL: UNumberRangeIdentityResult = 2

public val UNUM_IGNORE: UNumberFormatStyle = 0

public val UNUM_INFINITY_SYMBOL: UNumberFormatSymbol = 14

public val UNUM_INTEGER_DIGITS: UNumberFormatAttribute = 5

public val UNUM_INTEGER_FIELD: UNumberFormatFields = 0

public val UNUM_INTL_CURRENCY_SYMBOL: UNumberFormatSymbol = 9

public val UNUM_LENIENT_PARSE: UNumberFormatAttribute = 19

public val UNUM_LONG: UNumberCompactStyle = 1

public val UNUM_MAX_FRACTION_DIGITS: UNumberFormatAttribute = 6

public val UNUM_MAX_INTEGER_DIGITS: UNumberFormatAttribute = 3

public val UNUM_MAX_SIGNIFICANT_DIGITS: UNumberFormatAttribute = 18

public val UNUM_MEASURE_UNIT_FIELD: UNumberFormatFields = 11

public val UNUM_MINIMUM_GROUPING_DIGITS: UNumberFormatAttribute = 22

public val UNUM_MINUS_SIGN_SYMBOL: UNumberFormatSymbol = 6

public val UNUM_MIN_FRACTION_DIGITS: UNumberFormatAttribute = 7

public val UNUM_MIN_INTEGER_DIGITS: UNumberFormatAttribute = 4

public val UNUM_MIN_SIGNIFICANT_DIGITS: UNumberFormatAttribute = 17

public val UNUM_MONETARY_GROUPING_SEPARATOR_SYMBOL: UNumberFormatSymbol = 17

public val UNUM_MONETARY_SEPARATOR_SYMBOL: UNumberFormatSymbol = 10

public val UNUM_MULTIPLIER: UNumberFormatAttribute = 9

public val UNUM_NAN_SYMBOL: UNumberFormatSymbol = 15

public val UNUM_NEGATIVE_PREFIX: UNumberFormatTextAttribute = 2

public val UNUM_NEGATIVE_SUFFIX: UNumberFormatTextAttribute = 3

public val UNUM_NINE_DIGIT_SYMBOL: UNumberFormatSymbol = 26

public val UNUM_NUMBERING_SYSTEM: UNumberFormatStyle = 8

public val UNUM_ONE_DIGIT_SYMBOL: UNumberFormatSymbol = 18

public val UNUM_ORDINAL: UNumberFormatStyle = 6

public val UNUM_PADDING_CHARACTER: UNumberFormatTextAttribute = 4

public val UNUM_PADDING_POSITION: UNumberFormatAttribute = 14

public val UNUM_PAD_AFTER_PREFIX: UNumberFormatPadPosition = 1

public val UNUM_PAD_AFTER_SUFFIX: UNumberFormatPadPosition = 3

public val UNUM_PAD_BEFORE_PREFIX: UNumberFormatPadPosition = 0

public val UNUM_PAD_BEFORE_SUFFIX: UNumberFormatPadPosition = 2

public val UNUM_PAD_ESCAPE_SYMBOL: UNumberFormatSymbol = 13

public val UNUM_PARSE_ALL_INPUT: UNumberFormatAttribute = 20

public val UNUM_PARSE_CASE_SENSITIVE: UNumberFormatAttribute = 4099

public val UNUM_PARSE_DECIMAL_MARK_REQUIRED: UNumberFormatAttribute = 4098

public val UNUM_PARSE_INT_ONLY: UNumberFormatAttribute = 0

public val UNUM_PARSE_NO_EXPONENT: UNumberFormatAttribute = 4097

public val UNUM_PATTERN_DECIMAL: UNumberFormatStyle = 0

public val UNUM_PATTERN_RULEBASED: UNumberFormatStyle = 9

public val UNUM_PATTERN_SEPARATOR_SYMBOL: UNumberFormatSymbol = 2

public val UNUM_PERCENT: UNumberFormatStyle = 3

public val UNUM_PERCENT_FIELD: UNumberFormatFields = 8

public val UNUM_PERCENT_SYMBOL: UNumberFormatSymbol = 3

public val UNUM_PERMILL_FIELD: UNumberFormatFields = 9

public val UNUM_PERMILL_SYMBOL: UNumberFormatSymbol = 12

public val UNUM_PLUS_SIGN_SYMBOL: UNumberFormatSymbol = 7

public val UNUM_POSITIVE_PREFIX: UNumberFormatTextAttribute = 0

public val UNUM_POSITIVE_SUFFIX: UNumberFormatTextAttribute = 1

public val UNUM_PUBLIC_RULESETS: UNumberFormatTextAttribute = 7

public val UNUM_RANGE_COLLAPSE_ALL: UNumberRangeCollapse = 3

public val UNUM_RANGE_COLLAPSE_AUTO: UNumberRangeCollapse = 0

public val UNUM_RANGE_COLLAPSE_NONE: UNumberRangeCollapse = 1

public val UNUM_RANGE_COLLAPSE_UNIT: UNumberRangeCollapse = 2

public val UNUM_ROUNDING_INCREMENT: UNumberFormatAttribute = 12

public val UNUM_ROUNDING_MODE: UNumberFormatAttribute = 11

public val UNUM_ROUND_CEILING: UNumberFormatRoundingMode = 0

public val UNUM_ROUND_DOWN: UNumberFormatRoundingMode = 2

public val UNUM_ROUND_FLOOR: UNumberFormatRoundingMode = 1

public val UNUM_ROUND_HALFDOWN: UNumberFormatRoundingMode = 5

public val UNUM_ROUND_HALFEVEN: UNumberFormatRoundingMode = 4

public val UNUM_ROUND_HALFUP: UNumberFormatRoundingMode = 6

public val UNUM_ROUND_UNNECESSARY: UNumberFormatRoundingMode = 7

public val UNUM_ROUND_UP: UNumberFormatRoundingMode = 3

public val UNUM_SCALE: UNumberFormatAttribute = 21

public val UNUM_SCIENTIFIC: UNumberFormatStyle = 4

public val UNUM_SECONDARY_GROUPING_SIZE: UNumberFormatAttribute = 15

public val UNUM_SEVEN_DIGIT_SYMBOL: UNumberFormatSymbol = 24

public val UNUM_SHORT: UNumberCompactStyle = 0

public val UNUM_SIGNIFICANT_DIGITS_USED: UNumberFormatAttribute = 16

public val UNUM_SIGNIFICANT_DIGIT_SYMBOL: UNumberFormatSymbol = 16

public val UNUM_SIGN_ACCOUNTING: UNumberSignDisplay = 3

public val UNUM_SIGN_ACCOUNTING_ALWAYS: UNumberSignDisplay = 4

public val UNUM_SIGN_ACCOUNTING_EXCEPT_ZERO: UNumberSignDisplay = 6

public val UNUM_SIGN_ALWAYS: UNumberSignDisplay = 1

public val UNUM_SIGN_ALWAYS_SHOWN: UNumberFormatAttribute = 4100

public val UNUM_SIGN_AUTO: UNumberSignDisplay = 0

public val UNUM_SIGN_COUNT: UNumberSignDisplay = 7

public val UNUM_SIGN_EXCEPT_ZERO: UNumberSignDisplay = 5

public val UNUM_SIGN_FIELD: UNumberFormatFields = 10

public val UNUM_SIGN_NEVER: UNumberSignDisplay = 2

public val UNUM_SIX_DIGIT_SYMBOL: UNumberFormatSymbol = 23

public val UNUM_SPELLOUT: UNumberFormatStyle = 5

public val UNUM_THREE_DIGIT_SYMBOL: UNumberFormatSymbol = 20

public val UNUM_TWO_DIGIT_SYMBOL: UNumberFormatSymbol = 19

public val UNUM_UNIT_WIDTH_COUNT: UNumberUnitWidth = 5

public val UNUM_UNIT_WIDTH_FULL_NAME: UNumberUnitWidth = 2

public val UNUM_UNIT_WIDTH_HIDDEN: UNumberUnitWidth = 4

public val UNUM_UNIT_WIDTH_ISO_CODE: UNumberUnitWidth = 3

public val UNUM_UNIT_WIDTH_NARROW: UNumberUnitWidth = 0

public val UNUM_UNIT_WIDTH_SHORT: UNumberUnitWidth = 1

public val UNUM_ZERO_DIGIT_SYMBOL: UNumberFormatSymbol = 4

public val UPLURAL_TYPE_CARDINAL: UPluralType = 0

public val UPLURAL_TYPE_ORDINAL: UPluralType = 1

public val UREGEX_CASE_INSENSITIVE: URegexpFlag = 2

public val UREGEX_COMMENTS: URegexpFlag = 4

public val UREGEX_DOTALL: URegexpFlag = 32

public val UREGEX_ERROR_ON_UNKNOWN_ESCAPES: URegexpFlag = 512

public val UREGEX_LITERAL: URegexpFlag = 16

public val UREGEX_MULTILINE: URegexpFlag = 8

public val UREGEX_UNIX_LINES: URegexpFlag = 1

public val UREGEX_UWORD: URegexpFlag = 256

public val URES_ALIAS: UResType = 3

public val URES_ARRAY: UResType = 8

public val URES_BINARY: UResType = 1

public val URES_INT: UResType = 7

public val URES_INT_VECTOR: UResType = 14

public val URES_NONE: UResType = -1

public val URES_STRING: UResType = 0

public val URES_TABLE: UResType = 2

public val URGN_CONTINENT: URegionType = 3

public val URGN_DEPRECATED: URegionType = 6

public val URGN_GROUPING: URegionType = 5

public val URGN_SUBCONTINENT: URegionType = 4

public val URGN_TERRITORY: URegionType = 1

public val URGN_UNKNOWN: URegionType = 0

public val URGN_WORLD: URegionType = 2

public val USCRIPT_ADLAM: UScriptCode = 167

public val USCRIPT_AFAKA: UScriptCode = 147

public val USCRIPT_AHOM: UScriptCode = 161

public val USCRIPT_ANATOLIAN_HIEROGLYPHS: UScriptCode = 156

public val USCRIPT_ARABIC: UScriptCode = 2

public val USCRIPT_ARMENIAN: UScriptCode = 3

public val USCRIPT_AVESTAN: UScriptCode = 117

public val USCRIPT_BALINESE: UScriptCode = 62

public val USCRIPT_BAMUM: UScriptCode = 130

public val USCRIPT_BASSA_VAH: UScriptCode = 134

public val USCRIPT_BATAK: UScriptCode = 63

public val USCRIPT_BENGALI: UScriptCode = 4

public val USCRIPT_BHAIKSUKI: UScriptCode = 168

public val USCRIPT_BLISSYMBOLS: UScriptCode = 64

public val USCRIPT_BOOK_PAHLAVI: UScriptCode = 124

public val USCRIPT_BOPOMOFO: UScriptCode = 5

public val USCRIPT_BRAHMI: UScriptCode = 65

public val USCRIPT_BRAILLE: UScriptCode = 46

public val USCRIPT_BUGINESE: UScriptCode = 55

public val USCRIPT_BUHID: UScriptCode = 44

public val USCRIPT_CANADIAN_ABORIGINAL: UScriptCode = 40

public val USCRIPT_CARIAN: UScriptCode = 104

public val USCRIPT_CAUCASIAN_ALBANIAN: UScriptCode = 159

public val USCRIPT_CHAKMA: UScriptCode = 118

public val USCRIPT_CHAM: UScriptCode = 66

public val USCRIPT_CHEROKEE: UScriptCode = 6

public val USCRIPT_CHORASMIAN: UScriptCode = 189

public val USCRIPT_CIRTH: UScriptCode = 67

public val USCRIPT_COMMON: UScriptCode = 0

public val USCRIPT_COPTIC: UScriptCode = 7

public val USCRIPT_CUNEIFORM: UScriptCode = 101

public val USCRIPT_CYPRIOT: UScriptCode = 47

public val USCRIPT_CYRILLIC: UScriptCode = 8

public val USCRIPT_DEMOTIC_EGYPTIAN: UScriptCode = 69

public val USCRIPT_DESERET: UScriptCode = 9

public val USCRIPT_DEVANAGARI: UScriptCode = 10

public val USCRIPT_DIVES_AKURU: UScriptCode = 190

public val USCRIPT_DOGRA: UScriptCode = 178

public val USCRIPT_DUPLOYAN: UScriptCode = 135

public val USCRIPT_EASTERN_SYRIAC: UScriptCode = 97

public val USCRIPT_EGYPTIAN_HIEROGLYPHS: UScriptCode = 71

public val USCRIPT_ELBASAN: UScriptCode = 136

public val USCRIPT_ELYMAIC: UScriptCode = 185

public val USCRIPT_ESTRANGELO_SYRIAC: UScriptCode = 95

public val USCRIPT_ETHIOPIC: UScriptCode = 11

public val USCRIPT_GEORGIAN: UScriptCode = 12

public val USCRIPT_GLAGOLITIC: UScriptCode = 56

public val USCRIPT_GOTHIC: UScriptCode = 13

public val USCRIPT_GRANTHA: UScriptCode = 137

public val USCRIPT_GREEK: UScriptCode = 14

public val USCRIPT_GUJARATI: UScriptCode = 15

public val USCRIPT_GUNJALA_GONDI: UScriptCode = 179

public val USCRIPT_GURMUKHI: UScriptCode = 16

public val USCRIPT_HAN: UScriptCode = 17

public val USCRIPT_HANGUL: UScriptCode = 18

public val USCRIPT_HANIFI_ROHINGYA: UScriptCode = 182

public val USCRIPT_HANUNOO: UScriptCode = 43

public val USCRIPT_HAN_WITH_BOPOMOFO: UScriptCode = 172

public val USCRIPT_HARAPPAN_INDUS: UScriptCode = 77

public val USCRIPT_HATRAN: UScriptCode = 162

public val USCRIPT_HEBREW: UScriptCode = 19

public val USCRIPT_HIERATIC_EGYPTIAN: UScriptCode = 70

public val USCRIPT_HIRAGANA: UScriptCode = 20

public val USCRIPT_IMPERIAL_ARAMAIC: UScriptCode = 116

public val USCRIPT_INHERITED: UScriptCode = 1

public val USCRIPT_INSCRIPTIONAL_PAHLAVI: UScriptCode = 122

public val USCRIPT_INSCRIPTIONAL_PARTHIAN: UScriptCode = 125

public val USCRIPT_INVALID_CODE: UScriptCode = -1

public val USCRIPT_JAMO: UScriptCode = 173

public val USCRIPT_JAPANESE: UScriptCode = 105

public val USCRIPT_JAVANESE: UScriptCode = 78

public val USCRIPT_JURCHEN: UScriptCode = 148

public val USCRIPT_KAITHI: UScriptCode = 120

public val USCRIPT_KANNADA: UScriptCode = 21

public val USCRIPT_KATAKANA: UScriptCode = 22

public val USCRIPT_KATAKANA_OR_HIRAGANA: UScriptCode = 54

public val USCRIPT_KAYAH_LI: UScriptCode = 79

public val USCRIPT_KHAROSHTHI: UScriptCode = 57

public val USCRIPT_KHITAN_SMALL_SCRIPT: UScriptCode = 191

public val USCRIPT_KHMER: UScriptCode = 23

public val USCRIPT_KHOJKI: UScriptCode = 157

public val USCRIPT_KHUDAWADI: UScriptCode = 145

public val USCRIPT_KHUTSURI: UScriptCode = 72

public val USCRIPT_KOREAN: UScriptCode = 119

public val USCRIPT_KPELLE: UScriptCode = 138

public val USCRIPT_LANNA: UScriptCode = 106

public val USCRIPT_LAO: UScriptCode = 24

public val USCRIPT_LATIN: UScriptCode = 25

public val USCRIPT_LATIN_FRAKTUR: UScriptCode = 80

public val USCRIPT_LATIN_GAELIC: UScriptCode = 81

public val USCRIPT_LEPCHA: UScriptCode = 82

public val USCRIPT_LIMBU: UScriptCode = 48

public val USCRIPT_LINEAR_A: UScriptCode = 83

public val USCRIPT_LINEAR_B: UScriptCode = 49

public val USCRIPT_LISU: UScriptCode = 131

public val USCRIPT_LOMA: UScriptCode = 139

public val USCRIPT_LYCIAN: UScriptCode = 107

public val USCRIPT_LYDIAN: UScriptCode = 108

public val USCRIPT_MAHAJANI: UScriptCode = 160

public val USCRIPT_MAKASAR: UScriptCode = 180

public val USCRIPT_MALAYALAM: UScriptCode = 26

public val USCRIPT_MANDAEAN: UScriptCode = 84

public val USCRIPT_MANDAIC: UScriptCode = 84

public val USCRIPT_MANICHAEAN: UScriptCode = 121

public val USCRIPT_MARCHEN: UScriptCode = 169

public val USCRIPT_MASARAM_GONDI: UScriptCode = 175

public val USCRIPT_MATHEMATICAL_NOTATION: UScriptCode = 128

public val USCRIPT_MAYAN_HIEROGLYPHS: UScriptCode = 85

public val USCRIPT_MEDEFAIDRIN: UScriptCode = 181

public val USCRIPT_MEITEI_MAYEK: UScriptCode = 115

public val USCRIPT_MENDE: UScriptCode = 140

public val USCRIPT_MEROITIC: UScriptCode = 86

public val USCRIPT_MEROITIC_CURSIVE: UScriptCode = 141

public val USCRIPT_MEROITIC_HIEROGLYPHS: UScriptCode = 86

public val USCRIPT_MIAO: UScriptCode = 92

public val USCRIPT_MODI: UScriptCode = 163

public val USCRIPT_MONGOLIAN: UScriptCode = 27

public val USCRIPT_MOON: UScriptCode = 114

public val USCRIPT_MRO: UScriptCode = 149

public val USCRIPT_MULTANI: UScriptCode = 164

public val USCRIPT_MYANMAR: UScriptCode = 28

public val USCRIPT_NABATAEAN: UScriptCode = 143

public val USCRIPT_NAKHI_GEBA: UScriptCode = 132

public val USCRIPT_NANDINAGARI: UScriptCode = 187

public val USCRIPT_NEWA: UScriptCode = 170

public val USCRIPT_NEW_TAI_LUE: UScriptCode = 59

public val USCRIPT_NKO: UScriptCode = 87

public val USCRIPT_NUSHU: UScriptCode = 150

public val USCRIPT_NYIAKENG_PUACHUE_HMONG: UScriptCode = 186

public val USCRIPT_OGHAM: UScriptCode = 29

public val USCRIPT_OLD_CHURCH_SLAVONIC_CYRILLIC: UScriptCode = 68

public val USCRIPT_OLD_HUNGARIAN: UScriptCode = 76

public val USCRIPT_OLD_ITALIC: UScriptCode = 30

public val USCRIPT_OLD_NORTH_ARABIAN: UScriptCode = 142

public val USCRIPT_OLD_PERMIC: UScriptCode = 89

public val USCRIPT_OLD_PERSIAN: UScriptCode = 61

public val USCRIPT_OLD_SOGDIAN: UScriptCode = 184

public val USCRIPT_OLD_SOUTH_ARABIAN: UScriptCode = 133

public val USCRIPT_OL_CHIKI: UScriptCode = 109

public val USCRIPT_ORIYA: UScriptCode = 31

public val USCRIPT_ORKHON: UScriptCode = 88

public val USCRIPT_OSAGE: UScriptCode = 171

public val USCRIPT_OSMANYA: UScriptCode = 50

public val USCRIPT_PAHAWH_HMONG: UScriptCode = 75

public val USCRIPT_PALMYRENE: UScriptCode = 144

public val USCRIPT_PAU_CIN_HAU: UScriptCode = 165

public val USCRIPT_PHAGS_PA: UScriptCode = 90

public val USCRIPT_PHOENICIAN: UScriptCode = 91

public val USCRIPT_PHONETIC_POLLARD: UScriptCode = 92

public val USCRIPT_PSALTER_PAHLAVI: UScriptCode = 123

public val USCRIPT_REJANG: UScriptCode = 110

public val USCRIPT_RONGORONGO: UScriptCode = 93

public val USCRIPT_RUNIC: UScriptCode = 32

public val USCRIPT_SAMARITAN: UScriptCode = 126

public val USCRIPT_SARATI: UScriptCode = 94

public val USCRIPT_SAURASHTRA: UScriptCode = 111

public val USCRIPT_SHARADA: UScriptCode = 151

public val USCRIPT_SHAVIAN: UScriptCode = 51

public val USCRIPT_SIDDHAM: UScriptCode = 166

public val USCRIPT_SIGN_WRITING: UScriptCode = 112

public val USCRIPT_SIMPLIFIED_HAN: UScriptCode = 73

public val USCRIPT_SINDHI: UScriptCode = 145

public val USCRIPT_SINHALA: UScriptCode = 33

public val USCRIPT_SOGDIAN: UScriptCode = 183

public val USCRIPT_SORA_SOMPENG: UScriptCode = 152

public val USCRIPT_SOYOMBO: UScriptCode = 176

public val USCRIPT_SUNDANESE: UScriptCode = 113

public val USCRIPT_SYLOTI_NAGRI: UScriptCode = 58

public val USCRIPT_SYMBOLS: UScriptCode = 129

public val USCRIPT_SYMBOLS_EMOJI: UScriptCode = 174

public val USCRIPT_SYRIAC: UScriptCode = 34

public val USCRIPT_TAGALOG: UScriptCode = 42

public val USCRIPT_TAGBANWA: UScriptCode = 45

public val USCRIPT_TAI_LE: UScriptCode = 52

public val USCRIPT_TAI_VIET: UScriptCode = 127

public val USCRIPT_TAKRI: UScriptCode = 153

public val USCRIPT_TAMIL: UScriptCode = 35

public val USCRIPT_TANGUT: UScriptCode = 154

public val USCRIPT_TELUGU: UScriptCode = 36

public val USCRIPT_TENGWAR: UScriptCode = 98

public val USCRIPT_THAANA: UScriptCode = 37

public val USCRIPT_THAI: UScriptCode = 38

public val USCRIPT_TIBETAN: UScriptCode = 39

public val USCRIPT_TIFINAGH: UScriptCode = 60

public val USCRIPT_TIRHUTA: UScriptCode = 158

public val USCRIPT_TRADITIONAL_HAN: UScriptCode = 74

public val USCRIPT_UCAS: UScriptCode = 40

public val USCRIPT_UGARITIC: UScriptCode = 53

public val USCRIPT_UNKNOWN: UScriptCode = 103

public val USCRIPT_UNWRITTEN_LANGUAGES: UScriptCode = 102

public val USCRIPT_USAGE_ASPIRATIONAL: UScriptUsage = 4

public val USCRIPT_USAGE_EXCLUDED: UScriptUsage = 2

public val USCRIPT_USAGE_LIMITED_USE: UScriptUsage = 3

public val USCRIPT_USAGE_NOT_ENCODED: UScriptUsage = 0

public val USCRIPT_USAGE_RECOMMENDED: UScriptUsage = 5

public val USCRIPT_USAGE_UNKNOWN: UScriptUsage = 1

public val USCRIPT_VAI: UScriptCode = 99

public val USCRIPT_VISIBLE_SPEECH: UScriptCode = 100

public val USCRIPT_WANCHO: UScriptCode = 188

public val USCRIPT_WARANG_CITI: UScriptCode = 146

public val USCRIPT_WESTERN_SYRIAC: UScriptCode = 96

public val USCRIPT_WOLEAI: UScriptCode = 155

public val USCRIPT_YEZIDI: UScriptCode = 192

public val USCRIPT_YI: UScriptCode = 41

public val USCRIPT_ZANABAZAR_SQUARE: UScriptCode = 177

public val USEARCH_ANY_BASE_WEIGHT_IS_WILDCARD: USearchAttributeValue = 4

public val USEARCH_DEFAULT: USearchAttributeValue = -1

public val USEARCH_DONE: Int = -1

public val USEARCH_ELEMENT_COMPARISON: USearchAttribute = 2

public val USEARCH_OFF: USearchAttributeValue = 0

public val USEARCH_ON: USearchAttributeValue = 1

public val USEARCH_OVERLAP: USearchAttribute = 0

public val USEARCH_PATTERN_BASE_WEIGHT_IS_WILDCARD: USearchAttributeValue = 3

public val USEARCH_STANDARD_ELEMENT_COMPARISON: USearchAttributeValue = 2

public val USET_ADD_CASE_MAPPINGS: Int = 4

public val USET_CASE_INSENSITIVE: Int = 2

public val USET_IGNORE_SPACE: Int = 1

public val USET_SERIALIZED_STATIC_ARRAY_CAPACITY: Int = 8

public val USET_SPAN_CONTAINED: USetSpanCondition = 1

public val USET_SPAN_NOT_CONTAINED: USetSpanCondition = 0

public val USET_SPAN_SIMPLE: USetSpanCondition = 2

public val USPOOF_ALL_CHECKS: USpoofChecks = 65535

public val USPOOF_ASCII: URestrictionLevel = 268435456

public val USPOOF_AUX_INFO: USpoofChecks = 1073741824

public val USPOOF_CHAR_LIMIT: USpoofChecks = 64

public val USPOOF_CONFUSABLE: USpoofChecks = 7

public val USPOOF_HIDDEN_OVERLAY: USpoofChecks = 256

public val USPOOF_HIGHLY_RESTRICTIVE: URestrictionLevel = 805306368

public val USPOOF_INVISIBLE: USpoofChecks = 32

public val USPOOF_MINIMALLY_RESTRICTIVE: URestrictionLevel = 1342177280

public val USPOOF_MIXED_NUMBERS: USpoofChecks = 128

public val USPOOF_MIXED_SCRIPT_CONFUSABLE: USpoofChecks = 2

public val USPOOF_MODERATELY_RESTRICTIVE: URestrictionLevel = 1073741824

public val USPOOF_RESTRICTION_LEVEL: USpoofChecks = 16

public val USPOOF_RESTRICTION_LEVEL_MASK: URestrictionLevel = 2130706432

public val USPOOF_SINGLE_SCRIPT_CONFUSABLE: USpoofChecks = 1

public val USPOOF_SINGLE_SCRIPT_RESTRICTIVE: URestrictionLevel = 536870912

public val USPOOF_UNRESTRICTIVE: URestrictionLevel = 1610612736

public val USPOOF_WHOLE_SCRIPT_CONFUSABLE: USpoofChecks = 4

public val USPREP_ALLOW_UNASSIGNED: UInt = 1u

public val USPREP_DEFAULT: UInt = 0u

public val USPREP_RFC3491_NAMEPREP: UStringPrepProfileType = 0

public val USPREP_RFC3530_NFS4_CIS_PREP: UStringPrepProfileType = 3

public val USPREP_RFC3530_NFS4_CS_PREP: UStringPrepProfileType = 1

public val USPREP_RFC3530_NFS4_CS_PREP_CI: UStringPrepProfileType = 2

public val USPREP_RFC3530_NFS4_MIXED_PREP_PREFIX: UStringPrepProfileType = 4

public val USPREP_RFC3530_NFS4_MIXED_PREP_SUFFIX: UStringPrepProfileType = 5

public val USPREP_RFC3722_ISCSI: UStringPrepProfileType = 6

public val USPREP_RFC3920_NODEPREP: UStringPrepProfileType = 7

public val USPREP_RFC3920_RESOURCEPREP: UStringPrepProfileType = 8

public val USPREP_RFC4011_MIB: UStringPrepProfileType = 9

public val USPREP_RFC4013_SASLPREP: UStringPrepProfileType = 10

public val USPREP_RFC4505_TRACE: UStringPrepProfileType = 11

public val USPREP_RFC4518_LDAP: UStringPrepProfileType = 12

public val USPREP_RFC4518_LDAP_CI: UStringPrepProfileType = 13

public val USP_E_SCRIPT_NOT_IN_FONT: Hresult = 0x80040200u.toInt()

public val USTRINGTRIE_BUILD_FAST: UStringTrieBuildOption = 0

public val USTRINGTRIE_BUILD_SMALL: UStringTrieBuildOption = 1

public val USTRINGTRIE_FINAL_VALUE: UStringTrieResult = 2

public val USTRINGTRIE_INTERMEDIATE_VALUE: UStringTrieResult = 3

public val USTRINGTRIE_NO_MATCH: UStringTrieResult = 0

public val USTRINGTRIE_NO_VALUE: UStringTrieResult = 1

public val UTEXT_MAGIC: Int = 878368812

public val UTEXT_PROVIDER_HAS_META_DATA: Int = 4

public val UTEXT_PROVIDER_LENGTH_IS_EXPENSIVE: Int = 1

public val UTEXT_PROVIDER_OWNS_TEXT: Int = 5

public val UTEXT_PROVIDER_STABLE_CHUNKS: Int = 2

public val UTEXT_PROVIDER_WRITABLE: Int = 3

public val UTF16_MAX_CHAR_LENGTH: UInt = 2u

public val UTF32_MAX_CHAR_LENGTH: UInt = 1u

public val UTF8_ERROR_VALUE_1: UInt = 21u

public val UTF8_ERROR_VALUE_2: UInt = 159u

public val UTF8_MAX_CHAR_LENGTH: UInt = 4u

public val UTF_ERROR_VALUE: UInt = 65535u

public val UTF_MAX_CHAR_LENGTH: UInt = 2u

public val UTF_SIZE: UInt = 16u

public val UTRACE_COLLATION_START: UTraceFunctionNumber = 8192

public val UTRACE_CONVERSION_START: UTraceFunctionNumber = 4096

public val UTRACE_ERROR: UTraceLevel = 0

public val UTRACE_FUNCTION_START: UTraceFunctionNumber = 0

public val UTRACE_INFO: UTraceLevel = 7

public val UTRACE_OFF: UTraceLevel = -1

public val UTRACE_OPEN_CLOSE: UTraceLevel = 5

public val UTRACE_UCNV_CLONE: UTraceFunctionNumber = 4099

public val UTRACE_UCNV_CLOSE: UTraceFunctionNumber = 4100

public val UTRACE_UCNV_FLUSH_CACHE: UTraceFunctionNumber = 4101

public val UTRACE_UCNV_LOAD: UTraceFunctionNumber = 4102

public val UTRACE_UCNV_OPEN: UTraceFunctionNumber = 4096

public val UTRACE_UCNV_OPEN_ALGORITHMIC: UTraceFunctionNumber = 4098

public val UTRACE_UCNV_OPEN_PACKAGE: UTraceFunctionNumber = 4097

public val UTRACE_UCNV_UNLOAD: UTraceFunctionNumber = 4103

public val UTRACE_UCOL_CLOSE: UTraceFunctionNumber = 8193

public val UTRACE_UCOL_GETLOCALE: UTraceFunctionNumber = 8196

public val UTRACE_UCOL_GET_SORTKEY: UTraceFunctionNumber = 8195

public val UTRACE_UCOL_NEXTSORTKEYPART: UTraceFunctionNumber = 8197

public val UTRACE_UCOL_OPEN: UTraceFunctionNumber = 8192

public val UTRACE_UCOL_OPEN_FROM_SHORT_STRING: UTraceFunctionNumber = 8199

public val UTRACE_UCOL_STRCOLL: UTraceFunctionNumber = 8194

public val UTRACE_UCOL_STRCOLLITER: UTraceFunctionNumber = 8198

public val UTRACE_UCOL_STRCOLLUTF8: UTraceFunctionNumber = 8200

public val UTRACE_UDATA_BUNDLE: UTraceFunctionNumber = 12289

public val UTRACE_UDATA_DATA_FILE: UTraceFunctionNumber = 12290

public val UTRACE_UDATA_RESOURCE: UTraceFunctionNumber = 12288

public val UTRACE_UDATA_RES_FILE: UTraceFunctionNumber = 12291

public val UTRACE_UDATA_START: UTraceFunctionNumber = 12288

public val UTRACE_U_CLEANUP: UTraceFunctionNumber = 1

public val UTRACE_U_INIT: UTraceFunctionNumber = 0

public val UTRACE_VERBOSE: UTraceLevel = 9

public val UTRACE_WARNING: UTraceLevel = 3

public val UTRANS_FORWARD: UTransDirection = 0

public val UTRANS_REVERSE: UTransDirection = 1

public val UTSV_EPOCH_OFFSET_VALUE: UTimeScaleValue = 1

public val UTSV_FROM_MAX_VALUE: UTimeScaleValue = 3

public val UTSV_FROM_MIN_VALUE: UTimeScaleValue = 2

public val UTSV_TO_MAX_VALUE: UTimeScaleValue = 5

public val UTSV_TO_MIN_VALUE: UTimeScaleValue = 4

public val UTSV_UNITS_VALUE: UTimeScaleValue = 0

public val UTZFMT_PARSE_OPTION_ALL_STYLES: UTimeZoneFormatParseOption = 1

public val UTZFMT_PARSE_OPTION_NONE: UTimeZoneFormatParseOption = 0

public val UTZFMT_PARSE_OPTION_TZ_DATABASE_ABBREVIATIONS: UTimeZoneFormatParseOption = 2

public val UTZFMT_PAT_COUNT: UTimeZoneFormatGMTOffsetPatternType = 6

public val UTZFMT_PAT_NEGATIVE_H: UTimeZoneFormatGMTOffsetPatternType = 5

public val UTZFMT_PAT_NEGATIVE_HM: UTimeZoneFormatGMTOffsetPatternType = 2

public val UTZFMT_PAT_NEGATIVE_HMS: UTimeZoneFormatGMTOffsetPatternType = 3

public val UTZFMT_PAT_POSITIVE_H: UTimeZoneFormatGMTOffsetPatternType = 4

public val UTZFMT_PAT_POSITIVE_HM: UTimeZoneFormatGMTOffsetPatternType = 0

public val UTZFMT_PAT_POSITIVE_HMS: UTimeZoneFormatGMTOffsetPatternType = 1

public val UTZFMT_STYLE_EXEMPLAR_LOCATION: UTimeZoneFormatStyle = 19

public val UTZFMT_STYLE_GENERIC_LOCATION: UTimeZoneFormatStyle = 0

public val UTZFMT_STYLE_GENERIC_LONG: UTimeZoneFormatStyle = 1

public val UTZFMT_STYLE_GENERIC_SHORT: UTimeZoneFormatStyle = 2

public val UTZFMT_STYLE_ISO_BASIC_FIXED: UTimeZoneFormatStyle = 9

public val UTZFMT_STYLE_ISO_BASIC_FULL: UTimeZoneFormatStyle = 11

public val UTZFMT_STYLE_ISO_BASIC_LOCAL_FIXED: UTimeZoneFormatStyle = 10

public val UTZFMT_STYLE_ISO_BASIC_LOCAL_FULL: UTimeZoneFormatStyle = 12

public val UTZFMT_STYLE_ISO_BASIC_LOCAL_SHORT: UTimeZoneFormatStyle = 8

public val UTZFMT_STYLE_ISO_BASIC_SHORT: UTimeZoneFormatStyle = 7

public val UTZFMT_STYLE_ISO_EXTENDED_FIXED: UTimeZoneFormatStyle = 13

public val UTZFMT_STYLE_ISO_EXTENDED_FULL: UTimeZoneFormatStyle = 15

public val UTZFMT_STYLE_ISO_EXTENDED_LOCAL_FIXED: UTimeZoneFormatStyle = 14

public val UTZFMT_STYLE_ISO_EXTENDED_LOCAL_FULL: UTimeZoneFormatStyle = 16

public val UTZFMT_STYLE_LOCALIZED_GMT: UTimeZoneFormatStyle = 5

public val UTZFMT_STYLE_LOCALIZED_GMT_SHORT: UTimeZoneFormatStyle = 6

public val UTZFMT_STYLE_SPECIFIC_LONG: UTimeZoneFormatStyle = 3

public val UTZFMT_STYLE_SPECIFIC_SHORT: UTimeZoneFormatStyle = 4

public val UTZFMT_STYLE_ZONE_ID: UTimeZoneFormatStyle = 17

public val UTZFMT_STYLE_ZONE_ID_SHORT: UTimeZoneFormatStyle = 18

public val UTZFMT_TIME_TYPE_DAYLIGHT: UTimeZoneFormatTimeType = 2

public val UTZFMT_TIME_TYPE_STANDARD: UTimeZoneFormatTimeType = 1

public val UTZFMT_TIME_TYPE_UNKNOWN: UTimeZoneFormatTimeType = 0

public val UTZNM_EXEMPLAR_LOCATION: UTimeZoneNameType = 64

public val UTZNM_LONG_DAYLIGHT: UTimeZoneNameType = 4

public val UTZNM_LONG_GENERIC: UTimeZoneNameType = 1

public val UTZNM_LONG_STANDARD: UTimeZoneNameType = 2

public val UTZNM_SHORT_DAYLIGHT: UTimeZoneNameType = 32

public val UTZNM_SHORT_GENERIC: UTimeZoneNameType = 8

public val UTZNM_SHORT_STANDARD: UTimeZoneNameType = 16

public val UTZNM_UNKNOWN: UTimeZoneNameType = 0

public val U_ALPHAINDEX_INFLOW: UAlphabeticIndexLabelType = 2

public val U_ALPHAINDEX_NORMAL: UAlphabeticIndexLabelType = 0

public val U_ALPHAINDEX_OVERFLOW: UAlphabeticIndexLabelType = 3

public val U_ALPHAINDEX_UNDERFLOW: UAlphabeticIndexLabelType = 1

public val U_AMBIGUOUS_ALIAS_WARNING: UErrorCode = -122

public val U_ARABIC_NUMBER: UCharDirection = 5

public val U_ARGUMENT_TYPE_MISMATCH: UErrorCode = 65804

public val U_ASCII_FAMILY: UInt = 0u

public val U_BAD_VARIABLE_DEFINITION: UErrorCode = 65536

public val U_BLOCK_SEPARATOR: UCharDirection = 7

public val U_BOUNDARY_NEUTRAL: UCharDirection = 18

public val U_BPT_CLOSE: UBidiPairedBracketType = 2

public val U_BPT_NONE: UBidiPairedBracketType = 0

public val U_BPT_OPEN: UBidiPairedBracketType = 1

public val U_BRK_ASSIGN_ERROR: UErrorCode = 66053

public val U_BRK_ERROR_START: UErrorCode = 66048

public val U_BRK_HEX_DIGITS_EXPECTED: UErrorCode = 66049

public val U_BRK_INIT_ERROR: UErrorCode = 66058

public val U_BRK_INTERNAL_ERROR: UErrorCode = 66048

public val U_BRK_MALFORMED_RULE_TAG: UErrorCode = 66061

public val U_BRK_MISMATCHED_PAREN: UErrorCode = 66055

public val U_BRK_NEW_LINE_IN_QUOTED_STRING: UErrorCode = 66056

public val U_BRK_RULE_EMPTY_SET: UErrorCode = 66059

public val U_BRK_RULE_SYNTAX: UErrorCode = 66051

public val U_BRK_SEMICOLON_EXPECTED: UErrorCode = 66050

public val U_BRK_UNCLOSED_SET: UErrorCode = 66052

public val U_BRK_UNDEFINED_VARIABLE: UErrorCode = 66057

public val U_BRK_UNRECOGNIZED_OPTION: UErrorCode = 66060

public val U_BRK_VARIABLE_REDFINITION: UErrorCode = 66054

public val U_BUFFER_OVERFLOW_ERROR: UErrorCode = 15

public val U_CE_NOT_FOUND_ERROR: UErrorCode = 21

public val U_CHAR16_IS_TYPEDEF: UInt = 1u

public val U_CHARSET_FAMILY: UInt = 1u

public val U_CHARSET_IS_UTF8: UInt = 1u

public val U_CHAR_CATEGORY_COUNT: UCharCategory = 30

public val U_CHAR_NAME_ALIAS: UCharNameChoice = 3

public val U_CHECK_DYLOAD: UInt = 1u

public val U_COLLATOR_VERSION_MISMATCH: UErrorCode = 28

public val U_COMBINED_IMPLEMENTATION: UInt = 1u

public val U_COMBINING_SPACING_MARK: UCharCategory = 8

public val U_COMMON_NUMBER_SEPARATOR: UCharDirection = 6

public val U_COMPARE_CODE_POINT_ORDER: UInt = 32768u

public val U_COMPARE_IGNORE_CASE: UInt = 65536u

public val U_CONNECTOR_PUNCTUATION: UCharCategory = 22

public val U_CONTROL_CHAR: UCharCategory = 15

public val U_COPYRIGHT_STRING_LENGTH: UInt = 128u

public val U_CPLUSPLUS_VERSION: UInt = 0u

public val U_CURRENCY_SYMBOL: UCharCategory = 25

public val U_DASH_PUNCTUATION: UCharCategory = 19

public val U_DEBUG: UInt = 1u

public val U_DECIMAL_DIGIT_NUMBER: UCharCategory = 9

public val U_DECIMAL_NUMBER_SYNTAX_ERROR: UErrorCode = 65808

public val U_DEFAULT_KEYWORD_MISSING: UErrorCode = 65807

public val U_DEFAULT_SHOW_DRAFT: UInt = 0u

public val U_DEFINE_FALSE_AND_TRUE: UInt = 1u

public val U_DIFFERENT_UCA_VERSION: UErrorCode = -121

public val U_DIR_NON_SPACING_MARK: UCharDirection = 17

public val U_DISABLE_RENAMING: UInt = 1u

public val U_DT_CANONICAL: UDecompositionType = 1

public val U_DT_CIRCLE: UDecompositionType = 3

public val U_DT_COMPAT: UDecompositionType = 2

public val U_DT_FINAL: UDecompositionType = 4

public val U_DT_FONT: UDecompositionType = 5

public val U_DT_FRACTION: UDecompositionType = 6

public val U_DT_INITIAL: UDecompositionType = 7

public val U_DT_ISOLATED: UDecompositionType = 8

public val U_DT_MEDIAL: UDecompositionType = 9

public val U_DT_NARROW: UDecompositionType = 10

public val U_DT_NOBREAK: UDecompositionType = 11

public val U_DT_NONE: UDecompositionType = 0

public val U_DT_SMALL: UDecompositionType = 12

public val U_DT_SQUARE: UDecompositionType = 13

public val U_DT_SUB: UDecompositionType = 14

public val U_DT_SUPER: UDecompositionType = 15

public val U_DT_VERTICAL: UDecompositionType = 16

public val U_DT_WIDE: UDecompositionType = 17

public val U_DUPLICATE_KEYWORD: UErrorCode = 65805

public val U_EA_AMBIGUOUS: UEastAsianWidth = 1

public val U_EA_FULLWIDTH: UEastAsianWidth = 3

public val U_EA_HALFWIDTH: UEastAsianWidth = 2

public val U_EA_NARROW: UEastAsianWidth = 4

public val U_EA_NEUTRAL: UEastAsianWidth = 0

public val U_EA_WIDE: UEastAsianWidth = 5

public val U_EBCDIC_FAMILY: UInt = 1u

public val U_EDITS_NO_RESET: UInt = 8192u

public val U_ENABLE_DYLOAD: UInt = 1u

public val U_ENABLE_TRACING: UInt = 0u

public val U_ENCLOSING_MARK: UCharCategory = 7

public val U_END_PUNCTUATION: UCharCategory = 21

public val U_ENUM_OUT_OF_SYNC_ERROR: UErrorCode = 25

public val U_ERROR_WARNING_START: UErrorCode = -128

public val U_EUROPEAN_NUMBER: UCharDirection = 2

public val U_EUROPEAN_NUMBER_SEPARATOR: UCharDirection = 3

public val U_EUROPEAN_NUMBER_TERMINATOR: UCharDirection = 4

public val U_EXTENDED_CHAR_NAME: UCharNameChoice = 2

public val U_FILE_ACCESS_ERROR: UErrorCode = 4

public val U_FINAL_PUNCTUATION: UCharCategory = 29

public val U_FIRST_STRONG_ISOLATE: UCharDirection = 19

public val U_FMT_PARSE_ERROR_START: UErrorCode = 65792

public val U_FOLD_CASE_DEFAULT: UInt = 0u

public val U_FOLD_CASE_EXCLUDE_SPECIAL_I: UInt = 1u

public val U_FORMAT_CHAR: UCharCategory = 16

public val U_FORMAT_INEXACT_ERROR: UErrorCode = 65809

public val U_GCB_CONTROL: UGraphemeClusterBreak = 1

public val U_GCB_CR: UGraphemeClusterBreak = 2

public val U_GCB_EXTEND: UGraphemeClusterBreak = 3

public val U_GCB_E_BASE: UGraphemeClusterBreak = 13

public val U_GCB_E_BASE_GAZ: UGraphemeClusterBreak = 14

public val U_GCB_E_MODIFIER: UGraphemeClusterBreak = 15

public val U_GCB_GLUE_AFTER_ZWJ: UGraphemeClusterBreak = 16

public val U_GCB_L: UGraphemeClusterBreak = 4

public val U_GCB_LF: UGraphemeClusterBreak = 5

public val U_GCB_LV: UGraphemeClusterBreak = 6

public val U_GCB_LVT: UGraphemeClusterBreak = 7

public val U_GCB_OTHER: UGraphemeClusterBreak = 0

public val U_GCB_PREPEND: UGraphemeClusterBreak = 11

public val U_GCB_REGIONAL_INDICATOR: UGraphemeClusterBreak = 12

public val U_GCB_SPACING_MARK: UGraphemeClusterBreak = 10

public val U_GCB_T: UGraphemeClusterBreak = 8

public val U_GCB_V: UGraphemeClusterBreak = 9

public val U_GCB_ZWJ: UGraphemeClusterBreak = 17

public val U_GCC_MAJOR_MINOR: UInt = 0u

public val U_GENERAL_OTHER_TYPES: UCharCategory = 0

public val U_HAVE_CHAR16_T: UInt = 1u

public val U_HAVE_DEBUG_LOCATION_NEW: UInt = 1u

public val U_HAVE_INTTYPES_H: UInt = 1u

public val U_HAVE_LIB_SUFFIX: UInt = 1u

public val U_HAVE_PLACEMENT_NEW: UInt = 0u

public val U_HAVE_RBNF: UInt = 0u

public val U_HAVE_RVALUE_REFERENCES: UInt = 1u

public val U_HAVE_STDINT_H: UInt = 1u

public val U_HAVE_STD_STRING: UInt = 0u

public val U_HAVE_WCHAR_H: UInt = 0u

public val U_HAVE_WCSCPY: UInt = 0u

public val U_HIDE_DEPRECATED_API: UInt = 1u

public val U_HIDE_DRAFT_API: UInt = 1u

public val U_HIDE_INTERNAL_API: UInt = 1u

public val U_HIDE_OBSOLETE_API: UInt = 1u

public val U_HIDE_OBSOLETE_UTF_OLD_H: UInt = 0u

public val U_HST_LEADING_JAMO: UHangulSyllableType = 1

public val U_HST_LVT_SYLLABLE: UHangulSyllableType = 5

public val U_HST_LV_SYLLABLE: UHangulSyllableType = 4

public val U_HST_NOT_APPLICABLE: UHangulSyllableType = 0

public val U_HST_TRAILING_JAMO: UHangulSyllableType = 3

public val U_HST_VOWEL_JAMO: UHangulSyllableType = 2

public val U_ICUDATA_TYPE_LETTER: Pcstr = s("e")

public val U_ICU_DATA_KEY: Pcstr = s("DataVersion")

public val U_ICU_VERSION_BUNDLE: Pcstr = s("icuver")

public val U_IDNA_ACE_PREFIX_ERROR: UErrorCode = 66564

public val U_IDNA_CHECK_BIDI_ERROR: UErrorCode = 66562

public val U_IDNA_DOMAIN_NAME_TOO_LONG_ERROR: UErrorCode = 66568

public val U_IDNA_ERROR_START: UErrorCode = 66560

public val U_IDNA_LABEL_TOO_LONG_ERROR: UErrorCode = 66566

public val U_IDNA_PROHIBITED_ERROR: UErrorCode = 66560

public val U_IDNA_STD3_ASCII_RULES_ERROR: UErrorCode = 66563

public val U_IDNA_UNASSIGNED_ERROR: UErrorCode = 66561

public val U_IDNA_VERIFICATION_ERROR: UErrorCode = 66565

public val U_IDNA_ZERO_LENGTH_LABEL_ERROR: UErrorCode = 66567

public val U_ILLEGAL_ARGUMENT_ERROR: UErrorCode = 1

public val U_ILLEGAL_CHARACTER: UErrorCode = 65567

public val U_ILLEGAL_CHAR_FOUND: UErrorCode = 12

public val U_ILLEGAL_CHAR_IN_SEGMENT: UErrorCode = 65564

public val U_ILLEGAL_ESCAPE_SEQUENCE: UErrorCode = 18

public val U_ILLEGAL_PAD_POSITION: UErrorCode = 65800

public val U_INDEX_OUTOFBOUNDS_ERROR: UErrorCode = 8

public val U_INITIAL_PUNCTUATION: UCharCategory = 28

public val U_INPC_BOTTOM: UIndicPositionalCategory = 1

public val U_INPC_BOTTOM_AND_LEFT: UIndicPositionalCategory = 2

public val U_INPC_BOTTOM_AND_RIGHT: UIndicPositionalCategory = 3

public val U_INPC_LEFT: UIndicPositionalCategory = 4

public val U_INPC_LEFT_AND_RIGHT: UIndicPositionalCategory = 5

public val U_INPC_NA: UIndicPositionalCategory = 0

public val U_INPC_OVERSTRUCK: UIndicPositionalCategory = 6

public val U_INPC_RIGHT: UIndicPositionalCategory = 7

public val U_INPC_TOP: UIndicPositionalCategory = 8

public val U_INPC_TOP_AND_BOTTOM: UIndicPositionalCategory = 9

public val U_INPC_TOP_AND_BOTTOM_AND_LEFT: UIndicPositionalCategory = 15

public val U_INPC_TOP_AND_BOTTOM_AND_RIGHT: UIndicPositionalCategory = 10

public val U_INPC_TOP_AND_LEFT: UIndicPositionalCategory = 11

public val U_INPC_TOP_AND_LEFT_AND_RIGHT: UIndicPositionalCategory = 12

public val U_INPC_TOP_AND_RIGHT: UIndicPositionalCategory = 13

public val U_INPC_VISUAL_ORDER_LEFT: UIndicPositionalCategory = 14

public val U_INSC_AVAGRAHA: UIndicSyllabicCategory = 1

public val U_INSC_BINDU: UIndicSyllabicCategory = 2

public val U_INSC_BRAHMI_JOINING_NUMBER: UIndicSyllabicCategory = 3

public val U_INSC_CANTILLATION_MARK: UIndicSyllabicCategory = 4

public val U_INSC_CONSONANT: UIndicSyllabicCategory = 5

public val U_INSC_CONSONANT_DEAD: UIndicSyllabicCategory = 6

public val U_INSC_CONSONANT_FINAL: UIndicSyllabicCategory = 7

public val U_INSC_CONSONANT_HEAD_LETTER: UIndicSyllabicCategory = 8

public val U_INSC_CONSONANT_INITIAL_POSTFIXED: UIndicSyllabicCategory = 9

public val U_INSC_CONSONANT_KILLER: UIndicSyllabicCategory = 10

public val U_INSC_CONSONANT_MEDIAL: UIndicSyllabicCategory = 11

public val U_INSC_CONSONANT_PLACEHOLDER: UIndicSyllabicCategory = 12

public val U_INSC_CONSONANT_PRECEDING_REPHA: UIndicSyllabicCategory = 13

public val U_INSC_CONSONANT_PREFIXED: UIndicSyllabicCategory = 14

public val U_INSC_CONSONANT_SUBJOINED: UIndicSyllabicCategory = 15

public val U_INSC_CONSONANT_SUCCEEDING_REPHA: UIndicSyllabicCategory = 16

public val U_INSC_CONSONANT_WITH_STACKER: UIndicSyllabicCategory = 17

public val U_INSC_GEMINATION_MARK: UIndicSyllabicCategory = 18

public val U_INSC_INVISIBLE_STACKER: UIndicSyllabicCategory = 19

public val U_INSC_JOINER: UIndicSyllabicCategory = 20

public val U_INSC_MODIFYING_LETTER: UIndicSyllabicCategory = 21

public val U_INSC_NON_JOINER: UIndicSyllabicCategory = 22

public val U_INSC_NUKTA: UIndicSyllabicCategory = 23

public val U_INSC_NUMBER: UIndicSyllabicCategory = 24

public val U_INSC_NUMBER_JOINER: UIndicSyllabicCategory = 25

public val U_INSC_OTHER: UIndicSyllabicCategory = 0

public val U_INSC_PURE_KILLER: UIndicSyllabicCategory = 26

public val U_INSC_REGISTER_SHIFTER: UIndicSyllabicCategory = 27

public val U_INSC_SYLLABLE_MODIFIER: UIndicSyllabicCategory = 28

public val U_INSC_TONE_LETTER: UIndicSyllabicCategory = 29

public val U_INSC_TONE_MARK: UIndicSyllabicCategory = 30

public val U_INSC_VIRAMA: UIndicSyllabicCategory = 31

public val U_INSC_VISARGA: UIndicSyllabicCategory = 32

public val U_INSC_VOWEL: UIndicSyllabicCategory = 33

public val U_INSC_VOWEL_DEPENDENT: UIndicSyllabicCategory = 34

public val U_INSC_VOWEL_INDEPENDENT: UIndicSyllabicCategory = 35

public val U_INTERNAL_PROGRAM_ERROR: UErrorCode = 5

public val U_INTERNAL_TRANSLITERATOR_ERROR: UErrorCode = 65568

public val U_INVALID_CHAR_FOUND: UErrorCode = 10

public val U_INVALID_FORMAT_ERROR: UErrorCode = 3

public val U_INVALID_FUNCTION: UErrorCode = 65570

public val U_INVALID_ID: UErrorCode = 65569

public val U_INVALID_PROPERTY_PATTERN: UErrorCode = 65561

public val U_INVALID_RBT_SYNTAX: UErrorCode = 65560

public val U_INVALID_STATE_ERROR: UErrorCode = 27

public val U_INVALID_TABLE_FILE: UErrorCode = 14

public val U_INVALID_TABLE_FORMAT: UErrorCode = 13

public val U_INVARIANT_CONVERSION_ERROR: UErrorCode = 26

public val U_IOSTREAM_SOURCE: UInt = 199711u

public val U_IS_BIG_ENDIAN: UInt = 0u

public val U_JG_AFRICAN_FEH: UJoiningGroup = 86

public val U_JG_AFRICAN_NOON: UJoiningGroup = 87

public val U_JG_AFRICAN_QAF: UJoiningGroup = 88

public val U_JG_AIN: UJoiningGroup = 1

public val U_JG_ALAPH: UJoiningGroup = 2

public val U_JG_ALEF: UJoiningGroup = 3

public val U_JG_BEH: UJoiningGroup = 4

public val U_JG_BETH: UJoiningGroup = 5

public val U_JG_BURUSHASKI_YEH_BARREE: UJoiningGroup = 54

public val U_JG_DAL: UJoiningGroup = 6

public val U_JG_DALATH_RISH: UJoiningGroup = 7

public val U_JG_E: UJoiningGroup = 8

public val U_JG_FARSI_YEH: UJoiningGroup = 55

public val U_JG_FE: UJoiningGroup = 51

public val U_JG_FEH: UJoiningGroup = 9

public val U_JG_FINAL_SEMKATH: UJoiningGroup = 10

public val U_JG_GAF: UJoiningGroup = 11

public val U_JG_GAMAL: UJoiningGroup = 12

public val U_JG_HAH: UJoiningGroup = 13

public val U_JG_HAMZA_ON_HEH_GOAL: UJoiningGroup = 14

public val U_JG_HANIFI_ROHINGYA_KINNA_YA: UJoiningGroup = 100

public val U_JG_HANIFI_ROHINGYA_PA: UJoiningGroup = 101

public val U_JG_HE: UJoiningGroup = 15

public val U_JG_HEH: UJoiningGroup = 16

public val U_JG_HEH_GOAL: UJoiningGroup = 17

public val U_JG_HETH: UJoiningGroup = 18

public val U_JG_KAF: UJoiningGroup = 19

public val U_JG_KAPH: UJoiningGroup = 20

public val U_JG_KHAPH: UJoiningGroup = 52

public val U_JG_KNOTTED_HEH: UJoiningGroup = 21

public val U_JG_LAM: UJoiningGroup = 22

public val U_JG_LAMADH: UJoiningGroup = 23

public val U_JG_MALAYALAM_BHA: UJoiningGroup = 89

public val U_JG_MALAYALAM_JA: UJoiningGroup = 90

public val U_JG_MALAYALAM_LLA: UJoiningGroup = 91

public val U_JG_MALAYALAM_LLLA: UJoiningGroup = 92

public val U_JG_MALAYALAM_NGA: UJoiningGroup = 93

public val U_JG_MALAYALAM_NNA: UJoiningGroup = 94

public val U_JG_MALAYALAM_NNNA: UJoiningGroup = 95

public val U_JG_MALAYALAM_NYA: UJoiningGroup = 96

public val U_JG_MALAYALAM_RA: UJoiningGroup = 97

public val U_JG_MALAYALAM_SSA: UJoiningGroup = 98

public val U_JG_MALAYALAM_TTA: UJoiningGroup = 99

public val U_JG_MANICHAEAN_ALEPH: UJoiningGroup = 58

public val U_JG_MANICHAEAN_AYIN: UJoiningGroup = 59

public val U_JG_MANICHAEAN_BETH: UJoiningGroup = 60

public val U_JG_MANICHAEAN_DALETH: UJoiningGroup = 61

public val U_JG_MANICHAEAN_DHAMEDH: UJoiningGroup = 62

public val U_JG_MANICHAEAN_FIVE: UJoiningGroup = 63

public val U_JG_MANICHAEAN_GIMEL: UJoiningGroup = 64

public val U_JG_MANICHAEAN_HETH: UJoiningGroup = 65

public val U_JG_MANICHAEAN_HUNDRED: UJoiningGroup = 66

public val U_JG_MANICHAEAN_KAPH: UJoiningGroup = 67

public val U_JG_MANICHAEAN_LAMEDH: UJoiningGroup = 68

public val U_JG_MANICHAEAN_MEM: UJoiningGroup = 69

public val U_JG_MANICHAEAN_NUN: UJoiningGroup = 70

public val U_JG_MANICHAEAN_ONE: UJoiningGroup = 71

public val U_JG_MANICHAEAN_PE: UJoiningGroup = 72

public val U_JG_MANICHAEAN_QOPH: UJoiningGroup = 73

public val U_JG_MANICHAEAN_RESH: UJoiningGroup = 74

public val U_JG_MANICHAEAN_SADHE: UJoiningGroup = 75

public val U_JG_MANICHAEAN_SAMEKH: UJoiningGroup = 76

public val U_JG_MANICHAEAN_TAW: UJoiningGroup = 77

public val U_JG_MANICHAEAN_TEN: UJoiningGroup = 78

public val U_JG_MANICHAEAN_TETH: UJoiningGroup = 79

public val U_JG_MANICHAEAN_THAMEDH: UJoiningGroup = 80

public val U_JG_MANICHAEAN_TWENTY: UJoiningGroup = 81

public val U_JG_MANICHAEAN_WAW: UJoiningGroup = 82

public val U_JG_MANICHAEAN_YODH: UJoiningGroup = 83

public val U_JG_MANICHAEAN_ZAYIN: UJoiningGroup = 84

public val U_JG_MEEM: UJoiningGroup = 24

public val U_JG_MIM: UJoiningGroup = 25

public val U_JG_NOON: UJoiningGroup = 26

public val U_JG_NO_JOINING_GROUP: UJoiningGroup = 0

public val U_JG_NUN: UJoiningGroup = 27

public val U_JG_NYA: UJoiningGroup = 56

public val U_JG_PE: UJoiningGroup = 28

public val U_JG_QAF: UJoiningGroup = 29

public val U_JG_QAPH: UJoiningGroup = 30

public val U_JG_REH: UJoiningGroup = 31

public val U_JG_REVERSED_PE: UJoiningGroup = 32

public val U_JG_ROHINGYA_YEH: UJoiningGroup = 57

public val U_JG_SAD: UJoiningGroup = 33

public val U_JG_SADHE: UJoiningGroup = 34

public val U_JG_SEEN: UJoiningGroup = 35

public val U_JG_SEMKATH: UJoiningGroup = 36

public val U_JG_SHIN: UJoiningGroup = 37

public val U_JG_STRAIGHT_WAW: UJoiningGroup = 85

public val U_JG_SWASH_KAF: UJoiningGroup = 38

public val U_JG_SYRIAC_WAW: UJoiningGroup = 39

public val U_JG_TAH: UJoiningGroup = 40

public val U_JG_TAW: UJoiningGroup = 41

public val U_JG_TEH_MARBUTA: UJoiningGroup = 42

public val U_JG_TEH_MARBUTA_GOAL: UJoiningGroup = 14

public val U_JG_TETH: UJoiningGroup = 43

public val U_JG_WAW: UJoiningGroup = 44

public val U_JG_YEH: UJoiningGroup = 45

public val U_JG_YEH_BARREE: UJoiningGroup = 46

public val U_JG_YEH_WITH_TAIL: UJoiningGroup = 47

public val U_JG_YUDH: UJoiningGroup = 48

public val U_JG_YUDH_HE: UJoiningGroup = 49

public val U_JG_ZAIN: UJoiningGroup = 50

public val U_JG_ZHAIN: UJoiningGroup = 53

public val U_JT_DUAL_JOINING: UJoiningType = 2

public val U_JT_JOIN_CAUSING: UJoiningType = 1

public val U_JT_LEFT_JOINING: UJoiningType = 3

public val U_JT_NON_JOINING: UJoiningType = 0

public val U_JT_RIGHT_JOINING: UJoiningType = 4

public val U_JT_TRANSPARENT: UJoiningType = 5

public val U_LB_ALPHABETIC: ULineBreak = 2

public val U_LB_AMBIGUOUS: ULineBreak = 1

public val U_LB_BREAK_AFTER: ULineBreak = 4

public val U_LB_BREAK_BEFORE: ULineBreak = 5

public val U_LB_BREAK_BOTH: ULineBreak = 3

public val U_LB_BREAK_SYMBOLS: ULineBreak = 27

public val U_LB_CARRIAGE_RETURN: ULineBreak = 10

public val U_LB_CLOSE_PARENTHESIS: ULineBreak = 36

public val U_LB_CLOSE_PUNCTUATION: ULineBreak = 8

public val U_LB_COMBINING_MARK: ULineBreak = 9

public val U_LB_COMPLEX_CONTEXT: ULineBreak = 24

public val U_LB_CONDITIONAL_JAPANESE_STARTER: ULineBreak = 37

public val U_LB_CONTINGENT_BREAK: ULineBreak = 7

public val U_LB_EXCLAMATION: ULineBreak = 11

public val U_LB_E_BASE: ULineBreak = 40

public val U_LB_E_MODIFIER: ULineBreak = 41

public val U_LB_GLUE: ULineBreak = 12

public val U_LB_H2: ULineBreak = 31

public val U_LB_H3: ULineBreak = 32

public val U_LB_HEBREW_LETTER: ULineBreak = 38

public val U_LB_HYPHEN: ULineBreak = 13

public val U_LB_IDEOGRAPHIC: ULineBreak = 14

public val U_LB_INFIX_NUMERIC: ULineBreak = 16

public val U_LB_INSEPARABLE: ULineBreak = 15

public val U_LB_INSEPERABLE: ULineBreak = 15

public val U_LB_JL: ULineBreak = 33

public val U_LB_JT: ULineBreak = 34

public val U_LB_JV: ULineBreak = 35

public val U_LB_LINE_FEED: ULineBreak = 17

public val U_LB_MANDATORY_BREAK: ULineBreak = 6

public val U_LB_NEXT_LINE: ULineBreak = 29

public val U_LB_NONSTARTER: ULineBreak = 18

public val U_LB_NUMERIC: ULineBreak = 19

public val U_LB_OPEN_PUNCTUATION: ULineBreak = 20

public val U_LB_POSTFIX_NUMERIC: ULineBreak = 21

public val U_LB_PREFIX_NUMERIC: ULineBreak = 22

public val U_LB_QUOTATION: ULineBreak = 23

public val U_LB_REGIONAL_INDICATOR: ULineBreak = 39

public val U_LB_SPACE: ULineBreak = 26

public val U_LB_SURROGATE: ULineBreak = 25

public val U_LB_UNKNOWN: ULineBreak = 0

public val U_LB_WORD_JOINER: ULineBreak = 30

public val U_LB_ZWJ: ULineBreak = 42

public val U_LB_ZWSPACE: ULineBreak = 28

public val U_LEFT_TO_RIGHT: UCharDirection = 0

public val U_LEFT_TO_RIGHT_EMBEDDING: UCharDirection = 11

public val U_LEFT_TO_RIGHT_ISOLATE: UCharDirection = 20

public val U_LEFT_TO_RIGHT_OVERRIDE: UCharDirection = 12

public val U_LETTER_NUMBER: UCharCategory = 10

public val U_LIB_SUFFIX_C_NAME_STRING: Pcstr = s("")

public val U_LINE_SEPARATOR: UCharCategory = 13

public val U_LONG_PROPERTY_NAME: UPropertyNameChoice = 1

public val U_LOWERCASE_LETTER: UCharCategory = 2

public val U_MALFORMED_EXPONENTIAL_PATTERN: UErrorCode = 65795

public val U_MALFORMED_PRAGMA: UErrorCode = 65562

public val U_MALFORMED_RULE: UErrorCode = 65537

public val U_MALFORMED_SET: UErrorCode = 65538

public val U_MALFORMED_SYMBOL_REFERENCE: UErrorCode = 65539

public val U_MALFORMED_UNICODE_ESCAPE: UErrorCode = 65540

public val U_MALFORMED_VARIABLE_DEFINITION: UErrorCode = 65541

public val U_MALFORMED_VARIABLE_REFERENCE: UErrorCode = 65542

public val U_MATH_SYMBOL: UCharCategory = 24

public val U_MAX_VERSION_LENGTH: UInt = 4u

public val U_MAX_VERSION_STRING_LENGTH: UInt = 20u

public val U_MEMORY_ALLOCATION_ERROR: UErrorCode = 7

public val U_MESSAGE_PARSE_ERROR: UErrorCode = 6

public val U_MILLIS_PER_DAY: UInt = 86400000u

public val U_MILLIS_PER_HOUR: UInt = 3600000u

public val U_MILLIS_PER_MINUTE: UInt = 60000u

public val U_MILLIS_PER_SECOND: UInt = 1000u

public val U_MISMATCHED_SEGMENT_DELIMITERS: UErrorCode = 65543

public val U_MISPLACED_ANCHOR_START: UErrorCode = 65544

public val U_MISPLACED_COMPOUND_FILTER: UErrorCode = 65558

public val U_MISPLACED_CURSOR_OFFSET: UErrorCode = 65545

public val U_MISPLACED_QUANTIFIER: UErrorCode = 65546

public val U_MISSING_OPERATOR: UErrorCode = 65547

public val U_MISSING_RESOURCE_ERROR: UErrorCode = 2

public val U_MISSING_SEGMENT_CLOSE: UErrorCode = 65548

public val U_MODIFIER_LETTER: UCharCategory = 4

public val U_MODIFIER_SYMBOL: UCharCategory = 26

public val U_MULTIPLE_ANTE_CONTEXTS: UErrorCode = 65549

public val U_MULTIPLE_COMPOUND_FILTERS: UErrorCode = 65559

public val U_MULTIPLE_CURSORS: UErrorCode = 65550

public val U_MULTIPLE_DECIMAL_SEPARATORS: UErrorCode = 65793

public val U_MULTIPLE_DECIMAL_SEPERATORS: UErrorCode = 65793

public val U_MULTIPLE_EXPONENTIAL_SYMBOLS: UErrorCode = 65794

public val U_MULTIPLE_PAD_SPECIFIERS: UErrorCode = 65798

public val U_MULTIPLE_PERCENT_SYMBOLS: UErrorCode = 65796

public val U_MULTIPLE_PERMILL_SYMBOLS: UErrorCode = 65797

public val U_MULTIPLE_POST_CONTEXTS: UErrorCode = 65551

public val U_NON_SPACING_MARK: UCharCategory = 6

public val U_NO_DEFAULT_INCLUDE_UTF_HEADERS: UInt = 1u

public val U_NO_SPACE_AVAILABLE: UErrorCode = 20

public val U_NO_WRITE_PERMISSION: UErrorCode = 30

public val U_NT_DECIMAL: UNumericType = 1

public val U_NT_DIGIT: UNumericType = 2

public val U_NT_NONE: UNumericType = 0

public val U_NT_NUMERIC: UNumericType = 3

public val U_NUMBER_ARG_OUTOFBOUNDS_ERROR: UErrorCode = 65810

public val U_NUMBER_SKELETON_SYNTAX_ERROR: UErrorCode = 65811

public val U_OMIT_UNCHANGED_TEXT: UInt = 16384u

public val U_OTHER_LETTER: UCharCategory = 5

public val U_OTHER_NEUTRAL: UCharDirection = 10

public val U_OTHER_NUMBER: UCharCategory = 11

public val U_OTHER_PUNCTUATION: UCharCategory = 23

public val U_OTHER_SYMBOL: UCharCategory = 27

public val U_OVERRIDE_CXX_ALLOCATION: UInt = 1u

public val U_PARAGRAPH_SEPARATOR: UCharCategory = 14

public val U_PARSE_CONTEXT_LEN: Int = 16

public val U_PARSE_ERROR: UErrorCode = 9

public val U_PARSE_ERROR_START: UErrorCode = 65536

public val U_PATTERN_SYNTAX_ERROR: UErrorCode = 65799

public val U_PF_AIX: UInt = 3100u

public val U_PF_ANDROID: UInt = 4050u

public val U_PF_BROWSER_NATIVE_CLIENT: UInt = 4020u

public val U_PF_BSD: UInt = 3000u

public val U_PF_CYGWIN: UInt = 1900u

public val U_PF_DARWIN: UInt = 3500u

public val U_PF_EMSCRIPTEN: UInt = 5010u

public val U_PF_FUCHSIA: UInt = 4100u

public val U_PF_HPUX: UInt = 2100u

public val U_PF_IPHONE: UInt = 3550u

public val U_PF_IRIX: UInt = 3200u

public val U_PF_LINUX: UInt = 4000u

public val U_PF_MINGW: UInt = 1800u

public val U_PF_OS390: UInt = 9000u

public val U_PF_OS400: UInt = 9400u

public val U_PF_QNX: UInt = 3700u

public val U_PF_SOLARIS: UInt = 2600u

public val U_PF_UNKNOWN: UInt = 0u

public val U_PF_WINDOWS: UInt = 1000u

public val U_PLATFORM: UInt = 1800u

public val U_PLATFORM_HAS_WIN32_API: UInt = 1u

public val U_PLATFORM_HAS_WINUWP_API: UInt = 0u

public val U_PLATFORM_IMPLEMENTS_POSIX: UInt = 0u

public val U_PLATFORM_IS_DARWIN_BASED: UInt = 1u

public val U_PLATFORM_IS_LINUX_BASED: UInt = 1u

public val U_PLATFORM_USES_ONLY_WIN32_API: UInt = 1u

public val U_PLUGIN_CHANGED_LEVEL_WARNING: UErrorCode = -120

public val U_PLUGIN_DIDNT_SET_LEVEL: UErrorCode = 66817

public val U_PLUGIN_ERROR_START: UErrorCode = 66816

public val U_PLUGIN_TOO_HIGH: UErrorCode = 66816

public val U_POP_DIRECTIONAL_FORMAT: UCharDirection = 16

public val U_POP_DIRECTIONAL_ISOLATE: UCharDirection = 22

public val U_PRIMARY_TOO_LONG_ERROR: UErrorCode = 22

public val U_PRIVATE_USE_CHAR: UCharCategory = 17

public val U_REGEX_BAD_ESCAPE_SEQUENCE: UErrorCode = 66307

public val U_REGEX_BAD_INTERVAL: UErrorCode = 66312

public val U_REGEX_ERROR_START: UErrorCode = 66304

public val U_REGEX_INTERNAL_ERROR: UErrorCode = 66304

public val U_REGEX_INVALID_BACK_REF: UErrorCode = 66314

public val U_REGEX_INVALID_CAPTURE_GROUP_NAME: UErrorCode = 66325

public val U_REGEX_INVALID_FLAG: UErrorCode = 66315

public val U_REGEX_INVALID_RANGE: UErrorCode = 66320

public val U_REGEX_INVALID_STATE: UErrorCode = 66306

public val U_REGEX_LOOK_BEHIND_LIMIT: UErrorCode = 66316

public val U_REGEX_MAX_LT_MIN: UErrorCode = 66313

public val U_REGEX_MISMATCHED_PAREN: UErrorCode = 66310

public val U_REGEX_MISSING_CLOSE_BRACKET: UErrorCode = 66319

public val U_REGEX_NUMBER_TOO_BIG: UErrorCode = 66311

public val U_REGEX_PATTERN_TOO_BIG: UErrorCode = 66324

public val U_REGEX_PROPERTY_SYNTAX: UErrorCode = 66308

public val U_REGEX_RULE_SYNTAX: UErrorCode = 66305

public val U_REGEX_SET_CONTAINS_STRING: UErrorCode = 66317

public val U_REGEX_STACK_OVERFLOW: UErrorCode = 66321

public val U_REGEX_STOPPED_BY_CALLER: UErrorCode = 66323

public val U_REGEX_TIME_OUT: UErrorCode = 66322

public val U_REGEX_UNIMPLEMENTED: UErrorCode = 66309

public val U_RESOURCE_TYPE_MISMATCH: UErrorCode = 17

public val U_RIGHT_TO_LEFT: UCharDirection = 1

public val U_RIGHT_TO_LEFT_ARABIC: UCharDirection = 13

public val U_RIGHT_TO_LEFT_EMBEDDING: UCharDirection = 14

public val U_RIGHT_TO_LEFT_ISOLATE: UCharDirection = 21

public val U_RIGHT_TO_LEFT_OVERRIDE: UCharDirection = 15

public val U_RULE_MASK_ERROR: UErrorCode = 65557

public val U_SAFECLONE_ALLOCATED_WARNING: UErrorCode = -126

public val U_SB_ATERM: USentenceBreak = 1

public val U_SB_CLOSE: USentenceBreak = 2

public val U_SB_CR: USentenceBreak = 11

public val U_SB_EXTEND: USentenceBreak = 12

public val U_SB_FORMAT: USentenceBreak = 3

public val U_SB_LF: USentenceBreak = 13

public val U_SB_LOWER: USentenceBreak = 4

public val U_SB_NUMERIC: USentenceBreak = 5

public val U_SB_OLETTER: USentenceBreak = 6

public val U_SB_OTHER: USentenceBreak = 0

public val U_SB_SCONTINUE: USentenceBreak = 14

public val U_SB_SEP: USentenceBreak = 7

public val U_SB_SP: USentenceBreak = 8

public val U_SB_STERM: USentenceBreak = 9

public val U_SB_UPPER: USentenceBreak = 10

public val U_SEGMENT_SEPARATOR: UCharDirection = 8

public val U_SENTINEL: Int = -1

public val U_SHAPE_AGGREGATE_TASHKEEL: UInt = 16384u

public val U_SHAPE_AGGREGATE_TASHKEEL_MASK: UInt = 16384u

public val U_SHAPE_AGGREGATE_TASHKEEL_NOOP: UInt = 0u

public val U_SHAPE_DIGITS_ALEN2AN_INIT_AL: UInt = 128u

public val U_SHAPE_DIGITS_ALEN2AN_INIT_LR: UInt = 96u

public val U_SHAPE_DIGITS_AN2EN: UInt = 64u

public val U_SHAPE_DIGITS_EN2AN: UInt = 32u

public val U_SHAPE_DIGITS_MASK: UInt = 224u

public val U_SHAPE_DIGITS_NOOP: UInt = 0u

public val U_SHAPE_DIGITS_RESERVED: UInt = 160u

public val U_SHAPE_DIGIT_TYPE_AN: UInt = 0u

public val U_SHAPE_DIGIT_TYPE_AN_EXTENDED: UInt = 256u

public val U_SHAPE_DIGIT_TYPE_MASK: UInt = 768u

public val U_SHAPE_DIGIT_TYPE_RESERVED: UInt = 512u

public val U_SHAPE_LAMALEF_AUTO: UInt = 65536u

public val U_SHAPE_LAMALEF_BEGIN: UInt = 3u

public val U_SHAPE_LAMALEF_END: UInt = 2u

public val U_SHAPE_LAMALEF_MASK: UInt = 65539u

public val U_SHAPE_LAMALEF_NEAR: UInt = 1u

public val U_SHAPE_LAMALEF_RESIZE: UInt = 0u

public val U_SHAPE_LENGTH_FIXED_SPACES_AT_BEGINNING: UInt = 3u

public val U_SHAPE_LENGTH_FIXED_SPACES_AT_END: UInt = 2u

public val U_SHAPE_LENGTH_FIXED_SPACES_NEAR: UInt = 1u

public val U_SHAPE_LENGTH_GROW_SHRINK: UInt = 0u

public val U_SHAPE_LENGTH_MASK: UInt = 65539u

public val U_SHAPE_LETTERS_MASK: UInt = 24u

public val U_SHAPE_LETTERS_NOOP: UInt = 0u

public val U_SHAPE_LETTERS_SHAPE: UInt = 8u

public val U_SHAPE_LETTERS_SHAPE_TASHKEEL_ISOLATED: UInt = 24u

public val U_SHAPE_LETTERS_UNSHAPE: UInt = 16u

public val U_SHAPE_PRESERVE_PRESENTATION: UInt = 32768u

public val U_SHAPE_PRESERVE_PRESENTATION_MASK: UInt = 32768u

public val U_SHAPE_PRESERVE_PRESENTATION_NOOP: UInt = 0u

public val U_SHAPE_SEEN_MASK: UInt = 7340032u

public val U_SHAPE_SEEN_TWOCELL_NEAR: UInt = 2097152u

public val U_SHAPE_SPACES_RELATIVE_TO_TEXT_BEGIN_END: UInt = 67108864u

public val U_SHAPE_SPACES_RELATIVE_TO_TEXT_MASK: UInt = 67108864u

public val U_SHAPE_TAIL_NEW_UNICODE: UInt = 134217728u

public val U_SHAPE_TAIL_TYPE_MASK: UInt = 134217728u

public val U_SHAPE_TASHKEEL_BEGIN: UInt = 262144u

public val U_SHAPE_TASHKEEL_END: UInt = 393216u

public val U_SHAPE_TASHKEEL_MASK: UInt = 917504u

public val U_SHAPE_TASHKEEL_REPLACE_BY_TATWEEL: UInt = 786432u

public val U_SHAPE_TASHKEEL_RESIZE: UInt = 524288u

public val U_SHAPE_TEXT_DIRECTION_LOGICAL: UInt = 0u

public val U_SHAPE_TEXT_DIRECTION_MASK: UInt = 4u

public val U_SHAPE_TEXT_DIRECTION_VISUAL_LTR: UInt = 4u

public val U_SHAPE_TEXT_DIRECTION_VISUAL_RTL: UInt = 0u

public val U_SHAPE_YEHHAMZA_MASK: UInt = 58720256u

public val U_SHAPE_YEHHAMZA_TWOCELL_NEAR: UInt = 16777216u

public val U_SHORT_PROPERTY_NAME: UPropertyNameChoice = 0

public val U_SHOW_CPLUSPLUS_API: UInt = 0u

public val U_SIZEOF_UCHAR: UInt = 2u

public val U_SIZEOF_WCHAR_T: UInt = 1u

public val U_SORT_KEY_TOO_SHORT_WARNING: UErrorCode = -123

public val U_SPACE_SEPARATOR: UCharCategory = 12

public val U_START_PUNCTUATION: UCharCategory = 20

public val U_STATE_OLD_WARNING: UErrorCode = -125

public val U_STATE_TOO_OLD_ERROR: UErrorCode = 23

public val U_STRINGPREP_CHECK_BIDI_ERROR: UErrorCode = 66562

public val U_STRINGPREP_PROHIBITED_ERROR: UErrorCode = 66560

public val U_STRINGPREP_UNASSIGNED_ERROR: UErrorCode = 66561

public val U_STRING_NOT_TERMINATED_WARNING: UErrorCode = -124

public val U_SURROGATE: UCharCategory = 18

public val U_TITLECASE_ADJUST_TO_CASED: UInt = 1024u

public val U_TITLECASE_LETTER: UCharCategory = 3

public val U_TITLECASE_NO_BREAK_ADJUSTMENT: UInt = 512u

public val U_TITLECASE_NO_LOWERCASE: UInt = 256u

public val U_TITLECASE_SENTENCES: UInt = 64u

public val U_TITLECASE_WHOLE_STRING: UInt = 32u

public val U_TOO_MANY_ALIASES_ERROR: UErrorCode = 24

public val U_TRAILING_BACKSLASH: UErrorCode = 65552

public val U_TRUNCATED_CHAR_FOUND: UErrorCode = 11

public val U_UNASSIGNED: UCharCategory = 0

public val U_UNCLOSED_SEGMENT: UErrorCode = 65563

public val U_UNDEFINED_KEYWORD: UErrorCode = 65806

public val U_UNDEFINED_SEGMENT_REFERENCE: UErrorCode = 65553

public val U_UNDEFINED_VARIABLE: UErrorCode = 65554

public val U_UNEXPECTED_TOKEN: UErrorCode = 65792

public val U_UNICODE_CHAR_NAME: UCharNameChoice = 0

public val U_UNICODE_VERSION: Pcstr = s("8.0")

public val U_UNMATCHED_BRACES: UErrorCode = 65801

public val U_UNQUOTED_SPECIAL: UErrorCode = 65555

public val U_UNSUPPORTED_ATTRIBUTE: UErrorCode = 65803

public val U_UNSUPPORTED_ERROR: UErrorCode = 16

public val U_UNSUPPORTED_ESCAPE_SEQUENCE: UErrorCode = 19

public val U_UNSUPPORTED_PROPERTY: UErrorCode = 65802

public val U_UNTERMINATED_QUOTE: UErrorCode = 65556

public val U_UPPERCASE_LETTER: UCharCategory = 1

public val U_USELESS_COLLATOR_ERROR: UErrorCode = 29

public val U_USING_DEFAULT_WARNING: UErrorCode = -127

public val U_USING_FALLBACK_WARNING: UErrorCode = -128

public val U_USING_ICU_NAMESPACE: UInt = 1u

public val U_VARIABLE_RANGE_EXHAUSTED: UErrorCode = 65565

public val U_VARIABLE_RANGE_OVERLAP: UErrorCode = 65566

public val U_VO_ROTATED: UVerticalOrientation = 0

public val U_VO_TRANSFORMED_ROTATED: UVerticalOrientation = 1

public val U_VO_TRANSFORMED_UPRIGHT: UVerticalOrientation = 2

public val U_VO_UPRIGHT: UVerticalOrientation = 3

public val U_WB_ALETTER: UWordBreakValues = 1

public val U_WB_CR: UWordBreakValues = 8

public val U_WB_DOUBLE_QUOTE: UWordBreakValues = 16

public val U_WB_EXTEND: UWordBreakValues = 9

public val U_WB_EXTENDNUMLET: UWordBreakValues = 7

public val U_WB_E_BASE: UWordBreakValues = 17

public val U_WB_E_BASE_GAZ: UWordBreakValues = 18

public val U_WB_E_MODIFIER: UWordBreakValues = 19

public val U_WB_FORMAT: UWordBreakValues = 2

public val U_WB_GLUE_AFTER_ZWJ: UWordBreakValues = 20

public val U_WB_HEBREW_LETTER: UWordBreakValues = 14

public val U_WB_KATAKANA: UWordBreakValues = 3

public val U_WB_LF: UWordBreakValues = 10

public val U_WB_MIDLETTER: UWordBreakValues = 4

public val U_WB_MIDNUM: UWordBreakValues = 5

public val U_WB_MIDNUMLET: UWordBreakValues = 11

public val U_WB_NEWLINE: UWordBreakValues = 12

public val U_WB_NUMERIC: UWordBreakValues = 6

public val U_WB_OTHER: UWordBreakValues = 0

public val U_WB_REGIONAL_INDICATOR: UWordBreakValues = 13

public val U_WB_SINGLE_QUOTE: UWordBreakValues = 15

public val U_WB_WSEGSPACE: UWordBreakValues = 22

public val U_WB_ZWJ: UWordBreakValues = 21

public val U_WHITE_SPACE_NEUTRAL: UCharDirection = 9

public val U_ZERO_ERROR: UErrorCode = 0

public val VS_ALLOW_LATIN: UInt = 1u

public val WC_COMPOSITECHECK: UInt = 512u

public val WC_DEFAULTCHAR: UInt = 64u

public val WC_DISCARDNS: UInt = 16u

public val WC_ERR_INVALID_CHARS: UInt = 128u

public val WC_NO_BEST_FIT_CHARS: UInt = 1024u

public val WC_SEPCHARS: UInt = 32u
