package io.github.kotlinmania.windowssys.windows.win32.globalization

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Pcstr

public expect fun uregionGetPreferredValues(uregion: ConstPtr, status: MutPtr): MutPtr

public expect fun uregionGetRegionCode(uregion: ConstPtr): Pcstr

public expect fun uregionGetRegionFromCode(regioncode: Pcstr, status: MutPtr): MutPtr

public expect fun uregionGetRegionFromNumericCode(code: Int, status: MutPtr): MutPtr

public expect fun uregionGetType(uregion: ConstPtr): URegionType

public expect fun ureldatefmtClose(reldatefmt: MutPtr)

public expect fun ureldatefmtCloseResult(ufrdt: MutPtr)

public expect fun ureldatefmtCombineDateAndTime(reldatefmt: ConstPtr, relativedatestring: ConstPtr, relativedatestringlen: Int, timestring: ConstPtr, timestringlen: Int, result: MutPtr, resultcapacity: Int, status: MutPtr): Int

public expect fun ureldatefmtFormat(reldatefmt: ConstPtr, offset: Double, unit: URelativeDateTimeUnit, result: MutPtr, resultcapacity: Int, status: MutPtr): Int

public expect fun ureldatefmtFormatNumeric(reldatefmt: ConstPtr, offset: Double, unit: URelativeDateTimeUnit, result: MutPtr, resultcapacity: Int, status: MutPtr): Int

public expect fun ureldatefmtFormatNumericToResult(reldatefmt: ConstPtr, offset: Double, unit: URelativeDateTimeUnit, result: MutPtr, status: MutPtr)

public expect fun ureldatefmtFormatToResult(reldatefmt: ConstPtr, offset: Double, unit: URelativeDateTimeUnit, result: MutPtr, status: MutPtr)

public expect fun ureldatefmtOpen(locale: Pcstr, nftoadopt: MutPtr, width: UDateRelativeDateTimeFormatterStyle, capitalizationcontext: UDisplayContext, status: MutPtr): MutPtr

public expect fun ureldatefmtOpenResult(ec: MutPtr): MutPtr

public expect fun ureldatefmtResultAsValue(ufrdt: ConstPtr, ec: MutPtr): MutPtr

public expect fun uresClose(resourcebundle: MutPtr)

public expect fun uresGetBinary(resourcebundle: ConstPtr, len: MutPtr, status: MutPtr): MutPtr

public expect fun uresGetByIndex(resourcebundle: ConstPtr, indexr: Int, fillin: MutPtr, status: MutPtr): MutPtr

public expect fun uresGetByKey(resourcebundle: ConstPtr, key: Pcstr, fillin: MutPtr, status: MutPtr): MutPtr

public expect fun uresGetInt(resourcebundle: ConstPtr, status: MutPtr): Int

public expect fun uresGetIntVector(resourcebundle: ConstPtr, len: MutPtr, status: MutPtr): MutPtr

public expect fun uresGetKey(resourcebundle: ConstPtr): Pcstr

public expect fun uresGetLocaleByType(resourcebundle: ConstPtr, type: ULocDataLocaleType, status: MutPtr): Pcstr

public expect fun uresGetNextResource(resourcebundle: MutPtr, fillin: MutPtr, status: MutPtr): MutPtr

public expect fun uresGetNextString(resourcebundle: MutPtr, len: MutPtr, key: ConstPtr, status: MutPtr): MutPtr

public expect fun uresGetSize(resourcebundle: ConstPtr): Int

public expect fun uresGetString(resourcebundle: ConstPtr, len: MutPtr, status: MutPtr): MutPtr

public expect fun uresGetStringByIndex(resourcebundle: ConstPtr, indexs: Int, len: MutPtr, status: MutPtr): MutPtr

public expect fun uresGetStringByKey(resb: ConstPtr, key: Pcstr, len: MutPtr, status: MutPtr): MutPtr

public expect fun uresGetType(resourcebundle: ConstPtr): UResType

public expect fun uresGetUint(resourcebundle: ConstPtr, status: MutPtr): UInt

public expect fun uresGetUtf8String(resb: ConstPtr, dest: Pcstr, length: MutPtr, forcecopy: Byte, status: MutPtr): Pcstr

public expect fun uresGetUtf8StringByIndex(resb: ConstPtr, stringindex: Int, dest: Pcstr, plength: MutPtr, forcecopy: Byte, status: MutPtr): Pcstr

public expect fun uresGetUtf8StringByKey(resb: ConstPtr, key: Pcstr, dest: Pcstr, plength: MutPtr, forcecopy: Byte, status: MutPtr): Pcstr

public expect fun uresGetVersion(resb: ConstPtr, versioninfo: MutPtr)

public expect fun uresHasNext(resourcebundle: ConstPtr): Byte

public expect fun uresOpen(packagename: Pcstr, locale: Pcstr, status: MutPtr): MutPtr

public expect fun uresOpenAvailableLocales(packagename: Pcstr, status: MutPtr): MutPtr

public expect fun uresOpenDirect(packagename: Pcstr, locale: Pcstr, status: MutPtr): MutPtr

public expect fun uresOpenU(packagename: ConstPtr, locale: Pcstr, status: MutPtr): MutPtr

public expect fun uresResetIterator(resourcebundle: MutPtr)

public expect fun uscriptBreaksBetweenLetters(script: UScriptCode): Byte

public expect fun uscriptGetCode(nameorabbrorlocale: Pcstr, fillin: MutPtr, capacity: Int, err: MutPtr): Int

public expect fun uscriptGetName(scriptcode: UScriptCode): Pcstr

public expect fun uscriptGetSampleString(script: UScriptCode, dest: MutPtr, capacity: Int, perrorcode: MutPtr): Int

public expect fun uscriptGetScript(codepoint: Int, err: MutPtr): UScriptCode

public expect fun uscriptGetScriptExtensions(c: Int, scripts: MutPtr, capacity: Int, errorcode: MutPtr): Int

public expect fun uscriptGetShortName(scriptcode: UScriptCode): Pcstr

public expect fun uscriptGetUsage(script: UScriptCode): UScriptUsage

public expect fun uscriptHasScript(c: Int, sc: UScriptCode): Byte

public expect fun uscriptIsCased(script: UScriptCode): Byte

public expect fun uscriptIsRightToLeft(script: UScriptCode): Byte

public expect fun usearchClose(searchiter: MutPtr)

public expect fun usearchFirst(strsrch: MutPtr, status: MutPtr): Int

public expect fun usearchFollowing(strsrch: MutPtr, position: Int, status: MutPtr): Int

public expect fun usearchGetAttribute(strsrch: ConstPtr, attribute: USearchAttribute): USearchAttributeValue

public expect fun usearchGetBreakIterator(strsrch: ConstPtr): MutPtr

public expect fun usearchGetCollator(strsrch: ConstPtr): MutPtr

public expect fun usearchGetMatchedLength(strsrch: ConstPtr): Int

public expect fun usearchGetMatchedStart(strsrch: ConstPtr): Int

public expect fun usearchGetMatchedText(strsrch: ConstPtr, result: MutPtr, resultcapacity: Int, status: MutPtr): Int

public expect fun usearchGetOffset(strsrch: ConstPtr): Int

public expect fun usearchGetPattern(strsrch: ConstPtr, length: MutPtr): MutPtr

public expect fun usearchGetText(strsrch: ConstPtr, length: MutPtr): MutPtr

public expect fun usearchLast(strsrch: MutPtr, status: MutPtr): Int

public expect fun usearchNext(strsrch: MutPtr, status: MutPtr): Int

public expect fun usearchOpen(pattern: ConstPtr, patternlength: Int, text: ConstPtr, textlength: Int, locale: Pcstr, breakiter: MutPtr, status: MutPtr): MutPtr

public expect fun usearchOpenFromCollator(pattern: ConstPtr, patternlength: Int, text: ConstPtr, textlength: Int, collator: ConstPtr, breakiter: MutPtr, status: MutPtr): MutPtr

public expect fun usearchPreceding(strsrch: MutPtr, position: Int, status: MutPtr): Int

public expect fun usearchPrevious(strsrch: MutPtr, status: MutPtr): Int

public expect fun usearchReset(strsrch: MutPtr)

public expect fun usearchSetAttribute(strsrch: MutPtr, attribute: USearchAttribute, value: USearchAttributeValue, status: MutPtr)

public expect fun usearchSetBreakIterator(strsrch: MutPtr, breakiter: MutPtr, status: MutPtr)

public expect fun usearchSetCollator(strsrch: MutPtr, collator: ConstPtr, status: MutPtr)

public expect fun usearchSetOffset(strsrch: MutPtr, position: Int, status: MutPtr)

public expect fun usearchSetPattern(strsrch: MutPtr, pattern: ConstPtr, patternlength: Int, status: MutPtr)

public expect fun usearchSetText(strsrch: MutPtr, text: ConstPtr, textlength: Int, status: MutPtr)

public expect fun usetAdd(set: MutPtr, c: Int)

public expect fun usetAddAll(set: MutPtr, additionalset: ConstPtr)

public expect fun usetAddAllCodePoints(set: MutPtr, str: ConstPtr, strlen: Int)

public expect fun usetAddRange(set: MutPtr, start: Int, end: Int)

public expect fun usetAddString(set: MutPtr, str: ConstPtr, strlen: Int)

public expect fun usetApplyIntPropertyValue(set: MutPtr, prop: UProperty, value: Int, ec: MutPtr)

public expect fun usetApplyPattern(set: MutPtr, pattern: ConstPtr, patternlength: Int, options: UInt, status: MutPtr): Int

public expect fun usetApplyPropertyAlias(set: MutPtr, prop: ConstPtr, proplength: Int, value: ConstPtr, valuelength: Int, ec: MutPtr)

public expect fun usetCharAt(set: ConstPtr, charindex: Int): Int

public expect fun usetClear(set: MutPtr)

public expect fun usetClone(set: ConstPtr): MutPtr

public expect fun usetCloneAsThawed(set: ConstPtr): MutPtr

public expect fun usetClose(set: MutPtr)

public expect fun usetCloseOver(set: MutPtr, attributes: Int)

public expect fun usetCompact(set: MutPtr)

public expect fun usetComplement(set: MutPtr)

public expect fun usetComplementAll(set: MutPtr, complement: ConstPtr)

public expect fun usetContains(set: ConstPtr, c: Int): Byte

public expect fun usetContainsAll(set1: ConstPtr, set2: ConstPtr): Byte

public expect fun usetContainsAllCodePoints(set: ConstPtr, str: ConstPtr, strlen: Int): Byte

public expect fun usetContainsNone(set1: ConstPtr, set2: ConstPtr): Byte

public expect fun usetContainsRange(set: ConstPtr, start: Int, end: Int): Byte

public expect fun usetContainsSome(set1: ConstPtr, set2: ConstPtr): Byte

public expect fun usetContainsString(set: ConstPtr, str: ConstPtr, strlen: Int): Byte

public expect fun usetEquals(set1: ConstPtr, set2: ConstPtr): Byte

public expect fun usetFreeze(set: MutPtr)

public expect fun usetGetItem(set: ConstPtr, itemindex: Int, start: MutPtr, end: MutPtr, str: MutPtr, strcapacity: Int, ec: MutPtr): Int

public expect fun usetGetItemCount(set: ConstPtr): Int

public expect fun usetGetSerializedRange(set: ConstPtr, rangeindex: Int, pstart: MutPtr, pend: MutPtr): Byte

public expect fun usetGetSerializedRangeCount(set: ConstPtr): Int

public expect fun usetGetSerializedSet(fillset: MutPtr, src: ConstPtr, srclength: Int): Byte

public expect fun usetIndexOf(set: ConstPtr, c: Int): Int

public expect fun usetIsEmpty(set: ConstPtr): Byte

public expect fun usetIsFrozen(set: ConstPtr): Byte

public expect fun usetOpen(start: Int, end: Int): MutPtr

public expect fun usetOpenEmpty(): MutPtr

public expect fun usetOpenPattern(pattern: ConstPtr, patternlength: Int, ec: MutPtr): MutPtr

public expect fun usetOpenPatternOptions(pattern: ConstPtr, patternlength: Int, options: UInt, ec: MutPtr): MutPtr

public expect fun usetRemove(set: MutPtr, c: Int)

public expect fun usetRemoveAll(set: MutPtr, removeset: ConstPtr)

public expect fun usetRemoveAllStrings(set: MutPtr)

public expect fun usetRemoveRange(set: MutPtr, start: Int, end: Int)

public expect fun usetRemoveString(set: MutPtr, str: ConstPtr, strlen: Int)

public expect fun usetResemblesPattern(pattern: ConstPtr, patternlength: Int, pos: Int): Byte

public expect fun usetRetain(set: MutPtr, start: Int, end: Int)

public expect fun usetRetainAll(set: MutPtr, retain: ConstPtr)

public expect fun usetSerialize(set: ConstPtr, dest: MutPtr, destcapacity: Int, perrorcode: MutPtr): Int

public expect fun usetSerializedContains(set: ConstPtr, c: Int): Byte

public expect fun usetSet(set: MutPtr, start: Int, end: Int)

public expect fun usetSetSerializedToOne(fillset: MutPtr, c: Int)

public expect fun usetSize(set: ConstPtr): Int

public expect fun usetSpan(set: ConstPtr, s: ConstPtr, length: Int, spancondition: USetSpanCondition): Int

public expect fun usetSpanBack(set: ConstPtr, s: ConstPtr, length: Int, spancondition: USetSpanCondition): Int

public expect fun usetSpanBackUtf8(set: ConstPtr, s: Pcstr, length: Int, spancondition: USetSpanCondition): Int

public expect fun usetSpanUtf8(set: ConstPtr, s: Pcstr, length: Int, spancondition: USetSpanCondition): Int

public expect fun usetToPattern(set: ConstPtr, result: MutPtr, resultcapacity: Int, escapeunprintable: Byte, ec: MutPtr): Int

public expect fun uspoofAreConfusable(sc: ConstPtr, id1: ConstPtr, length1: Int, id2: ConstPtr, length2: Int, status: MutPtr): Int

public expect fun uspoofAreConfusableUtf8(sc: ConstPtr, id1: Pcstr, length1: Int, id2: Pcstr, length2: Int, status: MutPtr): Int

public expect fun uspoofCheck(sc: ConstPtr, id: ConstPtr, length: Int, position: MutPtr, status: MutPtr): Int

public expect fun uspoofCheck2(sc: ConstPtr, id: ConstPtr, length: Int, checkresult: MutPtr, status: MutPtr): Int

public expect fun uspoofCheck2Utf8(sc: ConstPtr, id: Pcstr, length: Int, checkresult: MutPtr, status: MutPtr): Int

public expect fun uspoofCheckUtf8(sc: ConstPtr, id: Pcstr, length: Int, position: MutPtr, status: MutPtr): Int

public expect fun uspoofClone(sc: ConstPtr, status: MutPtr): MutPtr

public expect fun uspoofClose(sc: MutPtr)

public expect fun uspoofCloseCheckResult(checkresult: MutPtr)

public expect fun uspoofGetAllowedChars(sc: ConstPtr, status: MutPtr): MutPtr

public expect fun uspoofGetAllowedLocales(sc: MutPtr, status: MutPtr): Pcstr

public expect fun uspoofGetCheckResultChecks(checkresult: ConstPtr, status: MutPtr): Int

public expect fun uspoofGetCheckResultNumerics(checkresult: ConstPtr, status: MutPtr): MutPtr

public expect fun uspoofGetCheckResultRestrictionLevel(checkresult: ConstPtr, status: MutPtr): URestrictionLevel

public expect fun uspoofGetChecks(sc: ConstPtr, status: MutPtr): Int

public expect fun uspoofGetInclusionSet(status: MutPtr): MutPtr

public expect fun uspoofGetRecommendedSet(status: MutPtr): MutPtr

public expect fun uspoofGetRestrictionLevel(sc: ConstPtr): URestrictionLevel

public expect fun uspoofGetSkeleton(sc: ConstPtr, type: UInt, id: ConstPtr, length: Int, dest: MutPtr, destcapacity: Int, status: MutPtr): Int

public expect fun uspoofGetSkeletonUtf8(sc: ConstPtr, type: UInt, id: Pcstr, length: Int, dest: Pcstr, destcapacity: Int, status: MutPtr): Int

public expect fun uspoofOpen(status: MutPtr): MutPtr

public expect fun uspoofOpenCheckResult(status: MutPtr): MutPtr

public expect fun uspoofOpenFromSerialized(data: ConstPtr, length: Int, pactuallength: MutPtr, perrorcode: MutPtr): MutPtr

public expect fun uspoofOpenFromSource(confusables: Pcstr, confusableslen: Int, confusableswholescript: Pcstr, confusableswholescriptlen: Int, errtype: MutPtr, pe: MutPtr, status: MutPtr): MutPtr

public expect fun uspoofSerialize(sc: MutPtr, data: MutPtr, capacity: Int, status: MutPtr): Int

public expect fun uspoofSetAllowedChars(sc: MutPtr, chars: ConstPtr, status: MutPtr)

public expect fun uspoofSetAllowedLocales(sc: MutPtr, localeslist: Pcstr, status: MutPtr)

public expect fun uspoofSetChecks(sc: MutPtr, checks: Int, status: MutPtr)

public expect fun uspoofSetRestrictionLevel(sc: MutPtr, restrictionlevel: URestrictionLevel)

public expect fun usprepClose(profile: MutPtr)

public expect fun usprepOpen(path: Pcstr, filename: Pcstr, status: MutPtr): MutPtr

public expect fun usprepOpenByType(type: UStringPrepProfileType, status: MutPtr): MutPtr

public expect fun usprepPrepare(prep: ConstPtr, src: ConstPtr, srclength: Int, dest: MutPtr, destcapacity: Int, options: Int, parseerror: MutPtr, status: MutPtr): Int

public expect fun utextChar32At(ut: MutPtr, nativeindex: Long): Int

public expect fun utextClone(dest: MutPtr, src: ConstPtr, deep: Byte, readonly: Byte, status: MutPtr): MutPtr

public expect fun utextClose(ut: MutPtr): MutPtr

public expect fun utextCopy(ut: MutPtr, nativestart: Long, nativelimit: Long, destindex: Long, move: Byte, status: MutPtr)

public expect fun utextCurrent32(ut: MutPtr): Int

public expect fun utextEquals(a: ConstPtr, b: ConstPtr): Byte

public expect fun utextExtract(ut: MutPtr, nativestart: Long, nativelimit: Long, dest: MutPtr, destcapacity: Int, status: MutPtr): Int

public expect fun utextFreeze(ut: MutPtr)

public expect fun utextGetNativeIndex(ut: ConstPtr): Long

public expect fun utextGetPreviousNativeIndex(ut: MutPtr): Long

public expect fun utextHasMetaData(ut: ConstPtr): Byte

public expect fun utextIsLengthExpensive(ut: ConstPtr): Byte

public expect fun utextIsWritable(ut: ConstPtr): Byte

public expect fun utextMoveIndex32(ut: MutPtr, delta: Int): Byte

public expect fun utextNativeLength(ut: MutPtr): Long

public expect fun utextNext32(ut: MutPtr): Int

public expect fun utextNext32From(ut: MutPtr, nativeindex: Long): Int

public expect fun utextOpenUchars(ut: MutPtr, s: ConstPtr, length: Long, status: MutPtr): MutPtr

public expect fun utextOpenUtf8(ut: MutPtr, s: Pcstr, length: Long, status: MutPtr): MutPtr

public expect fun utextPrevious32(ut: MutPtr): Int

public expect fun utextPrevious32From(ut: MutPtr, nativeindex: Long): Int

public expect fun utextReplace(ut: MutPtr, nativestart: Long, nativelimit: Long, replacementtext: ConstPtr, replacementlength: Int, status: MutPtr): Int

public expect fun utextSetNativeIndex(ut: MutPtr, nativeindex: Long)

public expect fun utextSetup(ut: MutPtr, extraspace: Int, status: MutPtr): MutPtr

public expect fun utf8AppendCharSafeBody(s: MutPtr, i: Int, length: Int, c: Int, piserror: MutPtr): Int

public expect fun utf8Back1SafeBody(s: ConstPtr, start: Int, i: Int): Int

public expect fun utf8NextCharSafeBody(s: ConstPtr, pi: MutPtr, length: Int, c: Int, strict: Byte): Int

public expect fun utf8PrevCharSafeBody(s: ConstPtr, start: Int, pi: MutPtr, c: Int, strict: Byte): Int

public expect fun utmscaleFromInt64(othertime: Long, timescale: UDateTimeScale, status: MutPtr): Long

public expect fun utmscaleGetTimeScaleValue(timescale: UDateTimeScale, value: UTimeScaleValue, status: MutPtr): Long

public expect fun utmscaleToInt64(universaltime: Long, timescale: UDateTimeScale, status: MutPtr): Long

public expect fun utraceFormat(outbuf: Pcstr, capacity: Int, indent: Int, fmt: Pcstr, vararg variadicArgs: Long): Int

public expect fun utraceFunctionName(fnnumber: Int): Pcstr

public expect fun utraceGetFunctions(context: ConstPtr, e: MutPtr, x: MutPtr, d: MutPtr)

public expect fun utraceGetLevel(): Int

public expect fun utraceSetFunctions(context: ConstPtr, e: UTraceEntry, x: UTraceExit, d: UTraceData)

public expect fun utraceSetLevel(tracelevel: Int)

public expect fun utraceVformat(outbuf: Pcstr, capacity: Int, indent: Int, fmt: Pcstr, args: MutPtr): Int

public expect fun utransClone(trans: ConstPtr, status: MutPtr): MutPtr

public expect fun utransClose(trans: MutPtr)

public expect fun utransCountAvailableIds(): Int

public expect fun utransGetSourceSet(trans: ConstPtr, ignorefilter: Byte, fillin: MutPtr, status: MutPtr): MutPtr

public expect fun utransGetUnicodeId(trans: ConstPtr, resultlength: MutPtr): MutPtr

public expect fun utransOpenIds(perrorcode: MutPtr): MutPtr

public expect fun utransOpenInverse(trans: ConstPtr, status: MutPtr): MutPtr

public expect fun utransOpenU(id: ConstPtr, idlength: Int, dir: UTransDirection, rules: ConstPtr, ruleslength: Int, parseerror: MutPtr, perrorcode: MutPtr): MutPtr

public expect fun utransRegister(adoptedtrans: MutPtr, status: MutPtr)

public expect fun utransSetFilter(trans: MutPtr, filterpattern: ConstPtr, filterpatternlen: Int, status: MutPtr)

public expect fun utransToRules(trans: ConstPtr, escapeunprintable: Byte, result: MutPtr, resultlength: Int, status: MutPtr): Int

public expect fun utransTrans(trans: ConstPtr, rep: MutPtr, repfunc: ConstPtr, start: Int, limit: MutPtr, status: MutPtr)

public expect fun utransTransIncremental(trans: ConstPtr, rep: MutPtr, repfunc: ConstPtr, pos: MutPtr, status: MutPtr)

public expect fun utransTransIncrementalUchars(trans: ConstPtr, text: MutPtr, textlength: MutPtr, textcapacity: Int, pos: MutPtr, status: MutPtr)

public expect fun utransTransUchars(trans: ConstPtr, text: MutPtr, textlength: MutPtr, textcapacity: Int, start: Int, limit: MutPtr, status: MutPtr)

public expect fun utransUnregisterId(id: ConstPtr, idlength: Int)
