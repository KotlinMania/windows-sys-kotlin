package io.github.kotlinmania.windowssys.windows.win32.globalization

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Pcstr

public expect fun ucnvFromUcountPending(cnv: ConstPtr, status: MutPtr): Int

public expect fun ucnvFromUnicode(converter: MutPtr, target: MutPtr, targetlimit: Pcstr, source: ConstPtr, sourcelimit: ConstPtr, offsets: MutPtr, flush: Byte, err: MutPtr)

public expect fun ucnvGetAlias(alias: Pcstr, n: UShort, perrorcode: MutPtr): Pcstr

public expect fun ucnvGetAliases(alias: Pcstr, aliases: ConstPtr, perrorcode: MutPtr)

public expect fun ucnvGetAvailableName(n: Int): Pcstr

public expect fun ucnvGetCcsid(converter: ConstPtr, err: MutPtr): Int

public expect fun ucnvGetCanonicalName(alias: Pcstr, standard: Pcstr, perrorcode: MutPtr): Pcstr

public expect fun ucnvGetDefaultName(): Pcstr

public expect fun ucnvGetDisplayName(converter: ConstPtr, displaylocale: Pcstr, displayname: MutPtr, displaynamecapacity: Int, err: MutPtr): Int

public expect fun ucnvGetFromUcallBack(converter: ConstPtr, action: MutPtr, context: ConstPtr)

public expect fun ucnvGetInvalidChars(converter: ConstPtr, errbytes: Pcstr, len: MutPtr, err: MutPtr)

public expect fun ucnvGetInvalidUchars(converter: ConstPtr, erruchars: MutPtr, len: MutPtr, err: MutPtr)

public expect fun ucnvGetMaxCharSize(converter: ConstPtr): Byte

public expect fun ucnvGetMinCharSize(converter: ConstPtr): Byte

public expect fun ucnvGetName(converter: ConstPtr, err: MutPtr): Pcstr

public expect fun ucnvGetNextUchar(converter: MutPtr, source: ConstPtr, sourcelimit: Pcstr, err: MutPtr): Int

public expect fun ucnvGetPlatform(converter: ConstPtr, err: MutPtr): UConverterPlatform

public expect fun ucnvGetStandard(n: UShort, perrorcode: MutPtr): Pcstr

public expect fun ucnvGetStandardName(name: Pcstr, standard: Pcstr, perrorcode: MutPtr): Pcstr

public expect fun ucnvGetStarters(converter: ConstPtr, starters: MutPtr, err: MutPtr)

public expect fun ucnvGetSubstChars(converter: ConstPtr, subchars: Pcstr, len: MutPtr, err: MutPtr)

public expect fun ucnvGetToUcallBack(converter: ConstPtr, action: MutPtr, context: ConstPtr)

public expect fun ucnvGetType(converter: ConstPtr): UConverterType

public expect fun ucnvGetUnicodeSet(cnv: ConstPtr, setfillin: MutPtr, whichset: UConverterUnicodeSet, perrorcode: MutPtr)

public expect fun ucnvIsAmbiguous(cnv: ConstPtr): Byte

public expect fun ucnvIsFixedWidth(cnv: MutPtr, status: MutPtr): Byte

public expect fun ucnvOpen(convertername: Pcstr, err: MutPtr): MutPtr

public expect fun ucnvOpenAllNames(perrorcode: MutPtr): MutPtr

public expect fun ucnvOpenCcsid(codepage: Int, platform: UConverterPlatform, err: MutPtr): MutPtr

public expect fun ucnvOpenPackage(packagename: Pcstr, convertername: Pcstr, err: MutPtr): MutPtr

public expect fun ucnvOpenStandardNames(convname: Pcstr, standard: Pcstr, perrorcode: MutPtr): MutPtr

public expect fun ucnvOpenU(name: ConstPtr, err: MutPtr): MutPtr

public expect fun ucnvReset(converter: MutPtr)

public expect fun ucnvResetFromUnicode(converter: MutPtr)

public expect fun ucnvResetToUnicode(converter: MutPtr)

public expect fun ucnvSafeClone(cnv: ConstPtr, stackbuffer: MutPtr, pbuffersize: MutPtr, status: MutPtr): MutPtr

public expect fun ucnvSetDefaultName(name: Pcstr)

public expect fun ucnvSetFallback(cnv: MutPtr, usesfallback: Byte)

public expect fun ucnvSetFromUcallBack(converter: MutPtr, newaction: UConverterFromUCallback, newcontext: ConstPtr, oldaction: MutPtr, oldcontext: ConstPtr, err: MutPtr)

public expect fun ucnvSetSubstChars(converter: MutPtr, subchars: Pcstr, len: Byte, err: MutPtr)

public expect fun ucnvSetSubstString(cnv: MutPtr, s: ConstPtr, length: Int, err: MutPtr)

public expect fun ucnvSetToUcallBack(converter: MutPtr, newaction: UConverterToUCallback, newcontext: ConstPtr, oldaction: MutPtr, oldcontext: ConstPtr, err: MutPtr)

public expect fun ucnvToAlgorithmic(algorithmictype: UConverterType, cnv: MutPtr, target: Pcstr, targetcapacity: Int, source: Pcstr, sourcelength: Int, perrorcode: MutPtr): Int

public expect fun ucnvToUchars(cnv: MutPtr, dest: MutPtr, destcapacity: Int, src: Pcstr, srclength: Int, perrorcode: MutPtr): Int

public expect fun ucnvToUcountPending(cnv: ConstPtr, status: MutPtr): Int

public expect fun ucnvToUnicode(converter: MutPtr, target: MutPtr, targetlimit: ConstPtr, source: ConstPtr, sourcelimit: Pcstr, offsets: MutPtr, flush: Byte, err: MutPtr)

public expect fun ucnvUsesFallback(cnv: ConstPtr): Byte

public expect fun ucnvselClose(sel: MutPtr)

public expect fun ucnvselOpen(converterlist: ConstPtr, converterlistsize: Int, excludedcodepoints: ConstPtr, whichset: UConverterUnicodeSet, status: MutPtr): MutPtr

public expect fun ucnvselOpenFromSerialized(buffer: ConstPtr, length: Int, status: MutPtr): MutPtr

public expect fun ucnvselSelectForString(sel: ConstPtr, s: ConstPtr, length: Int, status: MutPtr): MutPtr

public expect fun ucnvselSelectForUtf8(sel: ConstPtr, s: Pcstr, length: Int, status: MutPtr): MutPtr

public expect fun ucnvselSerialize(sel: ConstPtr, buffer: MutPtr, buffercapacity: Int, status: MutPtr): Int

public expect fun ucolCloneBinary(coll: ConstPtr, buffer: MutPtr, capacity: Int, status: MutPtr): Int

public expect fun ucolClose(coll: MutPtr)

public expect fun ucolCloseElements(elems: MutPtr)

public expect fun ucolCountAvailable(): Int

public expect fun ucolEqual(coll: ConstPtr, source: ConstPtr, sourcelength: Int, target: ConstPtr, targetlength: Int): Byte

public expect fun ucolGetAttribute(coll: ConstPtr, attr: UColAttribute, status: MutPtr): UColAttributeValue

public expect fun ucolGetAvailable(localeindex: Int): Pcstr

public expect fun ucolGetBound(source: ConstPtr, sourcelength: Int, boundtype: UColBoundMode, nooflevels: UInt, result: MutPtr, resultlength: Int, status: MutPtr): Int

public expect fun ucolGetContractionsAndExpansions(coll: ConstPtr, contractions: MutPtr, expansions: MutPtr, addprefixes: Byte, status: MutPtr)

public expect fun ucolGetDisplayName(objloc: Pcstr, disploc: Pcstr, result: MutPtr, resultlength: Int, status: MutPtr): Int

public expect fun ucolGetEquivalentReorderCodes(reordercode: Int, dest: MutPtr, destcapacity: Int, perrorcode: MutPtr): Int

public expect fun ucolGetFunctionalEquivalent(result: Pcstr, resultcapacity: Int, keyword: Pcstr, locale: Pcstr, isavailable: MutPtr, status: MutPtr): Int

public expect fun ucolGetKeywordValues(keyword: Pcstr, status: MutPtr): MutPtr

public expect fun ucolGetKeywordValuesForLocale(key: Pcstr, locale: Pcstr, commonlyused: Byte, status: MutPtr): MutPtr

public expect fun ucolGetKeywords(status: MutPtr): MutPtr

public expect fun ucolGetLocaleByType(coll: ConstPtr, type: ULocDataLocaleType, status: MutPtr): Pcstr

public expect fun ucolGetMaxExpansion(elems: ConstPtr, order: Int): Int

public expect fun ucolGetMaxVariable(coll: ConstPtr): UColReorderCode

public expect fun ucolGetOffset(elems: ConstPtr): Int

public expect fun ucolGetReorderCodes(coll: ConstPtr, dest: MutPtr, destcapacity: Int, perrorcode: MutPtr): Int

public expect fun ucolGetRules(coll: ConstPtr, length: MutPtr): MutPtr

public expect fun ucolGetRulesEx(coll: ConstPtr, delta: UColRuleOption, buffer: MutPtr, bufferlen: Int): Int

public expect fun ucolGetSortKey(coll: ConstPtr, source: ConstPtr, sourcelength: Int, result: MutPtr, resultlength: Int): Int

public expect fun ucolGetStrength(coll: ConstPtr): UColAttributeValue

public expect fun ucolGetTailoredSet(coll: ConstPtr, status: MutPtr): MutPtr

public expect fun ucolGetUcaversion(coll: ConstPtr, info: MutPtr)

public expect fun ucolGetVariableTop(coll: ConstPtr, status: MutPtr): UInt

public expect fun ucolGetVersion(coll: ConstPtr, info: MutPtr)

public expect fun ucolGreater(coll: ConstPtr, source: ConstPtr, sourcelength: Int, target: ConstPtr, targetlength: Int): Byte

public expect fun ucolGreaterOrEqual(coll: ConstPtr, source: ConstPtr, sourcelength: Int, target: ConstPtr, targetlength: Int): Byte

public expect fun ucolKeyHashCode(key: ConstPtr, length: Int): Int

public expect fun ucolMergeSortkeys(src1: ConstPtr, src1length: Int, src2: ConstPtr, src2length: Int, dest: MutPtr, destcapacity: Int): Int

public expect fun ucolNext(elems: MutPtr, status: MutPtr): Int

public expect fun ucolNextSortKeyPart(coll: ConstPtr, iter: MutPtr, state: MutPtr, dest: MutPtr, count: Int, status: MutPtr): Int

public expect fun ucolOpen(loc: Pcstr, status: MutPtr): MutPtr

public expect fun ucolOpenAvailableLocales(status: MutPtr): MutPtr

public expect fun ucolOpenBinary(bin: ConstPtr, length: Int, base: ConstPtr, status: MutPtr): MutPtr

public expect fun ucolOpenElements(coll: ConstPtr, text: ConstPtr, textlength: Int, status: MutPtr): MutPtr

public expect fun ucolOpenRules(rules: ConstPtr, ruleslength: Int, normalizationmode: UColAttributeValue, strength: UColAttributeValue, parseerror: MutPtr, status: MutPtr): MutPtr

public expect fun ucolPrevious(elems: MutPtr, status: MutPtr): Int

public expect fun ucolPrimaryOrder(order: Int): Int

public expect fun ucolReset(elems: MutPtr)

public expect fun ucolSafeClone(coll: ConstPtr, stackbuffer: MutPtr, pbuffersize: MutPtr, status: MutPtr): MutPtr

public expect fun ucolSecondaryOrder(order: Int): Int

public expect fun ucolSetAttribute(coll: MutPtr, attr: UColAttribute, value: UColAttributeValue, status: MutPtr)

public expect fun ucolSetMaxVariable(coll: MutPtr, group: UColReorderCode, perrorcode: MutPtr)

public expect fun ucolSetOffset(elems: MutPtr, offset: Int, status: MutPtr)

public expect fun ucolSetReorderCodes(coll: MutPtr, reordercodes: ConstPtr, reordercodeslength: Int, perrorcode: MutPtr)

public expect fun ucolSetStrength(coll: MutPtr, strength: UColAttributeValue)

public expect fun ucolSetText(elems: MutPtr, text: ConstPtr, textlength: Int, status: MutPtr)

public expect fun ucolStrcoll(coll: ConstPtr, source: ConstPtr, sourcelength: Int, target: ConstPtr, targetlength: Int): UCollationResult

public expect fun ucolStrcollIter(coll: ConstPtr, siter: MutPtr, titer: MutPtr, status: MutPtr): UCollationResult

public expect fun ucolStrcollUtf8(coll: ConstPtr, source: Pcstr, sourcelength: Int, target: Pcstr, targetlength: Int, status: MutPtr): UCollationResult

public expect fun ucolTertiaryOrder(order: Int): Int

public expect fun ucpmapGet(map: ConstPtr, c: Int): UInt

public expect fun ucpmapGetRange(map: ConstPtr, start: Int, option: UCPMapRangeOption, surrogatevalue: UInt, filter: MutPtr, context: ConstPtr, pvalue: MutPtr): Int

public expect fun ucptrieClose(trie: MutPtr)

public expect fun ucptrieGet(trie: ConstPtr, c: Int): UInt

public expect fun ucptrieGetRange(trie: ConstPtr, start: Int, option: UCPMapRangeOption, surrogatevalue: UInt, filter: MutPtr, context: ConstPtr, pvalue: MutPtr): Int

public expect fun ucptrieGetType(trie: ConstPtr): UCPTrieType

public expect fun ucptrieGetValueWidth(trie: ConstPtr): UCPTrieValueWidth

public expect fun ucptrieInternalSmallIndex(trie: ConstPtr, c: Int): Int

public expect fun ucptrieInternalSmallU8Index(trie: ConstPtr, lt1: Int, t2: UByte, t3: UByte): Int

public expect fun ucptrieInternalU8PrevIndex(trie: ConstPtr, c: Int, start: ConstPtr, src: ConstPtr): Int

public expect fun ucptrieOpenFromBinary(type: UCPTrieType, valuewidth: UCPTrieValueWidth, data: ConstPtr, length: Int, pactuallength: MutPtr, perrorcode: MutPtr): MutPtr

public expect fun ucptrieToBinary(trie: ConstPtr, data: MutPtr, capacity: Int, perrorcode: MutPtr): Int

public expect fun ucsdetClose(ucsd: MutPtr)

public expect fun ucsdetDetect(ucsd: MutPtr, status: MutPtr): MutPtr

public expect fun ucsdetDetectAll(ucsd: MutPtr, matchesfound: MutPtr, status: MutPtr): MutPtr

public expect fun ucsdetEnableInputFilter(ucsd: MutPtr, filter: Byte): Byte

public expect fun ucsdetGetAllDetectableCharsets(ucsd: ConstPtr, status: MutPtr): MutPtr

public expect fun ucsdetGetConfidence(ucsm: ConstPtr, status: MutPtr): Int

public expect fun ucsdetGetLanguage(ucsm: ConstPtr, status: MutPtr): Pcstr

public expect fun ucsdetGetName(ucsm: ConstPtr, status: MutPtr): Pcstr

public expect fun ucsdetGetUchars(ucsm: ConstPtr, buf: MutPtr, cap: Int, status: MutPtr): Int

public expect fun ucsdetIsInputFilterEnabled(ucsd: ConstPtr): Byte

public expect fun ucsdetOpen(status: MutPtr): MutPtr

public expect fun ucsdetSetDeclaredEncoding(ucsd: MutPtr, encoding: Pcstr, length: Int, status: MutPtr)

public expect fun ucsdetSetText(ucsd: MutPtr, textin: Pcstr, len: Int, status: MutPtr)

public expect fun ucurrCountCurrencies(locale: Pcstr, date: Double, ec: MutPtr): Int

public expect fun ucurrForLocale(locale: Pcstr, buff: MutPtr, buffcapacity: Int, ec: MutPtr): Int

public expect fun ucurrForLocaleAndDate(locale: Pcstr, date: Double, index: Int, buff: MutPtr, buffcapacity: Int, ec: MutPtr): Int

public expect fun ucurrGetDefaultFractionDigits(currency: ConstPtr, ec: MutPtr): Int

public expect fun ucurrGetDefaultFractionDigitsForUsage(currency: ConstPtr, usage: UCurrencyUsage, ec: MutPtr): Int

public expect fun ucurrGetKeywordValuesForLocale(key: Pcstr, locale: Pcstr, commonlyused: Byte, status: MutPtr): MutPtr

public expect fun ucurrGetName(currency: ConstPtr, locale: Pcstr, namestyle: UCurrNameStyle, ischoiceformat: MutPtr, len: MutPtr, ec: MutPtr): MutPtr

public expect fun ucurrGetNumericCode(currency: ConstPtr): Int

public expect fun ucurrGetPluralName(currency: ConstPtr, locale: Pcstr, ischoiceformat: MutPtr, pluralcount: Pcstr, len: MutPtr, ec: MutPtr): MutPtr

public expect fun ucurrGetRoundingIncrement(currency: ConstPtr, ec: MutPtr): Double

public expect fun ucurrGetRoundingIncrementForUsage(currency: ConstPtr, usage: UCurrencyUsage, ec: MutPtr): Double

public expect fun ucurrIsAvailable(isocode: ConstPtr, from: Double, to: Double, errorcode: MutPtr): Byte

public expect fun ucurrOpenIsocurrencies(currtype: UInt, perrorcode: MutPtr): MutPtr

public expect fun ucurrRegister(isocode: ConstPtr, locale: Pcstr, status: MutPtr): MutPtr

public expect fun ucurrUnregister(key: MutPtr, status: MutPtr): Byte

public expect fun udatAdoptNumberFormat(fmt: MutPtr, numberformattoadopt: MutPtr)

public expect fun udatAdoptNumberFormatForFields(fmt: MutPtr, fields: ConstPtr, numberformattoset: MutPtr, status: MutPtr)

public expect fun udatApplyPattern(format: MutPtr, localized: Byte, pattern: ConstPtr, patternlength: Int)

public expect fun udatClone(fmt: ConstPtr, status: MutPtr): MutPtr

public expect fun udatClose(format: MutPtr)

public expect fun udatCountAvailable(): Int

public expect fun udatCountSymbols(fmt: ConstPtr, type: UDateFormatSymbolType): Int

public expect fun udatFormat(format: ConstPtr, datetoformat: Double, result: MutPtr, resultlength: Int, position: MutPtr, status: MutPtr): Int

public expect fun udatFormatCalendar(format: ConstPtr, calendar: MutPtr, result: MutPtr, capacity: Int, position: MutPtr, status: MutPtr): Int

public expect fun udatFormatCalendarForFields(format: ConstPtr, calendar: MutPtr, result: MutPtr, capacity: Int, fpositer: MutPtr, status: MutPtr): Int

public expect fun udatFormatForFields(format: ConstPtr, datetoformat: Double, result: MutPtr, resultlength: Int, fpositer: MutPtr, status: MutPtr): Int

public expect fun udatGet2DigitYearStart(fmt: ConstPtr, status: MutPtr): Double

public expect fun udatGetAvailable(localeindex: Int): Pcstr

public expect fun udatGetBooleanAttribute(fmt: ConstPtr, attr: UDateFormatBooleanAttribute, status: MutPtr): Byte

public expect fun udatGetCalendar(fmt: ConstPtr): MutPtr

public expect fun udatGetContext(fmt: ConstPtr, type: UDisplayContextType, status: MutPtr): UDisplayContext

public expect fun udatGetLocaleByType(fmt: ConstPtr, type: ULocDataLocaleType, status: MutPtr): Pcstr

public expect fun udatGetNumberFormat(fmt: ConstPtr): MutPtr

public expect fun udatGetNumberFormatForField(fmt: ConstPtr, field: UShort): MutPtr

public expect fun udatGetSymbols(fmt: ConstPtr, type: UDateFormatSymbolType, symbolindex: Int, result: MutPtr, resultlength: Int, status: MutPtr): Int

public expect fun udatIsLenient(fmt: ConstPtr): Byte

public expect fun udatOpen(timestyle: UDateFormatStyle, datestyle: UDateFormatStyle, locale: Pcstr, tzid: ConstPtr, tzidlength: Int, pattern: ConstPtr, patternlength: Int, status: MutPtr): MutPtr

public expect fun udatParse(format: ConstPtr, text: ConstPtr, textlength: Int, parsepos: MutPtr, status: MutPtr): Double

public expect fun udatParseCalendar(format: ConstPtr, calendar: MutPtr, text: ConstPtr, textlength: Int, parsepos: MutPtr, status: MutPtr)

public expect fun udatSet2DigitYearStart(fmt: MutPtr, d: Double, status: MutPtr)

public expect fun udatSetBooleanAttribute(fmt: MutPtr, attr: UDateFormatBooleanAttribute, newvalue: Byte, status: MutPtr)

public expect fun udatSetCalendar(fmt: MutPtr, calendartoset: ConstPtr)

public expect fun udatSetContext(fmt: MutPtr, value: UDisplayContext, status: MutPtr)

public expect fun udatSetLenient(fmt: MutPtr, islenient: Byte)

public expect fun udatSetNumberFormat(fmt: MutPtr, numberformattoset: ConstPtr)

public expect fun udatSetSymbols(format: MutPtr, type: UDateFormatSymbolType, symbolindex: Int, value: MutPtr, valuelength: Int, status: MutPtr)

public expect fun udatToCalendarDateField(field: UDateFormatField): UCalendarDateFields

public expect fun udatToPattern(fmt: ConstPtr, localized: Byte, result: MutPtr, resultlength: Int, status: MutPtr): Int

public expect fun udatpgAddPattern(dtpg: MutPtr, pattern: ConstPtr, patternlength: Int, override: Byte, conflictingpattern: MutPtr, capacity: Int, plength: MutPtr, perrorcode: MutPtr): UDateTimePatternConflict

public expect fun udatpgClone(dtpg: ConstPtr, perrorcode: MutPtr): MutPtr

public expect fun udatpgClose(dtpg: MutPtr)

public expect fun udatpgGetAppendItemFormat(dtpg: ConstPtr, field: UDateTimePatternField, plength: MutPtr): MutPtr

public expect fun udatpgGetAppendItemName(dtpg: ConstPtr, field: UDateTimePatternField, plength: MutPtr): MutPtr

public expect fun udatpgGetBaseSkeleton(unuseddtpg: MutPtr, pattern: ConstPtr, length: Int, baseskeleton: MutPtr, capacity: Int, perrorcode: MutPtr): Int

public expect fun udatpgGetBestPattern(dtpg: MutPtr, skeleton: ConstPtr, length: Int, bestpattern: MutPtr, capacity: Int, perrorcode: MutPtr): Int

public expect fun udatpgGetBestPatternWithOptions(dtpg: MutPtr, skeleton: ConstPtr, length: Int, options: UDateTimePatternMatchOptions, bestpattern: MutPtr, capacity: Int, perrorcode: MutPtr): Int

public expect fun udatpgGetDateTimeFormat(dtpg: ConstPtr, plength: MutPtr): MutPtr

public expect fun udatpgGetDecimal(dtpg: ConstPtr, plength: MutPtr): MutPtr

public expect fun udatpgGetFieldDisplayName(dtpg: ConstPtr, field: UDateTimePatternField, width: UDateTimePGDisplayWidth, fieldname: MutPtr, capacity: Int, perrorcode: MutPtr): Int

public expect fun udatpgGetPatternForSkeleton(dtpg: ConstPtr, skeleton: ConstPtr, skeletonlength: Int, plength: MutPtr): MutPtr

public expect fun udatpgGetSkeleton(unuseddtpg: MutPtr, pattern: ConstPtr, length: Int, skeleton: MutPtr, capacity: Int, perrorcode: MutPtr): Int

public expect fun udatpgOpen(locale: Pcstr, perrorcode: MutPtr): MutPtr

public expect fun udatpgOpenBaseSkeletons(dtpg: ConstPtr, perrorcode: MutPtr): MutPtr

public expect fun udatpgOpenEmpty(perrorcode: MutPtr): MutPtr

public expect fun udatpgOpenSkeletons(dtpg: ConstPtr, perrorcode: MutPtr): MutPtr

public expect fun udatpgReplaceFieldTypes(dtpg: MutPtr, pattern: ConstPtr, patternlength: Int, skeleton: ConstPtr, skeletonlength: Int, dest: MutPtr, destcapacity: Int, perrorcode: MutPtr): Int

public expect fun udatpgReplaceFieldTypesWithOptions(dtpg: MutPtr, pattern: ConstPtr, patternlength: Int, skeleton: ConstPtr, skeletonlength: Int, options: UDateTimePatternMatchOptions, dest: MutPtr, destcapacity: Int, perrorcode: MutPtr): Int

public expect fun udatpgSetAppendItemFormat(dtpg: MutPtr, field: UDateTimePatternField, value: ConstPtr, length: Int)

public expect fun udatpgSetAppendItemName(dtpg: MutPtr, field: UDateTimePatternField, value: ConstPtr, length: Int)

public expect fun udatpgSetDateTimeFormat(dtpg: ConstPtr, dtformat: ConstPtr, length: Int)

public expect fun udatpgSetDecimal(dtpg: MutPtr, decimal: ConstPtr, length: Int)

public expect fun udtitvfmtClose(formatter: MutPtr)

public expect fun udtitvfmtCloseResult(uresult: MutPtr)

public expect fun udtitvfmtFormat(formatter: ConstPtr, fromdate: Double, todate: Double, result: MutPtr, resultcapacity: Int, position: MutPtr, status: MutPtr): Int

public expect fun udtitvfmtOpen(locale: Pcstr, skeleton: ConstPtr, skeletonlength: Int, tzid: ConstPtr, tzidlength: Int, status: MutPtr): MutPtr

public expect fun udtitvfmtOpenResult(ec: MutPtr): MutPtr

public expect fun udtitvfmtResultAsValue(uresult: ConstPtr, ec: MutPtr): MutPtr

public expect fun uenumClose(en: MutPtr)

public expect fun uenumCount(en: MutPtr, status: MutPtr): Int

public expect fun uenumNext(en: MutPtr, resultlength: MutPtr, status: MutPtr): Pcstr

public expect fun uenumOpenCharStringsEnumeration(strings: ConstPtr, count: Int, ec: MutPtr): MutPtr

public expect fun uenumOpenUcharStringsEnumeration(strings: ConstPtr, count: Int, ec: MutPtr): MutPtr

public expect fun uenumReset(en: MutPtr, status: MutPtr)

public expect fun uenumUnext(en: MutPtr, resultlength: MutPtr, status: MutPtr): MutPtr

public expect fun ufieldpositerClose(fpositer: MutPtr)

public expect fun ufieldpositerNext(fpositer: MutPtr, beginindex: MutPtr, endindex: MutPtr): Int

public expect fun ufieldpositerOpen(status: MutPtr): MutPtr

public expect fun ufmtClose(fmt: MutPtr)

public expect fun ufmtGetArrayItemByIndex(fmt: MutPtr, n: Int, status: MutPtr): MutPtr

public expect fun ufmtGetArrayLength(fmt: ConstPtr, status: MutPtr): Int

public expect fun ufmtGetDate(fmt: ConstPtr, status: MutPtr): Double

public expect fun ufmtGetDecNumChars(fmt: MutPtr, len: MutPtr, status: MutPtr): Pcstr

public expect fun ufmtGetDouble(fmt: MutPtr, status: MutPtr): Double

public expect fun ufmtGetInt64(fmt: MutPtr, status: MutPtr): Long

public expect fun ufmtGetLong(fmt: MutPtr, status: MutPtr): Int

public expect fun ufmtGetObject(fmt: ConstPtr, status: MutPtr): MutPtr

public expect fun ufmtGetType(fmt: ConstPtr, status: MutPtr): UFormattableType

public expect fun ufmtGetUchars(fmt: MutPtr, len: MutPtr, status: MutPtr): MutPtr

public expect fun ufmtIsNumeric(fmt: ConstPtr): Byte

public expect fun ufmtOpen(status: MutPtr): MutPtr

public expect fun ufmtvalGetString(ufmtval: ConstPtr, plength: MutPtr, ec: MutPtr): MutPtr

public expect fun ufmtvalNextPosition(ufmtval: ConstPtr, ucfpos: MutPtr, ec: MutPtr): Byte

public expect fun ugenderGetInstance(locale: Pcstr, status: MutPtr): MutPtr

public expect fun ugenderGetListGender(genderinfo: ConstPtr, genders: ConstPtr, size: Int, status: MutPtr): UGender

public expect fun uidnaClose(idna: MutPtr)

public expect fun uidnaLabelToAscii(idna: ConstPtr, label: ConstPtr, length: Int, dest: MutPtr, capacity: Int, pinfo: MutPtr, perrorcode: MutPtr): Int

public expect fun uidnaLabelToAsciiUtf8(idna: ConstPtr, label: Pcstr, length: Int, dest: Pcstr, capacity: Int, pinfo: MutPtr, perrorcode: MutPtr): Int

public expect fun uidnaLabelToUnicode(idna: ConstPtr, label: ConstPtr, length: Int, dest: MutPtr, capacity: Int, pinfo: MutPtr, perrorcode: MutPtr): Int

public expect fun uidnaLabelToUnicodeUtf8(idna: ConstPtr, label: Pcstr, length: Int, dest: Pcstr, capacity: Int, pinfo: MutPtr, perrorcode: MutPtr): Int

public expect fun uidnaNameToAscii(idna: ConstPtr, name: ConstPtr, length: Int, dest: MutPtr, capacity: Int, pinfo: MutPtr, perrorcode: MutPtr): Int

public expect fun uidnaNameToAsciiUtf8(idna: ConstPtr, name: Pcstr, length: Int, dest: Pcstr, capacity: Int, pinfo: MutPtr, perrorcode: MutPtr): Int

public expect fun uidnaNameToUnicode(idna: ConstPtr, name: ConstPtr, length: Int, dest: MutPtr, capacity: Int, pinfo: MutPtr, perrorcode: MutPtr): Int

public expect fun uidnaNameToUnicodeUtf8(idna: ConstPtr, name: Pcstr, length: Int, dest: Pcstr, capacity: Int, pinfo: MutPtr, perrorcode: MutPtr): Int

public expect fun uidnaOpenUts46(options: UInt, perrorcode: MutPtr): MutPtr

public expect fun uiterCurrent32(iter: MutPtr): Int

public expect fun uiterGetState(iter: ConstPtr): UInt

public expect fun uiterNext32(iter: MutPtr): Int

public expect fun uiterPrevious32(iter: MutPtr): Int

public expect fun uiterSetState(iter: MutPtr, state: UInt, perrorcode: MutPtr)

public expect fun uiterSetString(iter: MutPtr, s: ConstPtr, length: Int)

public expect fun uiterSetUtf16Be(iter: MutPtr, s: Pcstr, length: Int)

public expect fun uiterSetUtf8(iter: MutPtr, s: Pcstr, length: Int)

public expect fun uldnClose(ldn: MutPtr)

public expect fun uldnGetContext(ldn: ConstPtr, type: UDisplayContextType, perrorcode: MutPtr): UDisplayContext

public expect fun uldnGetDialectHandling(ldn: ConstPtr): UDialectHandling

public expect fun uldnGetLocale(ldn: ConstPtr): Pcstr

public expect fun uldnKeyDisplayName(ldn: ConstPtr, key: Pcstr, result: MutPtr, maxresultsize: Int, perrorcode: MutPtr): Int

public expect fun uldnKeyValueDisplayName(ldn: ConstPtr, key: Pcstr, value: Pcstr, result: MutPtr, maxresultsize: Int, perrorcode: MutPtr): Int

public expect fun uldnLanguageDisplayName(ldn: ConstPtr, lang: Pcstr, result: MutPtr, maxresultsize: Int, perrorcode: MutPtr): Int

public expect fun uldnLocaleDisplayName(ldn: ConstPtr, locale: Pcstr, result: MutPtr, maxresultsize: Int, perrorcode: MutPtr): Int

public expect fun uldnOpen(locale: Pcstr, dialecthandling: UDialectHandling, perrorcode: MutPtr): MutPtr

public expect fun uldnOpenForContext(locale: Pcstr, contexts: MutPtr, length: Int, perrorcode: MutPtr): MutPtr

public expect fun uldnRegionDisplayName(ldn: ConstPtr, region: Pcstr, result: MutPtr, maxresultsize: Int, perrorcode: MutPtr): Int

public expect fun uldnScriptCodeDisplayName(ldn: ConstPtr, scriptcode: UScriptCode, result: MutPtr, maxresultsize: Int, perrorcode: MutPtr): Int

public expect fun uldnScriptDisplayName(ldn: ConstPtr, script: Pcstr, result: MutPtr, maxresultsize: Int, perrorcode: MutPtr): Int

public expect fun uldnVariantDisplayName(ldn: ConstPtr, variant: Pcstr, result: MutPtr, maxresultsize: Int, perrorcode: MutPtr): Int

public expect fun ulistfmtClose(listfmt: MutPtr)

public expect fun ulistfmtCloseResult(uresult: MutPtr)

public expect fun ulistfmtFormat(listfmt: ConstPtr, strings: ConstPtr, stringlengths: ConstPtr, stringcount: Int, result: MutPtr, resultcapacity: Int, status: MutPtr): Int

public expect fun ulistfmtFormatStringsToResult(listfmt: ConstPtr, strings: ConstPtr, stringlengths: ConstPtr, stringcount: Int, uresult: MutPtr, status: MutPtr)

public expect fun ulistfmtOpen(locale: Pcstr, status: MutPtr): MutPtr

public expect fun ulistfmtOpenForType(locale: Pcstr, type: UListFormatterType, width: UListFormatterWidth, status: MutPtr): MutPtr

public expect fun ulistfmtOpenResult(ec: MutPtr): MutPtr

public expect fun ulistfmtResultAsValue(uresult: ConstPtr, ec: MutPtr): MutPtr

public expect fun ulocAcceptLanguage(result: Pcstr, resultavailable: Int, outresult: MutPtr, acceptlist: ConstPtr, acceptlistcount: Int, availablelocales: MutPtr, status: MutPtr): Int

public expect fun ulocAcceptLanguageFromHttp(result: Pcstr, resultavailable: Int, outresult: MutPtr, httpacceptlanguage: Pcstr, availablelocales: MutPtr, status: MutPtr): Int

public expect fun ulocAddLikelySubtags(localeid: Pcstr, maximizedlocaleid: Pcstr, maximizedlocaleidcapacity: Int, err: MutPtr): Int

public expect fun ulocCanonicalize(localeid: Pcstr, name: Pcstr, namecapacity: Int, err: MutPtr): Int

public expect fun ulocCountAvailable(): Int

public expect fun ulocForLanguageTag(langtag: Pcstr, localeid: Pcstr, localeidcapacity: Int, parsedlength: MutPtr, err: MutPtr): Int

public expect fun ulocGetAvailable(n: Int): Pcstr

public expect fun ulocGetBaseName(localeid: Pcstr, name: Pcstr, namecapacity: Int, err: MutPtr): Int

public expect fun ulocGetCharacterOrientation(localeid: Pcstr, status: MutPtr): ULayoutType

public expect fun ulocGetCountry(localeid: Pcstr, country: Pcstr, countrycapacity: Int, err: MutPtr): Int

public expect fun ulocGetDefault(): Pcstr

public expect fun ulocGetDisplayCountry(locale: Pcstr, displaylocale: Pcstr, country: MutPtr, countrycapacity: Int, status: MutPtr): Int

public expect fun ulocGetDisplayKeyword(keyword: Pcstr, displaylocale: Pcstr, dest: MutPtr, destcapacity: Int, status: MutPtr): Int

public expect fun ulocGetDisplayKeywordValue(locale: Pcstr, keyword: Pcstr, displaylocale: Pcstr, dest: MutPtr, destcapacity: Int, status: MutPtr): Int

public expect fun ulocGetDisplayLanguage(locale: Pcstr, displaylocale: Pcstr, language: MutPtr, languagecapacity: Int, status: MutPtr): Int

public expect fun ulocGetDisplayName(localeid: Pcstr, inlocaleid: Pcstr, result: MutPtr, maxresultsize: Int, err: MutPtr): Int

public expect fun ulocGetDisplayScript(locale: Pcstr, displaylocale: Pcstr, script: MutPtr, scriptcapacity: Int, status: MutPtr): Int

public expect fun ulocGetDisplayVariant(locale: Pcstr, displaylocale: Pcstr, variant: MutPtr, variantcapacity: Int, status: MutPtr): Int

public expect fun ulocGetIso3Country(localeid: Pcstr): Pcstr

public expect fun ulocGetIso3Language(localeid: Pcstr): Pcstr

public expect fun ulocGetIsocountries(): MutPtr

public expect fun ulocGetIsolanguages(): MutPtr

public expect fun ulocGetKeywordValue(localeid: Pcstr, keywordname: Pcstr, buffer: Pcstr, buffercapacity: Int, status: MutPtr): Int

public expect fun ulocGetLcid(localeid: Pcstr): UInt

public expect fun ulocGetLanguage(localeid: Pcstr, language: Pcstr, languagecapacity: Int, err: MutPtr): Int

public expect fun ulocGetLineOrientation(localeid: Pcstr, status: MutPtr): ULayoutType

public expect fun ulocGetLocaleForLcid(hostid: UInt, locale: Pcstr, localecapacity: Int, status: MutPtr): Int

public expect fun ulocGetName(localeid: Pcstr, name: Pcstr, namecapacity: Int, err: MutPtr): Int

public expect fun ulocGetParent(localeid: Pcstr, parent: Pcstr, parentcapacity: Int, err: MutPtr): Int

public expect fun ulocGetScript(localeid: Pcstr, script: Pcstr, scriptcapacity: Int, err: MutPtr): Int

public expect fun ulocGetVariant(localeid: Pcstr, variant: Pcstr, variantcapacity: Int, err: MutPtr): Int

public expect fun ulocIsRightToLeft(locale: Pcstr): Byte

public expect fun ulocMinimizeSubtags(localeid: Pcstr, minimizedlocaleid: Pcstr, minimizedlocaleidcapacity: Int, err: MutPtr): Int

public expect fun ulocOpenAvailableByType(type: ULocAvailableType, status: MutPtr): MutPtr

public expect fun ulocOpenKeywords(localeid: Pcstr, status: MutPtr): MutPtr

public expect fun ulocSetDefault(localeid: Pcstr, status: MutPtr)

public expect fun ulocSetKeywordValue(keywordname: Pcstr, keywordvalue: Pcstr, buffer: Pcstr, buffercapacity: Int, status: MutPtr): Int

public expect fun ulocToLanguageTag(localeid: Pcstr, langtag: Pcstr, langtagcapacity: Int, strict: Byte, err: MutPtr): Int

public expect fun ulocToLegacyKey(keyword: Pcstr): Pcstr

public expect fun ulocToLegacyType(keyword: Pcstr, value: Pcstr): Pcstr

public expect fun ulocToUnicodeLocaleKey(keyword: Pcstr): Pcstr

public expect fun ulocToUnicodeLocaleType(keyword: Pcstr, value: Pcstr): Pcstr

public expect fun ulocdataClose(uld: MutPtr)

public expect fun ulocdataGetCldrversion(versionarray: MutPtr, status: MutPtr)

public expect fun ulocdataGetDelimiter(uld: MutPtr, type: ULocaleDataDelimiterType, result: MutPtr, resultlength: Int, status: MutPtr): Int

public expect fun ulocdataGetExemplarSet(uld: MutPtr, fillin: MutPtr, options: UInt, extype: ULocaleDataExemplarSetType, status: MutPtr): MutPtr

public expect fun ulocdataGetLocaleDisplayPattern(uld: MutPtr, pattern: MutPtr, patterncapacity: Int, status: MutPtr): Int

public expect fun ulocdataGetLocaleSeparator(uld: MutPtr, separator: MutPtr, separatorcapacity: Int, status: MutPtr): Int

public expect fun ulocdataGetMeasurementSystem(localeid: Pcstr, status: MutPtr): UMeasurementSystem

public expect fun ulocdataGetNoSubstitute(uld: MutPtr): Byte

public expect fun ulocdataGetPaperSize(localeid: Pcstr, height: MutPtr, width: MutPtr, status: MutPtr)

public expect fun ulocdataOpen(localeid: Pcstr, status: MutPtr): MutPtr

public expect fun ulocdataSetNoSubstitute(uld: MutPtr, setting: Byte)

public expect fun umsgApplyPattern(fmt: MutPtr, pattern: ConstPtr, patternlength: Int, parseerror: MutPtr, status: MutPtr)

public expect fun umsgAutoQuoteApostrophe(pattern: ConstPtr, patternlength: Int, dest: MutPtr, destcapacity: Int, ec: MutPtr): Int

public expect fun umsgClone(fmt: ConstPtr, status: MutPtr): MutPtr

public expect fun umsgClose(format: MutPtr)

public expect fun umsgFormat(fmt: ConstPtr, result: MutPtr, resultlength: Int, status: MutPtr, vararg variadicArgs: Long): Int

public expect fun umsgGetLocale(fmt: ConstPtr): Pcstr

public expect fun umsgOpen(pattern: ConstPtr, patternlength: Int, locale: Pcstr, parseerror: MutPtr, status: MutPtr): MutPtr

public expect fun umsgParse(fmt: ConstPtr, source: ConstPtr, sourcelength: Int, count: MutPtr, status: MutPtr, vararg variadicArgs: Long)

public expect fun umsgSetLocale(fmt: MutPtr, locale: Pcstr)

public expect fun umsgToPattern(fmt: ConstPtr, result: MutPtr, resultlength: Int, status: MutPtr): Int

public expect fun umsgVformat(fmt: ConstPtr, result: MutPtr, resultlength: Int, ap: MutPtr, status: MutPtr): Int

public expect fun umsgVparse(fmt: ConstPtr, source: ConstPtr, sourcelength: Int, count: MutPtr, ap: MutPtr, status: MutPtr)

public expect fun umutablecptrieBuildImmutable(trie: MutPtr, type: UCPTrieType, valuewidth: UCPTrieValueWidth, perrorcode: MutPtr): MutPtr

public expect fun umutablecptrieClone(other: ConstPtr, perrorcode: MutPtr): MutPtr

public expect fun umutablecptrieClose(trie: MutPtr)

public expect fun umutablecptrieFromUcpmap(map: ConstPtr, perrorcode: MutPtr): MutPtr

public expect fun umutablecptrieFromUcptrie(trie: ConstPtr, perrorcode: MutPtr): MutPtr

public expect fun umutablecptrieGet(trie: ConstPtr, c: Int): UInt

public expect fun umutablecptrieGetRange(trie: ConstPtr, start: Int, option: UCPMapRangeOption, surrogatevalue: UInt, filter: MutPtr, context: ConstPtr, pvalue: MutPtr): Int

public expect fun umutablecptrieOpen(initialvalue: UInt, errorvalue: UInt, perrorcode: MutPtr): MutPtr

public expect fun umutablecptrieSet(trie: MutPtr, c: Int, value: UInt, perrorcode: MutPtr)

public expect fun umutablecptrieSetRange(trie: MutPtr, start: Int, end: Int, value: UInt, perrorcode: MutPtr)

public expect fun unorm2Append(norm2: ConstPtr, first: MutPtr, firstlength: Int, firstcapacity: Int, second: ConstPtr, secondlength: Int, perrorcode: MutPtr): Int

public expect fun unorm2Close(norm2: MutPtr)

public expect fun unorm2ComposePair(norm2: ConstPtr, a: Int, b: Int): Int

public expect fun unorm2GetCombiningClass(norm2: ConstPtr, c: Int): UByte

public expect fun unorm2GetDecomposition(norm2: ConstPtr, c: Int, decomposition: MutPtr, capacity: Int, perrorcode: MutPtr): Int

public expect fun unorm2GetInstance(packagename: Pcstr, name: Pcstr, mode: UNormalization2Mode, perrorcode: MutPtr): MutPtr

public expect fun unorm2GetNfcinstance(perrorcode: MutPtr): MutPtr

public expect fun unorm2GetNfdinstance(perrorcode: MutPtr): MutPtr

public expect fun unorm2GetNfkccasefoldInstance(perrorcode: MutPtr): MutPtr

public expect fun unorm2GetNfkcinstance(perrorcode: MutPtr): MutPtr

public expect fun unorm2GetNfkdinstance(perrorcode: MutPtr): MutPtr

public expect fun unorm2GetRawDecomposition(norm2: ConstPtr, c: Int, decomposition: MutPtr, capacity: Int, perrorcode: MutPtr): Int

public expect fun unorm2HasBoundaryAfter(norm2: ConstPtr, c: Int): Byte

public expect fun unorm2HasBoundaryBefore(norm2: ConstPtr, c: Int): Byte

public expect fun unorm2IsInert(norm2: ConstPtr, c: Int): Byte

public expect fun unorm2IsNormalized(norm2: ConstPtr, s: ConstPtr, length: Int, perrorcode: MutPtr): Byte

public expect fun unorm2Normalize(norm2: ConstPtr, src: ConstPtr, length: Int, dest: MutPtr, capacity: Int, perrorcode: MutPtr): Int

public expect fun unorm2NormalizeSecondAndAppend(norm2: ConstPtr, first: MutPtr, firstlength: Int, firstcapacity: Int, second: ConstPtr, secondlength: Int, perrorcode: MutPtr): Int

public expect fun unorm2OpenFiltered(norm2: ConstPtr, filterset: ConstPtr, perrorcode: MutPtr): MutPtr

public expect fun unorm2QuickCheck(norm2: ConstPtr, s: ConstPtr, length: Int, perrorcode: MutPtr): UNormalizationCheckResult

public expect fun unorm2SpanQuickCheckYes(norm2: ConstPtr, s: ConstPtr, length: Int, perrorcode: MutPtr): Int

public expect fun unormCompare(s1: ConstPtr, length1: Int, s2: ConstPtr, length2: Int, options: UInt, perrorcode: MutPtr): Int

public expect fun unumApplyPattern(format: MutPtr, localized: Byte, pattern: ConstPtr, patternlength: Int, parseerror: MutPtr, status: MutPtr)

public expect fun unumClone(fmt: ConstPtr, status: MutPtr): MutPtr

public expect fun unumClose(fmt: MutPtr)

public expect fun unumCountAvailable(): Int

public expect fun unumFormat(fmt: ConstPtr, number: Int, result: MutPtr, resultlength: Int, pos: MutPtr, status: MutPtr): Int

public expect fun unumFormatDecimal(fmt: ConstPtr, number: Pcstr, length: Int, result: MutPtr, resultlength: Int, pos: MutPtr, status: MutPtr): Int

public expect fun unumFormatDouble(fmt: ConstPtr, number: Double, result: MutPtr, resultlength: Int, pos: MutPtr, status: MutPtr): Int

public expect fun unumFormatDoubleCurrency(fmt: ConstPtr, number: Double, currency: MutPtr, result: MutPtr, resultlength: Int, pos: MutPtr, status: MutPtr): Int

public expect fun unumFormatDoubleForFields(format: ConstPtr, number: Double, result: MutPtr, resultlength: Int, fpositer: MutPtr, status: MutPtr): Int

public expect fun unumFormatInt64(fmt: ConstPtr, number: Long, result: MutPtr, resultlength: Int, pos: MutPtr, status: MutPtr): Int

public expect fun unumFormatUformattable(fmt: ConstPtr, number: ConstPtr, result: MutPtr, resultlength: Int, pos: MutPtr, status: MutPtr): Int

public expect fun unumGetAttribute(fmt: ConstPtr, attr: UNumberFormatAttribute): Int

public expect fun unumGetAvailable(localeindex: Int): Pcstr

public expect fun unumGetContext(fmt: ConstPtr, type: UDisplayContextType, status: MutPtr): UDisplayContext

public expect fun unumGetDoubleAttribute(fmt: ConstPtr, attr: UNumberFormatAttribute): Double

public expect fun unumGetLocaleByType(fmt: ConstPtr, type: ULocDataLocaleType, status: MutPtr): Pcstr

public expect fun unumGetSymbol(fmt: ConstPtr, symbol: UNumberFormatSymbol, buffer: MutPtr, size: Int, status: MutPtr): Int

public expect fun unumGetTextAttribute(fmt: ConstPtr, tag: UNumberFormatTextAttribute, result: MutPtr, resultlength: Int, status: MutPtr): Int

public expect fun unumOpen(style: UNumberFormatStyle, pattern: ConstPtr, patternlength: Int, locale: Pcstr, parseerr: MutPtr, status: MutPtr): MutPtr

public expect fun unumParse(fmt: ConstPtr, text: ConstPtr, textlength: Int, parsepos: MutPtr, status: MutPtr): Int

public expect fun unumParseDecimal(fmt: ConstPtr, text: ConstPtr, textlength: Int, parsepos: MutPtr, outbuf: Pcstr, outbuflength: Int, status: MutPtr): Int

public expect fun unumParseDouble(fmt: ConstPtr, text: ConstPtr, textlength: Int, parsepos: MutPtr, status: MutPtr): Double

public expect fun unumParseDoubleCurrency(fmt: ConstPtr, text: ConstPtr, textlength: Int, parsepos: MutPtr, currency: MutPtr, status: MutPtr): Double

public expect fun unumParseInt64(fmt: ConstPtr, text: ConstPtr, textlength: Int, parsepos: MutPtr, status: MutPtr): Long

public expect fun unumParseToUformattable(fmt: ConstPtr, result: MutPtr, text: ConstPtr, textlength: Int, parsepos: MutPtr, status: MutPtr): MutPtr

public expect fun unumSetAttribute(fmt: MutPtr, attr: UNumberFormatAttribute, newvalue: Int)

public expect fun unumSetContext(fmt: MutPtr, value: UDisplayContext, status: MutPtr)

public expect fun unumSetDoubleAttribute(fmt: MutPtr, attr: UNumberFormatAttribute, newvalue: Double)

public expect fun unumSetSymbol(fmt: MutPtr, symbol: UNumberFormatSymbol, value: ConstPtr, length: Int, status: MutPtr)

public expect fun unumSetTextAttribute(fmt: MutPtr, tag: UNumberFormatTextAttribute, newvalue: ConstPtr, newvaluelength: Int, status: MutPtr)

public expect fun unumToPattern(fmt: ConstPtr, ispatternlocalized: Byte, result: MutPtr, resultlength: Int, status: MutPtr): Int

public expect fun unumfClose(uformatter: MutPtr)

public expect fun unumfCloseResult(uresult: MutPtr)

public expect fun unumfFormatDecimal(uformatter: ConstPtr, value: Pcstr, valuelen: Int, uresult: MutPtr, ec: MutPtr)

public expect fun unumfFormatDouble(uformatter: ConstPtr, value: Double, uresult: MutPtr, ec: MutPtr)

public expect fun unumfFormatInt(uformatter: ConstPtr, value: Long, uresult: MutPtr, ec: MutPtr)

public expect fun unumfOpenForSkeletonAndLocale(skeleton: ConstPtr, skeletonlen: Int, locale: Pcstr, ec: MutPtr): MutPtr

public expect fun unumfOpenForSkeletonAndLocaleWithError(skeleton: ConstPtr, skeletonlen: Int, locale: Pcstr, perror: MutPtr, ec: MutPtr): MutPtr

public expect fun unumfOpenResult(ec: MutPtr): MutPtr

public expect fun unumfResultAsValue(uresult: ConstPtr, ec: MutPtr): MutPtr

public expect fun unumfResultGetAllFieldPositions(uresult: ConstPtr, ufpositer: MutPtr, ec: MutPtr)

public expect fun unumfResultNextFieldPosition(uresult: ConstPtr, ufpos: MutPtr, ec: MutPtr): Byte

public expect fun unumfResultToString(uresult: ConstPtr, buffer: MutPtr, buffercapacity: Int, ec: MutPtr): Int

public expect fun unumsysClose(unumsys: MutPtr)

public expect fun unumsysGetDescription(unumsys: ConstPtr, result: MutPtr, resultlength: Int, status: MutPtr): Int

public expect fun unumsysGetName(unumsys: ConstPtr): Pcstr

public expect fun unumsysGetRadix(unumsys: ConstPtr): Int

public expect fun unumsysIsAlgorithmic(unumsys: ConstPtr): Byte

public expect fun unumsysOpen(locale: Pcstr, status: MutPtr): MutPtr

public expect fun unumsysOpenAvailableNames(status: MutPtr): MutPtr

public expect fun unumsysOpenByName(name: Pcstr, status: MutPtr): MutPtr

public expect fun uplrulesClose(uplrules: MutPtr)

public expect fun uplrulesGetKeywords(uplrules: ConstPtr, status: MutPtr): MutPtr

public expect fun uplrulesOpen(locale: Pcstr, status: MutPtr): MutPtr

public expect fun uplrulesOpenForType(locale: Pcstr, type: UPluralType, status: MutPtr): MutPtr

public expect fun uplrulesSelect(uplrules: ConstPtr, number: Double, keyword: MutPtr, capacity: Int, status: MutPtr): Int

public expect fun uplrulesSelectFormatted(uplrules: ConstPtr, number: ConstPtr, keyword: MutPtr, capacity: Int, status: MutPtr): Int

public expect fun uregexAppendReplacement(regexp: MutPtr, replacementtext: ConstPtr, replacementlength: Int, destbuf: MutPtr, destcapacity: MutPtr, status: MutPtr): Int

public expect fun uregexAppendReplacementUtext(regexp: MutPtr, replacementtext: MutPtr, dest: MutPtr, status: MutPtr)

public expect fun uregexAppendTail(regexp: MutPtr, destbuf: MutPtr, destcapacity: MutPtr, status: MutPtr): Int

public expect fun uregexAppendTailUtext(regexp: MutPtr, dest: MutPtr, status: MutPtr): MutPtr

public expect fun uregexClone(regexp: ConstPtr, status: MutPtr): MutPtr

public expect fun uregexClose(regexp: MutPtr)

public expect fun uregexEnd(regexp: MutPtr, groupnum: Int, status: MutPtr): Int

public expect fun uregexEnd64(regexp: MutPtr, groupnum: Int, status: MutPtr): Long

public expect fun uregexFind(regexp: MutPtr, startindex: Int, status: MutPtr): Byte

public expect fun uregexFind64(regexp: MutPtr, startindex: Long, status: MutPtr): Byte

public expect fun uregexFindNext(regexp: MutPtr, status: MutPtr): Byte

public expect fun uregexFlags(regexp: ConstPtr, status: MutPtr): Int

public expect fun uregexGetFindProgressCallback(regexp: ConstPtr, callback: MutPtr, context: ConstPtr, status: MutPtr)

public expect fun uregexGetMatchCallback(regexp: ConstPtr, callback: MutPtr, context: ConstPtr, status: MutPtr)

public expect fun uregexGetStackLimit(regexp: ConstPtr, status: MutPtr): Int

public expect fun uregexGetText(regexp: MutPtr, textlength: MutPtr, status: MutPtr): MutPtr

public expect fun uregexGetTimeLimit(regexp: ConstPtr, status: MutPtr): Int

public expect fun uregexGetUtext(regexp: MutPtr, dest: MutPtr, status: MutPtr): MutPtr

public expect fun uregexGroup(regexp: MutPtr, groupnum: Int, dest: MutPtr, destcapacity: Int, status: MutPtr): Int

public expect fun uregexGroupCount(regexp: MutPtr, status: MutPtr): Int

public expect fun uregexGroupNumberFromCname(regexp: MutPtr, groupname: Pcstr, namelength: Int, status: MutPtr): Int

public expect fun uregexGroupNumberFromName(regexp: MutPtr, groupname: ConstPtr, namelength: Int, status: MutPtr): Int

public expect fun uregexGroupUtext(regexp: MutPtr, groupnum: Int, dest: MutPtr, grouplength: MutPtr, status: MutPtr): MutPtr

public expect fun uregexHasAnchoringBounds(regexp: ConstPtr, status: MutPtr): Byte

public expect fun uregexHasTransparentBounds(regexp: ConstPtr, status: MutPtr): Byte

public expect fun uregexHitEnd(regexp: ConstPtr, status: MutPtr): Byte

public expect fun uregexLookingAt(regexp: MutPtr, startindex: Int, status: MutPtr): Byte

public expect fun uregexLookingAt64(regexp: MutPtr, startindex: Long, status: MutPtr): Byte

public expect fun uregexMatches(regexp: MutPtr, startindex: Int, status: MutPtr): Byte

public expect fun uregexMatches64(regexp: MutPtr, startindex: Long, status: MutPtr): Byte

public expect fun uregexOpen(pattern: ConstPtr, patternlength: Int, flags: UInt, pe: MutPtr, status: MutPtr): MutPtr

public expect fun uregexOpenC(pattern: Pcstr, flags: UInt, pe: MutPtr, status: MutPtr): MutPtr

public expect fun uregexOpenUtext(pattern: MutPtr, flags: UInt, pe: MutPtr, status: MutPtr): MutPtr

public expect fun uregexPattern(regexp: ConstPtr, patlength: MutPtr, status: MutPtr): MutPtr

public expect fun uregexPatternUtext(regexp: ConstPtr, status: MutPtr): MutPtr

public expect fun uregexRefreshUtext(regexp: MutPtr, text: MutPtr, status: MutPtr)

public expect fun uregexRegionEnd(regexp: ConstPtr, status: MutPtr): Int

public expect fun uregexRegionEnd64(regexp: ConstPtr, status: MutPtr): Long

public expect fun uregexRegionStart(regexp: ConstPtr, status: MutPtr): Int

public expect fun uregexRegionStart64(regexp: ConstPtr, status: MutPtr): Long

public expect fun uregexReplaceAll(regexp: MutPtr, replacementtext: ConstPtr, replacementlength: Int, destbuf: MutPtr, destcapacity: Int, status: MutPtr): Int

public expect fun uregexReplaceAllUtext(regexp: MutPtr, replacement: MutPtr, dest: MutPtr, status: MutPtr): MutPtr

public expect fun uregexReplaceFirst(regexp: MutPtr, replacementtext: ConstPtr, replacementlength: Int, destbuf: MutPtr, destcapacity: Int, status: MutPtr): Int

public expect fun uregexReplaceFirstUtext(regexp: MutPtr, replacement: MutPtr, dest: MutPtr, status: MutPtr): MutPtr

public expect fun uregexRequireEnd(regexp: ConstPtr, status: MutPtr): Byte

public expect fun uregexReset(regexp: MutPtr, index: Int, status: MutPtr)

public expect fun uregexReset64(regexp: MutPtr, index: Long, status: MutPtr)

public expect fun uregexSetFindProgressCallback(regexp: MutPtr, callback: URegexFindProgressCallback, context: ConstPtr, status: MutPtr)

public expect fun uregexSetMatchCallback(regexp: MutPtr, callback: URegexMatchCallback, context: ConstPtr, status: MutPtr)

public expect fun uregexSetRegion(regexp: MutPtr, regionstart: Int, regionlimit: Int, status: MutPtr)

public expect fun uregexSetRegion64(regexp: MutPtr, regionstart: Long, regionlimit: Long, status: MutPtr)

public expect fun uregexSetRegionAndStart(regexp: MutPtr, regionstart: Long, regionlimit: Long, startindex: Long, status: MutPtr)

public expect fun uregexSetStackLimit(regexp: MutPtr, limit: Int, status: MutPtr)

public expect fun uregexSetText(regexp: MutPtr, text: ConstPtr, textlength: Int, status: MutPtr)

public expect fun uregexSetTimeLimit(regexp: MutPtr, limit: Int, status: MutPtr)

public expect fun uregexSetUtext(regexp: MutPtr, text: MutPtr, status: MutPtr)

public expect fun uregexSplit(regexp: MutPtr, destbuf: MutPtr, destcapacity: Int, requiredcapacity: MutPtr, destfields: MutPtr, destfieldscapacity: Int, status: MutPtr): Int

public expect fun uregexSplitUtext(regexp: MutPtr, destfields: MutPtr, destfieldscapacity: Int, status: MutPtr): Int

public expect fun uregexStart(regexp: MutPtr, groupnum: Int, status: MutPtr): Int

public expect fun uregexStart64(regexp: MutPtr, groupnum: Int, status: MutPtr): Long

public expect fun uregexUseAnchoringBounds(regexp: MutPtr, b: Byte, status: MutPtr)

public expect fun uregexUseTransparentBounds(regexp: MutPtr, b: Byte, status: MutPtr)

public expect fun uregionAreEqual(uregion: ConstPtr, otherregion: ConstPtr): Byte

public expect fun uregionContains(uregion: ConstPtr, otherregion: ConstPtr): Byte

public expect fun uregionGetAvailable(type: URegionType, status: MutPtr): MutPtr

public expect fun uregionGetContainedRegions(uregion: ConstPtr, status: MutPtr): MutPtr

public expect fun uregionGetContainedRegionsOfType(uregion: ConstPtr, type: URegionType, status: MutPtr): MutPtr

public expect fun uregionGetContainingRegion(uregion: ConstPtr): MutPtr

public expect fun uregionGetContainingRegionOfType(uregion: ConstPtr, type: URegionType): MutPtr

public expect fun uregionGetNumericCode(uregion: ConstPtr): Int
