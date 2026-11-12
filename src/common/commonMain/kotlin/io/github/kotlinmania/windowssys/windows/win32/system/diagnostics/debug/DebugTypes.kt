package io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus

public typealias AddressMode = Int

public typealias BugcheckError = UInt

public typealias ContextFlags = UInt

public typealias DbgpropAttribFlags = Int

public typealias DbgpropInfo = Int

public typealias DebugEventCode = UInt

public fun interface DigestFunctionFn {
    public operator fun invoke(refdata: MutPtr, pdata: MutPtr, dwlength: UInt): Bool
}

public typealias DigestFunction = DigestFunctionFn?

public typealias DumpType = Int

public typealias ExPropInfoFlags = Int

public typealias FacilityCode = UInt

public typealias FormatMessageOptions = UInt

public typealias ImagehlpCbaEventSeverity = UInt

public typealias ImagehlpExtendedOptions = Int

public typealias ImagehlpGetTypeInfoFlags = UInt

public typealias ImagehlpHdType = Int

public typealias ImagehlpSfType = Int

public typealias ImagehlpStatusReason = Int

public typealias ImagehlpSymbolTypeInfo = Int

public typealias ImageDebugType = UInt

public typealias ImageDirectoryEntry = UShort

public typealias ImageDllCharacteristics = UShort

public typealias ImageFileCharacteristics = UShort

public typealias ImageFileCharacteristics2 = UInt

public typealias ImageOptionalHeaderMagic = UShort

public typealias ImageSectionCharacteristics = UInt

public typealias ImageSubsystem = UShort

public typealias IpmiOsSelRecordType = Int

public fun interface LpcallBackUserInterruptRoutineFn {
    public operator fun invoke(): UInt
}

public typealias LpcallBackUserInterruptRoutine = LpcallBackUserInterruptRoutineFn?

public fun interface LptopLevelExceptionFilterFn {
    public operator fun invoke(exceptioninfo: ConstPtr): Int
}

public typealias LptopLevelExceptionFilter = LptopLevelExceptionFilterFn?

public fun interface MinidumpCallbackRoutineFn {
    public operator fun invoke(callbackparam: MutPtr, callbackinput: ConstPtr, callbackoutput: MutPtr): Bool
}

public typealias MinidumpCallbackRoutine = MinidumpCallbackRoutineFn?

public typealias MinidumpCallbackType = Int

public typealias MinidumpHandleObjectInformationType = Int

public typealias MinidumpMiscInfoFlags = UInt

public typealias MinidumpSecondaryFlags = Int

public typealias MinidumpStreamType = Int

public typealias MinidumpThreadInfoDumpFlags = UInt

public typealias MinidumpType = Int

public typealias ModloadDataType = UInt

public typealias ModuleWriteFlags = Int

public typealias ObjectAttribFlags = Int

public typealias OpenThreadWaitChainSessionFlags = UInt

public fun interface PcogetactivationstateFn {
    public operator fun invoke(param0: Guid, param1: UInt, param2: MutPtr): Hresult
}

public typealias Pcogetactivationstate = PcogetactivationstateFn?

public fun interface PcogetcallstateFn {
    public operator fun invoke(param0: Int, param1: MutPtr): Hresult
}

public typealias Pcogetcallstate = PcogetcallstateFn?

public fun interface PdbghelpCreateUserDumpCallbackFn {
    public operator fun invoke(datatype: UInt, data: ConstPtr, datalength: MutPtr, userdata: ConstPtr): Bool
}

public typealias PdbghelpCreateUserDumpCallback = PdbghelpCreateUserDumpCallbackFn?

public fun interface PenumdirtreeCallbackFn {
    public operator fun invoke(filepath: Pcstr, callerdata: ConstPtr): Bool
}

public typealias PenumdirtreeCallback = PenumdirtreeCallbackFn?

public fun interface PenumdirtreeCallbackwFn {
    public operator fun invoke(filepath: Pcwstr, callerdata: ConstPtr): Bool
}

public typealias PenumdirtreeCallbackw = PenumdirtreeCallbackwFn?

public fun interface PenumloadedModulesCallback64Fn {
    public operator fun invoke(modulename: Pcstr, modulebase: ULong, modulesize: UInt, usercontext: ConstPtr): Bool
}

public typealias PenumloadedModulesCallback64 = PenumloadedModulesCallback64Fn?

public fun interface PenumloadedModulesCallbackw64Fn {
    public operator fun invoke(modulename: Pcwstr, modulebase: ULong, modulesize: UInt, usercontext: ConstPtr): Bool
}

public typealias PenumloadedModulesCallbackw64 = PenumloadedModulesCallbackw64Fn?

public fun interface PenumsourcefiletokenscallbackFn {
    public operator fun invoke(token: ConstPtr, size: ULong): Bool
}

public typealias Penumsourcefiletokenscallback = PenumsourcefiletokenscallbackFn?

public fun interface PfindfileinpathcallbackFn {
    public operator fun invoke(filename: Pcstr, context: ConstPtr): Bool
}

public typealias Pfindfileinpathcallback = PfindfileinpathcallbackFn?

public fun interface PfindfileinpathcallbackwFn {
    public operator fun invoke(filename: Pcwstr, context: ConstPtr): Bool
}

public typealias Pfindfileinpathcallbackw = PfindfileinpathcallbackwFn?

public fun interface PfindDebugFileCallbackFn {
    public operator fun invoke(filehandle: Handle, filename: Pcstr, callerdata: ConstPtr): Bool
}

public typealias PfindDebugFileCallback = PfindDebugFileCallbackFn?

public fun interface PfindDebugFileCallbackwFn {
    public operator fun invoke(filehandle: Handle, filename: Pcwstr, callerdata: ConstPtr): Bool
}

public typealias PfindDebugFileCallbackw = PfindDebugFileCallbackwFn?

public fun interface PfindExeFileCallbackFn {
    public operator fun invoke(filehandle: Handle, filename: Pcstr, callerdata: ConstPtr): Bool
}

public typealias PfindExeFileCallback = PfindExeFileCallbackFn?

public fun interface PfindExeFileCallbackwFn {
    public operator fun invoke(filehandle: Handle, filename: Pcwstr, callerdata: ConstPtr): Bool
}

public typealias PfindExeFileCallbackw = PfindExeFileCallbackwFn?

public fun interface PfunctionTableAccessRoutine64Fn {
    public operator fun invoke(ahprocess: Handle, addrbase: ULong): MutPtr
}

public typealias PfunctionTableAccessRoutine64 = PfunctionTableAccessRoutine64Fn?

public fun interface PgetModuleBaseRoutine64Fn {
    public operator fun invoke(hprocess: Handle, address: ULong): ULong
}

public typealias PgetModuleBaseRoutine64 = PgetModuleBaseRoutine64Fn?

public fun interface PgetRuntimeFunctionCallbackFn {
    public operator fun invoke(controlpc: ULong, context: ConstPtr): MutPtr
}

public typealias PgetRuntimeFunctionCallback = PgetRuntimeFunctionCallbackFn?

public fun interface PgetTargetAttributeValue64Fn {
    public operator fun invoke(hprocess: Handle, attribute: UInt, attributedata: ULong, attributevalue: MutPtr): Bool
}

public typealias PgetTargetAttributeValue64 = PgetTargetAttributeValue64Fn?

public fun interface PimagehlpStatusRoutineFn {
    public operator fun invoke(reason: ImagehlpStatusReason, imagename: Pcstr, dllname: Pcstr, va: ULong, parameter: ULong): Bool
}

public typealias PimagehlpStatusRoutine = PimagehlpStatusRoutineFn?

public fun interface PimagehlpStatusRoutine32Fn {
    public operator fun invoke(reason: ImagehlpStatusReason, imagename: Pcstr, dllname: Pcstr, va: UInt, parameter: ULong): Bool
}

public typealias PimagehlpStatusRoutine32 = PimagehlpStatusRoutine32Fn?

public fun interface PimagehlpStatusRoutine64Fn {
    public operator fun invoke(reason: ImagehlpStatusReason, imagename: Pcstr, dllname: Pcstr, va: ULong, parameter: ULong): Bool
}

public typealias PimagehlpStatusRoutine64 = PimagehlpStatusRoutine64Fn?

public fun interface PreadProcessMemoryRoutine64Fn {
    public operator fun invoke(hprocess: Handle, qwbaseaddress: ULong, lpbuffer: MutPtr, nsize: UInt, lpnumberofbytesread: MutPtr): Bool
}

public typealias PreadProcessMemoryRoutine64 = PreadProcessMemoryRoutine64Fn?

public typealias PropInfoFlags = Int

public fun interface PsymbolserverbyindexprocFn {
    public operator fun invoke(param0: Pcstr, param1: Pcstr, param2: Pcstr, param3: Pcstr): Bool
}

public typealias Psymbolserverbyindexproc = PsymbolserverbyindexprocFn?

public fun interface PsymbolserverbyindexprocaFn {
    public operator fun invoke(param0: Pcstr, param1: Pcstr, param2: Pcstr, param3: Pcstr): Bool
}

public typealias Psymbolserverbyindexproca = PsymbolserverbyindexprocaFn?

public fun interface PsymbolserverbyindexprocwFn {
    public operator fun invoke(param0: Pcwstr, param1: Pcwstr, param2: Pcwstr, param3: Pcwstr): Bool
}

public typealias Psymbolserverbyindexprocw = PsymbolserverbyindexprocwFn?

public fun interface PsymbolservercallbackprocFn {
    public operator fun invoke(action: ULong, data: ULong, context: ULong): Bool
}

public typealias Psymbolservercallbackproc = PsymbolservercallbackprocFn?

public fun interface PsymbolservercloseprocFn {
    public operator fun invoke(): Bool
}

public typealias Psymbolservercloseproc = PsymbolservercloseprocFn?

public fun interface PsymbolserverdeltanameFn {
    public operator fun invoke(param0: Pcstr, param1: MutPtr, param2: UInt, param3: UInt, param4: MutPtr, param5: UInt, param6: UInt, param7: Pcstr, param8: ULong): Bool
}

public typealias Psymbolserverdeltaname = PsymbolserverdeltanameFn?

public fun interface PsymbolserverdeltanamewFn {
    public operator fun invoke(param0: Pcwstr, param1: MutPtr, param2: UInt, param3: UInt, param4: MutPtr, param5: UInt, param6: UInt, param7: Pcwstr, param8: ULong): Bool
}

public typealias Psymbolserverdeltanamew = PsymbolserverdeltanamewFn?

public fun interface PsymbolservergetindexstringFn {
    public operator fun invoke(param0: MutPtr, param1: UInt, param2: UInt, param3: Pcstr, param4: ULong): Bool
}

public typealias Psymbolservergetindexstring = PsymbolservergetindexstringFn?

public fun interface PsymbolservergetindexstringwFn {
    public operator fun invoke(param0: MutPtr, param1: UInt, param2: UInt, param3: Pcwstr, param4: ULong): Bool
}

public typealias Psymbolservergetindexstringw = PsymbolservergetindexstringwFn?

public fun interface PsymbolservergetoptiondataprocFn {
    public operator fun invoke(param0: ULong, param1: MutPtr): Bool
}

public typealias Psymbolservergetoptiondataproc = PsymbolservergetoptiondataprocFn?

public fun interface PsymbolservergetoptionsprocFn {
    public operator fun invoke(): ULong
}

public typealias Psymbolservergetoptionsproc = PsymbolservergetoptionsprocFn?

public fun interface PsymbolservergetsupplementFn {
    public operator fun invoke(param0: Pcstr, param1: Pcstr, param2: Pcstr, param3: Pcstr, param4: ULong): Bool
}

public typealias Psymbolservergetsupplement = PsymbolservergetsupplementFn?

public fun interface PsymbolservergetsupplementwFn {
    public operator fun invoke(param0: Pcwstr, param1: Pcwstr, param2: Pcwstr, param3: Pcwstr, param4: ULong): Bool
}

public typealias Psymbolservergetsupplementw = PsymbolservergetsupplementwFn?

public fun interface PsymbolservergetversionFn {
    public operator fun invoke(param0: MutPtr): Bool
}

public typealias Psymbolservergetversion = PsymbolservergetversionFn?

public fun interface PsymbolserverisstoreFn {
    public operator fun invoke(param0: Pcstr): Bool
}

public typealias Psymbolserverisstore = PsymbolserverisstoreFn?

public fun interface PsymbolserverisstorewFn {
    public operator fun invoke(param0: Pcwstr): Bool
}

public typealias Psymbolserverisstorew = PsymbolserverisstorewFn?

public fun interface PsymbolservermessageprocFn {
    public operator fun invoke(action: ULong, data: ULong, context: ULong): Bool
}

public typealias Psymbolservermessageproc = PsymbolservermessageprocFn?

public fun interface PsymbolserveropenprocFn {
    public operator fun invoke(): Bool
}

public typealias Psymbolserveropenproc = PsymbolserveropenprocFn?

public fun interface PsymbolserverpingprocFn {
    public operator fun invoke(param0: Pcstr): Bool
}

public typealias Psymbolserverpingproc = PsymbolserverpingprocFn?

public fun interface PsymbolserverpingprocaFn {
    public operator fun invoke(param0: Pcstr): Bool
}

public typealias Psymbolserverpingproca = PsymbolserverpingprocaFn?

public fun interface PsymbolserverpingprocwFn {
    public operator fun invoke(param0: Pcwstr): Bool
}

public typealias Psymbolserverpingprocw = PsymbolserverpingprocwFn?

public fun interface PsymbolserverpingprocwexFn {
    public operator fun invoke(param0: Pcwstr): Bool
}

public typealias Psymbolserverpingprocwex = PsymbolserverpingprocwexFn?

public fun interface PsymbolserverprocFn {
    public operator fun invoke(param0: Pcstr, param1: Pcstr, param2: MutPtr, param3: UInt, param4: UInt, param5: Pcstr): Bool
}

public typealias Psymbolserverproc = PsymbolserverprocFn?

public fun interface PsymbolserverprocaFn {
    public operator fun invoke(param0: Pcstr, param1: Pcstr, param2: MutPtr, param3: UInt, param4: UInt, param5: Pcstr): Bool
}

public typealias Psymbolserverproca = PsymbolserverprocaFn?

public fun interface PsymbolserverprocwFn {
    public operator fun invoke(param0: Pcwstr, param1: Pcwstr, param2: MutPtr, param3: UInt, param4: UInt, param5: Pcwstr): Bool
}

public typealias Psymbolserverprocw = PsymbolserverprocwFn?

public fun interface PsymbolserversethttpauthheaderFn {
    public operator fun invoke(pszauthheader: Pcwstr): Bool
}

public typealias Psymbolserversethttpauthheader = PsymbolserversethttpauthheaderFn?

public fun interface PsymbolserversetoptionsprocFn {
    public operator fun invoke(param0: ULong, param1: ULong): Bool
}

public typealias Psymbolserversetoptionsproc = PsymbolserversetoptionsprocFn?

public fun interface PsymbolserversetoptionswprocFn {
    public operator fun invoke(param0: ULong, param1: ULong): Bool
}

public typealias Psymbolserversetoptionswproc = PsymbolserversetoptionswprocFn?

public fun interface PsymbolserverstorefileFn {
    public operator fun invoke(param0: Pcstr, param1: Pcstr, param2: MutPtr, param3: UInt, param4: UInt, param5: Pcstr, param6: ULong, param7: UInt): Bool
}

public typealias Psymbolserverstorefile = PsymbolserverstorefileFn?

public fun interface PsymbolserverstorefilewFn {
    public operator fun invoke(param0: Pcwstr, param1: Pcwstr, param2: MutPtr, param3: UInt, param4: UInt, param5: Pcwstr, param6: ULong, param7: UInt): Bool
}

public typealias Psymbolserverstorefilew = PsymbolserverstorefilewFn?

public fun interface PsymbolserverstoresupplementFn {
    public operator fun invoke(param0: Pcstr, param1: Pcstr, param2: Pcstr, param3: Pcstr, param4: ULong, param5: UInt): Bool
}

public typealias Psymbolserverstoresupplement = PsymbolserverstoresupplementFn?

public fun interface PsymbolserverstoresupplementwFn {
    public operator fun invoke(param0: Pcwstr, param1: Pcwstr, param2: Pcwstr, param3: Pcwstr, param4: ULong, param5: UInt): Bool
}

public typealias Psymbolserverstoresupplementw = PsymbolserverstoresupplementwFn?

public fun interface PsymbolserverversionFn {
    public operator fun invoke(): UInt
}

public typealias Psymbolserverversion = PsymbolserverversionFn?

public fun interface PsymbolserverwexprocFn {
    public operator fun invoke(param0: Pcwstr, param1: Pcwstr, param2: MutPtr, param3: UInt, param4: UInt, param5: Pcwstr, param6: MutPtr): Bool
}

public typealias Psymbolserverwexproc = PsymbolserverwexprocFn?

public fun interface PsymbolFuncentryCallbackFn {
    public operator fun invoke(hprocess: Handle, addrbase: UInt, usercontext: ConstPtr): MutPtr
}

public typealias PsymbolFuncentryCallback = PsymbolFuncentryCallbackFn?

public fun interface PsymbolFuncentryCallback64Fn {
    public operator fun invoke(hprocess: Handle, addrbase: ULong, usercontext: ULong): MutPtr
}

public typealias PsymbolFuncentryCallback64 = PsymbolFuncentryCallback64Fn?

public fun interface PsymbolRegisteredCallback64Fn {
    public operator fun invoke(hprocess: Handle, actioncode: UInt, callbackdata: ULong, usercontext: ULong): Bool
}

public typealias PsymbolRegisteredCallback64 = PsymbolRegisteredCallback64Fn?

public fun interface PsymEnumeratesymbolsCallbackFn {
    public operator fun invoke(psyminfo: ConstPtr, symbolsize: UInt, usercontext: ConstPtr): Bool
}

public typealias PsymEnumeratesymbolsCallback = PsymEnumeratesymbolsCallbackFn?

public fun interface PsymEnumeratesymbolsCallbackwFn {
    public operator fun invoke(psyminfo: ConstPtr, symbolsize: UInt, usercontext: ConstPtr): Bool
}

public typealias PsymEnumeratesymbolsCallbackw = PsymEnumeratesymbolsCallbackwFn?

public fun interface PsymEnumlinesCallbackFn {
    public operator fun invoke(lineinfo: ConstPtr, usercontext: ConstPtr): Bool
}

public typealias PsymEnumlinesCallback = PsymEnumlinesCallbackFn?

public fun interface PsymEnumlinesCallbackwFn {
    public operator fun invoke(lineinfo: ConstPtr, usercontext: ConstPtr): Bool
}

public typealias PsymEnumlinesCallbackw = PsymEnumlinesCallbackwFn?

public fun interface PsymEnummodulesCallback64Fn {
    public operator fun invoke(modulename: Pcstr, baseofdll: ULong, usercontext: ConstPtr): Bool
}

public typealias PsymEnummodulesCallback64 = PsymEnummodulesCallback64Fn?

public fun interface PsymEnummodulesCallbackw64Fn {
    public operator fun invoke(modulename: Pcwstr, baseofdll: ULong, usercontext: ConstPtr): Bool
}

public typealias PsymEnummodulesCallbackw64 = PsymEnummodulesCallbackw64Fn?

public fun interface PsymEnumprocessesCallbackFn {
    public operator fun invoke(hprocess: Handle, usercontext: ConstPtr): Bool
}

public typealias PsymEnumprocessesCallback = PsymEnumprocessesCallbackFn?

public fun interface PsymEnumsourcefilesCallbackFn {
    public operator fun invoke(psourcefile: ConstPtr, usercontext: ConstPtr): Bool
}

public typealias PsymEnumsourcefilesCallback = PsymEnumsourcefilesCallbackFn?

public fun interface PsymEnumsourcefilesCallbackwFn {
    public operator fun invoke(psourcefile: ConstPtr, usercontext: ConstPtr): Bool
}

public typealias PsymEnumsourcefilesCallbackw = PsymEnumsourcefilesCallbackwFn?

public fun interface PsymEnumsymbolsCallback64Fn {
    public operator fun invoke(symbolname: Pcstr, symboladdress: ULong, symbolsize: UInt, usercontext: ConstPtr): Bool
}

public typealias PsymEnumsymbolsCallback64 = PsymEnumsymbolsCallback64Fn?

public fun interface PsymEnumsymbolsCallback64wFn {
    public operator fun invoke(symbolname: Pcwstr, symboladdress: ULong, symbolsize: UInt, usercontext: ConstPtr): Bool
}

public typealias PsymEnumsymbolsCallback64w = PsymEnumsymbolsCallback64wFn?

public fun interface PtranslateAddressRoutine64Fn {
    public operator fun invoke(hprocess: Handle, hthread: Handle, lpaddr: ConstPtr): ULong
}

public typealias PtranslateAddressRoutine64 = PtranslateAddressRoutine64Fn?

public fun interface PvectoredExceptionHandlerFn {
    public operator fun invoke(exceptioninfo: MutPtr): Int
}

public typealias PvectoredExceptionHandler = PvectoredExceptionHandlerFn?

public fun interface PwaitchaincallbackFn {
    public operator fun invoke(wcthandle: MutPtr, context: ULong, callbackstatus: UInt, nodecount: MutPtr, nodeinfoarray: MutPtr, iscycle: MutPtr)
}

public typealias Pwaitchaincallback = PwaitchaincallbackFn?

public typealias RipInfoType = UInt

public typealias RtlVirtualUnwindHandlerType = UInt

public fun interface SymaddsourcestreamFn {
    public operator fun invoke(param0: Handle, param1: ULong, param2: Pcstr, param3: MutPtr, param4: ULong): Bool
}

public typealias Symaddsourcestream = SymaddsourcestreamFn?

public fun interface SymaddsourcestreamaFn {
    public operator fun invoke(param0: Handle, param1: ULong, param2: Pcstr, param3: MutPtr, param4: ULong): Bool
}

public typealias Symaddsourcestreama = SymaddsourcestreamaFn?

public typealias SymbolInfoFlags = UInt

public typealias SymFindIdOption = UInt

public typealias SymLoadFlags = UInt

public typealias SymSrvStoreFileFlags = UInt

public typealias SymType = Int

public typealias ThreadErrorMode = UInt

public typealias ThreadWriteFlags = Int

public typealias VerPlatform = UInt

public typealias WaitChainThreadOptions = UInt

public typealias WctObjectStatus = Int

public typealias WctObjectType = Int

public fun interface WheaErrorSourceCorrectDeviceDriverFn {
    public operator fun invoke(errorsourcedesc: MutPtr, maximumsectionlength: MutPtr): Ntstatus
}

public typealias WheaErrorSourceCorrectDeviceDriver = WheaErrorSourceCorrectDeviceDriverFn?

public fun interface WheaErrorSourceInitializeDeviceDriverFn {
    public operator fun invoke(context: MutPtr, errorsourceid: UInt): Ntstatus
}

public typealias WheaErrorSourceInitializeDeviceDriver = WheaErrorSourceInitializeDeviceDriverFn?

public typealias WheaErrorSourceState = Int

public typealias WheaErrorSourceType = Int

public fun interface WheaErrorSourceUninitializeDeviceDriverFn {
    public operator fun invoke(context: MutPtr)
}

public typealias WheaErrorSourceUninitializeDeviceDriver = WheaErrorSourceUninitializeDeviceDriverFn?

public typealias Wow64ContextFlags = UInt
