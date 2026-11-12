package io.github.kotlinmania.windowssys.windows.win32.globalization

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Pcstr

public expect fun uregionGetPreferredValues(uregion: ConstPtr<URegion>, status: MutPtr<UErrorCode>): MutPtr<UEnumeration>

public expect fun uregionGetRegionCode(uregion: ConstPtr<URegion>): Pcstr

public expect fun uregionGetRegionFromCode(regioncode: Pcstr, status: MutPtr<UErrorCode>): MutPtr<URegion>

public expect fun uregionGetRegionFromNumericCode(code: Int, status: MutPtr<UErrorCode>): MutPtr<URegion>

public expect fun uregionGetType(uregion: ConstPtr<URegion>): URegionType

public expect fun ureldatefmtClose(reldatefmt: MutPtr<URelativeDateTimeFormatter>)

public expect fun ureldatefmtCloseResult(ufrdt: MutPtr<UFormattedRelativeDateTime>)

public expect fun ureldatefmtCombineDateAndTime(reldatefmt: ConstPtr<URelativeDateTimeFormatter>, relativedatestring: ConstPtr<UShort>, relativedatestringlen: Int, timestring: ConstPtr<UShort>, timestringlen: Int, result: MutPtr<UShort>, resultcapacity: Int, status: MutPtr<UErrorCode>): Int

public expect fun ureldatefmtFormat(reldatefmt: ConstPtr<URelativeDateTimeFormatter>, offset: Double, unit: URelativeDateTimeUnit, result: MutPtr<UShort>, resultcapacity: Int, status: MutPtr<UErrorCode>): Int

public expect fun ureldatefmtFormatNumeric(reldatefmt: ConstPtr<URelativeDateTimeFormatter>, offset: Double, unit: URelativeDateTimeUnit, result: MutPtr<UShort>, resultcapacity: Int, status: MutPtr<UErrorCode>): Int

public expect fun ureldatefmtFormatNumericToResult(reldatefmt: ConstPtr<URelativeDateTimeFormatter>, offset: Double, unit: URelativeDateTimeUnit, result: MutPtr<UFormattedRelativeDateTime>, status: MutPtr<UErrorCode>)

public expect fun ureldatefmtFormatToResult(reldatefmt: ConstPtr<URelativeDateTimeFormatter>, offset: Double, unit: URelativeDateTimeUnit, result: MutPtr<UFormattedRelativeDateTime>, status: MutPtr<UErrorCode>)

public expect fun ureldatefmtOpen(locale: Pcstr, nftoadopt: MutPtr<MutPtr<CVoid>>, width: UDateRelativeDateTimeFormatterStyle, capitalizationcontext: UDisplayContext, status: MutPtr<UErrorCode>): MutPtr<URelativeDateTimeFormatter>

public expect fun ureldatefmtOpenResult(ec: MutPtr<UErrorCode>): MutPtr<UFormattedRelativeDateTime>

public expect fun ureldatefmtResultAsValue(ufrdt: ConstPtr<UFormattedRelativeDateTime>, ec: MutPtr<UErrorCode>): MutPtr<UFormattedValue>

public expect fun uresClose(resourcebundle: MutPtr<UResourceBundle>)

public expect fun uresGetBinary(resourcebundle: ConstPtr<UResourceBundle>, len: MutPtr<Int>, status: MutPtr<UErrorCode>): MutPtr<UByte>

public expect fun uresGetByIndex(resourcebundle: ConstPtr<UResourceBundle>, indexr: Int, fillin: MutPtr<UResourceBundle>, status: MutPtr<UErrorCode>): MutPtr<UResourceBundle>

public expect fun uresGetByKey(resourcebundle: ConstPtr<UResourceBundle>, key: Pcstr, fillin: MutPtr<UResourceBundle>, status: MutPtr<UErrorCode>): MutPtr<UResourceBundle>

public expect fun uresGetInt(resourcebundle: ConstPtr<UResourceBundle>, status: MutPtr<UErrorCode>): Int

public expect fun uresGetIntVector(resourcebundle: ConstPtr<UResourceBundle>, len: MutPtr<Int>, status: MutPtr<UErrorCode>): MutPtr<Int>

public expect fun uresGetKey(resourcebundle: ConstPtr<UResourceBundle>): Pcstr

public expect fun uresGetLocaleByType(resourcebundle: ConstPtr<UResourceBundle>, type: ULocDataLocaleType, status: MutPtr<UErrorCode>): Pcstr

public expect fun uresGetNextResource(resourcebundle: MutPtr<UResourceBundle>, fillin: MutPtr<UResourceBundle>, status: MutPtr<UErrorCode>): MutPtr<UResourceBundle>

public expect fun uresGetNextString(resourcebundle: MutPtr<UResourceBundle>, len: MutPtr<Int>, key: ConstPtr<ConstPtr<Byte>>, status: MutPtr<UErrorCode>): MutPtr<UShort>

public expect fun uresGetSize(resourcebundle: ConstPtr<UResourceBundle>): Int

public expect fun uresGetString(resourcebundle: ConstPtr<UResourceBundle>, len: MutPtr<Int>, status: MutPtr<UErrorCode>): MutPtr<UShort>

public expect fun uresGetStringByIndex(resourcebundle: ConstPtr<UResourceBundle>, indexs: Int, len: MutPtr<Int>, status: MutPtr<UErrorCode>): MutPtr<UShort>

public expect fun uresGetStringByKey(resb: ConstPtr<UResourceBundle>, key: Pcstr, len: MutPtr<Int>, status: MutPtr<UErrorCode>): MutPtr<UShort>

public expect fun uresGetType(resourcebundle: ConstPtr<UResourceBundle>): UResType

public expect fun uresGetUint(resourcebundle: ConstPtr<UResourceBundle>, status: MutPtr<UErrorCode>): UInt

public expect fun uresGetUtf8String(resb: ConstPtr<UResourceBundle>, dest: Pcstr, length: MutPtr<Int>, forcecopy: Byte, status: MutPtr<UErrorCode>): Pcstr

public expect fun uresGetUtf8StringByIndex(resb: ConstPtr<UResourceBundle>, stringindex: Int, dest: Pcstr, plength: MutPtr<Int>, forcecopy: Byte, status: MutPtr<UErrorCode>): Pcstr

public expect fun uresGetUtf8StringByKey(resb: ConstPtr<UResourceBundle>, key: Pcstr, dest: Pcstr, plength: MutPtr<Int>, forcecopy: Byte, status: MutPtr<UErrorCode>): Pcstr

public expect fun uresGetVersion(resb: ConstPtr<UResourceBundle>, versioninfo: MutPtr<UByte>)

public expect fun uresHasNext(resourcebundle: ConstPtr<UResourceBundle>): Byte

public expect fun uresOpen(packagename: Pcstr, locale: Pcstr, status: MutPtr<UErrorCode>): MutPtr<UResourceBundle>

public expect fun uresOpenAvailableLocales(packagename: Pcstr, status: MutPtr<UErrorCode>): MutPtr<UEnumeration>

public expect fun uresOpenDirect(packagename: Pcstr, locale: Pcstr, status: MutPtr<UErrorCode>): MutPtr<UResourceBundle>

public expect fun uresOpenU(packagename: ConstPtr<UShort>, locale: Pcstr, status: MutPtr<UErrorCode>): MutPtr<UResourceBundle>

public expect fun uresResetIterator(resourcebundle: MutPtr<UResourceBundle>)

public expect fun uscriptBreaksBetweenLetters(script: UScriptCode): Byte

public expect fun uscriptGetCode(nameorabbrorlocale: Pcstr, fillin: MutPtr<UScriptCode>, capacity: Int, err: MutPtr<UErrorCode>): Int

public expect fun uscriptGetName(scriptcode: UScriptCode): Pcstr

public expect fun uscriptGetSampleString(script: UScriptCode, dest: MutPtr<UShort>, capacity: Int, perrorcode: MutPtr<UErrorCode>): Int

public expect fun uscriptGetScript(codepoint: Int, err: MutPtr<UErrorCode>): UScriptCode

public expect fun uscriptGetScriptExtensions(c: Int, scripts: MutPtr<UScriptCode>, capacity: Int, errorcode: MutPtr<UErrorCode>): Int

public expect fun uscriptGetShortName(scriptcode: UScriptCode): Pcstr

public expect fun uscriptGetUsage(script: UScriptCode): UScriptUsage

public expect fun uscriptHasScript(c: Int, sc: UScriptCode): Byte

public expect fun uscriptIsCased(script: UScriptCode): Byte

public expect fun uscriptIsRightToLeft(script: UScriptCode): Byte

public expect fun usearchClose(searchiter: MutPtr<UStringSearch>)

public expect fun usearchFirst(strsrch: MutPtr<UStringSearch>, status: MutPtr<UErrorCode>): Int

public expect fun usearchFollowing(strsrch: MutPtr<UStringSearch>, position: Int, status: MutPtr<UErrorCode>): Int

public expect fun usearchGetAttribute(strsrch: ConstPtr<UStringSearch>, attribute: USearchAttribute): USearchAttributeValue

public expect fun usearchGetBreakIterator(strsrch: ConstPtr<UStringSearch>): MutPtr<UBreakIterator>

public expect fun usearchGetCollator(strsrch: ConstPtr<UStringSearch>): MutPtr<UCollator>

public expect fun usearchGetMatchedLength(strsrch: ConstPtr<UStringSearch>): Int

public expect fun usearchGetMatchedStart(strsrch: ConstPtr<UStringSearch>): Int

public expect fun usearchGetMatchedText(strsrch: ConstPtr<UStringSearch>, result: MutPtr<UShort>, resultcapacity: Int, status: MutPtr<UErrorCode>): Int

public expect fun usearchGetOffset(strsrch: ConstPtr<UStringSearch>): Int

public expect fun usearchGetPattern(strsrch: ConstPtr<UStringSearch>, length: MutPtr<Int>): MutPtr<UShort>

public expect fun usearchGetText(strsrch: ConstPtr<UStringSearch>, length: MutPtr<Int>): MutPtr<UShort>

public expect fun usearchLast(strsrch: MutPtr<UStringSearch>, status: MutPtr<UErrorCode>): Int

public expect fun usearchNext(strsrch: MutPtr<UStringSearch>, status: MutPtr<UErrorCode>): Int

public expect fun usearchOpen(pattern: ConstPtr<UShort>, patternlength: Int, text: ConstPtr<UShort>, textlength: Int, locale: Pcstr, breakiter: MutPtr<UBreakIterator>, status: MutPtr<UErrorCode>): MutPtr<UStringSearch>

public expect fun usearchOpenFromCollator(pattern: ConstPtr<UShort>, patternlength: Int, text: ConstPtr<UShort>, textlength: Int, collator: ConstPtr<UCollator>, breakiter: MutPtr<UBreakIterator>, status: MutPtr<UErrorCode>): MutPtr<UStringSearch>

public expect fun usearchPreceding(strsrch: MutPtr<UStringSearch>, position: Int, status: MutPtr<UErrorCode>): Int

public expect fun usearchPrevious(strsrch: MutPtr<UStringSearch>, status: MutPtr<UErrorCode>): Int

public expect fun usearchReset(strsrch: MutPtr<UStringSearch>)

public expect fun usearchSetAttribute(strsrch: MutPtr<UStringSearch>, attribute: USearchAttribute, value: USearchAttributeValue, status: MutPtr<UErrorCode>)

public expect fun usearchSetBreakIterator(strsrch: MutPtr<UStringSearch>, breakiter: MutPtr<UBreakIterator>, status: MutPtr<UErrorCode>)

public expect fun usearchSetCollator(strsrch: MutPtr<UStringSearch>, collator: ConstPtr<UCollator>, status: MutPtr<UErrorCode>)

public expect fun usearchSetOffset(strsrch: MutPtr<UStringSearch>, position: Int, status: MutPtr<UErrorCode>)

public expect fun usearchSetPattern(strsrch: MutPtr<UStringSearch>, pattern: ConstPtr<UShort>, patternlength: Int, status: MutPtr<UErrorCode>)

public expect fun usearchSetText(strsrch: MutPtr<UStringSearch>, text: ConstPtr<UShort>, textlength: Int, status: MutPtr<UErrorCode>)

public expect fun usetAdd(set: MutPtr<USet>, c: Int)

public expect fun usetAddAll(set: MutPtr<USet>, additionalset: ConstPtr<USet>)

public expect fun usetAddAllCodePoints(set: MutPtr<USet>, str: ConstPtr<UShort>, strlen: Int)

public expect fun usetAddRange(set: MutPtr<USet>, start: Int, end: Int)

public expect fun usetAddString(set: MutPtr<USet>, str: ConstPtr<UShort>, strlen: Int)

public expect fun usetApplyIntPropertyValue(set: MutPtr<USet>, prop: UProperty, value: Int, ec: MutPtr<UErrorCode>)

public expect fun usetApplyPattern(set: MutPtr<USet>, pattern: ConstPtr<UShort>, patternlength: Int, options: UInt, status: MutPtr<UErrorCode>): Int

public expect fun usetApplyPropertyAlias(set: MutPtr<USet>, prop: ConstPtr<UShort>, proplength: Int, value: ConstPtr<UShort>, valuelength: Int, ec: MutPtr<UErrorCode>)

public expect fun usetCharAt(set: ConstPtr<USet>, charindex: Int): Int

public expect fun usetClear(set: MutPtr<USet>)

public expect fun usetClone(set: ConstPtr<USet>): MutPtr<USet>

public expect fun usetCloneAsThawed(set: ConstPtr<USet>): MutPtr<USet>

public expect fun usetClose(set: MutPtr<USet>)

public expect fun usetCloseOver(set: MutPtr<USet>, attributes: Int)

public expect fun usetCompact(set: MutPtr<USet>)

public expect fun usetComplement(set: MutPtr<USet>)

public expect fun usetComplementAll(set: MutPtr<USet>, complement: ConstPtr<USet>)

public expect fun usetContains(set: ConstPtr<USet>, c: Int): Byte

public expect fun usetContainsAll(set1: ConstPtr<USet>, set2: ConstPtr<USet>): Byte

public expect fun usetContainsAllCodePoints(set: ConstPtr<USet>, str: ConstPtr<UShort>, strlen: Int): Byte

public expect fun usetContainsNone(set1: ConstPtr<USet>, set2: ConstPtr<USet>): Byte

public expect fun usetContainsRange(set: ConstPtr<USet>, start: Int, end: Int): Byte

public expect fun usetContainsSome(set1: ConstPtr<USet>, set2: ConstPtr<USet>): Byte

public expect fun usetContainsString(set: ConstPtr<USet>, str: ConstPtr<UShort>, strlen: Int): Byte

public expect fun usetEquals(set1: ConstPtr<USet>, set2: ConstPtr<USet>): Byte

public expect fun usetFreeze(set: MutPtr<USet>)

public expect fun usetGetItem(set: ConstPtr<USet>, itemindex: Int, start: MutPtr<Int>, end: MutPtr<Int>, str: MutPtr<UShort>, strcapacity: Int, ec: MutPtr<UErrorCode>): Int

public expect fun usetGetItemCount(set: ConstPtr<USet>): Int

public expect fun usetGetSerializedRange(set: ConstPtr<USerializedSet>, rangeindex: Int, pstart: MutPtr<Int>, pend: MutPtr<Int>): Byte

public expect fun usetGetSerializedRangeCount(set: ConstPtr<USerializedSet>): Int

public expect fun usetGetSerializedSet(fillset: MutPtr<USerializedSet>, src: ConstPtr<UShort>, srclength: Int): Byte

public expect fun usetIndexOf(set: ConstPtr<USet>, c: Int): Int

public expect fun usetIsEmpty(set: ConstPtr<USet>): Byte

public expect fun usetIsFrozen(set: ConstPtr<USet>): Byte

public expect fun usetOpen(start: Int, end: Int): MutPtr<USet>

public expect fun usetOpenEmpty(): MutPtr<USet>

public expect fun usetOpenPattern(pattern: ConstPtr<UShort>, patternlength: Int, ec: MutPtr<UErrorCode>): MutPtr<USet>

public expect fun usetOpenPatternOptions(pattern: ConstPtr<UShort>, patternlength: Int, options: UInt, ec: MutPtr<UErrorCode>): MutPtr<USet>

public expect fun usetRemove(set: MutPtr<USet>, c: Int)

public expect fun usetRemoveAll(set: MutPtr<USet>, removeset: ConstPtr<USet>)

public expect fun usetRemoveAllStrings(set: MutPtr<USet>)

public expect fun usetRemoveRange(set: MutPtr<USet>, start: Int, end: Int)

public expect fun usetRemoveString(set: MutPtr<USet>, str: ConstPtr<UShort>, strlen: Int)

public expect fun usetResemblesPattern(pattern: ConstPtr<UShort>, patternlength: Int, pos: Int): Byte

public expect fun usetRetain(set: MutPtr<USet>, start: Int, end: Int)

public expect fun usetRetainAll(set: MutPtr<USet>, retain: ConstPtr<USet>)

public expect fun usetSerialize(set: ConstPtr<USet>, dest: MutPtr<UShort>, destcapacity: Int, perrorcode: MutPtr<UErrorCode>): Int

public expect fun usetSerializedContains(set: ConstPtr<USerializedSet>, c: Int): Byte

public expect fun usetSet(set: MutPtr<USet>, start: Int, end: Int)

public expect fun usetSetSerializedToOne(fillset: MutPtr<USerializedSet>, c: Int)

public expect fun usetSize(set: ConstPtr<USet>): Int

public expect fun usetSpan(set: ConstPtr<USet>, s: ConstPtr<UShort>, length: Int, spancondition: USetSpanCondition): Int

public expect fun usetSpanBack(set: ConstPtr<USet>, s: ConstPtr<UShort>, length: Int, spancondition: USetSpanCondition): Int

public expect fun usetSpanBackUtf8(set: ConstPtr<USet>, s: Pcstr, length: Int, spancondition: USetSpanCondition): Int

public expect fun usetSpanUtf8(set: ConstPtr<USet>, s: Pcstr, length: Int, spancondition: USetSpanCondition): Int

public expect fun usetToPattern(set: ConstPtr<USet>, result: MutPtr<UShort>, resultcapacity: Int, escapeunprintable: Byte, ec: MutPtr<UErrorCode>): Int

public expect fun uspoofAreConfusable(sc: ConstPtr<USpoofChecker>, id1: ConstPtr<UShort>, length1: Int, id2: ConstPtr<UShort>, length2: Int, status: MutPtr<UErrorCode>): Int

public expect fun uspoofAreConfusableUtf8(sc: ConstPtr<USpoofChecker>, id1: Pcstr, length1: Int, id2: Pcstr, length2: Int, status: MutPtr<UErrorCode>): Int

public expect fun uspoofCheck(sc: ConstPtr<USpoofChecker>, id: ConstPtr<UShort>, length: Int, position: MutPtr<Int>, status: MutPtr<UErrorCode>): Int

public expect fun uspoofCheck2(sc: ConstPtr<USpoofChecker>, id: ConstPtr<UShort>, length: Int, checkresult: MutPtr<USpoofCheckResult>, status: MutPtr<UErrorCode>): Int

public expect fun uspoofCheck2Utf8(sc: ConstPtr<USpoofChecker>, id: Pcstr, length: Int, checkresult: MutPtr<USpoofCheckResult>, status: MutPtr<UErrorCode>): Int

public expect fun uspoofCheckUtf8(sc: ConstPtr<USpoofChecker>, id: Pcstr, length: Int, position: MutPtr<Int>, status: MutPtr<UErrorCode>): Int

public expect fun uspoofClone(sc: ConstPtr<USpoofChecker>, status: MutPtr<UErrorCode>): MutPtr<USpoofChecker>

public expect fun uspoofClose(sc: MutPtr<USpoofChecker>)

public expect fun uspoofCloseCheckResult(checkresult: MutPtr<USpoofCheckResult>)

public expect fun uspoofGetAllowedChars(sc: ConstPtr<USpoofChecker>, status: MutPtr<UErrorCode>): MutPtr<USet>

public expect fun uspoofGetAllowedLocales(sc: MutPtr<USpoofChecker>, status: MutPtr<UErrorCode>): Pcstr

public expect fun uspoofGetCheckResultChecks(checkresult: ConstPtr<USpoofCheckResult>, status: MutPtr<UErrorCode>): Int

public expect fun uspoofGetCheckResultNumerics(checkresult: ConstPtr<USpoofCheckResult>, status: MutPtr<UErrorCode>): MutPtr<USet>

public expect fun uspoofGetCheckResultRestrictionLevel(checkresult: ConstPtr<USpoofCheckResult>, status: MutPtr<UErrorCode>): URestrictionLevel

public expect fun uspoofGetChecks(sc: ConstPtr<USpoofChecker>, status: MutPtr<UErrorCode>): Int

public expect fun uspoofGetInclusionSet(status: MutPtr<UErrorCode>): MutPtr<USet>

public expect fun uspoofGetRecommendedSet(status: MutPtr<UErrorCode>): MutPtr<USet>

public expect fun uspoofGetRestrictionLevel(sc: ConstPtr<USpoofChecker>): URestrictionLevel

public expect fun uspoofGetSkeleton(sc: ConstPtr<USpoofChecker>, type: UInt, id: ConstPtr<UShort>, length: Int, dest: MutPtr<UShort>, destcapacity: Int, status: MutPtr<UErrorCode>): Int

public expect fun uspoofGetSkeletonUtf8(sc: ConstPtr<USpoofChecker>, type: UInt, id: Pcstr, length: Int, dest: Pcstr, destcapacity: Int, status: MutPtr<UErrorCode>): Int

public expect fun uspoofOpen(status: MutPtr<UErrorCode>): MutPtr<USpoofChecker>

public expect fun uspoofOpenCheckResult(status: MutPtr<UErrorCode>): MutPtr<USpoofCheckResult>

public expect fun uspoofOpenFromSerialized(data: ConstPtr<CVoid>, length: Int, pactuallength: MutPtr<Int>, perrorcode: MutPtr<UErrorCode>): MutPtr<USpoofChecker>

public expect fun uspoofOpenFromSource(confusables: Pcstr, confusableslen: Int, confusableswholescript: Pcstr, confusableswholescriptlen: Int, errtype: MutPtr<Int>, pe: MutPtr<UParseError>, status: MutPtr<UErrorCode>): MutPtr<USpoofChecker>

public expect fun uspoofSerialize(sc: MutPtr<USpoofChecker>, data: MutPtr<CVoid>, capacity: Int, status: MutPtr<UErrorCode>): Int

public expect fun uspoofSetAllowedChars(sc: MutPtr<USpoofChecker>, chars: ConstPtr<USet>, status: MutPtr<UErrorCode>)

public expect fun uspoofSetAllowedLocales(sc: MutPtr<USpoofChecker>, localeslist: Pcstr, status: MutPtr<UErrorCode>)

public expect fun uspoofSetChecks(sc: MutPtr<USpoofChecker>, checks: Int, status: MutPtr<UErrorCode>)

public expect fun uspoofSetRestrictionLevel(sc: MutPtr<USpoofChecker>, restrictionlevel: URestrictionLevel)

public expect fun usprepClose(profile: MutPtr<UStringPrepProfile>)

public expect fun usprepOpen(path: Pcstr, filename: Pcstr, status: MutPtr<UErrorCode>): MutPtr<UStringPrepProfile>

public expect fun usprepOpenByType(type: UStringPrepProfileType, status: MutPtr<UErrorCode>): MutPtr<UStringPrepProfile>

public expect fun usprepPrepare(prep: ConstPtr<UStringPrepProfile>, src: ConstPtr<UShort>, srclength: Int, dest: MutPtr<UShort>, destcapacity: Int, options: Int, parseerror: MutPtr<UParseError>, status: MutPtr<UErrorCode>): Int

public expect fun utextChar32At(ut: MutPtr<UText>, nativeindex: Long): Int

public expect fun utextClone(dest: MutPtr<UText>, src: ConstPtr<UText>, deep: Byte, readonly: Byte, status: MutPtr<UErrorCode>): MutPtr<UText>

public expect fun utextClose(ut: MutPtr<UText>): MutPtr<UText>

public expect fun utextCopy(ut: MutPtr<UText>, nativestart: Long, nativelimit: Long, destindex: Long, move: Byte, status: MutPtr<UErrorCode>)

public expect fun utextCurrent32(ut: MutPtr<UText>): Int

public expect fun utextEquals(a: ConstPtr<UText>, b: ConstPtr<UText>): Byte

public expect fun utextExtract(ut: MutPtr<UText>, nativestart: Long, nativelimit: Long, dest: MutPtr<UShort>, destcapacity: Int, status: MutPtr<UErrorCode>): Int

public expect fun utextFreeze(ut: MutPtr<UText>)

public expect fun utextGetNativeIndex(ut: ConstPtr<UText>): Long

public expect fun utextGetPreviousNativeIndex(ut: MutPtr<UText>): Long

public expect fun utextHasMetaData(ut: ConstPtr<UText>): Byte

public expect fun utextIsLengthExpensive(ut: ConstPtr<UText>): Byte

public expect fun utextIsWritable(ut: ConstPtr<UText>): Byte

public expect fun utextMoveIndex32(ut: MutPtr<UText>, delta: Int): Byte

public expect fun utextNativeLength(ut: MutPtr<UText>): Long

public expect fun utextNext32(ut: MutPtr<UText>): Int

public expect fun utextNext32From(ut: MutPtr<UText>, nativeindex: Long): Int

public expect fun utextOpenUchars(ut: MutPtr<UText>, s: ConstPtr<UShort>, length: Long, status: MutPtr<UErrorCode>): MutPtr<UText>

public expect fun utextOpenUtf8(ut: MutPtr<UText>, s: Pcstr, length: Long, status: MutPtr<UErrorCode>): MutPtr<UText>

public expect fun utextPrevious32(ut: MutPtr<UText>): Int

public expect fun utextPrevious32From(ut: MutPtr<UText>, nativeindex: Long): Int

public expect fun utextReplace(ut: MutPtr<UText>, nativestart: Long, nativelimit: Long, replacementtext: ConstPtr<UShort>, replacementlength: Int, status: MutPtr<UErrorCode>): Int

public expect fun utextSetNativeIndex(ut: MutPtr<UText>, nativeindex: Long)

public expect fun utextSetup(ut: MutPtr<UText>, extraspace: Int, status: MutPtr<UErrorCode>): MutPtr<UText>

public expect fun utf8AppendCharSafeBody(s: MutPtr<UByte>, i: Int, length: Int, c: Int, piserror: MutPtr<Byte>): Int

public expect fun utf8Back1SafeBody(s: ConstPtr<UByte>, start: Int, i: Int): Int

public expect fun utf8NextCharSafeBody(s: ConstPtr<UByte>, pi: MutPtr<Int>, length: Int, c: Int, strict: Byte): Int

public expect fun utf8PrevCharSafeBody(s: ConstPtr<UByte>, start: Int, pi: MutPtr<Int>, c: Int, strict: Byte): Int

public expect fun utmscaleFromInt64(othertime: Long, timescale: UDateTimeScale, status: MutPtr<UErrorCode>): Long

public expect fun utmscaleGetTimeScaleValue(timescale: UDateTimeScale, value: UTimeScaleValue, status: MutPtr<UErrorCode>): Long

public expect fun utmscaleToInt64(universaltime: Long, timescale: UDateTimeScale, status: MutPtr<UErrorCode>): Long

public expect fun utraceFormat(outbuf: Pcstr, capacity: Int, indent: Int, fmt: Pcstr, vararg variadicArgs: Long): Int

public expect fun utraceFunctionName(fnnumber: Int): Pcstr

public expect fun utraceGetFunctions(context: ConstPtr<ConstPtr<CVoid>>, e: MutPtr<UTraceEntry>, x: MutPtr<UTraceExit>, d: MutPtr<UTraceData>)

public expect fun utraceGetLevel(): Int

public expect fun utraceSetFunctions(context: ConstPtr<CVoid>, e: UTraceEntry, x: UTraceExit, d: UTraceData)

public expect fun utraceSetLevel(tracelevel: Int)

public expect fun utraceVformat(outbuf: Pcstr, capacity: Int, indent: Int, fmt: Pcstr, args: MutPtr<Byte>): Int

public expect fun utransClone(trans: ConstPtr<ConstPtr<CVoid>>, status: MutPtr<UErrorCode>): MutPtr<MutPtr<CVoid>>

public expect fun utransClose(trans: MutPtr<MutPtr<CVoid>>)

public expect fun utransCountAvailableIds(): Int

public expect fun utransGetSourceSet(trans: ConstPtr<ConstPtr<CVoid>>, ignorefilter: Byte, fillin: MutPtr<USet>, status: MutPtr<UErrorCode>): MutPtr<USet>

public expect fun utransGetUnicodeId(trans: ConstPtr<ConstPtr<CVoid>>, resultlength: MutPtr<Int>): MutPtr<UShort>

public expect fun utransOpenIds(perrorcode: MutPtr<UErrorCode>): MutPtr<UEnumeration>

public expect fun utransOpenInverse(trans: ConstPtr<ConstPtr<CVoid>>, status: MutPtr<UErrorCode>): MutPtr<MutPtr<CVoid>>

public expect fun utransOpenU(id: ConstPtr<UShort>, idlength: Int, dir: UTransDirection, rules: ConstPtr<UShort>, ruleslength: Int, parseerror: MutPtr<UParseError>, perrorcode: MutPtr<UErrorCode>): MutPtr<MutPtr<CVoid>>

public expect fun utransRegister(adoptedtrans: MutPtr<MutPtr<CVoid>>, status: MutPtr<UErrorCode>)

public expect fun utransSetFilter(trans: MutPtr<MutPtr<CVoid>>, filterpattern: ConstPtr<UShort>, filterpatternlen: Int, status: MutPtr<UErrorCode>)

public expect fun utransToRules(trans: ConstPtr<ConstPtr<CVoid>>, escapeunprintable: Byte, result: MutPtr<UShort>, resultlength: Int, status: MutPtr<UErrorCode>): Int

public expect fun utransTrans(trans: ConstPtr<ConstPtr<CVoid>>, rep: MutPtr<MutPtr<CVoid>>, repfunc: ConstPtr<UReplaceableCallbacks>, start: Int, limit: MutPtr<Int>, status: MutPtr<UErrorCode>)

public expect fun utransTransIncremental(trans: ConstPtr<ConstPtr<CVoid>>, rep: MutPtr<MutPtr<CVoid>>, repfunc: ConstPtr<UReplaceableCallbacks>, pos: MutPtr<UTransPosition>, status: MutPtr<UErrorCode>)

public expect fun utransTransIncrementalUchars(trans: ConstPtr<ConstPtr<CVoid>>, text: MutPtr<UShort>, textlength: MutPtr<Int>, textcapacity: Int, pos: MutPtr<UTransPosition>, status: MutPtr<UErrorCode>)

public expect fun utransTransUchars(trans: ConstPtr<ConstPtr<CVoid>>, text: MutPtr<UShort>, textlength: MutPtr<Int>, textcapacity: Int, start: Int, limit: MutPtr<Int>, status: MutPtr<UErrorCode>)

public expect fun utransUnregisterId(id: ConstPtr<UShort>, idlength: Int)
