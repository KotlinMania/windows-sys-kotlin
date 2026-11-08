package io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.extensions

import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

public typealias CallingConventionKind = Int

public typealias DBGKD_MAJOR_TYPES = Int

public typealias DEBUG_FAILURE_TYPE = Int

public typealias DEBUG_FLR_PARAM_TYPE = Int

public typealias DEBUG_POOL_REGION = Int

public fun interface ENTRY_CALLBACKFn {
    public operator fun invoke(entryaddress: ULong, context: Long): HRESULT
}

public typealias ENTRY_CALLBACK = ENTRY_CALLBACKFn?

public fun interface EXTDLL_ITERATERTLBALANCEDNODESFn {
    public operator fun invoke(rootnode: ULong, entryoffset: UInt, callback: ENTRY_CALLBACK, callbackcontext: Long)
}

public typealias EXTDLL_ITERATERTLBALANCEDNODES = EXTDLL_ITERATERTLBALANCEDNODESFn?

public fun interface EXTDLL_QUERYDATABYTAGFn {
    public operator fun invoke(client: Long, dwdatatag: UInt, pqueryinfo: Long, pdata: Long, cbdata: UInt): HRESULT
}

public typealias EXTDLL_QUERYDATABYTAG = EXTDLL_QUERYDATABYTAGFn?

public fun interface EXTDLL_QUERYDATABYTAGEXFn {
    public operator fun invoke(client: Long, dwdatatag: UInt, pqueryinfo: Long, pdata: Long, cbdata: UInt, pdataex: Long, cbdataex: UInt): HRESULT
}

public typealias EXTDLL_QUERYDATABYTAGEX = EXTDLL_QUERYDATABYTAGEXFn?

public fun interface EXTS_JOB_PROCESS_CALLBACKFn {
    public operator fun invoke(job: ULong, process: ULong, context: Long): Boolean
}

public typealias EXTS_JOB_PROCESS_CALLBACK = EXTS_JOB_PROCESS_CALLBACKFn?

public fun interface EXTS_TABLE_ENTRY_CALLBACKFn {
    public operator fun invoke(entry: ULong, context: Long): Boolean
}

public typealias EXTS_TABLE_ENTRY_CALLBACK = EXTS_TABLE_ENTRY_CALLBACKFn?

public fun interface EXT_ANALYSIS_PLUGINFn {
    public operator fun invoke(client: Long, callphase: FA_EXTENSION_PLUGIN_PHASE, panalysis: Long): HRESULT
}

public typealias EXT_ANALYSIS_PLUGIN = EXT_ANALYSIS_PLUGINFn?

public fun interface EXT_ANALYZERFn {
    public operator fun invoke(client: Long, bucketsuffix: PSTR, cbbucketsuffix: UInt, debugtext: PSTR, cbdebugtext: UInt, flags: Long, panalysis: Long): HRESULT
}

public typealias EXT_ANALYZER = EXT_ANALYZERFn?

public fun interface EXT_DECODE_ERRORFn {
    public operator fun invoke(pdecodeerror: Long)
}

public typealias EXT_DECODE_ERROR = EXT_DECODE_ERRORFn?

public fun interface EXT_GET_DEBUG_FAILURE_ANALYSISFn {
    public operator fun invoke(client: Long, flags: UInt, classid: GUID, ppanalysis: Long): HRESULT
}

public typealias EXT_GET_DEBUG_FAILURE_ANALYSIS = EXT_GET_DEBUG_FAILURE_ANALYSISFn?

public fun interface EXT_GET_ENVIRONMENT_VARIABLEFn {
    public operator fun invoke(peb: ULong, variable: PCSTR, buffer: PCSTR, buffersize: UInt): HRESULT
}

public typealias EXT_GET_ENVIRONMENT_VARIABLE = EXT_GET_ENVIRONMENT_VARIABLEFn?

public fun interface EXT_GET_FAILURE_ANALYSISFn {
    public operator fun invoke(client: Long, flags: UInt, ppanalysis: Long): HRESULT
}

public typealias EXT_GET_FAILURE_ANALYSIS = EXT_GET_FAILURE_ANALYSISFn?

public fun interface EXT_GET_FA_ENTRIES_DATAFn {
    public operator fun invoke(client: Long, count: Long, entries: Long): HRESULT
}

public typealias EXT_GET_FA_ENTRIES_DATA = EXT_GET_FA_ENTRIES_DATAFn?

public fun interface EXT_GET_HANDLE_TRACEFn {
    public operator fun invoke(client: Long, tracetype: UInt, startindex: UInt, handlevalue: Long, stackfunctions: Long, stacktracesize: UInt): HRESULT
}

public typealias EXT_GET_HANDLE_TRACE = EXT_GET_HANDLE_TRACEFn?

public fun interface EXT_RELOAD_TRIAGERFn {
    public operator fun invoke(client: Long): HRESULT
}

public typealias EXT_RELOAD_TRIAGER = EXT_RELOAD_TRIAGERFn?

public fun interface EXT_TARGET_INFOFn {
    public operator fun invoke(client: Long, ptargetinfo: Long): HRESULT
}

public typealias EXT_TARGET_INFO = EXT_TARGET_INFOFn?

public typealias EXT_TDOP = Int

public fun interface EXT_TRIAGE_FOLLOWUPFn {
    public operator fun invoke(client: Long, symbolname: PCSTR, ownerinfo: Long): UInt
}

public typealias EXT_TRIAGE_FOLLOWUP = EXT_TRIAGE_FOLLOWUPFn?

public fun interface EXT_XML_DATAFn {
    public operator fun invoke(client: Long, pxmpdata: Long): HRESULT
}

public typealias EXT_XML_DATA = EXT_XML_DATAFn?

public typealias ErrorClass = Int

public typealias FA_ENTRY_TYPE = Int

public typealias FA_EXTENSION_PLUGIN_PHASE = Int

public typealias IntrinsicKind = Int

public fun interface KDEXTS_LOCK_CALLBACKROUTINEFn {
    public operator fun invoke(plock: Long, context: Long): HRESULT
}

public typealias KDEXTS_LOCK_CALLBACKROUTINE = KDEXTS_LOCK_CALLBACKROUTINEFn?

public fun interface KDEXT_DUMP_HANDLE_CALLBACKFn {
    public operator fun invoke(handleinfo: Long, flags: UInt, context: Long): Boolean
}

public typealias KDEXT_DUMP_HANDLE_CALLBACK = KDEXT_DUMP_HANDLE_CALLBACKFn?

public typealias LanguageKind = Int

public typealias LocationKind = Int

public typealias ModelObjectKind = Int

public typealias OS_TYPE = Int

public fun interface PDEBUG_EXTENSION_CALLFn {
    public operator fun invoke(client: Long, args: PCSTR): HRESULT
}

public typealias PDEBUG_EXTENSION_CALL = PDEBUG_EXTENSION_CALLFn?

public fun interface PDEBUG_EXTENSION_CANUNLOADFn {
    public operator fun invoke(): HRESULT
}

public typealias PDEBUG_EXTENSION_CANUNLOAD = PDEBUG_EXTENSION_CANUNLOADFn?

public fun interface PDEBUG_EXTENSION_INITIALIZEFn {
    public operator fun invoke(version: Long, flags: Long): HRESULT
}

public typealias PDEBUG_EXTENSION_INITIALIZE = PDEBUG_EXTENSION_INITIALIZEFn?

public fun interface PDEBUG_EXTENSION_KNOWN_STRUCTFn {
    public operator fun invoke(flags: UInt, offset: ULong, typename: PCSTR, buffer: PSTR, bufferchars: Long): HRESULT
}

public typealias PDEBUG_EXTENSION_KNOWN_STRUCT = PDEBUG_EXTENSION_KNOWN_STRUCTFn?

public fun interface PDEBUG_EXTENSION_KNOWN_STRUCT_EXFn {
    public operator fun invoke(client: Long, flags: UInt, offset: ULong, typename: PCSTR, buffer: PSTR, bufferchars: Long): HRESULT
}

public typealias PDEBUG_EXTENSION_KNOWN_STRUCT_EX = PDEBUG_EXTENSION_KNOWN_STRUCT_EXFn?

public fun interface PDEBUG_EXTENSION_NOTIFYFn {
    public operator fun invoke(notify: UInt, argument: ULong)
}

public typealias PDEBUG_EXTENSION_NOTIFY = PDEBUG_EXTENSION_NOTIFYFn?

public fun interface PDEBUG_EXTENSION_PROVIDE_VALUEFn {
    public operator fun invoke(client: Long, flags: UInt, name: PCWSTR, value: Long, typemodbase: Long, typeid: Long, typeflags: Long): HRESULT
}

public typealias PDEBUG_EXTENSION_PROVIDE_VALUE = PDEBUG_EXTENSION_PROVIDE_VALUEFn?

public fun interface PDEBUG_EXTENSION_QUERY_VALUE_NAMESFn {
    public operator fun invoke(client: Long, flags: UInt, buffer: PWSTR, bufferchars: UInt, bufferneeded: Long): HRESULT
}

public typealias PDEBUG_EXTENSION_QUERY_VALUE_NAMES = PDEBUG_EXTENSION_QUERY_VALUE_NAMESFn?

public fun interface PDEBUG_EXTENSION_UNINITIALIZEFn {
    public operator fun invoke()
}

public typealias PDEBUG_EXTENSION_UNINITIALIZE = PDEBUG_EXTENSION_UNINITIALIZEFn?

public fun interface PDEBUG_EXTENSION_UNLOADFn {
    public operator fun invoke()
}

public typealias PDEBUG_EXTENSION_UNLOAD = PDEBUG_EXTENSION_UNLOADFn?

public fun interface PDEBUG_STACK_PROVIDER_BEGINTHREADSTACKRECONSTRUCTIONFn {
    public operator fun invoke(streamtype: UInt, minidumpstreambuffer: Long, buffersize: UInt): HRESULT
}

public typealias PDEBUG_STACK_PROVIDER_BEGINTHREADSTACKRECONSTRUCTION = PDEBUG_STACK_PROVIDER_BEGINTHREADSTACKRECONSTRUCTIONFn?

public fun interface PDEBUG_STACK_PROVIDER_ENDTHREADSTACKRECONSTRUCTIONFn {
    public operator fun invoke(): HRESULT
}

public typealias PDEBUG_STACK_PROVIDER_ENDTHREADSTACKRECONSTRUCTION = PDEBUG_STACK_PROVIDER_ENDTHREADSTACKRECONSTRUCTIONFn?

public fun interface PDEBUG_STACK_PROVIDER_FREESTACKSYMFRAMESFn {
    public operator fun invoke(stacksymframes: Long): HRESULT
}

public typealias PDEBUG_STACK_PROVIDER_FREESTACKSYMFRAMES = PDEBUG_STACK_PROVIDER_FREESTACKSYMFRAMESFn?

public fun interface PDEBUG_STACK_PROVIDER_RECONSTRUCTSTACKFn {
    public operator fun invoke(systemthreadid: UInt, nativeframes: Long, countnativeframes: UInt, stacksymframes: Long, stacksymframesfilled: Long): HRESULT
}

public typealias PDEBUG_STACK_PROVIDER_RECONSTRUCTSTACK = PDEBUG_STACK_PROVIDER_RECONSTRUCTSTACKFn?

public fun interface PENUMERATE_HANDLESFn {
    public operator fun invoke(client: Long, process: ULong, handletodump: ULong, flags: UInt, callback: KDEXT_DUMP_HANDLE_CALLBACK, context: Long): HRESULT
}

public typealias PENUMERATE_HANDLES = PENUMERATE_HANDLESFn?

public fun interface PENUMERATE_HASH_TABLEFn {
    public operator fun invoke(client: Long, hashtable: ULong, callback: EXTS_TABLE_ENTRY_CALLBACK, context: Long): HRESULT
}

public typealias PENUMERATE_HASH_TABLE = PENUMERATE_HASH_TABLEFn?

public fun interface PENUMERATE_JOB_PROCESSESFn {
    public operator fun invoke(client: Long, job: ULong, callback: EXTS_JOB_PROCESS_CALLBACK, context: Long): HRESULT
}

public typealias PENUMERATE_JOB_PROCESSES = PENUMERATE_JOB_PROCESSESFn?

public fun interface PENUMERATE_SYSTEM_LOCKSFn {
    public operator fun invoke(client: Long, flags: UInt, callback: KDEXTS_LOCK_CALLBACKROUTINE, context: Long): HRESULT
}

public typealias PENUMERATE_SYSTEM_LOCKS = PENUMERATE_SYSTEM_LOCKSFn?

public fun interface PFIND_FILELOCK_OWNERINFOFn {
    public operator fun invoke(client: Long, pfilelockowner: Long): HRESULT
}

public typealias PFIND_FILELOCK_OWNERINFO = PFIND_FILELOCK_OWNERINFOFn?

public fun interface PFIND_MATCHING_PROCESSFn {
    public operator fun invoke(client: Long, processinfo: Long, process: Long): HRESULT
}

public typealias PFIND_MATCHING_PROCESS = PFIND_MATCHING_PROCESSFn?

public fun interface PFIND_MATCHING_THREADFn {
    public operator fun invoke(client: Long, threadinfo: Long): HRESULT
}

public typealias PFIND_MATCHING_THREAD = PFIND_MATCHING_THREADFn?

public fun interface PGET_CPU_MICROCODE_VERSIONFn {
    public operator fun invoke(client: Long, pcpumicrocodeversion: Long): HRESULT
}

public typealias PGET_CPU_MICROCODE_VERSION = PGET_CPU_MICROCODE_VERSIONFn?

public fun interface PGET_CPU_PSPEED_INFOFn {
    public operator fun invoke(client: Long, pcpuspeedinfo: Long): HRESULT
}

public typealias PGET_CPU_PSPEED_INFO = PGET_CPU_PSPEED_INFOFn?

public fun interface PGET_DEVICE_OBJECT_INFOFn {
    public operator fun invoke(client: Long, deviceobject: ULong, pdevobjinfo: Long): HRESULT
}

public typealias PGET_DEVICE_OBJECT_INFO = PGET_DEVICE_OBJECT_INFOFn?

public fun interface PGET_DRIVER_OBJECT_INFOFn {
    public operator fun invoke(client: Long, driverobject: ULong, pdrvobjinfo: Long): HRESULT
}

public typealias PGET_DRIVER_OBJECT_INFO = PGET_DRIVER_OBJECT_INFOFn?

public fun interface PGET_FULL_IMAGE_NAMEFn {
    public operator fun invoke(client: Long, process: ULong, fullimagename: Long): HRESULT
}

public typealias PGET_FULL_IMAGE_NAME = PGET_FULL_IMAGE_NAMEFn?

public fun interface PGET_IRP_INFOFn {
    public operator fun invoke(client: Long, irp: ULong, irpinfo: Long): HRESULT
}

public typealias PGET_IRP_INFO = PGET_IRP_INFOFn?

public fun interface PGET_PNP_TRIAGE_INFOFn {
    public operator fun invoke(client: Long, ppnptriageinfo: Long): HRESULT
}

public typealias PGET_PNP_TRIAGE_INFO = PGET_PNP_TRIAGE_INFOFn?

public fun interface PGET_POOL_DATAFn {
    public operator fun invoke(client: Long, pool: ULong, pooldata: Long): HRESULT
}

public typealias PGET_POOL_DATA = PGET_POOL_DATAFn?

public fun interface PGET_POOL_REGIONFn {
    public operator fun invoke(client: Long, pool: ULong, poolregion: Long): HRESULT
}

public typealias PGET_POOL_REGION = PGET_POOL_REGIONFn?

public fun interface PGET_POOL_TAG_DESCRIPTIONFn {
    public operator fun invoke(pooltag: UInt, pdescription: Long): HRESULT
}

public typealias PGET_POOL_TAG_DESCRIPTION = PGET_POOL_TAG_DESCRIPTIONFn?

public fun interface PGET_PROCESS_COMMITFn {
    public operator fun invoke(client: Long, totalcommitcharge: Long, numberofprocesses: Long, commitdata: Long): HRESULT
}

public typealias PGET_PROCESS_COMMIT = PGET_PROCESS_COMMITFn?

public fun interface PGET_SMBIOS_INFOFn {
    public operator fun invoke(client: Long, psmbiosinfo: Long): HRESULT
}

public typealias PGET_SMBIOS_INFO = PGET_SMBIOS_INFOFn?

public fun interface PKDEXTS_GET_PTE_INFOFn {
    public operator fun invoke(client: Long, virtual: ULong, pteinfo: Long): HRESULT
}

public typealias PKDEXTS_GET_PTE_INFO = PKDEXTS_GET_PTE_INFOFn?

public fun interface PSYM_DUMP_FIELD_CALLBACKFn {
    public operator fun invoke(pfield: Long, usercontext: Long): UInt
}

public typealias PSYM_DUMP_FIELD_CALLBACK = PSYM_DUMP_FIELD_CALLBACKFn?

public fun interface PWINDBG_CHECK_CONTROL_CFn {
    public operator fun invoke(): UInt
}

public typealias PWINDBG_CHECK_CONTROL_C = PWINDBG_CHECK_CONTROL_CFn?

public fun interface PWINDBG_CHECK_VERSIONFn {
    public operator fun invoke(): UInt
}

public typealias PWINDBG_CHECK_VERSION = PWINDBG_CHECK_VERSIONFn?

public fun interface PWINDBG_DISASMFn {
    public operator fun invoke(lpoffset: Long, lpbuffer: PCSTR, fshoweffectiveaddress: UInt): UInt
}

public typealias PWINDBG_DISASM = PWINDBG_DISASMFn?

public fun interface PWINDBG_DISASM32Fn {
    public operator fun invoke(lpoffset: Long, lpbuffer: PCSTR, fshoweffectiveaddress: UInt): UInt
}

public typealias PWINDBG_DISASM32 = PWINDBG_DISASM32Fn?

public fun interface PWINDBG_DISASM64Fn {
    public operator fun invoke(lpoffset: Long, lpbuffer: PCSTR, fshoweffectiveaddress: UInt): UInt
}

public typealias PWINDBG_DISASM64 = PWINDBG_DISASM64Fn?

public fun interface PWINDBG_EXTENSION_API_VERSIONFn {
    public operator fun invoke(): Long
}

public typealias PWINDBG_EXTENSION_API_VERSION = PWINDBG_EXTENSION_API_VERSIONFn?

public fun interface PWINDBG_EXTENSION_DLL_INITFn {
    public operator fun invoke(lpextensionapis: Long, majorversion: UShort, minorversion: UShort)
}

public typealias PWINDBG_EXTENSION_DLL_INIT = PWINDBG_EXTENSION_DLL_INITFn?

public fun interface PWINDBG_EXTENSION_DLL_INIT32Fn {
    public operator fun invoke(lpextensionapis: Long, majorversion: UShort, minorversion: UShort)
}

public typealias PWINDBG_EXTENSION_DLL_INIT32 = PWINDBG_EXTENSION_DLL_INIT32Fn?

public fun interface PWINDBG_EXTENSION_DLL_INIT64Fn {
    public operator fun invoke(lpextensionapis: Long, majorversion: UShort, minorversion: UShort)
}

public typealias PWINDBG_EXTENSION_DLL_INIT64 = PWINDBG_EXTENSION_DLL_INIT64Fn?

public fun interface PWINDBG_EXTENSION_ROUTINEFn {
    public operator fun invoke(hcurrentprocess: HANDLE, hcurrentthread: HANDLE, dwcurrentpc: UInt, dwprocessor: UInt, lpargumentstring: PCSTR)
}

public typealias PWINDBG_EXTENSION_ROUTINE = PWINDBG_EXTENSION_ROUTINEFn?

public fun interface PWINDBG_EXTENSION_ROUTINE32Fn {
    public operator fun invoke(hcurrentprocess: HANDLE, hcurrentthread: HANDLE, dwcurrentpc: UInt, dwprocessor: UInt, lpargumentstring: PCSTR)
}

public typealias PWINDBG_EXTENSION_ROUTINE32 = PWINDBG_EXTENSION_ROUTINE32Fn?

public fun interface PWINDBG_EXTENSION_ROUTINE64Fn {
    public operator fun invoke(hcurrentprocess: HANDLE, hcurrentthread: HANDLE, dwcurrentpc: ULong, dwprocessor: UInt, lpargumentstring: PCSTR)
}

public typealias PWINDBG_EXTENSION_ROUTINE64 = PWINDBG_EXTENSION_ROUTINE64Fn?

public fun interface PWINDBG_GET_EXPRESSIONFn {
    public operator fun invoke(lpexpression: PCSTR): ULong
}

public typealias PWINDBG_GET_EXPRESSION = PWINDBG_GET_EXPRESSIONFn?

public fun interface PWINDBG_GET_EXPRESSION32Fn {
    public operator fun invoke(lpexpression: PCSTR): UInt
}

public typealias PWINDBG_GET_EXPRESSION32 = PWINDBG_GET_EXPRESSION32Fn?

public fun interface PWINDBG_GET_EXPRESSION64Fn {
    public operator fun invoke(lpexpression: PCSTR): ULong
}

public typealias PWINDBG_GET_EXPRESSION64 = PWINDBG_GET_EXPRESSION64Fn?

public fun interface PWINDBG_GET_SYMBOLFn {
    public operator fun invoke(offset: Long, pchbuffer: PCSTR, pdisplacement: Long)
}

public typealias PWINDBG_GET_SYMBOL = PWINDBG_GET_SYMBOLFn?

public fun interface PWINDBG_GET_SYMBOL32Fn {
    public operator fun invoke(offset: UInt, pchbuffer: PCSTR, pdisplacement: Long)
}

public typealias PWINDBG_GET_SYMBOL32 = PWINDBG_GET_SYMBOL32Fn?

public fun interface PWINDBG_GET_SYMBOL64Fn {
    public operator fun invoke(offset: ULong, pchbuffer: PCSTR, pdisplacement: Long)
}

public typealias PWINDBG_GET_SYMBOL64 = PWINDBG_GET_SYMBOL64Fn?

public fun interface PWINDBG_GET_THREAD_CONTEXT_ROUTINEFn {
    public operator fun invoke(processor: UInt, lpcontext: Long, cbsizeofcontext: UInt): UInt
}

public typealias PWINDBG_GET_THREAD_CONTEXT_ROUTINE = PWINDBG_GET_THREAD_CONTEXT_ROUTINEFn?

public fun interface PWINDBG_IOCTL_ROUTINEFn {
    public operator fun invoke(ioctltype: UShort, lpvdata: Long, cbsize: UInt): UInt
}

public typealias PWINDBG_IOCTL_ROUTINE = PWINDBG_IOCTL_ROUTINEFn?

public fun interface PWINDBG_OLDKD_EXTENSION_ROUTINEFn {
    public operator fun invoke(dwcurrentpc: UInt, lpextensionapis: Long, lpargumentstring: PCSTR)
}

public typealias PWINDBG_OLDKD_EXTENSION_ROUTINE = PWINDBG_OLDKD_EXTENSION_ROUTINEFn?

public fun interface PWINDBG_OLDKD_READ_PHYSICAL_MEMORYFn {
    public operator fun invoke(address: ULong, buffer: Long, count: UInt, bytesread: Long): UInt
}

public typealias PWINDBG_OLDKD_READ_PHYSICAL_MEMORY = PWINDBG_OLDKD_READ_PHYSICAL_MEMORYFn?

public fun interface PWINDBG_OLDKD_WRITE_PHYSICAL_MEMORYFn {
    public operator fun invoke(address: ULong, buffer: Long, length: UInt, byteswritten: Long): UInt
}

public typealias PWINDBG_OLDKD_WRITE_PHYSICAL_MEMORY = PWINDBG_OLDKD_WRITE_PHYSICAL_MEMORYFn?

public fun interface PWINDBG_OLD_EXTENSION_ROUTINEFn {
    public operator fun invoke(dwcurrentpc: UInt, lpextensionapis: Long, lpargumentstring: PCSTR)
}

public typealias PWINDBG_OLD_EXTENSION_ROUTINE = PWINDBG_OLD_EXTENSION_ROUTINEFn?

public fun interface PWINDBG_OUTPUT_ROUTINEFn {
    public operator fun invoke(lpformat: PCSTR)
}

public typealias PWINDBG_OUTPUT_ROUTINE = PWINDBG_OUTPUT_ROUTINEFn?

public fun interface PWINDBG_READ_PROCESS_MEMORY_ROUTINEFn {
    public operator fun invoke(offset: ULong, lpbuffer: Long, cb: UInt, lpcbbytesread: Long): UInt
}

public typealias PWINDBG_READ_PROCESS_MEMORY_ROUTINE = PWINDBG_READ_PROCESS_MEMORY_ROUTINEFn?

public fun interface PWINDBG_READ_PROCESS_MEMORY_ROUTINE32Fn {
    public operator fun invoke(offset: UInt, lpbuffer: Long, cb: UInt, lpcbbytesread: Long): UInt
}

public typealias PWINDBG_READ_PROCESS_MEMORY_ROUTINE32 = PWINDBG_READ_PROCESS_MEMORY_ROUTINE32Fn?

public fun interface PWINDBG_READ_PROCESS_MEMORY_ROUTINE64Fn {
    public operator fun invoke(offset: ULong, lpbuffer: Long, cb: UInt, lpcbbytesread: Long): UInt
}

public typealias PWINDBG_READ_PROCESS_MEMORY_ROUTINE64 = PWINDBG_READ_PROCESS_MEMORY_ROUTINE64Fn?

public fun interface PWINDBG_SET_THREAD_CONTEXT_ROUTINEFn {
    public operator fun invoke(processor: UInt, lpcontext: Long, cbsizeofcontext: UInt): UInt
}

public typealias PWINDBG_SET_THREAD_CONTEXT_ROUTINE = PWINDBG_SET_THREAD_CONTEXT_ROUTINEFn?

public fun interface PWINDBG_STACKTRACE_ROUTINEFn {
    public operator fun invoke(framepointer: UInt, stackpointer: UInt, programcounter: UInt, stackframes: Long, frames: UInt): UInt
}

public typealias PWINDBG_STACKTRACE_ROUTINE = PWINDBG_STACKTRACE_ROUTINEFn?

public fun interface PWINDBG_STACKTRACE_ROUTINE32Fn {
    public operator fun invoke(framepointer: UInt, stackpointer: UInt, programcounter: UInt, stackframes: Long, frames: UInt): UInt
}

public typealias PWINDBG_STACKTRACE_ROUTINE32 = PWINDBG_STACKTRACE_ROUTINE32Fn?

public fun interface PWINDBG_STACKTRACE_ROUTINE64Fn {
    public operator fun invoke(framepointer: ULong, stackpointer: ULong, programcounter: ULong, stackframes: Long, frames: UInt): UInt
}

public typealias PWINDBG_STACKTRACE_ROUTINE64 = PWINDBG_STACKTRACE_ROUTINE64Fn?

public fun interface PWINDBG_WRITE_PROCESS_MEMORY_ROUTINEFn {
    public operator fun invoke(offset: ULong, lpbuffer: Long, cb: UInt, lpcbbyteswritten: Long): UInt
}

public typealias PWINDBG_WRITE_PROCESS_MEMORY_ROUTINE = PWINDBG_WRITE_PROCESS_MEMORY_ROUTINEFn?

public fun interface PWINDBG_WRITE_PROCESS_MEMORY_ROUTINE32Fn {
    public operator fun invoke(offset: UInt, lpbuffer: Long, cb: UInt, lpcbbyteswritten: Long): UInt
}

public typealias PWINDBG_WRITE_PROCESS_MEMORY_ROUTINE32 = PWINDBG_WRITE_PROCESS_MEMORY_ROUTINE32Fn?

public fun interface PWINDBG_WRITE_PROCESS_MEMORY_ROUTINE64Fn {
    public operator fun invoke(offset: ULong, lpbuffer: Long, cb: UInt, lpcbbyteswritten: Long): UInt
}

public typealias PWINDBG_WRITE_PROCESS_MEMORY_ROUTINE64 = PWINDBG_WRITE_PROCESS_MEMORY_ROUTINE64Fn?

public typealias PointerKind = Int

public typealias PreferredFormat = Int

public typealias RawSearchFlags = Int

public typealias ScriptChangeKind = Int

public typealias ScriptDebugEvent = Int

public typealias ScriptDebugEventFilter = Int

public typealias ScriptDebugState = Int

public typealias ScriptExecutionKind = Int

public typealias SignatureComparison = Int

public typealias SymbolKind = Int

public typealias SymbolSearchOptions = Int

public typealias TANALYZE_RETURN = Int

public typealias TypeKind = Int

public typealias VarArgsKind = Int

public fun interface fnDebugFailureAnalysisCreateInstanceFn {
    public operator fun invoke(client: Long, args: PCWSTR, flags: UInt, rclsid: Long, riid: Long, ppv: Long): HRESULT
}

public typealias fnDebugFailureAnalysisCreateInstance = fnDebugFailureAnalysisCreateInstanceFn?
