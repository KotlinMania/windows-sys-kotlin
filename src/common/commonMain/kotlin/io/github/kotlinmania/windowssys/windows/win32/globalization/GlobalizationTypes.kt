package io.github.kotlinmania.windowssys.windows.win32.globalization

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.LPARAM

public typealias CALDATETIME_DATEUNIT = Int

public fun interface CALINFO_ENUMPROCAFn {
    public operator fun invoke(param0: PCSTR): BOOL
}

public typealias CALINFO_ENUMPROCA = CALINFO_ENUMPROCAFn?

public fun interface CALINFO_ENUMPROCEXAFn {
    public operator fun invoke(param0: PCSTR, param1: UInt): BOOL
}

public typealias CALINFO_ENUMPROCEXA = CALINFO_ENUMPROCEXAFn?

public fun interface CALINFO_ENUMPROCEXEXFn {
    public operator fun invoke(param0: PCWSTR, param1: UInt, param2: PCWSTR, param3: LPARAM): BOOL
}

public typealias CALINFO_ENUMPROCEXEX = CALINFO_ENUMPROCEXEXFn?

public fun interface CALINFO_ENUMPROCEXWFn {
    public operator fun invoke(param0: PCWSTR, param1: UInt): BOOL
}

public typealias CALINFO_ENUMPROCEXW = CALINFO_ENUMPROCEXWFn?

public fun interface CALINFO_ENUMPROCWFn {
    public operator fun invoke(param0: PCWSTR): BOOL
}

public typealias CALINFO_ENUMPROCW = CALINFO_ENUMPROCWFn?

public fun interface CODEPAGE_ENUMPROCAFn {
    public operator fun invoke(param0: PCSTR): BOOL
}

public typealias CODEPAGE_ENUMPROCA = CODEPAGE_ENUMPROCAFn?

public fun interface CODEPAGE_ENUMPROCWFn {
    public operator fun invoke(param0: PCWSTR): BOOL
}

public typealias CODEPAGE_ENUMPROCW = CODEPAGE_ENUMPROCWFn?

public typealias COMPARESTRING_RESULT = Int

public typealias COMPARE_STRING_FLAGS = UInt

public typealias CORRECTIVE_ACTION = Int

public fun interface DATEFMT_ENUMPROCAFn {
    public operator fun invoke(param0: PCSTR): BOOL
}

public typealias DATEFMT_ENUMPROCA = DATEFMT_ENUMPROCAFn?

public fun interface DATEFMT_ENUMPROCEXAFn {
    public operator fun invoke(param0: PCSTR, param1: UInt): BOOL
}

public typealias DATEFMT_ENUMPROCEXA = DATEFMT_ENUMPROCEXAFn?

public fun interface DATEFMT_ENUMPROCEXEXFn {
    public operator fun invoke(param0: PCWSTR, param1: UInt, param2: LPARAM): BOOL
}

public typealias DATEFMT_ENUMPROCEXEX = DATEFMT_ENUMPROCEXEXFn?

public fun interface DATEFMT_ENUMPROCEXWFn {
    public operator fun invoke(param0: PCWSTR, param1: UInt): BOOL
}

public typealias DATEFMT_ENUMPROCEXW = DATEFMT_ENUMPROCEXWFn?

public fun interface DATEFMT_ENUMPROCWFn {
    public operator fun invoke(param0: PCWSTR): BOOL
}

public typealias DATEFMT_ENUMPROCW = DATEFMT_ENUMPROCWFn?

public typealias ENUM_DATE_FORMATS_FLAGS = UInt

public typealias ENUM_SYSTEM_CODE_PAGES_FLAGS = UInt

public typealias ENUM_SYSTEM_LANGUAGE_GROUPS_FLAGS = UInt

public typealias FOLD_STRING_MAP_FLAGS = UInt

public fun interface GEO_ENUMNAMEPROCFn {
    public operator fun invoke(param0: PCWSTR, param1: LPARAM): BOOL
}

public typealias GEO_ENUMNAMEPROC = GEO_ENUMNAMEPROCFn?

public fun interface GEO_ENUMPROCFn {
    public operator fun invoke(param0: Int): BOOL
}

public typealias GEO_ENUMPROC = GEO_ENUMPROCFn?

public typealias HSAVEDUILANGUAGES = Long

public typealias IS_TEXT_UNICODE_RESULT = UInt

public typealias IS_VALID_LOCALE_FLAGS = UInt

public fun interface LANGGROUPLOCALE_ENUMPROCAFn {
    public operator fun invoke(param0: UInt, param1: UInt, param2: PCSTR, param3: Long): BOOL
}

public typealias LANGGROUPLOCALE_ENUMPROCA = LANGGROUPLOCALE_ENUMPROCAFn?

public fun interface LANGGROUPLOCALE_ENUMPROCWFn {
    public operator fun invoke(param0: UInt, param1: UInt, param2: PCWSTR, param3: Long): BOOL
}

public typealias LANGGROUPLOCALE_ENUMPROCW = LANGGROUPLOCALE_ENUMPROCWFn?

public fun interface LANGUAGEGROUP_ENUMPROCAFn {
    public operator fun invoke(param0: UInt, param1: PCSTR, param2: PCSTR, param3: UInt, param4: Long): BOOL
}

public typealias LANGUAGEGROUP_ENUMPROCA = LANGUAGEGROUP_ENUMPROCAFn?

public fun interface LANGUAGEGROUP_ENUMPROCWFn {
    public operator fun invoke(param0: UInt, param1: PCWSTR, param2: PCWSTR, param3: UInt, param4: Long): BOOL
}

public typealias LANGUAGEGROUP_ENUMPROCW = LANGUAGEGROUP_ENUMPROCWFn?

public fun interface LOCALE_ENUMPROCAFn {
    public operator fun invoke(param0: PCSTR): BOOL
}

public typealias LOCALE_ENUMPROCA = LOCALE_ENUMPROCAFn?

public fun interface LOCALE_ENUMPROCEXFn {
    public operator fun invoke(param0: PCWSTR, param1: UInt, param2: LPARAM): BOOL
}

public typealias LOCALE_ENUMPROCEX = LOCALE_ENUMPROCEXFn?

public fun interface LOCALE_ENUMPROCWFn {
    public operator fun invoke(param0: PCWSTR): BOOL
}

public typealias LOCALE_ENUMPROCW = LOCALE_ENUMPROCWFn?

public typealias MIMECONTF = Int

public typealias MLCONVCHAR = Int

public typealias MLCP = Int

public typealias MLDETECTCP = Int

public typealias MLSTR_FLAGS = Int

public typealias MULTI_BYTE_TO_WIDE_CHAR_FLAGS = UInt

public typealias NORM_FORM = Int

public fun interface PFN_MAPPINGCALLBACKPROCFn {
    public operator fun invoke(pbag: Long, data: Long, dwdatasize: UInt, result: HRESULT)
}

public typealias PFN_MAPPINGCALLBACKPROC = PFN_MAPPINGCALLBACKPROCFn?

public typealias SCRIPTCONTF = Int

public typealias SCRIPTFONTCONTF = Int

public typealias SCRIPT_IS_COMPLEX_FLAGS = UInt

public typealias SCRIPT_JUSTIFY = Int

public typealias SYSGEOCLASS = Int

public typealias SYSGEOTYPE = Int

public typealias SYSNLS_FUNCTION = Int

public fun interface TIMEFMT_ENUMPROCAFn {
    public operator fun invoke(param0: PCSTR): BOOL
}

public typealias TIMEFMT_ENUMPROCA = TIMEFMT_ENUMPROCAFn?

public fun interface TIMEFMT_ENUMPROCEXFn {
    public operator fun invoke(param0: PCWSTR, param1: LPARAM): BOOL
}

public typealias TIMEFMT_ENUMPROCEX = TIMEFMT_ENUMPROCEXFn?

public fun interface TIMEFMT_ENUMPROCWFn {
    public operator fun invoke(param0: PCWSTR): BOOL
}

public typealias TIMEFMT_ENUMPROCW = TIMEFMT_ENUMPROCWFn?

public typealias TIME_FORMAT_FLAGS = UInt

public typealias TRANSLATE_CHARSET_INFO_FLAGS = UInt

public typealias UAcceptResult = Int

public typealias UAlphabeticIndexLabelType = Int

public typealias UBiDi = Long

public fun interface UBiDiClassCallbackFn {
    public operator fun invoke(context: Long, c: Int): UCharDirection
}

public typealias UBiDiClassCallback = UBiDiClassCallbackFn?

public typealias UBiDiDirection = Int

public typealias UBiDiMirroring = Int

public typealias UBiDiOrder = Int

public typealias UBiDiReorderingMode = Int

public typealias UBiDiReorderingOption = Int

public typealias UBiDiTransform = Long

public typealias UBidiPairedBracketType = Int

public typealias UBlockCode = Int

public typealias UBreakIterator = Long

public typealias UBreakIteratorType = Int

public typealias UCPMap = Long

public typealias UCPMapRangeOption = Int

public fun interface UCPMapValueFilterFn {
    public operator fun invoke(context: Long, value: UInt): UInt
}

public typealias UCPMapValueFilter = UCPMapValueFilterFn?

public typealias UCPTrieType = Int

public typealias UCPTrieValueWidth = Int

public typealias UCalendarAMPMs = Int

public typealias UCalendarAttribute = Int

public typealias UCalendarDateFields = Int

public typealias UCalendarDaysOfWeek = Int

public typealias UCalendarDisplayNameType = Int

public typealias UCalendarLimitType = Int

public typealias UCalendarMonths = Int

public typealias UCalendarType = Int

public typealias UCalendarWallTimeOption = Int

public typealias UCalendarWeekdayType = Int

public typealias UCaseMap = Long

public typealias UCharCategory = Int

public typealias UCharDirection = Int

public fun interface UCharEnumTypeRangeFn {
    public operator fun invoke(context: Long, start: Int, limit: Int, type: UCharCategory): Byte
}

public typealias UCharEnumTypeRange = UCharEnumTypeRangeFn?

public fun interface UCharIteratorCurrentFn {
    public operator fun invoke(iter: Long): Int
}

public typealias UCharIteratorCurrent = UCharIteratorCurrentFn?

public fun interface UCharIteratorGetIndexFn {
    public operator fun invoke(iter: Long, origin: UCharIteratorOrigin): Int
}

public typealias UCharIteratorGetIndex = UCharIteratorGetIndexFn?

public fun interface UCharIteratorGetStateFn {
    public operator fun invoke(iter: Long): UInt
}

public typealias UCharIteratorGetState = UCharIteratorGetStateFn?

public fun interface UCharIteratorHasNextFn {
    public operator fun invoke(iter: Long): Byte
}

public typealias UCharIteratorHasNext = UCharIteratorHasNextFn?

public fun interface UCharIteratorHasPreviousFn {
    public operator fun invoke(iter: Long): Byte
}

public typealias UCharIteratorHasPrevious = UCharIteratorHasPreviousFn?

public fun interface UCharIteratorMoveFn {
    public operator fun invoke(iter: Long, delta: Int, origin: UCharIteratorOrigin): Int
}

public typealias UCharIteratorMove = UCharIteratorMoveFn?

public fun interface UCharIteratorNextFn {
    public operator fun invoke(iter: Long): Int
}

public typealias UCharIteratorNext = UCharIteratorNextFn?

public typealias UCharIteratorOrigin = Int

public fun interface UCharIteratorPreviousFn {
    public operator fun invoke(iter: Long): Int
}

public typealias UCharIteratorPrevious = UCharIteratorPreviousFn?

public fun interface UCharIteratorReservedFn {
    public operator fun invoke(iter: Long, something: Int): Int
}

public typealias UCharIteratorReserved = UCharIteratorReservedFn?

public fun interface UCharIteratorSetStateFn {
    public operator fun invoke(iter: Long, state: UInt, perrorcode: Long)
}

public typealias UCharIteratorSetState = UCharIteratorSetStateFn?

public typealias UCharNameChoice = Int

public typealias UCharsetDetector = Long

public typealias UCharsetMatch = Long

public typealias UColAttribute = Int

public typealias UColAttributeValue = Int

public typealias UColBoundMode = Int

public typealias UColReorderCode = Int

public typealias UColRuleOption = Int

public typealias UCollationElements = Long

public typealias UCollationResult = Int

public typealias UCollator = Long

public typealias UConstrainedFieldPosition = Long

public typealias UConverter = Long

public typealias UConverterCallbackReason = Int

public fun interface UConverterFromUCallbackFn {
    public operator fun invoke(context: Long, args: Long, codeunits: Long, length: Int, codepoint: Int, reason: UConverterCallbackReason, perrorcode: Long)
}

public typealias UConverterFromUCallback = UConverterFromUCallbackFn?

public typealias UConverterPlatform = Int

public typealias UConverterSelector = Long

public fun interface UConverterToUCallbackFn {
    public operator fun invoke(context: Long, args: Long, codeunits: PCSTR, length: Int, reason: UConverterCallbackReason, perrorcode: Long)
}

public typealias UConverterToUCallback = UConverterToUCallbackFn?

public typealias UConverterType = Int

public typealias UConverterUnicodeSet = Int

public typealias UCurrCurrencyType = Int

public typealias UCurrNameStyle = Int

public typealias UCurrencySpacing = Int

public typealias UCurrencyUsage = Int

public typealias UDateAbsoluteUnit = Int

public typealias UDateDirection = Int

public typealias UDateFormatBooleanAttribute = Int

public typealias UDateFormatField = Int

public typealias UDateFormatStyle = Int

public typealias UDateFormatSymbolType = Int

public typealias UDateFormatSymbols = Long

public typealias UDateIntervalFormat = Long

public typealias UDateRelativeDateTimeFormatterStyle = Int

public typealias UDateRelativeUnit = Int

public typealias UDateTimePGDisplayWidth = Int

public typealias UDateTimePatternConflict = Int

public typealias UDateTimePatternField = Int

public typealias UDateTimePatternMatchOptions = Int

public typealias UDateTimeScale = Int

public typealias UDecompositionType = Int

public typealias UDialectHandling = Int

public typealias UDisplayContext = Int

public typealias UDisplayContextType = Int

public typealias UEastAsianWidth = Int

public fun interface UEnumCharNamesFnFn {
    public operator fun invoke(context: Long, code: Int, namechoice: UCharNameChoice, name: PCSTR, length: Int): Byte
}

public typealias UEnumCharNamesFn = UEnumCharNamesFnFn?

public typealias UEnumeration = Long

public typealias UErrorCode = Int

public typealias UFieldCategory = Int

public typealias UFieldPositionIterator = Long

public typealias UFormattableType = Int

public typealias UFormattedDateInterval = Long

public typealias UFormattedList = Long

public typealias UFormattedNumber = Long

public typealias UFormattedNumberRange = Long

public typealias UFormattedRelativeDateTime = Long

public typealias UFormattedValue = Long

public typealias UGender = Int

public typealias UGenderInfo = Long

public typealias UGraphemeClusterBreak = Int

public typealias UHangulSyllableType = Int

public typealias UHashtable = Long

public typealias UIDNA = Long

public fun interface UILANGUAGE_ENUMPROCAFn {
    public operator fun invoke(param0: PCSTR, param1: Long): BOOL
}

public typealias UILANGUAGE_ENUMPROCA = UILANGUAGE_ENUMPROCAFn?

public fun interface UILANGUAGE_ENUMPROCWFn {
    public operator fun invoke(param0: PCWSTR, param1: Long): BOOL
}

public typealias UILANGUAGE_ENUMPROCW = UILANGUAGE_ENUMPROCWFn?

public typealias UIndicPositionalCategory = Int

public typealias UIndicSyllabicCategory = Int

public typealias UJoiningGroup = Int

public typealias UJoiningType = Int

public typealias ULayoutType = Int

public typealias ULineBreak = Int

public typealias ULineBreakTag = Int

public typealias UListFormatter = Long

public typealias UListFormatterField = Int

public typealias UListFormatterType = Int

public typealias UListFormatterWidth = Int

public typealias ULocAvailableType = Int

public typealias ULocDataLocaleType = Int

public typealias ULocaleData = Long

public typealias ULocaleDataDelimiterType = Int

public typealias ULocaleDataExemplarSetType = Int

public typealias ULocaleDisplayNames = Long

public typealias UMeasureFormatWidth = Int

public typealias UMeasurementSystem = Int

public fun interface UMemAllocFnFn {
    public operator fun invoke(context: Long, size: ULong): Long
}

public typealias UMemAllocFn = UMemAllocFnFn?

public fun interface UMemFreeFnFn {
    public operator fun invoke(context: Long, mem: Long)
}

public typealias UMemFreeFn = UMemFreeFnFn?

public fun interface UMemReallocFnFn {
    public operator fun invoke(context: Long, mem: Long, size: ULong): Long
}

public typealias UMemReallocFn = UMemReallocFnFn?

public typealias UMessagePatternApostropheMode = Int

public typealias UMessagePatternArgType = Int

public typealias UMessagePatternPartType = Int

public typealias UMutableCPTrie = Long

public fun interface UNESCAPE_CHAR_ATFn {
    public operator fun invoke(offset: Int, context: Long): UShort
}

public typealias UNESCAPE_CHAR_AT = UNESCAPE_CHAR_ATFn?

public typealias UNormalization2Mode = Int

public typealias UNormalizationCheckResult = Int

public typealias UNormalizationMode = Int

public typealias UNormalizer2 = Long

public typealias UNumberCompactStyle = Int

public typealias UNumberDecimalSeparatorDisplay = Int

public typealias UNumberFormatAttribute = Int

public typealias UNumberFormatAttributeValue = Int

public typealias UNumberFormatFields = Int

public typealias UNumberFormatPadPosition = Int

public typealias UNumberFormatRoundingMode = Int

public typealias UNumberFormatStyle = Int

public typealias UNumberFormatSymbol = Int

public typealias UNumberFormatTextAttribute = Int

public typealias UNumberFormatter = Long

public typealias UNumberGroupingStrategy = Int

public typealias UNumberRangeCollapse = Int

public typealias UNumberRangeIdentityFallback = Int

public typealias UNumberRangeIdentityResult = Int

public typealias UNumberSignDisplay = Int

public typealias UNumberUnitWidth = Int

public typealias UNumberingSystem = Long

public typealias UNumericType = Int

public typealias UPluralRules = Long

public typealias UPluralType = Int

public typealias UProperty = Int

public typealias UPropertyNameChoice = Int

public fun interface URegexFindProgressCallbackFn {
    public operator fun invoke(context: Long, matchindex: Long): Byte
}

public typealias URegexFindProgressCallback = URegexFindProgressCallbackFn?

public fun interface URegexMatchCallbackFn {
    public operator fun invoke(context: Long, steps: Int): Byte
}

public typealias URegexMatchCallback = URegexMatchCallbackFn?

public typealias URegexpFlag = Int

public typealias URegion = Long

public typealias URegionType = Int

public typealias URegularExpression = Long

public typealias URelativeDateTimeFormatter = Long

public typealias URelativeDateTimeFormatterField = Int

public typealias URelativeDateTimeUnit = Int

public typealias UResType = Int

public typealias UResourceBundle = Long

public typealias URestrictionLevel = Int

public typealias UScriptCode = Int

public typealias UScriptUsage = Int

public typealias USearch = Long

public typealias USearchAttribute = Int

public typealias USearchAttributeValue = Int

public typealias USentenceBreak = Int

public typealias USentenceBreakTag = Int

public typealias USet = Long

public typealias USetSpanCondition = Int

public typealias USpoofCheckResult = Long

public typealias USpoofChecker = Long

public typealias USpoofChecks = Int

public fun interface UStringCaseMapperFn {
    public operator fun invoke(csm: Long, dest: Long, destcapacity: Int, src: Long, srclength: Int, perrorcode: Long): Int
}

public typealias UStringCaseMapper = UStringCaseMapperFn?

public typealias UStringPrepProfile = Long

public typealias UStringPrepProfileType = Int

public typealias UStringSearch = Long

public typealias UStringTrieBuildOption = Int

public typealias UStringTrieResult = Int

public typealias USystemTimeZoneType = Int

public fun interface UTextAccessFn {
    public operator fun invoke(ut: Long, nativeindex: Long, forward: Byte): Byte
}

public typealias UTextAccess = UTextAccessFn?

public fun interface UTextCloneFn {
    public operator fun invoke(dest: Long, src: Long, deep: Byte, status: Long): Long
}

public typealias UTextClone = UTextCloneFn?

public fun interface UTextCloseFn {
    public operator fun invoke(ut: Long)
}

public typealias UTextClose = UTextCloseFn?

public fun interface UTextCopyFn {
    public operator fun invoke(ut: Long, nativestart: Long, nativelimit: Long, nativedest: Long, move: Byte, status: Long)
}

public typealias UTextCopy = UTextCopyFn?

public fun interface UTextExtractFn {
    public operator fun invoke(ut: Long, nativestart: Long, nativelimit: Long, dest: Long, destcapacity: Int, status: Long): Int
}

public typealias UTextExtract = UTextExtractFn?

public fun interface UTextMapNativeIndexToUTF16Fn {
    public operator fun invoke(ut: Long, nativeindex: Long): Int
}

public typealias UTextMapNativeIndexToUTF16 = UTextMapNativeIndexToUTF16Fn?

public fun interface UTextMapOffsetToNativeFn {
    public operator fun invoke(ut: Long): Long
}

public typealias UTextMapOffsetToNative = UTextMapOffsetToNativeFn?

public fun interface UTextNativeLengthFn {
    public operator fun invoke(ut: Long): Long
}

public typealias UTextNativeLength = UTextNativeLengthFn?

public fun interface UTextReplaceFn {
    public operator fun invoke(ut: Long, nativestart: Long, nativelimit: Long, replacementtext: Long, replacmentlength: Int, status: Long): Int
}

public typealias UTextReplace = UTextReplaceFn?

public typealias UTimeScaleValue = Int

public typealias UTimeZoneFormatGMTOffsetPatternType = Int

public typealias UTimeZoneFormatParseOption = Int

public typealias UTimeZoneFormatStyle = Int

public typealias UTimeZoneFormatTimeType = Int

public typealias UTimeZoneNameType = Int

public typealias UTimeZoneTransitionType = Int

public fun interface UTraceDataFn {
    public operator fun invoke(context: Long, fnnumber: Int, level: Int, fmt: PCSTR, args: Long)
}

public typealias UTraceData = UTraceDataFn?

public fun interface UTraceEntryFn {
    public operator fun invoke(context: Long, fnnumber: Int)
}

public typealias UTraceEntry = UTraceEntryFn?

public fun interface UTraceExitFn {
    public operator fun invoke(context: Long, fnnumber: Int, fmt: PCSTR, args: Long)
}

public typealias UTraceExit = UTraceExitFn?

public typealias UTraceFunctionNumber = Int

public typealias UTraceLevel = Int

public typealias UTransDirection = Int

public typealias UVerticalOrientation = Int

public typealias UWordBreak = Int

public typealias UWordBreakValues = Int

public typealias WORDLIST_TYPE = Int
