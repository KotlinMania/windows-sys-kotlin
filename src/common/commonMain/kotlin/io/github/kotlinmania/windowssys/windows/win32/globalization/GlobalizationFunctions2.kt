package io.github.kotlinmania.windowssys.windows.win32.globalization

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Pcstr

public expect fun ucnvFromUcountPending(cnv: ConstPtr<UConverter>, status: MutPtr<UErrorCode>): Int

public expect fun ucnvFromUnicode(converter: MutPtr<UConverter>, target: MutPtr<MutPtr<Byte>>, targetlimit: Pcstr, source: ConstPtr<ConstPtr<UShort>>, sourcelimit: ConstPtr<UShort>, offsets: MutPtr<Int>, flush: Byte, err: MutPtr<UErrorCode>)

public expect fun ucnvGetAlias(alias: Pcstr, n: UShort, perrorcode: MutPtr<UErrorCode>): Pcstr

public expect fun ucnvGetAliases(alias: Pcstr, aliases: ConstPtr<ConstPtr<Byte>>, perrorcode: MutPtr<UErrorCode>)

public expect fun ucnvGetAvailableName(n: Int): Pcstr

public expect fun ucnvGetCcsid(converter: ConstPtr<UConverter>, err: MutPtr<UErrorCode>): Int

public expect fun ucnvGetCanonicalName(alias: Pcstr, standard: Pcstr, perrorcode: MutPtr<UErrorCode>): Pcstr

public expect fun ucnvGetDefaultName(): Pcstr

public expect fun ucnvGetDisplayName(converter: ConstPtr<UConverter>, displaylocale: Pcstr, displayname: MutPtr<UShort>, displaynamecapacity: Int, err: MutPtr<UErrorCode>): Int

public expect fun ucnvGetFromUcallBack(converter: ConstPtr<UConverter>, action: MutPtr<UConverterFromUCallback>, context: ConstPtr<ConstPtr<CVoid>>)

public expect fun ucnvGetInvalidChars(converter: ConstPtr<UConverter>, errbytes: Pcstr, len: MutPtr<Byte>, err: MutPtr<UErrorCode>)

public expect fun ucnvGetInvalidUchars(converter: ConstPtr<UConverter>, erruchars: MutPtr<UShort>, len: MutPtr<Byte>, err: MutPtr<UErrorCode>)

public expect fun ucnvGetMaxCharSize(converter: ConstPtr<UConverter>): Byte

public expect fun ucnvGetMinCharSize(converter: ConstPtr<UConverter>): Byte

public expect fun ucnvGetName(converter: ConstPtr<UConverter>, err: MutPtr<UErrorCode>): Pcstr

public expect fun ucnvGetNextUchar(converter: MutPtr<UConverter>, source: ConstPtr<ConstPtr<Byte>>, sourcelimit: Pcstr, err: MutPtr<UErrorCode>): Int

public expect fun ucnvGetPlatform(converter: ConstPtr<UConverter>, err: MutPtr<UErrorCode>): UConverterPlatform

public expect fun ucnvGetStandard(n: UShort, perrorcode: MutPtr<UErrorCode>): Pcstr

public expect fun ucnvGetStandardName(name: Pcstr, standard: Pcstr, perrorcode: MutPtr<UErrorCode>): Pcstr

public expect fun ucnvGetStarters(converter: ConstPtr<UConverter>, starters: MutPtr<Byte>, err: MutPtr<UErrorCode>)

public expect fun ucnvGetSubstChars(converter: ConstPtr<UConverter>, subchars: Pcstr, len: MutPtr<Byte>, err: MutPtr<UErrorCode>)

public expect fun ucnvGetToUcallBack(converter: ConstPtr<UConverter>, action: MutPtr<UConverterToUCallback>, context: ConstPtr<ConstPtr<CVoid>>)

public expect fun ucnvGetType(converter: ConstPtr<UConverter>): UConverterType

public expect fun ucnvGetUnicodeSet(cnv: ConstPtr<UConverter>, setfillin: MutPtr<USet>, whichset: UConverterUnicodeSet, perrorcode: MutPtr<UErrorCode>)

public expect fun ucnvIsAmbiguous(cnv: ConstPtr<UConverter>): Byte

public expect fun ucnvIsFixedWidth(cnv: MutPtr<UConverter>, status: MutPtr<UErrorCode>): Byte

public expect fun ucnvOpen(convertername: Pcstr, err: MutPtr<UErrorCode>): MutPtr<UConverter>

public expect fun ucnvOpenAllNames(perrorcode: MutPtr<UErrorCode>): MutPtr<UEnumeration>

public expect fun ucnvOpenCcsid(codepage: Int, platform: UConverterPlatform, err: MutPtr<UErrorCode>): MutPtr<UConverter>

public expect fun ucnvOpenPackage(packagename: Pcstr, convertername: Pcstr, err: MutPtr<UErrorCode>): MutPtr<UConverter>

public expect fun ucnvOpenStandardNames(convname: Pcstr, standard: Pcstr, perrorcode: MutPtr<UErrorCode>): MutPtr<UEnumeration>

public expect fun ucnvOpenU(name: ConstPtr<UShort>, err: MutPtr<UErrorCode>): MutPtr<UConverter>

public expect fun ucnvReset(converter: MutPtr<UConverter>)

public expect fun ucnvResetFromUnicode(converter: MutPtr<UConverter>)

public expect fun ucnvResetToUnicode(converter: MutPtr<UConverter>)

public expect fun ucnvSafeClone(cnv: ConstPtr<UConverter>, stackbuffer: MutPtr<CVoid>, pbuffersize: MutPtr<Int>, status: MutPtr<UErrorCode>): MutPtr<UConverter>

public expect fun ucnvSetDefaultName(name: Pcstr)

public expect fun ucnvSetFallback(cnv: MutPtr<UConverter>, usesfallback: Byte)

public expect fun ucnvSetFromUcallBack(converter: MutPtr<UConverter>, newaction: UConverterFromUCallback, newcontext: ConstPtr<CVoid>, oldaction: MutPtr<UConverterFromUCallback>, oldcontext: ConstPtr<ConstPtr<CVoid>>, err: MutPtr<UErrorCode>)

public expect fun ucnvSetSubstChars(converter: MutPtr<UConverter>, subchars: Pcstr, len: Byte, err: MutPtr<UErrorCode>)

public expect fun ucnvSetSubstString(cnv: MutPtr<UConverter>, s: ConstPtr<UShort>, length: Int, err: MutPtr<UErrorCode>)

public expect fun ucnvSetToUcallBack(converter: MutPtr<UConverter>, newaction: UConverterToUCallback, newcontext: ConstPtr<CVoid>, oldaction: MutPtr<UConverterToUCallback>, oldcontext: ConstPtr<ConstPtr<CVoid>>, err: MutPtr<UErrorCode>)

public expect fun ucnvToAlgorithmic(algorithmictype: UConverterType, cnv: MutPtr<UConverter>, target: Pcstr, targetcapacity: Int, source: Pcstr, sourcelength: Int, perrorcode: MutPtr<UErrorCode>): Int

public expect fun ucnvToUchars(cnv: MutPtr<UConverter>, dest: MutPtr<UShort>, destcapacity: Int, src: Pcstr, srclength: Int, perrorcode: MutPtr<UErrorCode>): Int

public expect fun ucnvToUcountPending(cnv: ConstPtr<UConverter>, status: MutPtr<UErrorCode>): Int

public expect fun ucnvToUnicode(converter: MutPtr<UConverter>, target: MutPtr<MutPtr<UShort>>, targetlimit: ConstPtr<UShort>, source: ConstPtr<ConstPtr<Byte>>, sourcelimit: Pcstr, offsets: MutPtr<Int>, flush: Byte, err: MutPtr<UErrorCode>)

public expect fun ucnvUsesFallback(cnv: ConstPtr<UConverter>): Byte

public expect fun ucnvselClose(sel: MutPtr<UConverterSelector>)

public expect fun ucnvselOpen(converterlist: ConstPtr<ConstPtr<Byte>>, converterlistsize: Int, excludedcodepoints: ConstPtr<USet>, whichset: UConverterUnicodeSet, status: MutPtr<UErrorCode>): MutPtr<UConverterSelector>

public expect fun ucnvselOpenFromSerialized(buffer: ConstPtr<CVoid>, length: Int, status: MutPtr<UErrorCode>): MutPtr<UConverterSelector>

public expect fun ucnvselSelectForString(sel: ConstPtr<UConverterSelector>, s: ConstPtr<UShort>, length: Int, status: MutPtr<UErrorCode>): MutPtr<UEnumeration>

public expect fun ucnvselSelectForUtf8(sel: ConstPtr<UConverterSelector>, s: Pcstr, length: Int, status: MutPtr<UErrorCode>): MutPtr<UEnumeration>

public expect fun ucnvselSerialize(sel: ConstPtr<UConverterSelector>, buffer: MutPtr<CVoid>, buffercapacity: Int, status: MutPtr<UErrorCode>): Int

public expect fun ucolCloneBinary(coll: ConstPtr<UCollator>, buffer: MutPtr<UByte>, capacity: Int, status: MutPtr<UErrorCode>): Int

public expect fun ucolClose(coll: MutPtr<UCollator>)

public expect fun ucolCloseElements(elems: MutPtr<UCollationElements>)

public expect fun ucolCountAvailable(): Int

public expect fun ucolEqual(coll: ConstPtr<UCollator>, source: ConstPtr<UShort>, sourcelength: Int, target: ConstPtr<UShort>, targetlength: Int): Byte

public expect fun ucolGetAttribute(coll: ConstPtr<UCollator>, attr: UColAttribute, status: MutPtr<UErrorCode>): UColAttributeValue

public expect fun ucolGetAvailable(localeindex: Int): Pcstr

public expect fun ucolGetBound(source: ConstPtr<UByte>, sourcelength: Int, boundtype: UColBoundMode, nooflevels: UInt, result: MutPtr<UByte>, resultlength: Int, status: MutPtr<UErrorCode>): Int

public expect fun ucolGetContractionsAndExpansions(coll: ConstPtr<UCollator>, contractions: MutPtr<USet>, expansions: MutPtr<USet>, addprefixes: Byte, status: MutPtr<UErrorCode>)

public expect fun ucolGetDisplayName(objloc: Pcstr, disploc: Pcstr, result: MutPtr<UShort>, resultlength: Int, status: MutPtr<UErrorCode>): Int

public expect fun ucolGetEquivalentReorderCodes(reordercode: Int, dest: MutPtr<Int>, destcapacity: Int, perrorcode: MutPtr<UErrorCode>): Int

public expect fun ucolGetFunctionalEquivalent(result: Pcstr, resultcapacity: Int, keyword: Pcstr, locale: Pcstr, isavailable: MutPtr<Byte>, status: MutPtr<UErrorCode>): Int

public expect fun ucolGetKeywordValues(keyword: Pcstr, status: MutPtr<UErrorCode>): MutPtr<UEnumeration>

public expect fun ucolGetKeywordValuesForLocale(key: Pcstr, locale: Pcstr, commonlyused: Byte, status: MutPtr<UErrorCode>): MutPtr<UEnumeration>

public expect fun ucolGetKeywords(status: MutPtr<UErrorCode>): MutPtr<UEnumeration>

public expect fun ucolGetLocaleByType(coll: ConstPtr<UCollator>, type: ULocDataLocaleType, status: MutPtr<UErrorCode>): Pcstr

public expect fun ucolGetMaxExpansion(elems: ConstPtr<UCollationElements>, order: Int): Int

public expect fun ucolGetMaxVariable(coll: ConstPtr<UCollator>): UColReorderCode

public expect fun ucolGetOffset(elems: ConstPtr<UCollationElements>): Int

public expect fun ucolGetReorderCodes(coll: ConstPtr<UCollator>, dest: MutPtr<Int>, destcapacity: Int, perrorcode: MutPtr<UErrorCode>): Int

public expect fun ucolGetRules(coll: ConstPtr<UCollator>, length: MutPtr<Int>): MutPtr<UShort>

public expect fun ucolGetRulesEx(coll: ConstPtr<UCollator>, delta: UColRuleOption, buffer: MutPtr<UShort>, bufferlen: Int): Int

public expect fun ucolGetSortKey(coll: ConstPtr<UCollator>, source: ConstPtr<UShort>, sourcelength: Int, result: MutPtr<UByte>, resultlength: Int): Int

public expect fun ucolGetStrength(coll: ConstPtr<UCollator>): UColAttributeValue

public expect fun ucolGetTailoredSet(coll: ConstPtr<UCollator>, status: MutPtr<UErrorCode>): MutPtr<USet>

public expect fun ucolGetUcaversion(coll: ConstPtr<UCollator>, info: MutPtr<UByte>)

public expect fun ucolGetVariableTop(coll: ConstPtr<UCollator>, status: MutPtr<UErrorCode>): UInt

public expect fun ucolGetVersion(coll: ConstPtr<UCollator>, info: MutPtr<UByte>)

public expect fun ucolGreater(coll: ConstPtr<UCollator>, source: ConstPtr<UShort>, sourcelength: Int, target: ConstPtr<UShort>, targetlength: Int): Byte

public expect fun ucolGreaterOrEqual(coll: ConstPtr<UCollator>, source: ConstPtr<UShort>, sourcelength: Int, target: ConstPtr<UShort>, targetlength: Int): Byte

public expect fun ucolKeyHashCode(key: ConstPtr<UByte>, length: Int): Int

public expect fun ucolMergeSortkeys(src1: ConstPtr<UByte>, src1length: Int, src2: ConstPtr<UByte>, src2length: Int, dest: MutPtr<UByte>, destcapacity: Int): Int

public expect fun ucolNext(elems: MutPtr<UCollationElements>, status: MutPtr<UErrorCode>): Int

public expect fun ucolNextSortKeyPart(coll: ConstPtr<UCollator>, iter: MutPtr<UCharIterator>, state: MutPtr<UInt>, dest: MutPtr<UByte>, count: Int, status: MutPtr<UErrorCode>): Int

public expect fun ucolOpen(loc: Pcstr, status: MutPtr<UErrorCode>): MutPtr<UCollator>

public expect fun ucolOpenAvailableLocales(status: MutPtr<UErrorCode>): MutPtr<UEnumeration>

public expect fun ucolOpenBinary(bin: ConstPtr<UByte>, length: Int, base: ConstPtr<UCollator>, status: MutPtr<UErrorCode>): MutPtr<UCollator>

public expect fun ucolOpenElements(coll: ConstPtr<UCollator>, text: ConstPtr<UShort>, textlength: Int, status: MutPtr<UErrorCode>): MutPtr<UCollationElements>

public expect fun ucolOpenRules(rules: ConstPtr<UShort>, ruleslength: Int, normalizationmode: UColAttributeValue, strength: UColAttributeValue, parseerror: MutPtr<UParseError>, status: MutPtr<UErrorCode>): MutPtr<UCollator>

public expect fun ucolPrevious(elems: MutPtr<UCollationElements>, status: MutPtr<UErrorCode>): Int

public expect fun ucolPrimaryOrder(order: Int): Int

public expect fun ucolReset(elems: MutPtr<UCollationElements>)

public expect fun ucolSafeClone(coll: ConstPtr<UCollator>, stackbuffer: MutPtr<CVoid>, pbuffersize: MutPtr<Int>, status: MutPtr<UErrorCode>): MutPtr<UCollator>

public expect fun ucolSecondaryOrder(order: Int): Int

public expect fun ucolSetAttribute(coll: MutPtr<UCollator>, attr: UColAttribute, value: UColAttributeValue, status: MutPtr<UErrorCode>)

public expect fun ucolSetMaxVariable(coll: MutPtr<UCollator>, group: UColReorderCode, perrorcode: MutPtr<UErrorCode>)

public expect fun ucolSetOffset(elems: MutPtr<UCollationElements>, offset: Int, status: MutPtr<UErrorCode>)

public expect fun ucolSetReorderCodes(coll: MutPtr<UCollator>, reordercodes: ConstPtr<Int>, reordercodeslength: Int, perrorcode: MutPtr<UErrorCode>)

public expect fun ucolSetStrength(coll: MutPtr<UCollator>, strength: UColAttributeValue)

public expect fun ucolSetText(elems: MutPtr<UCollationElements>, text: ConstPtr<UShort>, textlength: Int, status: MutPtr<UErrorCode>)

public expect fun ucolStrcoll(coll: ConstPtr<UCollator>, source: ConstPtr<UShort>, sourcelength: Int, target: ConstPtr<UShort>, targetlength: Int): UCollationResult

public expect fun ucolStrcollIter(coll: ConstPtr<UCollator>, siter: MutPtr<UCharIterator>, titer: MutPtr<UCharIterator>, status: MutPtr<UErrorCode>): UCollationResult

public expect fun ucolStrcollUtf8(coll: ConstPtr<UCollator>, source: Pcstr, sourcelength: Int, target: Pcstr, targetlength: Int, status: MutPtr<UErrorCode>): UCollationResult

public expect fun ucolTertiaryOrder(order: Int): Int

public expect fun ucpmapGet(map: ConstPtr<UCPMap>, c: Int): UInt

public expect fun ucpmapGetRange(map: ConstPtr<UCPMap>, start: Int, option: UCPMapRangeOption, surrogatevalue: UInt, filter: MutPtr<UCPMapValueFilter>, context: ConstPtr<CVoid>, pvalue: MutPtr<UInt>): Int

public expect fun ucptrieClose(trie: MutPtr<UCPTrie>)

public expect fun ucptrieGet(trie: ConstPtr<UCPTrie>, c: Int): UInt

public expect fun ucptrieGetRange(trie: ConstPtr<UCPTrie>, start: Int, option: UCPMapRangeOption, surrogatevalue: UInt, filter: MutPtr<UCPMapValueFilter>, context: ConstPtr<CVoid>, pvalue: MutPtr<UInt>): Int

public expect fun ucptrieGetType(trie: ConstPtr<UCPTrie>): UCPTrieType

public expect fun ucptrieGetValueWidth(trie: ConstPtr<UCPTrie>): UCPTrieValueWidth

public expect fun ucptrieInternalSmallIndex(trie: ConstPtr<UCPTrie>, c: Int): Int

public expect fun ucptrieInternalSmallU8Index(trie: ConstPtr<UCPTrie>, lt1: Int, t2: UByte, t3: UByte): Int

public expect fun ucptrieInternalU8PrevIndex(trie: ConstPtr<UCPTrie>, c: Int, start: ConstPtr<UByte>, src: ConstPtr<UByte>): Int

public expect fun ucptrieOpenFromBinary(type: UCPTrieType, valuewidth: UCPTrieValueWidth, data: ConstPtr<CVoid>, length: Int, pactuallength: MutPtr<Int>, perrorcode: MutPtr<UErrorCode>): MutPtr<UCPTrie>

public expect fun ucptrieToBinary(trie: ConstPtr<UCPTrie>, data: MutPtr<CVoid>, capacity: Int, perrorcode: MutPtr<UErrorCode>): Int

public expect fun ucsdetClose(ucsd: MutPtr<UCharsetDetector>)

public expect fun ucsdetDetect(ucsd: MutPtr<UCharsetDetector>, status: MutPtr<UErrorCode>): MutPtr<UCharsetMatch>

public expect fun ucsdetDetectAll(ucsd: MutPtr<UCharsetDetector>, matchesfound: MutPtr<Int>, status: MutPtr<UErrorCode>): MutPtr<MutPtr<UCharsetMatch>>

public expect fun ucsdetEnableInputFilter(ucsd: MutPtr<UCharsetDetector>, filter: Byte): Byte

public expect fun ucsdetGetAllDetectableCharsets(ucsd: ConstPtr<UCharsetDetector>, status: MutPtr<UErrorCode>): MutPtr<UEnumeration>

public expect fun ucsdetGetConfidence(ucsm: ConstPtr<UCharsetMatch>, status: MutPtr<UErrorCode>): Int

public expect fun ucsdetGetLanguage(ucsm: ConstPtr<UCharsetMatch>, status: MutPtr<UErrorCode>): Pcstr

public expect fun ucsdetGetName(ucsm: ConstPtr<UCharsetMatch>, status: MutPtr<UErrorCode>): Pcstr

public expect fun ucsdetGetUchars(ucsm: ConstPtr<UCharsetMatch>, buf: MutPtr<UShort>, cap: Int, status: MutPtr<UErrorCode>): Int

public expect fun ucsdetIsInputFilterEnabled(ucsd: ConstPtr<UCharsetDetector>): Byte

public expect fun ucsdetOpen(status: MutPtr<UErrorCode>): MutPtr<UCharsetDetector>

public expect fun ucsdetSetDeclaredEncoding(ucsd: MutPtr<UCharsetDetector>, encoding: Pcstr, length: Int, status: MutPtr<UErrorCode>)

public expect fun ucsdetSetText(ucsd: MutPtr<UCharsetDetector>, textin: Pcstr, len: Int, status: MutPtr<UErrorCode>)

public expect fun ucurrCountCurrencies(locale: Pcstr, date: Double, ec: MutPtr<UErrorCode>): Int

public expect fun ucurrForLocale(locale: Pcstr, buff: MutPtr<UShort>, buffcapacity: Int, ec: MutPtr<UErrorCode>): Int

public expect fun ucurrForLocaleAndDate(locale: Pcstr, date: Double, index: Int, buff: MutPtr<UShort>, buffcapacity: Int, ec: MutPtr<UErrorCode>): Int

public expect fun ucurrGetDefaultFractionDigits(currency: ConstPtr<UShort>, ec: MutPtr<UErrorCode>): Int

public expect fun ucurrGetDefaultFractionDigitsForUsage(currency: ConstPtr<UShort>, usage: UCurrencyUsage, ec: MutPtr<UErrorCode>): Int

public expect fun ucurrGetKeywordValuesForLocale(key: Pcstr, locale: Pcstr, commonlyused: Byte, status: MutPtr<UErrorCode>): MutPtr<UEnumeration>

public expect fun ucurrGetName(currency: ConstPtr<UShort>, locale: Pcstr, namestyle: UCurrNameStyle, ischoiceformat: MutPtr<Byte>, len: MutPtr<Int>, ec: MutPtr<UErrorCode>): MutPtr<UShort>

public expect fun ucurrGetNumericCode(currency: ConstPtr<UShort>): Int

public expect fun ucurrGetPluralName(currency: ConstPtr<UShort>, locale: Pcstr, ischoiceformat: MutPtr<Byte>, pluralcount: Pcstr, len: MutPtr<Int>, ec: MutPtr<UErrorCode>): MutPtr<UShort>

public expect fun ucurrGetRoundingIncrement(currency: ConstPtr<UShort>, ec: MutPtr<UErrorCode>): Double

public expect fun ucurrGetRoundingIncrementForUsage(currency: ConstPtr<UShort>, usage: UCurrencyUsage, ec: MutPtr<UErrorCode>): Double

public expect fun ucurrIsAvailable(isocode: ConstPtr<UShort>, from: Double, to: Double, errorcode: MutPtr<UErrorCode>): Byte

public expect fun ucurrOpenIsocurrencies(currtype: UInt, perrorcode: MutPtr<UErrorCode>): MutPtr<UEnumeration>

public expect fun ucurrRegister(isocode: ConstPtr<UShort>, locale: Pcstr, status: MutPtr<UErrorCode>): MutPtr<CVoid>

public expect fun ucurrUnregister(key: MutPtr<CVoid>, status: MutPtr<UErrorCode>): Byte

public expect fun udatAdoptNumberFormat(fmt: MutPtr<MutPtr<CVoid>>, numberformattoadopt: MutPtr<MutPtr<CVoid>>)

public expect fun udatAdoptNumberFormatForFields(fmt: MutPtr<MutPtr<CVoid>>, fields: ConstPtr<UShort>, numberformattoset: MutPtr<MutPtr<CVoid>>, status: MutPtr<UErrorCode>)

public expect fun udatApplyPattern(format: MutPtr<MutPtr<CVoid>>, localized: Byte, pattern: ConstPtr<UShort>, patternlength: Int)

public expect fun udatClone(fmt: ConstPtr<ConstPtr<CVoid>>, status: MutPtr<UErrorCode>): MutPtr<MutPtr<CVoid>>

public expect fun udatClose(format: MutPtr<MutPtr<CVoid>>)

public expect fun udatCountAvailable(): Int

public expect fun udatCountSymbols(fmt: ConstPtr<ConstPtr<CVoid>>, type: UDateFormatSymbolType): Int

public expect fun udatFormat(format: ConstPtr<ConstPtr<CVoid>>, datetoformat: Double, result: MutPtr<UShort>, resultlength: Int, position: MutPtr<UFieldPosition>, status: MutPtr<UErrorCode>): Int

public expect fun udatFormatCalendar(format: ConstPtr<ConstPtr<CVoid>>, calendar: MutPtr<MutPtr<CVoid>>, result: MutPtr<UShort>, capacity: Int, position: MutPtr<UFieldPosition>, status: MutPtr<UErrorCode>): Int

public expect fun udatFormatCalendarForFields(format: ConstPtr<ConstPtr<CVoid>>, calendar: MutPtr<MutPtr<CVoid>>, result: MutPtr<UShort>, capacity: Int, fpositer: MutPtr<UFieldPositionIterator>, status: MutPtr<UErrorCode>): Int

public expect fun udatFormatForFields(format: ConstPtr<ConstPtr<CVoid>>, datetoformat: Double, result: MutPtr<UShort>, resultlength: Int, fpositer: MutPtr<UFieldPositionIterator>, status: MutPtr<UErrorCode>): Int

public expect fun udatGet2DigitYearStart(fmt: ConstPtr<ConstPtr<CVoid>>, status: MutPtr<UErrorCode>): Double

public expect fun udatGetAvailable(localeindex: Int): Pcstr

public expect fun udatGetBooleanAttribute(fmt: ConstPtr<ConstPtr<CVoid>>, attr: UDateFormatBooleanAttribute, status: MutPtr<UErrorCode>): Byte

public expect fun udatGetCalendar(fmt: ConstPtr<ConstPtr<CVoid>>): MutPtr<MutPtr<CVoid>>

public expect fun udatGetContext(fmt: ConstPtr<ConstPtr<CVoid>>, type: UDisplayContextType, status: MutPtr<UErrorCode>): UDisplayContext

public expect fun udatGetLocaleByType(fmt: ConstPtr<ConstPtr<CVoid>>, type: ULocDataLocaleType, status: MutPtr<UErrorCode>): Pcstr

public expect fun udatGetNumberFormat(fmt: ConstPtr<ConstPtr<CVoid>>): MutPtr<MutPtr<CVoid>>

public expect fun udatGetNumberFormatForField(fmt: ConstPtr<ConstPtr<CVoid>>, field: UShort): MutPtr<MutPtr<CVoid>>

public expect fun udatGetSymbols(fmt: ConstPtr<ConstPtr<CVoid>>, type: UDateFormatSymbolType, symbolindex: Int, result: MutPtr<UShort>, resultlength: Int, status: MutPtr<UErrorCode>): Int

public expect fun udatIsLenient(fmt: ConstPtr<ConstPtr<CVoid>>): Byte

public expect fun udatOpen(timestyle: UDateFormatStyle, datestyle: UDateFormatStyle, locale: Pcstr, tzid: ConstPtr<UShort>, tzidlength: Int, pattern: ConstPtr<UShort>, patternlength: Int, status: MutPtr<UErrorCode>): MutPtr<MutPtr<CVoid>>

public expect fun udatParse(format: ConstPtr<ConstPtr<CVoid>>, text: ConstPtr<UShort>, textlength: Int, parsepos: MutPtr<Int>, status: MutPtr<UErrorCode>): Double

public expect fun udatParseCalendar(format: ConstPtr<ConstPtr<CVoid>>, calendar: MutPtr<MutPtr<CVoid>>, text: ConstPtr<UShort>, textlength: Int, parsepos: MutPtr<Int>, status: MutPtr<UErrorCode>)

public expect fun udatSet2DigitYearStart(fmt: MutPtr<MutPtr<CVoid>>, d: Double, status: MutPtr<UErrorCode>)

public expect fun udatSetBooleanAttribute(fmt: MutPtr<MutPtr<CVoid>>, attr: UDateFormatBooleanAttribute, newvalue: Byte, status: MutPtr<UErrorCode>)

public expect fun udatSetCalendar(fmt: MutPtr<MutPtr<CVoid>>, calendartoset: ConstPtr<ConstPtr<CVoid>>)

public expect fun udatSetContext(fmt: MutPtr<MutPtr<CVoid>>, value: UDisplayContext, status: MutPtr<UErrorCode>)

public expect fun udatSetLenient(fmt: MutPtr<MutPtr<CVoid>>, islenient: Byte)

public expect fun udatSetNumberFormat(fmt: MutPtr<MutPtr<CVoid>>, numberformattoset: ConstPtr<ConstPtr<CVoid>>)

public expect fun udatSetSymbols(format: MutPtr<MutPtr<CVoid>>, type: UDateFormatSymbolType, symbolindex: Int, value: MutPtr<UShort>, valuelength: Int, status: MutPtr<UErrorCode>)

public expect fun udatToCalendarDateField(field: UDateFormatField): UCalendarDateFields

public expect fun udatToPattern(fmt: ConstPtr<ConstPtr<CVoid>>, localized: Byte, result: MutPtr<UShort>, resultlength: Int, status: MutPtr<UErrorCode>): Int

public expect fun udatpgAddPattern(dtpg: MutPtr<MutPtr<CVoid>>, pattern: ConstPtr<UShort>, patternlength: Int, override: Byte, conflictingpattern: MutPtr<UShort>, capacity: Int, plength: MutPtr<Int>, perrorcode: MutPtr<UErrorCode>): UDateTimePatternConflict

public expect fun udatpgClone(dtpg: ConstPtr<ConstPtr<CVoid>>, perrorcode: MutPtr<UErrorCode>): MutPtr<MutPtr<CVoid>>

public expect fun udatpgClose(dtpg: MutPtr<MutPtr<CVoid>>)

public expect fun udatpgGetAppendItemFormat(dtpg: ConstPtr<ConstPtr<CVoid>>, field: UDateTimePatternField, plength: MutPtr<Int>): MutPtr<UShort>

public expect fun udatpgGetAppendItemName(dtpg: ConstPtr<ConstPtr<CVoid>>, field: UDateTimePatternField, plength: MutPtr<Int>): MutPtr<UShort>

public expect fun udatpgGetBaseSkeleton(unuseddtpg: MutPtr<MutPtr<CVoid>>, pattern: ConstPtr<UShort>, length: Int, baseskeleton: MutPtr<UShort>, capacity: Int, perrorcode: MutPtr<UErrorCode>): Int

public expect fun udatpgGetBestPattern(dtpg: MutPtr<MutPtr<CVoid>>, skeleton: ConstPtr<UShort>, length: Int, bestpattern: MutPtr<UShort>, capacity: Int, perrorcode: MutPtr<UErrorCode>): Int

public expect fun udatpgGetBestPatternWithOptions(dtpg: MutPtr<MutPtr<CVoid>>, skeleton: ConstPtr<UShort>, length: Int, options: UDateTimePatternMatchOptions, bestpattern: MutPtr<UShort>, capacity: Int, perrorcode: MutPtr<UErrorCode>): Int

public expect fun udatpgGetDateTimeFormat(dtpg: ConstPtr<ConstPtr<CVoid>>, plength: MutPtr<Int>): MutPtr<UShort>

public expect fun udatpgGetDecimal(dtpg: ConstPtr<ConstPtr<CVoid>>, plength: MutPtr<Int>): MutPtr<UShort>

public expect fun udatpgGetFieldDisplayName(dtpg: ConstPtr<ConstPtr<CVoid>>, field: UDateTimePatternField, width: UDateTimePGDisplayWidth, fieldname: MutPtr<UShort>, capacity: Int, perrorcode: MutPtr<UErrorCode>): Int

public expect fun udatpgGetPatternForSkeleton(dtpg: ConstPtr<ConstPtr<CVoid>>, skeleton: ConstPtr<UShort>, skeletonlength: Int, plength: MutPtr<Int>): MutPtr<UShort>

public expect fun udatpgGetSkeleton(unuseddtpg: MutPtr<MutPtr<CVoid>>, pattern: ConstPtr<UShort>, length: Int, skeleton: MutPtr<UShort>, capacity: Int, perrorcode: MutPtr<UErrorCode>): Int

public expect fun udatpgOpen(locale: Pcstr, perrorcode: MutPtr<UErrorCode>): MutPtr<MutPtr<CVoid>>

public expect fun udatpgOpenBaseSkeletons(dtpg: ConstPtr<ConstPtr<CVoid>>, perrorcode: MutPtr<UErrorCode>): MutPtr<UEnumeration>

public expect fun udatpgOpenEmpty(perrorcode: MutPtr<UErrorCode>): MutPtr<MutPtr<CVoid>>

public expect fun udatpgOpenSkeletons(dtpg: ConstPtr<ConstPtr<CVoid>>, perrorcode: MutPtr<UErrorCode>): MutPtr<UEnumeration>

public expect fun udatpgReplaceFieldTypes(dtpg: MutPtr<MutPtr<CVoid>>, pattern: ConstPtr<UShort>, patternlength: Int, skeleton: ConstPtr<UShort>, skeletonlength: Int, dest: MutPtr<UShort>, destcapacity: Int, perrorcode: MutPtr<UErrorCode>): Int

public expect fun udatpgReplaceFieldTypesWithOptions(dtpg: MutPtr<MutPtr<CVoid>>, pattern: ConstPtr<UShort>, patternlength: Int, skeleton: ConstPtr<UShort>, skeletonlength: Int, options: UDateTimePatternMatchOptions, dest: MutPtr<UShort>, destcapacity: Int, perrorcode: MutPtr<UErrorCode>): Int

public expect fun udatpgSetAppendItemFormat(dtpg: MutPtr<MutPtr<CVoid>>, field: UDateTimePatternField, value: ConstPtr<UShort>, length: Int)

public expect fun udatpgSetAppendItemName(dtpg: MutPtr<MutPtr<CVoid>>, field: UDateTimePatternField, value: ConstPtr<UShort>, length: Int)

public expect fun udatpgSetDateTimeFormat(dtpg: ConstPtr<ConstPtr<CVoid>>, dtformat: ConstPtr<UShort>, length: Int)

public expect fun udatpgSetDecimal(dtpg: MutPtr<MutPtr<CVoid>>, decimal: ConstPtr<UShort>, length: Int)

public expect fun udtitvfmtClose(formatter: MutPtr<UDateIntervalFormat>)

public expect fun udtitvfmtCloseResult(uresult: MutPtr<UFormattedDateInterval>)

public expect fun udtitvfmtFormat(formatter: ConstPtr<UDateIntervalFormat>, fromdate: Double, todate: Double, result: MutPtr<UShort>, resultcapacity: Int, position: MutPtr<UFieldPosition>, status: MutPtr<UErrorCode>): Int

public expect fun udtitvfmtOpen(locale: Pcstr, skeleton: ConstPtr<UShort>, skeletonlength: Int, tzid: ConstPtr<UShort>, tzidlength: Int, status: MutPtr<UErrorCode>): MutPtr<UDateIntervalFormat>

public expect fun udtitvfmtOpenResult(ec: MutPtr<UErrorCode>): MutPtr<UFormattedDateInterval>

public expect fun udtitvfmtResultAsValue(uresult: ConstPtr<UFormattedDateInterval>, ec: MutPtr<UErrorCode>): MutPtr<UFormattedValue>

public expect fun uenumClose(en: MutPtr<UEnumeration>)

public expect fun uenumCount(en: MutPtr<UEnumeration>, status: MutPtr<UErrorCode>): Int

public expect fun uenumNext(en: MutPtr<UEnumeration>, resultlength: MutPtr<Int>, status: MutPtr<UErrorCode>): Pcstr

public expect fun uenumOpenCharStringsEnumeration(strings: ConstPtr<ConstPtr<Byte>>, count: Int, ec: MutPtr<UErrorCode>): MutPtr<UEnumeration>

public expect fun uenumOpenUcharStringsEnumeration(strings: ConstPtr<ConstPtr<UShort>>, count: Int, ec: MutPtr<UErrorCode>): MutPtr<UEnumeration>

public expect fun uenumReset(en: MutPtr<UEnumeration>, status: MutPtr<UErrorCode>)

public expect fun uenumUnext(en: MutPtr<UEnumeration>, resultlength: MutPtr<Int>, status: MutPtr<UErrorCode>): MutPtr<UShort>

public expect fun ufieldpositerClose(fpositer: MutPtr<UFieldPositionIterator>)

public expect fun ufieldpositerNext(fpositer: MutPtr<UFieldPositionIterator>, beginindex: MutPtr<Int>, endindex: MutPtr<Int>): Int

public expect fun ufieldpositerOpen(status: MutPtr<UErrorCode>): MutPtr<UFieldPositionIterator>

public expect fun ufmtClose(fmt: MutPtr<MutPtr<CVoid>>)

public expect fun ufmtGetArrayItemByIndex(fmt: MutPtr<MutPtr<CVoid>>, n: Int, status: MutPtr<UErrorCode>): MutPtr<MutPtr<CVoid>>

public expect fun ufmtGetArrayLength(fmt: ConstPtr<ConstPtr<CVoid>>, status: MutPtr<UErrorCode>): Int

public expect fun ufmtGetDate(fmt: ConstPtr<ConstPtr<CVoid>>, status: MutPtr<UErrorCode>): Double

public expect fun ufmtGetDecNumChars(fmt: MutPtr<MutPtr<CVoid>>, len: MutPtr<Int>, status: MutPtr<UErrorCode>): Pcstr

public expect fun ufmtGetDouble(fmt: MutPtr<MutPtr<CVoid>>, status: MutPtr<UErrorCode>): Double

public expect fun ufmtGetInt64(fmt: MutPtr<MutPtr<CVoid>>, status: MutPtr<UErrorCode>): Long

public expect fun ufmtGetLong(fmt: MutPtr<MutPtr<CVoid>>, status: MutPtr<UErrorCode>): Int

public expect fun ufmtGetObject(fmt: ConstPtr<ConstPtr<CVoid>>, status: MutPtr<UErrorCode>): MutPtr<CVoid>

public expect fun ufmtGetType(fmt: ConstPtr<ConstPtr<CVoid>>, status: MutPtr<UErrorCode>): UFormattableType

public expect fun ufmtGetUchars(fmt: MutPtr<MutPtr<CVoid>>, len: MutPtr<Int>, status: MutPtr<UErrorCode>): MutPtr<UShort>

public expect fun ufmtIsNumeric(fmt: ConstPtr<ConstPtr<CVoid>>): Byte

public expect fun ufmtOpen(status: MutPtr<UErrorCode>): MutPtr<MutPtr<CVoid>>

public expect fun ufmtvalGetString(ufmtval: ConstPtr<UFormattedValue>, plength: MutPtr<Int>, ec: MutPtr<UErrorCode>): MutPtr<UShort>

public expect fun ufmtvalNextPosition(ufmtval: ConstPtr<UFormattedValue>, ucfpos: MutPtr<UConstrainedFieldPosition>, ec: MutPtr<UErrorCode>): Byte

public expect fun ugenderGetInstance(locale: Pcstr, status: MutPtr<UErrorCode>): MutPtr<UGenderInfo>

public expect fun ugenderGetListGender(genderinfo: ConstPtr<UGenderInfo>, genders: ConstPtr<UGender>, size: Int, status: MutPtr<UErrorCode>): UGender

public expect fun uidnaClose(idna: MutPtr<Uidna>)

public expect fun uidnaLabelToAscii(idna: ConstPtr<Uidna>, label: ConstPtr<UShort>, length: Int, dest: MutPtr<UShort>, capacity: Int, pinfo: MutPtr<UIDNAInfo>, perrorcode: MutPtr<UErrorCode>): Int

public expect fun uidnaLabelToAsciiUtf8(idna: ConstPtr<Uidna>, label: Pcstr, length: Int, dest: Pcstr, capacity: Int, pinfo: MutPtr<UIDNAInfo>, perrorcode: MutPtr<UErrorCode>): Int

public expect fun uidnaLabelToUnicode(idna: ConstPtr<Uidna>, label: ConstPtr<UShort>, length: Int, dest: MutPtr<UShort>, capacity: Int, pinfo: MutPtr<UIDNAInfo>, perrorcode: MutPtr<UErrorCode>): Int

public expect fun uidnaLabelToUnicodeUtf8(idna: ConstPtr<Uidna>, label: Pcstr, length: Int, dest: Pcstr, capacity: Int, pinfo: MutPtr<UIDNAInfo>, perrorcode: MutPtr<UErrorCode>): Int

public expect fun uidnaNameToAscii(idna: ConstPtr<Uidna>, name: ConstPtr<UShort>, length: Int, dest: MutPtr<UShort>, capacity: Int, pinfo: MutPtr<UIDNAInfo>, perrorcode: MutPtr<UErrorCode>): Int

public expect fun uidnaNameToAsciiUtf8(idna: ConstPtr<Uidna>, name: Pcstr, length: Int, dest: Pcstr, capacity: Int, pinfo: MutPtr<UIDNAInfo>, perrorcode: MutPtr<UErrorCode>): Int

public expect fun uidnaNameToUnicode(idna: ConstPtr<Uidna>, name: ConstPtr<UShort>, length: Int, dest: MutPtr<UShort>, capacity: Int, pinfo: MutPtr<UIDNAInfo>, perrorcode: MutPtr<UErrorCode>): Int

public expect fun uidnaNameToUnicodeUtf8(idna: ConstPtr<Uidna>, name: Pcstr, length: Int, dest: Pcstr, capacity: Int, pinfo: MutPtr<UIDNAInfo>, perrorcode: MutPtr<UErrorCode>): Int

public expect fun uidnaOpenUts46(options: UInt, perrorcode: MutPtr<UErrorCode>): MutPtr<Uidna>

public expect fun uiterCurrent32(iter: MutPtr<UCharIterator>): Int

public expect fun uiterGetState(iter: ConstPtr<UCharIterator>): UInt

public expect fun uiterNext32(iter: MutPtr<UCharIterator>): Int

public expect fun uiterPrevious32(iter: MutPtr<UCharIterator>): Int

public expect fun uiterSetState(iter: MutPtr<UCharIterator>, state: UInt, perrorcode: MutPtr<UErrorCode>)

public expect fun uiterSetString(iter: MutPtr<UCharIterator>, s: ConstPtr<UShort>, length: Int)

public expect fun uiterSetUtf16Be(iter: MutPtr<UCharIterator>, s: Pcstr, length: Int)

public expect fun uiterSetUtf8(iter: MutPtr<UCharIterator>, s: Pcstr, length: Int)

public expect fun uldnClose(ldn: MutPtr<ULocaleDisplayNames>)

public expect fun uldnGetContext(ldn: ConstPtr<ULocaleDisplayNames>, type: UDisplayContextType, perrorcode: MutPtr<UErrorCode>): UDisplayContext

public expect fun uldnGetDialectHandling(ldn: ConstPtr<ULocaleDisplayNames>): UDialectHandling

public expect fun uldnGetLocale(ldn: ConstPtr<ULocaleDisplayNames>): Pcstr

public expect fun uldnKeyDisplayName(ldn: ConstPtr<ULocaleDisplayNames>, key: Pcstr, result: MutPtr<UShort>, maxresultsize: Int, perrorcode: MutPtr<UErrorCode>): Int

public expect fun uldnKeyValueDisplayName(ldn: ConstPtr<ULocaleDisplayNames>, key: Pcstr, value: Pcstr, result: MutPtr<UShort>, maxresultsize: Int, perrorcode: MutPtr<UErrorCode>): Int

public expect fun uldnLanguageDisplayName(ldn: ConstPtr<ULocaleDisplayNames>, lang: Pcstr, result: MutPtr<UShort>, maxresultsize: Int, perrorcode: MutPtr<UErrorCode>): Int

public expect fun uldnLocaleDisplayName(ldn: ConstPtr<ULocaleDisplayNames>, locale: Pcstr, result: MutPtr<UShort>, maxresultsize: Int, perrorcode: MutPtr<UErrorCode>): Int

public expect fun uldnOpen(locale: Pcstr, dialecthandling: UDialectHandling, perrorcode: MutPtr<UErrorCode>): MutPtr<ULocaleDisplayNames>

public expect fun uldnOpenForContext(locale: Pcstr, contexts: MutPtr<UDisplayContext>, length: Int, perrorcode: MutPtr<UErrorCode>): MutPtr<ULocaleDisplayNames>

public expect fun uldnRegionDisplayName(ldn: ConstPtr<ULocaleDisplayNames>, region: Pcstr, result: MutPtr<UShort>, maxresultsize: Int, perrorcode: MutPtr<UErrorCode>): Int

public expect fun uldnScriptCodeDisplayName(ldn: ConstPtr<ULocaleDisplayNames>, scriptcode: UScriptCode, result: MutPtr<UShort>, maxresultsize: Int, perrorcode: MutPtr<UErrorCode>): Int

public expect fun uldnScriptDisplayName(ldn: ConstPtr<ULocaleDisplayNames>, script: Pcstr, result: MutPtr<UShort>, maxresultsize: Int, perrorcode: MutPtr<UErrorCode>): Int

public expect fun uldnVariantDisplayName(ldn: ConstPtr<ULocaleDisplayNames>, variant: Pcstr, result: MutPtr<UShort>, maxresultsize: Int, perrorcode: MutPtr<UErrorCode>): Int

public expect fun ulistfmtClose(listfmt: MutPtr<UListFormatter>)

public expect fun ulistfmtCloseResult(uresult: MutPtr<UFormattedList>)

public expect fun ulistfmtFormat(listfmt: ConstPtr<UListFormatter>, strings: ConstPtr<ConstPtr<UShort>>, stringlengths: ConstPtr<Int>, stringcount: Int, result: MutPtr<UShort>, resultcapacity: Int, status: MutPtr<UErrorCode>): Int

public expect fun ulistfmtFormatStringsToResult(listfmt: ConstPtr<UListFormatter>, strings: ConstPtr<ConstPtr<UShort>>, stringlengths: ConstPtr<Int>, stringcount: Int, uresult: MutPtr<UFormattedList>, status: MutPtr<UErrorCode>)

public expect fun ulistfmtOpen(locale: Pcstr, status: MutPtr<UErrorCode>): MutPtr<UListFormatter>

public expect fun ulistfmtOpenForType(locale: Pcstr, type: UListFormatterType, width: UListFormatterWidth, status: MutPtr<UErrorCode>): MutPtr<UListFormatter>

public expect fun ulistfmtOpenResult(ec: MutPtr<UErrorCode>): MutPtr<UFormattedList>

public expect fun ulistfmtResultAsValue(uresult: ConstPtr<UFormattedList>, ec: MutPtr<UErrorCode>): MutPtr<UFormattedValue>

public expect fun ulocAcceptLanguage(result: Pcstr, resultavailable: Int, outresult: MutPtr<UAcceptResult>, acceptlist: ConstPtr<ConstPtr<Byte>>, acceptlistcount: Int, availablelocales: MutPtr<UEnumeration>, status: MutPtr<UErrorCode>): Int

public expect fun ulocAcceptLanguageFromHttp(result: Pcstr, resultavailable: Int, outresult: MutPtr<UAcceptResult>, httpacceptlanguage: Pcstr, availablelocales: MutPtr<UEnumeration>, status: MutPtr<UErrorCode>): Int

public expect fun ulocAddLikelySubtags(localeid: Pcstr, maximizedlocaleid: Pcstr, maximizedlocaleidcapacity: Int, err: MutPtr<UErrorCode>): Int

public expect fun ulocCanonicalize(localeid: Pcstr, name: Pcstr, namecapacity: Int, err: MutPtr<UErrorCode>): Int

public expect fun ulocCountAvailable(): Int

public expect fun ulocForLanguageTag(langtag: Pcstr, localeid: Pcstr, localeidcapacity: Int, parsedlength: MutPtr<Int>, err: MutPtr<UErrorCode>): Int

public expect fun ulocGetAvailable(n: Int): Pcstr

public expect fun ulocGetBaseName(localeid: Pcstr, name: Pcstr, namecapacity: Int, err: MutPtr<UErrorCode>): Int

public expect fun ulocGetCharacterOrientation(localeid: Pcstr, status: MutPtr<UErrorCode>): ULayoutType

public expect fun ulocGetCountry(localeid: Pcstr, country: Pcstr, countrycapacity: Int, err: MutPtr<UErrorCode>): Int

public expect fun ulocGetDefault(): Pcstr

public expect fun ulocGetDisplayCountry(locale: Pcstr, displaylocale: Pcstr, country: MutPtr<UShort>, countrycapacity: Int, status: MutPtr<UErrorCode>): Int

public expect fun ulocGetDisplayKeyword(keyword: Pcstr, displaylocale: Pcstr, dest: MutPtr<UShort>, destcapacity: Int, status: MutPtr<UErrorCode>): Int

public expect fun ulocGetDisplayKeywordValue(locale: Pcstr, keyword: Pcstr, displaylocale: Pcstr, dest: MutPtr<UShort>, destcapacity: Int, status: MutPtr<UErrorCode>): Int

public expect fun ulocGetDisplayLanguage(locale: Pcstr, displaylocale: Pcstr, language: MutPtr<UShort>, languagecapacity: Int, status: MutPtr<UErrorCode>): Int

public expect fun ulocGetDisplayName(localeid: Pcstr, inlocaleid: Pcstr, result: MutPtr<UShort>, maxresultsize: Int, err: MutPtr<UErrorCode>): Int

public expect fun ulocGetDisplayScript(locale: Pcstr, displaylocale: Pcstr, script: MutPtr<UShort>, scriptcapacity: Int, status: MutPtr<UErrorCode>): Int

public expect fun ulocGetDisplayVariant(locale: Pcstr, displaylocale: Pcstr, variant: MutPtr<UShort>, variantcapacity: Int, status: MutPtr<UErrorCode>): Int

public expect fun ulocGetIso3Country(localeid: Pcstr): Pcstr

public expect fun ulocGetIso3Language(localeid: Pcstr): Pcstr

public expect fun ulocGetIsocountries(): MutPtr<MutPtr<Byte>>

public expect fun ulocGetIsolanguages(): MutPtr<MutPtr<Byte>>

public expect fun ulocGetKeywordValue(localeid: Pcstr, keywordname: Pcstr, buffer: Pcstr, buffercapacity: Int, status: MutPtr<UErrorCode>): Int

public expect fun ulocGetLcid(localeid: Pcstr): UInt

public expect fun ulocGetLanguage(localeid: Pcstr, language: Pcstr, languagecapacity: Int, err: MutPtr<UErrorCode>): Int

public expect fun ulocGetLineOrientation(localeid: Pcstr, status: MutPtr<UErrorCode>): ULayoutType

public expect fun ulocGetLocaleForLcid(hostid: UInt, locale: Pcstr, localecapacity: Int, status: MutPtr<UErrorCode>): Int

public expect fun ulocGetName(localeid: Pcstr, name: Pcstr, namecapacity: Int, err: MutPtr<UErrorCode>): Int

public expect fun ulocGetParent(localeid: Pcstr, parent: Pcstr, parentcapacity: Int, err: MutPtr<UErrorCode>): Int

public expect fun ulocGetScript(localeid: Pcstr, script: Pcstr, scriptcapacity: Int, err: MutPtr<UErrorCode>): Int

public expect fun ulocGetVariant(localeid: Pcstr, variant: Pcstr, variantcapacity: Int, err: MutPtr<UErrorCode>): Int

public expect fun ulocIsRightToLeft(locale: Pcstr): Byte

public expect fun ulocMinimizeSubtags(localeid: Pcstr, minimizedlocaleid: Pcstr, minimizedlocaleidcapacity: Int, err: MutPtr<UErrorCode>): Int

public expect fun ulocOpenAvailableByType(type: ULocAvailableType, status: MutPtr<UErrorCode>): MutPtr<UEnumeration>

public expect fun ulocOpenKeywords(localeid: Pcstr, status: MutPtr<UErrorCode>): MutPtr<UEnumeration>

public expect fun ulocSetDefault(localeid: Pcstr, status: MutPtr<UErrorCode>)

public expect fun ulocSetKeywordValue(keywordname: Pcstr, keywordvalue: Pcstr, buffer: Pcstr, buffercapacity: Int, status: MutPtr<UErrorCode>): Int

public expect fun ulocToLanguageTag(localeid: Pcstr, langtag: Pcstr, langtagcapacity: Int, strict: Byte, err: MutPtr<UErrorCode>): Int

public expect fun ulocToLegacyKey(keyword: Pcstr): Pcstr

public expect fun ulocToLegacyType(keyword: Pcstr, value: Pcstr): Pcstr

public expect fun ulocToUnicodeLocaleKey(keyword: Pcstr): Pcstr

public expect fun ulocToUnicodeLocaleType(keyword: Pcstr, value: Pcstr): Pcstr

public expect fun ulocdataClose(uld: MutPtr<ULocaleData>)

public expect fun ulocdataGetCldrversion(versionarray: MutPtr<UByte>, status: MutPtr<UErrorCode>)

public expect fun ulocdataGetDelimiter(uld: MutPtr<ULocaleData>, type: ULocaleDataDelimiterType, result: MutPtr<UShort>, resultlength: Int, status: MutPtr<UErrorCode>): Int

public expect fun ulocdataGetExemplarSet(uld: MutPtr<ULocaleData>, fillin: MutPtr<USet>, options: UInt, extype: ULocaleDataExemplarSetType, status: MutPtr<UErrorCode>): MutPtr<USet>

public expect fun ulocdataGetLocaleDisplayPattern(uld: MutPtr<ULocaleData>, pattern: MutPtr<UShort>, patterncapacity: Int, status: MutPtr<UErrorCode>): Int

public expect fun ulocdataGetLocaleSeparator(uld: MutPtr<ULocaleData>, separator: MutPtr<UShort>, separatorcapacity: Int, status: MutPtr<UErrorCode>): Int

public expect fun ulocdataGetMeasurementSystem(localeid: Pcstr, status: MutPtr<UErrorCode>): UMeasurementSystem

public expect fun ulocdataGetNoSubstitute(uld: MutPtr<ULocaleData>): Byte

public expect fun ulocdataGetPaperSize(localeid: Pcstr, height: MutPtr<Int>, width: MutPtr<Int>, status: MutPtr<UErrorCode>)

public expect fun ulocdataOpen(localeid: Pcstr, status: MutPtr<UErrorCode>): MutPtr<ULocaleData>

public expect fun ulocdataSetNoSubstitute(uld: MutPtr<ULocaleData>, setting: Byte)

public expect fun umsgApplyPattern(fmt: MutPtr<MutPtr<CVoid>>, pattern: ConstPtr<UShort>, patternlength: Int, parseerror: MutPtr<UParseError>, status: MutPtr<UErrorCode>)

public expect fun umsgAutoQuoteApostrophe(pattern: ConstPtr<UShort>, patternlength: Int, dest: MutPtr<UShort>, destcapacity: Int, ec: MutPtr<UErrorCode>): Int

public expect fun umsgClone(fmt: ConstPtr<ConstPtr<CVoid>>, status: MutPtr<UErrorCode>): MutPtr<CVoid>

public expect fun umsgClose(format: MutPtr<MutPtr<CVoid>>)

public expect fun umsgFormat(fmt: ConstPtr<ConstPtr<CVoid>>, result: MutPtr<UShort>, resultlength: Int, status: MutPtr<UErrorCode>, vararg variadicArgs: Long): Int

public expect fun umsgGetLocale(fmt: ConstPtr<ConstPtr<CVoid>>): Pcstr

public expect fun umsgOpen(pattern: ConstPtr<UShort>, patternlength: Int, locale: Pcstr, parseerror: MutPtr<UParseError>, status: MutPtr<UErrorCode>): MutPtr<MutPtr<CVoid>>

public expect fun umsgParse(fmt: ConstPtr<ConstPtr<CVoid>>, source: ConstPtr<UShort>, sourcelength: Int, count: MutPtr<Int>, status: MutPtr<UErrorCode>, vararg variadicArgs: Long)

public expect fun umsgSetLocale(fmt: MutPtr<MutPtr<CVoid>>, locale: Pcstr)

public expect fun umsgToPattern(fmt: ConstPtr<ConstPtr<CVoid>>, result: MutPtr<UShort>, resultlength: Int, status: MutPtr<UErrorCode>): Int

public expect fun umsgVformat(fmt: ConstPtr<ConstPtr<CVoid>>, result: MutPtr<UShort>, resultlength: Int, ap: MutPtr<Byte>, status: MutPtr<UErrorCode>): Int

public expect fun umsgVparse(fmt: ConstPtr<ConstPtr<CVoid>>, source: ConstPtr<UShort>, sourcelength: Int, count: MutPtr<Int>, ap: MutPtr<Byte>, status: MutPtr<UErrorCode>)

public expect fun umutablecptrieBuildImmutable(trie: MutPtr<UMutableCPTrie>, type: UCPTrieType, valuewidth: UCPTrieValueWidth, perrorcode: MutPtr<UErrorCode>): MutPtr<UCPTrie>

public expect fun umutablecptrieClone(other: ConstPtr<UMutableCPTrie>, perrorcode: MutPtr<UErrorCode>): MutPtr<UMutableCPTrie>

public expect fun umutablecptrieClose(trie: MutPtr<UMutableCPTrie>)

public expect fun umutablecptrieFromUcpmap(map: ConstPtr<UCPMap>, perrorcode: MutPtr<UErrorCode>): MutPtr<UMutableCPTrie>

public expect fun umutablecptrieFromUcptrie(trie: ConstPtr<UCPTrie>, perrorcode: MutPtr<UErrorCode>): MutPtr<UMutableCPTrie>

public expect fun umutablecptrieGet(trie: ConstPtr<UMutableCPTrie>, c: Int): UInt

public expect fun umutablecptrieGetRange(trie: ConstPtr<UMutableCPTrie>, start: Int, option: UCPMapRangeOption, surrogatevalue: UInt, filter: MutPtr<UCPMapValueFilter>, context: ConstPtr<CVoid>, pvalue: MutPtr<UInt>): Int

public expect fun umutablecptrieOpen(initialvalue: UInt, errorvalue: UInt, perrorcode: MutPtr<UErrorCode>): MutPtr<UMutableCPTrie>

public expect fun umutablecptrieSet(trie: MutPtr<UMutableCPTrie>, c: Int, value: UInt, perrorcode: MutPtr<UErrorCode>)

public expect fun umutablecptrieSetRange(trie: MutPtr<UMutableCPTrie>, start: Int, end: Int, value: UInt, perrorcode: MutPtr<UErrorCode>)

public expect fun unorm2Append(norm2: ConstPtr<UNormalizer2>, first: MutPtr<UShort>, firstlength: Int, firstcapacity: Int, second: ConstPtr<UShort>, secondlength: Int, perrorcode: MutPtr<UErrorCode>): Int

public expect fun unorm2Close(norm2: MutPtr<UNormalizer2>)

public expect fun unorm2ComposePair(norm2: ConstPtr<UNormalizer2>, a: Int, b: Int): Int

public expect fun unorm2GetCombiningClass(norm2: ConstPtr<UNormalizer2>, c: Int): UByte

public expect fun unorm2GetDecomposition(norm2: ConstPtr<UNormalizer2>, c: Int, decomposition: MutPtr<UShort>, capacity: Int, perrorcode: MutPtr<UErrorCode>): Int

public expect fun unorm2GetInstance(packagename: Pcstr, name: Pcstr, mode: UNormalization2Mode, perrorcode: MutPtr<UErrorCode>): MutPtr<UNormalizer2>

public expect fun unorm2GetNfcinstance(perrorcode: MutPtr<UErrorCode>): MutPtr<UNormalizer2>

public expect fun unorm2GetNfdinstance(perrorcode: MutPtr<UErrorCode>): MutPtr<UNormalizer2>

public expect fun unorm2GetNfkccasefoldInstance(perrorcode: MutPtr<UErrorCode>): MutPtr<UNormalizer2>

public expect fun unorm2GetNfkcinstance(perrorcode: MutPtr<UErrorCode>): MutPtr<UNormalizer2>

public expect fun unorm2GetNfkdinstance(perrorcode: MutPtr<UErrorCode>): MutPtr<UNormalizer2>

public expect fun unorm2GetRawDecomposition(norm2: ConstPtr<UNormalizer2>, c: Int, decomposition: MutPtr<UShort>, capacity: Int, perrorcode: MutPtr<UErrorCode>): Int

public expect fun unorm2HasBoundaryAfter(norm2: ConstPtr<UNormalizer2>, c: Int): Byte

public expect fun unorm2HasBoundaryBefore(norm2: ConstPtr<UNormalizer2>, c: Int): Byte

public expect fun unorm2IsInert(norm2: ConstPtr<UNormalizer2>, c: Int): Byte

public expect fun unorm2IsNormalized(norm2: ConstPtr<UNormalizer2>, s: ConstPtr<UShort>, length: Int, perrorcode: MutPtr<UErrorCode>): Byte

public expect fun unorm2Normalize(norm2: ConstPtr<UNormalizer2>, src: ConstPtr<UShort>, length: Int, dest: MutPtr<UShort>, capacity: Int, perrorcode: MutPtr<UErrorCode>): Int

public expect fun unorm2NormalizeSecondAndAppend(norm2: ConstPtr<UNormalizer2>, first: MutPtr<UShort>, firstlength: Int, firstcapacity: Int, second: ConstPtr<UShort>, secondlength: Int, perrorcode: MutPtr<UErrorCode>): Int

public expect fun unorm2OpenFiltered(norm2: ConstPtr<UNormalizer2>, filterset: ConstPtr<USet>, perrorcode: MutPtr<UErrorCode>): MutPtr<UNormalizer2>

public expect fun unorm2QuickCheck(norm2: ConstPtr<UNormalizer2>, s: ConstPtr<UShort>, length: Int, perrorcode: MutPtr<UErrorCode>): UNormalizationCheckResult

public expect fun unorm2SpanQuickCheckYes(norm2: ConstPtr<UNormalizer2>, s: ConstPtr<UShort>, length: Int, perrorcode: MutPtr<UErrorCode>): Int

public expect fun unormCompare(s1: ConstPtr<UShort>, length1: Int, s2: ConstPtr<UShort>, length2: Int, options: UInt, perrorcode: MutPtr<UErrorCode>): Int

public expect fun unumApplyPattern(format: MutPtr<MutPtr<CVoid>>, localized: Byte, pattern: ConstPtr<UShort>, patternlength: Int, parseerror: MutPtr<UParseError>, status: MutPtr<UErrorCode>)

public expect fun unumClone(fmt: ConstPtr<ConstPtr<CVoid>>, status: MutPtr<UErrorCode>): MutPtr<MutPtr<CVoid>>

public expect fun unumClose(fmt: MutPtr<MutPtr<CVoid>>)

public expect fun unumCountAvailable(): Int

public expect fun unumFormat(fmt: ConstPtr<ConstPtr<CVoid>>, number: Int, result: MutPtr<UShort>, resultlength: Int, pos: MutPtr<UFieldPosition>, status: MutPtr<UErrorCode>): Int

public expect fun unumFormatDecimal(fmt: ConstPtr<ConstPtr<CVoid>>, number: Pcstr, length: Int, result: MutPtr<UShort>, resultlength: Int, pos: MutPtr<UFieldPosition>, status: MutPtr<UErrorCode>): Int

public expect fun unumFormatDouble(fmt: ConstPtr<ConstPtr<CVoid>>, number: Double, result: MutPtr<UShort>, resultlength: Int, pos: MutPtr<UFieldPosition>, status: MutPtr<UErrorCode>): Int

public expect fun unumFormatDoubleCurrency(fmt: ConstPtr<ConstPtr<CVoid>>, number: Double, currency: MutPtr<UShort>, result: MutPtr<UShort>, resultlength: Int, pos: MutPtr<UFieldPosition>, status: MutPtr<UErrorCode>): Int

public expect fun unumFormatDoubleForFields(format: ConstPtr<ConstPtr<CVoid>>, number: Double, result: MutPtr<UShort>, resultlength: Int, fpositer: MutPtr<UFieldPositionIterator>, status: MutPtr<UErrorCode>): Int

public expect fun unumFormatInt64(fmt: ConstPtr<ConstPtr<CVoid>>, number: Long, result: MutPtr<UShort>, resultlength: Int, pos: MutPtr<UFieldPosition>, status: MutPtr<UErrorCode>): Int

public expect fun unumFormatUformattable(fmt: ConstPtr<ConstPtr<CVoid>>, number: ConstPtr<ConstPtr<CVoid>>, result: MutPtr<UShort>, resultlength: Int, pos: MutPtr<UFieldPosition>, status: MutPtr<UErrorCode>): Int

public expect fun unumGetAttribute(fmt: ConstPtr<ConstPtr<CVoid>>, attr: UNumberFormatAttribute): Int

public expect fun unumGetAvailable(localeindex: Int): Pcstr

public expect fun unumGetContext(fmt: ConstPtr<ConstPtr<CVoid>>, type: UDisplayContextType, status: MutPtr<UErrorCode>): UDisplayContext

public expect fun unumGetDoubleAttribute(fmt: ConstPtr<ConstPtr<CVoid>>, attr: UNumberFormatAttribute): Double

public expect fun unumGetLocaleByType(fmt: ConstPtr<ConstPtr<CVoid>>, type: ULocDataLocaleType, status: MutPtr<UErrorCode>): Pcstr

public expect fun unumGetSymbol(fmt: ConstPtr<ConstPtr<CVoid>>, symbol: UNumberFormatSymbol, buffer: MutPtr<UShort>, size: Int, status: MutPtr<UErrorCode>): Int

public expect fun unumGetTextAttribute(fmt: ConstPtr<ConstPtr<CVoid>>, tag: UNumberFormatTextAttribute, result: MutPtr<UShort>, resultlength: Int, status: MutPtr<UErrorCode>): Int

public expect fun unumOpen(style: UNumberFormatStyle, pattern: ConstPtr<UShort>, patternlength: Int, locale: Pcstr, parseerr: MutPtr<UParseError>, status: MutPtr<UErrorCode>): MutPtr<MutPtr<CVoid>>

public expect fun unumParse(fmt: ConstPtr<ConstPtr<CVoid>>, text: ConstPtr<UShort>, textlength: Int, parsepos: MutPtr<Int>, status: MutPtr<UErrorCode>): Int

public expect fun unumParseDecimal(fmt: ConstPtr<ConstPtr<CVoid>>, text: ConstPtr<UShort>, textlength: Int, parsepos: MutPtr<Int>, outbuf: Pcstr, outbuflength: Int, status: MutPtr<UErrorCode>): Int

public expect fun unumParseDouble(fmt: ConstPtr<ConstPtr<CVoid>>, text: ConstPtr<UShort>, textlength: Int, parsepos: MutPtr<Int>, status: MutPtr<UErrorCode>): Double

public expect fun unumParseDoubleCurrency(fmt: ConstPtr<ConstPtr<CVoid>>, text: ConstPtr<UShort>, textlength: Int, parsepos: MutPtr<Int>, currency: MutPtr<UShort>, status: MutPtr<UErrorCode>): Double

public expect fun unumParseInt64(fmt: ConstPtr<ConstPtr<CVoid>>, text: ConstPtr<UShort>, textlength: Int, parsepos: MutPtr<Int>, status: MutPtr<UErrorCode>): Long

public expect fun unumParseToUformattable(fmt: ConstPtr<ConstPtr<CVoid>>, result: MutPtr<MutPtr<CVoid>>, text: ConstPtr<UShort>, textlength: Int, parsepos: MutPtr<Int>, status: MutPtr<UErrorCode>): MutPtr<MutPtr<CVoid>>

public expect fun unumSetAttribute(fmt: MutPtr<MutPtr<CVoid>>, attr: UNumberFormatAttribute, newvalue: Int)

public expect fun unumSetContext(fmt: MutPtr<MutPtr<CVoid>>, value: UDisplayContext, status: MutPtr<UErrorCode>)

public expect fun unumSetDoubleAttribute(fmt: MutPtr<MutPtr<CVoid>>, attr: UNumberFormatAttribute, newvalue: Double)

public expect fun unumSetSymbol(fmt: MutPtr<MutPtr<CVoid>>, symbol: UNumberFormatSymbol, value: ConstPtr<UShort>, length: Int, status: MutPtr<UErrorCode>)

public expect fun unumSetTextAttribute(fmt: MutPtr<MutPtr<CVoid>>, tag: UNumberFormatTextAttribute, newvalue: ConstPtr<UShort>, newvaluelength: Int, status: MutPtr<UErrorCode>)

public expect fun unumToPattern(fmt: ConstPtr<ConstPtr<CVoid>>, ispatternlocalized: Byte, result: MutPtr<UShort>, resultlength: Int, status: MutPtr<UErrorCode>): Int

public expect fun unumfClose(uformatter: MutPtr<UNumberFormatter>)

public expect fun unumfCloseResult(uresult: MutPtr<UFormattedNumber>)

public expect fun unumfFormatDecimal(uformatter: ConstPtr<UNumberFormatter>, value: Pcstr, valuelen: Int, uresult: MutPtr<UFormattedNumber>, ec: MutPtr<UErrorCode>)

public expect fun unumfFormatDouble(uformatter: ConstPtr<UNumberFormatter>, value: Double, uresult: MutPtr<UFormattedNumber>, ec: MutPtr<UErrorCode>)

public expect fun unumfFormatInt(uformatter: ConstPtr<UNumberFormatter>, value: Long, uresult: MutPtr<UFormattedNumber>, ec: MutPtr<UErrorCode>)

public expect fun unumfOpenForSkeletonAndLocale(skeleton: ConstPtr<UShort>, skeletonlen: Int, locale: Pcstr, ec: MutPtr<UErrorCode>): MutPtr<UNumberFormatter>

public expect fun unumfOpenForSkeletonAndLocaleWithError(skeleton: ConstPtr<UShort>, skeletonlen: Int, locale: Pcstr, perror: MutPtr<UParseError>, ec: MutPtr<UErrorCode>): MutPtr<UNumberFormatter>

public expect fun unumfOpenResult(ec: MutPtr<UErrorCode>): MutPtr<UFormattedNumber>

public expect fun unumfResultAsValue(uresult: ConstPtr<UFormattedNumber>, ec: MutPtr<UErrorCode>): MutPtr<UFormattedValue>

public expect fun unumfResultGetAllFieldPositions(uresult: ConstPtr<UFormattedNumber>, ufpositer: MutPtr<UFieldPositionIterator>, ec: MutPtr<UErrorCode>)

public expect fun unumfResultNextFieldPosition(uresult: ConstPtr<UFormattedNumber>, ufpos: MutPtr<UFieldPosition>, ec: MutPtr<UErrorCode>): Byte

public expect fun unumfResultToString(uresult: ConstPtr<UFormattedNumber>, buffer: MutPtr<UShort>, buffercapacity: Int, ec: MutPtr<UErrorCode>): Int

public expect fun unumsysClose(unumsys: MutPtr<UNumberingSystem>)

public expect fun unumsysGetDescription(unumsys: ConstPtr<UNumberingSystem>, result: MutPtr<UShort>, resultlength: Int, status: MutPtr<UErrorCode>): Int

public expect fun unumsysGetName(unumsys: ConstPtr<UNumberingSystem>): Pcstr

public expect fun unumsysGetRadix(unumsys: ConstPtr<UNumberingSystem>): Int

public expect fun unumsysIsAlgorithmic(unumsys: ConstPtr<UNumberingSystem>): Byte

public expect fun unumsysOpen(locale: Pcstr, status: MutPtr<UErrorCode>): MutPtr<UNumberingSystem>

public expect fun unumsysOpenAvailableNames(status: MutPtr<UErrorCode>): MutPtr<UEnumeration>

public expect fun unumsysOpenByName(name: Pcstr, status: MutPtr<UErrorCode>): MutPtr<UNumberingSystem>

public expect fun uplrulesClose(uplrules: MutPtr<UPluralRules>)

public expect fun uplrulesGetKeywords(uplrules: ConstPtr<UPluralRules>, status: MutPtr<UErrorCode>): MutPtr<UEnumeration>

public expect fun uplrulesOpen(locale: Pcstr, status: MutPtr<UErrorCode>): MutPtr<UPluralRules>

public expect fun uplrulesOpenForType(locale: Pcstr, type: UPluralType, status: MutPtr<UErrorCode>): MutPtr<UPluralRules>

public expect fun uplrulesSelect(uplrules: ConstPtr<UPluralRules>, number: Double, keyword: MutPtr<UShort>, capacity: Int, status: MutPtr<UErrorCode>): Int

public expect fun uplrulesSelectFormatted(uplrules: ConstPtr<UPluralRules>, number: ConstPtr<UFormattedNumber>, keyword: MutPtr<UShort>, capacity: Int, status: MutPtr<UErrorCode>): Int

public expect fun uregexAppendReplacement(regexp: MutPtr<URegularExpression>, replacementtext: ConstPtr<UShort>, replacementlength: Int, destbuf: MutPtr<MutPtr<UShort>>, destcapacity: MutPtr<Int>, status: MutPtr<UErrorCode>): Int

public expect fun uregexAppendReplacementUtext(regexp: MutPtr<URegularExpression>, replacementtext: MutPtr<UText>, dest: MutPtr<UText>, status: MutPtr<UErrorCode>)

public expect fun uregexAppendTail(regexp: MutPtr<URegularExpression>, destbuf: MutPtr<MutPtr<UShort>>, destcapacity: MutPtr<Int>, status: MutPtr<UErrorCode>): Int

public expect fun uregexAppendTailUtext(regexp: MutPtr<URegularExpression>, dest: MutPtr<UText>, status: MutPtr<UErrorCode>): MutPtr<UText>

public expect fun uregexClone(regexp: ConstPtr<URegularExpression>, status: MutPtr<UErrorCode>): MutPtr<URegularExpression>

public expect fun uregexClose(regexp: MutPtr<URegularExpression>)

public expect fun uregexEnd(regexp: MutPtr<URegularExpression>, groupnum: Int, status: MutPtr<UErrorCode>): Int

public expect fun uregexEnd64(regexp: MutPtr<URegularExpression>, groupnum: Int, status: MutPtr<UErrorCode>): Long

public expect fun uregexFind(regexp: MutPtr<URegularExpression>, startindex: Int, status: MutPtr<UErrorCode>): Byte

public expect fun uregexFind64(regexp: MutPtr<URegularExpression>, startindex: Long, status: MutPtr<UErrorCode>): Byte

public expect fun uregexFindNext(regexp: MutPtr<URegularExpression>, status: MutPtr<UErrorCode>): Byte

public expect fun uregexFlags(regexp: ConstPtr<URegularExpression>, status: MutPtr<UErrorCode>): Int

public expect fun uregexGetFindProgressCallback(regexp: ConstPtr<URegularExpression>, callback: MutPtr<URegexFindProgressCallback>, context: ConstPtr<ConstPtr<CVoid>>, status: MutPtr<UErrorCode>)

public expect fun uregexGetMatchCallback(regexp: ConstPtr<URegularExpression>, callback: MutPtr<URegexMatchCallback>, context: ConstPtr<ConstPtr<CVoid>>, status: MutPtr<UErrorCode>)

public expect fun uregexGetStackLimit(regexp: ConstPtr<URegularExpression>, status: MutPtr<UErrorCode>): Int

public expect fun uregexGetText(regexp: MutPtr<URegularExpression>, textlength: MutPtr<Int>, status: MutPtr<UErrorCode>): MutPtr<UShort>

public expect fun uregexGetTimeLimit(regexp: ConstPtr<URegularExpression>, status: MutPtr<UErrorCode>): Int

public expect fun uregexGetUtext(regexp: MutPtr<URegularExpression>, dest: MutPtr<UText>, status: MutPtr<UErrorCode>): MutPtr<UText>

public expect fun uregexGroup(regexp: MutPtr<URegularExpression>, groupnum: Int, dest: MutPtr<UShort>, destcapacity: Int, status: MutPtr<UErrorCode>): Int

public expect fun uregexGroupCount(regexp: MutPtr<URegularExpression>, status: MutPtr<UErrorCode>): Int

public expect fun uregexGroupNumberFromCname(regexp: MutPtr<URegularExpression>, groupname: Pcstr, namelength: Int, status: MutPtr<UErrorCode>): Int

public expect fun uregexGroupNumberFromName(regexp: MutPtr<URegularExpression>, groupname: ConstPtr<UShort>, namelength: Int, status: MutPtr<UErrorCode>): Int

public expect fun uregexGroupUtext(regexp: MutPtr<URegularExpression>, groupnum: Int, dest: MutPtr<UText>, grouplength: MutPtr<Long>, status: MutPtr<UErrorCode>): MutPtr<UText>

public expect fun uregexHasAnchoringBounds(regexp: ConstPtr<URegularExpression>, status: MutPtr<UErrorCode>): Byte

public expect fun uregexHasTransparentBounds(regexp: ConstPtr<URegularExpression>, status: MutPtr<UErrorCode>): Byte

public expect fun uregexHitEnd(regexp: ConstPtr<URegularExpression>, status: MutPtr<UErrorCode>): Byte

public expect fun uregexLookingAt(regexp: MutPtr<URegularExpression>, startindex: Int, status: MutPtr<UErrorCode>): Byte

public expect fun uregexLookingAt64(regexp: MutPtr<URegularExpression>, startindex: Long, status: MutPtr<UErrorCode>): Byte

public expect fun uregexMatches(regexp: MutPtr<URegularExpression>, startindex: Int, status: MutPtr<UErrorCode>): Byte

public expect fun uregexMatches64(regexp: MutPtr<URegularExpression>, startindex: Long, status: MutPtr<UErrorCode>): Byte

public expect fun uregexOpen(pattern: ConstPtr<UShort>, patternlength: Int, flags: UInt, pe: MutPtr<UParseError>, status: MutPtr<UErrorCode>): MutPtr<URegularExpression>

public expect fun uregexOpenC(pattern: Pcstr, flags: UInt, pe: MutPtr<UParseError>, status: MutPtr<UErrorCode>): MutPtr<URegularExpression>

public expect fun uregexOpenUtext(pattern: MutPtr<UText>, flags: UInt, pe: MutPtr<UParseError>, status: MutPtr<UErrorCode>): MutPtr<URegularExpression>

public expect fun uregexPattern(regexp: ConstPtr<URegularExpression>, patlength: MutPtr<Int>, status: MutPtr<UErrorCode>): MutPtr<UShort>

public expect fun uregexPatternUtext(regexp: ConstPtr<URegularExpression>, status: MutPtr<UErrorCode>): MutPtr<UText>

public expect fun uregexRefreshUtext(regexp: MutPtr<URegularExpression>, text: MutPtr<UText>, status: MutPtr<UErrorCode>)

public expect fun uregexRegionEnd(regexp: ConstPtr<URegularExpression>, status: MutPtr<UErrorCode>): Int

public expect fun uregexRegionEnd64(regexp: ConstPtr<URegularExpression>, status: MutPtr<UErrorCode>): Long

public expect fun uregexRegionStart(regexp: ConstPtr<URegularExpression>, status: MutPtr<UErrorCode>): Int

public expect fun uregexRegionStart64(regexp: ConstPtr<URegularExpression>, status: MutPtr<UErrorCode>): Long

public expect fun uregexReplaceAll(regexp: MutPtr<URegularExpression>, replacementtext: ConstPtr<UShort>, replacementlength: Int, destbuf: MutPtr<UShort>, destcapacity: Int, status: MutPtr<UErrorCode>): Int

public expect fun uregexReplaceAllUtext(regexp: MutPtr<URegularExpression>, replacement: MutPtr<UText>, dest: MutPtr<UText>, status: MutPtr<UErrorCode>): MutPtr<UText>

public expect fun uregexReplaceFirst(regexp: MutPtr<URegularExpression>, replacementtext: ConstPtr<UShort>, replacementlength: Int, destbuf: MutPtr<UShort>, destcapacity: Int, status: MutPtr<UErrorCode>): Int

public expect fun uregexReplaceFirstUtext(regexp: MutPtr<URegularExpression>, replacement: MutPtr<UText>, dest: MutPtr<UText>, status: MutPtr<UErrorCode>): MutPtr<UText>

public expect fun uregexRequireEnd(regexp: ConstPtr<URegularExpression>, status: MutPtr<UErrorCode>): Byte

public expect fun uregexReset(regexp: MutPtr<URegularExpression>, index: Int, status: MutPtr<UErrorCode>)

public expect fun uregexReset64(regexp: MutPtr<URegularExpression>, index: Long, status: MutPtr<UErrorCode>)

public expect fun uregexSetFindProgressCallback(regexp: MutPtr<URegularExpression>, callback: URegexFindProgressCallback, context: ConstPtr<CVoid>, status: MutPtr<UErrorCode>)

public expect fun uregexSetMatchCallback(regexp: MutPtr<URegularExpression>, callback: URegexMatchCallback, context: ConstPtr<CVoid>, status: MutPtr<UErrorCode>)

public expect fun uregexSetRegion(regexp: MutPtr<URegularExpression>, regionstart: Int, regionlimit: Int, status: MutPtr<UErrorCode>)

public expect fun uregexSetRegion64(regexp: MutPtr<URegularExpression>, regionstart: Long, regionlimit: Long, status: MutPtr<UErrorCode>)

public expect fun uregexSetRegionAndStart(regexp: MutPtr<URegularExpression>, regionstart: Long, regionlimit: Long, startindex: Long, status: MutPtr<UErrorCode>)

public expect fun uregexSetStackLimit(regexp: MutPtr<URegularExpression>, limit: Int, status: MutPtr<UErrorCode>)

public expect fun uregexSetText(regexp: MutPtr<URegularExpression>, text: ConstPtr<UShort>, textlength: Int, status: MutPtr<UErrorCode>)

public expect fun uregexSetTimeLimit(regexp: MutPtr<URegularExpression>, limit: Int, status: MutPtr<UErrorCode>)

public expect fun uregexSetUtext(regexp: MutPtr<URegularExpression>, text: MutPtr<UText>, status: MutPtr<UErrorCode>)

public expect fun uregexSplit(regexp: MutPtr<URegularExpression>, destbuf: MutPtr<UShort>, destcapacity: Int, requiredcapacity: MutPtr<Int>, destfields: MutPtr<MutPtr<UShort>>, destfieldscapacity: Int, status: MutPtr<UErrorCode>): Int

public expect fun uregexSplitUtext(regexp: MutPtr<URegularExpression>, destfields: MutPtr<MutPtr<UText>>, destfieldscapacity: Int, status: MutPtr<UErrorCode>): Int

public expect fun uregexStart(regexp: MutPtr<URegularExpression>, groupnum: Int, status: MutPtr<UErrorCode>): Int

public expect fun uregexStart64(regexp: MutPtr<URegularExpression>, groupnum: Int, status: MutPtr<UErrorCode>): Long

public expect fun uregexUseAnchoringBounds(regexp: MutPtr<URegularExpression>, b: Byte, status: MutPtr<UErrorCode>)

public expect fun uregexUseTransparentBounds(regexp: MutPtr<URegularExpression>, b: Byte, status: MutPtr<UErrorCode>)

public expect fun uregionAreEqual(uregion: ConstPtr<URegion>, otherregion: ConstPtr<URegion>): Byte

public expect fun uregionContains(uregion: ConstPtr<URegion>, otherregion: ConstPtr<URegion>): Byte

public expect fun uregionGetAvailable(type: URegionType, status: MutPtr<UErrorCode>): MutPtr<UEnumeration>

public expect fun uregionGetContainedRegions(uregion: ConstPtr<URegion>, status: MutPtr<UErrorCode>): MutPtr<UEnumeration>

public expect fun uregionGetContainedRegionsOfType(uregion: ConstPtr<URegion>, type: URegionType, status: MutPtr<UErrorCode>): MutPtr<UEnumeration>

public expect fun uregionGetContainingRegion(uregion: ConstPtr<URegion>): MutPtr<URegion>

public expect fun uregionGetContainingRegionOfType(uregion: ConstPtr<URegion>, type: URegionType): MutPtr<URegion>

public expect fun uregionGetNumericCode(uregion: ConstPtr<URegion>): Int
