package io.github.kotlinmania.windowssys.windows.win32.graphics.printing

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lparam
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hdc

public typealias BidiType = Int

public typealias EattributeDatatype = Int

public typealias EBranchOfficeJobEventType = Int

public fun interface EmfplayprocFn {
    public operator fun invoke(param0: Hdc, param1: Int, param2: Handle): Int
}

public typealias Emfplayproc = EmfplayprocFn?

public typealias EPrintPropertyType = Int

public typealias EPrintXPSJobOperation = Int

public typealias EPrintXPSJobProgress = Int

public typealias EXpsCompressionOptions = Int

public typealias EXpsFontOptions = Int

public typealias EXpsFontRestriction = Int

public typealias EXpsJobConsumption = Int

public typealias MxdcImageTypeEnums = Int

public typealias MxdcLandscapeRotationEnums = Int

public typealias MxdcS0PageEnums = Int

public typealias NotificationCallbackCommands = Int

public typealias NotificationConfigFlags = Int

public fun interface OemcuipcallbackFn {
    public operator fun invoke(param0: MutPtr, param1: MutPtr): Int
}

public typealias Oemcuipcallback = OemcuipcallbackFn?

public fun interface PfncompropsheetFn {
    public operator fun invoke(hcompropsheet: Handle, function: UInt, lparam1: Lparam, lparam2: Lparam): Long
}

public typealias Pfncompropsheet = PfncompropsheetFn?

public fun interface PfnpropsheetuiFn {
    public operator fun invoke(ppsuiinfo: MutPtr, lparam: Lparam): Int
}

public typealias Pfnpropsheetui = PfnpropsheetuiFn?

public fun interface PfnDrvGetDriverSettingFn {
    public operator fun invoke(pdriverobj: MutPtr, feature: Pcstr, poutput: MutPtr, cbsize: UInt, pcbneeded: MutPtr, pdwoptionsreturned: MutPtr): Bool
}

public typealias PfnDrvGetDriverSetting = PfnDrvGetDriverSettingFn?

public fun interface PfnDrvUpdateUisettingFn {
    public operator fun invoke(pdriverobj: MutPtr, poptitem: MutPtr, dwpreviousselection: UInt, dwmode: UInt): Bool
}

public typealias PfnDrvUpdateUisetting = PfnDrvUpdateUisettingFn?

public fun interface PfnDrvUpgradeRegistrySettingFn {
    public operator fun invoke(hprinter: Handle, pfeature: Pcstr, poption: Pcstr): Bool
}

public typealias PfnDrvUpgradeRegistrySetting = PfnDrvUpgradeRegistrySettingFn?

public fun interface PfnPrintingAddportFn {
    public operator fun invoke(param0: Pcwstr, param1: Hwnd, param2: Pcwstr): Bool
}

public typealias PfnPrintingAddport = PfnPrintingAddportFn?

public fun interface PfnPrintingAddport2Fn {
    public operator fun invoke(param0: Handle, param1: Pcwstr, param2: Hwnd, param3: Pcwstr): Bool
}

public typealias PfnPrintingAddport2 = PfnPrintingAddport2Fn?

public fun interface PfnPrintingAddportexFn {
    public operator fun invoke(param0: Pcwstr, param1: UInt, param2: ConstPtr, param3: Pcwstr): Bool
}

public typealias PfnPrintingAddportex = PfnPrintingAddportexFn?

public fun interface PfnPrintingAddportex2Fn {
    public operator fun invoke(param0: Handle, param1: Pcwstr, param2: UInt, param3: ConstPtr, param4: Pcwstr): Bool
}

public typealias PfnPrintingAddportex2 = PfnPrintingAddportex2Fn?

public fun interface PfnPrintingCloseportFn {
    public operator fun invoke(param0: Handle): Bool
}

public typealias PfnPrintingCloseport = PfnPrintingCloseportFn?

public fun interface PfnPrintingCloseport2Fn {
    public operator fun invoke(param0: Handle): Bool
}

public typealias PfnPrintingCloseport2 = PfnPrintingCloseport2Fn?

public fun interface PfnPrintingConfigureportFn {
    public operator fun invoke(param0: Pcwstr, param1: Hwnd, param2: Pcwstr): Bool
}

public typealias PfnPrintingConfigureport = PfnPrintingConfigureportFn?

public fun interface PfnPrintingConfigureport2Fn {
    public operator fun invoke(param0: Handle, param1: Pcwstr, param2: Hwnd, param3: Pcwstr): Bool
}

public typealias PfnPrintingConfigureport2 = PfnPrintingConfigureport2Fn?

public fun interface PfnPrintingDeleteportFn {
    public operator fun invoke(param0: Pcwstr, param1: Hwnd, param2: Pcwstr): Bool
}

public typealias PfnPrintingDeleteport = PfnPrintingDeleteportFn?

public fun interface PfnPrintingDeleteport2Fn {
    public operator fun invoke(param0: Handle, param1: Pcwstr, param2: Hwnd, param3: Pcwstr): Bool
}

public typealias PfnPrintingDeleteport2 = PfnPrintingDeleteport2Fn?

public fun interface PfnPrintingEnddocportFn {
    public operator fun invoke(param0: Handle): Bool
}

public typealias PfnPrintingEnddocport = PfnPrintingEnddocportFn?

public fun interface PfnPrintingEnddocport2Fn {
    public operator fun invoke(param0: Handle): Bool
}

public typealias PfnPrintingEnddocport2 = PfnPrintingEnddocport2Fn?

public fun interface PfnPrintingEnumportsFn {
    public operator fun invoke(param0: Pcwstr, param1: UInt, param2: MutPtr, param3: UInt, param4: MutPtr, param5: MutPtr): Bool
}

public typealias PfnPrintingEnumports = PfnPrintingEnumportsFn?

public fun interface PfnPrintingEnumports2Fn {
    public operator fun invoke(param0: Handle, param1: Pcwstr, param2: UInt, param3: MutPtr, param4: UInt, param5: MutPtr, param6: MutPtr): Bool
}

public typealias PfnPrintingEnumports2 = PfnPrintingEnumports2Fn?

public fun interface PfnPrintingGetprinterdatafromportFn {
    public operator fun invoke(param0: Handle, param1: UInt, param2: Pcwstr, param3: Pcwstr, param4: UInt, param5: Pcwstr, param6: UInt, param7: MutPtr): Bool
}

public typealias PfnPrintingGetprinterdatafromport = PfnPrintingGetprinterdatafromportFn?

public fun interface PfnPrintingGetprinterdatafromport2Fn {
    public operator fun invoke(param0: Handle, param1: UInt, param2: Pcwstr, param3: Pcwstr, param4: UInt, param5: Pcwstr, param6: UInt, param7: MutPtr): Bool
}

public typealias PfnPrintingGetprinterdatafromport2 = PfnPrintingGetprinterdatafromport2Fn?

public fun interface PfnPrintingNotifyunusedports2Fn {
    public operator fun invoke(param0: Handle, param1: UInt, param2: Pcwstr): UInt
}

public typealias PfnPrintingNotifyunusedports2 = PfnPrintingNotifyunusedports2Fn?

public fun interface PfnPrintingNotifyusedports2Fn {
    public operator fun invoke(param0: Handle, param1: UInt, param2: Pcwstr): UInt
}

public typealias PfnPrintingNotifyusedports2 = PfnPrintingNotifyusedports2Fn?

public fun interface PfnPrintingOpenportFn {
    public operator fun invoke(param0: Pcwstr, param1: MutPtr): Bool
}

public typealias PfnPrintingOpenport = PfnPrintingOpenportFn?

public fun interface PfnPrintingOpenport2Fn {
    public operator fun invoke(param0: Handle, param1: Pcwstr, param2: MutPtr): Bool
}

public typealias PfnPrintingOpenport2 = PfnPrintingOpenport2Fn?

public fun interface PfnPrintingOpenportexFn {
    public operator fun invoke(param0: Handle, param1: Pcwstr, param2: Pcwstr, param3: MutPtr, param4: ConstPtr): Bool
}

public typealias PfnPrintingOpenportex = PfnPrintingOpenportexFn?

public fun interface PfnPrintingOpenportex2Fn {
    public operator fun invoke(param0: Handle, param1: Handle, param2: Pcwstr, param3: Pcwstr, param4: MutPtr, param5: ConstPtr): Bool
}

public typealias PfnPrintingOpenportex2 = PfnPrintingOpenportex2Fn?

public fun interface PfnPrintingPowerevent2Fn {
    public operator fun invoke(param0: Handle, param1: UInt, param2: ConstPtr): UInt
}

public typealias PfnPrintingPowerevent2 = PfnPrintingPowerevent2Fn?

public fun interface PfnPrintingReadportFn {
    public operator fun invoke(param0: Handle, param1: MutPtr, param2: UInt, param3: MutPtr): Bool
}

public typealias PfnPrintingReadport = PfnPrintingReadportFn?

public fun interface PfnPrintingReadport2Fn {
    public operator fun invoke(param0: Handle, param1: MutPtr, param2: UInt, param3: MutPtr): Bool
}

public typealias PfnPrintingReadport2 = PfnPrintingReadport2Fn?

public fun interface PfnPrintingSendrecvbididatafromport2Fn {
    public operator fun invoke(param0: Handle, param1: UInt, param2: Pcwstr, param3: ConstPtr, param4: MutPtr): UInt
}

public typealias PfnPrintingSendrecvbididatafromport2 = PfnPrintingSendrecvbididatafromport2Fn?

public fun interface PfnPrintingSetporttimeoutsFn {
    public operator fun invoke(param0: Handle, param1: ConstPtr, param2: UInt): Bool
}

public typealias PfnPrintingSetporttimeouts = PfnPrintingSetporttimeoutsFn?

public fun interface PfnPrintingSetporttimeouts2Fn {
    public operator fun invoke(param0: Handle, param1: ConstPtr, param2: UInt): Bool
}

public typealias PfnPrintingSetporttimeouts2 = PfnPrintingSetporttimeouts2Fn?

public fun interface PfnPrintingShutdown2Fn {
    public operator fun invoke(param0: Handle)
}

public typealias PfnPrintingShutdown2 = PfnPrintingShutdown2Fn?

public fun interface PfnPrintingStartdocportFn {
    public operator fun invoke(param0: Handle, param1: Pcwstr, param2: UInt, param3: UInt, param4: ConstPtr): Bool
}

public typealias PfnPrintingStartdocport = PfnPrintingStartdocportFn?

public fun interface PfnPrintingStartdocport2Fn {
    public operator fun invoke(param0: Handle, param1: Pcwstr, param2: UInt, param3: UInt, param4: ConstPtr): Bool
}

public typealias PfnPrintingStartdocport2 = PfnPrintingStartdocport2Fn?

public fun interface PfnPrintingWriteportFn {
    public operator fun invoke(param0: Handle, param1: ConstPtr, param2: UInt, param3: MutPtr): Bool
}

public typealias PfnPrintingWriteport = PfnPrintingWriteportFn?

public fun interface PfnPrintingWriteport2Fn {
    public operator fun invoke(param0: Handle, param1: ConstPtr, param2: UInt, param3: MutPtr): Bool
}

public typealias PfnPrintingWriteport2 = PfnPrintingWriteport2Fn?

public fun interface PfnPrintingXcvcloseportFn {
    public operator fun invoke(param0: Handle): Bool
}

public typealias PfnPrintingXcvcloseport = PfnPrintingXcvcloseportFn?

public fun interface PfnPrintingXcvcloseport2Fn {
    public operator fun invoke(param0: Handle): Bool
}

public typealias PfnPrintingXcvcloseport2 = PfnPrintingXcvcloseport2Fn?

public fun interface PfnPrintingXcvdataportFn {
    public operator fun invoke(param0: Handle, param1: Pcwstr, param2: ConstPtr, param3: UInt, param4: MutPtr, param5: UInt, param6: MutPtr): UInt
}

public typealias PfnPrintingXcvdataport = PfnPrintingXcvdataportFn?

public fun interface PfnPrintingXcvdataport2Fn {
    public operator fun invoke(param0: Handle, param1: Pcwstr, param2: ConstPtr, param3: UInt, param4: MutPtr, param5: UInt, param6: MutPtr): UInt
}

public typealias PfnPrintingXcvdataport2 = PfnPrintingXcvdataport2Fn?

public fun interface PfnPrintingXcvopenportFn {
    public operator fun invoke(param0: Pcwstr, param1: UInt, param2: MutPtr): Bool
}

public typealias PfnPrintingXcvopenport = PfnPrintingXcvopenportFn?

public fun interface PfnPrintingXcvopenport2Fn {
    public operator fun invoke(param0: Handle, param1: Pcwstr, param2: UInt, param3: MutPtr): Bool
}

public typealias PfnPrintingXcvopenport2 = PfnPrintingXcvopenport2Fn?

public typealias PrinterAccessRights = UInt

public typealias PrinterOptionFlags = Int

public typealias PrintExecutionContext = Int

public typealias PageCountType = Int

public typealias PrintAsyncNotifyConversationStyle = Int

public typealias PrintAsyncNotifyError = Int

public typealias PrintAsyncNotifyUserFilter = Int

public typealias PrintJobStatus = Int

public typealias PrintSchemaConstrainedSetting = Int

public typealias PrintSchemaParameterDataType = Int

public typealias PrintSchemaSelectionType = Int

public fun interface RouterNotifyCallbackFn {
    public operator fun invoke(dwcommand: UInt, pcontext: ConstPtr, dwcolor: UInt, pnofityinfo: ConstPtr, fdwflags: UInt, pdwresult: MutPtr): Bool
}

public typealias RouterNotifyCallback = RouterNotifyCallbackFn?

public typealias Shimopts = Int

public typealias UiType = Int

public typealias XpsrasBackgroundColor = Int

public typealias XpsrasPixelFormat = Int

public typealias XpsrasRenderingMode = Int

public fun interface CpsuicallbackFn {
    public operator fun invoke(pcpsuicbparam: MutPtr): Int
}

public typealias Cpsuicallback = CpsuicallbackFn?
