package io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.NTSTATUS

public typealias ADDRESS_MODE = Int

public typealias BUGCHECK_ERROR = UInt

public typealias CONTEXT_FLAGS = UInt

public typealias DBGPROP_ATTRIB_FLAGS = Int

public typealias DBGPROP_INFO = Int

public typealias DEBUG_EVENT_CODE = UInt

public fun interface DIGEST_FUNCTIONFn {
    public operator fun invoke(refdata: Long, pdata: Long, dwlength: UInt): BOOL
}

public typealias DIGEST_FUNCTION = DIGEST_FUNCTIONFn?

public typealias DUMP_TYPE = Int

public typealias EX_PROP_INFO_FLAGS = Int

public typealias FACILITY_CODE = UInt

public typealias FORMAT_MESSAGE_OPTIONS = UInt

public typealias IMAGEHLP_CBA_EVENT_SEVERITY = UInt

public typealias IMAGEHLP_EXTENDED_OPTIONS = Int

public typealias IMAGEHLP_GET_TYPE_INFO_FLAGS = UInt

public typealias IMAGEHLP_HD_TYPE = Int

public typealias IMAGEHLP_SF_TYPE = Int

public typealias IMAGEHLP_STATUS_REASON = Int

public typealias IMAGEHLP_SYMBOL_TYPE_INFO = Int

public typealias IMAGE_DEBUG_TYPE = UInt

public typealias IMAGE_DIRECTORY_ENTRY = UShort

public typealias IMAGE_DLL_CHARACTERISTICS = UShort

public typealias IMAGE_FILE_CHARACTERISTICS = UShort

public typealias IMAGE_FILE_CHARACTERISTICS2 = UInt

public typealias IMAGE_OPTIONAL_HEADER_MAGIC = UShort

public typealias IMAGE_SECTION_CHARACTERISTICS = UInt

public typealias IMAGE_SUBSYSTEM = UShort

public typealias IPMI_OS_SEL_RECORD_TYPE = Int

public fun interface LPCALL_BACK_USER_INTERRUPT_ROUTINEFn {
    public operator fun invoke(): UInt
}

public typealias LPCALL_BACK_USER_INTERRUPT_ROUTINE = LPCALL_BACK_USER_INTERRUPT_ROUTINEFn?

public fun interface LPTOP_LEVEL_EXCEPTION_FILTERFn {
    public operator fun invoke(exceptioninfo: Long): Int
}

public typealias LPTOP_LEVEL_EXCEPTION_FILTER = LPTOP_LEVEL_EXCEPTION_FILTERFn?

public fun interface MINIDUMP_CALLBACK_ROUTINEFn {
    public operator fun invoke(callbackparam: Long, callbackinput: Long, callbackoutput: Long): BOOL
}

public typealias MINIDUMP_CALLBACK_ROUTINE = MINIDUMP_CALLBACK_ROUTINEFn?

public typealias MINIDUMP_CALLBACK_TYPE = Int

public typealias MINIDUMP_HANDLE_OBJECT_INFORMATION_TYPE = Int

public typealias MINIDUMP_MISC_INFO_FLAGS = UInt

public typealias MINIDUMP_SECONDARY_FLAGS = Int

public typealias MINIDUMP_STREAM_TYPE = Int

public typealias MINIDUMP_THREAD_INFO_DUMP_FLAGS = UInt

public typealias MINIDUMP_TYPE = Int

public typealias MODLOAD_DATA_TYPE = UInt

public typealias MODULE_WRITE_FLAGS = Int

public typealias OBJECT_ATTRIB_FLAGS = Int

public typealias OPEN_THREAD_WAIT_CHAIN_SESSION_FLAGS = UInt

public fun interface PCOGETACTIVATIONSTATEFn {
    public operator fun invoke(param0: GUID, param1: UInt, param2: Long): HRESULT
}

public typealias PCOGETACTIVATIONSTATE = PCOGETACTIVATIONSTATEFn?

public fun interface PCOGETCALLSTATEFn {
    public operator fun invoke(param0: Int, param1: Long): HRESULT
}

public typealias PCOGETCALLSTATE = PCOGETCALLSTATEFn?

public fun interface PDBGHELP_CREATE_USER_DUMP_CALLBACKFn {
    public operator fun invoke(datatype: UInt, data: Long, datalength: Long, userdata: Long): BOOL
}

public typealias PDBGHELP_CREATE_USER_DUMP_CALLBACK = PDBGHELP_CREATE_USER_DUMP_CALLBACKFn?

public fun interface PENUMDIRTREE_CALLBACKFn {
    public operator fun invoke(filepath: PCSTR, callerdata: Long): BOOL
}

public typealias PENUMDIRTREE_CALLBACK = PENUMDIRTREE_CALLBACKFn?

public fun interface PENUMDIRTREE_CALLBACKWFn {
    public operator fun invoke(filepath: PCWSTR, callerdata: Long): BOOL
}

public typealias PENUMDIRTREE_CALLBACKW = PENUMDIRTREE_CALLBACKWFn?

public fun interface PENUMLOADED_MODULES_CALLBACK64Fn {
    public operator fun invoke(modulename: PCSTR, modulebase: ULong, modulesize: UInt, usercontext: Long): BOOL
}

public typealias PENUMLOADED_MODULES_CALLBACK64 = PENUMLOADED_MODULES_CALLBACK64Fn?

public fun interface PENUMLOADED_MODULES_CALLBACKW64Fn {
    public operator fun invoke(modulename: PCWSTR, modulebase: ULong, modulesize: UInt, usercontext: Long): BOOL
}

public typealias PENUMLOADED_MODULES_CALLBACKW64 = PENUMLOADED_MODULES_CALLBACKW64Fn?

public fun interface PENUMSOURCEFILETOKENSCALLBACKFn {
    public operator fun invoke(token: Long, size: ULong): BOOL
}

public typealias PENUMSOURCEFILETOKENSCALLBACK = PENUMSOURCEFILETOKENSCALLBACKFn?

public fun interface PFINDFILEINPATHCALLBACKFn {
    public operator fun invoke(filename: PCSTR, context: Long): BOOL
}

public typealias PFINDFILEINPATHCALLBACK = PFINDFILEINPATHCALLBACKFn?

public fun interface PFINDFILEINPATHCALLBACKWFn {
    public operator fun invoke(filename: PCWSTR, context: Long): BOOL
}

public typealias PFINDFILEINPATHCALLBACKW = PFINDFILEINPATHCALLBACKWFn?

public fun interface PFIND_DEBUG_FILE_CALLBACKFn {
    public operator fun invoke(filehandle: HANDLE, filename: PCSTR, callerdata: Long): BOOL
}

public typealias PFIND_DEBUG_FILE_CALLBACK = PFIND_DEBUG_FILE_CALLBACKFn?

public fun interface PFIND_DEBUG_FILE_CALLBACKWFn {
    public operator fun invoke(filehandle: HANDLE, filename: PCWSTR, callerdata: Long): BOOL
}

public typealias PFIND_DEBUG_FILE_CALLBACKW = PFIND_DEBUG_FILE_CALLBACKWFn?

public fun interface PFIND_EXE_FILE_CALLBACKFn {
    public operator fun invoke(filehandle: HANDLE, filename: PCSTR, callerdata: Long): BOOL
}

public typealias PFIND_EXE_FILE_CALLBACK = PFIND_EXE_FILE_CALLBACKFn?

public fun interface PFIND_EXE_FILE_CALLBACKWFn {
    public operator fun invoke(filehandle: HANDLE, filename: PCWSTR, callerdata: Long): BOOL
}

public typealias PFIND_EXE_FILE_CALLBACKW = PFIND_EXE_FILE_CALLBACKWFn?

public fun interface PFUNCTION_TABLE_ACCESS_ROUTINE64Fn {
    public operator fun invoke(ahprocess: HANDLE, addrbase: ULong): Long
}

public typealias PFUNCTION_TABLE_ACCESS_ROUTINE64 = PFUNCTION_TABLE_ACCESS_ROUTINE64Fn?

public fun interface PGET_MODULE_BASE_ROUTINE64Fn {
    public operator fun invoke(hprocess: HANDLE, address: ULong): ULong
}

public typealias PGET_MODULE_BASE_ROUTINE64 = PGET_MODULE_BASE_ROUTINE64Fn?

public fun interface PGET_RUNTIME_FUNCTION_CALLBACKFn {
    public operator fun invoke(controlpc: ULong, context: Long): Long
}

public typealias PGET_RUNTIME_FUNCTION_CALLBACK = PGET_RUNTIME_FUNCTION_CALLBACKFn?

public fun interface PGET_TARGET_ATTRIBUTE_VALUE64Fn {
    public operator fun invoke(hprocess: HANDLE, attribute: UInt, attributedata: ULong, attributevalue: Long): BOOL
}

public typealias PGET_TARGET_ATTRIBUTE_VALUE64 = PGET_TARGET_ATTRIBUTE_VALUE64Fn?

public fun interface PIMAGEHLP_STATUS_ROUTINEFn {
    public operator fun invoke(reason: IMAGEHLP_STATUS_REASON, imagename: PCSTR, dllname: PCSTR, va: ULong, parameter: ULong): BOOL
}

public typealias PIMAGEHLP_STATUS_ROUTINE = PIMAGEHLP_STATUS_ROUTINEFn?

public fun interface PIMAGEHLP_STATUS_ROUTINE32Fn {
    public operator fun invoke(reason: IMAGEHLP_STATUS_REASON, imagename: PCSTR, dllname: PCSTR, va: UInt, parameter: ULong): BOOL
}

public typealias PIMAGEHLP_STATUS_ROUTINE32 = PIMAGEHLP_STATUS_ROUTINE32Fn?

public fun interface PIMAGEHLP_STATUS_ROUTINE64Fn {
    public operator fun invoke(reason: IMAGEHLP_STATUS_REASON, imagename: PCSTR, dllname: PCSTR, va: ULong, parameter: ULong): BOOL
}

public typealias PIMAGEHLP_STATUS_ROUTINE64 = PIMAGEHLP_STATUS_ROUTINE64Fn?

public fun interface PREAD_PROCESS_MEMORY_ROUTINE64Fn {
    public operator fun invoke(hprocess: HANDLE, qwbaseaddress: ULong, lpbuffer: Long, nsize: UInt, lpnumberofbytesread: Long): BOOL
}

public typealias PREAD_PROCESS_MEMORY_ROUTINE64 = PREAD_PROCESS_MEMORY_ROUTINE64Fn?

public typealias PROP_INFO_FLAGS = Int

public fun interface PSYMBOLSERVERBYINDEXPROCFn {
    public operator fun invoke(param0: PCSTR, param1: PCSTR, param2: PCSTR, param3: PCSTR): BOOL
}

public typealias PSYMBOLSERVERBYINDEXPROC = PSYMBOLSERVERBYINDEXPROCFn?

public fun interface PSYMBOLSERVERBYINDEXPROCAFn {
    public operator fun invoke(param0: PCSTR, param1: PCSTR, param2: PCSTR, param3: PCSTR): BOOL
}

public typealias PSYMBOLSERVERBYINDEXPROCA = PSYMBOLSERVERBYINDEXPROCAFn?

public fun interface PSYMBOLSERVERBYINDEXPROCWFn {
    public operator fun invoke(param0: PCWSTR, param1: PCWSTR, param2: PCWSTR, param3: PCWSTR): BOOL
}

public typealias PSYMBOLSERVERBYINDEXPROCW = PSYMBOLSERVERBYINDEXPROCWFn?

public fun interface PSYMBOLSERVERCALLBACKPROCFn {
    public operator fun invoke(action: ULong, data: ULong, context: ULong): BOOL
}

public typealias PSYMBOLSERVERCALLBACKPROC = PSYMBOLSERVERCALLBACKPROCFn?

public fun interface PSYMBOLSERVERCLOSEPROCFn {
    public operator fun invoke(): BOOL
}

public typealias PSYMBOLSERVERCLOSEPROC = PSYMBOLSERVERCLOSEPROCFn?

public fun interface PSYMBOLSERVERDELTANAMEFn {
    public operator fun invoke(param0: PCSTR, param1: Long, param2: UInt, param3: UInt, param4: Long, param5: UInt, param6: UInt, param7: PCSTR, param8: ULong): BOOL
}

public typealias PSYMBOLSERVERDELTANAME = PSYMBOLSERVERDELTANAMEFn?

public fun interface PSYMBOLSERVERDELTANAMEWFn {
    public operator fun invoke(param0: PCWSTR, param1: Long, param2: UInt, param3: UInt, param4: Long, param5: UInt, param6: UInt, param7: PCWSTR, param8: ULong): BOOL
}

public typealias PSYMBOLSERVERDELTANAMEW = PSYMBOLSERVERDELTANAMEWFn?

public fun interface PSYMBOLSERVERGETINDEXSTRINGFn {
    public operator fun invoke(param0: Long, param1: UInt, param2: UInt, param3: PCSTR, param4: ULong): BOOL
}

public typealias PSYMBOLSERVERGETINDEXSTRING = PSYMBOLSERVERGETINDEXSTRINGFn?

public fun interface PSYMBOLSERVERGETINDEXSTRINGWFn {
    public operator fun invoke(param0: Long, param1: UInt, param2: UInt, param3: PCWSTR, param4: ULong): BOOL
}

public typealias PSYMBOLSERVERGETINDEXSTRINGW = PSYMBOLSERVERGETINDEXSTRINGWFn?

public fun interface PSYMBOLSERVERGETOPTIONDATAPROCFn {
    public operator fun invoke(param0: ULong, param1: Long): BOOL
}

public typealias PSYMBOLSERVERGETOPTIONDATAPROC = PSYMBOLSERVERGETOPTIONDATAPROCFn?

public fun interface PSYMBOLSERVERGETOPTIONSPROCFn {
    public operator fun invoke(): ULong
}

public typealias PSYMBOLSERVERGETOPTIONSPROC = PSYMBOLSERVERGETOPTIONSPROCFn?

public fun interface PSYMBOLSERVERGETSUPPLEMENTFn {
    public operator fun invoke(param0: PCSTR, param1: PCSTR, param2: PCSTR, param3: PCSTR, param4: ULong): BOOL
}

public typealias PSYMBOLSERVERGETSUPPLEMENT = PSYMBOLSERVERGETSUPPLEMENTFn?

public fun interface PSYMBOLSERVERGETSUPPLEMENTWFn {
    public operator fun invoke(param0: PCWSTR, param1: PCWSTR, param2: PCWSTR, param3: PCWSTR, param4: ULong): BOOL
}

public typealias PSYMBOLSERVERGETSUPPLEMENTW = PSYMBOLSERVERGETSUPPLEMENTWFn?

public fun interface PSYMBOLSERVERGETVERSIONFn {
    public operator fun invoke(param0: Long): BOOL
}

public typealias PSYMBOLSERVERGETVERSION = PSYMBOLSERVERGETVERSIONFn?

public fun interface PSYMBOLSERVERISSTOREFn {
    public operator fun invoke(param0: PCSTR): BOOL
}

public typealias PSYMBOLSERVERISSTORE = PSYMBOLSERVERISSTOREFn?

public fun interface PSYMBOLSERVERISSTOREWFn {
    public operator fun invoke(param0: PCWSTR): BOOL
}

public typealias PSYMBOLSERVERISSTOREW = PSYMBOLSERVERISSTOREWFn?

public fun interface PSYMBOLSERVERMESSAGEPROCFn {
    public operator fun invoke(action: ULong, data: ULong, context: ULong): BOOL
}

public typealias PSYMBOLSERVERMESSAGEPROC = PSYMBOLSERVERMESSAGEPROCFn?

public fun interface PSYMBOLSERVEROPENPROCFn {
    public operator fun invoke(): BOOL
}

public typealias PSYMBOLSERVEROPENPROC = PSYMBOLSERVEROPENPROCFn?

public fun interface PSYMBOLSERVERPINGPROCFn {
    public operator fun invoke(param0: PCSTR): BOOL
}

public typealias PSYMBOLSERVERPINGPROC = PSYMBOLSERVERPINGPROCFn?

public fun interface PSYMBOLSERVERPINGPROCAFn {
    public operator fun invoke(param0: PCSTR): BOOL
}

public typealias PSYMBOLSERVERPINGPROCA = PSYMBOLSERVERPINGPROCAFn?

public fun interface PSYMBOLSERVERPINGPROCWFn {
    public operator fun invoke(param0: PCWSTR): BOOL
}

public typealias PSYMBOLSERVERPINGPROCW = PSYMBOLSERVERPINGPROCWFn?

public fun interface PSYMBOLSERVERPINGPROCWEXFn {
    public operator fun invoke(param0: PCWSTR): BOOL
}

public typealias PSYMBOLSERVERPINGPROCWEX = PSYMBOLSERVERPINGPROCWEXFn?

public fun interface PSYMBOLSERVERPROCFn {
    public operator fun invoke(param0: PCSTR, param1: PCSTR, param2: Long, param3: UInt, param4: UInt, param5: PCSTR): BOOL
}

public typealias PSYMBOLSERVERPROC = PSYMBOLSERVERPROCFn?

public fun interface PSYMBOLSERVERPROCAFn {
    public operator fun invoke(param0: PCSTR, param1: PCSTR, param2: Long, param3: UInt, param4: UInt, param5: PCSTR): BOOL
}

public typealias PSYMBOLSERVERPROCA = PSYMBOLSERVERPROCAFn?

public fun interface PSYMBOLSERVERPROCWFn {
    public operator fun invoke(param0: PCWSTR, param1: PCWSTR, param2: Long, param3: UInt, param4: UInt, param5: PCWSTR): BOOL
}

public typealias PSYMBOLSERVERPROCW = PSYMBOLSERVERPROCWFn?

public fun interface PSYMBOLSERVERSETHTTPAUTHHEADERFn {
    public operator fun invoke(pszauthheader: PCWSTR): BOOL
}

public typealias PSYMBOLSERVERSETHTTPAUTHHEADER = PSYMBOLSERVERSETHTTPAUTHHEADERFn?

public fun interface PSYMBOLSERVERSETOPTIONSPROCFn {
    public operator fun invoke(param0: ULong, param1: ULong): BOOL
}

public typealias PSYMBOLSERVERSETOPTIONSPROC = PSYMBOLSERVERSETOPTIONSPROCFn?

public fun interface PSYMBOLSERVERSETOPTIONSWPROCFn {
    public operator fun invoke(param0: ULong, param1: ULong): BOOL
}

public typealias PSYMBOLSERVERSETOPTIONSWPROC = PSYMBOLSERVERSETOPTIONSWPROCFn?

public fun interface PSYMBOLSERVERSTOREFILEFn {
    public operator fun invoke(param0: PCSTR, param1: PCSTR, param2: Long, param3: UInt, param4: UInt, param5: PCSTR, param6: ULong, param7: UInt): BOOL
}

public typealias PSYMBOLSERVERSTOREFILE = PSYMBOLSERVERSTOREFILEFn?

public fun interface PSYMBOLSERVERSTOREFILEWFn {
    public operator fun invoke(param0: PCWSTR, param1: PCWSTR, param2: Long, param3: UInt, param4: UInt, param5: PCWSTR, param6: ULong, param7: UInt): BOOL
}

public typealias PSYMBOLSERVERSTOREFILEW = PSYMBOLSERVERSTOREFILEWFn?

public fun interface PSYMBOLSERVERSTORESUPPLEMENTFn {
    public operator fun invoke(param0: PCSTR, param1: PCSTR, param2: PCSTR, param3: PCSTR, param4: ULong, param5: UInt): BOOL
}

public typealias PSYMBOLSERVERSTORESUPPLEMENT = PSYMBOLSERVERSTORESUPPLEMENTFn?

public fun interface PSYMBOLSERVERSTORESUPPLEMENTWFn {
    public operator fun invoke(param0: PCWSTR, param1: PCWSTR, param2: PCWSTR, param3: PCWSTR, param4: ULong, param5: UInt): BOOL
}

public typealias PSYMBOLSERVERSTORESUPPLEMENTW = PSYMBOLSERVERSTORESUPPLEMENTWFn?

public fun interface PSYMBOLSERVERVERSIONFn {
    public operator fun invoke(): UInt
}

public typealias PSYMBOLSERVERVERSION = PSYMBOLSERVERVERSIONFn?

public fun interface PSYMBOLSERVERWEXPROCFn {
    public operator fun invoke(param0: PCWSTR, param1: PCWSTR, param2: Long, param3: UInt, param4: UInt, param5: PCWSTR, param6: Long): BOOL
}

public typealias PSYMBOLSERVERWEXPROC = PSYMBOLSERVERWEXPROCFn?

public fun interface PSYMBOL_FUNCENTRY_CALLBACKFn {
    public operator fun invoke(hprocess: HANDLE, addrbase: UInt, usercontext: Long): Long
}

public typealias PSYMBOL_FUNCENTRY_CALLBACK = PSYMBOL_FUNCENTRY_CALLBACKFn?

public fun interface PSYMBOL_FUNCENTRY_CALLBACK64Fn {
    public operator fun invoke(hprocess: HANDLE, addrbase: ULong, usercontext: ULong): Long
}

public typealias PSYMBOL_FUNCENTRY_CALLBACK64 = PSYMBOL_FUNCENTRY_CALLBACK64Fn?

public fun interface PSYMBOL_REGISTERED_CALLBACK64Fn {
    public operator fun invoke(hprocess: HANDLE, actioncode: UInt, callbackdata: ULong, usercontext: ULong): BOOL
}

public typealias PSYMBOL_REGISTERED_CALLBACK64 = PSYMBOL_REGISTERED_CALLBACK64Fn?

public fun interface PSYM_ENUMERATESYMBOLS_CALLBACKFn {
    public operator fun invoke(psyminfo: Long, symbolsize: UInt, usercontext: Long): BOOL
}

public typealias PSYM_ENUMERATESYMBOLS_CALLBACK = PSYM_ENUMERATESYMBOLS_CALLBACKFn?

public fun interface PSYM_ENUMERATESYMBOLS_CALLBACKWFn {
    public operator fun invoke(psyminfo: Long, symbolsize: UInt, usercontext: Long): BOOL
}

public typealias PSYM_ENUMERATESYMBOLS_CALLBACKW = PSYM_ENUMERATESYMBOLS_CALLBACKWFn?

public fun interface PSYM_ENUMLINES_CALLBACKFn {
    public operator fun invoke(lineinfo: Long, usercontext: Long): BOOL
}

public typealias PSYM_ENUMLINES_CALLBACK = PSYM_ENUMLINES_CALLBACKFn?

public fun interface PSYM_ENUMLINES_CALLBACKWFn {
    public operator fun invoke(lineinfo: Long, usercontext: Long): BOOL
}

public typealias PSYM_ENUMLINES_CALLBACKW = PSYM_ENUMLINES_CALLBACKWFn?

public fun interface PSYM_ENUMMODULES_CALLBACK64Fn {
    public operator fun invoke(modulename: PCSTR, baseofdll: ULong, usercontext: Long): BOOL
}

public typealias PSYM_ENUMMODULES_CALLBACK64 = PSYM_ENUMMODULES_CALLBACK64Fn?

public fun interface PSYM_ENUMMODULES_CALLBACKW64Fn {
    public operator fun invoke(modulename: PCWSTR, baseofdll: ULong, usercontext: Long): BOOL
}

public typealias PSYM_ENUMMODULES_CALLBACKW64 = PSYM_ENUMMODULES_CALLBACKW64Fn?

public fun interface PSYM_ENUMPROCESSES_CALLBACKFn {
    public operator fun invoke(hprocess: HANDLE, usercontext: Long): BOOL
}

public typealias PSYM_ENUMPROCESSES_CALLBACK = PSYM_ENUMPROCESSES_CALLBACKFn?

public fun interface PSYM_ENUMSOURCEFILES_CALLBACKFn {
    public operator fun invoke(psourcefile: Long, usercontext: Long): BOOL
}

public typealias PSYM_ENUMSOURCEFILES_CALLBACK = PSYM_ENUMSOURCEFILES_CALLBACKFn?

public fun interface PSYM_ENUMSOURCEFILES_CALLBACKWFn {
    public operator fun invoke(psourcefile: Long, usercontext: Long): BOOL
}

public typealias PSYM_ENUMSOURCEFILES_CALLBACKW = PSYM_ENUMSOURCEFILES_CALLBACKWFn?

public fun interface PSYM_ENUMSYMBOLS_CALLBACK64Fn {
    public operator fun invoke(symbolname: PCSTR, symboladdress: ULong, symbolsize: UInt, usercontext: Long): BOOL
}

public typealias PSYM_ENUMSYMBOLS_CALLBACK64 = PSYM_ENUMSYMBOLS_CALLBACK64Fn?

public fun interface PSYM_ENUMSYMBOLS_CALLBACK64WFn {
    public operator fun invoke(symbolname: PCWSTR, symboladdress: ULong, symbolsize: UInt, usercontext: Long): BOOL
}

public typealias PSYM_ENUMSYMBOLS_CALLBACK64W = PSYM_ENUMSYMBOLS_CALLBACK64WFn?

public fun interface PTRANSLATE_ADDRESS_ROUTINE64Fn {
    public operator fun invoke(hprocess: HANDLE, hthread: HANDLE, lpaddr: Long): ULong
}

public typealias PTRANSLATE_ADDRESS_ROUTINE64 = PTRANSLATE_ADDRESS_ROUTINE64Fn?

public fun interface PVECTORED_EXCEPTION_HANDLERFn {
    public operator fun invoke(exceptioninfo: Long): Int
}

public typealias PVECTORED_EXCEPTION_HANDLER = PVECTORED_EXCEPTION_HANDLERFn?

public fun interface PWAITCHAINCALLBACKFn {
    public operator fun invoke(wcthandle: Long, context: ULong, callbackstatus: UInt, nodecount: Long, nodeinfoarray: Long, iscycle: Long)
}

public typealias PWAITCHAINCALLBACK = PWAITCHAINCALLBACKFn?

public typealias RIP_INFO_TYPE = UInt

public typealias RTL_VIRTUAL_UNWIND_HANDLER_TYPE = UInt

public fun interface SYMADDSOURCESTREAMFn {
    public operator fun invoke(param0: HANDLE, param1: ULong, param2: PCSTR, param3: Long, param4: ULong): BOOL
}

public typealias SYMADDSOURCESTREAM = SYMADDSOURCESTREAMFn?

public fun interface SYMADDSOURCESTREAMAFn {
    public operator fun invoke(param0: HANDLE, param1: ULong, param2: PCSTR, param3: Long, param4: ULong): BOOL
}

public typealias SYMADDSOURCESTREAMA = SYMADDSOURCESTREAMAFn?

public typealias SYMBOL_INFO_FLAGS = UInt

public typealias SYM_FIND_ID_OPTION = UInt

public typealias SYM_LOAD_FLAGS = UInt

public typealias SYM_SRV_STORE_FILE_FLAGS = UInt

public typealias SYM_TYPE = Int

public typealias THREAD_ERROR_MODE = UInt

public typealias THREAD_WRITE_FLAGS = Int

public typealias VER_PLATFORM = UInt

public typealias WAIT_CHAIN_THREAD_OPTIONS = UInt

public typealias WCT_OBJECT_STATUS = Int

public typealias WCT_OBJECT_TYPE = Int

public fun interface WHEA_ERROR_SOURCE_CORRECT_DEVICE_DRIVERFn {
    public operator fun invoke(errorsourcedesc: Long, maximumsectionlength: Long): NTSTATUS
}

public typealias WHEA_ERROR_SOURCE_CORRECT_DEVICE_DRIVER = WHEA_ERROR_SOURCE_CORRECT_DEVICE_DRIVERFn?

public fun interface WHEA_ERROR_SOURCE_INITIALIZE_DEVICE_DRIVERFn {
    public operator fun invoke(context: Long, errorsourceid: UInt): NTSTATUS
}

public typealias WHEA_ERROR_SOURCE_INITIALIZE_DEVICE_DRIVER = WHEA_ERROR_SOURCE_INITIALIZE_DEVICE_DRIVERFn?

public typealias WHEA_ERROR_SOURCE_STATE = Int

public typealias WHEA_ERROR_SOURCE_TYPE = Int

public fun interface WHEA_ERROR_SOURCE_UNINITIALIZE_DEVICE_DRIVERFn {
    public operator fun invoke(context: Long)
}

public typealias WHEA_ERROR_SOURCE_UNINITIALIZE_DEVICE_DRIVER = WHEA_ERROR_SOURCE_UNINITIALIZE_DEVICE_DRIVERFn?

public typealias WOW64_CONTEXT_FLAGS = UInt
