package io.github.kotlinmania.windowssys.windows.win32.globalization

import io.github.kotlinmania.windowssys.core.PCSTR

public expect fun ucnv_fromUCountPending(cnv: Long, status: Long): Int

public expect fun ucnv_fromUnicode(converter: Long, target: Long, targetlimit: PCSTR, source: Long, sourcelimit: Long, offsets: Long, flush: Byte, err: Long)

public expect fun ucnv_getAlias(alias: PCSTR, n: UShort, perrorcode: Long): PCSTR

public expect fun ucnv_getAliases(alias: PCSTR, aliases: Long, perrorcode: Long)

public expect fun ucnv_getAvailableName(n: Int): PCSTR

public expect fun ucnv_getCCSID(converter: Long, err: Long): Int

public expect fun ucnv_getCanonicalName(alias: PCSTR, standard: PCSTR, perrorcode: Long): PCSTR

public expect fun ucnv_getDefaultName(): PCSTR

public expect fun ucnv_getDisplayName(converter: Long, displaylocale: PCSTR, displayname: Long, displaynamecapacity: Int, err: Long): Int

public expect fun ucnv_getFromUCallBack(converter: Long, action: Long, context: Long)

public expect fun ucnv_getInvalidChars(converter: Long, errbytes: PCSTR, len: Long, err: Long)

public expect fun ucnv_getInvalidUChars(converter: Long, erruchars: Long, len: Long, err: Long)

public expect fun ucnv_getMaxCharSize(converter: Long): Byte

public expect fun ucnv_getMinCharSize(converter: Long): Byte

public expect fun ucnv_getName(converter: Long, err: Long): PCSTR

public expect fun ucnv_getNextUChar(converter: Long, source: Long, sourcelimit: PCSTR, err: Long): Int

public expect fun ucnv_getPlatform(converter: Long, err: Long): UConverterPlatform

public expect fun ucnv_getStandard(n: UShort, perrorcode: Long): PCSTR

public expect fun ucnv_getStandardName(name: PCSTR, standard: PCSTR, perrorcode: Long): PCSTR

public expect fun ucnv_getStarters(converter: Long, starters: Long, err: Long)

public expect fun ucnv_getSubstChars(converter: Long, subchars: PCSTR, len: Long, err: Long)

public expect fun ucnv_getToUCallBack(converter: Long, action: Long, context: Long)

public expect fun ucnv_getType(converter: Long): UConverterType

public expect fun ucnv_getUnicodeSet(cnv: Long, setfillin: Long, whichset: UConverterUnicodeSet, perrorcode: Long)

public expect fun ucnv_isAmbiguous(cnv: Long): Byte

public expect fun ucnv_isFixedWidth(cnv: Long, status: Long): Byte

public expect fun ucnv_open(convertername: PCSTR, err: Long): Long

public expect fun ucnv_openAllNames(perrorcode: Long): Long

public expect fun ucnv_openCCSID(codepage: Int, platform: UConverterPlatform, err: Long): Long

public expect fun ucnv_openPackage(packagename: PCSTR, convertername: PCSTR, err: Long): Long

public expect fun ucnv_openStandardNames(convname: PCSTR, standard: PCSTR, perrorcode: Long): Long

public expect fun ucnv_openU(name: Long, err: Long): Long

public expect fun ucnv_reset(converter: Long)

public expect fun ucnv_resetFromUnicode(converter: Long)

public expect fun ucnv_resetToUnicode(converter: Long)

public expect fun ucnv_safeClone(cnv: Long, stackbuffer: Long, pbuffersize: Long, status: Long): Long

public expect fun ucnv_setDefaultName(name: PCSTR)

public expect fun ucnv_setFallback(cnv: Long, usesfallback: Byte)

public expect fun ucnv_setFromUCallBack(converter: Long, newaction: UConverterFromUCallback, newcontext: Long, oldaction: Long, oldcontext: Long, err: Long)

public expect fun ucnv_setSubstChars(converter: Long, subchars: PCSTR, len: Byte, err: Long)

public expect fun ucnv_setSubstString(cnv: Long, s: Long, length: Int, err: Long)

public expect fun ucnv_setToUCallBack(converter: Long, newaction: UConverterToUCallback, newcontext: Long, oldaction: Long, oldcontext: Long, err: Long)

public expect fun ucnv_toAlgorithmic(algorithmictype: UConverterType, cnv: Long, target: PCSTR, targetcapacity: Int, source: PCSTR, sourcelength: Int, perrorcode: Long): Int

public expect fun ucnv_toUChars(cnv: Long, dest: Long, destcapacity: Int, src: PCSTR, srclength: Int, perrorcode: Long): Int

public expect fun ucnv_toUCountPending(cnv: Long, status: Long): Int

public expect fun ucnv_toUnicode(converter: Long, target: Long, targetlimit: Long, source: Long, sourcelimit: PCSTR, offsets: Long, flush: Byte, err: Long)

public expect fun ucnv_usesFallback(cnv: Long): Byte

public expect fun ucnvsel_close(sel: Long)

public expect fun ucnvsel_open(converterlist: Long, converterlistsize: Int, excludedcodepoints: Long, whichset: UConverterUnicodeSet, status: Long): Long

public expect fun ucnvsel_openFromSerialized(buffer: Long, length: Int, status: Long): Long

public expect fun ucnvsel_selectForString(sel: Long, s: Long, length: Int, status: Long): Long

public expect fun ucnvsel_selectForUTF8(sel: Long, s: PCSTR, length: Int, status: Long): Long

public expect fun ucnvsel_serialize(sel: Long, buffer: Long, buffercapacity: Int, status: Long): Int

public expect fun ucol_cloneBinary(coll: Long, buffer: Long, capacity: Int, status: Long): Int

public expect fun ucol_close(coll: Long)

public expect fun ucol_closeElements(elems: Long)

public expect fun ucol_countAvailable(): Int

public expect fun ucol_equal(coll: Long, source: Long, sourcelength: Int, target: Long, targetlength: Int): Byte

public expect fun ucol_getAttribute(coll: Long, attr: UColAttribute, status: Long): UColAttributeValue

public expect fun ucol_getAvailable(localeindex: Int): PCSTR

public expect fun ucol_getBound(source: Long, sourcelength: Int, boundtype: UColBoundMode, nooflevels: UInt, result: Long, resultlength: Int, status: Long): Int

public expect fun ucol_getContractionsAndExpansions(coll: Long, contractions: Long, expansions: Long, addprefixes: Byte, status: Long)

public expect fun ucol_getDisplayName(objloc: PCSTR, disploc: PCSTR, result: Long, resultlength: Int, status: Long): Int

public expect fun ucol_getEquivalentReorderCodes(reordercode: Int, dest: Long, destcapacity: Int, perrorcode: Long): Int

public expect fun ucol_getFunctionalEquivalent(result: PCSTR, resultcapacity: Int, keyword: PCSTR, locale: PCSTR, isavailable: Long, status: Long): Int

public expect fun ucol_getKeywordValues(keyword: PCSTR, status: Long): Long

public expect fun ucol_getKeywordValuesForLocale(key: PCSTR, locale: PCSTR, commonlyused: Byte, status: Long): Long

public expect fun ucol_getKeywords(status: Long): Long

public expect fun ucol_getLocaleByType(coll: Long, type: ULocDataLocaleType, status: Long): PCSTR

public expect fun ucol_getMaxExpansion(elems: Long, order: Int): Int

public expect fun ucol_getMaxVariable(coll: Long): UColReorderCode

public expect fun ucol_getOffset(elems: Long): Int

public expect fun ucol_getReorderCodes(coll: Long, dest: Long, destcapacity: Int, perrorcode: Long): Int

public expect fun ucol_getRules(coll: Long, length: Long): Long

public expect fun ucol_getRulesEx(coll: Long, delta: UColRuleOption, buffer: Long, bufferlen: Int): Int

public expect fun ucol_getSortKey(coll: Long, source: Long, sourcelength: Int, result: Long, resultlength: Int): Int

public expect fun ucol_getStrength(coll: Long): UColAttributeValue

public expect fun ucol_getTailoredSet(coll: Long, status: Long): Long

public expect fun ucol_getUCAVersion(coll: Long, info: Long)

public expect fun ucol_getVariableTop(coll: Long, status: Long): UInt

public expect fun ucol_getVersion(coll: Long, info: Long)

public expect fun ucol_greater(coll: Long, source: Long, sourcelength: Int, target: Long, targetlength: Int): Byte

public expect fun ucol_greaterOrEqual(coll: Long, source: Long, sourcelength: Int, target: Long, targetlength: Int): Byte

public expect fun ucol_keyHashCode(key: Long, length: Int): Int

public expect fun ucol_mergeSortkeys(src1: Long, src1length: Int, src2: Long, src2length: Int, dest: Long, destcapacity: Int): Int

public expect fun ucol_next(elems: Long, status: Long): Int

public expect fun ucol_nextSortKeyPart(coll: Long, iter: Long, state: Long, dest: Long, count: Int, status: Long): Int

public expect fun ucol_open(loc: PCSTR, status: Long): Long

public expect fun ucol_openAvailableLocales(status: Long): Long

public expect fun ucol_openBinary(bin: Long, length: Int, base: Long, status: Long): Long

public expect fun ucol_openElements(coll: Long, text: Long, textlength: Int, status: Long): Long

public expect fun ucol_openRules(rules: Long, ruleslength: Int, normalizationmode: UColAttributeValue, strength: UColAttributeValue, parseerror: Long, status: Long): Long

public expect fun ucol_previous(elems: Long, status: Long): Int

public expect fun ucol_primaryOrder(order: Int): Int

public expect fun ucol_reset(elems: Long)

public expect fun ucol_safeClone(coll: Long, stackbuffer: Long, pbuffersize: Long, status: Long): Long

public expect fun ucol_secondaryOrder(order: Int): Int

public expect fun ucol_setAttribute(coll: Long, attr: UColAttribute, value: UColAttributeValue, status: Long)

public expect fun ucol_setMaxVariable(coll: Long, group: UColReorderCode, perrorcode: Long)

public expect fun ucol_setOffset(elems: Long, offset: Int, status: Long)

public expect fun ucol_setReorderCodes(coll: Long, reordercodes: Long, reordercodeslength: Int, perrorcode: Long)

public expect fun ucol_setStrength(coll: Long, strength: UColAttributeValue)

public expect fun ucol_setText(elems: Long, text: Long, textlength: Int, status: Long)

public expect fun ucol_strcoll(coll: Long, source: Long, sourcelength: Int, target: Long, targetlength: Int): UCollationResult

public expect fun ucol_strcollIter(coll: Long, siter: Long, titer: Long, status: Long): UCollationResult

public expect fun ucol_strcollUTF8(coll: Long, source: PCSTR, sourcelength: Int, target: PCSTR, targetlength: Int, status: Long): UCollationResult

public expect fun ucol_tertiaryOrder(order: Int): Int

public expect fun ucpmap_get(map: Long, c: Int): UInt

public expect fun ucpmap_getRange(map: Long, start: Int, option: UCPMapRangeOption, surrogatevalue: UInt, filter: Long, context: Long, pvalue: Long): Int

public expect fun ucptrie_close(trie: Long)

public expect fun ucptrie_get(trie: Long, c: Int): UInt

public expect fun ucptrie_getRange(trie: Long, start: Int, option: UCPMapRangeOption, surrogatevalue: UInt, filter: Long, context: Long, pvalue: Long): Int

public expect fun ucptrie_getType(trie: Long): UCPTrieType

public expect fun ucptrie_getValueWidth(trie: Long): UCPTrieValueWidth

public expect fun ucptrie_internalSmallIndex(trie: Long, c: Int): Int

public expect fun ucptrie_internalSmallU8Index(trie: Long, lt1: Int, t2: UByte, t3: UByte): Int

public expect fun ucptrie_internalU8PrevIndex(trie: Long, c: Int, start: Long, src: Long): Int

public expect fun ucptrie_openFromBinary(type: UCPTrieType, valuewidth: UCPTrieValueWidth, data: Long, length: Int, pactuallength: Long, perrorcode: Long): Long

public expect fun ucptrie_toBinary(trie: Long, data: Long, capacity: Int, perrorcode: Long): Int

public expect fun ucsdet_close(ucsd: Long)

public expect fun ucsdet_detect(ucsd: Long, status: Long): Long

public expect fun ucsdet_detectAll(ucsd: Long, matchesfound: Long, status: Long): Long

public expect fun ucsdet_enableInputFilter(ucsd: Long, filter: Byte): Byte

public expect fun ucsdet_getAllDetectableCharsets(ucsd: Long, status: Long): Long

public expect fun ucsdet_getConfidence(ucsm: Long, status: Long): Int

public expect fun ucsdet_getLanguage(ucsm: Long, status: Long): PCSTR

public expect fun ucsdet_getName(ucsm: Long, status: Long): PCSTR

public expect fun ucsdet_getUChars(ucsm: Long, buf: Long, cap: Int, status: Long): Int

public expect fun ucsdet_isInputFilterEnabled(ucsd: Long): Byte

public expect fun ucsdet_open(status: Long): Long

public expect fun ucsdet_setDeclaredEncoding(ucsd: Long, encoding: PCSTR, length: Int, status: Long)

public expect fun ucsdet_setText(ucsd: Long, textin: PCSTR, len: Int, status: Long)

public expect fun ucurr_countCurrencies(locale: PCSTR, date: Double, ec: Long): Int

public expect fun ucurr_forLocale(locale: PCSTR, buff: Long, buffcapacity: Int, ec: Long): Int

public expect fun ucurr_forLocaleAndDate(locale: PCSTR, date: Double, index: Int, buff: Long, buffcapacity: Int, ec: Long): Int

public expect fun ucurr_getDefaultFractionDigits(currency: Long, ec: Long): Int

public expect fun ucurr_getDefaultFractionDigitsForUsage(currency: Long, usage: UCurrencyUsage, ec: Long): Int

public expect fun ucurr_getKeywordValuesForLocale(key: PCSTR, locale: PCSTR, commonlyused: Byte, status: Long): Long

public expect fun ucurr_getName(currency: Long, locale: PCSTR, namestyle: UCurrNameStyle, ischoiceformat: Long, len: Long, ec: Long): Long

public expect fun ucurr_getNumericCode(currency: Long): Int

public expect fun ucurr_getPluralName(currency: Long, locale: PCSTR, ischoiceformat: Long, pluralcount: PCSTR, len: Long, ec: Long): Long

public expect fun ucurr_getRoundingIncrement(currency: Long, ec: Long): Double

public expect fun ucurr_getRoundingIncrementForUsage(currency: Long, usage: UCurrencyUsage, ec: Long): Double

public expect fun ucurr_isAvailable(isocode: Long, from: Double, to: Double, errorcode: Long): Byte

public expect fun ucurr_openISOCurrencies(currtype: UInt, perrorcode: Long): Long

public expect fun ucurr_register(isocode: Long, locale: PCSTR, status: Long): Long

public expect fun ucurr_unregister(key: Long, status: Long): Byte

public expect fun udat_adoptNumberFormat(fmt: Long, numberformattoadopt: Long)

public expect fun udat_adoptNumberFormatForFields(fmt: Long, fields: Long, numberformattoset: Long, status: Long)

public expect fun udat_applyPattern(format: Long, localized: Byte, pattern: Long, patternlength: Int)

public expect fun udat_clone(fmt: Long, status: Long): Long

public expect fun udat_close(format: Long)

public expect fun udat_countAvailable(): Int

public expect fun udat_countSymbols(fmt: Long, type: UDateFormatSymbolType): Int

public expect fun udat_format(format: Long, datetoformat: Double, result: Long, resultlength: Int, position: Long, status: Long): Int

public expect fun udat_formatCalendar(format: Long, calendar: Long, result: Long, capacity: Int, position: Long, status: Long): Int

public expect fun udat_formatCalendarForFields(format: Long, calendar: Long, result: Long, capacity: Int, fpositer: Long, status: Long): Int

public expect fun udat_formatForFields(format: Long, datetoformat: Double, result: Long, resultlength: Int, fpositer: Long, status: Long): Int

public expect fun udat_get2DigitYearStart(fmt: Long, status: Long): Double

public expect fun udat_getAvailable(localeindex: Int): PCSTR

public expect fun udat_getBooleanAttribute(fmt: Long, attr: UDateFormatBooleanAttribute, status: Long): Byte

public expect fun udat_getCalendar(fmt: Long): Long

public expect fun udat_getContext(fmt: Long, type: UDisplayContextType, status: Long): UDisplayContext

public expect fun udat_getLocaleByType(fmt: Long, type: ULocDataLocaleType, status: Long): PCSTR

public expect fun udat_getNumberFormat(fmt: Long): Long

public expect fun udat_getNumberFormatForField(fmt: Long, field: UShort): Long

public expect fun udat_getSymbols(fmt: Long, type: UDateFormatSymbolType, symbolindex: Int, result: Long, resultlength: Int, status: Long): Int

public expect fun udat_isLenient(fmt: Long): Byte

public expect fun udat_open(timestyle: UDateFormatStyle, datestyle: UDateFormatStyle, locale: PCSTR, tzid: Long, tzidlength: Int, pattern: Long, patternlength: Int, status: Long): Long

public expect fun udat_parse(format: Long, text: Long, textlength: Int, parsepos: Long, status: Long): Double

public expect fun udat_parseCalendar(format: Long, calendar: Long, text: Long, textlength: Int, parsepos: Long, status: Long)

public expect fun udat_set2DigitYearStart(fmt: Long, d: Double, status: Long)

public expect fun udat_setBooleanAttribute(fmt: Long, attr: UDateFormatBooleanAttribute, newvalue: Byte, status: Long)

public expect fun udat_setCalendar(fmt: Long, calendartoset: Long)

public expect fun udat_setContext(fmt: Long, value: UDisplayContext, status: Long)

public expect fun udat_setLenient(fmt: Long, islenient: Byte)

public expect fun udat_setNumberFormat(fmt: Long, numberformattoset: Long)

public expect fun udat_setSymbols(format: Long, type: UDateFormatSymbolType, symbolindex: Int, value: Long, valuelength: Int, status: Long)

public expect fun udat_toCalendarDateField(field: UDateFormatField): UCalendarDateFields

public expect fun udat_toPattern(fmt: Long, localized: Byte, result: Long, resultlength: Int, status: Long): Int

public expect fun udatpg_addPattern(dtpg: Long, pattern: Long, patternlength: Int, override: Byte, conflictingpattern: Long, capacity: Int, plength: Long, perrorcode: Long): UDateTimePatternConflict

public expect fun udatpg_clone(dtpg: Long, perrorcode: Long): Long

public expect fun udatpg_close(dtpg: Long)

public expect fun udatpg_getAppendItemFormat(dtpg: Long, field: UDateTimePatternField, plength: Long): Long

public expect fun udatpg_getAppendItemName(dtpg: Long, field: UDateTimePatternField, plength: Long): Long

public expect fun udatpg_getBaseSkeleton(unuseddtpg: Long, pattern: Long, length: Int, baseskeleton: Long, capacity: Int, perrorcode: Long): Int

public expect fun udatpg_getBestPattern(dtpg: Long, skeleton: Long, length: Int, bestpattern: Long, capacity: Int, perrorcode: Long): Int

public expect fun udatpg_getBestPatternWithOptions(dtpg: Long, skeleton: Long, length: Int, options: UDateTimePatternMatchOptions, bestpattern: Long, capacity: Int, perrorcode: Long): Int

public expect fun udatpg_getDateTimeFormat(dtpg: Long, plength: Long): Long

public expect fun udatpg_getDecimal(dtpg: Long, plength: Long): Long

public expect fun udatpg_getFieldDisplayName(dtpg: Long, field: UDateTimePatternField, width: UDateTimePGDisplayWidth, fieldname: Long, capacity: Int, perrorcode: Long): Int

public expect fun udatpg_getPatternForSkeleton(dtpg: Long, skeleton: Long, skeletonlength: Int, plength: Long): Long

public expect fun udatpg_getSkeleton(unuseddtpg: Long, pattern: Long, length: Int, skeleton: Long, capacity: Int, perrorcode: Long): Int

public expect fun udatpg_open(locale: PCSTR, perrorcode: Long): Long

public expect fun udatpg_openBaseSkeletons(dtpg: Long, perrorcode: Long): Long

public expect fun udatpg_openEmpty(perrorcode: Long): Long

public expect fun udatpg_openSkeletons(dtpg: Long, perrorcode: Long): Long

public expect fun udatpg_replaceFieldTypes(dtpg: Long, pattern: Long, patternlength: Int, skeleton: Long, skeletonlength: Int, dest: Long, destcapacity: Int, perrorcode: Long): Int

public expect fun udatpg_replaceFieldTypesWithOptions(dtpg: Long, pattern: Long, patternlength: Int, skeleton: Long, skeletonlength: Int, options: UDateTimePatternMatchOptions, dest: Long, destcapacity: Int, perrorcode: Long): Int

public expect fun udatpg_setAppendItemFormat(dtpg: Long, field: UDateTimePatternField, value: Long, length: Int)

public expect fun udatpg_setAppendItemName(dtpg: Long, field: UDateTimePatternField, value: Long, length: Int)

public expect fun udatpg_setDateTimeFormat(dtpg: Long, dtformat: Long, length: Int)

public expect fun udatpg_setDecimal(dtpg: Long, decimal: Long, length: Int)

public expect fun udtitvfmt_close(formatter: Long)

public expect fun udtitvfmt_closeResult(uresult: Long)

public expect fun udtitvfmt_format(formatter: Long, fromdate: Double, todate: Double, result: Long, resultcapacity: Int, position: Long, status: Long): Int

public expect fun udtitvfmt_open(locale: PCSTR, skeleton: Long, skeletonlength: Int, tzid: Long, tzidlength: Int, status: Long): Long

public expect fun udtitvfmt_openResult(ec: Long): Long

public expect fun udtitvfmt_resultAsValue(uresult: Long, ec: Long): Long

public expect fun uenum_close(en: Long)

public expect fun uenum_count(en: Long, status: Long): Int

public expect fun uenum_next(en: Long, resultlength: Long, status: Long): PCSTR

public expect fun uenum_openCharStringsEnumeration(strings: Long, count: Int, ec: Long): Long

public expect fun uenum_openUCharStringsEnumeration(strings: Long, count: Int, ec: Long): Long

public expect fun uenum_reset(en: Long, status: Long)

public expect fun uenum_unext(en: Long, resultlength: Long, status: Long): Long

public expect fun ufieldpositer_close(fpositer: Long)

public expect fun ufieldpositer_next(fpositer: Long, beginindex: Long, endindex: Long): Int

public expect fun ufieldpositer_open(status: Long): Long

public expect fun ufmt_close(fmt: Long)

public expect fun ufmt_getArrayItemByIndex(fmt: Long, n: Int, status: Long): Long

public expect fun ufmt_getArrayLength(fmt: Long, status: Long): Int

public expect fun ufmt_getDate(fmt: Long, status: Long): Double

public expect fun ufmt_getDecNumChars(fmt: Long, len: Long, status: Long): PCSTR

public expect fun ufmt_getDouble(fmt: Long, status: Long): Double

public expect fun ufmt_getInt64(fmt: Long, status: Long): Long

public expect fun ufmt_getLong(fmt: Long, status: Long): Int

public expect fun ufmt_getObject(fmt: Long, status: Long): Long

public expect fun ufmt_getType(fmt: Long, status: Long): UFormattableType

public expect fun ufmt_getUChars(fmt: Long, len: Long, status: Long): Long

public expect fun ufmt_isNumeric(fmt: Long): Byte

public expect fun ufmt_open(status: Long): Long

public expect fun ufmtval_getString(ufmtval: Long, plength: Long, ec: Long): Long

public expect fun ufmtval_nextPosition(ufmtval: Long, ucfpos: Long, ec: Long): Byte

public expect fun ugender_getInstance(locale: PCSTR, status: Long): Long

public expect fun ugender_getListGender(genderinfo: Long, genders: Long, size: Int, status: Long): UGender

public expect fun uidna_close(idna: Long)

public expect fun uidna_labelToASCII(idna: Long, label: Long, length: Int, dest: Long, capacity: Int, pinfo: Long, perrorcode: Long): Int

public expect fun uidna_labelToASCII_UTF8(idna: Long, label: PCSTR, length: Int, dest: PCSTR, capacity: Int, pinfo: Long, perrorcode: Long): Int

public expect fun uidna_labelToUnicode(idna: Long, label: Long, length: Int, dest: Long, capacity: Int, pinfo: Long, perrorcode: Long): Int

public expect fun uidna_labelToUnicodeUTF8(idna: Long, label: PCSTR, length: Int, dest: PCSTR, capacity: Int, pinfo: Long, perrorcode: Long): Int

public expect fun uidna_nameToASCII(idna: Long, name: Long, length: Int, dest: Long, capacity: Int, pinfo: Long, perrorcode: Long): Int

public expect fun uidna_nameToASCII_UTF8(idna: Long, name: PCSTR, length: Int, dest: PCSTR, capacity: Int, pinfo: Long, perrorcode: Long): Int

public expect fun uidna_nameToUnicode(idna: Long, name: Long, length: Int, dest: Long, capacity: Int, pinfo: Long, perrorcode: Long): Int

public expect fun uidna_nameToUnicodeUTF8(idna: Long, name: PCSTR, length: Int, dest: PCSTR, capacity: Int, pinfo: Long, perrorcode: Long): Int

public expect fun uidna_openUTS46(options: UInt, perrorcode: Long): Long

public expect fun uiter_current32(iter: Long): Int

public expect fun uiter_getState(iter: Long): UInt

public expect fun uiter_next32(iter: Long): Int

public expect fun uiter_previous32(iter: Long): Int

public expect fun uiter_setState(iter: Long, state: UInt, perrorcode: Long)

public expect fun uiter_setString(iter: Long, s: Long, length: Int)

public expect fun uiter_setUTF16BE(iter: Long, s: PCSTR, length: Int)

public expect fun uiter_setUTF8(iter: Long, s: PCSTR, length: Int)

public expect fun uldn_close(ldn: Long)

public expect fun uldn_getContext(ldn: Long, type: UDisplayContextType, perrorcode: Long): UDisplayContext

public expect fun uldn_getDialectHandling(ldn: Long): UDialectHandling

public expect fun uldn_getLocale(ldn: Long): PCSTR

public expect fun uldn_keyDisplayName(ldn: Long, key: PCSTR, result: Long, maxresultsize: Int, perrorcode: Long): Int

public expect fun uldn_keyValueDisplayName(ldn: Long, key: PCSTR, value: PCSTR, result: Long, maxresultsize: Int, perrorcode: Long): Int

public expect fun uldn_languageDisplayName(ldn: Long, lang: PCSTR, result: Long, maxresultsize: Int, perrorcode: Long): Int

public expect fun uldn_localeDisplayName(ldn: Long, locale: PCSTR, result: Long, maxresultsize: Int, perrorcode: Long): Int

public expect fun uldn_open(locale: PCSTR, dialecthandling: UDialectHandling, perrorcode: Long): Long

public expect fun uldn_openForContext(locale: PCSTR, contexts: Long, length: Int, perrorcode: Long): Long

public expect fun uldn_regionDisplayName(ldn: Long, region: PCSTR, result: Long, maxresultsize: Int, perrorcode: Long): Int

public expect fun uldn_scriptCodeDisplayName(ldn: Long, scriptcode: UScriptCode, result: Long, maxresultsize: Int, perrorcode: Long): Int

public expect fun uldn_scriptDisplayName(ldn: Long, script: PCSTR, result: Long, maxresultsize: Int, perrorcode: Long): Int

public expect fun uldn_variantDisplayName(ldn: Long, variant: PCSTR, result: Long, maxresultsize: Int, perrorcode: Long): Int

public expect fun ulistfmt_close(listfmt: Long)

public expect fun ulistfmt_closeResult(uresult: Long)

public expect fun ulistfmt_format(listfmt: Long, strings: Long, stringlengths: Long, stringcount: Int, result: Long, resultcapacity: Int, status: Long): Int

public expect fun ulistfmt_formatStringsToResult(listfmt: Long, strings: Long, stringlengths: Long, stringcount: Int, uresult: Long, status: Long)

public expect fun ulistfmt_open(locale: PCSTR, status: Long): Long

public expect fun ulistfmt_openForType(locale: PCSTR, type: UListFormatterType, width: UListFormatterWidth, status: Long): Long

public expect fun ulistfmt_openResult(ec: Long): Long

public expect fun ulistfmt_resultAsValue(uresult: Long, ec: Long): Long

public expect fun uloc_acceptLanguage(result: PCSTR, resultavailable: Int, outresult: Long, acceptlist: Long, acceptlistcount: Int, availablelocales: Long, status: Long): Int

public expect fun uloc_acceptLanguageFromHTTP(result: PCSTR, resultavailable: Int, outresult: Long, httpacceptlanguage: PCSTR, availablelocales: Long, status: Long): Int

public expect fun uloc_addLikelySubtags(localeid: PCSTR, maximizedlocaleid: PCSTR, maximizedlocaleidcapacity: Int, err: Long): Int

public expect fun uloc_canonicalize(localeid: PCSTR, name: PCSTR, namecapacity: Int, err: Long): Int

public expect fun uloc_countAvailable(): Int

public expect fun uloc_forLanguageTag(langtag: PCSTR, localeid: PCSTR, localeidcapacity: Int, parsedlength: Long, err: Long): Int

public expect fun uloc_getAvailable(n: Int): PCSTR

public expect fun uloc_getBaseName(localeid: PCSTR, name: PCSTR, namecapacity: Int, err: Long): Int

public expect fun uloc_getCharacterOrientation(localeid: PCSTR, status: Long): ULayoutType

public expect fun uloc_getCountry(localeid: PCSTR, country: PCSTR, countrycapacity: Int, err: Long): Int

public expect fun uloc_getDefault(): PCSTR

public expect fun uloc_getDisplayCountry(locale: PCSTR, displaylocale: PCSTR, country: Long, countrycapacity: Int, status: Long): Int

public expect fun uloc_getDisplayKeyword(keyword: PCSTR, displaylocale: PCSTR, dest: Long, destcapacity: Int, status: Long): Int

public expect fun uloc_getDisplayKeywordValue(locale: PCSTR, keyword: PCSTR, displaylocale: PCSTR, dest: Long, destcapacity: Int, status: Long): Int

public expect fun uloc_getDisplayLanguage(locale: PCSTR, displaylocale: PCSTR, language: Long, languagecapacity: Int, status: Long): Int

public expect fun uloc_getDisplayName(localeid: PCSTR, inlocaleid: PCSTR, result: Long, maxresultsize: Int, err: Long): Int

public expect fun uloc_getDisplayScript(locale: PCSTR, displaylocale: PCSTR, script: Long, scriptcapacity: Int, status: Long): Int

public expect fun uloc_getDisplayVariant(locale: PCSTR, displaylocale: PCSTR, variant: Long, variantcapacity: Int, status: Long): Int

public expect fun uloc_getISO3Country(localeid: PCSTR): PCSTR

public expect fun uloc_getISO3Language(localeid: PCSTR): PCSTR

public expect fun uloc_getISOCountries(): Long

public expect fun uloc_getISOLanguages(): Long

public expect fun uloc_getKeywordValue(localeid: PCSTR, keywordname: PCSTR, buffer: PCSTR, buffercapacity: Int, status: Long): Int

public expect fun uloc_getLCID(localeid: PCSTR): UInt

public expect fun uloc_getLanguage(localeid: PCSTR, language: PCSTR, languagecapacity: Int, err: Long): Int

public expect fun uloc_getLineOrientation(localeid: PCSTR, status: Long): ULayoutType

public expect fun uloc_getLocaleForLCID(hostid: UInt, locale: PCSTR, localecapacity: Int, status: Long): Int

public expect fun uloc_getName(localeid: PCSTR, name: PCSTR, namecapacity: Int, err: Long): Int

public expect fun uloc_getParent(localeid: PCSTR, parent: PCSTR, parentcapacity: Int, err: Long): Int

public expect fun uloc_getScript(localeid: PCSTR, script: PCSTR, scriptcapacity: Int, err: Long): Int

public expect fun uloc_getVariant(localeid: PCSTR, variant: PCSTR, variantcapacity: Int, err: Long): Int

public expect fun uloc_isRightToLeft(locale: PCSTR): Byte

public expect fun uloc_minimizeSubtags(localeid: PCSTR, minimizedlocaleid: PCSTR, minimizedlocaleidcapacity: Int, err: Long): Int

public expect fun uloc_openAvailableByType(type: ULocAvailableType, status: Long): Long

public expect fun uloc_openKeywords(localeid: PCSTR, status: Long): Long

public expect fun uloc_setDefault(localeid: PCSTR, status: Long)

public expect fun uloc_setKeywordValue(keywordname: PCSTR, keywordvalue: PCSTR, buffer: PCSTR, buffercapacity: Int, status: Long): Int

public expect fun uloc_toLanguageTag(localeid: PCSTR, langtag: PCSTR, langtagcapacity: Int, strict: Byte, err: Long): Int

public expect fun uloc_toLegacyKey(keyword: PCSTR): PCSTR

public expect fun uloc_toLegacyType(keyword: PCSTR, value: PCSTR): PCSTR

public expect fun uloc_toUnicodeLocaleKey(keyword: PCSTR): PCSTR

public expect fun uloc_toUnicodeLocaleType(keyword: PCSTR, value: PCSTR): PCSTR

public expect fun ulocdata_close(uld: Long)

public expect fun ulocdata_getCLDRVersion(versionarray: Long, status: Long)

public expect fun ulocdata_getDelimiter(uld: Long, type: ULocaleDataDelimiterType, result: Long, resultlength: Int, status: Long): Int

public expect fun ulocdata_getExemplarSet(uld: Long, fillin: Long, options: UInt, extype: ULocaleDataExemplarSetType, status: Long): Long

public expect fun ulocdata_getLocaleDisplayPattern(uld: Long, pattern: Long, patterncapacity: Int, status: Long): Int

public expect fun ulocdata_getLocaleSeparator(uld: Long, separator: Long, separatorcapacity: Int, status: Long): Int

public expect fun ulocdata_getMeasurementSystem(localeid: PCSTR, status: Long): UMeasurementSystem

public expect fun ulocdata_getNoSubstitute(uld: Long): Byte

public expect fun ulocdata_getPaperSize(localeid: PCSTR, height: Long, width: Long, status: Long)

public expect fun ulocdata_open(localeid: PCSTR, status: Long): Long

public expect fun ulocdata_setNoSubstitute(uld: Long, setting: Byte)

public expect fun umsg_applyPattern(fmt: Long, pattern: Long, patternlength: Int, parseerror: Long, status: Long)

public expect fun umsg_autoQuoteApostrophe(pattern: Long, patternlength: Int, dest: Long, destcapacity: Int, ec: Long): Int

public expect fun umsg_clone(fmt: Long, status: Long): Long

public expect fun umsg_close(format: Long)

public expect fun umsg_format(fmt: Long, result: Long, resultlength: Int, status: Long, vararg variadicArgs: Long): Int

public expect fun umsg_getLocale(fmt: Long): PCSTR

public expect fun umsg_open(pattern: Long, patternlength: Int, locale: PCSTR, parseerror: Long, status: Long): Long

public expect fun umsg_parse(fmt: Long, source: Long, sourcelength: Int, count: Long, status: Long, vararg variadicArgs: Long)

public expect fun umsg_setLocale(fmt: Long, locale: PCSTR)

public expect fun umsg_toPattern(fmt: Long, result: Long, resultlength: Int, status: Long): Int

public expect fun umsg_vformat(fmt: Long, result: Long, resultlength: Int, ap: Long, status: Long): Int

public expect fun umsg_vparse(fmt: Long, source: Long, sourcelength: Int, count: Long, ap: Long, status: Long)

public expect fun umutablecptrie_buildImmutable(trie: Long, type: UCPTrieType, valuewidth: UCPTrieValueWidth, perrorcode: Long): Long

public expect fun umutablecptrie_clone(other: Long, perrorcode: Long): Long

public expect fun umutablecptrie_close(trie: Long)

public expect fun umutablecptrie_fromUCPMap(map: Long, perrorcode: Long): Long

public expect fun umutablecptrie_fromUCPTrie(trie: Long, perrorcode: Long): Long

public expect fun umutablecptrie_get(trie: Long, c: Int): UInt

public expect fun umutablecptrie_getRange(trie: Long, start: Int, option: UCPMapRangeOption, surrogatevalue: UInt, filter: Long, context: Long, pvalue: Long): Int

public expect fun umutablecptrie_open(initialvalue: UInt, errorvalue: UInt, perrorcode: Long): Long

public expect fun umutablecptrie_set(trie: Long, c: Int, value: UInt, perrorcode: Long)

public expect fun umutablecptrie_setRange(trie: Long, start: Int, end: Int, value: UInt, perrorcode: Long)

public expect fun unorm2_append(norm2: Long, first: Long, firstlength: Int, firstcapacity: Int, second: Long, secondlength: Int, perrorcode: Long): Int

public expect fun unorm2_close(norm2: Long)

public expect fun unorm2_composePair(norm2: Long, a: Int, b: Int): Int

public expect fun unorm2_getCombiningClass(norm2: Long, c: Int): UByte

public expect fun unorm2_getDecomposition(norm2: Long, c: Int, decomposition: Long, capacity: Int, perrorcode: Long): Int

public expect fun unorm2_getInstance(packagename: PCSTR, name: PCSTR, mode: UNormalization2Mode, perrorcode: Long): Long

public expect fun unorm2_getNFCInstance(perrorcode: Long): Long

public expect fun unorm2_getNFDInstance(perrorcode: Long): Long

public expect fun unorm2_getNFKCCasefoldInstance(perrorcode: Long): Long

public expect fun unorm2_getNFKCInstance(perrorcode: Long): Long

public expect fun unorm2_getNFKDInstance(perrorcode: Long): Long

public expect fun unorm2_getRawDecomposition(norm2: Long, c: Int, decomposition: Long, capacity: Int, perrorcode: Long): Int

public expect fun unorm2_hasBoundaryAfter(norm2: Long, c: Int): Byte

public expect fun unorm2_hasBoundaryBefore(norm2: Long, c: Int): Byte

public expect fun unorm2_isInert(norm2: Long, c: Int): Byte

public expect fun unorm2_isNormalized(norm2: Long, s: Long, length: Int, perrorcode: Long): Byte

public expect fun unorm2_normalize(norm2: Long, src: Long, length: Int, dest: Long, capacity: Int, perrorcode: Long): Int

public expect fun unorm2_normalizeSecondAndAppend(norm2: Long, first: Long, firstlength: Int, firstcapacity: Int, second: Long, secondlength: Int, perrorcode: Long): Int

public expect fun unorm2_openFiltered(norm2: Long, filterset: Long, perrorcode: Long): Long

public expect fun unorm2_quickCheck(norm2: Long, s: Long, length: Int, perrorcode: Long): UNormalizationCheckResult

public expect fun unorm2_spanQuickCheckYes(norm2: Long, s: Long, length: Int, perrorcode: Long): Int

public expect fun unorm_compare(s1: Long, length1: Int, s2: Long, length2: Int, options: UInt, perrorcode: Long): Int

public expect fun unum_applyPattern(format: Long, localized: Byte, pattern: Long, patternlength: Int, parseerror: Long, status: Long)

public expect fun unum_clone(fmt: Long, status: Long): Long

public expect fun unum_close(fmt: Long)

public expect fun unum_countAvailable(): Int

public expect fun unum_format(fmt: Long, number: Int, result: Long, resultlength: Int, pos: Long, status: Long): Int

public expect fun unum_formatDecimal(fmt: Long, number: PCSTR, length: Int, result: Long, resultlength: Int, pos: Long, status: Long): Int

public expect fun unum_formatDouble(fmt: Long, number: Double, result: Long, resultlength: Int, pos: Long, status: Long): Int

public expect fun unum_formatDoubleCurrency(fmt: Long, number: Double, currency: Long, result: Long, resultlength: Int, pos: Long, status: Long): Int

public expect fun unum_formatDoubleForFields(format: Long, number: Double, result: Long, resultlength: Int, fpositer: Long, status: Long): Int

public expect fun unum_formatInt64(fmt: Long, number: Long, result: Long, resultlength: Int, pos: Long, status: Long): Int

public expect fun unum_formatUFormattable(fmt: Long, number: Long, result: Long, resultlength: Int, pos: Long, status: Long): Int

public expect fun unum_getAttribute(fmt: Long, attr: UNumberFormatAttribute): Int

public expect fun unum_getAvailable(localeindex: Int): PCSTR

public expect fun unum_getContext(fmt: Long, type: UDisplayContextType, status: Long): UDisplayContext

public expect fun unum_getDoubleAttribute(fmt: Long, attr: UNumberFormatAttribute): Double

public expect fun unum_getLocaleByType(fmt: Long, type: ULocDataLocaleType, status: Long): PCSTR

public expect fun unum_getSymbol(fmt: Long, symbol: UNumberFormatSymbol, buffer: Long, size: Int, status: Long): Int

public expect fun unum_getTextAttribute(fmt: Long, tag: UNumberFormatTextAttribute, result: Long, resultlength: Int, status: Long): Int

public expect fun unum_open(style: UNumberFormatStyle, pattern: Long, patternlength: Int, locale: PCSTR, parseerr: Long, status: Long): Long

public expect fun unum_parse(fmt: Long, text: Long, textlength: Int, parsepos: Long, status: Long): Int

public expect fun unum_parseDecimal(fmt: Long, text: Long, textlength: Int, parsepos: Long, outbuf: PCSTR, outbuflength: Int, status: Long): Int

public expect fun unum_parseDouble(fmt: Long, text: Long, textlength: Int, parsepos: Long, status: Long): Double

public expect fun unum_parseDoubleCurrency(fmt: Long, text: Long, textlength: Int, parsepos: Long, currency: Long, status: Long): Double

public expect fun unum_parseInt64(fmt: Long, text: Long, textlength: Int, parsepos: Long, status: Long): Long

public expect fun unum_parseToUFormattable(fmt: Long, result: Long, text: Long, textlength: Int, parsepos: Long, status: Long): Long

public expect fun unum_setAttribute(fmt: Long, attr: UNumberFormatAttribute, newvalue: Int)

public expect fun unum_setContext(fmt: Long, value: UDisplayContext, status: Long)

public expect fun unum_setDoubleAttribute(fmt: Long, attr: UNumberFormatAttribute, newvalue: Double)

public expect fun unum_setSymbol(fmt: Long, symbol: UNumberFormatSymbol, value: Long, length: Int, status: Long)

public expect fun unum_setTextAttribute(fmt: Long, tag: UNumberFormatTextAttribute, newvalue: Long, newvaluelength: Int, status: Long)

public expect fun unum_toPattern(fmt: Long, ispatternlocalized: Byte, result: Long, resultlength: Int, status: Long): Int

public expect fun unumf_close(uformatter: Long)

public expect fun unumf_closeResult(uresult: Long)

public expect fun unumf_formatDecimal(uformatter: Long, value: PCSTR, valuelen: Int, uresult: Long, ec: Long)

public expect fun unumf_formatDouble(uformatter: Long, value: Double, uresult: Long, ec: Long)

public expect fun unumf_formatInt(uformatter: Long, value: Long, uresult: Long, ec: Long)

public expect fun unumf_openForSkeletonAndLocale(skeleton: Long, skeletonlen: Int, locale: PCSTR, ec: Long): Long

public expect fun unumf_openForSkeletonAndLocaleWithError(skeleton: Long, skeletonlen: Int, locale: PCSTR, perror: Long, ec: Long): Long

public expect fun unumf_openResult(ec: Long): Long

public expect fun unumf_resultAsValue(uresult: Long, ec: Long): Long

public expect fun unumf_resultGetAllFieldPositions(uresult: Long, ufpositer: Long, ec: Long)

public expect fun unumf_resultNextFieldPosition(uresult: Long, ufpos: Long, ec: Long): Byte

public expect fun unumf_resultToString(uresult: Long, buffer: Long, buffercapacity: Int, ec: Long): Int

public expect fun unumsys_close(unumsys: Long)

public expect fun unumsys_getDescription(unumsys: Long, result: Long, resultlength: Int, status: Long): Int

public expect fun unumsys_getName(unumsys: Long): PCSTR

public expect fun unumsys_getRadix(unumsys: Long): Int

public expect fun unumsys_isAlgorithmic(unumsys: Long): Byte

public expect fun unumsys_open(locale: PCSTR, status: Long): Long

public expect fun unumsys_openAvailableNames(status: Long): Long

public expect fun unumsys_openByName(name: PCSTR, status: Long): Long

public expect fun uplrules_close(uplrules: Long)

public expect fun uplrules_getKeywords(uplrules: Long, status: Long): Long

public expect fun uplrules_open(locale: PCSTR, status: Long): Long

public expect fun uplrules_openForType(locale: PCSTR, type: UPluralType, status: Long): Long

public expect fun uplrules_select(uplrules: Long, number: Double, keyword: Long, capacity: Int, status: Long): Int

public expect fun uplrules_selectFormatted(uplrules: Long, number: Long, keyword: Long, capacity: Int, status: Long): Int

public expect fun uregex_appendReplacement(regexp: Long, replacementtext: Long, replacementlength: Int, destbuf: Long, destcapacity: Long, status: Long): Int

public expect fun uregex_appendReplacementUText(regexp: Long, replacementtext: Long, dest: Long, status: Long)

public expect fun uregex_appendTail(regexp: Long, destbuf: Long, destcapacity: Long, status: Long): Int

public expect fun uregex_appendTailUText(regexp: Long, dest: Long, status: Long): Long

public expect fun uregex_clone(regexp: Long, status: Long): Long

public expect fun uregex_close(regexp: Long)

public expect fun uregex_end(regexp: Long, groupnum: Int, status: Long): Int

public expect fun uregex_end64(regexp: Long, groupnum: Int, status: Long): Long

public expect fun uregex_find(regexp: Long, startindex: Int, status: Long): Byte

public expect fun uregex_find64(regexp: Long, startindex: Long, status: Long): Byte

public expect fun uregex_findNext(regexp: Long, status: Long): Byte

public expect fun uregex_flags(regexp: Long, status: Long): Int

public expect fun uregex_getFindProgressCallback(regexp: Long, callback: Long, context: Long, status: Long)

public expect fun uregex_getMatchCallback(regexp: Long, callback: Long, context: Long, status: Long)

public expect fun uregex_getStackLimit(regexp: Long, status: Long): Int

public expect fun uregex_getText(regexp: Long, textlength: Long, status: Long): Long

public expect fun uregex_getTimeLimit(regexp: Long, status: Long): Int

public expect fun uregex_getUText(regexp: Long, dest: Long, status: Long): Long

public expect fun uregex_group(regexp: Long, groupnum: Int, dest: Long, destcapacity: Int, status: Long): Int

public expect fun uregex_groupCount(regexp: Long, status: Long): Int

public expect fun uregex_groupNumberFromCName(regexp: Long, groupname: PCSTR, namelength: Int, status: Long): Int

public expect fun uregex_groupNumberFromName(regexp: Long, groupname: Long, namelength: Int, status: Long): Int

public expect fun uregex_groupUText(regexp: Long, groupnum: Int, dest: Long, grouplength: Long, status: Long): Long

public expect fun uregex_hasAnchoringBounds(regexp: Long, status: Long): Byte

public expect fun uregex_hasTransparentBounds(regexp: Long, status: Long): Byte

public expect fun uregex_hitEnd(regexp: Long, status: Long): Byte

public expect fun uregex_lookingAt(regexp: Long, startindex: Int, status: Long): Byte

public expect fun uregex_lookingAt64(regexp: Long, startindex: Long, status: Long): Byte

public expect fun uregex_matches(regexp: Long, startindex: Int, status: Long): Byte

public expect fun uregex_matches64(regexp: Long, startindex: Long, status: Long): Byte

public expect fun uregex_open(pattern: Long, patternlength: Int, flags: UInt, pe: Long, status: Long): Long

public expect fun uregex_openC(pattern: PCSTR, flags: UInt, pe: Long, status: Long): Long

public expect fun uregex_openUText(pattern: Long, flags: UInt, pe: Long, status: Long): Long

public expect fun uregex_pattern(regexp: Long, patlength: Long, status: Long): Long

public expect fun uregex_patternUText(regexp: Long, status: Long): Long

public expect fun uregex_refreshUText(regexp: Long, text: Long, status: Long)

public expect fun uregex_regionEnd(regexp: Long, status: Long): Int

public expect fun uregex_regionEnd64(regexp: Long, status: Long): Long

public expect fun uregex_regionStart(regexp: Long, status: Long): Int

public expect fun uregex_regionStart64(regexp: Long, status: Long): Long

public expect fun uregex_replaceAll(regexp: Long, replacementtext: Long, replacementlength: Int, destbuf: Long, destcapacity: Int, status: Long): Int

public expect fun uregex_replaceAllUText(regexp: Long, replacement: Long, dest: Long, status: Long): Long

public expect fun uregex_replaceFirst(regexp: Long, replacementtext: Long, replacementlength: Int, destbuf: Long, destcapacity: Int, status: Long): Int

public expect fun uregex_replaceFirstUText(regexp: Long, replacement: Long, dest: Long, status: Long): Long

public expect fun uregex_requireEnd(regexp: Long, status: Long): Byte

public expect fun uregex_reset(regexp: Long, index: Int, status: Long)

public expect fun uregex_reset64(regexp: Long, index: Long, status: Long)

public expect fun uregex_setFindProgressCallback(regexp: Long, callback: URegexFindProgressCallback, context: Long, status: Long)

public expect fun uregex_setMatchCallback(regexp: Long, callback: URegexMatchCallback, context: Long, status: Long)

public expect fun uregex_setRegion(regexp: Long, regionstart: Int, regionlimit: Int, status: Long)

public expect fun uregex_setRegion64(regexp: Long, regionstart: Long, regionlimit: Long, status: Long)

public expect fun uregex_setRegionAndStart(regexp: Long, regionstart: Long, regionlimit: Long, startindex: Long, status: Long)

public expect fun uregex_setStackLimit(regexp: Long, limit: Int, status: Long)

public expect fun uregex_setText(regexp: Long, text: Long, textlength: Int, status: Long)

public expect fun uregex_setTimeLimit(regexp: Long, limit: Int, status: Long)

public expect fun uregex_setUText(regexp: Long, text: Long, status: Long)

public expect fun uregex_split(regexp: Long, destbuf: Long, destcapacity: Int, requiredcapacity: Long, destfields: Long, destfieldscapacity: Int, status: Long): Int

public expect fun uregex_splitUText(regexp: Long, destfields: Long, destfieldscapacity: Int, status: Long): Int

public expect fun uregex_start(regexp: Long, groupnum: Int, status: Long): Int

public expect fun uregex_start64(regexp: Long, groupnum: Int, status: Long): Long

public expect fun uregex_useAnchoringBounds(regexp: Long, b: Byte, status: Long)

public expect fun uregex_useTransparentBounds(regexp: Long, b: Byte, status: Long)

public expect fun uregion_areEqual(uregion: Long, otherregion: Long): Byte

public expect fun uregion_contains(uregion: Long, otherregion: Long): Byte

public expect fun uregion_getAvailable(type: URegionType, status: Long): Long

public expect fun uregion_getContainedRegions(uregion: Long, status: Long): Long

public expect fun uregion_getContainedRegionsOfType(uregion: Long, type: URegionType, status: Long): Long

public expect fun uregion_getContainingRegion(uregion: Long): Long

public expect fun uregion_getContainingRegionOfType(uregion: Long, type: URegionType): Long

public expect fun uregion_getNumericCode(uregion: Long): Int
