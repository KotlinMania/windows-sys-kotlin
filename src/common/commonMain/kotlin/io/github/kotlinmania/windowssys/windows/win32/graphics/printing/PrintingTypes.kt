package io.github.kotlinmania.windowssys.windows.win32.graphics.printing

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import io.github.kotlinmania.windowssys.windows.win32.foundation.LPARAM
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.HDC

public typealias BIDI_TYPE = Int

public typealias EATTRIBUTE_DATATYPE = Int

public typealias EBranchOfficeJobEventType = Int

public fun interface EMFPLAYPROCFn {
    public operator fun invoke(param0: HDC, param1: Int, param2: HANDLE): Int
}

public typealias EMFPLAYPROC = EMFPLAYPROCFn?

public typealias EPrintPropertyType = Int

public typealias EPrintXPSJobOperation = Int

public typealias EPrintXPSJobProgress = Int

public typealias EXpsCompressionOptions = Int

public typealias EXpsFontOptions = Int

public typealias EXpsFontRestriction = Int

public typealias EXpsJobConsumption = Int

public typealias MXDC_IMAGE_TYPE_ENUMS = Int

public typealias MXDC_LANDSCAPE_ROTATION_ENUMS = Int

public typealias MXDC_S0_PAGE_ENUMS = Int

public typealias NOTIFICATION_CALLBACK_COMMANDS = Int

public typealias NOTIFICATION_CONFIG_FLAGS = Int

public fun interface OEMCUIPCALLBACKFn {
    public operator fun invoke(param0: Long, param1: Long): Int
}

public typealias OEMCUIPCALLBACK = OEMCUIPCALLBACKFn?

public fun interface PFNCOMPROPSHEETFn {
    public operator fun invoke(hcompropsheet: HANDLE, function: UInt, lparam1: LPARAM, lparam2: LPARAM): Long
}

public typealias PFNCOMPROPSHEET = PFNCOMPROPSHEETFn?

public fun interface PFNPROPSHEETUIFn {
    public operator fun invoke(ppsuiinfo: Long, lparam: LPARAM): Int
}

public typealias PFNPROPSHEETUI = PFNPROPSHEETUIFn?

public fun interface PFN_DrvGetDriverSettingFn {
    public operator fun invoke(pdriverobj: Long, feature: PCSTR, poutput: Long, cbsize: UInt, pcbneeded: Long, pdwoptionsreturned: Long): BOOL
}

public typealias PFN_DrvGetDriverSetting = PFN_DrvGetDriverSettingFn?

public fun interface PFN_DrvUpdateUISettingFn {
    public operator fun invoke(pdriverobj: Long, poptitem: Long, dwpreviousselection: UInt, dwmode: UInt): BOOL
}

public typealias PFN_DrvUpdateUISetting = PFN_DrvUpdateUISettingFn?

public fun interface PFN_DrvUpgradeRegistrySettingFn {
    public operator fun invoke(hprinter: HANDLE, pfeature: PCSTR, poption: PCSTR): BOOL
}

public typealias PFN_DrvUpgradeRegistrySetting = PFN_DrvUpgradeRegistrySettingFn?

public fun interface PFN_PRINTING_ADDPORTFn {
    public operator fun invoke(param0: PCWSTR, param1: HWND, param2: PCWSTR): BOOL
}

public typealias PFN_PRINTING_ADDPORT = PFN_PRINTING_ADDPORTFn?

public fun interface PFN_PRINTING_ADDPORT2Fn {
    public operator fun invoke(param0: HANDLE, param1: PCWSTR, param2: HWND, param3: PCWSTR): BOOL
}

public typealias PFN_PRINTING_ADDPORT2 = PFN_PRINTING_ADDPORT2Fn?

public fun interface PFN_PRINTING_ADDPORTEXFn {
    public operator fun invoke(param0: PCWSTR, param1: UInt, param2: Long, param3: PCWSTR): BOOL
}

public typealias PFN_PRINTING_ADDPORTEX = PFN_PRINTING_ADDPORTEXFn?

public fun interface PFN_PRINTING_ADDPORTEX2Fn {
    public operator fun invoke(param0: HANDLE, param1: PCWSTR, param2: UInt, param3: Long, param4: PCWSTR): BOOL
}

public typealias PFN_PRINTING_ADDPORTEX2 = PFN_PRINTING_ADDPORTEX2Fn?

public fun interface PFN_PRINTING_CLOSEPORTFn {
    public operator fun invoke(param0: HANDLE): BOOL
}

public typealias PFN_PRINTING_CLOSEPORT = PFN_PRINTING_CLOSEPORTFn?

public fun interface PFN_PRINTING_CLOSEPORT2Fn {
    public operator fun invoke(param0: HANDLE): BOOL
}

public typealias PFN_PRINTING_CLOSEPORT2 = PFN_PRINTING_CLOSEPORT2Fn?

public fun interface PFN_PRINTING_CONFIGUREPORTFn {
    public operator fun invoke(param0: PCWSTR, param1: HWND, param2: PCWSTR): BOOL
}

public typealias PFN_PRINTING_CONFIGUREPORT = PFN_PRINTING_CONFIGUREPORTFn?

public fun interface PFN_PRINTING_CONFIGUREPORT2Fn {
    public operator fun invoke(param0: HANDLE, param1: PCWSTR, param2: HWND, param3: PCWSTR): BOOL
}

public typealias PFN_PRINTING_CONFIGUREPORT2 = PFN_PRINTING_CONFIGUREPORT2Fn?

public fun interface PFN_PRINTING_DELETEPORTFn {
    public operator fun invoke(param0: PCWSTR, param1: HWND, param2: PCWSTR): BOOL
}

public typealias PFN_PRINTING_DELETEPORT = PFN_PRINTING_DELETEPORTFn?

public fun interface PFN_PRINTING_DELETEPORT2Fn {
    public operator fun invoke(param0: HANDLE, param1: PCWSTR, param2: HWND, param3: PCWSTR): BOOL
}

public typealias PFN_PRINTING_DELETEPORT2 = PFN_PRINTING_DELETEPORT2Fn?

public fun interface PFN_PRINTING_ENDDOCPORTFn {
    public operator fun invoke(param0: HANDLE): BOOL
}

public typealias PFN_PRINTING_ENDDOCPORT = PFN_PRINTING_ENDDOCPORTFn?

public fun interface PFN_PRINTING_ENDDOCPORT2Fn {
    public operator fun invoke(param0: HANDLE): BOOL
}

public typealias PFN_PRINTING_ENDDOCPORT2 = PFN_PRINTING_ENDDOCPORT2Fn?

public fun interface PFN_PRINTING_ENUMPORTSFn {
    public operator fun invoke(param0: PCWSTR, param1: UInt, param2: Long, param3: UInt, param4: Long, param5: Long): BOOL
}

public typealias PFN_PRINTING_ENUMPORTS = PFN_PRINTING_ENUMPORTSFn?

public fun interface PFN_PRINTING_ENUMPORTS2Fn {
    public operator fun invoke(param0: HANDLE, param1: PCWSTR, param2: UInt, param3: Long, param4: UInt, param5: Long, param6: Long): BOOL
}

public typealias PFN_PRINTING_ENUMPORTS2 = PFN_PRINTING_ENUMPORTS2Fn?

public fun interface PFN_PRINTING_GETPRINTERDATAFROMPORTFn {
    public operator fun invoke(param0: HANDLE, param1: UInt, param2: PCWSTR, param3: PCWSTR, param4: UInt, param5: PCWSTR, param6: UInt, param7: Long): BOOL
}

public typealias PFN_PRINTING_GETPRINTERDATAFROMPORT = PFN_PRINTING_GETPRINTERDATAFROMPORTFn?

public fun interface PFN_PRINTING_GETPRINTERDATAFROMPORT2Fn {
    public operator fun invoke(param0: HANDLE, param1: UInt, param2: PCWSTR, param3: PCWSTR, param4: UInt, param5: PCWSTR, param6: UInt, param7: Long): BOOL
}

public typealias PFN_PRINTING_GETPRINTERDATAFROMPORT2 = PFN_PRINTING_GETPRINTERDATAFROMPORT2Fn?

public fun interface PFN_PRINTING_NOTIFYUNUSEDPORTS2Fn {
    public operator fun invoke(param0: HANDLE, param1: UInt, param2: PCWSTR): UInt
}

public typealias PFN_PRINTING_NOTIFYUNUSEDPORTS2 = PFN_PRINTING_NOTIFYUNUSEDPORTS2Fn?

public fun interface PFN_PRINTING_NOTIFYUSEDPORTS2Fn {
    public operator fun invoke(param0: HANDLE, param1: UInt, param2: PCWSTR): UInt
}

public typealias PFN_PRINTING_NOTIFYUSEDPORTS2 = PFN_PRINTING_NOTIFYUSEDPORTS2Fn?

public fun interface PFN_PRINTING_OPENPORTFn {
    public operator fun invoke(param0: PCWSTR, param1: Long): BOOL
}

public typealias PFN_PRINTING_OPENPORT = PFN_PRINTING_OPENPORTFn?

public fun interface PFN_PRINTING_OPENPORT2Fn {
    public operator fun invoke(param0: HANDLE, param1: PCWSTR, param2: Long): BOOL
}

public typealias PFN_PRINTING_OPENPORT2 = PFN_PRINTING_OPENPORT2Fn?

public fun interface PFN_PRINTING_OPENPORTEXFn {
    public operator fun invoke(param0: HANDLE, param1: PCWSTR, param2: PCWSTR, param3: Long, param4: Long): BOOL
}

public typealias PFN_PRINTING_OPENPORTEX = PFN_PRINTING_OPENPORTEXFn?

public fun interface PFN_PRINTING_OPENPORTEX2Fn {
    public operator fun invoke(param0: HANDLE, param1: HANDLE, param2: PCWSTR, param3: PCWSTR, param4: Long, param5: Long): BOOL
}

public typealias PFN_PRINTING_OPENPORTEX2 = PFN_PRINTING_OPENPORTEX2Fn?

public fun interface PFN_PRINTING_POWEREVENT2Fn {
    public operator fun invoke(param0: HANDLE, param1: UInt, param2: Long): UInt
}

public typealias PFN_PRINTING_POWEREVENT2 = PFN_PRINTING_POWEREVENT2Fn?

public fun interface PFN_PRINTING_READPORTFn {
    public operator fun invoke(param0: HANDLE, param1: Long, param2: UInt, param3: Long): BOOL
}

public typealias PFN_PRINTING_READPORT = PFN_PRINTING_READPORTFn?

public fun interface PFN_PRINTING_READPORT2Fn {
    public operator fun invoke(param0: HANDLE, param1: Long, param2: UInt, param3: Long): BOOL
}

public typealias PFN_PRINTING_READPORT2 = PFN_PRINTING_READPORT2Fn?

public fun interface PFN_PRINTING_SENDRECVBIDIDATAFROMPORT2Fn {
    public operator fun invoke(param0: HANDLE, param1: UInt, param2: PCWSTR, param3: Long, param4: Long): UInt
}

public typealias PFN_PRINTING_SENDRECVBIDIDATAFROMPORT2 = PFN_PRINTING_SENDRECVBIDIDATAFROMPORT2Fn?

public fun interface PFN_PRINTING_SETPORTTIMEOUTSFn {
    public operator fun invoke(param0: HANDLE, param1: Long, param2: UInt): BOOL
}

public typealias PFN_PRINTING_SETPORTTIMEOUTS = PFN_PRINTING_SETPORTTIMEOUTSFn?

public fun interface PFN_PRINTING_SETPORTTIMEOUTS2Fn {
    public operator fun invoke(param0: HANDLE, param1: Long, param2: UInt): BOOL
}

public typealias PFN_PRINTING_SETPORTTIMEOUTS2 = PFN_PRINTING_SETPORTTIMEOUTS2Fn?

public fun interface PFN_PRINTING_SHUTDOWN2Fn {
    public operator fun invoke(param0: HANDLE)
}

public typealias PFN_PRINTING_SHUTDOWN2 = PFN_PRINTING_SHUTDOWN2Fn?

public fun interface PFN_PRINTING_STARTDOCPORTFn {
    public operator fun invoke(param0: HANDLE, param1: PCWSTR, param2: UInt, param3: UInt, param4: Long): BOOL
}

public typealias PFN_PRINTING_STARTDOCPORT = PFN_PRINTING_STARTDOCPORTFn?

public fun interface PFN_PRINTING_STARTDOCPORT2Fn {
    public operator fun invoke(param0: HANDLE, param1: PCWSTR, param2: UInt, param3: UInt, param4: Long): BOOL
}

public typealias PFN_PRINTING_STARTDOCPORT2 = PFN_PRINTING_STARTDOCPORT2Fn?

public fun interface PFN_PRINTING_WRITEPORTFn {
    public operator fun invoke(param0: HANDLE, param1: Long, param2: UInt, param3: Long): BOOL
}

public typealias PFN_PRINTING_WRITEPORT = PFN_PRINTING_WRITEPORTFn?

public fun interface PFN_PRINTING_WRITEPORT2Fn {
    public operator fun invoke(param0: HANDLE, param1: Long, param2: UInt, param3: Long): BOOL
}

public typealias PFN_PRINTING_WRITEPORT2 = PFN_PRINTING_WRITEPORT2Fn?

public fun interface PFN_PRINTING_XCVCLOSEPORTFn {
    public operator fun invoke(param0: HANDLE): BOOL
}

public typealias PFN_PRINTING_XCVCLOSEPORT = PFN_PRINTING_XCVCLOSEPORTFn?

public fun interface PFN_PRINTING_XCVCLOSEPORT2Fn {
    public operator fun invoke(param0: HANDLE): BOOL
}

public typealias PFN_PRINTING_XCVCLOSEPORT2 = PFN_PRINTING_XCVCLOSEPORT2Fn?

public fun interface PFN_PRINTING_XCVDATAPORTFn {
    public operator fun invoke(param0: HANDLE, param1: PCWSTR, param2: Long, param3: UInt, param4: Long, param5: UInt, param6: Long): UInt
}

public typealias PFN_PRINTING_XCVDATAPORT = PFN_PRINTING_XCVDATAPORTFn?

public fun interface PFN_PRINTING_XCVDATAPORT2Fn {
    public operator fun invoke(param0: HANDLE, param1: PCWSTR, param2: Long, param3: UInt, param4: Long, param5: UInt, param6: Long): UInt
}

public typealias PFN_PRINTING_XCVDATAPORT2 = PFN_PRINTING_XCVDATAPORT2Fn?

public fun interface PFN_PRINTING_XCVOPENPORTFn {
    public operator fun invoke(param0: PCWSTR, param1: UInt, param2: Long): BOOL
}

public typealias PFN_PRINTING_XCVOPENPORT = PFN_PRINTING_XCVOPENPORTFn?

public fun interface PFN_PRINTING_XCVOPENPORT2Fn {
    public operator fun invoke(param0: HANDLE, param1: PCWSTR, param2: UInt, param3: Long): BOOL
}

public typealias PFN_PRINTING_XCVOPENPORT2 = PFN_PRINTING_XCVOPENPORT2Fn?

public typealias PRINTER_ACCESS_RIGHTS = UInt

public typealias PRINTER_OPTION_FLAGS = Int

public typealias PRINT_EXECUTION_CONTEXT = Int

public typealias PageCountType = Int

public typealias PrintAsyncNotifyConversationStyle = Int

public typealias PrintAsyncNotifyError = Int

public typealias PrintAsyncNotifyUserFilter = Int

public typealias PrintJobStatus = Int

public typealias PrintSchemaConstrainedSetting = Int

public typealias PrintSchemaParameterDataType = Int

public typealias PrintSchemaSelectionType = Int

public fun interface ROUTER_NOTIFY_CALLBACKFn {
    public operator fun invoke(dwcommand: UInt, pcontext: Long, dwcolor: UInt, pnofityinfo: Long, fdwflags: UInt, pdwresult: Long): BOOL
}

public typealias ROUTER_NOTIFY_CALLBACK = ROUTER_NOTIFY_CALLBACKFn?

public typealias SHIMOPTS = Int

public typealias UI_TYPE = Int

public typealias XPSRAS_BACKGROUND_COLOR = Int

public typealias XPSRAS_PIXEL_FORMAT = Int

public typealias XPSRAS_RENDERING_MODE = Int

public fun interface _CPSUICALLBACKFn {
    public operator fun invoke(pcpsuicbparam: Long): Int
}

public typealias _CPSUICALLBACK = _CPSUICALLBACKFn?
