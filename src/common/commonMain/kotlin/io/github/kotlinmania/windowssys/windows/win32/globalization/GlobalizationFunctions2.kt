package io.github.kotlinmania.windowssys.windows.win32.globalization

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.PCSTR

public fun interface FnCallback {
    public operator fun invoke(context: Long, args: Long, codeunits: Long, length: Int, codepoint: Int, reason: UConverterCallbackReason, perrorcode: Long)
}

public fun interface FnCallback1 {
    public operator fun invoke(context: Long, args: Long, codeunits: PCSTR, length: Int, reason: UConverterCallbackReason, perrorcode: Long)
}

public fun interface FnCallback2 {
    public operator fun invoke(context: Long, matchindex: Long): Byte
}

public fun interface FnCallback3 {
    public operator fun invoke(context: Long, steps: Int): Byte
}

public fun ucnv_fromUCountPending(cnv: Long, status: Long): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "ucnv_fromUCountPending", longArrayOf(cnv, status)).toInt()
}

public fun ucnv_fromUnicode(converter: Long, target: Long, targetlimit: PCSTR, source: Long, sourcelimit: Long, offsets: Long, flush: Byte, err: Long) {
    Win32DynamicFfi.invoke("icuuc.dll", "ucnv_fromUnicode", longArrayOf(converter, target, targetlimit, source, sourcelimit, offsets, flush.toLong(), err))
}

public fun ucnv_getAlias(alias: PCSTR, n: UShort, perrorcode: Long): PCSTR {
    return Win32DynamicFfi.invoke("icuuc.dll", "ucnv_getAlias", longArrayOf(alias, n.toLong(), perrorcode))
}

public fun ucnv_getAliases(alias: PCSTR, aliases: Long, perrorcode: Long) {
    Win32DynamicFfi.invoke("icuuc.dll", "ucnv_getAliases", longArrayOf(alias, aliases, perrorcode))
}

public fun ucnv_getAvailableName(n: Int): PCSTR {
    return Win32DynamicFfi.invoke("icuuc.dll", "ucnv_getAvailableName", longArrayOf(n.toLong()))
}

public fun ucnv_getCCSID(converter: Long, err: Long): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "ucnv_getCCSID", longArrayOf(converter, err)).toInt()
}

public fun ucnv_getCanonicalName(alias: PCSTR, standard: PCSTR, perrorcode: Long): PCSTR {
    return Win32DynamicFfi.invoke("icuuc.dll", "ucnv_getCanonicalName", longArrayOf(alias, standard, perrorcode))
}

public fun ucnv_getDefaultName(): PCSTR {
    return Win32DynamicFfi.invoke("icuuc.dll", "ucnv_getDefaultName", longArrayOf())
}

public fun ucnv_getDisplayName(converter: Long, displaylocale: PCSTR, displayname: Long, displaynamecapacity: Int, err: Long): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "ucnv_getDisplayName", longArrayOf(converter, displaylocale, displayname, displaynamecapacity.toLong(), err)).toInt()
}

public fun ucnv_getFromUCallBack(converter: Long, action: Long, context: Long) {
    Win32DynamicFfi.invoke("icuuc.dll", "ucnv_getFromUCallBack", longArrayOf(converter, action, context))
}

public fun ucnv_getInvalidChars(converter: Long, errbytes: PCSTR, len: Long, err: Long) {
    Win32DynamicFfi.invoke("icuuc.dll", "ucnv_getInvalidChars", longArrayOf(converter, errbytes, len, err))
}

public fun ucnv_getInvalidUChars(converter: Long, erruchars: Long, len: Long, err: Long) {
    Win32DynamicFfi.invoke("icuuc.dll", "ucnv_getInvalidUChars", longArrayOf(converter, erruchars, len, err))
}

public fun ucnv_getMaxCharSize(converter: Long): Byte {
    return Win32DynamicFfi.invoke("icuuc.dll", "ucnv_getMaxCharSize", longArrayOf(converter)).toByte()
}

public fun ucnv_getMinCharSize(converter: Long): Byte {
    return Win32DynamicFfi.invoke("icuuc.dll", "ucnv_getMinCharSize", longArrayOf(converter)).toByte()
}

public fun ucnv_getName(converter: Long, err: Long): PCSTR {
    return Win32DynamicFfi.invoke("icuuc.dll", "ucnv_getName", longArrayOf(converter, err))
}

public fun ucnv_getNextUChar(converter: Long, source: Long, sourcelimit: PCSTR, err: Long): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "ucnv_getNextUChar", longArrayOf(converter, source, sourcelimit, err)).toInt()
}

public fun ucnv_getPlatform(converter: Long, err: Long): UConverterPlatform {
    return Win32DynamicFfi.invoke("icuuc.dll", "ucnv_getPlatform", longArrayOf(converter, err)).toInt()
}

public fun ucnv_getStandard(n: UShort, perrorcode: Long): PCSTR {
    return Win32DynamicFfi.invoke("icuuc.dll", "ucnv_getStandard", longArrayOf(n.toLong(), perrorcode))
}

public fun ucnv_getStandardName(name: PCSTR, standard: PCSTR, perrorcode: Long): PCSTR {
    return Win32DynamicFfi.invoke("icuuc.dll", "ucnv_getStandardName", longArrayOf(name, standard, perrorcode))
}

public fun ucnv_getStarters(converter: Long, starters: Long, err: Long) {
    Win32DynamicFfi.invoke("icuuc.dll", "ucnv_getStarters", longArrayOf(converter, starters, err))
}

public fun ucnv_getSubstChars(converter: Long, subchars: PCSTR, len: Long, err: Long) {
    Win32DynamicFfi.invoke("icuuc.dll", "ucnv_getSubstChars", longArrayOf(converter, subchars, len, err))
}

public fun ucnv_getToUCallBack(converter: Long, action: Long, context: Long) {
    Win32DynamicFfi.invoke("icuuc.dll", "ucnv_getToUCallBack", longArrayOf(converter, action, context))
}

public fun ucnv_getType(converter: Long): UConverterType {
    return Win32DynamicFfi.invoke("icuuc.dll", "ucnv_getType", longArrayOf(converter)).toInt()
}

public fun ucnv_getUnicodeSet(cnv: Long, setfillin: Long, whichset: UConverterUnicodeSet, perrorcode: Long) {
    Win32DynamicFfi.invoke("icuuc.dll", "ucnv_getUnicodeSet", longArrayOf(cnv, setfillin, whichset.toLong(), perrorcode))
}

public fun ucnv_isAmbiguous(cnv: Long): Byte {
    return Win32DynamicFfi.invoke("icuuc.dll", "ucnv_isAmbiguous", longArrayOf(cnv)).toByte()
}

public fun ucnv_isFixedWidth(cnv: Long, status: Long): Byte {
    return Win32DynamicFfi.invoke("icuuc.dll", "ucnv_isFixedWidth", longArrayOf(cnv, status)).toByte()
}

public fun ucnv_open(convertername: PCSTR, err: Long): Long {
    return Win32DynamicFfi.invoke("icuuc.dll", "ucnv_open", longArrayOf(convertername, err))
}

public fun ucnv_openAllNames(perrorcode: Long): Long {
    return Win32DynamicFfi.invoke("icuuc.dll", "ucnv_openAllNames", longArrayOf(perrorcode))
}

public fun ucnv_openCCSID(codepage: Int, platform: UConverterPlatform, err: Long): Long {
    return Win32DynamicFfi.invoke("icuuc.dll", "ucnv_openCCSID", longArrayOf(codepage.toLong(), platform.toLong(), err))
}

public fun ucnv_openPackage(packagename: PCSTR, convertername: PCSTR, err: Long): Long {
    return Win32DynamicFfi.invoke("icuuc.dll", "ucnv_openPackage", longArrayOf(packagename, convertername, err))
}

public fun ucnv_openStandardNames(convname: PCSTR, standard: PCSTR, perrorcode: Long): Long {
    return Win32DynamicFfi.invoke("icuuc.dll", "ucnv_openStandardNames", longArrayOf(convname, standard, perrorcode))
}

public fun ucnv_openU(name: Long, err: Long): Long {
    return Win32DynamicFfi.invoke("icuuc.dll", "ucnv_openU", longArrayOf(name, err))
}

public fun ucnv_reset(converter: Long) {
    Win32DynamicFfi.invoke("icuuc.dll", "ucnv_reset", longArrayOf(converter))
}

public fun ucnv_resetFromUnicode(converter: Long) {
    Win32DynamicFfi.invoke("icuuc.dll", "ucnv_resetFromUnicode", longArrayOf(converter))
}

public fun ucnv_resetToUnicode(converter: Long) {
    Win32DynamicFfi.invoke("icuuc.dll", "ucnv_resetToUnicode", longArrayOf(converter))
}

public fun ucnv_safeClone(cnv: Long, stackbuffer: Long, pbuffersize: Long, status: Long): Long {
    return Win32DynamicFfi.invoke("icuuc.dll", "ucnv_safeClone", longArrayOf(cnv, stackbuffer, pbuffersize, status))
}

public fun ucnv_setDefaultName(name: PCSTR) {
    Win32DynamicFfi.invoke("icuuc.dll", "ucnv_setDefaultName", longArrayOf(name))
}

public fun ucnv_setFallback(cnv: Long, usesfallback: Byte) {
    Win32DynamicFfi.invoke("icuuc.dll", "ucnv_setFallback", longArrayOf(cnv, usesfallback.toLong()))
}

public fun ucnv_setFromUCallBack(converter: Long, newaction: UConverterFromUCallback, newcontext: Long, oldaction: Long, oldcontext: Long, err: Long) {
    Win32DynamicFfi.invoke("icuuc.dll", "ucnv_setFromUCallBack", longArrayOf(converter, Win32DynamicFfi.objectSlot(newaction), newcontext, oldaction, oldcontext, err))
}

public fun ucnv_setSubstChars(converter: Long, subchars: PCSTR, len: Byte, err: Long) {
    Win32DynamicFfi.invoke("icuuc.dll", "ucnv_setSubstChars", longArrayOf(converter, subchars, len.toLong(), err))
}

public fun ucnv_setSubstString(cnv: Long, s: Long, length: Int, err: Long) {
    Win32DynamicFfi.invoke("icuuc.dll", "ucnv_setSubstString", longArrayOf(cnv, s, length.toLong(), err))
}

public fun ucnv_setToUCallBack(converter: Long, newaction: UConverterToUCallback, newcontext: Long, oldaction: Long, oldcontext: Long, err: Long) {
    Win32DynamicFfi.invoke("icuuc.dll", "ucnv_setToUCallBack", longArrayOf(converter, Win32DynamicFfi.objectSlot(newaction), newcontext, oldaction, oldcontext, err))
}

public fun ucnv_toAlgorithmic(algorithmictype: UConverterType, cnv: Long, target: PCSTR, targetcapacity: Int, source: PCSTR, sourcelength: Int, perrorcode: Long): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "ucnv_toAlgorithmic", longArrayOf(algorithmictype.toLong(), cnv, target, targetcapacity.toLong(), source, sourcelength.toLong(), perrorcode)).toInt()
}

public fun ucnv_toUChars(cnv: Long, dest: Long, destcapacity: Int, src: PCSTR, srclength: Int, perrorcode: Long): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "ucnv_toUChars", longArrayOf(cnv, dest, destcapacity.toLong(), src, srclength.toLong(), perrorcode)).toInt()
}

public fun ucnv_toUCountPending(cnv: Long, status: Long): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "ucnv_toUCountPending", longArrayOf(cnv, status)).toInt()
}

public fun ucnv_toUnicode(converter: Long, target: Long, targetlimit: Long, source: Long, sourcelimit: PCSTR, offsets: Long, flush: Byte, err: Long) {
    Win32DynamicFfi.invoke("icuuc.dll", "ucnv_toUnicode", longArrayOf(converter, target, targetlimit, source, sourcelimit, offsets, flush.toLong(), err))
}

public fun ucnv_usesFallback(cnv: Long): Byte {
    return Win32DynamicFfi.invoke("icuuc.dll", "ucnv_usesFallback", longArrayOf(cnv)).toByte()
}

public fun ucnvsel_close(sel: Long) {
    Win32DynamicFfi.invoke("icuuc.dll", "ucnvsel_close", longArrayOf(sel))
}

public fun ucnvsel_open(converterlist: Long, converterlistsize: Int, excludedcodepoints: Long, whichset: UConverterUnicodeSet, status: Long): Long {
    return Win32DynamicFfi.invoke("icuuc.dll", "ucnvsel_open", longArrayOf(converterlist, converterlistsize.toLong(), excludedcodepoints, whichset.toLong(), status))
}

public fun ucnvsel_openFromSerialized(buffer: Long, length: Int, status: Long): Long {
    return Win32DynamicFfi.invoke("icuuc.dll", "ucnvsel_openFromSerialized", longArrayOf(buffer, length.toLong(), status))
}

public fun ucnvsel_selectForString(sel: Long, s: Long, length: Int, status: Long): Long {
    return Win32DynamicFfi.invoke("icuuc.dll", "ucnvsel_selectForString", longArrayOf(sel, s, length.toLong(), status))
}

public fun ucnvsel_selectForUTF8(sel: Long, s: PCSTR, length: Int, status: Long): Long {
    return Win32DynamicFfi.invoke("icuuc.dll", "ucnvsel_selectForUTF8", longArrayOf(sel, s, length.toLong(), status))
}

public fun ucnvsel_serialize(sel: Long, buffer: Long, buffercapacity: Int, status: Long): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "ucnvsel_serialize", longArrayOf(sel, buffer, buffercapacity.toLong(), status)).toInt()
}

public fun ucol_cloneBinary(coll: Long, buffer: Long, capacity: Int, status: Long): Int {
    return Win32DynamicFfi.invoke("icuin.dll", "ucol_cloneBinary", longArrayOf(coll, buffer, capacity.toLong(), status)).toInt()
}

public fun ucol_close(coll: Long) {
    Win32DynamicFfi.invoke("icuin.dll", "ucol_close", longArrayOf(coll))
}

public fun ucol_closeElements(elems: Long) {
    Win32DynamicFfi.invoke("icuin.dll", "ucol_closeElements", longArrayOf(elems))
}

public fun ucol_countAvailable(): Int {
    return Win32DynamicFfi.invoke("icuin.dll", "ucol_countAvailable", longArrayOf()).toInt()
}

public fun ucol_equal(coll: Long, source: Long, sourcelength: Int, target: Long, targetlength: Int): Byte {
    return Win32DynamicFfi.invoke("icuin.dll", "ucol_equal", longArrayOf(coll, source, sourcelength.toLong(), target, targetlength.toLong())).toByte()
}

public fun ucol_getAttribute(coll: Long, attr: UColAttribute, status: Long): UColAttributeValue {
    return Win32DynamicFfi.invoke("icuin.dll", "ucol_getAttribute", longArrayOf(coll, attr.toLong(), status)).toInt()
}

public fun ucol_getAvailable(localeindex: Int): PCSTR {
    return Win32DynamicFfi.invoke("icuin.dll", "ucol_getAvailable", longArrayOf(localeindex.toLong()))
}

public fun ucol_getBound(source: Long, sourcelength: Int, boundtype: UColBoundMode, nooflevels: UInt, result: Long, resultlength: Int, status: Long): Int {
    return Win32DynamicFfi.invoke("icuin.dll", "ucol_getBound", longArrayOf(source, sourcelength.toLong(), boundtype.toLong(), nooflevels.toLong(), result, resultlength.toLong(), status)).toInt()
}

public fun ucol_getContractionsAndExpansions(coll: Long, contractions: Long, expansions: Long, addprefixes: Byte, status: Long) {
    Win32DynamicFfi.invoke("icuin.dll", "ucol_getContractionsAndExpansions", longArrayOf(coll, contractions, expansions, addprefixes.toLong(), status))
}

public fun ucol_getDisplayName(objloc: PCSTR, disploc: PCSTR, result: Long, resultlength: Int, status: Long): Int {
    return Win32DynamicFfi.invoke("icuin.dll", "ucol_getDisplayName", longArrayOf(objloc, disploc, result, resultlength.toLong(), status)).toInt()
}

public fun ucol_getEquivalentReorderCodes(reordercode: Int, dest: Long, destcapacity: Int, perrorcode: Long): Int {
    return Win32DynamicFfi.invoke("icuin.dll", "ucol_getEquivalentReorderCodes", longArrayOf(reordercode.toLong(), dest, destcapacity.toLong(), perrorcode)).toInt()
}

public fun ucol_getFunctionalEquivalent(result: PCSTR, resultcapacity: Int, keyword: PCSTR, locale: PCSTR, isavailable: Long, status: Long): Int {
    return Win32DynamicFfi.invoke("icuin.dll", "ucol_getFunctionalEquivalent", longArrayOf(result, resultcapacity.toLong(), keyword, locale, isavailable, status)).toInt()
}

public fun ucol_getKeywordValues(keyword: PCSTR, status: Long): Long {
    return Win32DynamicFfi.invoke("icuin.dll", "ucol_getKeywordValues", longArrayOf(keyword, status))
}

public fun ucol_getKeywordValuesForLocale(key: PCSTR, locale: PCSTR, commonlyused: Byte, status: Long): Long {
    return Win32DynamicFfi.invoke("icuin.dll", "ucol_getKeywordValuesForLocale", longArrayOf(key, locale, commonlyused.toLong(), status))
}

public fun ucol_getKeywords(status: Long): Long {
    return Win32DynamicFfi.invoke("icuin.dll", "ucol_getKeywords", longArrayOf(status))
}

public fun ucol_getLocaleByType(coll: Long, type: ULocDataLocaleType, status: Long): PCSTR {
    return Win32DynamicFfi.invoke("icuin.dll", "ucol_getLocaleByType", longArrayOf(coll, type.toLong(), status))
}

public fun ucol_getMaxExpansion(elems: Long, order: Int): Int {
    return Win32DynamicFfi.invoke("icuin.dll", "ucol_getMaxExpansion", longArrayOf(elems, order.toLong())).toInt()
}

public fun ucol_getMaxVariable(coll: Long): UColReorderCode {
    return Win32DynamicFfi.invoke("icuin.dll", "ucol_getMaxVariable", longArrayOf(coll)).toInt()
}

public fun ucol_getOffset(elems: Long): Int {
    return Win32DynamicFfi.invoke("icuin.dll", "ucol_getOffset", longArrayOf(elems)).toInt()
}

public fun ucol_getReorderCodes(coll: Long, dest: Long, destcapacity: Int, perrorcode: Long): Int {
    return Win32DynamicFfi.invoke("icuin.dll", "ucol_getReorderCodes", longArrayOf(coll, dest, destcapacity.toLong(), perrorcode)).toInt()
}

public fun ucol_getRules(coll: Long, length: Long): Long {
    return Win32DynamicFfi.invoke("icuin.dll", "ucol_getRules", longArrayOf(coll, length))
}

public fun ucol_getRulesEx(coll: Long, delta: UColRuleOption, buffer: Long, bufferlen: Int): Int {
    return Win32DynamicFfi.invoke("icuin.dll", "ucol_getRulesEx", longArrayOf(coll, delta.toLong(), buffer, bufferlen.toLong())).toInt()
}

public fun ucol_getSortKey(coll: Long, source: Long, sourcelength: Int, result: Long, resultlength: Int): Int {
    return Win32DynamicFfi.invoke("icuin.dll", "ucol_getSortKey", longArrayOf(coll, source, sourcelength.toLong(), result, resultlength.toLong())).toInt()
}

public fun ucol_getStrength(coll: Long): UColAttributeValue {
    return Win32DynamicFfi.invoke("icuin.dll", "ucol_getStrength", longArrayOf(coll)).toInt()
}

public fun ucol_getTailoredSet(coll: Long, status: Long): Long {
    return Win32DynamicFfi.invoke("icuin.dll", "ucol_getTailoredSet", longArrayOf(coll, status))
}

public fun ucol_getUCAVersion(coll: Long, info: Long) {
    Win32DynamicFfi.invoke("icuin.dll", "ucol_getUCAVersion", longArrayOf(coll, info))
}

public fun ucol_getVariableTop(coll: Long, status: Long): UInt {
    return Win32DynamicFfi.invoke("icuin.dll", "ucol_getVariableTop", longArrayOf(coll, status)).toUInt()
}

public fun ucol_getVersion(coll: Long, info: Long) {
    Win32DynamicFfi.invoke("icuin.dll", "ucol_getVersion", longArrayOf(coll, info))
}

public fun ucol_greater(coll: Long, source: Long, sourcelength: Int, target: Long, targetlength: Int): Byte {
    return Win32DynamicFfi.invoke("icuin.dll", "ucol_greater", longArrayOf(coll, source, sourcelength.toLong(), target, targetlength.toLong())).toByte()
}

public fun ucol_greaterOrEqual(coll: Long, source: Long, sourcelength: Int, target: Long, targetlength: Int): Byte {
    return Win32DynamicFfi.invoke("icuin.dll", "ucol_greaterOrEqual", longArrayOf(coll, source, sourcelength.toLong(), target, targetlength.toLong())).toByte()
}

public fun ucol_keyHashCode(key: Long, length: Int): Int {
    return Win32DynamicFfi.invoke("icuin.dll", "ucol_keyHashCode", longArrayOf(key, length.toLong())).toInt()
}

public fun ucol_mergeSortkeys(src1: Long, src1length: Int, src2: Long, src2length: Int, dest: Long, destcapacity: Int): Int {
    return Win32DynamicFfi.invoke("icuin.dll", "ucol_mergeSortkeys", longArrayOf(src1, src1length.toLong(), src2, src2length.toLong(), dest, destcapacity.toLong())).toInt()
}

public fun ucol_next(elems: Long, status: Long): Int {
    return Win32DynamicFfi.invoke("icuin.dll", "ucol_next", longArrayOf(elems, status)).toInt()
}

public fun ucol_nextSortKeyPart(coll: Long, iter: Long, state: Long, dest: Long, count: Int, status: Long): Int {
    return Win32DynamicFfi.invoke("icuin.dll", "ucol_nextSortKeyPart", longArrayOf(coll, iter, state, dest, count.toLong(), status)).toInt()
}

public fun ucol_open(loc: PCSTR, status: Long): Long {
    return Win32DynamicFfi.invoke("icuin.dll", "ucol_open", longArrayOf(loc, status))
}

public fun ucol_openAvailableLocales(status: Long): Long {
    return Win32DynamicFfi.invoke("icuin.dll", "ucol_openAvailableLocales", longArrayOf(status))
}

public fun ucol_openBinary(bin: Long, length: Int, base: Long, status: Long): Long {
    return Win32DynamicFfi.invoke("icuin.dll", "ucol_openBinary", longArrayOf(bin, length.toLong(), base, status))
}

public fun ucol_openElements(coll: Long, text: Long, textlength: Int, status: Long): Long {
    return Win32DynamicFfi.invoke("icuin.dll", "ucol_openElements", longArrayOf(coll, text, textlength.toLong(), status))
}

public fun ucol_openRules(rules: Long, ruleslength: Int, normalizationmode: UColAttributeValue, strength: UColAttributeValue, parseerror: Long, status: Long): Long {
    return Win32DynamicFfi.invoke("icuin.dll", "ucol_openRules", longArrayOf(rules, ruleslength.toLong(), normalizationmode.toLong(), strength.toLong(), parseerror, status))
}

public fun ucol_previous(elems: Long, status: Long): Int {
    return Win32DynamicFfi.invoke("icuin.dll", "ucol_previous", longArrayOf(elems, status)).toInt()
}

public fun ucol_primaryOrder(order: Int): Int {
    return Win32DynamicFfi.invoke("icuin.dll", "ucol_primaryOrder", longArrayOf(order.toLong())).toInt()
}

public fun ucol_reset(elems: Long) {
    Win32DynamicFfi.invoke("icuin.dll", "ucol_reset", longArrayOf(elems))
}

public fun ucol_safeClone(coll: Long, stackbuffer: Long, pbuffersize: Long, status: Long): Long {
    return Win32DynamicFfi.invoke("icuin.dll", "ucol_safeClone", longArrayOf(coll, stackbuffer, pbuffersize, status))
}

public fun ucol_secondaryOrder(order: Int): Int {
    return Win32DynamicFfi.invoke("icuin.dll", "ucol_secondaryOrder", longArrayOf(order.toLong())).toInt()
}

public fun ucol_setAttribute(coll: Long, attr: UColAttribute, value: UColAttributeValue, status: Long) {
    Win32DynamicFfi.invoke("icuin.dll", "ucol_setAttribute", longArrayOf(coll, attr.toLong(), value.toLong(), status))
}

public fun ucol_setMaxVariable(coll: Long, group: UColReorderCode, perrorcode: Long) {
    Win32DynamicFfi.invoke("icuin.dll", "ucol_setMaxVariable", longArrayOf(coll, group.toLong(), perrorcode))
}

public fun ucol_setOffset(elems: Long, offset: Int, status: Long) {
    Win32DynamicFfi.invoke("icuin.dll", "ucol_setOffset", longArrayOf(elems, offset.toLong(), status))
}

public fun ucol_setReorderCodes(coll: Long, reordercodes: Long, reordercodeslength: Int, perrorcode: Long) {
    Win32DynamicFfi.invoke("icuin.dll", "ucol_setReorderCodes", longArrayOf(coll, reordercodes, reordercodeslength.toLong(), perrorcode))
}

public fun ucol_setStrength(coll: Long, strength: UColAttributeValue) {
    Win32DynamicFfi.invoke("icuin.dll", "ucol_setStrength", longArrayOf(coll, strength.toLong()))
}

public fun ucol_setText(elems: Long, text: Long, textlength: Int, status: Long) {
    Win32DynamicFfi.invoke("icuin.dll", "ucol_setText", longArrayOf(elems, text, textlength.toLong(), status))
}

public fun ucol_strcoll(coll: Long, source: Long, sourcelength: Int, target: Long, targetlength: Int): UCollationResult {
    return Win32DynamicFfi.invoke("icuin.dll", "ucol_strcoll", longArrayOf(coll, source, sourcelength.toLong(), target, targetlength.toLong())).toInt()
}

public fun ucol_strcollIter(coll: Long, siter: Long, titer: Long, status: Long): UCollationResult {
    return Win32DynamicFfi.invoke("icuin.dll", "ucol_strcollIter", longArrayOf(coll, siter, titer, status)).toInt()
}

public fun ucol_strcollUTF8(coll: Long, source: PCSTR, sourcelength: Int, target: PCSTR, targetlength: Int, status: Long): UCollationResult {
    return Win32DynamicFfi.invoke("icuin.dll", "ucol_strcollUTF8", longArrayOf(coll, source, sourcelength.toLong(), target, targetlength.toLong(), status)).toInt()
}

public fun ucol_tertiaryOrder(order: Int): Int {
    return Win32DynamicFfi.invoke("icuin.dll", "ucol_tertiaryOrder", longArrayOf(order.toLong())).toInt()
}

public fun ucpmap_get(map: Long, c: Int): UInt {
    return Win32DynamicFfi.invoke("icu.dll", "ucpmap_get", longArrayOf(map, c.toLong())).toUInt()
}

public fun ucpmap_getRange(map: Long, start: Int, option: UCPMapRangeOption, surrogatevalue: UInt, filter: Long, context: Long, pvalue: Long): Int {
    return Win32DynamicFfi.invoke("icu.dll", "ucpmap_getRange", longArrayOf(map, start.toLong(), option.toLong(), surrogatevalue.toLong(), filter, context, pvalue)).toInt()
}

public fun ucptrie_close(trie: Long) {
    Win32DynamicFfi.invoke("icu.dll", "ucptrie_close", longArrayOf(trie))
}

public fun ucptrie_get(trie: Long, c: Int): UInt {
    return Win32DynamicFfi.invoke("icu.dll", "ucptrie_get", longArrayOf(trie, c.toLong())).toUInt()
}

public fun ucptrie_getRange(trie: Long, start: Int, option: UCPMapRangeOption, surrogatevalue: UInt, filter: Long, context: Long, pvalue: Long): Int {
    return Win32DynamicFfi.invoke("icu.dll", "ucptrie_getRange", longArrayOf(trie, start.toLong(), option.toLong(), surrogatevalue.toLong(), filter, context, pvalue)).toInt()
}

public fun ucptrie_getType(trie: Long): UCPTrieType {
    return Win32DynamicFfi.invoke("icu.dll", "ucptrie_getType", longArrayOf(trie)).toInt()
}

public fun ucptrie_getValueWidth(trie: Long): UCPTrieValueWidth {
    return Win32DynamicFfi.invoke("icu.dll", "ucptrie_getValueWidth", longArrayOf(trie)).toInt()
}

public fun ucptrie_internalSmallIndex(trie: Long, c: Int): Int {
    return Win32DynamicFfi.invoke("icu.dll", "ucptrie_internalSmallIndex", longArrayOf(trie, c.toLong())).toInt()
}

public fun ucptrie_internalSmallU8Index(trie: Long, lt1: Int, t2: UByte, t3: UByte): Int {
    return Win32DynamicFfi.invoke("icu.dll", "ucptrie_internalSmallU8Index", longArrayOf(trie, lt1.toLong(), t2.toLong(), t3.toLong())).toInt()
}

public fun ucptrie_internalU8PrevIndex(trie: Long, c: Int, start: Long, src: Long): Int {
    return Win32DynamicFfi.invoke("icu.dll", "ucptrie_internalU8PrevIndex", longArrayOf(trie, c.toLong(), start, src)).toInt()
}

public fun ucptrie_openFromBinary(type: UCPTrieType, valuewidth: UCPTrieValueWidth, data: Long, length: Int, pactuallength: Long, perrorcode: Long): Long {
    return Win32DynamicFfi.invoke("icu.dll", "ucptrie_openFromBinary", longArrayOf(type.toLong(), valuewidth.toLong(), data, length.toLong(), pactuallength, perrorcode))
}

public fun ucptrie_toBinary(trie: Long, data: Long, capacity: Int, perrorcode: Long): Int {
    return Win32DynamicFfi.invoke("icu.dll", "ucptrie_toBinary", longArrayOf(trie, data, capacity.toLong(), perrorcode)).toInt()
}

public fun ucsdet_close(ucsd: Long) {
    Win32DynamicFfi.invoke("icuin.dll", "ucsdet_close", longArrayOf(ucsd))
}

public fun ucsdet_detect(ucsd: Long, status: Long): Long {
    return Win32DynamicFfi.invoke("icuin.dll", "ucsdet_detect", longArrayOf(ucsd, status))
}

public fun ucsdet_detectAll(ucsd: Long, matchesfound: Long, status: Long): Long {
    return Win32DynamicFfi.invoke("icuin.dll", "ucsdet_detectAll", longArrayOf(ucsd, matchesfound, status))
}

public fun ucsdet_enableInputFilter(ucsd: Long, filter: Byte): Byte {
    return Win32DynamicFfi.invoke("icuin.dll", "ucsdet_enableInputFilter", longArrayOf(ucsd, filter.toLong())).toByte()
}

public fun ucsdet_getAllDetectableCharsets(ucsd: Long, status: Long): Long {
    return Win32DynamicFfi.invoke("icuin.dll", "ucsdet_getAllDetectableCharsets", longArrayOf(ucsd, status))
}

public fun ucsdet_getConfidence(ucsm: Long, status: Long): Int {
    return Win32DynamicFfi.invoke("icuin.dll", "ucsdet_getConfidence", longArrayOf(ucsm, status)).toInt()
}

public fun ucsdet_getLanguage(ucsm: Long, status: Long): PCSTR {
    return Win32DynamicFfi.invoke("icuin.dll", "ucsdet_getLanguage", longArrayOf(ucsm, status))
}

public fun ucsdet_getName(ucsm: Long, status: Long): PCSTR {
    return Win32DynamicFfi.invoke("icuin.dll", "ucsdet_getName", longArrayOf(ucsm, status))
}

public fun ucsdet_getUChars(ucsm: Long, buf: Long, cap: Int, status: Long): Int {
    return Win32DynamicFfi.invoke("icuin.dll", "ucsdet_getUChars", longArrayOf(ucsm, buf, cap.toLong(), status)).toInt()
}

public fun ucsdet_isInputFilterEnabled(ucsd: Long): Byte {
    return Win32DynamicFfi.invoke("icuin.dll", "ucsdet_isInputFilterEnabled", longArrayOf(ucsd)).toByte()
}

public fun ucsdet_open(status: Long): Long {
    return Win32DynamicFfi.invoke("icuin.dll", "ucsdet_open", longArrayOf(status))
}

public fun ucsdet_setDeclaredEncoding(ucsd: Long, encoding: PCSTR, length: Int, status: Long) {
    Win32DynamicFfi.invoke("icuin.dll", "ucsdet_setDeclaredEncoding", longArrayOf(ucsd, encoding, length.toLong(), status))
}

public fun ucsdet_setText(ucsd: Long, textin: PCSTR, len: Int, status: Long) {
    Win32DynamicFfi.invoke("icuin.dll", "ucsdet_setText", longArrayOf(ucsd, textin, len.toLong(), status))
}

public fun ucurr_countCurrencies(locale: PCSTR, date: Double, ec: Long): Int {
    return Win32DynamicFfi.invokeFp("icuuc.dll", "ucurr_countCurrencies", 8, false, longArrayOf(locale, date.toRawBits(), ec)).toLong().toInt()
}

public fun ucurr_forLocale(locale: PCSTR, buff: Long, buffcapacity: Int, ec: Long): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "ucurr_forLocale", longArrayOf(locale, buff, buffcapacity.toLong(), ec)).toInt()
}

public fun ucurr_forLocaleAndDate(locale: PCSTR, date: Double, index: Int, buff: Long, buffcapacity: Int, ec: Long): Int {
    return Win32DynamicFfi.invokeFp("icuuc.dll", "ucurr_forLocaleAndDate", 8, false, longArrayOf(locale, date.toRawBits(), index.toLong(), buff, buffcapacity.toLong(), ec)).toLong().toInt()
}

public fun ucurr_getDefaultFractionDigits(currency: Long, ec: Long): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "ucurr_getDefaultFractionDigits", longArrayOf(currency, ec)).toInt()
}

public fun ucurr_getDefaultFractionDigitsForUsage(currency: Long, usage: UCurrencyUsage, ec: Long): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "ucurr_getDefaultFractionDigitsForUsage", longArrayOf(currency, usage.toLong(), ec)).toInt()
}

public fun ucurr_getKeywordValuesForLocale(key: PCSTR, locale: PCSTR, commonlyused: Byte, status: Long): Long {
    return Win32DynamicFfi.invoke("icuuc.dll", "ucurr_getKeywordValuesForLocale", longArrayOf(key, locale, commonlyused.toLong(), status))
}

public fun ucurr_getName(currency: Long, locale: PCSTR, namestyle: UCurrNameStyle, ischoiceformat: Long, len: Long, ec: Long): Long {
    return Win32DynamicFfi.invoke("icuuc.dll", "ucurr_getName", longArrayOf(currency, locale, namestyle.toLong(), ischoiceformat, len, ec))
}

public fun ucurr_getNumericCode(currency: Long): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "ucurr_getNumericCode", longArrayOf(currency)).toInt()
}

public fun ucurr_getPluralName(currency: Long, locale: PCSTR, ischoiceformat: Long, pluralcount: PCSTR, len: Long, ec: Long): Long {
    return Win32DynamicFfi.invoke("icuuc.dll", "ucurr_getPluralName", longArrayOf(currency, locale, ischoiceformat, pluralcount, len, ec))
}

public fun ucurr_getRoundingIncrement(currency: Long, ec: Long): Double {
    return Win32DynamicFfi.invokeFp("icuuc.dll", "ucurr_getRoundingIncrement", 0, false, longArrayOf(currency, ec))
}

public fun ucurr_getRoundingIncrementForUsage(currency: Long, usage: UCurrencyUsage, ec: Long): Double {
    return Win32DynamicFfi.invokeFp("icuuc.dll", "ucurr_getRoundingIncrementForUsage", 0, false, longArrayOf(currency, usage.toLong(), ec))
}

public fun ucurr_isAvailable(isocode: Long, from: Double, to: Double, errorcode: Long): Byte {
    return Win32DynamicFfi.invokeFp("icuuc.dll", "ucurr_isAvailable", 40, false, longArrayOf(isocode, from.toRawBits(), to.toRawBits(), errorcode)).toLong().toByte()
}

public fun ucurr_openISOCurrencies(currtype: UInt, perrorcode: Long): Long {
    return Win32DynamicFfi.invoke("icuuc.dll", "ucurr_openISOCurrencies", longArrayOf(currtype.toLong(), perrorcode))
}

public fun ucurr_register(isocode: Long, locale: PCSTR, status: Long): Long {
    return Win32DynamicFfi.invoke("icuuc.dll", "ucurr_register", longArrayOf(isocode, locale, status))
}

public fun ucurr_unregister(key: Long, status: Long): Byte {
    return Win32DynamicFfi.invoke("icuuc.dll", "ucurr_unregister", longArrayOf(key, status)).toByte()
}

public fun udat_adoptNumberFormat(fmt: Long, numberformattoadopt: Long) {
    Win32DynamicFfi.invoke("icuin.dll", "udat_adoptNumberFormat", longArrayOf(fmt, numberformattoadopt))
}

public fun udat_adoptNumberFormatForFields(fmt: Long, fields: Long, numberformattoset: Long, status: Long) {
    Win32DynamicFfi.invoke("icuin.dll", "udat_adoptNumberFormatForFields", longArrayOf(fmt, fields, numberformattoset, status))
}

public fun udat_applyPattern(format: Long, localized: Byte, pattern: Long, patternlength: Int) {
    Win32DynamicFfi.invoke("icuin.dll", "udat_applyPattern", longArrayOf(format, localized.toLong(), pattern, patternlength.toLong()))
}

public fun udat_clone(fmt: Long, status: Long): Long {
    return Win32DynamicFfi.invoke("icuin.dll", "udat_clone", longArrayOf(fmt, status))
}

public fun udat_close(format: Long) {
    Win32DynamicFfi.invoke("icuin.dll", "udat_close", longArrayOf(format))
}

public fun udat_countAvailable(): Int {
    return Win32DynamicFfi.invoke("icuin.dll", "udat_countAvailable", longArrayOf()).toInt()
}

public fun udat_countSymbols(fmt: Long, type: UDateFormatSymbolType): Int {
    return Win32DynamicFfi.invoke("icuin.dll", "udat_countSymbols", longArrayOf(fmt, type.toLong())).toInt()
}

public fun udat_format(format: Long, datetoformat: Double, result: Long, resultlength: Int, position: Long, status: Long): Int {
    return Win32DynamicFfi.invokeFp("icuin.dll", "udat_format", 8, false, longArrayOf(format, datetoformat.toRawBits(), result, resultlength.toLong(), position, status)).toLong().toInt()
}

public fun udat_formatCalendar(format: Long, calendar: Long, result: Long, capacity: Int, position: Long, status: Long): Int {
    return Win32DynamicFfi.invoke("icuin.dll", "udat_formatCalendar", longArrayOf(format, calendar, result, capacity.toLong(), position, status)).toInt()
}

public fun udat_formatCalendarForFields(format: Long, calendar: Long, result: Long, capacity: Int, fpositer: Long, status: Long): Int {
    return Win32DynamicFfi.invoke("icuin.dll", "udat_formatCalendarForFields", longArrayOf(format, calendar, result, capacity.toLong(), fpositer, status)).toInt()
}

public fun udat_formatForFields(format: Long, datetoformat: Double, result: Long, resultlength: Int, fpositer: Long, status: Long): Int {
    return Win32DynamicFfi.invokeFp("icuin.dll", "udat_formatForFields", 8, false, longArrayOf(format, datetoformat.toRawBits(), result, resultlength.toLong(), fpositer, status)).toLong().toInt()
}

public fun udat_get2DigitYearStart(fmt: Long, status: Long): Double {
    return Win32DynamicFfi.invokeFp("icuin.dll", "udat_get2DigitYearStart", 0, false, longArrayOf(fmt, status))
}

public fun udat_getAvailable(localeindex: Int): PCSTR {
    return Win32DynamicFfi.invoke("icuin.dll", "udat_getAvailable", longArrayOf(localeindex.toLong()))
}

public fun udat_getBooleanAttribute(fmt: Long, attr: UDateFormatBooleanAttribute, status: Long): Byte {
    return Win32DynamicFfi.invoke("icuin.dll", "udat_getBooleanAttribute", longArrayOf(fmt, attr.toLong(), status)).toByte()
}

public fun udat_getCalendar(fmt: Long): Long {
    return Win32DynamicFfi.invoke("icuin.dll", "udat_getCalendar", longArrayOf(fmt))
}

public fun udat_getContext(fmt: Long, type: UDisplayContextType, status: Long): UDisplayContext {
    return Win32DynamicFfi.invoke("icuin.dll", "udat_getContext", longArrayOf(fmt, type.toLong(), status)).toInt()
}

public fun udat_getLocaleByType(fmt: Long, type: ULocDataLocaleType, status: Long): PCSTR {
    return Win32DynamicFfi.invoke("icuin.dll", "udat_getLocaleByType", longArrayOf(fmt, type.toLong(), status))
}

public fun udat_getNumberFormat(fmt: Long): Long {
    return Win32DynamicFfi.invoke("icuin.dll", "udat_getNumberFormat", longArrayOf(fmt))
}

public fun udat_getNumberFormatForField(fmt: Long, field: UShort): Long {
    return Win32DynamicFfi.invoke("icuin.dll", "udat_getNumberFormatForField", longArrayOf(fmt, field.toLong()))
}

public fun udat_getSymbols(fmt: Long, type: UDateFormatSymbolType, symbolindex: Int, result: Long, resultlength: Int, status: Long): Int {
    return Win32DynamicFfi.invoke("icuin.dll", "udat_getSymbols", longArrayOf(fmt, type.toLong(), symbolindex.toLong(), result, resultlength.toLong(), status)).toInt()
}

public fun udat_isLenient(fmt: Long): Byte {
    return Win32DynamicFfi.invoke("icuin.dll", "udat_isLenient", longArrayOf(fmt)).toByte()
}

public fun udat_open(timestyle: UDateFormatStyle, datestyle: UDateFormatStyle, locale: PCSTR, tzid: Long, tzidlength: Int, pattern: Long, patternlength: Int, status: Long): Long {
    return Win32DynamicFfi.invoke("icuin.dll", "udat_open", longArrayOf(timestyle.toLong(), datestyle.toLong(), locale, tzid, tzidlength.toLong(), pattern, patternlength.toLong(), status))
}

public fun udat_parse(format: Long, text: Long, textlength: Int, parsepos: Long, status: Long): Double {
    return Win32DynamicFfi.invokeFp("icuin.dll", "udat_parse", 0, false, longArrayOf(format, text, textlength.toLong(), parsepos, status))
}

public fun udat_parseCalendar(format: Long, calendar: Long, text: Long, textlength: Int, parsepos: Long, status: Long) {
    Win32DynamicFfi.invoke("icuin.dll", "udat_parseCalendar", longArrayOf(format, calendar, text, textlength.toLong(), parsepos, status))
}

public fun udat_set2DigitYearStart(fmt: Long, d: Double, status: Long) {
    Win32DynamicFfi.invokeFp("icuin.dll", "udat_set2DigitYearStart", 8, false, longArrayOf(fmt, d.toRawBits(), status))
}

public fun udat_setBooleanAttribute(fmt: Long, attr: UDateFormatBooleanAttribute, newvalue: Byte, status: Long) {
    Win32DynamicFfi.invoke("icuin.dll", "udat_setBooleanAttribute", longArrayOf(fmt, attr.toLong(), newvalue.toLong(), status))
}

public fun udat_setCalendar(fmt: Long, calendartoset: Long) {
    Win32DynamicFfi.invoke("icuin.dll", "udat_setCalendar", longArrayOf(fmt, calendartoset))
}

public fun udat_setContext(fmt: Long, value: UDisplayContext, status: Long) {
    Win32DynamicFfi.invoke("icuin.dll", "udat_setContext", longArrayOf(fmt, value.toLong(), status))
}

public fun udat_setLenient(fmt: Long, islenient: Byte) {
    Win32DynamicFfi.invoke("icuin.dll", "udat_setLenient", longArrayOf(fmt, islenient.toLong()))
}

public fun udat_setNumberFormat(fmt: Long, numberformattoset: Long) {
    Win32DynamicFfi.invoke("icuin.dll", "udat_setNumberFormat", longArrayOf(fmt, numberformattoset))
}

public fun udat_setSymbols(format: Long, type: UDateFormatSymbolType, symbolindex: Int, value: Long, valuelength: Int, status: Long) {
    Win32DynamicFfi.invoke("icuin.dll", "udat_setSymbols", longArrayOf(format, type.toLong(), symbolindex.toLong(), value, valuelength.toLong(), status))
}

public fun udat_toCalendarDateField(field: UDateFormatField): UCalendarDateFields {
    return Win32DynamicFfi.invoke("icuin.dll", "udat_toCalendarDateField", longArrayOf(field.toLong())).toInt()
}

public fun udat_toPattern(fmt: Long, localized: Byte, result: Long, resultlength: Int, status: Long): Int {
    return Win32DynamicFfi.invoke("icuin.dll", "udat_toPattern", longArrayOf(fmt, localized.toLong(), result, resultlength.toLong(), status)).toInt()
}

public fun udatpg_addPattern(dtpg: Long, pattern: Long, patternlength: Int, override: Byte, conflictingpattern: Long, capacity: Int, plength: Long, perrorcode: Long): UDateTimePatternConflict {
    return Win32DynamicFfi.invoke("icuin.dll", "udatpg_addPattern", longArrayOf(dtpg, pattern, patternlength.toLong(), override.toLong(), conflictingpattern, capacity.toLong(), plength, perrorcode)).toInt()
}

public fun udatpg_clone(dtpg: Long, perrorcode: Long): Long {
    return Win32DynamicFfi.invoke("icuin.dll", "udatpg_clone", longArrayOf(dtpg, perrorcode))
}

public fun udatpg_close(dtpg: Long) {
    Win32DynamicFfi.invoke("icuin.dll", "udatpg_close", longArrayOf(dtpg))
}

public fun udatpg_getAppendItemFormat(dtpg: Long, field: UDateTimePatternField, plength: Long): Long {
    return Win32DynamicFfi.invoke("icuin.dll", "udatpg_getAppendItemFormat", longArrayOf(dtpg, field.toLong(), plength))
}

public fun udatpg_getAppendItemName(dtpg: Long, field: UDateTimePatternField, plength: Long): Long {
    return Win32DynamicFfi.invoke("icuin.dll", "udatpg_getAppendItemName", longArrayOf(dtpg, field.toLong(), plength))
}

public fun udatpg_getBaseSkeleton(unuseddtpg: Long, pattern: Long, length: Int, baseskeleton: Long, capacity: Int, perrorcode: Long): Int {
    return Win32DynamicFfi.invoke("icuin.dll", "udatpg_getBaseSkeleton", longArrayOf(unuseddtpg, pattern, length.toLong(), baseskeleton, capacity.toLong(), perrorcode)).toInt()
}

public fun udatpg_getBestPattern(dtpg: Long, skeleton: Long, length: Int, bestpattern: Long, capacity: Int, perrorcode: Long): Int {
    return Win32DynamicFfi.invoke("icuin.dll", "udatpg_getBestPattern", longArrayOf(dtpg, skeleton, length.toLong(), bestpattern, capacity.toLong(), perrorcode)).toInt()
}

public fun udatpg_getBestPatternWithOptions(dtpg: Long, skeleton: Long, length: Int, options: UDateTimePatternMatchOptions, bestpattern: Long, capacity: Int, perrorcode: Long): Int {
    return Win32DynamicFfi.invoke("icuin.dll", "udatpg_getBestPatternWithOptions", longArrayOf(dtpg, skeleton, length.toLong(), options.toLong(), bestpattern, capacity.toLong(), perrorcode)).toInt()
}

public fun udatpg_getDateTimeFormat(dtpg: Long, plength: Long): Long {
    return Win32DynamicFfi.invoke("icuin.dll", "udatpg_getDateTimeFormat", longArrayOf(dtpg, plength))
}

public fun udatpg_getDecimal(dtpg: Long, plength: Long): Long {
    return Win32DynamicFfi.invoke("icuin.dll", "udatpg_getDecimal", longArrayOf(dtpg, plength))
}

public fun udatpg_getFieldDisplayName(dtpg: Long, field: UDateTimePatternField, width: UDateTimePGDisplayWidth, fieldname: Long, capacity: Int, perrorcode: Long): Int {
    return Win32DynamicFfi.invoke("icu.dll", "udatpg_getFieldDisplayName", longArrayOf(dtpg, field.toLong(), width.toLong(), fieldname, capacity.toLong(), perrorcode)).toInt()
}

public fun udatpg_getPatternForSkeleton(dtpg: Long, skeleton: Long, skeletonlength: Int, plength: Long): Long {
    return Win32DynamicFfi.invoke("icuin.dll", "udatpg_getPatternForSkeleton", longArrayOf(dtpg, skeleton, skeletonlength.toLong(), plength))
}

public fun udatpg_getSkeleton(unuseddtpg: Long, pattern: Long, length: Int, skeleton: Long, capacity: Int, perrorcode: Long): Int {
    return Win32DynamicFfi.invoke("icuin.dll", "udatpg_getSkeleton", longArrayOf(unuseddtpg, pattern, length.toLong(), skeleton, capacity.toLong(), perrorcode)).toInt()
}

public fun udatpg_open(locale: PCSTR, perrorcode: Long): Long {
    return Win32DynamicFfi.invoke("icuin.dll", "udatpg_open", longArrayOf(locale, perrorcode))
}

public fun udatpg_openBaseSkeletons(dtpg: Long, perrorcode: Long): Long {
    return Win32DynamicFfi.invoke("icuin.dll", "udatpg_openBaseSkeletons", longArrayOf(dtpg, perrorcode))
}

public fun udatpg_openEmpty(perrorcode: Long): Long {
    return Win32DynamicFfi.invoke("icuin.dll", "udatpg_openEmpty", longArrayOf(perrorcode))
}

public fun udatpg_openSkeletons(dtpg: Long, perrorcode: Long): Long {
    return Win32DynamicFfi.invoke("icuin.dll", "udatpg_openSkeletons", longArrayOf(dtpg, perrorcode))
}

public fun udatpg_replaceFieldTypes(dtpg: Long, pattern: Long, patternlength: Int, skeleton: Long, skeletonlength: Int, dest: Long, destcapacity: Int, perrorcode: Long): Int {
    return Win32DynamicFfi.invoke("icuin.dll", "udatpg_replaceFieldTypes", longArrayOf(dtpg, pattern, patternlength.toLong(), skeleton, skeletonlength.toLong(), dest, destcapacity.toLong(), perrorcode)).toInt()
}

public fun udatpg_replaceFieldTypesWithOptions(dtpg: Long, pattern: Long, patternlength: Int, skeleton: Long, skeletonlength: Int, options: UDateTimePatternMatchOptions, dest: Long, destcapacity: Int, perrorcode: Long): Int {
    return Win32DynamicFfi.invoke("icuin.dll", "udatpg_replaceFieldTypesWithOptions", longArrayOf(dtpg, pattern, patternlength.toLong(), skeleton, skeletonlength.toLong(), options.toLong(), dest, destcapacity.toLong(), perrorcode)).toInt()
}

public fun udatpg_setAppendItemFormat(dtpg: Long, field: UDateTimePatternField, value: Long, length: Int) {
    Win32DynamicFfi.invoke("icuin.dll", "udatpg_setAppendItemFormat", longArrayOf(dtpg, field.toLong(), value, length.toLong()))
}

public fun udatpg_setAppendItemName(dtpg: Long, field: UDateTimePatternField, value: Long, length: Int) {
    Win32DynamicFfi.invoke("icuin.dll", "udatpg_setAppendItemName", longArrayOf(dtpg, field.toLong(), value, length.toLong()))
}

public fun udatpg_setDateTimeFormat(dtpg: Long, dtformat: Long, length: Int) {
    Win32DynamicFfi.invoke("icuin.dll", "udatpg_setDateTimeFormat", longArrayOf(dtpg, dtformat, length.toLong()))
}

public fun udatpg_setDecimal(dtpg: Long, decimal: Long, length: Int) {
    Win32DynamicFfi.invoke("icuin.dll", "udatpg_setDecimal", longArrayOf(dtpg, decimal, length.toLong()))
}

public fun udtitvfmt_close(formatter: Long) {
    Win32DynamicFfi.invoke("icuin.dll", "udtitvfmt_close", longArrayOf(formatter))
}

public fun udtitvfmt_closeResult(uresult: Long) {
    Win32DynamicFfi.invoke("icu.dll", "udtitvfmt_closeResult", longArrayOf(uresult))
}

public fun udtitvfmt_format(formatter: Long, fromdate: Double, todate: Double, result: Long, resultcapacity: Int, position: Long, status: Long): Int {
    return Win32DynamicFfi.invokeFp("icuin.dll", "udtitvfmt_format", 40, false, longArrayOf(formatter, fromdate.toRawBits(), todate.toRawBits(), result, resultcapacity.toLong(), position, status)).toLong().toInt()
}

public fun udtitvfmt_open(locale: PCSTR, skeleton: Long, skeletonlength: Int, tzid: Long, tzidlength: Int, status: Long): Long {
    return Win32DynamicFfi.invoke("icuin.dll", "udtitvfmt_open", longArrayOf(locale, skeleton, skeletonlength.toLong(), tzid, tzidlength.toLong(), status))
}

public fun udtitvfmt_openResult(ec: Long): Long {
    return Win32DynamicFfi.invoke("icu.dll", "udtitvfmt_openResult", longArrayOf(ec))
}

public fun udtitvfmt_resultAsValue(uresult: Long, ec: Long): Long {
    return Win32DynamicFfi.invoke("icu.dll", "udtitvfmt_resultAsValue", longArrayOf(uresult, ec))
}

public fun uenum_close(en: Long) {
    Win32DynamicFfi.invoke("icuuc.dll", "uenum_close", longArrayOf(en))
}

public fun uenum_count(en: Long, status: Long): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "uenum_count", longArrayOf(en, status)).toInt()
}

public fun uenum_next(en: Long, resultlength: Long, status: Long): PCSTR {
    return Win32DynamicFfi.invoke("icuuc.dll", "uenum_next", longArrayOf(en, resultlength, status))
}

public fun uenum_openCharStringsEnumeration(strings: Long, count: Int, ec: Long): Long {
    return Win32DynamicFfi.invoke("icuuc.dll", "uenum_openCharStringsEnumeration", longArrayOf(strings, count.toLong(), ec))
}

public fun uenum_openUCharStringsEnumeration(strings: Long, count: Int, ec: Long): Long {
    return Win32DynamicFfi.invoke("icuuc.dll", "uenum_openUCharStringsEnumeration", longArrayOf(strings, count.toLong(), ec))
}

public fun uenum_reset(en: Long, status: Long) {
    Win32DynamicFfi.invoke("icuuc.dll", "uenum_reset", longArrayOf(en, status))
}

public fun uenum_unext(en: Long, resultlength: Long, status: Long): Long {
    return Win32DynamicFfi.invoke("icuuc.dll", "uenum_unext", longArrayOf(en, resultlength, status))
}

public fun ufieldpositer_close(fpositer: Long) {
    Win32DynamicFfi.invoke("icuin.dll", "ufieldpositer_close", longArrayOf(fpositer))
}

public fun ufieldpositer_next(fpositer: Long, beginindex: Long, endindex: Long): Int {
    return Win32DynamicFfi.invoke("icuin.dll", "ufieldpositer_next", longArrayOf(fpositer, beginindex, endindex)).toInt()
}

public fun ufieldpositer_open(status: Long): Long {
    return Win32DynamicFfi.invoke("icuin.dll", "ufieldpositer_open", longArrayOf(status))
}

public fun ufmt_close(fmt: Long) {
    Win32DynamicFfi.invoke("icuin.dll", "ufmt_close", longArrayOf(fmt))
}

public fun ufmt_getArrayItemByIndex(fmt: Long, n: Int, status: Long): Long {
    return Win32DynamicFfi.invoke("icuin.dll", "ufmt_getArrayItemByIndex", longArrayOf(fmt, n.toLong(), status))
}

public fun ufmt_getArrayLength(fmt: Long, status: Long): Int {
    return Win32DynamicFfi.invoke("icuin.dll", "ufmt_getArrayLength", longArrayOf(fmt, status)).toInt()
}

public fun ufmt_getDate(fmt: Long, status: Long): Double {
    return Win32DynamicFfi.invokeFp("icuin.dll", "ufmt_getDate", 0, false, longArrayOf(fmt, status))
}

public fun ufmt_getDecNumChars(fmt: Long, len: Long, status: Long): PCSTR {
    return Win32DynamicFfi.invoke("icuin.dll", "ufmt_getDecNumChars", longArrayOf(fmt, len, status))
}

public fun ufmt_getDouble(fmt: Long, status: Long): Double {
    return Win32DynamicFfi.invokeFp("icuin.dll", "ufmt_getDouble", 0, false, longArrayOf(fmt, status))
}

public fun ufmt_getInt64(fmt: Long, status: Long): Long {
    return Win32DynamicFfi.invoke("icuin.dll", "ufmt_getInt64", longArrayOf(fmt, status))
}

public fun ufmt_getLong(fmt: Long, status: Long): Int {
    return Win32DynamicFfi.invoke("icuin.dll", "ufmt_getLong", longArrayOf(fmt, status)).toInt()
}

public fun ufmt_getObject(fmt: Long, status: Long): Long {
    return Win32DynamicFfi.invoke("icuin.dll", "ufmt_getObject", longArrayOf(fmt, status))
}

public fun ufmt_getType(fmt: Long, status: Long): UFormattableType {
    return Win32DynamicFfi.invoke("icuin.dll", "ufmt_getType", longArrayOf(fmt, status)).toInt()
}

public fun ufmt_getUChars(fmt: Long, len: Long, status: Long): Long {
    return Win32DynamicFfi.invoke("icuin.dll", "ufmt_getUChars", longArrayOf(fmt, len, status))
}

public fun ufmt_isNumeric(fmt: Long): Byte {
    return Win32DynamicFfi.invoke("icuin.dll", "ufmt_isNumeric", longArrayOf(fmt)).toByte()
}

public fun ufmt_open(status: Long): Long {
    return Win32DynamicFfi.invoke("icuin.dll", "ufmt_open", longArrayOf(status))
}

public fun ufmtval_getString(ufmtval: Long, plength: Long, ec: Long): Long {
    return Win32DynamicFfi.invoke("icu.dll", "ufmtval_getString", longArrayOf(ufmtval, plength, ec))
}

public fun ufmtval_nextPosition(ufmtval: Long, ucfpos: Long, ec: Long): Byte {
    return Win32DynamicFfi.invoke("icu.dll", "ufmtval_nextPosition", longArrayOf(ufmtval, ucfpos, ec)).toByte()
}

public fun ugender_getInstance(locale: PCSTR, status: Long): Long {
    return Win32DynamicFfi.invoke("icuin.dll", "ugender_getInstance", longArrayOf(locale, status))
}

public fun ugender_getListGender(genderinfo: Long, genders: Long, size: Int, status: Long): UGender {
    return Win32DynamicFfi.invoke("icuin.dll", "ugender_getListGender", longArrayOf(genderinfo, genders, size.toLong(), status)).toInt()
}

public fun uidna_close(idna: Long) {
    Win32DynamicFfi.invoke("icuuc.dll", "uidna_close", longArrayOf(idna))
}

public fun uidna_labelToASCII(idna: Long, label: Long, length: Int, dest: Long, capacity: Int, pinfo: Long, perrorcode: Long): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "uidna_labelToASCII", longArrayOf(idna, label, length.toLong(), dest, capacity.toLong(), pinfo, perrorcode)).toInt()
}

public fun uidna_labelToASCII_UTF8(idna: Long, label: PCSTR, length: Int, dest: PCSTR, capacity: Int, pinfo: Long, perrorcode: Long): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "uidna_labelToASCII_UTF8", longArrayOf(idna, label, length.toLong(), dest, capacity.toLong(), pinfo, perrorcode)).toInt()
}

public fun uidna_labelToUnicode(idna: Long, label: Long, length: Int, dest: Long, capacity: Int, pinfo: Long, perrorcode: Long): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "uidna_labelToUnicode", longArrayOf(idna, label, length.toLong(), dest, capacity.toLong(), pinfo, perrorcode)).toInt()
}

public fun uidna_labelToUnicodeUTF8(idna: Long, label: PCSTR, length: Int, dest: PCSTR, capacity: Int, pinfo: Long, perrorcode: Long): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "uidna_labelToUnicodeUTF8", longArrayOf(idna, label, length.toLong(), dest, capacity.toLong(), pinfo, perrorcode)).toInt()
}

public fun uidna_nameToASCII(idna: Long, name: Long, length: Int, dest: Long, capacity: Int, pinfo: Long, perrorcode: Long): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "uidna_nameToASCII", longArrayOf(idna, name, length.toLong(), dest, capacity.toLong(), pinfo, perrorcode)).toInt()
}

public fun uidna_nameToASCII_UTF8(idna: Long, name: PCSTR, length: Int, dest: PCSTR, capacity: Int, pinfo: Long, perrorcode: Long): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "uidna_nameToASCII_UTF8", longArrayOf(idna, name, length.toLong(), dest, capacity.toLong(), pinfo, perrorcode)).toInt()
}

public fun uidna_nameToUnicode(idna: Long, name: Long, length: Int, dest: Long, capacity: Int, pinfo: Long, perrorcode: Long): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "uidna_nameToUnicode", longArrayOf(idna, name, length.toLong(), dest, capacity.toLong(), pinfo, perrorcode)).toInt()
}

public fun uidna_nameToUnicodeUTF8(idna: Long, name: PCSTR, length: Int, dest: PCSTR, capacity: Int, pinfo: Long, perrorcode: Long): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "uidna_nameToUnicodeUTF8", longArrayOf(idna, name, length.toLong(), dest, capacity.toLong(), pinfo, perrorcode)).toInt()
}

public fun uidna_openUTS46(options: UInt, perrorcode: Long): Long {
    return Win32DynamicFfi.invoke("icuuc.dll", "uidna_openUTS46", longArrayOf(options.toLong(), perrorcode))
}

public fun uiter_current32(iter: Long): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "uiter_current32", longArrayOf(iter)).toInt()
}

public fun uiter_getState(iter: Long): UInt {
    return Win32DynamicFfi.invoke("icuuc.dll", "uiter_getState", longArrayOf(iter)).toUInt()
}

public fun uiter_next32(iter: Long): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "uiter_next32", longArrayOf(iter)).toInt()
}

public fun uiter_previous32(iter: Long): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "uiter_previous32", longArrayOf(iter)).toInt()
}

public fun uiter_setState(iter: Long, state: UInt, perrorcode: Long) {
    Win32DynamicFfi.invoke("icuuc.dll", "uiter_setState", longArrayOf(iter, state.toLong(), perrorcode))
}

public fun uiter_setString(iter: Long, s: Long, length: Int) {
    Win32DynamicFfi.invoke("icuuc.dll", "uiter_setString", longArrayOf(iter, s, length.toLong()))
}

public fun uiter_setUTF16BE(iter: Long, s: PCSTR, length: Int) {
    Win32DynamicFfi.invoke("icuuc.dll", "uiter_setUTF16BE", longArrayOf(iter, s, length.toLong()))
}

public fun uiter_setUTF8(iter: Long, s: PCSTR, length: Int) {
    Win32DynamicFfi.invoke("icuuc.dll", "uiter_setUTF8", longArrayOf(iter, s, length.toLong()))
}

public fun uldn_close(ldn: Long) {
    Win32DynamicFfi.invoke("icuuc.dll", "uldn_close", longArrayOf(ldn))
}

public fun uldn_getContext(ldn: Long, type: UDisplayContextType, perrorcode: Long): UDisplayContext {
    return Win32DynamicFfi.invoke("icuuc.dll", "uldn_getContext", longArrayOf(ldn, type.toLong(), perrorcode)).toInt()
}

public fun uldn_getDialectHandling(ldn: Long): UDialectHandling {
    return Win32DynamicFfi.invoke("icuuc.dll", "uldn_getDialectHandling", longArrayOf(ldn)).toInt()
}

public fun uldn_getLocale(ldn: Long): PCSTR {
    return Win32DynamicFfi.invoke("icuuc.dll", "uldn_getLocale", longArrayOf(ldn))
}

public fun uldn_keyDisplayName(ldn: Long, key: PCSTR, result: Long, maxresultsize: Int, perrorcode: Long): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "uldn_keyDisplayName", longArrayOf(ldn, key, result, maxresultsize.toLong(), perrorcode)).toInt()
}

public fun uldn_keyValueDisplayName(ldn: Long, key: PCSTR, value: PCSTR, result: Long, maxresultsize: Int, perrorcode: Long): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "uldn_keyValueDisplayName", longArrayOf(ldn, key, value, result, maxresultsize.toLong(), perrorcode)).toInt()
}

public fun uldn_languageDisplayName(ldn: Long, lang: PCSTR, result: Long, maxresultsize: Int, perrorcode: Long): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "uldn_languageDisplayName", longArrayOf(ldn, lang, result, maxresultsize.toLong(), perrorcode)).toInt()
}

public fun uldn_localeDisplayName(ldn: Long, locale: PCSTR, result: Long, maxresultsize: Int, perrorcode: Long): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "uldn_localeDisplayName", longArrayOf(ldn, locale, result, maxresultsize.toLong(), perrorcode)).toInt()
}

public fun uldn_open(locale: PCSTR, dialecthandling: UDialectHandling, perrorcode: Long): Long {
    return Win32DynamicFfi.invoke("icuuc.dll", "uldn_open", longArrayOf(locale, dialecthandling.toLong(), perrorcode))
}

public fun uldn_openForContext(locale: PCSTR, contexts: Long, length: Int, perrorcode: Long): Long {
    return Win32DynamicFfi.invoke("icuuc.dll", "uldn_openForContext", longArrayOf(locale, contexts, length.toLong(), perrorcode))
}

public fun uldn_regionDisplayName(ldn: Long, region: PCSTR, result: Long, maxresultsize: Int, perrorcode: Long): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "uldn_regionDisplayName", longArrayOf(ldn, region, result, maxresultsize.toLong(), perrorcode)).toInt()
}

public fun uldn_scriptCodeDisplayName(ldn: Long, scriptcode: UScriptCode, result: Long, maxresultsize: Int, perrorcode: Long): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "uldn_scriptCodeDisplayName", longArrayOf(ldn, scriptcode.toLong(), result, maxresultsize.toLong(), perrorcode)).toInt()
}

public fun uldn_scriptDisplayName(ldn: Long, script: PCSTR, result: Long, maxresultsize: Int, perrorcode: Long): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "uldn_scriptDisplayName", longArrayOf(ldn, script, result, maxresultsize.toLong(), perrorcode)).toInt()
}

public fun uldn_variantDisplayName(ldn: Long, variant: PCSTR, result: Long, maxresultsize: Int, perrorcode: Long): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "uldn_variantDisplayName", longArrayOf(ldn, variant, result, maxresultsize.toLong(), perrorcode)).toInt()
}

public fun ulistfmt_close(listfmt: Long) {
    Win32DynamicFfi.invoke("icuuc.dll", "ulistfmt_close", longArrayOf(listfmt))
}

public fun ulistfmt_closeResult(uresult: Long) {
    Win32DynamicFfi.invoke("icu.dll", "ulistfmt_closeResult", longArrayOf(uresult))
}

public fun ulistfmt_format(listfmt: Long, strings: Long, stringlengths: Long, stringcount: Int, result: Long, resultcapacity: Int, status: Long): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "ulistfmt_format", longArrayOf(listfmt, strings, stringlengths, stringcount.toLong(), result, resultcapacity.toLong(), status)).toInt()
}

public fun ulistfmt_formatStringsToResult(listfmt: Long, strings: Long, stringlengths: Long, stringcount: Int, uresult: Long, status: Long) {
    Win32DynamicFfi.invoke("icu.dll", "ulistfmt_formatStringsToResult", longArrayOf(listfmt, strings, stringlengths, stringcount.toLong(), uresult, status))
}

public fun ulistfmt_open(locale: PCSTR, status: Long): Long {
    return Win32DynamicFfi.invoke("icuuc.dll", "ulistfmt_open", longArrayOf(locale, status))
}

public fun ulistfmt_openForType(locale: PCSTR, type: UListFormatterType, width: UListFormatterWidth, status: Long): Long {
    return Win32DynamicFfi.invoke("icu.dll", "ulistfmt_openForType", longArrayOf(locale, type.toLong(), width.toLong(), status))
}

public fun ulistfmt_openResult(ec: Long): Long {
    return Win32DynamicFfi.invoke("icu.dll", "ulistfmt_openResult", longArrayOf(ec))
}

public fun ulistfmt_resultAsValue(uresult: Long, ec: Long): Long {
    return Win32DynamicFfi.invoke("icu.dll", "ulistfmt_resultAsValue", longArrayOf(uresult, ec))
}

public fun uloc_acceptLanguage(result: PCSTR, resultavailable: Int, outresult: Long, acceptlist: Long, acceptlistcount: Int, availablelocales: Long, status: Long): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "uloc_acceptLanguage", longArrayOf(result, resultavailable.toLong(), outresult, acceptlist, acceptlistcount.toLong(), availablelocales, status)).toInt()
}

public fun uloc_acceptLanguageFromHTTP(result: PCSTR, resultavailable: Int, outresult: Long, httpacceptlanguage: PCSTR, availablelocales: Long, status: Long): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "uloc_acceptLanguageFromHTTP", longArrayOf(result, resultavailable.toLong(), outresult, httpacceptlanguage, availablelocales, status)).toInt()
}

public fun uloc_addLikelySubtags(localeid: PCSTR, maximizedlocaleid: PCSTR, maximizedlocaleidcapacity: Int, err: Long): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "uloc_addLikelySubtags", longArrayOf(localeid, maximizedlocaleid, maximizedlocaleidcapacity.toLong(), err)).toInt()
}

public fun uloc_canonicalize(localeid: PCSTR, name: PCSTR, namecapacity: Int, err: Long): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "uloc_canonicalize", longArrayOf(localeid, name, namecapacity.toLong(), err)).toInt()
}

public fun uloc_countAvailable(): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "uloc_countAvailable", longArrayOf()).toInt()
}

public fun uloc_forLanguageTag(langtag: PCSTR, localeid: PCSTR, localeidcapacity: Int, parsedlength: Long, err: Long): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "uloc_forLanguageTag", longArrayOf(langtag, localeid, localeidcapacity.toLong(), parsedlength, err)).toInt()
}

public fun uloc_getAvailable(n: Int): PCSTR {
    return Win32DynamicFfi.invoke("icuuc.dll", "uloc_getAvailable", longArrayOf(n.toLong()))
}

public fun uloc_getBaseName(localeid: PCSTR, name: PCSTR, namecapacity: Int, err: Long): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "uloc_getBaseName", longArrayOf(localeid, name, namecapacity.toLong(), err)).toInt()
}

public fun uloc_getCharacterOrientation(localeid: PCSTR, status: Long): ULayoutType {
    return Win32DynamicFfi.invoke("icuuc.dll", "uloc_getCharacterOrientation", longArrayOf(localeid, status)).toInt()
}

public fun uloc_getCountry(localeid: PCSTR, country: PCSTR, countrycapacity: Int, err: Long): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "uloc_getCountry", longArrayOf(localeid, country, countrycapacity.toLong(), err)).toInt()
}

public fun uloc_getDefault(): PCSTR {
    return Win32DynamicFfi.invoke("icuuc.dll", "uloc_getDefault", longArrayOf())
}

public fun uloc_getDisplayCountry(locale: PCSTR, displaylocale: PCSTR, country: Long, countrycapacity: Int, status: Long): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "uloc_getDisplayCountry", longArrayOf(locale, displaylocale, country, countrycapacity.toLong(), status)).toInt()
}

public fun uloc_getDisplayKeyword(keyword: PCSTR, displaylocale: PCSTR, dest: Long, destcapacity: Int, status: Long): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "uloc_getDisplayKeyword", longArrayOf(keyword, displaylocale, dest, destcapacity.toLong(), status)).toInt()
}

public fun uloc_getDisplayKeywordValue(locale: PCSTR, keyword: PCSTR, displaylocale: PCSTR, dest: Long, destcapacity: Int, status: Long): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "uloc_getDisplayKeywordValue", longArrayOf(locale, keyword, displaylocale, dest, destcapacity.toLong(), status)).toInt()
}

public fun uloc_getDisplayLanguage(locale: PCSTR, displaylocale: PCSTR, language: Long, languagecapacity: Int, status: Long): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "uloc_getDisplayLanguage", longArrayOf(locale, displaylocale, language, languagecapacity.toLong(), status)).toInt()
}

public fun uloc_getDisplayName(localeid: PCSTR, inlocaleid: PCSTR, result: Long, maxresultsize: Int, err: Long): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "uloc_getDisplayName", longArrayOf(localeid, inlocaleid, result, maxresultsize.toLong(), err)).toInt()
}

public fun uloc_getDisplayScript(locale: PCSTR, displaylocale: PCSTR, script: Long, scriptcapacity: Int, status: Long): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "uloc_getDisplayScript", longArrayOf(locale, displaylocale, script, scriptcapacity.toLong(), status)).toInt()
}

public fun uloc_getDisplayVariant(locale: PCSTR, displaylocale: PCSTR, variant: Long, variantcapacity: Int, status: Long): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "uloc_getDisplayVariant", longArrayOf(locale, displaylocale, variant, variantcapacity.toLong(), status)).toInt()
}

public fun uloc_getISO3Country(localeid: PCSTR): PCSTR {
    return Win32DynamicFfi.invoke("icuuc.dll", "uloc_getISO3Country", longArrayOf(localeid))
}

public fun uloc_getISO3Language(localeid: PCSTR): PCSTR {
    return Win32DynamicFfi.invoke("icuuc.dll", "uloc_getISO3Language", longArrayOf(localeid))
}

public fun uloc_getISOCountries(): Long {
    return Win32DynamicFfi.invoke("icuuc.dll", "uloc_getISOCountries", longArrayOf())
}

public fun uloc_getISOLanguages(): Long {
    return Win32DynamicFfi.invoke("icuuc.dll", "uloc_getISOLanguages", longArrayOf())
}

public fun uloc_getKeywordValue(localeid: PCSTR, keywordname: PCSTR, buffer: PCSTR, buffercapacity: Int, status: Long): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "uloc_getKeywordValue", longArrayOf(localeid, keywordname, buffer, buffercapacity.toLong(), status)).toInt()
}

public fun uloc_getLCID(localeid: PCSTR): UInt {
    return Win32DynamicFfi.invoke("icuuc.dll", "uloc_getLCID", longArrayOf(localeid)).toUInt()
}

public fun uloc_getLanguage(localeid: PCSTR, language: PCSTR, languagecapacity: Int, err: Long): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "uloc_getLanguage", longArrayOf(localeid, language, languagecapacity.toLong(), err)).toInt()
}

public fun uloc_getLineOrientation(localeid: PCSTR, status: Long): ULayoutType {
    return Win32DynamicFfi.invoke("icuuc.dll", "uloc_getLineOrientation", longArrayOf(localeid, status)).toInt()
}

public fun uloc_getLocaleForLCID(hostid: UInt, locale: PCSTR, localecapacity: Int, status: Long): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "uloc_getLocaleForLCID", longArrayOf(hostid.toLong(), locale, localecapacity.toLong(), status)).toInt()
}

public fun uloc_getName(localeid: PCSTR, name: PCSTR, namecapacity: Int, err: Long): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "uloc_getName", longArrayOf(localeid, name, namecapacity.toLong(), err)).toInt()
}

public fun uloc_getParent(localeid: PCSTR, parent: PCSTR, parentcapacity: Int, err: Long): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "uloc_getParent", longArrayOf(localeid, parent, parentcapacity.toLong(), err)).toInt()
}

public fun uloc_getScript(localeid: PCSTR, script: PCSTR, scriptcapacity: Int, err: Long): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "uloc_getScript", longArrayOf(localeid, script, scriptcapacity.toLong(), err)).toInt()
}

public fun uloc_getVariant(localeid: PCSTR, variant: PCSTR, variantcapacity: Int, err: Long): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "uloc_getVariant", longArrayOf(localeid, variant, variantcapacity.toLong(), err)).toInt()
}

public fun uloc_isRightToLeft(locale: PCSTR): Byte {
    return Win32DynamicFfi.invoke("icuuc.dll", "uloc_isRightToLeft", longArrayOf(locale)).toByte()
}

public fun uloc_minimizeSubtags(localeid: PCSTR, minimizedlocaleid: PCSTR, minimizedlocaleidcapacity: Int, err: Long): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "uloc_minimizeSubtags", longArrayOf(localeid, minimizedlocaleid, minimizedlocaleidcapacity.toLong(), err)).toInt()
}

public fun uloc_openAvailableByType(type: ULocAvailableType, status: Long): Long {
    return Win32DynamicFfi.invoke("icu.dll", "uloc_openAvailableByType", longArrayOf(type.toLong(), status))
}

public fun uloc_openKeywords(localeid: PCSTR, status: Long): Long {
    return Win32DynamicFfi.invoke("icuuc.dll", "uloc_openKeywords", longArrayOf(localeid, status))
}

public fun uloc_setDefault(localeid: PCSTR, status: Long) {
    Win32DynamicFfi.invoke("icuuc.dll", "uloc_setDefault", longArrayOf(localeid, status))
}

public fun uloc_setKeywordValue(keywordname: PCSTR, keywordvalue: PCSTR, buffer: PCSTR, buffercapacity: Int, status: Long): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "uloc_setKeywordValue", longArrayOf(keywordname, keywordvalue, buffer, buffercapacity.toLong(), status)).toInt()
}

public fun uloc_toLanguageTag(localeid: PCSTR, langtag: PCSTR, langtagcapacity: Int, strict: Byte, err: Long): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "uloc_toLanguageTag", longArrayOf(localeid, langtag, langtagcapacity.toLong(), strict.toLong(), err)).toInt()
}

public fun uloc_toLegacyKey(keyword: PCSTR): PCSTR {
    return Win32DynamicFfi.invoke("icuuc.dll", "uloc_toLegacyKey", longArrayOf(keyword))
}

public fun uloc_toLegacyType(keyword: PCSTR, value: PCSTR): PCSTR {
    return Win32DynamicFfi.invoke("icuuc.dll", "uloc_toLegacyType", longArrayOf(keyword, value))
}

public fun uloc_toUnicodeLocaleKey(keyword: PCSTR): PCSTR {
    return Win32DynamicFfi.invoke("icuuc.dll", "uloc_toUnicodeLocaleKey", longArrayOf(keyword))
}

public fun uloc_toUnicodeLocaleType(keyword: PCSTR, value: PCSTR): PCSTR {
    return Win32DynamicFfi.invoke("icuuc.dll", "uloc_toUnicodeLocaleType", longArrayOf(keyword, value))
}

public fun ulocdata_close(uld: Long) {
    Win32DynamicFfi.invoke("icuin.dll", "ulocdata_close", longArrayOf(uld))
}

public fun ulocdata_getCLDRVersion(versionarray: Long, status: Long) {
    Win32DynamicFfi.invoke("icuin.dll", "ulocdata_getCLDRVersion", longArrayOf(versionarray, status))
}

public fun ulocdata_getDelimiter(uld: Long, type: ULocaleDataDelimiterType, result: Long, resultlength: Int, status: Long): Int {
    return Win32DynamicFfi.invoke("icuin.dll", "ulocdata_getDelimiter", longArrayOf(uld, type.toLong(), result, resultlength.toLong(), status)).toInt()
}

public fun ulocdata_getExemplarSet(uld: Long, fillin: Long, options: UInt, extype: ULocaleDataExemplarSetType, status: Long): Long {
    return Win32DynamicFfi.invoke("icuin.dll", "ulocdata_getExemplarSet", longArrayOf(uld, fillin, options.toLong(), extype.toLong(), status))
}

public fun ulocdata_getLocaleDisplayPattern(uld: Long, pattern: Long, patterncapacity: Int, status: Long): Int {
    return Win32DynamicFfi.invoke("icuin.dll", "ulocdata_getLocaleDisplayPattern", longArrayOf(uld, pattern, patterncapacity.toLong(), status)).toInt()
}

public fun ulocdata_getLocaleSeparator(uld: Long, separator: Long, separatorcapacity: Int, status: Long): Int {
    return Win32DynamicFfi.invoke("icuin.dll", "ulocdata_getLocaleSeparator", longArrayOf(uld, separator, separatorcapacity.toLong(), status)).toInt()
}

public fun ulocdata_getMeasurementSystem(localeid: PCSTR, status: Long): UMeasurementSystem {
    return Win32DynamicFfi.invoke("icuin.dll", "ulocdata_getMeasurementSystem", longArrayOf(localeid, status)).toInt()
}

public fun ulocdata_getNoSubstitute(uld: Long): Byte {
    return Win32DynamicFfi.invoke("icuin.dll", "ulocdata_getNoSubstitute", longArrayOf(uld)).toByte()
}

public fun ulocdata_getPaperSize(localeid: PCSTR, height: Long, width: Long, status: Long) {
    Win32DynamicFfi.invoke("icuin.dll", "ulocdata_getPaperSize", longArrayOf(localeid, height, width, status))
}

public fun ulocdata_open(localeid: PCSTR, status: Long): Long {
    return Win32DynamicFfi.invoke("icuin.dll", "ulocdata_open", longArrayOf(localeid, status))
}

public fun ulocdata_setNoSubstitute(uld: Long, setting: Byte) {
    Win32DynamicFfi.invoke("icuin.dll", "ulocdata_setNoSubstitute", longArrayOf(uld, setting.toLong()))
}

public fun umsg_applyPattern(fmt: Long, pattern: Long, patternlength: Int, parseerror: Long, status: Long) {
    Win32DynamicFfi.invoke("icuin.dll", "umsg_applyPattern", longArrayOf(fmt, pattern, patternlength.toLong(), parseerror, status))
}

public fun umsg_autoQuoteApostrophe(pattern: Long, patternlength: Int, dest: Long, destcapacity: Int, ec: Long): Int {
    return Win32DynamicFfi.invoke("icuin.dll", "umsg_autoQuoteApostrophe", longArrayOf(pattern, patternlength.toLong(), dest, destcapacity.toLong(), ec)).toInt()
}

public fun umsg_clone(fmt: Long, status: Long): Long {
    return Win32DynamicFfi.invoke("icuin.dll", "umsg_clone", longArrayOf(fmt, status))
}

public fun umsg_close(format: Long) {
    Win32DynamicFfi.invoke("icuin.dll", "umsg_close", longArrayOf(format))
}

public fun umsg_format(fmt: Long, result: Long, resultlength: Int, status: Long, vararg variadicArgs: Long): Int {
    return Win32DynamicFfi.invoke("icuin.dll", "umsg_format", longArrayOf(fmt, result, resultlength.toLong(), status) + variadicArgs).toInt()
}

public fun umsg_getLocale(fmt: Long): PCSTR {
    return Win32DynamicFfi.invoke("icuin.dll", "umsg_getLocale", longArrayOf(fmt))
}

public fun umsg_open(pattern: Long, patternlength: Int, locale: PCSTR, parseerror: Long, status: Long): Long {
    return Win32DynamicFfi.invoke("icuin.dll", "umsg_open", longArrayOf(pattern, patternlength.toLong(), locale, parseerror, status))
}

public fun umsg_parse(fmt: Long, source: Long, sourcelength: Int, count: Long, status: Long, vararg variadicArgs: Long) {
    Win32DynamicFfi.invoke("icuin.dll", "umsg_parse", longArrayOf(fmt, source, sourcelength.toLong(), count, status) + variadicArgs)
}

public fun umsg_setLocale(fmt: Long, locale: PCSTR) {
    Win32DynamicFfi.invoke("icuin.dll", "umsg_setLocale", longArrayOf(fmt, locale))
}

public fun umsg_toPattern(fmt: Long, result: Long, resultlength: Int, status: Long): Int {
    return Win32DynamicFfi.invoke("icuin.dll", "umsg_toPattern", longArrayOf(fmt, result, resultlength.toLong(), status)).toInt()
}

public fun umsg_vformat(fmt: Long, result: Long, resultlength: Int, ap: Long, status: Long): Int {
    return Win32DynamicFfi.invoke("icuin.dll", "umsg_vformat", longArrayOf(fmt, result, resultlength.toLong(), ap, status)).toInt()
}

public fun umsg_vparse(fmt: Long, source: Long, sourcelength: Int, count: Long, ap: Long, status: Long) {
    Win32DynamicFfi.invoke("icuin.dll", "umsg_vparse", longArrayOf(fmt, source, sourcelength.toLong(), count, ap, status))
}

public fun umutablecptrie_buildImmutable(trie: Long, type: UCPTrieType, valuewidth: UCPTrieValueWidth, perrorcode: Long): Long {
    return Win32DynamicFfi.invoke("icu.dll", "umutablecptrie_buildImmutable", longArrayOf(trie, type.toLong(), valuewidth.toLong(), perrorcode))
}

public fun umutablecptrie_clone(other: Long, perrorcode: Long): Long {
    return Win32DynamicFfi.invoke("icu.dll", "umutablecptrie_clone", longArrayOf(other, perrorcode))
}

public fun umutablecptrie_close(trie: Long) {
    Win32DynamicFfi.invoke("icu.dll", "umutablecptrie_close", longArrayOf(trie))
}

public fun umutablecptrie_fromUCPMap(map: Long, perrorcode: Long): Long {
    return Win32DynamicFfi.invoke("icu.dll", "umutablecptrie_fromUCPMap", longArrayOf(map, perrorcode))
}

public fun umutablecptrie_fromUCPTrie(trie: Long, perrorcode: Long): Long {
    return Win32DynamicFfi.invoke("icu.dll", "umutablecptrie_fromUCPTrie", longArrayOf(trie, perrorcode))
}

public fun umutablecptrie_get(trie: Long, c: Int): UInt {
    return Win32DynamicFfi.invoke("icu.dll", "umutablecptrie_get", longArrayOf(trie, c.toLong())).toUInt()
}

public fun umutablecptrie_getRange(trie: Long, start: Int, option: UCPMapRangeOption, surrogatevalue: UInt, filter: Long, context: Long, pvalue: Long): Int {
    return Win32DynamicFfi.invoke("icu.dll", "umutablecptrie_getRange", longArrayOf(trie, start.toLong(), option.toLong(), surrogatevalue.toLong(), filter, context, pvalue)).toInt()
}

public fun umutablecptrie_open(initialvalue: UInt, errorvalue: UInt, perrorcode: Long): Long {
    return Win32DynamicFfi.invoke("icu.dll", "umutablecptrie_open", longArrayOf(initialvalue.toLong(), errorvalue.toLong(), perrorcode))
}

public fun umutablecptrie_set(trie: Long, c: Int, value: UInt, perrorcode: Long) {
    Win32DynamicFfi.invoke("icu.dll", "umutablecptrie_set", longArrayOf(trie, c.toLong(), value.toLong(), perrorcode))
}

public fun umutablecptrie_setRange(trie: Long, start: Int, end: Int, value: UInt, perrorcode: Long) {
    Win32DynamicFfi.invoke("icu.dll", "umutablecptrie_setRange", longArrayOf(trie, start.toLong(), end.toLong(), value.toLong(), perrorcode))
}

public fun unorm2_append(norm2: Long, first: Long, firstlength: Int, firstcapacity: Int, second: Long, secondlength: Int, perrorcode: Long): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "unorm2_append", longArrayOf(norm2, first, firstlength.toLong(), firstcapacity.toLong(), second, secondlength.toLong(), perrorcode)).toInt()
}

public fun unorm2_close(norm2: Long) {
    Win32DynamicFfi.invoke("icuuc.dll", "unorm2_close", longArrayOf(norm2))
}

public fun unorm2_composePair(norm2: Long, a: Int, b: Int): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "unorm2_composePair", longArrayOf(norm2, a.toLong(), b.toLong())).toInt()
}

public fun unorm2_getCombiningClass(norm2: Long, c: Int): UByte {
    return Win32DynamicFfi.invoke("icuuc.dll", "unorm2_getCombiningClass", longArrayOf(norm2, c.toLong())).toUByte()
}

public fun unorm2_getDecomposition(norm2: Long, c: Int, decomposition: Long, capacity: Int, perrorcode: Long): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "unorm2_getDecomposition", longArrayOf(norm2, c.toLong(), decomposition, capacity.toLong(), perrorcode)).toInt()
}

public fun unorm2_getInstance(packagename: PCSTR, name: PCSTR, mode: UNormalization2Mode, perrorcode: Long): Long {
    return Win32DynamicFfi.invoke("icuuc.dll", "unorm2_getInstance", longArrayOf(packagename, name, mode.toLong(), perrorcode))
}

public fun unorm2_getNFCInstance(perrorcode: Long): Long {
    return Win32DynamicFfi.invoke("icuuc.dll", "unorm2_getNFCInstance", longArrayOf(perrorcode))
}

public fun unorm2_getNFDInstance(perrorcode: Long): Long {
    return Win32DynamicFfi.invoke("icuuc.dll", "unorm2_getNFDInstance", longArrayOf(perrorcode))
}

public fun unorm2_getNFKCCasefoldInstance(perrorcode: Long): Long {
    return Win32DynamicFfi.invoke("icuuc.dll", "unorm2_getNFKCCasefoldInstance", longArrayOf(perrorcode))
}

public fun unorm2_getNFKCInstance(perrorcode: Long): Long {
    return Win32DynamicFfi.invoke("icuuc.dll", "unorm2_getNFKCInstance", longArrayOf(perrorcode))
}

public fun unorm2_getNFKDInstance(perrorcode: Long): Long {
    return Win32DynamicFfi.invoke("icuuc.dll", "unorm2_getNFKDInstance", longArrayOf(perrorcode))
}

public fun unorm2_getRawDecomposition(norm2: Long, c: Int, decomposition: Long, capacity: Int, perrorcode: Long): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "unorm2_getRawDecomposition", longArrayOf(norm2, c.toLong(), decomposition, capacity.toLong(), perrorcode)).toInt()
}

public fun unorm2_hasBoundaryAfter(norm2: Long, c: Int): Byte {
    return Win32DynamicFfi.invoke("icuuc.dll", "unorm2_hasBoundaryAfter", longArrayOf(norm2, c.toLong())).toByte()
}

public fun unorm2_hasBoundaryBefore(norm2: Long, c: Int): Byte {
    return Win32DynamicFfi.invoke("icuuc.dll", "unorm2_hasBoundaryBefore", longArrayOf(norm2, c.toLong())).toByte()
}

public fun unorm2_isInert(norm2: Long, c: Int): Byte {
    return Win32DynamicFfi.invoke("icuuc.dll", "unorm2_isInert", longArrayOf(norm2, c.toLong())).toByte()
}

public fun unorm2_isNormalized(norm2: Long, s: Long, length: Int, perrorcode: Long): Byte {
    return Win32DynamicFfi.invoke("icuuc.dll", "unorm2_isNormalized", longArrayOf(norm2, s, length.toLong(), perrorcode)).toByte()
}

public fun unorm2_normalize(norm2: Long, src: Long, length: Int, dest: Long, capacity: Int, perrorcode: Long): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "unorm2_normalize", longArrayOf(norm2, src, length.toLong(), dest, capacity.toLong(), perrorcode)).toInt()
}

public fun unorm2_normalizeSecondAndAppend(norm2: Long, first: Long, firstlength: Int, firstcapacity: Int, second: Long, secondlength: Int, perrorcode: Long): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "unorm2_normalizeSecondAndAppend", longArrayOf(norm2, first, firstlength.toLong(), firstcapacity.toLong(), second, secondlength.toLong(), perrorcode)).toInt()
}

public fun unorm2_openFiltered(norm2: Long, filterset: Long, perrorcode: Long): Long {
    return Win32DynamicFfi.invoke("icuuc.dll", "unorm2_openFiltered", longArrayOf(norm2, filterset, perrorcode))
}

public fun unorm2_quickCheck(norm2: Long, s: Long, length: Int, perrorcode: Long): UNormalizationCheckResult {
    return Win32DynamicFfi.invoke("icuuc.dll", "unorm2_quickCheck", longArrayOf(norm2, s, length.toLong(), perrorcode)).toInt()
}

public fun unorm2_spanQuickCheckYes(norm2: Long, s: Long, length: Int, perrorcode: Long): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "unorm2_spanQuickCheckYes", longArrayOf(norm2, s, length.toLong(), perrorcode)).toInt()
}

public fun unorm_compare(s1: Long, length1: Int, s2: Long, length2: Int, options: UInt, perrorcode: Long): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "unorm_compare", longArrayOf(s1, length1.toLong(), s2, length2.toLong(), options.toLong(), perrorcode)).toInt()
}

public fun unum_applyPattern(format: Long, localized: Byte, pattern: Long, patternlength: Int, parseerror: Long, status: Long) {
    Win32DynamicFfi.invoke("icuin.dll", "unum_applyPattern", longArrayOf(format, localized.toLong(), pattern, patternlength.toLong(), parseerror, status))
}

public fun unum_clone(fmt: Long, status: Long): Long {
    return Win32DynamicFfi.invoke("icuin.dll", "unum_clone", longArrayOf(fmt, status))
}

public fun unum_close(fmt: Long) {
    Win32DynamicFfi.invoke("icuin.dll", "unum_close", longArrayOf(fmt))
}

public fun unum_countAvailable(): Int {
    return Win32DynamicFfi.invoke("icuin.dll", "unum_countAvailable", longArrayOf()).toInt()
}

public fun unum_format(fmt: Long, number: Int, result: Long, resultlength: Int, pos: Long, status: Long): Int {
    return Win32DynamicFfi.invoke("icuin.dll", "unum_format", longArrayOf(fmt, number.toLong(), result, resultlength.toLong(), pos, status)).toInt()
}

public fun unum_formatDecimal(fmt: Long, number: PCSTR, length: Int, result: Long, resultlength: Int, pos: Long, status: Long): Int {
    return Win32DynamicFfi.invoke("icuin.dll", "unum_formatDecimal", longArrayOf(fmt, number, length.toLong(), result, resultlength.toLong(), pos, status)).toInt()
}

public fun unum_formatDouble(fmt: Long, number: Double, result: Long, resultlength: Int, pos: Long, status: Long): Int {
    return Win32DynamicFfi.invokeFp("icuin.dll", "unum_formatDouble", 8, false, longArrayOf(fmt, number.toRawBits(), result, resultlength.toLong(), pos, status)).toLong().toInt()
}

public fun unum_formatDoubleCurrency(fmt: Long, number: Double, currency: Long, result: Long, resultlength: Int, pos: Long, status: Long): Int {
    return Win32DynamicFfi.invokeFp("icuin.dll", "unum_formatDoubleCurrency", 8, false, longArrayOf(fmt, number.toRawBits(), currency, result, resultlength.toLong(), pos, status)).toLong().toInt()
}

public fun unum_formatDoubleForFields(format: Long, number: Double, result: Long, resultlength: Int, fpositer: Long, status: Long): Int {
    return Win32DynamicFfi.invokeFp("icuin.dll", "unum_formatDoubleForFields", 8, false, longArrayOf(format, number.toRawBits(), result, resultlength.toLong(), fpositer, status)).toLong().toInt()
}

public fun unum_formatInt64(fmt: Long, number: Long, result: Long, resultlength: Int, pos: Long, status: Long): Int {
    return Win32DynamicFfi.invoke("icuin.dll", "unum_formatInt64", longArrayOf(fmt, number, result, resultlength.toLong(), pos, status)).toInt()
}

public fun unum_formatUFormattable(fmt: Long, number: Long, result: Long, resultlength: Int, pos: Long, status: Long): Int {
    return Win32DynamicFfi.invoke("icuin.dll", "unum_formatUFormattable", longArrayOf(fmt, number, result, resultlength.toLong(), pos, status)).toInt()
}

public fun unum_getAttribute(fmt: Long, attr: UNumberFormatAttribute): Int {
    return Win32DynamicFfi.invoke("icuin.dll", "unum_getAttribute", longArrayOf(fmt, attr.toLong())).toInt()
}

public fun unum_getAvailable(localeindex: Int): PCSTR {
    return Win32DynamicFfi.invoke("icuin.dll", "unum_getAvailable", longArrayOf(localeindex.toLong()))
}

public fun unum_getContext(fmt: Long, type: UDisplayContextType, status: Long): UDisplayContext {
    return Win32DynamicFfi.invoke("icuin.dll", "unum_getContext", longArrayOf(fmt, type.toLong(), status)).toInt()
}

public fun unum_getDoubleAttribute(fmt: Long, attr: UNumberFormatAttribute): Double {
    return Win32DynamicFfi.invokeFp("icuin.dll", "unum_getDoubleAttribute", 0, false, longArrayOf(fmt, attr.toLong()))
}

public fun unum_getLocaleByType(fmt: Long, type: ULocDataLocaleType, status: Long): PCSTR {
    return Win32DynamicFfi.invoke("icuin.dll", "unum_getLocaleByType", longArrayOf(fmt, type.toLong(), status))
}

public fun unum_getSymbol(fmt: Long, symbol: UNumberFormatSymbol, buffer: Long, size: Int, status: Long): Int {
    return Win32DynamicFfi.invoke("icuin.dll", "unum_getSymbol", longArrayOf(fmt, symbol.toLong(), buffer, size.toLong(), status)).toInt()
}

public fun unum_getTextAttribute(fmt: Long, tag: UNumberFormatTextAttribute, result: Long, resultlength: Int, status: Long): Int {
    return Win32DynamicFfi.invoke("icuin.dll", "unum_getTextAttribute", longArrayOf(fmt, tag.toLong(), result, resultlength.toLong(), status)).toInt()
}

public fun unum_open(style: UNumberFormatStyle, pattern: Long, patternlength: Int, locale: PCSTR, parseerr: Long, status: Long): Long {
    return Win32DynamicFfi.invoke("icuin.dll", "unum_open", longArrayOf(style.toLong(), pattern, patternlength.toLong(), locale, parseerr, status))
}

public fun unum_parse(fmt: Long, text: Long, textlength: Int, parsepos: Long, status: Long): Int {
    return Win32DynamicFfi.invoke("icuin.dll", "unum_parse", longArrayOf(fmt, text, textlength.toLong(), parsepos, status)).toInt()
}

public fun unum_parseDecimal(fmt: Long, text: Long, textlength: Int, parsepos: Long, outbuf: PCSTR, outbuflength: Int, status: Long): Int {
    return Win32DynamicFfi.invoke("icuin.dll", "unum_parseDecimal", longArrayOf(fmt, text, textlength.toLong(), parsepos, outbuf, outbuflength.toLong(), status)).toInt()
}

public fun unum_parseDouble(fmt: Long, text: Long, textlength: Int, parsepos: Long, status: Long): Double {
    return Win32DynamicFfi.invokeFp("icuin.dll", "unum_parseDouble", 0, false, longArrayOf(fmt, text, textlength.toLong(), parsepos, status))
}

public fun unum_parseDoubleCurrency(fmt: Long, text: Long, textlength: Int, parsepos: Long, currency: Long, status: Long): Double {
    return Win32DynamicFfi.invokeFp("icuin.dll", "unum_parseDoubleCurrency", 0, false, longArrayOf(fmt, text, textlength.toLong(), parsepos, currency, status))
}

public fun unum_parseInt64(fmt: Long, text: Long, textlength: Int, parsepos: Long, status: Long): Long {
    return Win32DynamicFfi.invoke("icuin.dll", "unum_parseInt64", longArrayOf(fmt, text, textlength.toLong(), parsepos, status))
}

public fun unum_parseToUFormattable(fmt: Long, result: Long, text: Long, textlength: Int, parsepos: Long, status: Long): Long {
    return Win32DynamicFfi.invoke("icuin.dll", "unum_parseToUFormattable", longArrayOf(fmt, result, text, textlength.toLong(), parsepos, status))
}

public fun unum_setAttribute(fmt: Long, attr: UNumberFormatAttribute, newvalue: Int) {
    Win32DynamicFfi.invoke("icuin.dll", "unum_setAttribute", longArrayOf(fmt, attr.toLong(), newvalue.toLong()))
}

public fun unum_setContext(fmt: Long, value: UDisplayContext, status: Long) {
    Win32DynamicFfi.invoke("icuin.dll", "unum_setContext", longArrayOf(fmt, value.toLong(), status))
}

public fun unum_setDoubleAttribute(fmt: Long, attr: UNumberFormatAttribute, newvalue: Double) {
    Win32DynamicFfi.invokeFp("icuin.dll", "unum_setDoubleAttribute", 32, false, longArrayOf(fmt, attr.toLong(), newvalue.toRawBits()))
}

public fun unum_setSymbol(fmt: Long, symbol: UNumberFormatSymbol, value: Long, length: Int, status: Long) {
    Win32DynamicFfi.invoke("icuin.dll", "unum_setSymbol", longArrayOf(fmt, symbol.toLong(), value, length.toLong(), status))
}

public fun unum_setTextAttribute(fmt: Long, tag: UNumberFormatTextAttribute, newvalue: Long, newvaluelength: Int, status: Long) {
    Win32DynamicFfi.invoke("icuin.dll", "unum_setTextAttribute", longArrayOf(fmt, tag.toLong(), newvalue, newvaluelength.toLong(), status))
}

public fun unum_toPattern(fmt: Long, ispatternlocalized: Byte, result: Long, resultlength: Int, status: Long): Int {
    return Win32DynamicFfi.invoke("icuin.dll", "unum_toPattern", longArrayOf(fmt, ispatternlocalized.toLong(), result, resultlength.toLong(), status)).toInt()
}

public fun unumf_close(uformatter: Long) {
    Win32DynamicFfi.invoke("icu.dll", "unumf_close", longArrayOf(uformatter))
}

public fun unumf_closeResult(uresult: Long) {
    Win32DynamicFfi.invoke("icu.dll", "unumf_closeResult", longArrayOf(uresult))
}

public fun unumf_formatDecimal(uformatter: Long, value: PCSTR, valuelen: Int, uresult: Long, ec: Long) {
    Win32DynamicFfi.invoke("icu.dll", "unumf_formatDecimal", longArrayOf(uformatter, value, valuelen.toLong(), uresult, ec))
}

public fun unumf_formatDouble(uformatter: Long, value: Double, uresult: Long, ec: Long) {
    Win32DynamicFfi.invokeFp("icu.dll", "unumf_formatDouble", 8, false, longArrayOf(uformatter, value.toRawBits(), uresult, ec))
}

public fun unumf_formatInt(uformatter: Long, value: Long, uresult: Long, ec: Long) {
    Win32DynamicFfi.invoke("icu.dll", "unumf_formatInt", longArrayOf(uformatter, value, uresult, ec))
}

public fun unumf_openForSkeletonAndLocale(skeleton: Long, skeletonlen: Int, locale: PCSTR, ec: Long): Long {
    return Win32DynamicFfi.invoke("icu.dll", "unumf_openForSkeletonAndLocale", longArrayOf(skeleton, skeletonlen.toLong(), locale, ec))
}

public fun unumf_openForSkeletonAndLocaleWithError(skeleton: Long, skeletonlen: Int, locale: PCSTR, perror: Long, ec: Long): Long {
    return Win32DynamicFfi.invoke("icu.dll", "unumf_openForSkeletonAndLocaleWithError", longArrayOf(skeleton, skeletonlen.toLong(), locale, perror, ec))
}

public fun unumf_openResult(ec: Long): Long {
    return Win32DynamicFfi.invoke("icu.dll", "unumf_openResult", longArrayOf(ec))
}

public fun unumf_resultAsValue(uresult: Long, ec: Long): Long {
    return Win32DynamicFfi.invoke("icu.dll", "unumf_resultAsValue", longArrayOf(uresult, ec))
}

public fun unumf_resultGetAllFieldPositions(uresult: Long, ufpositer: Long, ec: Long) {
    Win32DynamicFfi.invoke("icu.dll", "unumf_resultGetAllFieldPositions", longArrayOf(uresult, ufpositer, ec))
}

public fun unumf_resultNextFieldPosition(uresult: Long, ufpos: Long, ec: Long): Byte {
    return Win32DynamicFfi.invoke("icu.dll", "unumf_resultNextFieldPosition", longArrayOf(uresult, ufpos, ec)).toByte()
}

public fun unumf_resultToString(uresult: Long, buffer: Long, buffercapacity: Int, ec: Long): Int {
    return Win32DynamicFfi.invoke("icu.dll", "unumf_resultToString", longArrayOf(uresult, buffer, buffercapacity.toLong(), ec)).toInt()
}

public fun unumsys_close(unumsys: Long) {
    Win32DynamicFfi.invoke("icuin.dll", "unumsys_close", longArrayOf(unumsys))
}

public fun unumsys_getDescription(unumsys: Long, result: Long, resultlength: Int, status: Long): Int {
    return Win32DynamicFfi.invoke("icuin.dll", "unumsys_getDescription", longArrayOf(unumsys, result, resultlength.toLong(), status)).toInt()
}

public fun unumsys_getName(unumsys: Long): PCSTR {
    return Win32DynamicFfi.invoke("icuin.dll", "unumsys_getName", longArrayOf(unumsys))
}

public fun unumsys_getRadix(unumsys: Long): Int {
    return Win32DynamicFfi.invoke("icuin.dll", "unumsys_getRadix", longArrayOf(unumsys)).toInt()
}

public fun unumsys_isAlgorithmic(unumsys: Long): Byte {
    return Win32DynamicFfi.invoke("icuin.dll", "unumsys_isAlgorithmic", longArrayOf(unumsys)).toByte()
}

public fun unumsys_open(locale: PCSTR, status: Long): Long {
    return Win32DynamicFfi.invoke("icuin.dll", "unumsys_open", longArrayOf(locale, status))
}

public fun unumsys_openAvailableNames(status: Long): Long {
    return Win32DynamicFfi.invoke("icuin.dll", "unumsys_openAvailableNames", longArrayOf(status))
}

public fun unumsys_openByName(name: PCSTR, status: Long): Long {
    return Win32DynamicFfi.invoke("icuin.dll", "unumsys_openByName", longArrayOf(name, status))
}

public fun uplrules_close(uplrules: Long) {
    Win32DynamicFfi.invoke("icuin.dll", "uplrules_close", longArrayOf(uplrules))
}

public fun uplrules_getKeywords(uplrules: Long, status: Long): Long {
    return Win32DynamicFfi.invoke("icuin.dll", "uplrules_getKeywords", longArrayOf(uplrules, status))
}

public fun uplrules_open(locale: PCSTR, status: Long): Long {
    return Win32DynamicFfi.invoke("icuin.dll", "uplrules_open", longArrayOf(locale, status))
}

public fun uplrules_openForType(locale: PCSTR, type: UPluralType, status: Long): Long {
    return Win32DynamicFfi.invoke("icuin.dll", "uplrules_openForType", longArrayOf(locale, type.toLong(), status))
}

public fun uplrules_select(uplrules: Long, number: Double, keyword: Long, capacity: Int, status: Long): Int {
    return Win32DynamicFfi.invokeFp("icuin.dll", "uplrules_select", 8, false, longArrayOf(uplrules, number.toRawBits(), keyword, capacity.toLong(), status)).toLong().toInt()
}

public fun uplrules_selectFormatted(uplrules: Long, number: Long, keyword: Long, capacity: Int, status: Long): Int {
    return Win32DynamicFfi.invoke("icu.dll", "uplrules_selectFormatted", longArrayOf(uplrules, number, keyword, capacity.toLong(), status)).toInt()
}

public fun uregex_appendReplacement(regexp: Long, replacementtext: Long, replacementlength: Int, destbuf: Long, destcapacity: Long, status: Long): Int {
    return Win32DynamicFfi.invoke("icuin.dll", "uregex_appendReplacement", longArrayOf(regexp, replacementtext, replacementlength.toLong(), destbuf, destcapacity, status)).toInt()
}

public fun uregex_appendReplacementUText(regexp: Long, replacementtext: Long, dest: Long, status: Long) {
    Win32DynamicFfi.invoke("icuin.dll", "uregex_appendReplacementUText", longArrayOf(regexp, replacementtext, dest, status))
}

public fun uregex_appendTail(regexp: Long, destbuf: Long, destcapacity: Long, status: Long): Int {
    return Win32DynamicFfi.invoke("icuin.dll", "uregex_appendTail", longArrayOf(regexp, destbuf, destcapacity, status)).toInt()
}

public fun uregex_appendTailUText(regexp: Long, dest: Long, status: Long): Long {
    return Win32DynamicFfi.invoke("icuin.dll", "uregex_appendTailUText", longArrayOf(regexp, dest, status))
}

public fun uregex_clone(regexp: Long, status: Long): Long {
    return Win32DynamicFfi.invoke("icuin.dll", "uregex_clone", longArrayOf(regexp, status))
}

public fun uregex_close(regexp: Long) {
    Win32DynamicFfi.invoke("icuin.dll", "uregex_close", longArrayOf(regexp))
}

public fun uregex_end(regexp: Long, groupnum: Int, status: Long): Int {
    return Win32DynamicFfi.invoke("icuin.dll", "uregex_end", longArrayOf(regexp, groupnum.toLong(), status)).toInt()
}

public fun uregex_end64(regexp: Long, groupnum: Int, status: Long): Long {
    return Win32DynamicFfi.invoke("icuin.dll", "uregex_end64", longArrayOf(regexp, groupnum.toLong(), status))
}

public fun uregex_find(regexp: Long, startindex: Int, status: Long): Byte {
    return Win32DynamicFfi.invoke("icuin.dll", "uregex_find", longArrayOf(regexp, startindex.toLong(), status)).toByte()
}

public fun uregex_find64(regexp: Long, startindex: Long, status: Long): Byte {
    return Win32DynamicFfi.invoke("icuin.dll", "uregex_find64", longArrayOf(regexp, startindex, status)).toByte()
}

public fun uregex_findNext(regexp: Long, status: Long): Byte {
    return Win32DynamicFfi.invoke("icuin.dll", "uregex_findNext", longArrayOf(regexp, status)).toByte()
}

public fun uregex_flags(regexp: Long, status: Long): Int {
    return Win32DynamicFfi.invoke("icuin.dll", "uregex_flags", longArrayOf(regexp, status)).toInt()
}

public fun uregex_getFindProgressCallback(regexp: Long, callback: Long, context: Long, status: Long) {
    Win32DynamicFfi.invoke("icuin.dll", "uregex_getFindProgressCallback", longArrayOf(regexp, callback, context, status))
}

public fun uregex_getMatchCallback(regexp: Long, callback: Long, context: Long, status: Long) {
    Win32DynamicFfi.invoke("icuin.dll", "uregex_getMatchCallback", longArrayOf(regexp, callback, context, status))
}

public fun uregex_getStackLimit(regexp: Long, status: Long): Int {
    return Win32DynamicFfi.invoke("icuin.dll", "uregex_getStackLimit", longArrayOf(regexp, status)).toInt()
}

public fun uregex_getText(regexp: Long, textlength: Long, status: Long): Long {
    return Win32DynamicFfi.invoke("icuin.dll", "uregex_getText", longArrayOf(regexp, textlength, status))
}

public fun uregex_getTimeLimit(regexp: Long, status: Long): Int {
    return Win32DynamicFfi.invoke("icuin.dll", "uregex_getTimeLimit", longArrayOf(regexp, status)).toInt()
}

public fun uregex_getUText(regexp: Long, dest: Long, status: Long): Long {
    return Win32DynamicFfi.invoke("icuin.dll", "uregex_getUText", longArrayOf(regexp, dest, status))
}

public fun uregex_group(regexp: Long, groupnum: Int, dest: Long, destcapacity: Int, status: Long): Int {
    return Win32DynamicFfi.invoke("icuin.dll", "uregex_group", longArrayOf(regexp, groupnum.toLong(), dest, destcapacity.toLong(), status)).toInt()
}

public fun uregex_groupCount(regexp: Long, status: Long): Int {
    return Win32DynamicFfi.invoke("icuin.dll", "uregex_groupCount", longArrayOf(regexp, status)).toInt()
}

public fun uregex_groupNumberFromCName(regexp: Long, groupname: PCSTR, namelength: Int, status: Long): Int {
    return Win32DynamicFfi.invoke("icuin.dll", "uregex_groupNumberFromCName", longArrayOf(regexp, groupname, namelength.toLong(), status)).toInt()
}

public fun uregex_groupNumberFromName(regexp: Long, groupname: Long, namelength: Int, status: Long): Int {
    return Win32DynamicFfi.invoke("icuin.dll", "uregex_groupNumberFromName", longArrayOf(regexp, groupname, namelength.toLong(), status)).toInt()
}

public fun uregex_groupUText(regexp: Long, groupnum: Int, dest: Long, grouplength: Long, status: Long): Long {
    return Win32DynamicFfi.invoke("icuin.dll", "uregex_groupUText", longArrayOf(regexp, groupnum.toLong(), dest, grouplength, status))
}

public fun uregex_hasAnchoringBounds(regexp: Long, status: Long): Byte {
    return Win32DynamicFfi.invoke("icuin.dll", "uregex_hasAnchoringBounds", longArrayOf(regexp, status)).toByte()
}

public fun uregex_hasTransparentBounds(regexp: Long, status: Long): Byte {
    return Win32DynamicFfi.invoke("icuin.dll", "uregex_hasTransparentBounds", longArrayOf(regexp, status)).toByte()
}

public fun uregex_hitEnd(regexp: Long, status: Long): Byte {
    return Win32DynamicFfi.invoke("icuin.dll", "uregex_hitEnd", longArrayOf(regexp, status)).toByte()
}

public fun uregex_lookingAt(regexp: Long, startindex: Int, status: Long): Byte {
    return Win32DynamicFfi.invoke("icuin.dll", "uregex_lookingAt", longArrayOf(regexp, startindex.toLong(), status)).toByte()
}

public fun uregex_lookingAt64(regexp: Long, startindex: Long, status: Long): Byte {
    return Win32DynamicFfi.invoke("icuin.dll", "uregex_lookingAt64", longArrayOf(regexp, startindex, status)).toByte()
}

public fun uregex_matches(regexp: Long, startindex: Int, status: Long): Byte {
    return Win32DynamicFfi.invoke("icuin.dll", "uregex_matches", longArrayOf(regexp, startindex.toLong(), status)).toByte()
}

public fun uregex_matches64(regexp: Long, startindex: Long, status: Long): Byte {
    return Win32DynamicFfi.invoke("icuin.dll", "uregex_matches64", longArrayOf(regexp, startindex, status)).toByte()
}

public fun uregex_open(pattern: Long, patternlength: Int, flags: UInt, pe: Long, status: Long): Long {
    return Win32DynamicFfi.invoke("icuin.dll", "uregex_open", longArrayOf(pattern, patternlength.toLong(), flags.toLong(), pe, status))
}

public fun uregex_openC(pattern: PCSTR, flags: UInt, pe: Long, status: Long): Long {
    return Win32DynamicFfi.invoke("icuin.dll", "uregex_openC", longArrayOf(pattern, flags.toLong(), pe, status))
}

public fun uregex_openUText(pattern: Long, flags: UInt, pe: Long, status: Long): Long {
    return Win32DynamicFfi.invoke("icuin.dll", "uregex_openUText", longArrayOf(pattern, flags.toLong(), pe, status))
}

public fun uregex_pattern(regexp: Long, patlength: Long, status: Long): Long {
    return Win32DynamicFfi.invoke("icuin.dll", "uregex_pattern", longArrayOf(regexp, patlength, status))
}

public fun uregex_patternUText(regexp: Long, status: Long): Long {
    return Win32DynamicFfi.invoke("icuin.dll", "uregex_patternUText", longArrayOf(regexp, status))
}

public fun uregex_refreshUText(regexp: Long, text: Long, status: Long) {
    Win32DynamicFfi.invoke("icuin.dll", "uregex_refreshUText", longArrayOf(regexp, text, status))
}

public fun uregex_regionEnd(regexp: Long, status: Long): Int {
    return Win32DynamicFfi.invoke("icuin.dll", "uregex_regionEnd", longArrayOf(regexp, status)).toInt()
}

public fun uregex_regionEnd64(regexp: Long, status: Long): Long {
    return Win32DynamicFfi.invoke("icuin.dll", "uregex_regionEnd64", longArrayOf(regexp, status))
}

public fun uregex_regionStart(regexp: Long, status: Long): Int {
    return Win32DynamicFfi.invoke("icuin.dll", "uregex_regionStart", longArrayOf(regexp, status)).toInt()
}

public fun uregex_regionStart64(regexp: Long, status: Long): Long {
    return Win32DynamicFfi.invoke("icuin.dll", "uregex_regionStart64", longArrayOf(regexp, status))
}

public fun uregex_replaceAll(regexp: Long, replacementtext: Long, replacementlength: Int, destbuf: Long, destcapacity: Int, status: Long): Int {
    return Win32DynamicFfi.invoke("icuin.dll", "uregex_replaceAll", longArrayOf(regexp, replacementtext, replacementlength.toLong(), destbuf, destcapacity.toLong(), status)).toInt()
}

public fun uregex_replaceAllUText(regexp: Long, replacement: Long, dest: Long, status: Long): Long {
    return Win32DynamicFfi.invoke("icuin.dll", "uregex_replaceAllUText", longArrayOf(regexp, replacement, dest, status))
}

public fun uregex_replaceFirst(regexp: Long, replacementtext: Long, replacementlength: Int, destbuf: Long, destcapacity: Int, status: Long): Int {
    return Win32DynamicFfi.invoke("icuin.dll", "uregex_replaceFirst", longArrayOf(regexp, replacementtext, replacementlength.toLong(), destbuf, destcapacity.toLong(), status)).toInt()
}

public fun uregex_replaceFirstUText(regexp: Long, replacement: Long, dest: Long, status: Long): Long {
    return Win32DynamicFfi.invoke("icuin.dll", "uregex_replaceFirstUText", longArrayOf(regexp, replacement, dest, status))
}

public fun uregex_requireEnd(regexp: Long, status: Long): Byte {
    return Win32DynamicFfi.invoke("icuin.dll", "uregex_requireEnd", longArrayOf(regexp, status)).toByte()
}

public fun uregex_reset(regexp: Long, index: Int, status: Long) {
    Win32DynamicFfi.invoke("icuin.dll", "uregex_reset", longArrayOf(regexp, index.toLong(), status))
}

public fun uregex_reset64(regexp: Long, index: Long, status: Long) {
    Win32DynamicFfi.invoke("icuin.dll", "uregex_reset64", longArrayOf(regexp, index, status))
}

public fun uregex_setFindProgressCallback(regexp: Long, callback: URegexFindProgressCallback, context: Long, status: Long) {
    Win32DynamicFfi.invoke("icuin.dll", "uregex_setFindProgressCallback", longArrayOf(regexp, Win32DynamicFfi.objectSlot(callback), context, status))
}

public fun uregex_setMatchCallback(regexp: Long, callback: URegexMatchCallback, context: Long, status: Long) {
    Win32DynamicFfi.invoke("icuin.dll", "uregex_setMatchCallback", longArrayOf(regexp, Win32DynamicFfi.objectSlot(callback), context, status))
}

public fun uregex_setRegion(regexp: Long, regionstart: Int, regionlimit: Int, status: Long) {
    Win32DynamicFfi.invoke("icuin.dll", "uregex_setRegion", longArrayOf(regexp, regionstart.toLong(), regionlimit.toLong(), status))
}

public fun uregex_setRegion64(regexp: Long, regionstart: Long, regionlimit: Long, status: Long) {
    Win32DynamicFfi.invoke("icuin.dll", "uregex_setRegion64", longArrayOf(regexp, regionstart, regionlimit, status))
}

public fun uregex_setRegionAndStart(regexp: Long, regionstart: Long, regionlimit: Long, startindex: Long, status: Long) {
    Win32DynamicFfi.invoke("icuin.dll", "uregex_setRegionAndStart", longArrayOf(regexp, regionstart, regionlimit, startindex, status))
}

public fun uregex_setStackLimit(regexp: Long, limit: Int, status: Long) {
    Win32DynamicFfi.invoke("icuin.dll", "uregex_setStackLimit", longArrayOf(regexp, limit.toLong(), status))
}

public fun uregex_setText(regexp: Long, text: Long, textlength: Int, status: Long) {
    Win32DynamicFfi.invoke("icuin.dll", "uregex_setText", longArrayOf(regexp, text, textlength.toLong(), status))
}

public fun uregex_setTimeLimit(regexp: Long, limit: Int, status: Long) {
    Win32DynamicFfi.invoke("icuin.dll", "uregex_setTimeLimit", longArrayOf(regexp, limit.toLong(), status))
}

public fun uregex_setUText(regexp: Long, text: Long, status: Long) {
    Win32DynamicFfi.invoke("icuin.dll", "uregex_setUText", longArrayOf(regexp, text, status))
}

public fun uregex_split(regexp: Long, destbuf: Long, destcapacity: Int, requiredcapacity: Long, destfields: Long, destfieldscapacity: Int, status: Long): Int {
    return Win32DynamicFfi.invoke("icuin.dll", "uregex_split", longArrayOf(regexp, destbuf, destcapacity.toLong(), requiredcapacity, destfields, destfieldscapacity.toLong(), status)).toInt()
}

public fun uregex_splitUText(regexp: Long, destfields: Long, destfieldscapacity: Int, status: Long): Int {
    return Win32DynamicFfi.invoke("icuin.dll", "uregex_splitUText", longArrayOf(regexp, destfields, destfieldscapacity.toLong(), status)).toInt()
}

public fun uregex_start(regexp: Long, groupnum: Int, status: Long): Int {
    return Win32DynamicFfi.invoke("icuin.dll", "uregex_start", longArrayOf(regexp, groupnum.toLong(), status)).toInt()
}

public fun uregex_start64(regexp: Long, groupnum: Int, status: Long): Long {
    return Win32DynamicFfi.invoke("icuin.dll", "uregex_start64", longArrayOf(regexp, groupnum.toLong(), status))
}

public fun uregex_useAnchoringBounds(regexp: Long, b: Byte, status: Long) {
    Win32DynamicFfi.invoke("icuin.dll", "uregex_useAnchoringBounds", longArrayOf(regexp, b.toLong(), status))
}

public fun uregex_useTransparentBounds(regexp: Long, b: Byte, status: Long) {
    Win32DynamicFfi.invoke("icuin.dll", "uregex_useTransparentBounds", longArrayOf(regexp, b.toLong(), status))
}

public fun uregion_areEqual(uregion: Long, otherregion: Long): Byte {
    return Win32DynamicFfi.invoke("icuin.dll", "uregion_areEqual", longArrayOf(uregion, otherregion)).toByte()
}

public fun uregion_contains(uregion: Long, otherregion: Long): Byte {
    return Win32DynamicFfi.invoke("icuin.dll", "uregion_contains", longArrayOf(uregion, otherregion)).toByte()
}

public fun uregion_getAvailable(type: URegionType, status: Long): Long {
    return Win32DynamicFfi.invoke("icuin.dll", "uregion_getAvailable", longArrayOf(type.toLong(), status))
}

public fun uregion_getContainedRegions(uregion: Long, status: Long): Long {
    return Win32DynamicFfi.invoke("icuin.dll", "uregion_getContainedRegions", longArrayOf(uregion, status))
}

public fun uregion_getContainedRegionsOfType(uregion: Long, type: URegionType, status: Long): Long {
    return Win32DynamicFfi.invoke("icuin.dll", "uregion_getContainedRegionsOfType", longArrayOf(uregion, type.toLong(), status))
}

public fun uregion_getContainingRegion(uregion: Long): Long {
    return Win32DynamicFfi.invoke("icuin.dll", "uregion_getContainingRegion", longArrayOf(uregion))
}

public fun uregion_getContainingRegionOfType(uregion: Long, type: URegionType): Long {
    return Win32DynamicFfi.invoke("icuin.dll", "uregion_getContainingRegionOfType", longArrayOf(uregion, type.toLong()))
}

public fun uregion_getNumericCode(uregion: Long): Int {
    return Win32DynamicFfi.invoke("icuin.dll", "uregion_getNumericCode", longArrayOf(uregion)).toInt()
}
