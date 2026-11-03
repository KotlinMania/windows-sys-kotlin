package io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR

public typealias ACTCTX_COMPATIBILITY_ELEMENT_TYPE = Int

public typealias ACTCTX_REQUESTED_RUN_LEVEL = Int

public typealias ADVERTISEFLAGS = Int

public typealias ASM_BIND_FLAGS = Int

public typealias ASM_CMP_FLAGS = Int

public typealias ASM_DISPLAY_FLAGS = Int

public typealias ASM_NAME = Int

public typealias CREATE_ASM_NAME_OBJ_FLAGS = Int

public typealias IASSEMBLYCACHE_UNINSTALL_DISPOSITION = UInt

public typealias INSTALLFEATUREATTRIBUTE = Int

public typealias INSTALLLEVEL = Int

public typealias INSTALLLOGATTRIBUTES = Int

public typealias INSTALLLOGMODE = Int

public typealias INSTALLMESSAGE = Int

public typealias INSTALLMODE = Int

public typealias INSTALLSTATE = Int

public typealias INSTALLTYPE = Int

public typealias INSTALLUILEVEL = Int

public fun interface INSTALLUI_HANDLERAFn {
    public operator fun invoke(pvcontext: Long, imessagetype: UInt, szmessage: PCSTR): Int
}

public typealias INSTALLUI_HANDLERA = INSTALLUI_HANDLERAFn?

public fun interface INSTALLUI_HANDLERWFn {
    public operator fun invoke(pvcontext: Long, imessagetype: UInt, szmessage: PCWSTR): Int
}

public typealias INSTALLUI_HANDLERW = INSTALLUI_HANDLERWFn?

public fun interface LPDISPLAYVALFn {
    public operator fun invoke(pcontext: Long, uitype: RESULTTYPES, szwval: PCWSTR, szwdescription: PCWSTR, szwlocation: PCWSTR): BOOL
}

public typealias LPDISPLAYVAL = LPDISPLAYVALFn?

public fun interface LPEVALCOMCALLBACKFn {
    public operator fun invoke(istatus: STATUSTYPES, szdata: PCWSTR, pcontext: Long): BOOL
}

public typealias LPEVALCOMCALLBACK = LPEVALCOMCALLBACKFn?

public typealias MSIADVERTISEOPTIONFLAGS = Int

public typealias MSIARCHITECTUREFLAGS = Int

public typealias MSIASSEMBLYINFO = UInt

public typealias MSICODE = Int

public typealias MSICOLINFO = Int

public typealias MSICONDITION = Int

public typealias MSICOSTTREE = Int

public typealias MSIDBERROR = Int

public typealias MSIDBSTATE = Int

public typealias MSIHANDLE = UInt

public typealias MSIINSTALLCONTEXT = Int

public typealias MSIMODIFY = Int

public typealias MSIOPENPACKAGEFLAGS = Int

public typealias MSIPATCHDATATYPE = Int

public typealias MSIPATCHSTATE = Int

public typealias MSIRUNMODE = Int

public typealias MSISOURCETYPE = Int

public typealias MSITRANSACTION = Int

public typealias MSITRANSACTIONSTATE = UInt

public typealias MSITRANSFORM_ERROR = Int

public typealias MSITRANSFORM_VALIDATE = Int

public typealias PACKMAN_RUNTIME = Int

public fun interface PINSTALLUI_HANDLER_RECORDFn {
    public operator fun invoke(pvcontext: Long, imessagetype: UInt, hrecord: MSIHANDLE): Int
}

public typealias PINSTALLUI_HANDLER_RECORD = PINSTALLUI_HANDLER_RECORDFn?

public typealias PM_ACTIVATION_POLICY = Int

public typealias PM_APPLICATION_HUBTYPE = Int

public typealias PM_APPLICATION_INSTALL_TYPE = Int

public typealias PM_APPLICATION_STATE = Int

public typealias PM_APP_GENRE = Int

public typealias PM_ENUM_APP_FILTER = Int

public typealias PM_ENUM_BSA_FILTER = Int

public typealias PM_ENUM_BW_FILTER = Int

public typealias PM_ENUM_EXTENSION_FILTER = Int

public typealias PM_ENUM_TASK_FILTER = Int

public typealias PM_ENUM_TILE_FILTER = Int

public typealias PM_LIVETILE_RECURRENCE_TYPE = Int

public typealias PM_LOGO_SIZE = Int

public typealias PM_STARTTILE_TYPE = Int

public typealias PM_TASK_TRANSITION = Int

public typealias PM_TASK_TYPE = Int

public typealias PM_TILE_HUBTYPE = Int

public typealias PM_TILE_SIZE = Int

public fun interface PPATCH_PROGRESS_CALLBACKFn {
    public operator fun invoke(callbackcontext: Long, currentposition: UInt, maximumposition: UInt): BOOL
}

public typealias PPATCH_PROGRESS_CALLBACK = PPATCH_PROGRESS_CALLBACKFn?

public fun interface PPATCH_SYMLOAD_CALLBACKFn {
    public operator fun invoke(whichfile: UInt, symbolfilename: PCSTR, symtype: UInt, symbolfilechecksum: UInt, symbolfiletimedate: UInt, imagefilechecksum: UInt, imagefiletimedate: UInt, callbackcontext: Long): BOOL
}

public typealias PPATCH_SYMLOAD_CALLBACK = PPATCH_SYMLOAD_CALLBACKFn?

public typealias QUERYASMINFO_FLAGS = UInt

public typealias REINSTALLMODE = Int

public typealias RESULTTYPES = Int

public typealias SCRIPTFLAGS = Int

public typealias STATUSTYPES = Int

public typealias TILE_TEMPLATE_TYPE = Int

public typealias USERINFOSTATE = Int

public typealias msidbAssemblyAttributes = Int

public typealias msidbClassAttributes = Int

public typealias msidbComponentAttributes = Int

public typealias msidbControlAttributes = Int

public typealias msidbCustomActionType = Int

public typealias msidbDialogAttributes = Int

public typealias msidbEmbeddedUIAttributes = Int

public typealias msidbFeatureAttributes = Int

public typealias msidbFileAttributes = Int

public typealias msidbIniFileAction = Int

public typealias msidbLocatorType = Int

public typealias msidbMoveFileOptions = Int

public typealias msidbODBCDataSourceRegistration = Int

public typealias msidbPatchAttributes = Int

public typealias msidbRegistryRoot = Int

public typealias msidbRemoveFileInstallMode = Int

public typealias msidbServiceConfigEvent = Int

public typealias msidbServiceControlEvent = Int

public typealias msidbServiceInstallErrorControl = Int

public typealias msidbSumInfoSourceType = Int

public typealias msidbTextStyleStyleBits = Int

public typealias msidbUpgradeAttributes = Int

public typealias msifiFastInstallBits = Int

public typealias msirbRebootReason = Int

public typealias msirbRebootType = Int

public typealias msmErrorType = Int
