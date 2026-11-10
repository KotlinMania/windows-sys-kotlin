package io.github.kotlinmania.windowssys.windows.win32.globalization

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Pcstr

public expect fun uregionGetPreferredValues(uregion: COpaquePointer?, status: COpaquePointer?): COpaquePointer?

public expect fun uregionGetRegionCode(uregion: COpaquePointer?): Pcstr

public expect fun uregionGetRegionFromCode(regioncode: Pcstr, status: COpaquePointer?): COpaquePointer?

public expect fun uregionGetRegionFromNumericCode(code: Int, status: COpaquePointer?): COpaquePointer?

public expect fun uregionGetType(uregion: COpaquePointer?): URegionType

public expect fun ureldatefmtClose(reldatefmt: COpaquePointer?)

public expect fun ureldatefmtCloseResult(ufrdt: COpaquePointer?)

public expect fun ureldatefmtCombineDateAndTime(reldatefmt: COpaquePointer?, relativedatestring: COpaquePointer?, relativedatestringlen: Int, timestring: COpaquePointer?, timestringlen: Int, result: COpaquePointer?, resultcapacity: Int, status: COpaquePointer?): Int

public expect fun ureldatefmtFormat(reldatefmt: COpaquePointer?, offset: Double, unit: URelativeDateTimeUnit, result: COpaquePointer?, resultcapacity: Int, status: COpaquePointer?): Int

public expect fun ureldatefmtFormatNumeric(reldatefmt: COpaquePointer?, offset: Double, unit: URelativeDateTimeUnit, result: COpaquePointer?, resultcapacity: Int, status: COpaquePointer?): Int

public expect fun ureldatefmtFormatNumericToResult(reldatefmt: COpaquePointer?, offset: Double, unit: URelativeDateTimeUnit, result: COpaquePointer?, status: COpaquePointer?)

public expect fun ureldatefmtFormatToResult(reldatefmt: COpaquePointer?, offset: Double, unit: URelativeDateTimeUnit, result: COpaquePointer?, status: COpaquePointer?)

public expect fun ureldatefmtOpen(locale: Pcstr, nftoadopt: COpaquePointer?, width: UDateRelativeDateTimeFormatterStyle, capitalizationcontext: UDisplayContext, status: COpaquePointer?): COpaquePointer?

public expect fun ureldatefmtOpenResult(ec: COpaquePointer?): COpaquePointer?

public expect fun ureldatefmtResultAsValue(ufrdt: COpaquePointer?, ec: COpaquePointer?): COpaquePointer?

public expect fun uresClose(resourcebundle: COpaquePointer?)

public expect fun uresGetBinary(resourcebundle: COpaquePointer?, len: COpaquePointer?, status: COpaquePointer?): COpaquePointer?

public expect fun uresGetByIndex(resourcebundle: COpaquePointer?, indexr: Int, fillin: COpaquePointer?, status: COpaquePointer?): COpaquePointer?

public expect fun uresGetByKey(resourcebundle: COpaquePointer?, key: Pcstr, fillin: COpaquePointer?, status: COpaquePointer?): COpaquePointer?

public expect fun uresGetInt(resourcebundle: COpaquePointer?, status: COpaquePointer?): Int

public expect fun uresGetIntVector(resourcebundle: COpaquePointer?, len: COpaquePointer?, status: COpaquePointer?): COpaquePointer?

public expect fun uresGetKey(resourcebundle: COpaquePointer?): Pcstr

public expect fun uresGetLocaleByType(resourcebundle: COpaquePointer?, type: ULocDataLocaleType, status: COpaquePointer?): Pcstr

public expect fun uresGetNextResource(resourcebundle: COpaquePointer?, fillin: COpaquePointer?, status: COpaquePointer?): COpaquePointer?

public expect fun uresGetNextString(resourcebundle: COpaquePointer?, len: COpaquePointer?, key: COpaquePointer?, status: COpaquePointer?): COpaquePointer?

public expect fun uresGetSize(resourcebundle: COpaquePointer?): Int

public expect fun uresGetString(resourcebundle: COpaquePointer?, len: COpaquePointer?, status: COpaquePointer?): COpaquePointer?

public expect fun uresGetStringByIndex(resourcebundle: COpaquePointer?, indexs: Int, len: COpaquePointer?, status: COpaquePointer?): COpaquePointer?

public expect fun uresGetStringByKey(resb: COpaquePointer?, key: Pcstr, len: COpaquePointer?, status: COpaquePointer?): COpaquePointer?

public expect fun uresGetType(resourcebundle: COpaquePointer?): UResType

public expect fun uresGetUint(resourcebundle: COpaquePointer?, status: COpaquePointer?): UInt

public expect fun uresGetUtf8String(resb: COpaquePointer?, dest: Pcstr, length: COpaquePointer?, forcecopy: Byte, status: COpaquePointer?): Pcstr

public expect fun uresGetUtf8StringByIndex(resb: COpaquePointer?, stringindex: Int, dest: Pcstr, plength: COpaquePointer?, forcecopy: Byte, status: COpaquePointer?): Pcstr

public expect fun uresGetUtf8StringByKey(resb: COpaquePointer?, key: Pcstr, dest: Pcstr, plength: COpaquePointer?, forcecopy: Byte, status: COpaquePointer?): Pcstr

public expect fun uresGetVersion(resb: COpaquePointer?, versioninfo: COpaquePointer?)

public expect fun uresHasNext(resourcebundle: COpaquePointer?): Byte

public expect fun uresOpen(packagename: Pcstr, locale: Pcstr, status: COpaquePointer?): COpaquePointer?

public expect fun uresOpenAvailableLocales(packagename: Pcstr, status: COpaquePointer?): COpaquePointer?

public expect fun uresOpenDirect(packagename: Pcstr, locale: Pcstr, status: COpaquePointer?): COpaquePointer?

public expect fun uresOpenU(packagename: COpaquePointer?, locale: Pcstr, status: COpaquePointer?): COpaquePointer?

public expect fun uresResetIterator(resourcebundle: COpaquePointer?)

public expect fun uscriptBreaksBetweenLetters(script: UScriptCode): Byte

public expect fun uscriptGetCode(nameorabbrorlocale: Pcstr, fillin: COpaquePointer?, capacity: Int, err: COpaquePointer?): Int

public expect fun uscriptGetName(scriptcode: UScriptCode): Pcstr

public expect fun uscriptGetSampleString(script: UScriptCode, dest: COpaquePointer?, capacity: Int, perrorcode: COpaquePointer?): Int

public expect fun uscriptGetScript(codepoint: Int, err: COpaquePointer?): UScriptCode

public expect fun uscriptGetScriptExtensions(c: Int, scripts: COpaquePointer?, capacity: Int, errorcode: COpaquePointer?): Int

public expect fun uscriptGetShortName(scriptcode: UScriptCode): Pcstr

public expect fun uscriptGetUsage(script: UScriptCode): UScriptUsage

public expect fun uscriptHasScript(c: Int, sc: UScriptCode): Byte

public expect fun uscriptIsCased(script: UScriptCode): Byte

public expect fun uscriptIsRightToLeft(script: UScriptCode): Byte

public expect fun usearchClose(searchiter: COpaquePointer?)

public expect fun usearchFirst(strsrch: COpaquePointer?, status: COpaquePointer?): Int

public expect fun usearchFollowing(strsrch: COpaquePointer?, position: Int, status: COpaquePointer?): Int

public expect fun usearchGetAttribute(strsrch: COpaquePointer?, attribute: USearchAttribute): USearchAttributeValue

public expect fun usearchGetBreakIterator(strsrch: COpaquePointer?): COpaquePointer?

public expect fun usearchGetCollator(strsrch: COpaquePointer?): COpaquePointer?

public expect fun usearchGetMatchedLength(strsrch: COpaquePointer?): Int

public expect fun usearchGetMatchedStart(strsrch: COpaquePointer?): Int

public expect fun usearchGetMatchedText(strsrch: COpaquePointer?, result: COpaquePointer?, resultcapacity: Int, status: COpaquePointer?): Int

public expect fun usearchGetOffset(strsrch: COpaquePointer?): Int

public expect fun usearchGetPattern(strsrch: COpaquePointer?, length: COpaquePointer?): COpaquePointer?

public expect fun usearchGetText(strsrch: COpaquePointer?, length: COpaquePointer?): COpaquePointer?

public expect fun usearchLast(strsrch: COpaquePointer?, status: COpaquePointer?): Int

public expect fun usearchNext(strsrch: COpaquePointer?, status: COpaquePointer?): Int

public expect fun usearchOpen(pattern: COpaquePointer?, patternlength: Int, text: COpaquePointer?, textlength: Int, locale: Pcstr, breakiter: COpaquePointer?, status: COpaquePointer?): COpaquePointer?

public expect fun usearchOpenFromCollator(pattern: COpaquePointer?, patternlength: Int, text: COpaquePointer?, textlength: Int, collator: COpaquePointer?, breakiter: COpaquePointer?, status: COpaquePointer?): COpaquePointer?

public expect fun usearchPreceding(strsrch: COpaquePointer?, position: Int, status: COpaquePointer?): Int

public expect fun usearchPrevious(strsrch: COpaquePointer?, status: COpaquePointer?): Int

public expect fun usearchReset(strsrch: COpaquePointer?)

public expect fun usearchSetAttribute(strsrch: COpaquePointer?, attribute: USearchAttribute, value: USearchAttributeValue, status: COpaquePointer?)

public expect fun usearchSetBreakIterator(strsrch: COpaquePointer?, breakiter: COpaquePointer?, status: COpaquePointer?)

public expect fun usearchSetCollator(strsrch: COpaquePointer?, collator: COpaquePointer?, status: COpaquePointer?)

public expect fun usearchSetOffset(strsrch: COpaquePointer?, position: Int, status: COpaquePointer?)

public expect fun usearchSetPattern(strsrch: COpaquePointer?, pattern: COpaquePointer?, patternlength: Int, status: COpaquePointer?)

public expect fun usearchSetText(strsrch: COpaquePointer?, text: COpaquePointer?, textlength: Int, status: COpaquePointer?)

public expect fun usetAdd(set: COpaquePointer?, c: Int)

public expect fun usetAddAll(set: COpaquePointer?, additionalset: COpaquePointer?)

public expect fun usetAddAllCodePoints(set: COpaquePointer?, str: COpaquePointer?, strlen: Int)

public expect fun usetAddRange(set: COpaquePointer?, start: Int, end: Int)

public expect fun usetAddString(set: COpaquePointer?, str: COpaquePointer?, strlen: Int)

public expect fun usetApplyIntPropertyValue(set: COpaquePointer?, prop: UProperty, value: Int, ec: COpaquePointer?)

public expect fun usetApplyPattern(set: COpaquePointer?, pattern: COpaquePointer?, patternlength: Int, options: UInt, status: COpaquePointer?): Int

public expect fun usetApplyPropertyAlias(set: COpaquePointer?, prop: COpaquePointer?, proplength: Int, value: COpaquePointer?, valuelength: Int, ec: COpaquePointer?)

public expect fun usetCharAt(set: COpaquePointer?, charindex: Int): Int

public expect fun usetClear(set: COpaquePointer?)

public expect fun usetClone(set: COpaquePointer?): COpaquePointer?

public expect fun usetCloneAsThawed(set: COpaquePointer?): COpaquePointer?

public expect fun usetClose(set: COpaquePointer?)

public expect fun usetCloseOver(set: COpaquePointer?, attributes: Int)

public expect fun usetCompact(set: COpaquePointer?)

public expect fun usetComplement(set: COpaquePointer?)

public expect fun usetComplementAll(set: COpaquePointer?, complement: COpaquePointer?)

public expect fun usetContains(set: COpaquePointer?, c: Int): Byte

public expect fun usetContainsAll(set1: COpaquePointer?, set2: COpaquePointer?): Byte

public expect fun usetContainsAllCodePoints(set: COpaquePointer?, str: COpaquePointer?, strlen: Int): Byte

public expect fun usetContainsNone(set1: COpaquePointer?, set2: COpaquePointer?): Byte

public expect fun usetContainsRange(set: COpaquePointer?, start: Int, end: Int): Byte

public expect fun usetContainsSome(set1: COpaquePointer?, set2: COpaquePointer?): Byte

public expect fun usetContainsString(set: COpaquePointer?, str: COpaquePointer?, strlen: Int): Byte

public expect fun usetEquals(set1: COpaquePointer?, set2: COpaquePointer?): Byte

public expect fun usetFreeze(set: COpaquePointer?)

public expect fun usetGetItem(set: COpaquePointer?, itemindex: Int, start: COpaquePointer?, end: COpaquePointer?, str: COpaquePointer?, strcapacity: Int, ec: COpaquePointer?): Int

public expect fun usetGetItemCount(set: COpaquePointer?): Int

public expect fun usetGetSerializedRange(set: COpaquePointer?, rangeindex: Int, pstart: COpaquePointer?, pend: COpaquePointer?): Byte

public expect fun usetGetSerializedRangeCount(set: COpaquePointer?): Int

public expect fun usetGetSerializedSet(fillset: COpaquePointer?, src: COpaquePointer?, srclength: Int): Byte

public expect fun usetIndexOf(set: COpaquePointer?, c: Int): Int

public expect fun usetIsEmpty(set: COpaquePointer?): Byte

public expect fun usetIsFrozen(set: COpaquePointer?): Byte

public expect fun usetOpen(start: Int, end: Int): COpaquePointer?

public expect fun usetOpenEmpty(): COpaquePointer?

public expect fun usetOpenPattern(pattern: COpaquePointer?, patternlength: Int, ec: COpaquePointer?): COpaquePointer?

public expect fun usetOpenPatternOptions(pattern: COpaquePointer?, patternlength: Int, options: UInt, ec: COpaquePointer?): COpaquePointer?

public expect fun usetRemove(set: COpaquePointer?, c: Int)

public expect fun usetRemoveAll(set: COpaquePointer?, removeset: COpaquePointer?)

public expect fun usetRemoveAllStrings(set: COpaquePointer?)

public expect fun usetRemoveRange(set: COpaquePointer?, start: Int, end: Int)

public expect fun usetRemoveString(set: COpaquePointer?, str: COpaquePointer?, strlen: Int)

public expect fun usetResemblesPattern(pattern: COpaquePointer?, patternlength: Int, pos: Int): Byte

public expect fun usetRetain(set: COpaquePointer?, start: Int, end: Int)

public expect fun usetRetainAll(set: COpaquePointer?, retain: COpaquePointer?)

public expect fun usetSerialize(set: COpaquePointer?, dest: COpaquePointer?, destcapacity: Int, perrorcode: COpaquePointer?): Int

public expect fun usetSerializedContains(set: COpaquePointer?, c: Int): Byte

public expect fun usetSet(set: COpaquePointer?, start: Int, end: Int)

public expect fun usetSetSerializedToOne(fillset: COpaquePointer?, c: Int)

public expect fun usetSize(set: COpaquePointer?): Int

public expect fun usetSpan(set: COpaquePointer?, s: COpaquePointer?, length: Int, spancondition: USetSpanCondition): Int

public expect fun usetSpanBack(set: COpaquePointer?, s: COpaquePointer?, length: Int, spancondition: USetSpanCondition): Int

public expect fun usetSpanBackUtf8(set: COpaquePointer?, s: Pcstr, length: Int, spancondition: USetSpanCondition): Int

public expect fun usetSpanUtf8(set: COpaquePointer?, s: Pcstr, length: Int, spancondition: USetSpanCondition): Int

public expect fun usetToPattern(set: COpaquePointer?, result: COpaquePointer?, resultcapacity: Int, escapeunprintable: Byte, ec: COpaquePointer?): Int

public expect fun uspoofAreConfusable(sc: COpaquePointer?, id1: COpaquePointer?, length1: Int, id2: COpaquePointer?, length2: Int, status: COpaquePointer?): Int

public expect fun uspoofAreConfusableUtf8(sc: COpaquePointer?, id1: Pcstr, length1: Int, id2: Pcstr, length2: Int, status: COpaquePointer?): Int

public expect fun uspoofCheck(sc: COpaquePointer?, id: COpaquePointer?, length: Int, position: COpaquePointer?, status: COpaquePointer?): Int

public expect fun uspoofCheck2(sc: COpaquePointer?, id: COpaquePointer?, length: Int, checkresult: COpaquePointer?, status: COpaquePointer?): Int

public expect fun uspoofCheck2Utf8(sc: COpaquePointer?, id: Pcstr, length: Int, checkresult: COpaquePointer?, status: COpaquePointer?): Int

public expect fun uspoofCheckUtf8(sc: COpaquePointer?, id: Pcstr, length: Int, position: COpaquePointer?, status: COpaquePointer?): Int

public expect fun uspoofClone(sc: COpaquePointer?, status: COpaquePointer?): COpaquePointer?

public expect fun uspoofClose(sc: COpaquePointer?)

public expect fun uspoofCloseCheckResult(checkresult: COpaquePointer?)

public expect fun uspoofGetAllowedChars(sc: COpaquePointer?, status: COpaquePointer?): COpaquePointer?

public expect fun uspoofGetAllowedLocales(sc: COpaquePointer?, status: COpaquePointer?): Pcstr

public expect fun uspoofGetCheckResultChecks(checkresult: COpaquePointer?, status: COpaquePointer?): Int

public expect fun uspoofGetCheckResultNumerics(checkresult: COpaquePointer?, status: COpaquePointer?): COpaquePointer?

public expect fun uspoofGetCheckResultRestrictionLevel(checkresult: COpaquePointer?, status: COpaquePointer?): URestrictionLevel

public expect fun uspoofGetChecks(sc: COpaquePointer?, status: COpaquePointer?): Int

public expect fun uspoofGetInclusionSet(status: COpaquePointer?): COpaquePointer?

public expect fun uspoofGetRecommendedSet(status: COpaquePointer?): COpaquePointer?

public expect fun uspoofGetRestrictionLevel(sc: COpaquePointer?): URestrictionLevel

public expect fun uspoofGetSkeleton(sc: COpaquePointer?, type: UInt, id: COpaquePointer?, length: Int, dest: COpaquePointer?, destcapacity: Int, status: COpaquePointer?): Int

public expect fun uspoofGetSkeletonUtf8(sc: COpaquePointer?, type: UInt, id: Pcstr, length: Int, dest: Pcstr, destcapacity: Int, status: COpaquePointer?): Int

public expect fun uspoofOpen(status: COpaquePointer?): COpaquePointer?

public expect fun uspoofOpenCheckResult(status: COpaquePointer?): COpaquePointer?

public expect fun uspoofOpenFromSerialized(data: COpaquePointer?, length: Int, pactuallength: COpaquePointer?, perrorcode: COpaquePointer?): COpaquePointer?

public expect fun uspoofOpenFromSource(confusables: Pcstr, confusableslen: Int, confusableswholescript: Pcstr, confusableswholescriptlen: Int, errtype: COpaquePointer?, pe: COpaquePointer?, status: COpaquePointer?): COpaquePointer?

public expect fun uspoofSerialize(sc: COpaquePointer?, data: COpaquePointer?, capacity: Int, status: COpaquePointer?): Int

public expect fun uspoofSetAllowedChars(sc: COpaquePointer?, chars: COpaquePointer?, status: COpaquePointer?)

public expect fun uspoofSetAllowedLocales(sc: COpaquePointer?, localeslist: Pcstr, status: COpaquePointer?)

public expect fun uspoofSetChecks(sc: COpaquePointer?, checks: Int, status: COpaquePointer?)

public expect fun uspoofSetRestrictionLevel(sc: COpaquePointer?, restrictionlevel: URestrictionLevel)

public expect fun usprepClose(profile: COpaquePointer?)

public expect fun usprepOpen(path: Pcstr, filename: Pcstr, status: COpaquePointer?): COpaquePointer?

public expect fun usprepOpenByType(type: UStringPrepProfileType, status: COpaquePointer?): COpaquePointer?

public expect fun usprepPrepare(prep: COpaquePointer?, src: COpaquePointer?, srclength: Int, dest: COpaquePointer?, destcapacity: Int, options: Int, parseerror: COpaquePointer?, status: COpaquePointer?): Int

public expect fun utextChar32At(ut: COpaquePointer?, nativeindex: Long): Int

public expect fun utextClone(dest: COpaquePointer?, src: COpaquePointer?, deep: Byte, readonly: Byte, status: COpaquePointer?): COpaquePointer?

public expect fun utextClose(ut: COpaquePointer?): COpaquePointer?

public expect fun utextCopy(ut: COpaquePointer?, nativestart: Long, nativelimit: Long, destindex: Long, move: Byte, status: COpaquePointer?)

public expect fun utextCurrent32(ut: COpaquePointer?): Int

public expect fun utextEquals(a: COpaquePointer?, b: COpaquePointer?): Byte

public expect fun utextExtract(ut: COpaquePointer?, nativestart: Long, nativelimit: Long, dest: COpaquePointer?, destcapacity: Int, status: COpaquePointer?): Int

public expect fun utextFreeze(ut: COpaquePointer?)

public expect fun utextGetNativeIndex(ut: COpaquePointer?): Long

public expect fun utextGetPreviousNativeIndex(ut: COpaquePointer?): Long

public expect fun utextHasMetaData(ut: COpaquePointer?): Byte

public expect fun utextIsLengthExpensive(ut: COpaquePointer?): Byte

public expect fun utextIsWritable(ut: COpaquePointer?): Byte

public expect fun utextMoveIndex32(ut: COpaquePointer?, delta: Int): Byte

public expect fun utextNativeLength(ut: COpaquePointer?): Long

public expect fun utextNext32(ut: COpaquePointer?): Int

public expect fun utextNext32From(ut: COpaquePointer?, nativeindex: Long): Int

public expect fun utextOpenUchars(ut: COpaquePointer?, s: COpaquePointer?, length: Long, status: COpaquePointer?): COpaquePointer?

public expect fun utextOpenUtf8(ut: COpaquePointer?, s: Pcstr, length: Long, status: COpaquePointer?): COpaquePointer?

public expect fun utextPrevious32(ut: COpaquePointer?): Int

public expect fun utextPrevious32From(ut: COpaquePointer?, nativeindex: Long): Int

public expect fun utextReplace(ut: COpaquePointer?, nativestart: Long, nativelimit: Long, replacementtext: COpaquePointer?, replacementlength: Int, status: COpaquePointer?): Int

public expect fun utextSetNativeIndex(ut: COpaquePointer?, nativeindex: Long)

public expect fun utextSetup(ut: COpaquePointer?, extraspace: Int, status: COpaquePointer?): COpaquePointer?

public expect fun utf8AppendCharSafeBody(s: COpaquePointer?, i: Int, length: Int, c: Int, piserror: COpaquePointer?): Int

public expect fun utf8Back1SafeBody(s: COpaquePointer?, start: Int, i: Int): Int

public expect fun utf8NextCharSafeBody(s: COpaquePointer?, pi: COpaquePointer?, length: Int, c: Int, strict: Byte): Int

public expect fun utf8PrevCharSafeBody(s: COpaquePointer?, start: Int, pi: COpaquePointer?, c: Int, strict: Byte): Int

public expect fun utmscaleFromInt64(othertime: Long, timescale: UDateTimeScale, status: COpaquePointer?): Long

public expect fun utmscaleGetTimeScaleValue(timescale: UDateTimeScale, value: UTimeScaleValue, status: COpaquePointer?): Long

public expect fun utmscaleToInt64(universaltime: Long, timescale: UDateTimeScale, status: COpaquePointer?): Long

public expect fun utraceFormat(outbuf: Pcstr, capacity: Int, indent: Int, fmt: Pcstr, vararg variadicArgs: Long): Int

public expect fun utraceFunctionName(fnnumber: Int): Pcstr

public expect fun utraceGetFunctions(context: COpaquePointer?, e: COpaquePointer?, x: COpaquePointer?, d: COpaquePointer?)

public expect fun utraceGetLevel(): Int

public expect fun utraceSetFunctions(context: COpaquePointer?, e: UTraceEntry, x: UTraceExit, d: UTraceData)

public expect fun utraceSetLevel(tracelevel: Int)

public expect fun utraceVformat(outbuf: Pcstr, capacity: Int, indent: Int, fmt: Pcstr, args: COpaquePointer?): Int

public expect fun utransClone(trans: COpaquePointer?, status: COpaquePointer?): COpaquePointer?

public expect fun utransClose(trans: COpaquePointer?)

public expect fun utransCountAvailableIds(): Int

public expect fun utransGetSourceSet(trans: COpaquePointer?, ignorefilter: Byte, fillin: COpaquePointer?, status: COpaquePointer?): COpaquePointer?

public expect fun utransGetUnicodeId(trans: COpaquePointer?, resultlength: COpaquePointer?): COpaquePointer?

public expect fun utransOpenIds(perrorcode: COpaquePointer?): COpaquePointer?

public expect fun utransOpenInverse(trans: COpaquePointer?, status: COpaquePointer?): COpaquePointer?

public expect fun utransOpenU(id: COpaquePointer?, idlength: Int, dir: UTransDirection, rules: COpaquePointer?, ruleslength: Int, parseerror: COpaquePointer?, perrorcode: COpaquePointer?): COpaquePointer?

public expect fun utransRegister(adoptedtrans: COpaquePointer?, status: COpaquePointer?)

public expect fun utransSetFilter(trans: COpaquePointer?, filterpattern: COpaquePointer?, filterpatternlen: Int, status: COpaquePointer?)

public expect fun utransToRules(trans: COpaquePointer?, escapeunprintable: Byte, result: COpaquePointer?, resultlength: Int, status: COpaquePointer?): Int

public expect fun utransTrans(trans: COpaquePointer?, rep: COpaquePointer?, repfunc: COpaquePointer?, start: Int, limit: COpaquePointer?, status: COpaquePointer?)

public expect fun utransTransIncremental(trans: COpaquePointer?, rep: COpaquePointer?, repfunc: COpaquePointer?, pos: COpaquePointer?, status: COpaquePointer?)

public expect fun utransTransIncrementalUchars(trans: COpaquePointer?, text: COpaquePointer?, textlength: COpaquePointer?, textcapacity: Int, pos: COpaquePointer?, status: COpaquePointer?)

public expect fun utransTransUchars(trans: COpaquePointer?, text: COpaquePointer?, textlength: COpaquePointer?, textcapacity: Int, start: Int, limit: COpaquePointer?, status: COpaquePointer?)

public expect fun utransUnregisterId(id: COpaquePointer?, idlength: Int)
