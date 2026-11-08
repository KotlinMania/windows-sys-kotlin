package io.github.kotlinmania.windowssys.windows.win32.globalization

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.PCSTR

public fun interface FnCallbackPart3 {
    public operator fun invoke(context: Long, fnnumber: Int)
}

public fun interface FnCallback1Part3 {
    public operator fun invoke(context: Long, fnnumber: Int, fmt: PCSTR, args: Long)
}

public fun interface FnCallback2Part3 {
    public operator fun invoke(context: Long, fnnumber: Int, level: Int, fmt: PCSTR, args: Long)
}

public fun uregion_getPreferredValues(uregion: Long, status: Long): Long {
    return Win32DynamicFfi.invoke("icuin.dll", "uregion_getPreferredValues", longArrayOf(uregion, status))
}

public fun uregion_getRegionCode(uregion: Long): PCSTR {
    return Win32DynamicFfi.invoke("icuin.dll", "uregion_getRegionCode", longArrayOf(uregion))
}

public fun uregion_getRegionFromCode(regioncode: PCSTR, status: Long): Long {
    return Win32DynamicFfi.invoke("icuin.dll", "uregion_getRegionFromCode", longArrayOf(regioncode, status))
}

public fun uregion_getRegionFromNumericCode(code: Int, status: Long): Long {
    return Win32DynamicFfi.invoke("icuin.dll", "uregion_getRegionFromNumericCode", longArrayOf(code.toLong(), status))
}

public fun uregion_getType(uregion: Long): URegionType {
    return Win32DynamicFfi.invoke("icuin.dll", "uregion_getType", longArrayOf(uregion)).toInt()
}

public fun ureldatefmt_close(reldatefmt: Long) {
    Win32DynamicFfi.invoke("icuin.dll", "ureldatefmt_close", longArrayOf(reldatefmt))
}

public fun ureldatefmt_closeResult(ufrdt: Long) {
    Win32DynamicFfi.invoke("icu.dll", "ureldatefmt_closeResult", longArrayOf(ufrdt))
}

public fun ureldatefmt_combineDateAndTime(reldatefmt: Long, relativedatestring: Long, relativedatestringlen: Int, timestring: Long, timestringlen: Int, result: Long, resultcapacity: Int, status: Long): Int {
    return Win32DynamicFfi.invoke("icuin.dll", "ureldatefmt_combineDateAndTime", longArrayOf(reldatefmt, relativedatestring, relativedatestringlen.toLong(), timestring, timestringlen.toLong(), result, resultcapacity.toLong(), status)).toInt()
}

public fun ureldatefmt_format(reldatefmt: Long, offset: Double, unit: URelativeDateTimeUnit, result: Long, resultcapacity: Int, status: Long): Int {
    return Win32DynamicFfi.invokeFp("icuin.dll", "ureldatefmt_format", 8, false, longArrayOf(reldatefmt, offset.toRawBits(), unit.toLong(), result, resultcapacity.toLong(), status)).toLong().toInt()
}

public fun ureldatefmt_formatNumeric(reldatefmt: Long, offset: Double, unit: URelativeDateTimeUnit, result: Long, resultcapacity: Int, status: Long): Int {
    return Win32DynamicFfi.invokeFp("icuin.dll", "ureldatefmt_formatNumeric", 8, false, longArrayOf(reldatefmt, offset.toRawBits(), unit.toLong(), result, resultcapacity.toLong(), status)).toLong().toInt()
}

public fun ureldatefmt_formatNumericToResult(reldatefmt: Long, offset: Double, unit: URelativeDateTimeUnit, result: Long, status: Long) {
    Win32DynamicFfi.invokeFp("icu.dll", "ureldatefmt_formatNumericToResult", 8, false, longArrayOf(reldatefmt, offset.toRawBits(), unit.toLong(), result, status))
}

public fun ureldatefmt_formatToResult(reldatefmt: Long, offset: Double, unit: URelativeDateTimeUnit, result: Long, status: Long) {
    Win32DynamicFfi.invokeFp("icu.dll", "ureldatefmt_formatToResult", 8, false, longArrayOf(reldatefmt, offset.toRawBits(), unit.toLong(), result, status))
}

public fun ureldatefmt_open(locale: PCSTR, nftoadopt: Long, width: UDateRelativeDateTimeFormatterStyle, capitalizationcontext: UDisplayContext, status: Long): Long {
    return Win32DynamicFfi.invoke("icuin.dll", "ureldatefmt_open", longArrayOf(locale, nftoadopt, width.toLong(), capitalizationcontext.toLong(), status))
}

public fun ureldatefmt_openResult(ec: Long): Long {
    return Win32DynamicFfi.invoke("icu.dll", "ureldatefmt_openResult", longArrayOf(ec))
}

public fun ureldatefmt_resultAsValue(ufrdt: Long, ec: Long): Long {
    return Win32DynamicFfi.invoke("icu.dll", "ureldatefmt_resultAsValue", longArrayOf(ufrdt, ec))
}

public fun ures_close(resourcebundle: Long) {
    Win32DynamicFfi.invoke("icuuc.dll", "ures_close", longArrayOf(resourcebundle))
}

public fun ures_getBinary(resourcebundle: Long, len: Long, status: Long): Long {
    return Win32DynamicFfi.invoke("icuuc.dll", "ures_getBinary", longArrayOf(resourcebundle, len, status))
}

public fun ures_getByIndex(resourcebundle: Long, indexr: Int, fillin: Long, status: Long): Long {
    return Win32DynamicFfi.invoke("icuuc.dll", "ures_getByIndex", longArrayOf(resourcebundle, indexr.toLong(), fillin, status))
}

public fun ures_getByKey(resourcebundle: Long, key: PCSTR, fillin: Long, status: Long): Long {
    return Win32DynamicFfi.invoke("icuuc.dll", "ures_getByKey", longArrayOf(resourcebundle, key, fillin, status))
}

public fun ures_getInt(resourcebundle: Long, status: Long): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "ures_getInt", longArrayOf(resourcebundle, status)).toInt()
}

public fun ures_getIntVector(resourcebundle: Long, len: Long, status: Long): Long {
    return Win32DynamicFfi.invoke("icuuc.dll", "ures_getIntVector", longArrayOf(resourcebundle, len, status))
}

public fun ures_getKey(resourcebundle: Long): PCSTR {
    return Win32DynamicFfi.invoke("icuuc.dll", "ures_getKey", longArrayOf(resourcebundle))
}

public fun ures_getLocaleByType(resourcebundle: Long, type: ULocDataLocaleType, status: Long): PCSTR {
    return Win32DynamicFfi.invoke("icuuc.dll", "ures_getLocaleByType", longArrayOf(resourcebundle, type.toLong(), status))
}

public fun ures_getNextResource(resourcebundle: Long, fillin: Long, status: Long): Long {
    return Win32DynamicFfi.invoke("icuuc.dll", "ures_getNextResource", longArrayOf(resourcebundle, fillin, status))
}

public fun ures_getNextString(resourcebundle: Long, len: Long, key: Long, status: Long): Long {
    return Win32DynamicFfi.invoke("icuuc.dll", "ures_getNextString", longArrayOf(resourcebundle, len, key, status))
}

public fun ures_getSize(resourcebundle: Long): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "ures_getSize", longArrayOf(resourcebundle)).toInt()
}

public fun ures_getString(resourcebundle: Long, len: Long, status: Long): Long {
    return Win32DynamicFfi.invoke("icuuc.dll", "ures_getString", longArrayOf(resourcebundle, len, status))
}

public fun ures_getStringByIndex(resourcebundle: Long, indexs: Int, len: Long, status: Long): Long {
    return Win32DynamicFfi.invoke("icuuc.dll", "ures_getStringByIndex", longArrayOf(resourcebundle, indexs.toLong(), len, status))
}

public fun ures_getStringByKey(resb: Long, key: PCSTR, len: Long, status: Long): Long {
    return Win32DynamicFfi.invoke("icuuc.dll", "ures_getStringByKey", longArrayOf(resb, key, len, status))
}

public fun ures_getType(resourcebundle: Long): UResType {
    return Win32DynamicFfi.invoke("icuuc.dll", "ures_getType", longArrayOf(resourcebundle)).toInt()
}

public fun ures_getUInt(resourcebundle: Long, status: Long): UInt {
    return Win32DynamicFfi.invoke("icuuc.dll", "ures_getUInt", longArrayOf(resourcebundle, status)).toUInt()
}

public fun ures_getUTF8String(resb: Long, dest: PCSTR, length: Long, forcecopy: Byte, status: Long): PCSTR {
    return Win32DynamicFfi.invoke("icuuc.dll", "ures_getUTF8String", longArrayOf(resb, dest, length, forcecopy.toLong(), status))
}

public fun ures_getUTF8StringByIndex(resb: Long, stringindex: Int, dest: PCSTR, plength: Long, forcecopy: Byte, status: Long): PCSTR {
    return Win32DynamicFfi.invoke("icuuc.dll", "ures_getUTF8StringByIndex", longArrayOf(resb, stringindex.toLong(), dest, plength, forcecopy.toLong(), status))
}

public fun ures_getUTF8StringByKey(resb: Long, key: PCSTR, dest: PCSTR, plength: Long, forcecopy: Byte, status: Long): PCSTR {
    return Win32DynamicFfi.invoke("icuuc.dll", "ures_getUTF8StringByKey", longArrayOf(resb, key, dest, plength, forcecopy.toLong(), status))
}

public fun ures_getVersion(resb: Long, versioninfo: Long) {
    Win32DynamicFfi.invoke("icuuc.dll", "ures_getVersion", longArrayOf(resb, versioninfo))
}

public fun ures_hasNext(resourcebundle: Long): Byte {
    return Win32DynamicFfi.invoke("icuuc.dll", "ures_hasNext", longArrayOf(resourcebundle)).toByte()
}

public fun ures_open(packagename: PCSTR, locale: PCSTR, status: Long): Long {
    return Win32DynamicFfi.invoke("icuuc.dll", "ures_open", longArrayOf(packagename, locale, status))
}

public fun ures_openAvailableLocales(packagename: PCSTR, status: Long): Long {
    return Win32DynamicFfi.invoke("icuuc.dll", "ures_openAvailableLocales", longArrayOf(packagename, status))
}

public fun ures_openDirect(packagename: PCSTR, locale: PCSTR, status: Long): Long {
    return Win32DynamicFfi.invoke("icuuc.dll", "ures_openDirect", longArrayOf(packagename, locale, status))
}

public fun ures_openU(packagename: Long, locale: PCSTR, status: Long): Long {
    return Win32DynamicFfi.invoke("icuuc.dll", "ures_openU", longArrayOf(packagename, locale, status))
}

public fun ures_resetIterator(resourcebundle: Long) {
    Win32DynamicFfi.invoke("icuuc.dll", "ures_resetIterator", longArrayOf(resourcebundle))
}

public fun uscript_breaksBetweenLetters(script: UScriptCode): Byte {
    return Win32DynamicFfi.invoke("icuuc.dll", "uscript_breaksBetweenLetters", longArrayOf(script.toLong())).toByte()
}

public fun uscript_getCode(nameorabbrorlocale: PCSTR, fillin: Long, capacity: Int, err: Long): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "uscript_getCode", longArrayOf(nameorabbrorlocale, fillin, capacity.toLong(), err)).toInt()
}

public fun uscript_getName(scriptcode: UScriptCode): PCSTR {
    return Win32DynamicFfi.invoke("icuuc.dll", "uscript_getName", longArrayOf(scriptcode.toLong()))
}

public fun uscript_getSampleString(script: UScriptCode, dest: Long, capacity: Int, perrorcode: Long): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "uscript_getSampleString", longArrayOf(script.toLong(), dest, capacity.toLong(), perrorcode)).toInt()
}

public fun uscript_getScript(codepoint: Int, err: Long): UScriptCode {
    return Win32DynamicFfi.invoke("icuuc.dll", "uscript_getScript", longArrayOf(codepoint.toLong(), err)).toInt()
}

public fun uscript_getScriptExtensions(c: Int, scripts: Long, capacity: Int, errorcode: Long): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "uscript_getScriptExtensions", longArrayOf(c.toLong(), scripts, capacity.toLong(), errorcode)).toInt()
}

public fun uscript_getShortName(scriptcode: UScriptCode): PCSTR {
    return Win32DynamicFfi.invoke("icuuc.dll", "uscript_getShortName", longArrayOf(scriptcode.toLong()))
}

public fun uscript_getUsage(script: UScriptCode): UScriptUsage {
    return Win32DynamicFfi.invoke("icuuc.dll", "uscript_getUsage", longArrayOf(script.toLong())).toInt()
}

public fun uscript_hasScript(c: Int, sc: UScriptCode): Byte {
    return Win32DynamicFfi.invoke("icuuc.dll", "uscript_hasScript", longArrayOf(c.toLong(), sc.toLong())).toByte()
}

public fun uscript_isCased(script: UScriptCode): Byte {
    return Win32DynamicFfi.invoke("icuuc.dll", "uscript_isCased", longArrayOf(script.toLong())).toByte()
}

public fun uscript_isRightToLeft(script: UScriptCode): Byte {
    return Win32DynamicFfi.invoke("icuuc.dll", "uscript_isRightToLeft", longArrayOf(script.toLong())).toByte()
}

public fun usearch_close(searchiter: Long) {
    Win32DynamicFfi.invoke("icuin.dll", "usearch_close", longArrayOf(searchiter))
}

public fun usearch_first(strsrch: Long, status: Long): Int {
    return Win32DynamicFfi.invoke("icuin.dll", "usearch_first", longArrayOf(strsrch, status)).toInt()
}

public fun usearch_following(strsrch: Long, position: Int, status: Long): Int {
    return Win32DynamicFfi.invoke("icuin.dll", "usearch_following", longArrayOf(strsrch, position.toLong(), status)).toInt()
}

public fun usearch_getAttribute(strsrch: Long, attribute: USearchAttribute): USearchAttributeValue {
    return Win32DynamicFfi.invoke("icuin.dll", "usearch_getAttribute", longArrayOf(strsrch, attribute.toLong())).toInt()
}

public fun usearch_getBreakIterator(strsrch: Long): Long {
    return Win32DynamicFfi.invoke("icuin.dll", "usearch_getBreakIterator", longArrayOf(strsrch))
}

public fun usearch_getCollator(strsrch: Long): Long {
    return Win32DynamicFfi.invoke("icuin.dll", "usearch_getCollator", longArrayOf(strsrch))
}

public fun usearch_getMatchedLength(strsrch: Long): Int {
    return Win32DynamicFfi.invoke("icuin.dll", "usearch_getMatchedLength", longArrayOf(strsrch)).toInt()
}

public fun usearch_getMatchedStart(strsrch: Long): Int {
    return Win32DynamicFfi.invoke("icuin.dll", "usearch_getMatchedStart", longArrayOf(strsrch)).toInt()
}

public fun usearch_getMatchedText(strsrch: Long, result: Long, resultcapacity: Int, status: Long): Int {
    return Win32DynamicFfi.invoke("icuin.dll", "usearch_getMatchedText", longArrayOf(strsrch, result, resultcapacity.toLong(), status)).toInt()
}

public fun usearch_getOffset(strsrch: Long): Int {
    return Win32DynamicFfi.invoke("icuin.dll", "usearch_getOffset", longArrayOf(strsrch)).toInt()
}

public fun usearch_getPattern(strsrch: Long, length: Long): Long {
    return Win32DynamicFfi.invoke("icuin.dll", "usearch_getPattern", longArrayOf(strsrch, length))
}

public fun usearch_getText(strsrch: Long, length: Long): Long {
    return Win32DynamicFfi.invoke("icuin.dll", "usearch_getText", longArrayOf(strsrch, length))
}

public fun usearch_last(strsrch: Long, status: Long): Int {
    return Win32DynamicFfi.invoke("icuin.dll", "usearch_last", longArrayOf(strsrch, status)).toInt()
}

public fun usearch_next(strsrch: Long, status: Long): Int {
    return Win32DynamicFfi.invoke("icuin.dll", "usearch_next", longArrayOf(strsrch, status)).toInt()
}

public fun usearch_open(pattern: Long, patternlength: Int, text: Long, textlength: Int, locale: PCSTR, breakiter: Long, status: Long): Long {
    return Win32DynamicFfi.invoke("icuin.dll", "usearch_open", longArrayOf(pattern, patternlength.toLong(), text, textlength.toLong(), locale, breakiter, status))
}

public fun usearch_openFromCollator(pattern: Long, patternlength: Int, text: Long, textlength: Int, collator: Long, breakiter: Long, status: Long): Long {
    return Win32DynamicFfi.invoke("icuin.dll", "usearch_openFromCollator", longArrayOf(pattern, patternlength.toLong(), text, textlength.toLong(), collator, breakiter, status))
}

public fun usearch_preceding(strsrch: Long, position: Int, status: Long): Int {
    return Win32DynamicFfi.invoke("icuin.dll", "usearch_preceding", longArrayOf(strsrch, position.toLong(), status)).toInt()
}

public fun usearch_previous(strsrch: Long, status: Long): Int {
    return Win32DynamicFfi.invoke("icuin.dll", "usearch_previous", longArrayOf(strsrch, status)).toInt()
}

public fun usearch_reset(strsrch: Long) {
    Win32DynamicFfi.invoke("icuin.dll", "usearch_reset", longArrayOf(strsrch))
}

public fun usearch_setAttribute(strsrch: Long, attribute: USearchAttribute, value: USearchAttributeValue, status: Long) {
    Win32DynamicFfi.invoke("icuin.dll", "usearch_setAttribute", longArrayOf(strsrch, attribute.toLong(), value.toLong(), status))
}

public fun usearch_setBreakIterator(strsrch: Long, breakiter: Long, status: Long) {
    Win32DynamicFfi.invoke("icuin.dll", "usearch_setBreakIterator", longArrayOf(strsrch, breakiter, status))
}

public fun usearch_setCollator(strsrch: Long, collator: Long, status: Long) {
    Win32DynamicFfi.invoke("icuin.dll", "usearch_setCollator", longArrayOf(strsrch, collator, status))
}

public fun usearch_setOffset(strsrch: Long, position: Int, status: Long) {
    Win32DynamicFfi.invoke("icuin.dll", "usearch_setOffset", longArrayOf(strsrch, position.toLong(), status))
}

public fun usearch_setPattern(strsrch: Long, pattern: Long, patternlength: Int, status: Long) {
    Win32DynamicFfi.invoke("icuin.dll", "usearch_setPattern", longArrayOf(strsrch, pattern, patternlength.toLong(), status))
}

public fun usearch_setText(strsrch: Long, text: Long, textlength: Int, status: Long) {
    Win32DynamicFfi.invoke("icuin.dll", "usearch_setText", longArrayOf(strsrch, text, textlength.toLong(), status))
}

public fun uset_add(set: Long, c: Int) {
    Win32DynamicFfi.invoke("icuuc.dll", "uset_add", longArrayOf(set, c.toLong()))
}

public fun uset_addAll(set: Long, additionalset: Long) {
    Win32DynamicFfi.invoke("icuuc.dll", "uset_addAll", longArrayOf(set, additionalset))
}

public fun uset_addAllCodePoints(set: Long, str: Long, strlen: Int) {
    Win32DynamicFfi.invoke("icuuc.dll", "uset_addAllCodePoints", longArrayOf(set, str, strlen.toLong()))
}

public fun uset_addRange(set: Long, start: Int, end: Int) {
    Win32DynamicFfi.invoke("icuuc.dll", "uset_addRange", longArrayOf(set, start.toLong(), end.toLong()))
}

public fun uset_addString(set: Long, str: Long, strlen: Int) {
    Win32DynamicFfi.invoke("icuuc.dll", "uset_addString", longArrayOf(set, str, strlen.toLong()))
}

public fun uset_applyIntPropertyValue(set: Long, prop: UProperty, value: Int, ec: Long) {
    Win32DynamicFfi.invoke("icuuc.dll", "uset_applyIntPropertyValue", longArrayOf(set, prop.toLong(), value.toLong(), ec))
}

public fun uset_applyPattern(set: Long, pattern: Long, patternlength: Int, options: UInt, status: Long): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "uset_applyPattern", longArrayOf(set, pattern, patternlength.toLong(), options.toLong(), status)).toInt()
}

public fun uset_applyPropertyAlias(set: Long, prop: Long, proplength: Int, value: Long, valuelength: Int, ec: Long) {
    Win32DynamicFfi.invoke("icuuc.dll", "uset_applyPropertyAlias", longArrayOf(set, prop, proplength.toLong(), value, valuelength.toLong(), ec))
}

public fun uset_charAt(set: Long, charindex: Int): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "uset_charAt", longArrayOf(set, charindex.toLong())).toInt()
}

public fun uset_clear(set: Long) {
    Win32DynamicFfi.invoke("icuuc.dll", "uset_clear", longArrayOf(set))
}

public fun uset_clone(set: Long): Long {
    return Win32DynamicFfi.invoke("icuuc.dll", "uset_clone", longArrayOf(set))
}

public fun uset_cloneAsThawed(set: Long): Long {
    return Win32DynamicFfi.invoke("icuuc.dll", "uset_cloneAsThawed", longArrayOf(set))
}

public fun uset_close(set: Long) {
    Win32DynamicFfi.invoke("icuuc.dll", "uset_close", longArrayOf(set))
}

public fun uset_closeOver(set: Long, attributes: Int) {
    Win32DynamicFfi.invoke("icuuc.dll", "uset_closeOver", longArrayOf(set, attributes.toLong()))
}

public fun uset_compact(set: Long) {
    Win32DynamicFfi.invoke("icuuc.dll", "uset_compact", longArrayOf(set))
}

public fun uset_complement(set: Long) {
    Win32DynamicFfi.invoke("icuuc.dll", "uset_complement", longArrayOf(set))
}

public fun uset_complementAll(set: Long, complement: Long) {
    Win32DynamicFfi.invoke("icuuc.dll", "uset_complementAll", longArrayOf(set, complement))
}

public fun uset_contains(set: Long, c: Int): Byte {
    return Win32DynamicFfi.invoke("icuuc.dll", "uset_contains", longArrayOf(set, c.toLong())).toByte()
}

public fun uset_containsAll(set1: Long, set2: Long): Byte {
    return Win32DynamicFfi.invoke("icuuc.dll", "uset_containsAll", longArrayOf(set1, set2)).toByte()
}

public fun uset_containsAllCodePoints(set: Long, str: Long, strlen: Int): Byte {
    return Win32DynamicFfi.invoke("icuuc.dll", "uset_containsAllCodePoints", longArrayOf(set, str, strlen.toLong())).toByte()
}

public fun uset_containsNone(set1: Long, set2: Long): Byte {
    return Win32DynamicFfi.invoke("icuuc.dll", "uset_containsNone", longArrayOf(set1, set2)).toByte()
}

public fun uset_containsRange(set: Long, start: Int, end: Int): Byte {
    return Win32DynamicFfi.invoke("icuuc.dll", "uset_containsRange", longArrayOf(set, start.toLong(), end.toLong())).toByte()
}

public fun uset_containsSome(set1: Long, set2: Long): Byte {
    return Win32DynamicFfi.invoke("icuuc.dll", "uset_containsSome", longArrayOf(set1, set2)).toByte()
}

public fun uset_containsString(set: Long, str: Long, strlen: Int): Byte {
    return Win32DynamicFfi.invoke("icuuc.dll", "uset_containsString", longArrayOf(set, str, strlen.toLong())).toByte()
}

public fun uset_equals(set1: Long, set2: Long): Byte {
    return Win32DynamicFfi.invoke("icuuc.dll", "uset_equals", longArrayOf(set1, set2)).toByte()
}

public fun uset_freeze(set: Long) {
    Win32DynamicFfi.invoke("icuuc.dll", "uset_freeze", longArrayOf(set))
}

public fun uset_getItem(set: Long, itemindex: Int, start: Long, end: Long, str: Long, strcapacity: Int, ec: Long): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "uset_getItem", longArrayOf(set, itemindex.toLong(), start, end, str, strcapacity.toLong(), ec)).toInt()
}

public fun uset_getItemCount(set: Long): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "uset_getItemCount", longArrayOf(set)).toInt()
}

public fun uset_getSerializedRange(set: Long, rangeindex: Int, pstart: Long, pend: Long): Byte {
    return Win32DynamicFfi.invoke("icuuc.dll", "uset_getSerializedRange", longArrayOf(set, rangeindex.toLong(), pstart, pend)).toByte()
}

public fun uset_getSerializedRangeCount(set: Long): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "uset_getSerializedRangeCount", longArrayOf(set)).toInt()
}

public fun uset_getSerializedSet(fillset: Long, src: Long, srclength: Int): Byte {
    return Win32DynamicFfi.invoke("icuuc.dll", "uset_getSerializedSet", longArrayOf(fillset, src, srclength.toLong())).toByte()
}

public fun uset_indexOf(set: Long, c: Int): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "uset_indexOf", longArrayOf(set, c.toLong())).toInt()
}

public fun uset_isEmpty(set: Long): Byte {
    return Win32DynamicFfi.invoke("icuuc.dll", "uset_isEmpty", longArrayOf(set)).toByte()
}

public fun uset_isFrozen(set: Long): Byte {
    return Win32DynamicFfi.invoke("icuuc.dll", "uset_isFrozen", longArrayOf(set)).toByte()
}

public fun uset_open(start: Int, end: Int): Long {
    return Win32DynamicFfi.invoke("icuuc.dll", "uset_open", longArrayOf(start.toLong(), end.toLong()))
}

public fun uset_openEmpty(): Long {
    return Win32DynamicFfi.invoke("icuuc.dll", "uset_openEmpty", longArrayOf())
}

public fun uset_openPattern(pattern: Long, patternlength: Int, ec: Long): Long {
    return Win32DynamicFfi.invoke("icuuc.dll", "uset_openPattern", longArrayOf(pattern, patternlength.toLong(), ec))
}

public fun uset_openPatternOptions(pattern: Long, patternlength: Int, options: UInt, ec: Long): Long {
    return Win32DynamicFfi.invoke("icuuc.dll", "uset_openPatternOptions", longArrayOf(pattern, patternlength.toLong(), options.toLong(), ec))
}

public fun uset_remove(set: Long, c: Int) {
    Win32DynamicFfi.invoke("icuuc.dll", "uset_remove", longArrayOf(set, c.toLong()))
}

public fun uset_removeAll(set: Long, removeset: Long) {
    Win32DynamicFfi.invoke("icuuc.dll", "uset_removeAll", longArrayOf(set, removeset))
}

public fun uset_removeAllStrings(set: Long) {
    Win32DynamicFfi.invoke("icuuc.dll", "uset_removeAllStrings", longArrayOf(set))
}

public fun uset_removeRange(set: Long, start: Int, end: Int) {
    Win32DynamicFfi.invoke("icuuc.dll", "uset_removeRange", longArrayOf(set, start.toLong(), end.toLong()))
}

public fun uset_removeString(set: Long, str: Long, strlen: Int) {
    Win32DynamicFfi.invoke("icuuc.dll", "uset_removeString", longArrayOf(set, str, strlen.toLong()))
}

public fun uset_resemblesPattern(pattern: Long, patternlength: Int, pos: Int): Byte {
    return Win32DynamicFfi.invoke("icuuc.dll", "uset_resemblesPattern", longArrayOf(pattern, patternlength.toLong(), pos.toLong())).toByte()
}

public fun uset_retain(set: Long, start: Int, end: Int) {
    Win32DynamicFfi.invoke("icuuc.dll", "uset_retain", longArrayOf(set, start.toLong(), end.toLong()))
}

public fun uset_retainAll(set: Long, retain: Long) {
    Win32DynamicFfi.invoke("icuuc.dll", "uset_retainAll", longArrayOf(set, retain))
}

public fun uset_serialize(set: Long, dest: Long, destcapacity: Int, perrorcode: Long): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "uset_serialize", longArrayOf(set, dest, destcapacity.toLong(), perrorcode)).toInt()
}

public fun uset_serializedContains(set: Long, c: Int): Byte {
    return Win32DynamicFfi.invoke("icuuc.dll", "uset_serializedContains", longArrayOf(set, c.toLong())).toByte()
}

public fun uset_set(set: Long, start: Int, end: Int) {
    Win32DynamicFfi.invoke("icuuc.dll", "uset_set", longArrayOf(set, start.toLong(), end.toLong()))
}

public fun uset_setSerializedToOne(fillset: Long, c: Int) {
    Win32DynamicFfi.invoke("icuuc.dll", "uset_setSerializedToOne", longArrayOf(fillset, c.toLong()))
}

public fun uset_size(set: Long): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "uset_size", longArrayOf(set)).toInt()
}

public fun uset_span(set: Long, s: Long, length: Int, spancondition: USetSpanCondition): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "uset_span", longArrayOf(set, s, length.toLong(), spancondition.toLong())).toInt()
}

public fun uset_spanBack(set: Long, s: Long, length: Int, spancondition: USetSpanCondition): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "uset_spanBack", longArrayOf(set, s, length.toLong(), spancondition.toLong())).toInt()
}

public fun uset_spanBackUTF8(set: Long, s: PCSTR, length: Int, spancondition: USetSpanCondition): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "uset_spanBackUTF8", longArrayOf(set, s, length.toLong(), spancondition.toLong())).toInt()
}

public fun uset_spanUTF8(set: Long, s: PCSTR, length: Int, spancondition: USetSpanCondition): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "uset_spanUTF8", longArrayOf(set, s, length.toLong(), spancondition.toLong())).toInt()
}

public fun uset_toPattern(set: Long, result: Long, resultcapacity: Int, escapeunprintable: Byte, ec: Long): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "uset_toPattern", longArrayOf(set, result, resultcapacity.toLong(), escapeunprintable.toLong(), ec)).toInt()
}

public fun uspoof_areConfusable(sc: Long, id1: Long, length1: Int, id2: Long, length2: Int, status: Long): Int {
    return Win32DynamicFfi.invoke("icuin.dll", "uspoof_areConfusable", longArrayOf(sc, id1, length1.toLong(), id2, length2.toLong(), status)).toInt()
}

public fun uspoof_areConfusableUTF8(sc: Long, id1: PCSTR, length1: Int, id2: PCSTR, length2: Int, status: Long): Int {
    return Win32DynamicFfi.invoke("icuin.dll", "uspoof_areConfusableUTF8", longArrayOf(sc, id1, length1.toLong(), id2, length2.toLong(), status)).toInt()
}

public fun uspoof_check(sc: Long, id: Long, length: Int, position: Long, status: Long): Int {
    return Win32DynamicFfi.invoke("icuin.dll", "uspoof_check", longArrayOf(sc, id, length.toLong(), position, status)).toInt()
}

public fun uspoof_check2(sc: Long, id: Long, length: Int, checkresult: Long, status: Long): Int {
    return Win32DynamicFfi.invoke("icuin.dll", "uspoof_check2", longArrayOf(sc, id, length.toLong(), checkresult, status)).toInt()
}

public fun uspoof_check2UTF8(sc: Long, id: PCSTR, length: Int, checkresult: Long, status: Long): Int {
    return Win32DynamicFfi.invoke("icuin.dll", "uspoof_check2UTF8", longArrayOf(sc, id, length.toLong(), checkresult, status)).toInt()
}

public fun uspoof_checkUTF8(sc: Long, id: PCSTR, length: Int, position: Long, status: Long): Int {
    return Win32DynamicFfi.invoke("icuin.dll", "uspoof_checkUTF8", longArrayOf(sc, id, length.toLong(), position, status)).toInt()
}

public fun uspoof_clone(sc: Long, status: Long): Long {
    return Win32DynamicFfi.invoke("icuin.dll", "uspoof_clone", longArrayOf(sc, status))
}

public fun uspoof_close(sc: Long) {
    Win32DynamicFfi.invoke("icuin.dll", "uspoof_close", longArrayOf(sc))
}

public fun uspoof_closeCheckResult(checkresult: Long) {
    Win32DynamicFfi.invoke("icuin.dll", "uspoof_closeCheckResult", longArrayOf(checkresult))
}

public fun uspoof_getAllowedChars(sc: Long, status: Long): Long {
    return Win32DynamicFfi.invoke("icuin.dll", "uspoof_getAllowedChars", longArrayOf(sc, status))
}

public fun uspoof_getAllowedLocales(sc: Long, status: Long): PCSTR {
    return Win32DynamicFfi.invoke("icuin.dll", "uspoof_getAllowedLocales", longArrayOf(sc, status))
}

public fun uspoof_getCheckResultChecks(checkresult: Long, status: Long): Int {
    return Win32DynamicFfi.invoke("icuin.dll", "uspoof_getCheckResultChecks", longArrayOf(checkresult, status)).toInt()
}

public fun uspoof_getCheckResultNumerics(checkresult: Long, status: Long): Long {
    return Win32DynamicFfi.invoke("icuin.dll", "uspoof_getCheckResultNumerics", longArrayOf(checkresult, status))
}

public fun uspoof_getCheckResultRestrictionLevel(checkresult: Long, status: Long): URestrictionLevel {
    return Win32DynamicFfi.invoke("icuin.dll", "uspoof_getCheckResultRestrictionLevel", longArrayOf(checkresult, status)).toInt()
}

public fun uspoof_getChecks(sc: Long, status: Long): Int {
    return Win32DynamicFfi.invoke("icuin.dll", "uspoof_getChecks", longArrayOf(sc, status)).toInt()
}

public fun uspoof_getInclusionSet(status: Long): Long {
    return Win32DynamicFfi.invoke("icuin.dll", "uspoof_getInclusionSet", longArrayOf(status))
}

public fun uspoof_getRecommendedSet(status: Long): Long {
    return Win32DynamicFfi.invoke("icuin.dll", "uspoof_getRecommendedSet", longArrayOf(status))
}

public fun uspoof_getRestrictionLevel(sc: Long): URestrictionLevel {
    return Win32DynamicFfi.invoke("icuin.dll", "uspoof_getRestrictionLevel", longArrayOf(sc)).toInt()
}

public fun uspoof_getSkeleton(sc: Long, type: UInt, id: Long, length: Int, dest: Long, destcapacity: Int, status: Long): Int {
    return Win32DynamicFfi.invoke("icuin.dll", "uspoof_getSkeleton", longArrayOf(sc, type.toLong(), id, length.toLong(), dest, destcapacity.toLong(), status)).toInt()
}

public fun uspoof_getSkeletonUTF8(sc: Long, type: UInt, id: PCSTR, length: Int, dest: PCSTR, destcapacity: Int, status: Long): Int {
    return Win32DynamicFfi.invoke("icuin.dll", "uspoof_getSkeletonUTF8", longArrayOf(sc, type.toLong(), id, length.toLong(), dest, destcapacity.toLong(), status)).toInt()
}

public fun uspoof_open(status: Long): Long {
    return Win32DynamicFfi.invoke("icuin.dll", "uspoof_open", longArrayOf(status))
}

public fun uspoof_openCheckResult(status: Long): Long {
    return Win32DynamicFfi.invoke("icuin.dll", "uspoof_openCheckResult", longArrayOf(status))
}

public fun uspoof_openFromSerialized(data: Long, length: Int, pactuallength: Long, perrorcode: Long): Long {
    return Win32DynamicFfi.invoke("icuin.dll", "uspoof_openFromSerialized", longArrayOf(data, length.toLong(), pactuallength, perrorcode))
}

public fun uspoof_openFromSource(confusables: PCSTR, confusableslen: Int, confusableswholescript: PCSTR, confusableswholescriptlen: Int, errtype: Long, pe: Long, status: Long): Long {
    return Win32DynamicFfi.invoke("icuin.dll", "uspoof_openFromSource", longArrayOf(confusables, confusableslen.toLong(), confusableswholescript, confusableswholescriptlen.toLong(), errtype, pe, status))
}

public fun uspoof_serialize(sc: Long, data: Long, capacity: Int, status: Long): Int {
    return Win32DynamicFfi.invoke("icuin.dll", "uspoof_serialize", longArrayOf(sc, data, capacity.toLong(), status)).toInt()
}

public fun uspoof_setAllowedChars(sc: Long, chars: Long, status: Long) {
    Win32DynamicFfi.invoke("icuin.dll", "uspoof_setAllowedChars", longArrayOf(sc, chars, status))
}

public fun uspoof_setAllowedLocales(sc: Long, localeslist: PCSTR, status: Long) {
    Win32DynamicFfi.invoke("icuin.dll", "uspoof_setAllowedLocales", longArrayOf(sc, localeslist, status))
}

public fun uspoof_setChecks(sc: Long, checks: Int, status: Long) {
    Win32DynamicFfi.invoke("icuin.dll", "uspoof_setChecks", longArrayOf(sc, checks.toLong(), status))
}

public fun uspoof_setRestrictionLevel(sc: Long, restrictionlevel: URestrictionLevel) {
    Win32DynamicFfi.invoke("icuin.dll", "uspoof_setRestrictionLevel", longArrayOf(sc, restrictionlevel.toLong()))
}

public fun usprep_close(profile: Long) {
    Win32DynamicFfi.invoke("icuuc.dll", "usprep_close", longArrayOf(profile))
}

public fun usprep_open(path: PCSTR, filename: PCSTR, status: Long): Long {
    return Win32DynamicFfi.invoke("icuuc.dll", "usprep_open", longArrayOf(path, filename, status))
}

public fun usprep_openByType(type: UStringPrepProfileType, status: Long): Long {
    return Win32DynamicFfi.invoke("icuuc.dll", "usprep_openByType", longArrayOf(type.toLong(), status))
}

public fun usprep_prepare(prep: Long, src: Long, srclength: Int, dest: Long, destcapacity: Int, options: Int, parseerror: Long, status: Long): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "usprep_prepare", longArrayOf(prep, src, srclength.toLong(), dest, destcapacity.toLong(), options.toLong(), parseerror, status)).toInt()
}

public fun utext_char32At(ut: Long, nativeindex: Long): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "utext_char32At", longArrayOf(ut, nativeindex)).toInt()
}

public fun utext_clone(dest: Long, src: Long, deep: Byte, readonly: Byte, status: Long): Long {
    return Win32DynamicFfi.invoke("icuuc.dll", "utext_clone", longArrayOf(dest, src, deep.toLong(), readonly.toLong(), status))
}

public fun utext_close(ut: Long): Long {
    return Win32DynamicFfi.invoke("icuuc.dll", "utext_close", longArrayOf(ut))
}

public fun utext_copy(ut: Long, nativestart: Long, nativelimit: Long, destindex: Long, move: Byte, status: Long) {
    Win32DynamicFfi.invoke("icuuc.dll", "utext_copy", longArrayOf(ut, nativestart, nativelimit, destindex, move.toLong(), status))
}

public fun utext_current32(ut: Long): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "utext_current32", longArrayOf(ut)).toInt()
}

public fun utext_equals(a: Long, b: Long): Byte {
    return Win32DynamicFfi.invoke("icuuc.dll", "utext_equals", longArrayOf(a, b)).toByte()
}

public fun utext_extract(ut: Long, nativestart: Long, nativelimit: Long, dest: Long, destcapacity: Int, status: Long): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "utext_extract", longArrayOf(ut, nativestart, nativelimit, dest, destcapacity.toLong(), status)).toInt()
}

public fun utext_freeze(ut: Long) {
    Win32DynamicFfi.invoke("icuuc.dll", "utext_freeze", longArrayOf(ut))
}

public fun utext_getNativeIndex(ut: Long): Long {
    return Win32DynamicFfi.invoke("icuuc.dll", "utext_getNativeIndex", longArrayOf(ut))
}

public fun utext_getPreviousNativeIndex(ut: Long): Long {
    return Win32DynamicFfi.invoke("icuuc.dll", "utext_getPreviousNativeIndex", longArrayOf(ut))
}

public fun utext_hasMetaData(ut: Long): Byte {
    return Win32DynamicFfi.invoke("icuuc.dll", "utext_hasMetaData", longArrayOf(ut)).toByte()
}

public fun utext_isLengthExpensive(ut: Long): Byte {
    return Win32DynamicFfi.invoke("icuuc.dll", "utext_isLengthExpensive", longArrayOf(ut)).toByte()
}

public fun utext_isWritable(ut: Long): Byte {
    return Win32DynamicFfi.invoke("icuuc.dll", "utext_isWritable", longArrayOf(ut)).toByte()
}

public fun utext_moveIndex32(ut: Long, delta: Int): Byte {
    return Win32DynamicFfi.invoke("icuuc.dll", "utext_moveIndex32", longArrayOf(ut, delta.toLong())).toByte()
}

public fun utext_nativeLength(ut: Long): Long {
    return Win32DynamicFfi.invoke("icuuc.dll", "utext_nativeLength", longArrayOf(ut))
}

public fun utext_next32(ut: Long): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "utext_next32", longArrayOf(ut)).toInt()
}

public fun utext_next32From(ut: Long, nativeindex: Long): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "utext_next32From", longArrayOf(ut, nativeindex)).toInt()
}

public fun utext_openUChars(ut: Long, s: Long, length: Long, status: Long): Long {
    return Win32DynamicFfi.invoke("icuuc.dll", "utext_openUChars", longArrayOf(ut, s, length, status))
}

public fun utext_openUTF8(ut: Long, s: PCSTR, length: Long, status: Long): Long {
    return Win32DynamicFfi.invoke("icuuc.dll", "utext_openUTF8", longArrayOf(ut, s, length, status))
}

public fun utext_previous32(ut: Long): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "utext_previous32", longArrayOf(ut)).toInt()
}

public fun utext_previous32From(ut: Long, nativeindex: Long): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "utext_previous32From", longArrayOf(ut, nativeindex)).toInt()
}

public fun utext_replace(ut: Long, nativestart: Long, nativelimit: Long, replacementtext: Long, replacementlength: Int, status: Long): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "utext_replace", longArrayOf(ut, nativestart, nativelimit, replacementtext, replacementlength.toLong(), status)).toInt()
}

public fun utext_setNativeIndex(ut: Long, nativeindex: Long) {
    Win32DynamicFfi.invoke("icuuc.dll", "utext_setNativeIndex", longArrayOf(ut, nativeindex))
}

public fun utext_setup(ut: Long, extraspace: Int, status: Long): Long {
    return Win32DynamicFfi.invoke("icuuc.dll", "utext_setup", longArrayOf(ut, extraspace.toLong(), status))
}

public fun utf8_appendCharSafeBody(s: Long, i: Int, length: Int, c: Int, piserror: Long): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "utf8_appendCharSafeBody", longArrayOf(s, i.toLong(), length.toLong(), c.toLong(), piserror)).toInt()
}

public fun utf8_back1SafeBody(s: Long, start: Int, i: Int): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "utf8_back1SafeBody", longArrayOf(s, start.toLong(), i.toLong())).toInt()
}

public fun utf8_nextCharSafeBody(s: Long, pi: Long, length: Int, c: Int, strict: Byte): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "utf8_nextCharSafeBody", longArrayOf(s, pi, length.toLong(), c.toLong(), strict.toLong())).toInt()
}

public fun utf8_prevCharSafeBody(s: Long, start: Int, pi: Long, c: Int, strict: Byte): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "utf8_prevCharSafeBody", longArrayOf(s, start.toLong(), pi, c.toLong(), strict.toLong())).toInt()
}

public fun utmscale_fromInt64(othertime: Long, timescale: UDateTimeScale, status: Long): Long {
    return Win32DynamicFfi.invoke("icuin.dll", "utmscale_fromInt64", longArrayOf(othertime, timescale.toLong(), status))
}

public fun utmscale_getTimeScaleValue(timescale: UDateTimeScale, value: UTimeScaleValue, status: Long): Long {
    return Win32DynamicFfi.invoke("icuin.dll", "utmscale_getTimeScaleValue", longArrayOf(timescale.toLong(), value.toLong(), status))
}

public fun utmscale_toInt64(universaltime: Long, timescale: UDateTimeScale, status: Long): Long {
    return Win32DynamicFfi.invoke("icuin.dll", "utmscale_toInt64", longArrayOf(universaltime, timescale.toLong(), status))
}

public fun utrace_format(outbuf: PCSTR, capacity: Int, indent: Int, fmt: PCSTR, vararg variadicArgs: Long): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "utrace_format", longArrayOf(outbuf, capacity.toLong(), indent.toLong(), fmt) + variadicArgs).toInt()
}

public fun utrace_functionName(fnnumber: Int): PCSTR {
    return Win32DynamicFfi.invoke("icuuc.dll", "utrace_functionName", longArrayOf(fnnumber.toLong()))
}

public fun utrace_getFunctions(context: Long, e: Long, x: Long, d: Long) {
    Win32DynamicFfi.invoke("icuuc.dll", "utrace_getFunctions", longArrayOf(context, e, x, d))
}

public fun utrace_getLevel(): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "utrace_getLevel", longArrayOf()).toInt()
}

public fun utrace_setFunctions(context: Long, e: UTraceEntry, x: UTraceExit, d: UTraceData) {
    Win32DynamicFfi.invoke("icuuc.dll", "utrace_setFunctions", longArrayOf(context, Win32DynamicFfi.objectSlot(e), Win32DynamicFfi.objectSlot(x), Win32DynamicFfi.objectSlot(d)))
}

public fun utrace_setLevel(tracelevel: Int) {
    Win32DynamicFfi.invoke("icuuc.dll", "utrace_setLevel", longArrayOf(tracelevel.toLong()))
}

public fun utrace_vformat(outbuf: PCSTR, capacity: Int, indent: Int, fmt: PCSTR, args: Long): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "utrace_vformat", longArrayOf(outbuf, capacity.toLong(), indent.toLong(), fmt, args)).toInt()
}

public fun utrans_clone(trans: Long, status: Long): Long {
    return Win32DynamicFfi.invoke("icuin.dll", "utrans_clone", longArrayOf(trans, status))
}

public fun utrans_close(trans: Long) {
    Win32DynamicFfi.invoke("icuin.dll", "utrans_close", longArrayOf(trans))
}

public fun utrans_countAvailableIDs(): Int {
    return Win32DynamicFfi.invoke("icuin.dll", "utrans_countAvailableIDs", longArrayOf()).toInt()
}

public fun utrans_getSourceSet(trans: Long, ignorefilter: Byte, fillin: Long, status: Long): Long {
    return Win32DynamicFfi.invoke("icuin.dll", "utrans_getSourceSet", longArrayOf(trans, ignorefilter.toLong(), fillin, status))
}

public fun utrans_getUnicodeID(trans: Long, resultlength: Long): Long {
    return Win32DynamicFfi.invoke("icuin.dll", "utrans_getUnicodeID", longArrayOf(trans, resultlength))
}

public fun utrans_openIDs(perrorcode: Long): Long {
    return Win32DynamicFfi.invoke("icuin.dll", "utrans_openIDs", longArrayOf(perrorcode))
}

public fun utrans_openInverse(trans: Long, status: Long): Long {
    return Win32DynamicFfi.invoke("icuin.dll", "utrans_openInverse", longArrayOf(trans, status))
}

public fun utrans_openU(id: Long, idlength: Int, dir: UTransDirection, rules: Long, ruleslength: Int, parseerror: Long, perrorcode: Long): Long {
    return Win32DynamicFfi.invoke("icuin.dll", "utrans_openU", longArrayOf(id, idlength.toLong(), dir.toLong(), rules, ruleslength.toLong(), parseerror, perrorcode))
}

public fun utrans_register(adoptedtrans: Long, status: Long) {
    Win32DynamicFfi.invoke("icuin.dll", "utrans_register", longArrayOf(adoptedtrans, status))
}

public fun utrans_setFilter(trans: Long, filterpattern: Long, filterpatternlen: Int, status: Long) {
    Win32DynamicFfi.invoke("icuin.dll", "utrans_setFilter", longArrayOf(trans, filterpattern, filterpatternlen.toLong(), status))
}

public fun utrans_toRules(trans: Long, escapeunprintable: Byte, result: Long, resultlength: Int, status: Long): Int {
    return Win32DynamicFfi.invoke("icuin.dll", "utrans_toRules", longArrayOf(trans, escapeunprintable.toLong(), result, resultlength.toLong(), status)).toInt()
}

public fun utrans_trans(trans: Long, rep: Long, repfunc: Long, start: Int, limit: Long, status: Long) {
    Win32DynamicFfi.invoke("icuin.dll", "utrans_trans", longArrayOf(trans, rep, repfunc, start.toLong(), limit, status))
}

public fun utrans_transIncremental(trans: Long, rep: Long, repfunc: Long, pos: Long, status: Long) {
    Win32DynamicFfi.invoke("icuin.dll", "utrans_transIncremental", longArrayOf(trans, rep, repfunc, pos, status))
}

public fun utrans_transIncrementalUChars(trans: Long, text: Long, textlength: Long, textcapacity: Int, pos: Long, status: Long) {
    Win32DynamicFfi.invoke("icuin.dll", "utrans_transIncrementalUChars", longArrayOf(trans, text, textlength, textcapacity.toLong(), pos, status))
}

public fun utrans_transUChars(trans: Long, text: Long, textlength: Long, textcapacity: Int, start: Int, limit: Long, status: Long) {
    Win32DynamicFfi.invoke("icuin.dll", "utrans_transUChars", longArrayOf(trans, text, textlength, textcapacity.toLong(), start.toLong(), limit, status))
}

public fun utrans_unregisterID(id: Long, idlength: Int) {
    Win32DynamicFfi.invoke("icuin.dll", "utrans_unregisterID", longArrayOf(id, idlength.toLong()))
}
