package io.github.kotlinmania.windowssys.windows.win32.system.iis

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR

public typealias FTP_ACCESS = Int

public typealias FTP_PROCESS_STATUS = Int

public typealias HCONN = Long

public typealias HTTP_TRACE_TYPE = Int

public typealias METADATATYPES = Int

public fun interface PFN_GETEXTENSIONVERSIONFn {
    public operator fun invoke(pver: Long): BOOL
}

public typealias PFN_GETEXTENSIONVERSION = PFN_GETEXTENSIONVERSIONFn?

public fun interface PFN_HSE_CACHE_INVALIDATION_CALLBACKFn {
    public operator fun invoke(pszurl: PCWSTR): HRESULT
}

public typealias PFN_HSE_CACHE_INVALIDATION_CALLBACK = PFN_HSE_CACHE_INVALIDATION_CALLBACKFn?

public fun interface PFN_HSE_GET_PROTOCOL_MANAGER_CUSTOM_INTERFACE_CALLBACKFn {
    public operator fun invoke(pszprotocolmanagerdll: PCWSTR, pszprotocolmanagerdllinitfunction: PCWSTR, dwcustominterfaceid: UInt, ppcustominterface: Long): HRESULT
}

public typealias PFN_HSE_GET_PROTOCOL_MANAGER_CUSTOM_INTERFACE_CALLBACK = PFN_HSE_GET_PROTOCOL_MANAGER_CUSTOM_INTERFACE_CALLBACKFn?

public fun interface PFN_HSE_IO_COMPLETIONFn {
    public operator fun invoke(pecb: Long, pcontext: Long, cbio: UInt, dwerror: UInt)
}

public typealias PFN_HSE_IO_COMPLETION = PFN_HSE_IO_COMPLETIONFn?

public fun interface PFN_HTTPEXTENSIONPROCFn {
    public operator fun invoke(pecb: Long): UInt
}

public typealias PFN_HTTPEXTENSIONPROC = PFN_HTTPEXTENSIONPROCFn?

public fun interface PFN_IIS_GETSERVERVARIABLEFn {
    public operator fun invoke(param0: HCONN, param1: PCSTR, param2: Long, param3: Long): BOOL
}

public typealias PFN_IIS_GETSERVERVARIABLE = PFN_IIS_GETSERVERVARIABLEFn?

public fun interface PFN_IIS_READCLIENTFn {
    public operator fun invoke(param0: HCONN, param1: Long, param2: Long): BOOL
}

public typealias PFN_IIS_READCLIENT = PFN_IIS_READCLIENTFn?

public fun interface PFN_IIS_SERVERSUPPORTFUNCTIONFn {
    public operator fun invoke(param0: HCONN, param1: UInt, param2: Long, param3: Long, param4: Long): BOOL
}

public typealias PFN_IIS_SERVERSUPPORTFUNCTION = PFN_IIS_SERVERSUPPORTFUNCTIONFn?

public fun interface PFN_IIS_WRITECLIENTFn {
    public operator fun invoke(param0: HCONN, param1: Long, param2: Long, param3: UInt): BOOL
}

public typealias PFN_IIS_WRITECLIENT = PFN_IIS_WRITECLIENTFn?

public fun interface PFN_TERMINATEEXTENSIONFn {
    public operator fun invoke(dwflags: UInt): BOOL
}

public typealias PFN_TERMINATEEXTENSION = PFN_TERMINATEEXTENSIONFn?

public fun interface PFN_WEB_CORE_ACTIVATEFn {
    public operator fun invoke(pszapphostconfigfile: PCWSTR, pszrootwebconfigfile: PCWSTR, pszinstancename: PCWSTR): HRESULT
}

public typealias PFN_WEB_CORE_ACTIVATE = PFN_WEB_CORE_ACTIVATEFn?

public fun interface PFN_WEB_CORE_SET_METADATA_DLL_ENTRYFn {
    public operator fun invoke(pszmetadatatype: PCWSTR, pszvalue: PCWSTR): HRESULT
}

public typealias PFN_WEB_CORE_SET_METADATA_DLL_ENTRY = PFN_WEB_CORE_SET_METADATA_DLL_ENTRYFn?

public fun interface PFN_WEB_CORE_SHUTDOWNFn {
    public operator fun invoke(fimmediate: UInt): HRESULT
}

public typealias PFN_WEB_CORE_SHUTDOWN = PFN_WEB_CORE_SHUTDOWNFn?

public typealias SF_PROPERTY_IIS = Int

public typealias SF_REQ_TYPE = Int

public typealias SF_STATUS_TYPE = Int
