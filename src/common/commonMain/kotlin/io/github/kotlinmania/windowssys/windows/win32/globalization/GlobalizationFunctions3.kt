package io.github.kotlinmania.windowssys.windows.win32.globalization

import io.github.kotlinmania.windowssys.core.PCSTR

public expect fun uregion_getPreferredValues(uregion: Long, status: Long): Long

public expect fun uregion_getRegionCode(uregion: Long): PCSTR

public expect fun uregion_getRegionFromCode(regioncode: PCSTR, status: Long): Long

public expect fun uregion_getRegionFromNumericCode(code: Int, status: Long): Long

public expect fun uregion_getType(uregion: Long): URegionType

public expect fun ureldatefmt_close(reldatefmt: Long)

public expect fun ureldatefmt_closeResult(ufrdt: Long)

public expect fun ureldatefmt_combineDateAndTime(reldatefmt: Long, relativedatestring: Long, relativedatestringlen: Int, timestring: Long, timestringlen: Int, result: Long, resultcapacity: Int, status: Long): Int

public expect fun ureldatefmt_format(reldatefmt: Long, offset: Double, unit: URelativeDateTimeUnit, result: Long, resultcapacity: Int, status: Long): Int

public expect fun ureldatefmt_formatNumeric(reldatefmt: Long, offset: Double, unit: URelativeDateTimeUnit, result: Long, resultcapacity: Int, status: Long): Int

public expect fun ureldatefmt_formatNumericToResult(reldatefmt: Long, offset: Double, unit: URelativeDateTimeUnit, result: Long, status: Long)

public expect fun ureldatefmt_formatToResult(reldatefmt: Long, offset: Double, unit: URelativeDateTimeUnit, result: Long, status: Long)

public expect fun ureldatefmt_open(locale: PCSTR, nftoadopt: Long, width: UDateRelativeDateTimeFormatterStyle, capitalizationcontext: UDisplayContext, status: Long): Long

public expect fun ureldatefmt_openResult(ec: Long): Long

public expect fun ureldatefmt_resultAsValue(ufrdt: Long, ec: Long): Long

public expect fun ures_close(resourcebundle: Long)

public expect fun ures_getBinary(resourcebundle: Long, len: Long, status: Long): Long

public expect fun ures_getByIndex(resourcebundle: Long, indexr: Int, fillin: Long, status: Long): Long

public expect fun ures_getByKey(resourcebundle: Long, key: PCSTR, fillin: Long, status: Long): Long

public expect fun ures_getInt(resourcebundle: Long, status: Long): Int

public expect fun ures_getIntVector(resourcebundle: Long, len: Long, status: Long): Long

public expect fun ures_getKey(resourcebundle: Long): PCSTR

public expect fun ures_getLocaleByType(resourcebundle: Long, type: ULocDataLocaleType, status: Long): PCSTR

public expect fun ures_getNextResource(resourcebundle: Long, fillin: Long, status: Long): Long

public expect fun ures_getNextString(resourcebundle: Long, len: Long, key: Long, status: Long): Long

public expect fun ures_getSize(resourcebundle: Long): Int

public expect fun ures_getString(resourcebundle: Long, len: Long, status: Long): Long

public expect fun ures_getStringByIndex(resourcebundle: Long, indexs: Int, len: Long, status: Long): Long

public expect fun ures_getStringByKey(resb: Long, key: PCSTR, len: Long, status: Long): Long

public expect fun ures_getType(resourcebundle: Long): UResType

public expect fun ures_getUInt(resourcebundle: Long, status: Long): UInt

public expect fun ures_getUTF8String(resb: Long, dest: PCSTR, length: Long, forcecopy: Byte, status: Long): PCSTR

public expect fun ures_getUTF8StringByIndex(resb: Long, stringindex: Int, dest: PCSTR, plength: Long, forcecopy: Byte, status: Long): PCSTR

public expect fun ures_getUTF8StringByKey(resb: Long, key: PCSTR, dest: PCSTR, plength: Long, forcecopy: Byte, status: Long): PCSTR

public expect fun ures_getVersion(resb: Long, versioninfo: Long)

public expect fun ures_hasNext(resourcebundle: Long): Byte

public expect fun ures_open(packagename: PCSTR, locale: PCSTR, status: Long): Long

public expect fun ures_openAvailableLocales(packagename: PCSTR, status: Long): Long

public expect fun ures_openDirect(packagename: PCSTR, locale: PCSTR, status: Long): Long

public expect fun ures_openU(packagename: Long, locale: PCSTR, status: Long): Long

public expect fun ures_resetIterator(resourcebundle: Long)

public expect fun uscript_breaksBetweenLetters(script: UScriptCode): Byte

public expect fun uscript_getCode(nameorabbrorlocale: PCSTR, fillin: Long, capacity: Int, err: Long): Int

public expect fun uscript_getName(scriptcode: UScriptCode): PCSTR

public expect fun uscript_getSampleString(script: UScriptCode, dest: Long, capacity: Int, perrorcode: Long): Int

public expect fun uscript_getScript(codepoint: Int, err: Long): UScriptCode

public expect fun uscript_getScriptExtensions(c: Int, scripts: Long, capacity: Int, errorcode: Long): Int

public expect fun uscript_getShortName(scriptcode: UScriptCode): PCSTR

public expect fun uscript_getUsage(script: UScriptCode): UScriptUsage

public expect fun uscript_hasScript(c: Int, sc: UScriptCode): Byte

public expect fun uscript_isCased(script: UScriptCode): Byte

public expect fun uscript_isRightToLeft(script: UScriptCode): Byte

public expect fun usearch_close(searchiter: Long)

public expect fun usearch_first(strsrch: Long, status: Long): Int

public expect fun usearch_following(strsrch: Long, position: Int, status: Long): Int

public expect fun usearch_getAttribute(strsrch: Long, attribute: USearchAttribute): USearchAttributeValue

public expect fun usearch_getBreakIterator(strsrch: Long): Long

public expect fun usearch_getCollator(strsrch: Long): Long

public expect fun usearch_getMatchedLength(strsrch: Long): Int

public expect fun usearch_getMatchedStart(strsrch: Long): Int

public expect fun usearch_getMatchedText(strsrch: Long, result: Long, resultcapacity: Int, status: Long): Int

public expect fun usearch_getOffset(strsrch: Long): Int

public expect fun usearch_getPattern(strsrch: Long, length: Long): Long

public expect fun usearch_getText(strsrch: Long, length: Long): Long

public expect fun usearch_last(strsrch: Long, status: Long): Int

public expect fun usearch_next(strsrch: Long, status: Long): Int

public expect fun usearch_open(pattern: Long, patternlength: Int, text: Long, textlength: Int, locale: PCSTR, breakiter: Long, status: Long): Long

public expect fun usearch_openFromCollator(pattern: Long, patternlength: Int, text: Long, textlength: Int, collator: Long, breakiter: Long, status: Long): Long

public expect fun usearch_preceding(strsrch: Long, position: Int, status: Long): Int

public expect fun usearch_previous(strsrch: Long, status: Long): Int

public expect fun usearch_reset(strsrch: Long)

public expect fun usearch_setAttribute(strsrch: Long, attribute: USearchAttribute, value: USearchAttributeValue, status: Long)

public expect fun usearch_setBreakIterator(strsrch: Long, breakiter: Long, status: Long)

public expect fun usearch_setCollator(strsrch: Long, collator: Long, status: Long)

public expect fun usearch_setOffset(strsrch: Long, position: Int, status: Long)

public expect fun usearch_setPattern(strsrch: Long, pattern: Long, patternlength: Int, status: Long)

public expect fun usearch_setText(strsrch: Long, text: Long, textlength: Int, status: Long)

public expect fun uset_add(set: Long, c: Int)

public expect fun uset_addAll(set: Long, additionalset: Long)

public expect fun uset_addAllCodePoints(set: Long, str: Long, strlen: Int)

public expect fun uset_addRange(set: Long, start: Int, end: Int)

public expect fun uset_addString(set: Long, str: Long, strlen: Int)

public expect fun uset_applyIntPropertyValue(set: Long, prop: UProperty, value: Int, ec: Long)

public expect fun uset_applyPattern(set: Long, pattern: Long, patternlength: Int, options: UInt, status: Long): Int

public expect fun uset_applyPropertyAlias(set: Long, prop: Long, proplength: Int, value: Long, valuelength: Int, ec: Long)

public expect fun uset_charAt(set: Long, charindex: Int): Int

public expect fun uset_clear(set: Long)

public expect fun uset_clone(set: Long): Long

public expect fun uset_cloneAsThawed(set: Long): Long

public expect fun uset_close(set: Long)

public expect fun uset_closeOver(set: Long, attributes: Int)

public expect fun uset_compact(set: Long)

public expect fun uset_complement(set: Long)

public expect fun uset_complementAll(set: Long, complement: Long)

public expect fun uset_contains(set: Long, c: Int): Byte

public expect fun uset_containsAll(set1: Long, set2: Long): Byte

public expect fun uset_containsAllCodePoints(set: Long, str: Long, strlen: Int): Byte

public expect fun uset_containsNone(set1: Long, set2: Long): Byte

public expect fun uset_containsRange(set: Long, start: Int, end: Int): Byte

public expect fun uset_containsSome(set1: Long, set2: Long): Byte

public expect fun uset_containsString(set: Long, str: Long, strlen: Int): Byte

public expect fun uset_equals(set1: Long, set2: Long): Byte

public expect fun uset_freeze(set: Long)

public expect fun uset_getItem(set: Long, itemindex: Int, start: Long, end: Long, str: Long, strcapacity: Int, ec: Long): Int

public expect fun uset_getItemCount(set: Long): Int

public expect fun uset_getSerializedRange(set: Long, rangeindex: Int, pstart: Long, pend: Long): Byte

public expect fun uset_getSerializedRangeCount(set: Long): Int

public expect fun uset_getSerializedSet(fillset: Long, src: Long, srclength: Int): Byte

public expect fun uset_indexOf(set: Long, c: Int): Int

public expect fun uset_isEmpty(set: Long): Byte

public expect fun uset_isFrozen(set: Long): Byte

public expect fun uset_open(start: Int, end: Int): Long

public expect fun uset_openEmpty(): Long

public expect fun uset_openPattern(pattern: Long, patternlength: Int, ec: Long): Long

public expect fun uset_openPatternOptions(pattern: Long, patternlength: Int, options: UInt, ec: Long): Long

public expect fun uset_remove(set: Long, c: Int)

public expect fun uset_removeAll(set: Long, removeset: Long)

public expect fun uset_removeAllStrings(set: Long)

public expect fun uset_removeRange(set: Long, start: Int, end: Int)

public expect fun uset_removeString(set: Long, str: Long, strlen: Int)

public expect fun uset_resemblesPattern(pattern: Long, patternlength: Int, pos: Int): Byte

public expect fun uset_retain(set: Long, start: Int, end: Int)

public expect fun uset_retainAll(set: Long, retain: Long)

public expect fun uset_serialize(set: Long, dest: Long, destcapacity: Int, perrorcode: Long): Int

public expect fun uset_serializedContains(set: Long, c: Int): Byte

public expect fun uset_set(set: Long, start: Int, end: Int)

public expect fun uset_setSerializedToOne(fillset: Long, c: Int)

public expect fun uset_size(set: Long): Int

public expect fun uset_span(set: Long, s: Long, length: Int, spancondition: USetSpanCondition): Int

public expect fun uset_spanBack(set: Long, s: Long, length: Int, spancondition: USetSpanCondition): Int

public expect fun uset_spanBackUTF8(set: Long, s: PCSTR, length: Int, spancondition: USetSpanCondition): Int

public expect fun uset_spanUTF8(set: Long, s: PCSTR, length: Int, spancondition: USetSpanCondition): Int

public expect fun uset_toPattern(set: Long, result: Long, resultcapacity: Int, escapeunprintable: Byte, ec: Long): Int

public expect fun uspoof_areConfusable(sc: Long, id1: Long, length1: Int, id2: Long, length2: Int, status: Long): Int

public expect fun uspoof_areConfusableUTF8(sc: Long, id1: PCSTR, length1: Int, id2: PCSTR, length2: Int, status: Long): Int

public expect fun uspoof_check(sc: Long, id: Long, length: Int, position: Long, status: Long): Int

public expect fun uspoof_check2(sc: Long, id: Long, length: Int, checkresult: Long, status: Long): Int

public expect fun uspoof_check2UTF8(sc: Long, id: PCSTR, length: Int, checkresult: Long, status: Long): Int

public expect fun uspoof_checkUTF8(sc: Long, id: PCSTR, length: Int, position: Long, status: Long): Int

public expect fun uspoof_clone(sc: Long, status: Long): Long

public expect fun uspoof_close(sc: Long)

public expect fun uspoof_closeCheckResult(checkresult: Long)

public expect fun uspoof_getAllowedChars(sc: Long, status: Long): Long

public expect fun uspoof_getAllowedLocales(sc: Long, status: Long): PCSTR

public expect fun uspoof_getCheckResultChecks(checkresult: Long, status: Long): Int

public expect fun uspoof_getCheckResultNumerics(checkresult: Long, status: Long): Long

public expect fun uspoof_getCheckResultRestrictionLevel(checkresult: Long, status: Long): URestrictionLevel

public expect fun uspoof_getChecks(sc: Long, status: Long): Int

public expect fun uspoof_getInclusionSet(status: Long): Long

public expect fun uspoof_getRecommendedSet(status: Long): Long

public expect fun uspoof_getRestrictionLevel(sc: Long): URestrictionLevel

public expect fun uspoof_getSkeleton(sc: Long, type: UInt, id: Long, length: Int, dest: Long, destcapacity: Int, status: Long): Int

public expect fun uspoof_getSkeletonUTF8(sc: Long, type: UInt, id: PCSTR, length: Int, dest: PCSTR, destcapacity: Int, status: Long): Int

public expect fun uspoof_open(status: Long): Long

public expect fun uspoof_openCheckResult(status: Long): Long

public expect fun uspoof_openFromSerialized(data: Long, length: Int, pactuallength: Long, perrorcode: Long): Long

public expect fun uspoof_openFromSource(confusables: PCSTR, confusableslen: Int, confusableswholescript: PCSTR, confusableswholescriptlen: Int, errtype: Long, pe: Long, status: Long): Long

public expect fun uspoof_serialize(sc: Long, data: Long, capacity: Int, status: Long): Int

public expect fun uspoof_setAllowedChars(sc: Long, chars: Long, status: Long)

public expect fun uspoof_setAllowedLocales(sc: Long, localeslist: PCSTR, status: Long)

public expect fun uspoof_setChecks(sc: Long, checks: Int, status: Long)

public expect fun uspoof_setRestrictionLevel(sc: Long, restrictionlevel: URestrictionLevel)

public expect fun usprep_close(profile: Long)

public expect fun usprep_open(path: PCSTR, filename: PCSTR, status: Long): Long

public expect fun usprep_openByType(type: UStringPrepProfileType, status: Long): Long

public expect fun usprep_prepare(prep: Long, src: Long, srclength: Int, dest: Long, destcapacity: Int, options: Int, parseerror: Long, status: Long): Int

public expect fun utext_char32At(ut: Long, nativeindex: Long): Int

public expect fun utext_clone(dest: Long, src: Long, deep: Byte, readonly: Byte, status: Long): Long

public expect fun utext_close(ut: Long): Long

public expect fun utext_copy(ut: Long, nativestart: Long, nativelimit: Long, destindex: Long, move: Byte, status: Long)

public expect fun utext_current32(ut: Long): Int

public expect fun utext_equals(a: Long, b: Long): Byte

public expect fun utext_extract(ut: Long, nativestart: Long, nativelimit: Long, dest: Long, destcapacity: Int, status: Long): Int

public expect fun utext_freeze(ut: Long)

public expect fun utext_getNativeIndex(ut: Long): Long

public expect fun utext_getPreviousNativeIndex(ut: Long): Long

public expect fun utext_hasMetaData(ut: Long): Byte

public expect fun utext_isLengthExpensive(ut: Long): Byte

public expect fun utext_isWritable(ut: Long): Byte

public expect fun utext_moveIndex32(ut: Long, delta: Int): Byte

public expect fun utext_nativeLength(ut: Long): Long

public expect fun utext_next32(ut: Long): Int

public expect fun utext_next32From(ut: Long, nativeindex: Long): Int

public expect fun utext_openUChars(ut: Long, s: Long, length: Long, status: Long): Long

public expect fun utext_openUTF8(ut: Long, s: PCSTR, length: Long, status: Long): Long

public expect fun utext_previous32(ut: Long): Int

public expect fun utext_previous32From(ut: Long, nativeindex: Long): Int

public expect fun utext_replace(ut: Long, nativestart: Long, nativelimit: Long, replacementtext: Long, replacementlength: Int, status: Long): Int

public expect fun utext_setNativeIndex(ut: Long, nativeindex: Long)

public expect fun utext_setup(ut: Long, extraspace: Int, status: Long): Long

public expect fun utf8_appendCharSafeBody(s: Long, i: Int, length: Int, c: Int, piserror: Long): Int

public expect fun utf8_back1SafeBody(s: Long, start: Int, i: Int): Int

public expect fun utf8_nextCharSafeBody(s: Long, pi: Long, length: Int, c: Int, strict: Byte): Int

public expect fun utf8_prevCharSafeBody(s: Long, start: Int, pi: Long, c: Int, strict: Byte): Int

public expect fun utmscale_fromInt64(othertime: Long, timescale: UDateTimeScale, status: Long): Long

public expect fun utmscale_getTimeScaleValue(timescale: UDateTimeScale, value: UTimeScaleValue, status: Long): Long

public expect fun utmscale_toInt64(universaltime: Long, timescale: UDateTimeScale, status: Long): Long

public expect fun utrace_format(outbuf: PCSTR, capacity: Int, indent: Int, fmt: PCSTR, vararg variadicArgs: Long): Int

public expect fun utrace_functionName(fnnumber: Int): PCSTR

public expect fun utrace_getFunctions(context: Long, e: Long, x: Long, d: Long)

public expect fun utrace_getLevel(): Int

public expect fun utrace_setFunctions(context: Long, e: UTraceEntry, x: UTraceExit, d: UTraceData)

public expect fun utrace_setLevel(tracelevel: Int)

public expect fun utrace_vformat(outbuf: PCSTR, capacity: Int, indent: Int, fmt: PCSTR, args: Long): Int

public expect fun utrans_clone(trans: Long, status: Long): Long

public expect fun utrans_close(trans: Long)

public expect fun utrans_countAvailableIDs(): Int

public expect fun utrans_getSourceSet(trans: Long, ignorefilter: Byte, fillin: Long, status: Long): Long

public expect fun utrans_getUnicodeID(trans: Long, resultlength: Long): Long

public expect fun utrans_openIDs(perrorcode: Long): Long

public expect fun utrans_openInverse(trans: Long, status: Long): Long

public expect fun utrans_openU(id: Long, idlength: Int, dir: UTransDirection, rules: Long, ruleslength: Int, parseerror: Long, perrorcode: Long): Long

public expect fun utrans_register(adoptedtrans: Long, status: Long)

public expect fun utrans_setFilter(trans: Long, filterpattern: Long, filterpatternlen: Int, status: Long)

public expect fun utrans_toRules(trans: Long, escapeunprintable: Byte, result: Long, resultlength: Int, status: Long): Int

public expect fun utrans_trans(trans: Long, rep: Long, repfunc: Long, start: Int, limit: Long, status: Long)

public expect fun utrans_transIncremental(trans: Long, rep: Long, repfunc: Long, pos: Long, status: Long)

public expect fun utrans_transIncrementalUChars(trans: Long, text: Long, textlength: Long, textcapacity: Int, pos: Long, status: Long)

public expect fun utrans_transUChars(trans: Long, text: Long, textlength: Long, textcapacity: Int, start: Int, limit: Long, status: Long)

public expect fun utrans_unregisterID(id: Long, idlength: Int)
