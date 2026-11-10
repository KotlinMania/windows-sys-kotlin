package io.github.kotlinmania.windowssys.windows.win32.globalization

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Pcstr

public expect fun ucnvFromUcountPending(cnv: COpaquePointer?, status: COpaquePointer?): Int

public expect fun ucnvFromUnicode(converter: COpaquePointer?, target: COpaquePointer?, targetlimit: Pcstr, source: COpaquePointer?, sourcelimit: COpaquePointer?, offsets: COpaquePointer?, flush: Byte, err: COpaquePointer?)

public expect fun ucnvGetAlias(alias: Pcstr, n: UShort, perrorcode: COpaquePointer?): Pcstr

public expect fun ucnvGetAliases(alias: Pcstr, aliases: COpaquePointer?, perrorcode: COpaquePointer?)

public expect fun ucnvGetAvailableName(n: Int): Pcstr

public expect fun ucnvGetCcsid(converter: COpaquePointer?, err: COpaquePointer?): Int

public expect fun ucnvGetCanonicalName(alias: Pcstr, standard: Pcstr, perrorcode: COpaquePointer?): Pcstr

public expect fun ucnvGetDefaultName(): Pcstr

public expect fun ucnvGetDisplayName(converter: COpaquePointer?, displaylocale: Pcstr, displayname: COpaquePointer?, displaynamecapacity: Int, err: COpaquePointer?): Int

public expect fun ucnvGetFromUcallBack(converter: COpaquePointer?, action: COpaquePointer?, context: COpaquePointer?)

public expect fun ucnvGetInvalidChars(converter: COpaquePointer?, errbytes: Pcstr, len: COpaquePointer?, err: COpaquePointer?)

public expect fun ucnvGetInvalidUchars(converter: COpaquePointer?, erruchars: COpaquePointer?, len: COpaquePointer?, err: COpaquePointer?)

public expect fun ucnvGetMaxCharSize(converter: COpaquePointer?): Byte

public expect fun ucnvGetMinCharSize(converter: COpaquePointer?): Byte

public expect fun ucnvGetName(converter: COpaquePointer?, err: COpaquePointer?): Pcstr

public expect fun ucnvGetNextUchar(converter: COpaquePointer?, source: COpaquePointer?, sourcelimit: Pcstr, err: COpaquePointer?): Int

public expect fun ucnvGetPlatform(converter: COpaquePointer?, err: COpaquePointer?): UConverterPlatform

public expect fun ucnvGetStandard(n: UShort, perrorcode: COpaquePointer?): Pcstr

public expect fun ucnvGetStandardName(name: Pcstr, standard: Pcstr, perrorcode: COpaquePointer?): Pcstr

public expect fun ucnvGetStarters(converter: COpaquePointer?, starters: COpaquePointer?, err: COpaquePointer?)

public expect fun ucnvGetSubstChars(converter: COpaquePointer?, subchars: Pcstr, len: COpaquePointer?, err: COpaquePointer?)

public expect fun ucnvGetToUcallBack(converter: COpaquePointer?, action: COpaquePointer?, context: COpaquePointer?)

public expect fun ucnvGetType(converter: COpaquePointer?): UConverterType

public expect fun ucnvGetUnicodeSet(cnv: COpaquePointer?, setfillin: COpaquePointer?, whichset: UConverterUnicodeSet, perrorcode: COpaquePointer?)

public expect fun ucnvIsAmbiguous(cnv: COpaquePointer?): Byte

public expect fun ucnvIsFixedWidth(cnv: COpaquePointer?, status: COpaquePointer?): Byte

public expect fun ucnvOpen(convertername: Pcstr, err: COpaquePointer?): COpaquePointer?

public expect fun ucnvOpenAllNames(perrorcode: COpaquePointer?): COpaquePointer?

public expect fun ucnvOpenCcsid(codepage: Int, platform: UConverterPlatform, err: COpaquePointer?): COpaquePointer?

public expect fun ucnvOpenPackage(packagename: Pcstr, convertername: Pcstr, err: COpaquePointer?): COpaquePointer?

public expect fun ucnvOpenStandardNames(convname: Pcstr, standard: Pcstr, perrorcode: COpaquePointer?): COpaquePointer?

public expect fun ucnvOpenU(name: COpaquePointer?, err: COpaquePointer?): COpaquePointer?

public expect fun ucnvReset(converter: COpaquePointer?)

public expect fun ucnvResetFromUnicode(converter: COpaquePointer?)

public expect fun ucnvResetToUnicode(converter: COpaquePointer?)

public expect fun ucnvSafeClone(cnv: COpaquePointer?, stackbuffer: COpaquePointer?, pbuffersize: COpaquePointer?, status: COpaquePointer?): COpaquePointer?

public expect fun ucnvSetDefaultName(name: Pcstr)

public expect fun ucnvSetFallback(cnv: COpaquePointer?, usesfallback: Byte)

public expect fun ucnvSetFromUcallBack(converter: COpaquePointer?, newaction: UConverterFromUCallback, newcontext: COpaquePointer?, oldaction: COpaquePointer?, oldcontext: COpaquePointer?, err: COpaquePointer?)

public expect fun ucnvSetSubstChars(converter: COpaquePointer?, subchars: Pcstr, len: Byte, err: COpaquePointer?)

public expect fun ucnvSetSubstString(cnv: COpaquePointer?, s: COpaquePointer?, length: Int, err: COpaquePointer?)

public expect fun ucnvSetToUcallBack(converter: COpaquePointer?, newaction: UConverterToUCallback, newcontext: COpaquePointer?, oldaction: COpaquePointer?, oldcontext: COpaquePointer?, err: COpaquePointer?)

public expect fun ucnvToAlgorithmic(algorithmictype: UConverterType, cnv: COpaquePointer?, target: Pcstr, targetcapacity: Int, source: Pcstr, sourcelength: Int, perrorcode: COpaquePointer?): Int

public expect fun ucnvToUchars(cnv: COpaquePointer?, dest: COpaquePointer?, destcapacity: Int, src: Pcstr, srclength: Int, perrorcode: COpaquePointer?): Int

public expect fun ucnvToUcountPending(cnv: COpaquePointer?, status: COpaquePointer?): Int

public expect fun ucnvToUnicode(converter: COpaquePointer?, target: COpaquePointer?, targetlimit: COpaquePointer?, source: COpaquePointer?, sourcelimit: Pcstr, offsets: COpaquePointer?, flush: Byte, err: COpaquePointer?)

public expect fun ucnvUsesFallback(cnv: COpaquePointer?): Byte

public expect fun ucnvselClose(sel: COpaquePointer?)

public expect fun ucnvselOpen(converterlist: COpaquePointer?, converterlistsize: Int, excludedcodepoints: COpaquePointer?, whichset: UConverterUnicodeSet, status: COpaquePointer?): COpaquePointer?

public expect fun ucnvselOpenFromSerialized(buffer: COpaquePointer?, length: Int, status: COpaquePointer?): COpaquePointer?

public expect fun ucnvselSelectForString(sel: COpaquePointer?, s: COpaquePointer?, length: Int, status: COpaquePointer?): COpaquePointer?

public expect fun ucnvselSelectForUtf8(sel: COpaquePointer?, s: Pcstr, length: Int, status: COpaquePointer?): COpaquePointer?

public expect fun ucnvselSerialize(sel: COpaquePointer?, buffer: COpaquePointer?, buffercapacity: Int, status: COpaquePointer?): Int

public expect fun ucolCloneBinary(coll: COpaquePointer?, buffer: COpaquePointer?, capacity: Int, status: COpaquePointer?): Int

public expect fun ucolClose(coll: COpaquePointer?)

public expect fun ucolCloseElements(elems: COpaquePointer?)

public expect fun ucolCountAvailable(): Int

public expect fun ucolEqual(coll: COpaquePointer?, source: COpaquePointer?, sourcelength: Int, target: COpaquePointer?, targetlength: Int): Byte

public expect fun ucolGetAttribute(coll: COpaquePointer?, attr: UColAttribute, status: COpaquePointer?): UColAttributeValue

public expect fun ucolGetAvailable(localeindex: Int): Pcstr

public expect fun ucolGetBound(source: COpaquePointer?, sourcelength: Int, boundtype: UColBoundMode, nooflevels: UInt, result: COpaquePointer?, resultlength: Int, status: COpaquePointer?): Int

public expect fun ucolGetContractionsAndExpansions(coll: COpaquePointer?, contractions: COpaquePointer?, expansions: COpaquePointer?, addprefixes: Byte, status: COpaquePointer?)

public expect fun ucolGetDisplayName(objloc: Pcstr, disploc: Pcstr, result: COpaquePointer?, resultlength: Int, status: COpaquePointer?): Int

public expect fun ucolGetEquivalentReorderCodes(reordercode: Int, dest: COpaquePointer?, destcapacity: Int, perrorcode: COpaquePointer?): Int

public expect fun ucolGetFunctionalEquivalent(result: Pcstr, resultcapacity: Int, keyword: Pcstr, locale: Pcstr, isavailable: COpaquePointer?, status: COpaquePointer?): Int

public expect fun ucolGetKeywordValues(keyword: Pcstr, status: COpaquePointer?): COpaquePointer?

public expect fun ucolGetKeywordValuesForLocale(key: Pcstr, locale: Pcstr, commonlyused: Byte, status: COpaquePointer?): COpaquePointer?

public expect fun ucolGetKeywords(status: COpaquePointer?): COpaquePointer?

public expect fun ucolGetLocaleByType(coll: COpaquePointer?, type: ULocDataLocaleType, status: COpaquePointer?): Pcstr

public expect fun ucolGetMaxExpansion(elems: COpaquePointer?, order: Int): Int

public expect fun ucolGetMaxVariable(coll: COpaquePointer?): UColReorderCode

public expect fun ucolGetOffset(elems: COpaquePointer?): Int

public expect fun ucolGetReorderCodes(coll: COpaquePointer?, dest: COpaquePointer?, destcapacity: Int, perrorcode: COpaquePointer?): Int

public expect fun ucolGetRules(coll: COpaquePointer?, length: COpaquePointer?): COpaquePointer?

public expect fun ucolGetRulesEx(coll: COpaquePointer?, delta: UColRuleOption, buffer: COpaquePointer?, bufferlen: Int): Int

public expect fun ucolGetSortKey(coll: COpaquePointer?, source: COpaquePointer?, sourcelength: Int, result: COpaquePointer?, resultlength: Int): Int

public expect fun ucolGetStrength(coll: COpaquePointer?): UColAttributeValue

public expect fun ucolGetTailoredSet(coll: COpaquePointer?, status: COpaquePointer?): COpaquePointer?

public expect fun ucolGetUcaversion(coll: COpaquePointer?, info: COpaquePointer?)

public expect fun ucolGetVariableTop(coll: COpaquePointer?, status: COpaquePointer?): UInt

public expect fun ucolGetVersion(coll: COpaquePointer?, info: COpaquePointer?)

public expect fun ucolGreater(coll: COpaquePointer?, source: COpaquePointer?, sourcelength: Int, target: COpaquePointer?, targetlength: Int): Byte

public expect fun ucolGreaterOrEqual(coll: COpaquePointer?, source: COpaquePointer?, sourcelength: Int, target: COpaquePointer?, targetlength: Int): Byte

public expect fun ucolKeyHashCode(key: COpaquePointer?, length: Int): Int

public expect fun ucolMergeSortkeys(src1: COpaquePointer?, src1length: Int, src2: COpaquePointer?, src2length: Int, dest: COpaquePointer?, destcapacity: Int): Int

public expect fun ucolNext(elems: COpaquePointer?, status: COpaquePointer?): Int

public expect fun ucolNextSortKeyPart(coll: COpaquePointer?, iter: COpaquePointer?, state: COpaquePointer?, dest: COpaquePointer?, count: Int, status: COpaquePointer?): Int

public expect fun ucolOpen(loc: Pcstr, status: COpaquePointer?): COpaquePointer?

public expect fun ucolOpenAvailableLocales(status: COpaquePointer?): COpaquePointer?

public expect fun ucolOpenBinary(bin: COpaquePointer?, length: Int, base: COpaquePointer?, status: COpaquePointer?): COpaquePointer?

public expect fun ucolOpenElements(coll: COpaquePointer?, text: COpaquePointer?, textlength: Int, status: COpaquePointer?): COpaquePointer?

public expect fun ucolOpenRules(rules: COpaquePointer?, ruleslength: Int, normalizationmode: UColAttributeValue, strength: UColAttributeValue, parseerror: COpaquePointer?, status: COpaquePointer?): COpaquePointer?

public expect fun ucolPrevious(elems: COpaquePointer?, status: COpaquePointer?): Int

public expect fun ucolPrimaryOrder(order: Int): Int

public expect fun ucolReset(elems: COpaquePointer?)

public expect fun ucolSafeClone(coll: COpaquePointer?, stackbuffer: COpaquePointer?, pbuffersize: COpaquePointer?, status: COpaquePointer?): COpaquePointer?

public expect fun ucolSecondaryOrder(order: Int): Int

public expect fun ucolSetAttribute(coll: COpaquePointer?, attr: UColAttribute, value: UColAttributeValue, status: COpaquePointer?)

public expect fun ucolSetMaxVariable(coll: COpaquePointer?, group: UColReorderCode, perrorcode: COpaquePointer?)

public expect fun ucolSetOffset(elems: COpaquePointer?, offset: Int, status: COpaquePointer?)

public expect fun ucolSetReorderCodes(coll: COpaquePointer?, reordercodes: COpaquePointer?, reordercodeslength: Int, perrorcode: COpaquePointer?)

public expect fun ucolSetStrength(coll: COpaquePointer?, strength: UColAttributeValue)

public expect fun ucolSetText(elems: COpaquePointer?, text: COpaquePointer?, textlength: Int, status: COpaquePointer?)

public expect fun ucolStrcoll(coll: COpaquePointer?, source: COpaquePointer?, sourcelength: Int, target: COpaquePointer?, targetlength: Int): UCollationResult

public expect fun ucolStrcollIter(coll: COpaquePointer?, siter: COpaquePointer?, titer: COpaquePointer?, status: COpaquePointer?): UCollationResult

public expect fun ucolStrcollUtf8(coll: COpaquePointer?, source: Pcstr, sourcelength: Int, target: Pcstr, targetlength: Int, status: COpaquePointer?): UCollationResult

public expect fun ucolTertiaryOrder(order: Int): Int

public expect fun ucpmapGet(map: COpaquePointer?, c: Int): UInt

public expect fun ucpmapGetRange(map: COpaquePointer?, start: Int, option: UCPMapRangeOption, surrogatevalue: UInt, filter: COpaquePointer?, context: COpaquePointer?, pvalue: COpaquePointer?): Int

public expect fun ucptrieClose(trie: COpaquePointer?)

public expect fun ucptrieGet(trie: COpaquePointer?, c: Int): UInt

public expect fun ucptrieGetRange(trie: COpaquePointer?, start: Int, option: UCPMapRangeOption, surrogatevalue: UInt, filter: COpaquePointer?, context: COpaquePointer?, pvalue: COpaquePointer?): Int

public expect fun ucptrieGetType(trie: COpaquePointer?): UCPTrieType

public expect fun ucptrieGetValueWidth(trie: COpaquePointer?): UCPTrieValueWidth

public expect fun ucptrieInternalSmallIndex(trie: COpaquePointer?, c: Int): Int

public expect fun ucptrieInternalSmallU8Index(trie: COpaquePointer?, lt1: Int, t2: UByte, t3: UByte): Int

public expect fun ucptrieInternalU8PrevIndex(trie: COpaquePointer?, c: Int, start: COpaquePointer?, src: COpaquePointer?): Int

public expect fun ucptrieOpenFromBinary(type: UCPTrieType, valuewidth: UCPTrieValueWidth, data: COpaquePointer?, length: Int, pactuallength: COpaquePointer?, perrorcode: COpaquePointer?): COpaquePointer?

public expect fun ucptrieToBinary(trie: COpaquePointer?, data: COpaquePointer?, capacity: Int, perrorcode: COpaquePointer?): Int

public expect fun ucsdetClose(ucsd: COpaquePointer?)

public expect fun ucsdetDetect(ucsd: COpaquePointer?, status: COpaquePointer?): COpaquePointer?

public expect fun ucsdetDetectAll(ucsd: COpaquePointer?, matchesfound: COpaquePointer?, status: COpaquePointer?): COpaquePointer?

public expect fun ucsdetEnableInputFilter(ucsd: COpaquePointer?, filter: Byte): Byte

public expect fun ucsdetGetAllDetectableCharsets(ucsd: COpaquePointer?, status: COpaquePointer?): COpaquePointer?

public expect fun ucsdetGetConfidence(ucsm: COpaquePointer?, status: COpaquePointer?): Int

public expect fun ucsdetGetLanguage(ucsm: COpaquePointer?, status: COpaquePointer?): Pcstr

public expect fun ucsdetGetName(ucsm: COpaquePointer?, status: COpaquePointer?): Pcstr

public expect fun ucsdetGetUchars(ucsm: COpaquePointer?, buf: COpaquePointer?, cap: Int, status: COpaquePointer?): Int

public expect fun ucsdetIsInputFilterEnabled(ucsd: COpaquePointer?): Byte

public expect fun ucsdetOpen(status: COpaquePointer?): COpaquePointer?

public expect fun ucsdetSetDeclaredEncoding(ucsd: COpaquePointer?, encoding: Pcstr, length: Int, status: COpaquePointer?)

public expect fun ucsdetSetText(ucsd: COpaquePointer?, textin: Pcstr, len: Int, status: COpaquePointer?)

public expect fun ucurrCountCurrencies(locale: Pcstr, date: Double, ec: COpaquePointer?): Int

public expect fun ucurrForLocale(locale: Pcstr, buff: COpaquePointer?, buffcapacity: Int, ec: COpaquePointer?): Int

public expect fun ucurrForLocaleAndDate(locale: Pcstr, date: Double, index: Int, buff: COpaquePointer?, buffcapacity: Int, ec: COpaquePointer?): Int

public expect fun ucurrGetDefaultFractionDigits(currency: COpaquePointer?, ec: COpaquePointer?): Int

public expect fun ucurrGetDefaultFractionDigitsForUsage(currency: COpaquePointer?, usage: UCurrencyUsage, ec: COpaquePointer?): Int

public expect fun ucurrGetKeywordValuesForLocale(key: Pcstr, locale: Pcstr, commonlyused: Byte, status: COpaquePointer?): COpaquePointer?

public expect fun ucurrGetName(currency: COpaquePointer?, locale: Pcstr, namestyle: UCurrNameStyle, ischoiceformat: COpaquePointer?, len: COpaquePointer?, ec: COpaquePointer?): COpaquePointer?

public expect fun ucurrGetNumericCode(currency: COpaquePointer?): Int

public expect fun ucurrGetPluralName(currency: COpaquePointer?, locale: Pcstr, ischoiceformat: COpaquePointer?, pluralcount: Pcstr, len: COpaquePointer?, ec: COpaquePointer?): COpaquePointer?

public expect fun ucurrGetRoundingIncrement(currency: COpaquePointer?, ec: COpaquePointer?): Double

public expect fun ucurrGetRoundingIncrementForUsage(currency: COpaquePointer?, usage: UCurrencyUsage, ec: COpaquePointer?): Double

public expect fun ucurrIsAvailable(isocode: COpaquePointer?, from: Double, to: Double, errorcode: COpaquePointer?): Byte

public expect fun ucurrOpenIsocurrencies(currtype: UInt, perrorcode: COpaquePointer?): COpaquePointer?

public expect fun ucurrRegister(isocode: COpaquePointer?, locale: Pcstr, status: COpaquePointer?): COpaquePointer?

public expect fun ucurrUnregister(key: COpaquePointer?, status: COpaquePointer?): Byte

public expect fun udatAdoptNumberFormat(fmt: COpaquePointer?, numberformattoadopt: COpaquePointer?)

public expect fun udatAdoptNumberFormatForFields(fmt: COpaquePointer?, fields: COpaquePointer?, numberformattoset: COpaquePointer?, status: COpaquePointer?)

public expect fun udatApplyPattern(format: COpaquePointer?, localized: Byte, pattern: COpaquePointer?, patternlength: Int)

public expect fun udatClone(fmt: COpaquePointer?, status: COpaquePointer?): COpaquePointer?

public expect fun udatClose(format: COpaquePointer?)

public expect fun udatCountAvailable(): Int

public expect fun udatCountSymbols(fmt: COpaquePointer?, type: UDateFormatSymbolType): Int

public expect fun udatFormat(format: COpaquePointer?, datetoformat: Double, result: COpaquePointer?, resultlength: Int, position: COpaquePointer?, status: COpaquePointer?): Int

public expect fun udatFormatCalendar(format: COpaquePointer?, calendar: COpaquePointer?, result: COpaquePointer?, capacity: Int, position: COpaquePointer?, status: COpaquePointer?): Int

public expect fun udatFormatCalendarForFields(format: COpaquePointer?, calendar: COpaquePointer?, result: COpaquePointer?, capacity: Int, fpositer: COpaquePointer?, status: COpaquePointer?): Int

public expect fun udatFormatForFields(format: COpaquePointer?, datetoformat: Double, result: COpaquePointer?, resultlength: Int, fpositer: COpaquePointer?, status: COpaquePointer?): Int

public expect fun udatGet2DigitYearStart(fmt: COpaquePointer?, status: COpaquePointer?): Double

public expect fun udatGetAvailable(localeindex: Int): Pcstr

public expect fun udatGetBooleanAttribute(fmt: COpaquePointer?, attr: UDateFormatBooleanAttribute, status: COpaquePointer?): Byte

public expect fun udatGetCalendar(fmt: COpaquePointer?): COpaquePointer?

public expect fun udatGetContext(fmt: COpaquePointer?, type: UDisplayContextType, status: COpaquePointer?): UDisplayContext

public expect fun udatGetLocaleByType(fmt: COpaquePointer?, type: ULocDataLocaleType, status: COpaquePointer?): Pcstr

public expect fun udatGetNumberFormat(fmt: COpaquePointer?): COpaquePointer?

public expect fun udatGetNumberFormatForField(fmt: COpaquePointer?, field: UShort): COpaquePointer?

public expect fun udatGetSymbols(fmt: COpaquePointer?, type: UDateFormatSymbolType, symbolindex: Int, result: COpaquePointer?, resultlength: Int, status: COpaquePointer?): Int

public expect fun udatIsLenient(fmt: COpaquePointer?): Byte

public expect fun udatOpen(timestyle: UDateFormatStyle, datestyle: UDateFormatStyle, locale: Pcstr, tzid: COpaquePointer?, tzidlength: Int, pattern: COpaquePointer?, patternlength: Int, status: COpaquePointer?): COpaquePointer?

public expect fun udatParse(format: COpaquePointer?, text: COpaquePointer?, textlength: Int, parsepos: COpaquePointer?, status: COpaquePointer?): Double

public expect fun udatParseCalendar(format: COpaquePointer?, calendar: COpaquePointer?, text: COpaquePointer?, textlength: Int, parsepos: COpaquePointer?, status: COpaquePointer?)

public expect fun udatSet2DigitYearStart(fmt: COpaquePointer?, d: Double, status: COpaquePointer?)

public expect fun udatSetBooleanAttribute(fmt: COpaquePointer?, attr: UDateFormatBooleanAttribute, newvalue: Byte, status: COpaquePointer?)

public expect fun udatSetCalendar(fmt: COpaquePointer?, calendartoset: COpaquePointer?)

public expect fun udatSetContext(fmt: COpaquePointer?, value: UDisplayContext, status: COpaquePointer?)

public expect fun udatSetLenient(fmt: COpaquePointer?, islenient: Byte)

public expect fun udatSetNumberFormat(fmt: COpaquePointer?, numberformattoset: COpaquePointer?)

public expect fun udatSetSymbols(format: COpaquePointer?, type: UDateFormatSymbolType, symbolindex: Int, value: COpaquePointer?, valuelength: Int, status: COpaquePointer?)

public expect fun udatToCalendarDateField(field: UDateFormatField): UCalendarDateFields

public expect fun udatToPattern(fmt: COpaquePointer?, localized: Byte, result: COpaquePointer?, resultlength: Int, status: COpaquePointer?): Int

public expect fun udatpgAddPattern(dtpg: COpaquePointer?, pattern: COpaquePointer?, patternlength: Int, override: Byte, conflictingpattern: COpaquePointer?, capacity: Int, plength: COpaquePointer?, perrorcode: COpaquePointer?): UDateTimePatternConflict

public expect fun udatpgClone(dtpg: COpaquePointer?, perrorcode: COpaquePointer?): COpaquePointer?

public expect fun udatpgClose(dtpg: COpaquePointer?)

public expect fun udatpgGetAppendItemFormat(dtpg: COpaquePointer?, field: UDateTimePatternField, plength: COpaquePointer?): COpaquePointer?

public expect fun udatpgGetAppendItemName(dtpg: COpaquePointer?, field: UDateTimePatternField, plength: COpaquePointer?): COpaquePointer?

public expect fun udatpgGetBaseSkeleton(unuseddtpg: COpaquePointer?, pattern: COpaquePointer?, length: Int, baseskeleton: COpaquePointer?, capacity: Int, perrorcode: COpaquePointer?): Int

public expect fun udatpgGetBestPattern(dtpg: COpaquePointer?, skeleton: COpaquePointer?, length: Int, bestpattern: COpaquePointer?, capacity: Int, perrorcode: COpaquePointer?): Int

public expect fun udatpgGetBestPatternWithOptions(dtpg: COpaquePointer?, skeleton: COpaquePointer?, length: Int, options: UDateTimePatternMatchOptions, bestpattern: COpaquePointer?, capacity: Int, perrorcode: COpaquePointer?): Int

public expect fun udatpgGetDateTimeFormat(dtpg: COpaquePointer?, plength: COpaquePointer?): COpaquePointer?

public expect fun udatpgGetDecimal(dtpg: COpaquePointer?, plength: COpaquePointer?): COpaquePointer?

public expect fun udatpgGetFieldDisplayName(dtpg: COpaquePointer?, field: UDateTimePatternField, width: UDateTimePGDisplayWidth, fieldname: COpaquePointer?, capacity: Int, perrorcode: COpaquePointer?): Int

public expect fun udatpgGetPatternForSkeleton(dtpg: COpaquePointer?, skeleton: COpaquePointer?, skeletonlength: Int, plength: COpaquePointer?): COpaquePointer?

public expect fun udatpgGetSkeleton(unuseddtpg: COpaquePointer?, pattern: COpaquePointer?, length: Int, skeleton: COpaquePointer?, capacity: Int, perrorcode: COpaquePointer?): Int

public expect fun udatpgOpen(locale: Pcstr, perrorcode: COpaquePointer?): COpaquePointer?

public expect fun udatpgOpenBaseSkeletons(dtpg: COpaquePointer?, perrorcode: COpaquePointer?): COpaquePointer?

public expect fun udatpgOpenEmpty(perrorcode: COpaquePointer?): COpaquePointer?

public expect fun udatpgOpenSkeletons(dtpg: COpaquePointer?, perrorcode: COpaquePointer?): COpaquePointer?

public expect fun udatpgReplaceFieldTypes(dtpg: COpaquePointer?, pattern: COpaquePointer?, patternlength: Int, skeleton: COpaquePointer?, skeletonlength: Int, dest: COpaquePointer?, destcapacity: Int, perrorcode: COpaquePointer?): Int

public expect fun udatpgReplaceFieldTypesWithOptions(dtpg: COpaquePointer?, pattern: COpaquePointer?, patternlength: Int, skeleton: COpaquePointer?, skeletonlength: Int, options: UDateTimePatternMatchOptions, dest: COpaquePointer?, destcapacity: Int, perrorcode: COpaquePointer?): Int

public expect fun udatpgSetAppendItemFormat(dtpg: COpaquePointer?, field: UDateTimePatternField, value: COpaquePointer?, length: Int)

public expect fun udatpgSetAppendItemName(dtpg: COpaquePointer?, field: UDateTimePatternField, value: COpaquePointer?, length: Int)

public expect fun udatpgSetDateTimeFormat(dtpg: COpaquePointer?, dtformat: COpaquePointer?, length: Int)

public expect fun udatpgSetDecimal(dtpg: COpaquePointer?, decimal: COpaquePointer?, length: Int)

public expect fun udtitvfmtClose(formatter: COpaquePointer?)

public expect fun udtitvfmtCloseResult(uresult: COpaquePointer?)

public expect fun udtitvfmtFormat(formatter: COpaquePointer?, fromdate: Double, todate: Double, result: COpaquePointer?, resultcapacity: Int, position: COpaquePointer?, status: COpaquePointer?): Int

public expect fun udtitvfmtOpen(locale: Pcstr, skeleton: COpaquePointer?, skeletonlength: Int, tzid: COpaquePointer?, tzidlength: Int, status: COpaquePointer?): COpaquePointer?

public expect fun udtitvfmtOpenResult(ec: COpaquePointer?): COpaquePointer?

public expect fun udtitvfmtResultAsValue(uresult: COpaquePointer?, ec: COpaquePointer?): COpaquePointer?

public expect fun uenumClose(en: COpaquePointer?)

public expect fun uenumCount(en: COpaquePointer?, status: COpaquePointer?): Int

public expect fun uenumNext(en: COpaquePointer?, resultlength: COpaquePointer?, status: COpaquePointer?): Pcstr

public expect fun uenumOpenCharStringsEnumeration(strings: COpaquePointer?, count: Int, ec: COpaquePointer?): COpaquePointer?

public expect fun uenumOpenUcharStringsEnumeration(strings: COpaquePointer?, count: Int, ec: COpaquePointer?): COpaquePointer?

public expect fun uenumReset(en: COpaquePointer?, status: COpaquePointer?)

public expect fun uenumUnext(en: COpaquePointer?, resultlength: COpaquePointer?, status: COpaquePointer?): COpaquePointer?

public expect fun ufieldpositerClose(fpositer: COpaquePointer?)

public expect fun ufieldpositerNext(fpositer: COpaquePointer?, beginindex: COpaquePointer?, endindex: COpaquePointer?): Int

public expect fun ufieldpositerOpen(status: COpaquePointer?): COpaquePointer?

public expect fun ufmtClose(fmt: COpaquePointer?)

public expect fun ufmtGetArrayItemByIndex(fmt: COpaquePointer?, n: Int, status: COpaquePointer?): COpaquePointer?

public expect fun ufmtGetArrayLength(fmt: COpaquePointer?, status: COpaquePointer?): Int

public expect fun ufmtGetDate(fmt: COpaquePointer?, status: COpaquePointer?): Double

public expect fun ufmtGetDecNumChars(fmt: COpaquePointer?, len: COpaquePointer?, status: COpaquePointer?): Pcstr

public expect fun ufmtGetDouble(fmt: COpaquePointer?, status: COpaquePointer?): Double

public expect fun ufmtGetInt64(fmt: COpaquePointer?, status: COpaquePointer?): Long

public expect fun ufmtGetLong(fmt: COpaquePointer?, status: COpaquePointer?): Int

public expect fun ufmtGetObject(fmt: COpaquePointer?, status: COpaquePointer?): COpaquePointer?

public expect fun ufmtGetType(fmt: COpaquePointer?, status: COpaquePointer?): UFormattableType

public expect fun ufmtGetUchars(fmt: COpaquePointer?, len: COpaquePointer?, status: COpaquePointer?): COpaquePointer?

public expect fun ufmtIsNumeric(fmt: COpaquePointer?): Byte

public expect fun ufmtOpen(status: COpaquePointer?): COpaquePointer?

public expect fun ufmtvalGetString(ufmtval: COpaquePointer?, plength: COpaquePointer?, ec: COpaquePointer?): COpaquePointer?

public expect fun ufmtvalNextPosition(ufmtval: COpaquePointer?, ucfpos: COpaquePointer?, ec: COpaquePointer?): Byte

public expect fun ugenderGetInstance(locale: Pcstr, status: COpaquePointer?): COpaquePointer?

public expect fun ugenderGetListGender(genderinfo: COpaquePointer?, genders: COpaquePointer?, size: Int, status: COpaquePointer?): UGender

public expect fun uidnaClose(idna: COpaquePointer?)

public expect fun uidnaLabelToAscii(idna: COpaquePointer?, label: COpaquePointer?, length: Int, dest: COpaquePointer?, capacity: Int, pinfo: COpaquePointer?, perrorcode: COpaquePointer?): Int

public expect fun uidnaLabelToAsciiUtf8(idna: COpaquePointer?, label: Pcstr, length: Int, dest: Pcstr, capacity: Int, pinfo: COpaquePointer?, perrorcode: COpaquePointer?): Int

public expect fun uidnaLabelToUnicode(idna: COpaquePointer?, label: COpaquePointer?, length: Int, dest: COpaquePointer?, capacity: Int, pinfo: COpaquePointer?, perrorcode: COpaquePointer?): Int

public expect fun uidnaLabelToUnicodeUtf8(idna: COpaquePointer?, label: Pcstr, length: Int, dest: Pcstr, capacity: Int, pinfo: COpaquePointer?, perrorcode: COpaquePointer?): Int

public expect fun uidnaNameToAscii(idna: COpaquePointer?, name: COpaquePointer?, length: Int, dest: COpaquePointer?, capacity: Int, pinfo: COpaquePointer?, perrorcode: COpaquePointer?): Int

public expect fun uidnaNameToAsciiUtf8(idna: COpaquePointer?, name: Pcstr, length: Int, dest: Pcstr, capacity: Int, pinfo: COpaquePointer?, perrorcode: COpaquePointer?): Int

public expect fun uidnaNameToUnicode(idna: COpaquePointer?, name: COpaquePointer?, length: Int, dest: COpaquePointer?, capacity: Int, pinfo: COpaquePointer?, perrorcode: COpaquePointer?): Int

public expect fun uidnaNameToUnicodeUtf8(idna: COpaquePointer?, name: Pcstr, length: Int, dest: Pcstr, capacity: Int, pinfo: COpaquePointer?, perrorcode: COpaquePointer?): Int

public expect fun uidnaOpenUts46(options: UInt, perrorcode: COpaquePointer?): COpaquePointer?

public expect fun uiterCurrent32(iter: COpaquePointer?): Int

public expect fun uiterGetState(iter: COpaquePointer?): UInt

public expect fun uiterNext32(iter: COpaquePointer?): Int

public expect fun uiterPrevious32(iter: COpaquePointer?): Int

public expect fun uiterSetState(iter: COpaquePointer?, state: UInt, perrorcode: COpaquePointer?)

public expect fun uiterSetString(iter: COpaquePointer?, s: COpaquePointer?, length: Int)

public expect fun uiterSetUtf16Be(iter: COpaquePointer?, s: Pcstr, length: Int)

public expect fun uiterSetUtf8(iter: COpaquePointer?, s: Pcstr, length: Int)

public expect fun uldnClose(ldn: COpaquePointer?)

public expect fun uldnGetContext(ldn: COpaquePointer?, type: UDisplayContextType, perrorcode: COpaquePointer?): UDisplayContext

public expect fun uldnGetDialectHandling(ldn: COpaquePointer?): UDialectHandling

public expect fun uldnGetLocale(ldn: COpaquePointer?): Pcstr

public expect fun uldnKeyDisplayName(ldn: COpaquePointer?, key: Pcstr, result: COpaquePointer?, maxresultsize: Int, perrorcode: COpaquePointer?): Int

public expect fun uldnKeyValueDisplayName(ldn: COpaquePointer?, key: Pcstr, value: Pcstr, result: COpaquePointer?, maxresultsize: Int, perrorcode: COpaquePointer?): Int

public expect fun uldnLanguageDisplayName(ldn: COpaquePointer?, lang: Pcstr, result: COpaquePointer?, maxresultsize: Int, perrorcode: COpaquePointer?): Int

public expect fun uldnLocaleDisplayName(ldn: COpaquePointer?, locale: Pcstr, result: COpaquePointer?, maxresultsize: Int, perrorcode: COpaquePointer?): Int

public expect fun uldnOpen(locale: Pcstr, dialecthandling: UDialectHandling, perrorcode: COpaquePointer?): COpaquePointer?

public expect fun uldnOpenForContext(locale: Pcstr, contexts: COpaquePointer?, length: Int, perrorcode: COpaquePointer?): COpaquePointer?

public expect fun uldnRegionDisplayName(ldn: COpaquePointer?, region: Pcstr, result: COpaquePointer?, maxresultsize: Int, perrorcode: COpaquePointer?): Int

public expect fun uldnScriptCodeDisplayName(ldn: COpaquePointer?, scriptcode: UScriptCode, result: COpaquePointer?, maxresultsize: Int, perrorcode: COpaquePointer?): Int

public expect fun uldnScriptDisplayName(ldn: COpaquePointer?, script: Pcstr, result: COpaquePointer?, maxresultsize: Int, perrorcode: COpaquePointer?): Int

public expect fun uldnVariantDisplayName(ldn: COpaquePointer?, variant: Pcstr, result: COpaquePointer?, maxresultsize: Int, perrorcode: COpaquePointer?): Int

public expect fun ulistfmtClose(listfmt: COpaquePointer?)

public expect fun ulistfmtCloseResult(uresult: COpaquePointer?)

public expect fun ulistfmtFormat(listfmt: COpaquePointer?, strings: COpaquePointer?, stringlengths: COpaquePointer?, stringcount: Int, result: COpaquePointer?, resultcapacity: Int, status: COpaquePointer?): Int

public expect fun ulistfmtFormatStringsToResult(listfmt: COpaquePointer?, strings: COpaquePointer?, stringlengths: COpaquePointer?, stringcount: Int, uresult: COpaquePointer?, status: COpaquePointer?)

public expect fun ulistfmtOpen(locale: Pcstr, status: COpaquePointer?): COpaquePointer?

public expect fun ulistfmtOpenForType(locale: Pcstr, type: UListFormatterType, width: UListFormatterWidth, status: COpaquePointer?): COpaquePointer?

public expect fun ulistfmtOpenResult(ec: COpaquePointer?): COpaquePointer?

public expect fun ulistfmtResultAsValue(uresult: COpaquePointer?, ec: COpaquePointer?): COpaquePointer?

public expect fun ulocAcceptLanguage(result: Pcstr, resultavailable: Int, outresult: COpaquePointer?, acceptlist: COpaquePointer?, acceptlistcount: Int, availablelocales: COpaquePointer?, status: COpaquePointer?): Int

public expect fun ulocAcceptLanguageFromHttp(result: Pcstr, resultavailable: Int, outresult: COpaquePointer?, httpacceptlanguage: Pcstr, availablelocales: COpaquePointer?, status: COpaquePointer?): Int

public expect fun ulocAddLikelySubtags(localeid: Pcstr, maximizedlocaleid: Pcstr, maximizedlocaleidcapacity: Int, err: COpaquePointer?): Int

public expect fun ulocCanonicalize(localeid: Pcstr, name: Pcstr, namecapacity: Int, err: COpaquePointer?): Int

public expect fun ulocCountAvailable(): Int

public expect fun ulocForLanguageTag(langtag: Pcstr, localeid: Pcstr, localeidcapacity: Int, parsedlength: COpaquePointer?, err: COpaquePointer?): Int

public expect fun ulocGetAvailable(n: Int): Pcstr

public expect fun ulocGetBaseName(localeid: Pcstr, name: Pcstr, namecapacity: Int, err: COpaquePointer?): Int

public expect fun ulocGetCharacterOrientation(localeid: Pcstr, status: COpaquePointer?): ULayoutType

public expect fun ulocGetCountry(localeid: Pcstr, country: Pcstr, countrycapacity: Int, err: COpaquePointer?): Int

public expect fun ulocGetDefault(): Pcstr

public expect fun ulocGetDisplayCountry(locale: Pcstr, displaylocale: Pcstr, country: COpaquePointer?, countrycapacity: Int, status: COpaquePointer?): Int

public expect fun ulocGetDisplayKeyword(keyword: Pcstr, displaylocale: Pcstr, dest: COpaquePointer?, destcapacity: Int, status: COpaquePointer?): Int

public expect fun ulocGetDisplayKeywordValue(locale: Pcstr, keyword: Pcstr, displaylocale: Pcstr, dest: COpaquePointer?, destcapacity: Int, status: COpaquePointer?): Int

public expect fun ulocGetDisplayLanguage(locale: Pcstr, displaylocale: Pcstr, language: COpaquePointer?, languagecapacity: Int, status: COpaquePointer?): Int

public expect fun ulocGetDisplayName(localeid: Pcstr, inlocaleid: Pcstr, result: COpaquePointer?, maxresultsize: Int, err: COpaquePointer?): Int

public expect fun ulocGetDisplayScript(locale: Pcstr, displaylocale: Pcstr, script: COpaquePointer?, scriptcapacity: Int, status: COpaquePointer?): Int

public expect fun ulocGetDisplayVariant(locale: Pcstr, displaylocale: Pcstr, variant: COpaquePointer?, variantcapacity: Int, status: COpaquePointer?): Int

public expect fun ulocGetIso3Country(localeid: Pcstr): Pcstr

public expect fun ulocGetIso3Language(localeid: Pcstr): Pcstr

public expect fun ulocGetIsocountries(): COpaquePointer?

public expect fun ulocGetIsolanguages(): COpaquePointer?

public expect fun ulocGetKeywordValue(localeid: Pcstr, keywordname: Pcstr, buffer: Pcstr, buffercapacity: Int, status: COpaquePointer?): Int

public expect fun ulocGetLcid(localeid: Pcstr): UInt

public expect fun ulocGetLanguage(localeid: Pcstr, language: Pcstr, languagecapacity: Int, err: COpaquePointer?): Int

public expect fun ulocGetLineOrientation(localeid: Pcstr, status: COpaquePointer?): ULayoutType

public expect fun ulocGetLocaleForLcid(hostid: UInt, locale: Pcstr, localecapacity: Int, status: COpaquePointer?): Int

public expect fun ulocGetName(localeid: Pcstr, name: Pcstr, namecapacity: Int, err: COpaquePointer?): Int

public expect fun ulocGetParent(localeid: Pcstr, parent: Pcstr, parentcapacity: Int, err: COpaquePointer?): Int

public expect fun ulocGetScript(localeid: Pcstr, script: Pcstr, scriptcapacity: Int, err: COpaquePointer?): Int

public expect fun ulocGetVariant(localeid: Pcstr, variant: Pcstr, variantcapacity: Int, err: COpaquePointer?): Int

public expect fun ulocIsRightToLeft(locale: Pcstr): Byte

public expect fun ulocMinimizeSubtags(localeid: Pcstr, minimizedlocaleid: Pcstr, minimizedlocaleidcapacity: Int, err: COpaquePointer?): Int

public expect fun ulocOpenAvailableByType(type: ULocAvailableType, status: COpaquePointer?): COpaquePointer?

public expect fun ulocOpenKeywords(localeid: Pcstr, status: COpaquePointer?): COpaquePointer?

public expect fun ulocSetDefault(localeid: Pcstr, status: COpaquePointer?)

public expect fun ulocSetKeywordValue(keywordname: Pcstr, keywordvalue: Pcstr, buffer: Pcstr, buffercapacity: Int, status: COpaquePointer?): Int

public expect fun ulocToLanguageTag(localeid: Pcstr, langtag: Pcstr, langtagcapacity: Int, strict: Byte, err: COpaquePointer?): Int

public expect fun ulocToLegacyKey(keyword: Pcstr): Pcstr

public expect fun ulocToLegacyType(keyword: Pcstr, value: Pcstr): Pcstr

public expect fun ulocToUnicodeLocaleKey(keyword: Pcstr): Pcstr

public expect fun ulocToUnicodeLocaleType(keyword: Pcstr, value: Pcstr): Pcstr

public expect fun ulocdataClose(uld: COpaquePointer?)

public expect fun ulocdataGetCldrversion(versionarray: COpaquePointer?, status: COpaquePointer?)

public expect fun ulocdataGetDelimiter(uld: COpaquePointer?, type: ULocaleDataDelimiterType, result: COpaquePointer?, resultlength: Int, status: COpaquePointer?): Int

public expect fun ulocdataGetExemplarSet(uld: COpaquePointer?, fillin: COpaquePointer?, options: UInt, extype: ULocaleDataExemplarSetType, status: COpaquePointer?): COpaquePointer?

public expect fun ulocdataGetLocaleDisplayPattern(uld: COpaquePointer?, pattern: COpaquePointer?, patterncapacity: Int, status: COpaquePointer?): Int

public expect fun ulocdataGetLocaleSeparator(uld: COpaquePointer?, separator: COpaquePointer?, separatorcapacity: Int, status: COpaquePointer?): Int

public expect fun ulocdataGetMeasurementSystem(localeid: Pcstr, status: COpaquePointer?): UMeasurementSystem

public expect fun ulocdataGetNoSubstitute(uld: COpaquePointer?): Byte

public expect fun ulocdataGetPaperSize(localeid: Pcstr, height: COpaquePointer?, width: COpaquePointer?, status: COpaquePointer?)

public expect fun ulocdataOpen(localeid: Pcstr, status: COpaquePointer?): COpaquePointer?

public expect fun ulocdataSetNoSubstitute(uld: COpaquePointer?, setting: Byte)

public expect fun umsgApplyPattern(fmt: COpaquePointer?, pattern: COpaquePointer?, patternlength: Int, parseerror: COpaquePointer?, status: COpaquePointer?)

public expect fun umsgAutoQuoteApostrophe(pattern: COpaquePointer?, patternlength: Int, dest: COpaquePointer?, destcapacity: Int, ec: COpaquePointer?): Int

public expect fun umsgClone(fmt: COpaquePointer?, status: COpaquePointer?): COpaquePointer?

public expect fun umsgClose(format: COpaquePointer?)

public expect fun umsgFormat(fmt: COpaquePointer?, result: COpaquePointer?, resultlength: Int, status: COpaquePointer?, vararg variadicArgs: Long): Int

public expect fun umsgGetLocale(fmt: COpaquePointer?): Pcstr

public expect fun umsgOpen(pattern: COpaquePointer?, patternlength: Int, locale: Pcstr, parseerror: COpaquePointer?, status: COpaquePointer?): COpaquePointer?

public expect fun umsgParse(fmt: COpaquePointer?, source: COpaquePointer?, sourcelength: Int, count: COpaquePointer?, status: COpaquePointer?, vararg variadicArgs: Long)

public expect fun umsgSetLocale(fmt: COpaquePointer?, locale: Pcstr)

public expect fun umsgToPattern(fmt: COpaquePointer?, result: COpaquePointer?, resultlength: Int, status: COpaquePointer?): Int

public expect fun umsgVformat(fmt: COpaquePointer?, result: COpaquePointer?, resultlength: Int, ap: COpaquePointer?, status: COpaquePointer?): Int

public expect fun umsgVparse(fmt: COpaquePointer?, source: COpaquePointer?, sourcelength: Int, count: COpaquePointer?, ap: COpaquePointer?, status: COpaquePointer?)

public expect fun umutablecptrieBuildImmutable(trie: COpaquePointer?, type: UCPTrieType, valuewidth: UCPTrieValueWidth, perrorcode: COpaquePointer?): COpaquePointer?

public expect fun umutablecptrieClone(other: COpaquePointer?, perrorcode: COpaquePointer?): COpaquePointer?

public expect fun umutablecptrieClose(trie: COpaquePointer?)

public expect fun umutablecptrieFromUcpmap(map: COpaquePointer?, perrorcode: COpaquePointer?): COpaquePointer?

public expect fun umutablecptrieFromUcptrie(trie: COpaquePointer?, perrorcode: COpaquePointer?): COpaquePointer?

public expect fun umutablecptrieGet(trie: COpaquePointer?, c: Int): UInt

public expect fun umutablecptrieGetRange(trie: COpaquePointer?, start: Int, option: UCPMapRangeOption, surrogatevalue: UInt, filter: COpaquePointer?, context: COpaquePointer?, pvalue: COpaquePointer?): Int

public expect fun umutablecptrieOpen(initialvalue: UInt, errorvalue: UInt, perrorcode: COpaquePointer?): COpaquePointer?

public expect fun umutablecptrieSet(trie: COpaquePointer?, c: Int, value: UInt, perrorcode: COpaquePointer?)

public expect fun umutablecptrieSetRange(trie: COpaquePointer?, start: Int, end: Int, value: UInt, perrorcode: COpaquePointer?)

public expect fun unorm2Append(norm2: COpaquePointer?, first: COpaquePointer?, firstlength: Int, firstcapacity: Int, second: COpaquePointer?, secondlength: Int, perrorcode: COpaquePointer?): Int

public expect fun unorm2Close(norm2: COpaquePointer?)

public expect fun unorm2ComposePair(norm2: COpaquePointer?, a: Int, b: Int): Int

public expect fun unorm2GetCombiningClass(norm2: COpaquePointer?, c: Int): UByte

public expect fun unorm2GetDecomposition(norm2: COpaquePointer?, c: Int, decomposition: COpaquePointer?, capacity: Int, perrorcode: COpaquePointer?): Int

public expect fun unorm2GetInstance(packagename: Pcstr, name: Pcstr, mode: UNormalization2Mode, perrorcode: COpaquePointer?): COpaquePointer?

public expect fun unorm2GetNfcinstance(perrorcode: COpaquePointer?): COpaquePointer?

public expect fun unorm2GetNfdinstance(perrorcode: COpaquePointer?): COpaquePointer?

public expect fun unorm2GetNfkccasefoldInstance(perrorcode: COpaquePointer?): COpaquePointer?

public expect fun unorm2GetNfkcinstance(perrorcode: COpaquePointer?): COpaquePointer?

public expect fun unorm2GetNfkdinstance(perrorcode: COpaquePointer?): COpaquePointer?

public expect fun unorm2GetRawDecomposition(norm2: COpaquePointer?, c: Int, decomposition: COpaquePointer?, capacity: Int, perrorcode: COpaquePointer?): Int

public expect fun unorm2HasBoundaryAfter(norm2: COpaquePointer?, c: Int): Byte

public expect fun unorm2HasBoundaryBefore(norm2: COpaquePointer?, c: Int): Byte

public expect fun unorm2IsInert(norm2: COpaquePointer?, c: Int): Byte

public expect fun unorm2IsNormalized(norm2: COpaquePointer?, s: COpaquePointer?, length: Int, perrorcode: COpaquePointer?): Byte

public expect fun unorm2Normalize(norm2: COpaquePointer?, src: COpaquePointer?, length: Int, dest: COpaquePointer?, capacity: Int, perrorcode: COpaquePointer?): Int

public expect fun unorm2NormalizeSecondAndAppend(norm2: COpaquePointer?, first: COpaquePointer?, firstlength: Int, firstcapacity: Int, second: COpaquePointer?, secondlength: Int, perrorcode: COpaquePointer?): Int

public expect fun unorm2OpenFiltered(norm2: COpaquePointer?, filterset: COpaquePointer?, perrorcode: COpaquePointer?): COpaquePointer?

public expect fun unorm2QuickCheck(norm2: COpaquePointer?, s: COpaquePointer?, length: Int, perrorcode: COpaquePointer?): UNormalizationCheckResult

public expect fun unorm2SpanQuickCheckYes(norm2: COpaquePointer?, s: COpaquePointer?, length: Int, perrorcode: COpaquePointer?): Int

public expect fun unormCompare(s1: COpaquePointer?, length1: Int, s2: COpaquePointer?, length2: Int, options: UInt, perrorcode: COpaquePointer?): Int

public expect fun unumApplyPattern(format: COpaquePointer?, localized: Byte, pattern: COpaquePointer?, patternlength: Int, parseerror: COpaquePointer?, status: COpaquePointer?)

public expect fun unumClone(fmt: COpaquePointer?, status: COpaquePointer?): COpaquePointer?

public expect fun unumClose(fmt: COpaquePointer?)

public expect fun unumCountAvailable(): Int

public expect fun unumFormat(fmt: COpaquePointer?, number: Int, result: COpaquePointer?, resultlength: Int, pos: COpaquePointer?, status: COpaquePointer?): Int

public expect fun unumFormatDecimal(fmt: COpaquePointer?, number: Pcstr, length: Int, result: COpaquePointer?, resultlength: Int, pos: COpaquePointer?, status: COpaquePointer?): Int

public expect fun unumFormatDouble(fmt: COpaquePointer?, number: Double, result: COpaquePointer?, resultlength: Int, pos: COpaquePointer?, status: COpaquePointer?): Int

public expect fun unumFormatDoubleCurrency(fmt: COpaquePointer?, number: Double, currency: COpaquePointer?, result: COpaquePointer?, resultlength: Int, pos: COpaquePointer?, status: COpaquePointer?): Int

public expect fun unumFormatDoubleForFields(format: COpaquePointer?, number: Double, result: COpaquePointer?, resultlength: Int, fpositer: COpaquePointer?, status: COpaquePointer?): Int

public expect fun unumFormatInt64(fmt: COpaquePointer?, number: Long, result: COpaquePointer?, resultlength: Int, pos: COpaquePointer?, status: COpaquePointer?): Int

public expect fun unumFormatUformattable(fmt: COpaquePointer?, number: COpaquePointer?, result: COpaquePointer?, resultlength: Int, pos: COpaquePointer?, status: COpaquePointer?): Int

public expect fun unumGetAttribute(fmt: COpaquePointer?, attr: UNumberFormatAttribute): Int

public expect fun unumGetAvailable(localeindex: Int): Pcstr

public expect fun unumGetContext(fmt: COpaquePointer?, type: UDisplayContextType, status: COpaquePointer?): UDisplayContext

public expect fun unumGetDoubleAttribute(fmt: COpaquePointer?, attr: UNumberFormatAttribute): Double

public expect fun unumGetLocaleByType(fmt: COpaquePointer?, type: ULocDataLocaleType, status: COpaquePointer?): Pcstr

public expect fun unumGetSymbol(fmt: COpaquePointer?, symbol: UNumberFormatSymbol, buffer: COpaquePointer?, size: Int, status: COpaquePointer?): Int

public expect fun unumGetTextAttribute(fmt: COpaquePointer?, tag: UNumberFormatTextAttribute, result: COpaquePointer?, resultlength: Int, status: COpaquePointer?): Int

public expect fun unumOpen(style: UNumberFormatStyle, pattern: COpaquePointer?, patternlength: Int, locale: Pcstr, parseerr: COpaquePointer?, status: COpaquePointer?): COpaquePointer?

public expect fun unumParse(fmt: COpaquePointer?, text: COpaquePointer?, textlength: Int, parsepos: COpaquePointer?, status: COpaquePointer?): Int

public expect fun unumParseDecimal(fmt: COpaquePointer?, text: COpaquePointer?, textlength: Int, parsepos: COpaquePointer?, outbuf: Pcstr, outbuflength: Int, status: COpaquePointer?): Int

public expect fun unumParseDouble(fmt: COpaquePointer?, text: COpaquePointer?, textlength: Int, parsepos: COpaquePointer?, status: COpaquePointer?): Double

public expect fun unumParseDoubleCurrency(fmt: COpaquePointer?, text: COpaquePointer?, textlength: Int, parsepos: COpaquePointer?, currency: COpaquePointer?, status: COpaquePointer?): Double

public expect fun unumParseInt64(fmt: COpaquePointer?, text: COpaquePointer?, textlength: Int, parsepos: COpaquePointer?, status: COpaquePointer?): Long

public expect fun unumParseToUformattable(fmt: COpaquePointer?, result: COpaquePointer?, text: COpaquePointer?, textlength: Int, parsepos: COpaquePointer?, status: COpaquePointer?): COpaquePointer?

public expect fun unumSetAttribute(fmt: COpaquePointer?, attr: UNumberFormatAttribute, newvalue: Int)

public expect fun unumSetContext(fmt: COpaquePointer?, value: UDisplayContext, status: COpaquePointer?)

public expect fun unumSetDoubleAttribute(fmt: COpaquePointer?, attr: UNumberFormatAttribute, newvalue: Double)

public expect fun unumSetSymbol(fmt: COpaquePointer?, symbol: UNumberFormatSymbol, value: COpaquePointer?, length: Int, status: COpaquePointer?)

public expect fun unumSetTextAttribute(fmt: COpaquePointer?, tag: UNumberFormatTextAttribute, newvalue: COpaquePointer?, newvaluelength: Int, status: COpaquePointer?)

public expect fun unumToPattern(fmt: COpaquePointer?, ispatternlocalized: Byte, result: COpaquePointer?, resultlength: Int, status: COpaquePointer?): Int

public expect fun unumfClose(uformatter: COpaquePointer?)

public expect fun unumfCloseResult(uresult: COpaquePointer?)

public expect fun unumfFormatDecimal(uformatter: COpaquePointer?, value: Pcstr, valuelen: Int, uresult: COpaquePointer?, ec: COpaquePointer?)

public expect fun unumfFormatDouble(uformatter: COpaquePointer?, value: Double, uresult: COpaquePointer?, ec: COpaquePointer?)

public expect fun unumfFormatInt(uformatter: COpaquePointer?, value: Long, uresult: COpaquePointer?, ec: COpaquePointer?)

public expect fun unumfOpenForSkeletonAndLocale(skeleton: COpaquePointer?, skeletonlen: Int, locale: Pcstr, ec: COpaquePointer?): COpaquePointer?

public expect fun unumfOpenForSkeletonAndLocaleWithError(skeleton: COpaquePointer?, skeletonlen: Int, locale: Pcstr, perror: COpaquePointer?, ec: COpaquePointer?): COpaquePointer?

public expect fun unumfOpenResult(ec: COpaquePointer?): COpaquePointer?

public expect fun unumfResultAsValue(uresult: COpaquePointer?, ec: COpaquePointer?): COpaquePointer?

public expect fun unumfResultGetAllFieldPositions(uresult: COpaquePointer?, ufpositer: COpaquePointer?, ec: COpaquePointer?)

public expect fun unumfResultNextFieldPosition(uresult: COpaquePointer?, ufpos: COpaquePointer?, ec: COpaquePointer?): Byte

public expect fun unumfResultToString(uresult: COpaquePointer?, buffer: COpaquePointer?, buffercapacity: Int, ec: COpaquePointer?): Int

public expect fun unumsysClose(unumsys: COpaquePointer?)

public expect fun unumsysGetDescription(unumsys: COpaquePointer?, result: COpaquePointer?, resultlength: Int, status: COpaquePointer?): Int

public expect fun unumsysGetName(unumsys: COpaquePointer?): Pcstr

public expect fun unumsysGetRadix(unumsys: COpaquePointer?): Int

public expect fun unumsysIsAlgorithmic(unumsys: COpaquePointer?): Byte

public expect fun unumsysOpen(locale: Pcstr, status: COpaquePointer?): COpaquePointer?

public expect fun unumsysOpenAvailableNames(status: COpaquePointer?): COpaquePointer?

public expect fun unumsysOpenByName(name: Pcstr, status: COpaquePointer?): COpaquePointer?

public expect fun uplrulesClose(uplrules: COpaquePointer?)

public expect fun uplrulesGetKeywords(uplrules: COpaquePointer?, status: COpaquePointer?): COpaquePointer?

public expect fun uplrulesOpen(locale: Pcstr, status: COpaquePointer?): COpaquePointer?

public expect fun uplrulesOpenForType(locale: Pcstr, type: UPluralType, status: COpaquePointer?): COpaquePointer?

public expect fun uplrulesSelect(uplrules: COpaquePointer?, number: Double, keyword: COpaquePointer?, capacity: Int, status: COpaquePointer?): Int

public expect fun uplrulesSelectFormatted(uplrules: COpaquePointer?, number: COpaquePointer?, keyword: COpaquePointer?, capacity: Int, status: COpaquePointer?): Int

public expect fun uregexAppendReplacement(regexp: COpaquePointer?, replacementtext: COpaquePointer?, replacementlength: Int, destbuf: COpaquePointer?, destcapacity: COpaquePointer?, status: COpaquePointer?): Int

public expect fun uregexAppendReplacementUtext(regexp: COpaquePointer?, replacementtext: COpaquePointer?, dest: COpaquePointer?, status: COpaquePointer?)

public expect fun uregexAppendTail(regexp: COpaquePointer?, destbuf: COpaquePointer?, destcapacity: COpaquePointer?, status: COpaquePointer?): Int

public expect fun uregexAppendTailUtext(regexp: COpaquePointer?, dest: COpaquePointer?, status: COpaquePointer?): COpaquePointer?

public expect fun uregexClone(regexp: COpaquePointer?, status: COpaquePointer?): COpaquePointer?

public expect fun uregexClose(regexp: COpaquePointer?)

public expect fun uregexEnd(regexp: COpaquePointer?, groupnum: Int, status: COpaquePointer?): Int

public expect fun uregexEnd64(regexp: COpaquePointer?, groupnum: Int, status: COpaquePointer?): Long

public expect fun uregexFind(regexp: COpaquePointer?, startindex: Int, status: COpaquePointer?): Byte

public expect fun uregexFind64(regexp: COpaquePointer?, startindex: Long, status: COpaquePointer?): Byte

public expect fun uregexFindNext(regexp: COpaquePointer?, status: COpaquePointer?): Byte

public expect fun uregexFlags(regexp: COpaquePointer?, status: COpaquePointer?): Int

public expect fun uregexGetFindProgressCallback(regexp: COpaquePointer?, callback: COpaquePointer?, context: COpaquePointer?, status: COpaquePointer?)

public expect fun uregexGetMatchCallback(regexp: COpaquePointer?, callback: COpaquePointer?, context: COpaquePointer?, status: COpaquePointer?)

public expect fun uregexGetStackLimit(regexp: COpaquePointer?, status: COpaquePointer?): Int

public expect fun uregexGetText(regexp: COpaquePointer?, textlength: COpaquePointer?, status: COpaquePointer?): COpaquePointer?

public expect fun uregexGetTimeLimit(regexp: COpaquePointer?, status: COpaquePointer?): Int

public expect fun uregexGetUtext(regexp: COpaquePointer?, dest: COpaquePointer?, status: COpaquePointer?): COpaquePointer?

public expect fun uregexGroup(regexp: COpaquePointer?, groupnum: Int, dest: COpaquePointer?, destcapacity: Int, status: COpaquePointer?): Int

public expect fun uregexGroupCount(regexp: COpaquePointer?, status: COpaquePointer?): Int

public expect fun uregexGroupNumberFromCname(regexp: COpaquePointer?, groupname: Pcstr, namelength: Int, status: COpaquePointer?): Int

public expect fun uregexGroupNumberFromName(regexp: COpaquePointer?, groupname: COpaquePointer?, namelength: Int, status: COpaquePointer?): Int

public expect fun uregexGroupUtext(regexp: COpaquePointer?, groupnum: Int, dest: COpaquePointer?, grouplength: COpaquePointer?, status: COpaquePointer?): COpaquePointer?

public expect fun uregexHasAnchoringBounds(regexp: COpaquePointer?, status: COpaquePointer?): Byte

public expect fun uregexHasTransparentBounds(regexp: COpaquePointer?, status: COpaquePointer?): Byte

public expect fun uregexHitEnd(regexp: COpaquePointer?, status: COpaquePointer?): Byte

public expect fun uregexLookingAt(regexp: COpaquePointer?, startindex: Int, status: COpaquePointer?): Byte

public expect fun uregexLookingAt64(regexp: COpaquePointer?, startindex: Long, status: COpaquePointer?): Byte

public expect fun uregexMatches(regexp: COpaquePointer?, startindex: Int, status: COpaquePointer?): Byte

public expect fun uregexMatches64(regexp: COpaquePointer?, startindex: Long, status: COpaquePointer?): Byte

public expect fun uregexOpen(pattern: COpaquePointer?, patternlength: Int, flags: UInt, pe: COpaquePointer?, status: COpaquePointer?): COpaquePointer?

public expect fun uregexOpenC(pattern: Pcstr, flags: UInt, pe: COpaquePointer?, status: COpaquePointer?): COpaquePointer?

public expect fun uregexOpenUtext(pattern: COpaquePointer?, flags: UInt, pe: COpaquePointer?, status: COpaquePointer?): COpaquePointer?

public expect fun uregexPattern(regexp: COpaquePointer?, patlength: COpaquePointer?, status: COpaquePointer?): COpaquePointer?

public expect fun uregexPatternUtext(regexp: COpaquePointer?, status: COpaquePointer?): COpaquePointer?

public expect fun uregexRefreshUtext(regexp: COpaquePointer?, text: COpaquePointer?, status: COpaquePointer?)

public expect fun uregexRegionEnd(regexp: COpaquePointer?, status: COpaquePointer?): Int

public expect fun uregexRegionEnd64(regexp: COpaquePointer?, status: COpaquePointer?): Long

public expect fun uregexRegionStart(regexp: COpaquePointer?, status: COpaquePointer?): Int

public expect fun uregexRegionStart64(regexp: COpaquePointer?, status: COpaquePointer?): Long

public expect fun uregexReplaceAll(regexp: COpaquePointer?, replacementtext: COpaquePointer?, replacementlength: Int, destbuf: COpaquePointer?, destcapacity: Int, status: COpaquePointer?): Int

public expect fun uregexReplaceAllUtext(regexp: COpaquePointer?, replacement: COpaquePointer?, dest: COpaquePointer?, status: COpaquePointer?): COpaquePointer?

public expect fun uregexReplaceFirst(regexp: COpaquePointer?, replacementtext: COpaquePointer?, replacementlength: Int, destbuf: COpaquePointer?, destcapacity: Int, status: COpaquePointer?): Int

public expect fun uregexReplaceFirstUtext(regexp: COpaquePointer?, replacement: COpaquePointer?, dest: COpaquePointer?, status: COpaquePointer?): COpaquePointer?

public expect fun uregexRequireEnd(regexp: COpaquePointer?, status: COpaquePointer?): Byte

public expect fun uregexReset(regexp: COpaquePointer?, index: Int, status: COpaquePointer?)

public expect fun uregexReset64(regexp: COpaquePointer?, index: Long, status: COpaquePointer?)

public expect fun uregexSetFindProgressCallback(regexp: COpaquePointer?, callback: URegexFindProgressCallback, context: COpaquePointer?, status: COpaquePointer?)

public expect fun uregexSetMatchCallback(regexp: COpaquePointer?, callback: URegexMatchCallback, context: COpaquePointer?, status: COpaquePointer?)

public expect fun uregexSetRegion(regexp: COpaquePointer?, regionstart: Int, regionlimit: Int, status: COpaquePointer?)

public expect fun uregexSetRegion64(regexp: COpaquePointer?, regionstart: Long, regionlimit: Long, status: COpaquePointer?)

public expect fun uregexSetRegionAndStart(regexp: COpaquePointer?, regionstart: Long, regionlimit: Long, startindex: Long, status: COpaquePointer?)

public expect fun uregexSetStackLimit(regexp: COpaquePointer?, limit: Int, status: COpaquePointer?)

public expect fun uregexSetText(regexp: COpaquePointer?, text: COpaquePointer?, textlength: Int, status: COpaquePointer?)

public expect fun uregexSetTimeLimit(regexp: COpaquePointer?, limit: Int, status: COpaquePointer?)

public expect fun uregexSetUtext(regexp: COpaquePointer?, text: COpaquePointer?, status: COpaquePointer?)

public expect fun uregexSplit(regexp: COpaquePointer?, destbuf: COpaquePointer?, destcapacity: Int, requiredcapacity: COpaquePointer?, destfields: COpaquePointer?, destfieldscapacity: Int, status: COpaquePointer?): Int

public expect fun uregexSplitUtext(regexp: COpaquePointer?, destfields: COpaquePointer?, destfieldscapacity: Int, status: COpaquePointer?): Int

public expect fun uregexStart(regexp: COpaquePointer?, groupnum: Int, status: COpaquePointer?): Int

public expect fun uregexStart64(regexp: COpaquePointer?, groupnum: Int, status: COpaquePointer?): Long

public expect fun uregexUseAnchoringBounds(regexp: COpaquePointer?, b: Byte, status: COpaquePointer?)

public expect fun uregexUseTransparentBounds(regexp: COpaquePointer?, b: Byte, status: COpaquePointer?)

public expect fun uregionAreEqual(uregion: COpaquePointer?, otherregion: COpaquePointer?): Byte

public expect fun uregionContains(uregion: COpaquePointer?, otherregion: COpaquePointer?): Byte

public expect fun uregionGetAvailable(type: URegionType, status: COpaquePointer?): COpaquePointer?

public expect fun uregionGetContainedRegions(uregion: COpaquePointer?, status: COpaquePointer?): COpaquePointer?

public expect fun uregionGetContainedRegionsOfType(uregion: COpaquePointer?, type: URegionType, status: COpaquePointer?): COpaquePointer?

public expect fun uregionGetContainingRegion(uregion: COpaquePointer?): COpaquePointer?

public expect fun uregionGetContainingRegionOfType(uregion: COpaquePointer?, type: URegionType): COpaquePointer?

public expect fun uregionGetNumericCode(uregion: COpaquePointer?): Int
