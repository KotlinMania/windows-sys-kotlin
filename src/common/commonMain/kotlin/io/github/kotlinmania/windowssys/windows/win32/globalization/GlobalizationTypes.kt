package io.github.kotlinmania.windowssys.windows.win32.globalization

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lparam

public typealias CaldatetimeDateunit = Int

public fun interface CalinfoEnumprocaFn {
    public operator fun invoke(param0: Pcstr): Bool
}

public typealias CalinfoEnumproca = CalinfoEnumprocaFn?

public fun interface CalinfoEnumprocexaFn {
    public operator fun invoke(param0: Pcstr, param1: UInt): Bool
}

public typealias CalinfoEnumprocexa = CalinfoEnumprocexaFn?

public fun interface CalinfoEnumprocexexFn {
    public operator fun invoke(param0: Pcwstr, param1: UInt, param2: Pcwstr, param3: Lparam): Bool
}

public typealias CalinfoEnumprocexex = CalinfoEnumprocexexFn?

public fun interface CalinfoEnumprocexwFn {
    public operator fun invoke(param0: Pcwstr, param1: UInt): Bool
}

public typealias CalinfoEnumprocexw = CalinfoEnumprocexwFn?

public fun interface CalinfoEnumprocwFn {
    public operator fun invoke(param0: Pcwstr): Bool
}

public typealias CalinfoEnumprocw = CalinfoEnumprocwFn?

public fun interface CodepageEnumprocaFn {
    public operator fun invoke(param0: Pcstr): Bool
}

public typealias CodepageEnumproca = CodepageEnumprocaFn?

public fun interface CodepageEnumprocwFn {
    public operator fun invoke(param0: Pcwstr): Bool
}

public typealias CodepageEnumprocw = CodepageEnumprocwFn?

public typealias ComparestringResult = Int

public typealias CompareStringFlags = UInt

public typealias CorrectiveAction = Int

public fun interface DatefmtEnumprocaFn {
    public operator fun invoke(param0: Pcstr): Bool
}

public typealias DatefmtEnumproca = DatefmtEnumprocaFn?

public fun interface DatefmtEnumprocexaFn {
    public operator fun invoke(param0: Pcstr, param1: UInt): Bool
}

public typealias DatefmtEnumprocexa = DatefmtEnumprocexaFn?

public fun interface DatefmtEnumprocexexFn {
    public operator fun invoke(param0: Pcwstr, param1: UInt, param2: Lparam): Bool
}

public typealias DatefmtEnumprocexex = DatefmtEnumprocexexFn?

public fun interface DatefmtEnumprocexwFn {
    public operator fun invoke(param0: Pcwstr, param1: UInt): Bool
}

public typealias DatefmtEnumprocexw = DatefmtEnumprocexwFn?

public fun interface DatefmtEnumprocwFn {
    public operator fun invoke(param0: Pcwstr): Bool
}

public typealias DatefmtEnumprocw = DatefmtEnumprocwFn?

public typealias EnumDateFormatsFlags = UInt

public typealias EnumSystemCodePagesFlags = UInt

public typealias EnumSystemLanguageGroupsFlags = UInt

public typealias FoldStringMapFlags = UInt

public fun interface GeoEnumnameprocFn {
    public operator fun invoke(param0: Pcwstr, param1: Lparam): Bool
}

public typealias GeoEnumnameproc = GeoEnumnameprocFn?

public fun interface GeoEnumprocFn {
    public operator fun invoke(param0: Int): Bool
}

public typealias GeoEnumproc = GeoEnumprocFn?

public typealias Hsaveduilanguages = COpaquePointer?

public typealias IsTextUnicodeResult = UInt

public typealias IsValidLocaleFlags = UInt

public fun interface LanggrouplocaleEnumprocaFn {
    public operator fun invoke(param0: UInt, param1: UInt, param2: Pcstr, param3: Long): Bool
}

public typealias LanggrouplocaleEnumproca = LanggrouplocaleEnumprocaFn?

public fun interface LanggrouplocaleEnumprocwFn {
    public operator fun invoke(param0: UInt, param1: UInt, param2: Pcwstr, param3: Long): Bool
}

public typealias LanggrouplocaleEnumprocw = LanggrouplocaleEnumprocwFn?

public fun interface LanguagegroupEnumprocaFn {
    public operator fun invoke(param0: UInt, param1: Pcstr, param2: Pcstr, param3: UInt, param4: Long): Bool
}

public typealias LanguagegroupEnumproca = LanguagegroupEnumprocaFn?

public fun interface LanguagegroupEnumprocwFn {
    public operator fun invoke(param0: UInt, param1: Pcwstr, param2: Pcwstr, param3: UInt, param4: Long): Bool
}

public typealias LanguagegroupEnumprocw = LanguagegroupEnumprocwFn?

public fun interface LocaleEnumprocaFn {
    public operator fun invoke(param0: Pcstr): Bool
}

public typealias LocaleEnumproca = LocaleEnumprocaFn?

public fun interface LocaleEnumprocexFn {
    public operator fun invoke(param0: Pcwstr, param1: UInt, param2: Lparam): Bool
}

public typealias LocaleEnumprocex = LocaleEnumprocexFn?

public fun interface LocaleEnumprocwFn {
    public operator fun invoke(param0: Pcwstr): Bool
}

public typealias LocaleEnumprocw = LocaleEnumprocwFn?

public typealias Mimecontf = Int

public typealias Mlconvchar = Int

public typealias Mlcp = Int

public typealias Mldetectcp = Int

public typealias MlstrFlags = Int

public typealias MultiByteToWideCharFlags = UInt

public typealias NormForm = Int

public fun interface PfnMappingcallbackprocFn {
    public operator fun invoke(pbag: COpaquePointer?, data: COpaquePointer?, dwdatasize: UInt, result: Hresult)
}

public typealias PfnMappingcallbackproc = PfnMappingcallbackprocFn?

public typealias Scriptcontf = Int

public typealias Scriptfontcontf = Int

public typealias ScriptIsComplexFlags = UInt

public typealias ScriptJustify = Int

public typealias Sysgeoclass = Int

public typealias Sysgeotype = Int

public typealias SysnlsFunction = Int

public fun interface TimefmtEnumprocaFn {
    public operator fun invoke(param0: Pcstr): Bool
}

public typealias TimefmtEnumproca = TimefmtEnumprocaFn?

public fun interface TimefmtEnumprocexFn {
    public operator fun invoke(param0: Pcwstr, param1: Lparam): Bool
}

public typealias TimefmtEnumprocex = TimefmtEnumprocexFn?

public fun interface TimefmtEnumprocwFn {
    public operator fun invoke(param0: Pcwstr): Bool
}

public typealias TimefmtEnumprocw = TimefmtEnumprocwFn?

public typealias TimeFormatFlags = UInt

public typealias TranslateCharsetInfoFlags = UInt

public typealias UAcceptResult = Int

public typealias UAlphabeticIndexLabelType = Int

public typealias UBiDi = Long

public fun interface UBiDiClassCallbackFn {
    public operator fun invoke(context: COpaquePointer?, c: Int): UCharDirection
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
    public operator fun invoke(context: COpaquePointer?, value: UInt): UInt
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
    public operator fun invoke(context: COpaquePointer?, start: Int, limit: Int, type: UCharCategory): Byte
}

public typealias UCharEnumTypeRange = UCharEnumTypeRangeFn?

public fun interface UCharIteratorCurrentFn {
    public operator fun invoke(iter: COpaquePointer?): Int
}

public typealias UCharIteratorCurrent = UCharIteratorCurrentFn?

public fun interface UCharIteratorGetIndexFn {
    public operator fun invoke(iter: COpaquePointer?, origin: UCharIteratorOrigin): Int
}

public typealias UCharIteratorGetIndex = UCharIteratorGetIndexFn?

public fun interface UCharIteratorGetStateFn {
    public operator fun invoke(iter: COpaquePointer?): UInt
}

public typealias UCharIteratorGetState = UCharIteratorGetStateFn?

public fun interface UCharIteratorHasNextFn {
    public operator fun invoke(iter: COpaquePointer?): Byte
}

public typealias UCharIteratorHasNext = UCharIteratorHasNextFn?

public fun interface UCharIteratorHasPreviousFn {
    public operator fun invoke(iter: COpaquePointer?): Byte
}

public typealias UCharIteratorHasPrevious = UCharIteratorHasPreviousFn?

public fun interface UCharIteratorMoveFn {
    public operator fun invoke(iter: COpaquePointer?, delta: Int, origin: UCharIteratorOrigin): Int
}

public typealias UCharIteratorMove = UCharIteratorMoveFn?

public fun interface UCharIteratorNextFn {
    public operator fun invoke(iter: COpaquePointer?): Int
}

public typealias UCharIteratorNext = UCharIteratorNextFn?

public typealias UCharIteratorOrigin = Int

public fun interface UCharIteratorPreviousFn {
    public operator fun invoke(iter: COpaquePointer?): Int
}

public typealias UCharIteratorPrevious = UCharIteratorPreviousFn?

public fun interface UCharIteratorReservedFn {
    public operator fun invoke(iter: COpaquePointer?, something: Int): Int
}

public typealias UCharIteratorReserved = UCharIteratorReservedFn?

public fun interface UCharIteratorSetStateFn {
    public operator fun invoke(iter: COpaquePointer?, state: UInt, perrorcode: COpaquePointer?)
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
    public operator fun invoke(context: COpaquePointer?, args: COpaquePointer?, codeunits: COpaquePointer?, length: Int, codepoint: Int, reason: UConverterCallbackReason, perrorcode: COpaquePointer?)
}

public typealias UConverterFromUCallback = UConverterFromUCallbackFn?

public typealias UConverterPlatform = Int

public typealias UConverterSelector = Long

public fun interface UConverterToUCallbackFn {
    public operator fun invoke(context: COpaquePointer?, args: COpaquePointer?, codeunits: Pcstr, length: Int, reason: UConverterCallbackReason, perrorcode: COpaquePointer?)
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
    public operator fun invoke(context: COpaquePointer?, code: Int, namechoice: UCharNameChoice, name: Pcstr, length: Int): Byte
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

public typealias Uidna = Long

public fun interface UilanguageEnumprocaFn {
    public operator fun invoke(param0: Pcstr, param1: Long): Bool
}

public typealias UilanguageEnumproca = UilanguageEnumprocaFn?

public fun interface UilanguageEnumprocwFn {
    public operator fun invoke(param0: Pcwstr, param1: Long): Bool
}

public typealias UilanguageEnumprocw = UilanguageEnumprocwFn?

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
    public operator fun invoke(context: COpaquePointer?, size: ULong): COpaquePointer?
}

public typealias UMemAllocFn = UMemAllocFnFn?

public fun interface UMemFreeFnFn {
    public operator fun invoke(context: COpaquePointer?, mem: COpaquePointer?)
}

public typealias UMemFreeFn = UMemFreeFnFn?

public fun interface UMemReallocFnFn {
    public operator fun invoke(context: COpaquePointer?, mem: COpaquePointer?, size: ULong): COpaquePointer?
}

public typealias UMemReallocFn = UMemReallocFnFn?

public typealias UMessagePatternApostropheMode = Int

public typealias UMessagePatternArgType = Int

public typealias UMessagePatternPartType = Int

public typealias UMutableCPTrie = Long

public fun interface UnescapeCharAtFn {
    public operator fun invoke(offset: Int, context: COpaquePointer?): UShort
}

public typealias UnescapeCharAt = UnescapeCharAtFn?

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
    public operator fun invoke(context: COpaquePointer?, matchindex: Long): Byte
}

public typealias URegexFindProgressCallback = URegexFindProgressCallbackFn?

public fun interface URegexMatchCallbackFn {
    public operator fun invoke(context: COpaquePointer?, steps: Int): Byte
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
    public operator fun invoke(csm: COpaquePointer?, dest: COpaquePointer?, destcapacity: Int, src: COpaquePointer?, srclength: Int, perrorcode: COpaquePointer?): Int
}

public typealias UStringCaseMapper = UStringCaseMapperFn?

public typealias UStringPrepProfile = Long

public typealias UStringPrepProfileType = Int

public typealias UStringSearch = Long

public typealias UStringTrieBuildOption = Int

public typealias UStringTrieResult = Int

public typealias USystemTimeZoneType = Int

public fun interface UTextAccessFn {
    public operator fun invoke(ut: COpaquePointer?, nativeindex: Long, forward: Byte): Byte
}

public typealias UTextAccess = UTextAccessFn?

public fun interface UTextCloneFn {
    public operator fun invoke(dest: COpaquePointer?, src: COpaquePointer?, deep: Byte, status: COpaquePointer?): COpaquePointer?
}

public typealias UTextClone = UTextCloneFn?

public fun interface UTextCloseFn {
    public operator fun invoke(ut: COpaquePointer?)
}

public typealias UTextClose = UTextCloseFn?

public fun interface UTextCopyFn {
    public operator fun invoke(ut: COpaquePointer?, nativestart: Long, nativelimit: Long, nativedest: Long, move: Byte, status: COpaquePointer?)
}

public typealias UTextCopy = UTextCopyFn?

public fun interface UTextExtractFn {
    public operator fun invoke(ut: COpaquePointer?, nativestart: Long, nativelimit: Long, dest: COpaquePointer?, destcapacity: Int, status: COpaquePointer?): Int
}

public typealias UTextExtract = UTextExtractFn?

public fun interface UTextMapNativeIndexToUTF16Fn {
    public operator fun invoke(ut: COpaquePointer?, nativeindex: Long): Int
}

public typealias UTextMapNativeIndexToUTF16 = UTextMapNativeIndexToUTF16Fn?

public fun interface UTextMapOffsetToNativeFn {
    public operator fun invoke(ut: COpaquePointer?): Long
}

public typealias UTextMapOffsetToNative = UTextMapOffsetToNativeFn?

public fun interface UTextNativeLengthFn {
    public operator fun invoke(ut: COpaquePointer?): Long
}

public typealias UTextNativeLength = UTextNativeLengthFn?

public fun interface UTextReplaceFn {
    public operator fun invoke(ut: COpaquePointer?, nativestart: Long, nativelimit: Long, replacementtext: COpaquePointer?, replacmentlength: Int, status: COpaquePointer?): Int
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
    public operator fun invoke(context: COpaquePointer?, fnnumber: Int, level: Int, fmt: Pcstr, args: COpaquePointer?)
}

public typealias UTraceData = UTraceDataFn?

public fun interface UTraceEntryFn {
    public operator fun invoke(context: COpaquePointer?, fnnumber: Int)
}

public typealias UTraceEntry = UTraceEntryFn?

public fun interface UTraceExitFn {
    public operator fun invoke(context: COpaquePointer?, fnnumber: Int, fmt: Pcstr, args: COpaquePointer?)
}

public typealias UTraceExit = UTraceExitFn?

public typealias UTraceFunctionNumber = Int

public typealias UTraceLevel = Int

public typealias UTransDirection = Int

public typealias UVerticalOrientation = Int

public typealias UWordBreak = Int

public typealias UWordBreakValues = Int

public typealias WordlistType = Int
