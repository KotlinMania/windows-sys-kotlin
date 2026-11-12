@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.fax

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hinstance
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd

private object WindowsWin32DevicesFaxJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWin32DevicesFaxCanSendToFaxRecipient(): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesFaxFaxAbort(faxhandle: Long, jobid: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesFaxFaxAccessCheck(faxhandle: Long, accessmask: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesFaxFaxClose(faxhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesFaxFaxCompleteJobParamsA(jobparams: Long, coverpageinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesFaxFaxCompleteJobParamsW(jobparams: Long, coverpageinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesFaxFaxConnectFaxServerA(machinename: Long, faxhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesFaxFaxConnectFaxServerW(machinename: Long, faxhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesFaxFaxEnableRoutingMethodA(faxporthandle: Long, routingguid: Long, enabled: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesFaxFaxEnableRoutingMethodW(faxporthandle: Long, routingguid: Long, enabled: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesFaxFaxEnumGlobalRoutingInfoA(faxhandle: Long, routinginfo: Long, methodsreturned: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesFaxFaxEnumGlobalRoutingInfoW(faxhandle: Long, routinginfo: Long, methodsreturned: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesFaxFaxEnumJobsA(faxhandle: Long, jobentry: Long, jobsreturned: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesFaxFaxEnumJobsW(faxhandle: Long, jobentry: Long, jobsreturned: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesFaxFaxEnumPortsA(faxhandle: Long, portinfo: Long, portsreturned: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesFaxFaxEnumPortsW(faxhandle: Long, portinfo: Long, portsreturned: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesFaxFaxEnumRoutingMethodsA(faxporthandle: Long, routingmethod: Long, methodsreturned: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesFaxFaxEnumRoutingMethodsW(faxporthandle: Long, routingmethod: Long, methodsreturned: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesFaxFaxFreeBuffer(buffer: Long)

    @JvmStatic
    external fun windowssysWindowsWin32DevicesFaxFaxGetConfigurationA(faxhandle: Long, faxconfig: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesFaxFaxGetConfigurationW(faxhandle: Long, faxconfig: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesFaxFaxGetDeviceStatusA(faxporthandle: Long, devicestatus: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesFaxFaxGetDeviceStatusW(faxporthandle: Long, devicestatus: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesFaxFaxGetJobA(faxhandle: Long, jobid: Int, jobentry: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesFaxFaxGetJobW(faxhandle: Long, jobid: Int, jobentry: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesFaxFaxGetLoggingCategoriesA(faxhandle: Long, categories: Long, numbercategories: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesFaxFaxGetLoggingCategoriesW(faxhandle: Long, categories: Long, numbercategories: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesFaxFaxGetPageData(faxhandle: Long, jobid: Int, buffer: Long, buffersize: Long, imagewidth: Long, imageheight: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesFaxFaxGetPortA(faxporthandle: Long, portinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesFaxFaxGetPortW(faxporthandle: Long, portinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesFaxFaxGetRoutingInfoA(faxporthandle: Long, routingguid: Long, routinginfobuffer: Long, routinginfobuffersize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesFaxFaxGetRoutingInfoW(faxporthandle: Long, routingguid: Long, routinginfobuffer: Long, routinginfobuffersize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesFaxFaxInitializeEventQueue(faxhandle: Long, completionport: Long, completionkey: Long, hwnd: Long, messagestart: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesFaxFaxOpenPort(faxhandle: Long, deviceid: Int, flags: Int, faxporthandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesFaxFaxPrintCoverPageA(faxcontextinfo: Long, coverpageinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesFaxFaxPrintCoverPageW(faxcontextinfo: Long, coverpageinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesFaxFaxRegisterRoutingExtensionW(faxhandle: Long, extensionname: Long, friendlyname: Long, imagename: Long, callback: Long, context: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesFaxFaxRegisterServiceProviderW(deviceprovider: Long, friendlyname: Long, imagename: Long, tspname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesFaxFaxSendDocumentA(faxhandle: Long, filename: Long, jobparams: Long, coverpageinfo: Long, faxjobid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesFaxFaxSendDocumentForBroadcastA(faxhandle: Long, filename: Long, faxjobid: Long, faxrecipientcallback: Long, context: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesFaxFaxSendDocumentForBroadcastW(faxhandle: Long, filename: Long, faxjobid: Long, faxrecipientcallback: Long, context: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesFaxFaxSendDocumentW(faxhandle: Long, filename: Long, jobparams: Long, coverpageinfo: Long, faxjobid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesFaxFaxSetConfigurationA(faxhandle: Long, faxconfig: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesFaxFaxSetConfigurationW(faxhandle: Long, faxconfig: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesFaxFaxSetGlobalRoutingInfoA(faxhandle: Long, routinginfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesFaxFaxSetGlobalRoutingInfoW(faxhandle: Long, routinginfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesFaxFaxSetJobA(faxhandle: Long, jobid: Int, command: Int, jobentry: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesFaxFaxSetJobW(faxhandle: Long, jobid: Int, command: Int, jobentry: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesFaxFaxSetLoggingCategoriesA(faxhandle: Long, categories: Long, numbercategories: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesFaxFaxSetLoggingCategoriesW(faxhandle: Long, categories: Long, numbercategories: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesFaxFaxSetPortA(faxporthandle: Long, portinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesFaxFaxSetPortW(faxporthandle: Long, portinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesFaxFaxSetRoutingInfoA(faxporthandle: Long, routingguid: Long, routinginfobuffer: Long, routinginfobuffersize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesFaxFaxSetRoutingInfoW(faxporthandle: Long, routingguid: Long, routinginfobuffer: Long, routinginfobuffersize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesFaxFaxStartPrintJobA(printername: Long, printinfo: Long, faxjobid: Long, faxcontextinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesFaxFaxStartPrintJobW(printername: Long, printinfo: Long, faxjobid: Long, faxcontextinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesFaxFaxUnregisterServiceProviderW(deviceprovider: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesFaxSendToFaxRecipient(sndmode: Int, lpfilename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesFaxStiCreateInstanceW(hinst: Long, dwver: Int, ppsti: Long, punkouter: Long): Int
}

public actual fun canSendToFaxRecipient(): Bool =
    WindowsWin32DevicesFaxJniBridge.windowssysWindowsWin32DevicesFaxCanSendToFaxRecipient()

public actual fun faxAbort(faxhandle: Handle, jobid: UInt): Bool =
    WindowsWin32DevicesFaxJniBridge.windowssysWindowsWin32DevicesFaxFaxAbort(faxhandle.rawAddress, jobid.toInt())

public actual fun faxAccessCheck(faxhandle: Handle, accessmask: UInt): Bool =
    WindowsWin32DevicesFaxJniBridge.windowssysWindowsWin32DevicesFaxFaxAccessCheck(faxhandle.rawAddress, accessmask.toInt())

public actual fun faxClose(faxhandle: Handle): Bool =
    WindowsWin32DevicesFaxJniBridge.windowssysWindowsWin32DevicesFaxFaxClose(faxhandle.rawAddress)

public actual fun faxCompleteJobParamsA(jobparams: MutPtr<MutPtr<FaxJobParama>>, coverpageinfo: MutPtr<MutPtr<FaxCoverpageInfoa>>): Bool =
    WindowsWin32DevicesFaxJniBridge.windowssysWindowsWin32DevicesFaxFaxCompleteJobParamsA(jobparams.rawAddress, coverpageinfo.rawAddress)

public actual fun faxCompleteJobParamsW(jobparams: MutPtr<MutPtr<FaxJobParamw>>, coverpageinfo: MutPtr<MutPtr<FaxCoverpageInfow>>): Bool =
    WindowsWin32DevicesFaxJniBridge.windowssysWindowsWin32DevicesFaxFaxCompleteJobParamsW(jobparams.rawAddress, coverpageinfo.rawAddress)

public actual fun faxConnectFaxServerA(machinename: Pcstr, faxhandle: MutPtr<Handle>): Bool =
    WindowsWin32DevicesFaxJniBridge.windowssysWindowsWin32DevicesFaxFaxConnectFaxServerA(machinename.rawAddress, faxhandle.rawAddress)

public actual fun faxConnectFaxServerW(machinename: Pcwstr, faxhandle: MutPtr<Handle>): Bool =
    WindowsWin32DevicesFaxJniBridge.windowssysWindowsWin32DevicesFaxFaxConnectFaxServerW(machinename.rawAddress, faxhandle.rawAddress)

public actual fun faxEnableRoutingMethodA(faxporthandle: Handle, routingguid: Pcstr, enabled: Bool): Bool =
    WindowsWin32DevicesFaxJniBridge.windowssysWindowsWin32DevicesFaxFaxEnableRoutingMethodA(faxporthandle.rawAddress, routingguid.rawAddress, enabled)

public actual fun faxEnableRoutingMethodW(faxporthandle: Handle, routingguid: Pcwstr, enabled: Bool): Bool =
    WindowsWin32DevicesFaxJniBridge.windowssysWindowsWin32DevicesFaxFaxEnableRoutingMethodW(faxporthandle.rawAddress, routingguid.rawAddress, enabled)

public actual fun faxEnumGlobalRoutingInfoA(faxhandle: Handle, routinginfo: MutPtr<MutPtr<FaxGlobalRoutingInfoa>>, methodsreturned: MutPtr<UInt>): Bool =
    WindowsWin32DevicesFaxJniBridge.windowssysWindowsWin32DevicesFaxFaxEnumGlobalRoutingInfoA(faxhandle.rawAddress, routinginfo.rawAddress, methodsreturned.rawAddress)

public actual fun faxEnumGlobalRoutingInfoW(faxhandle: Handle, routinginfo: MutPtr<MutPtr<FaxGlobalRoutingInfow>>, methodsreturned: MutPtr<UInt>): Bool =
    WindowsWin32DevicesFaxJniBridge.windowssysWindowsWin32DevicesFaxFaxEnumGlobalRoutingInfoW(faxhandle.rawAddress, routinginfo.rawAddress, methodsreturned.rawAddress)

public actual fun faxEnumJobsA(faxhandle: Handle, jobentry: MutPtr<MutPtr<FaxJobEntrya>>, jobsreturned: MutPtr<UInt>): Bool =
    WindowsWin32DevicesFaxJniBridge.windowssysWindowsWin32DevicesFaxFaxEnumJobsA(faxhandle.rawAddress, jobentry.rawAddress, jobsreturned.rawAddress)

public actual fun faxEnumJobsW(faxhandle: Handle, jobentry: MutPtr<MutPtr<FaxJobEntryw>>, jobsreturned: MutPtr<UInt>): Bool =
    WindowsWin32DevicesFaxJniBridge.windowssysWindowsWin32DevicesFaxFaxEnumJobsW(faxhandle.rawAddress, jobentry.rawAddress, jobsreturned.rawAddress)

public actual fun faxEnumPortsA(faxhandle: Handle, portinfo: MutPtr<MutPtr<FaxPortInfoa>>, portsreturned: MutPtr<UInt>): Bool =
    WindowsWin32DevicesFaxJniBridge.windowssysWindowsWin32DevicesFaxFaxEnumPortsA(faxhandle.rawAddress, portinfo.rawAddress, portsreturned.rawAddress)

public actual fun faxEnumPortsW(faxhandle: Handle, portinfo: MutPtr<MutPtr<FaxPortInfow>>, portsreturned: MutPtr<UInt>): Bool =
    WindowsWin32DevicesFaxJniBridge.windowssysWindowsWin32DevicesFaxFaxEnumPortsW(faxhandle.rawAddress, portinfo.rawAddress, portsreturned.rawAddress)

public actual fun faxEnumRoutingMethodsA(faxporthandle: Handle, routingmethod: MutPtr<MutPtr<FaxRoutingMethoda>>, methodsreturned: MutPtr<UInt>): Bool =
    WindowsWin32DevicesFaxJniBridge.windowssysWindowsWin32DevicesFaxFaxEnumRoutingMethodsA(faxporthandle.rawAddress, routingmethod.rawAddress, methodsreturned.rawAddress)

public actual fun faxEnumRoutingMethodsW(faxporthandle: Handle, routingmethod: MutPtr<MutPtr<FaxRoutingMethodw>>, methodsreturned: MutPtr<UInt>): Bool =
    WindowsWin32DevicesFaxJniBridge.windowssysWindowsWin32DevicesFaxFaxEnumRoutingMethodsW(faxporthandle.rawAddress, routingmethod.rawAddress, methodsreturned.rawAddress)

public actual fun faxFreeBuffer(buffer: MutPtr<CVoid>) {
    WindowsWin32DevicesFaxJniBridge.windowssysWindowsWin32DevicesFaxFaxFreeBuffer(buffer.rawAddress)
}

public actual fun faxGetConfigurationA(faxhandle: Handle, faxconfig: MutPtr<MutPtr<FaxConfigurationa>>): Bool =
    WindowsWin32DevicesFaxJniBridge.windowssysWindowsWin32DevicesFaxFaxGetConfigurationA(faxhandle.rawAddress, faxconfig.rawAddress)

public actual fun faxGetConfigurationW(faxhandle: Handle, faxconfig: MutPtr<MutPtr<FaxConfigurationw>>): Bool =
    WindowsWin32DevicesFaxJniBridge.windowssysWindowsWin32DevicesFaxFaxGetConfigurationW(faxhandle.rawAddress, faxconfig.rawAddress)

public actual fun faxGetDeviceStatusA(faxporthandle: Handle, devicestatus: MutPtr<MutPtr<FaxDeviceStatusa>>): Bool =
    WindowsWin32DevicesFaxJniBridge.windowssysWindowsWin32DevicesFaxFaxGetDeviceStatusA(faxporthandle.rawAddress, devicestatus.rawAddress)

public actual fun faxGetDeviceStatusW(faxporthandle: Handle, devicestatus: MutPtr<MutPtr<FaxDeviceStatusw>>): Bool =
    WindowsWin32DevicesFaxJniBridge.windowssysWindowsWin32DevicesFaxFaxGetDeviceStatusW(faxporthandle.rawAddress, devicestatus.rawAddress)

public actual fun faxGetJobA(faxhandle: Handle, jobid: UInt, jobentry: MutPtr<MutPtr<FaxJobEntrya>>): Bool =
    WindowsWin32DevicesFaxJniBridge.windowssysWindowsWin32DevicesFaxFaxGetJobA(faxhandle.rawAddress, jobid.toInt(), jobentry.rawAddress)

public actual fun faxGetJobW(faxhandle: Handle, jobid: UInt, jobentry: MutPtr<MutPtr<FaxJobEntryw>>): Bool =
    WindowsWin32DevicesFaxJniBridge.windowssysWindowsWin32DevicesFaxFaxGetJobW(faxhandle.rawAddress, jobid.toInt(), jobentry.rawAddress)

public actual fun faxGetLoggingCategoriesA(faxhandle: Handle, categories: MutPtr<MutPtr<FaxLogCategorya>>, numbercategories: MutPtr<UInt>): Bool =
    WindowsWin32DevicesFaxJniBridge.windowssysWindowsWin32DevicesFaxFaxGetLoggingCategoriesA(faxhandle.rawAddress, categories.rawAddress, numbercategories.rawAddress)

public actual fun faxGetLoggingCategoriesW(faxhandle: Handle, categories: MutPtr<MutPtr<FaxLogCategoryw>>, numbercategories: MutPtr<UInt>): Bool =
    WindowsWin32DevicesFaxJniBridge.windowssysWindowsWin32DevicesFaxFaxGetLoggingCategoriesW(faxhandle.rawAddress, categories.rawAddress, numbercategories.rawAddress)

public actual fun faxGetPageData(faxhandle: Handle, jobid: UInt, buffer: MutPtr<MutPtr<UByte>>, buffersize: MutPtr<UInt>, imagewidth: MutPtr<UInt>, imageheight: MutPtr<UInt>): Bool =
    WindowsWin32DevicesFaxJniBridge.windowssysWindowsWin32DevicesFaxFaxGetPageData(faxhandle.rawAddress, jobid.toInt(), buffer.rawAddress, buffersize.rawAddress, imagewidth.rawAddress, imageheight.rawAddress)

public actual fun faxGetPortA(faxporthandle: Handle, portinfo: MutPtr<MutPtr<FaxPortInfoa>>): Bool =
    WindowsWin32DevicesFaxJniBridge.windowssysWindowsWin32DevicesFaxFaxGetPortA(faxporthandle.rawAddress, portinfo.rawAddress)

public actual fun faxGetPortW(faxporthandle: Handle, portinfo: MutPtr<MutPtr<FaxPortInfow>>): Bool =
    WindowsWin32DevicesFaxJniBridge.windowssysWindowsWin32DevicesFaxFaxGetPortW(faxporthandle.rawAddress, portinfo.rawAddress)

public actual fun faxGetRoutingInfoA(faxporthandle: Handle, routingguid: Pcstr, routinginfobuffer: MutPtr<MutPtr<UByte>>, routinginfobuffersize: MutPtr<UInt>): Bool =
    WindowsWin32DevicesFaxJniBridge.windowssysWindowsWin32DevicesFaxFaxGetRoutingInfoA(faxporthandle.rawAddress, routingguid.rawAddress, routinginfobuffer.rawAddress, routinginfobuffersize.rawAddress)

public actual fun faxGetRoutingInfoW(faxporthandle: Handle, routingguid: Pcwstr, routinginfobuffer: MutPtr<MutPtr<UByte>>, routinginfobuffersize: MutPtr<UInt>): Bool =
    WindowsWin32DevicesFaxJniBridge.windowssysWindowsWin32DevicesFaxFaxGetRoutingInfoW(faxporthandle.rawAddress, routingguid.rawAddress, routinginfobuffer.rawAddress, routinginfobuffersize.rawAddress)

public actual fun faxInitializeEventQueue(faxhandle: Handle, completionport: Handle, completionkey: ULong, hwnd: Hwnd, messagestart: UInt): Bool =
    WindowsWin32DevicesFaxJniBridge.windowssysWindowsWin32DevicesFaxFaxInitializeEventQueue(faxhandle.rawAddress, completionport.rawAddress, completionkey.toLong(), hwnd.rawAddress, messagestart.toInt())

public actual fun faxOpenPort(faxhandle: Handle, deviceid: UInt, flags: UInt, faxporthandle: MutPtr<Handle>): Bool =
    WindowsWin32DevicesFaxJniBridge.windowssysWindowsWin32DevicesFaxFaxOpenPort(faxhandle.rawAddress, deviceid.toInt(), flags.toInt(), faxporthandle.rawAddress)

public actual fun faxPrintCoverPageA(faxcontextinfo: ConstPtr<FaxContextInfoa>, coverpageinfo: ConstPtr<FaxCoverpageInfoa>): Bool =
    WindowsWin32DevicesFaxJniBridge.windowssysWindowsWin32DevicesFaxFaxPrintCoverPageA(faxcontextinfo.rawAddress, coverpageinfo.rawAddress)

public actual fun faxPrintCoverPageW(faxcontextinfo: ConstPtr<FaxContextInfow>, coverpageinfo: ConstPtr<FaxCoverpageInfow>): Bool =
    WindowsWin32DevicesFaxJniBridge.windowssysWindowsWin32DevicesFaxFaxPrintCoverPageW(faxcontextinfo.rawAddress, coverpageinfo.rawAddress)

public actual fun faxRegisterRoutingExtensionW(faxhandle: Handle, extensionname: Pcwstr, friendlyname: Pcwstr, imagename: Pcwstr, callback: PfaxRoutingInstallationCallbackw, context: ConstPtr<CVoid>): Bool =
    WindowsWin32DevicesFaxJniBridge.windowssysWindowsWin32DevicesFaxFaxRegisterRoutingExtensionW(faxhandle.rawAddress, extensionname.rawAddress, friendlyname.rawAddress, imagename.rawAddress, 0L, context.rawAddress)

public actual fun faxRegisterServiceProviderW(deviceprovider: Pcwstr, friendlyname: Pcwstr, imagename: Pcwstr, tspname: Pcwstr): Bool =
    WindowsWin32DevicesFaxJniBridge.windowssysWindowsWin32DevicesFaxFaxRegisterServiceProviderW(deviceprovider.rawAddress, friendlyname.rawAddress, imagename.rawAddress, tspname.rawAddress)

public actual fun faxSendDocumentA(faxhandle: Handle, filename: Pcstr, jobparams: ConstPtr<FaxJobParama>, coverpageinfo: ConstPtr<FaxCoverpageInfoa>, faxjobid: MutPtr<UInt>): Bool =
    WindowsWin32DevicesFaxJniBridge.windowssysWindowsWin32DevicesFaxFaxSendDocumentA(faxhandle.rawAddress, filename.rawAddress, jobparams.rawAddress, coverpageinfo.rawAddress, faxjobid.rawAddress)

public actual fun faxSendDocumentForBroadcastA(faxhandle: Handle, filename: Pcstr, faxjobid: MutPtr<UInt>, faxrecipientcallback: PfaxRecipientCallbacka, context: ConstPtr<CVoid>): Bool =
    WindowsWin32DevicesFaxJniBridge.windowssysWindowsWin32DevicesFaxFaxSendDocumentForBroadcastA(faxhandle.rawAddress, filename.rawAddress, faxjobid.rawAddress, 0L, context.rawAddress)

public actual fun faxSendDocumentForBroadcastW(faxhandle: Handle, filename: Pcwstr, faxjobid: MutPtr<UInt>, faxrecipientcallback: PfaxRecipientCallbackw, context: ConstPtr<CVoid>): Bool =
    WindowsWin32DevicesFaxJniBridge.windowssysWindowsWin32DevicesFaxFaxSendDocumentForBroadcastW(faxhandle.rawAddress, filename.rawAddress, faxjobid.rawAddress, 0L, context.rawAddress)

public actual fun faxSendDocumentW(faxhandle: Handle, filename: Pcwstr, jobparams: ConstPtr<FaxJobParamw>, coverpageinfo: ConstPtr<FaxCoverpageInfow>, faxjobid: MutPtr<UInt>): Bool =
    WindowsWin32DevicesFaxJniBridge.windowssysWindowsWin32DevicesFaxFaxSendDocumentW(faxhandle.rawAddress, filename.rawAddress, jobparams.rawAddress, coverpageinfo.rawAddress, faxjobid.rawAddress)

public actual fun faxSetConfigurationA(faxhandle: Handle, faxconfig: ConstPtr<FaxConfigurationa>): Bool =
    WindowsWin32DevicesFaxJniBridge.windowssysWindowsWin32DevicesFaxFaxSetConfigurationA(faxhandle.rawAddress, faxconfig.rawAddress)

public actual fun faxSetConfigurationW(faxhandle: Handle, faxconfig: ConstPtr<FaxConfigurationw>): Bool =
    WindowsWin32DevicesFaxJniBridge.windowssysWindowsWin32DevicesFaxFaxSetConfigurationW(faxhandle.rawAddress, faxconfig.rawAddress)

public actual fun faxSetGlobalRoutingInfoA(faxhandle: Handle, routinginfo: ConstPtr<FaxGlobalRoutingInfoa>): Bool =
    WindowsWin32DevicesFaxJniBridge.windowssysWindowsWin32DevicesFaxFaxSetGlobalRoutingInfoA(faxhandle.rawAddress, routinginfo.rawAddress)

public actual fun faxSetGlobalRoutingInfoW(faxhandle: Handle, routinginfo: ConstPtr<FaxGlobalRoutingInfow>): Bool =
    WindowsWin32DevicesFaxJniBridge.windowssysWindowsWin32DevicesFaxFaxSetGlobalRoutingInfoW(faxhandle.rawAddress, routinginfo.rawAddress)

public actual fun faxSetJobA(faxhandle: Handle, jobid: UInt, command: UInt, jobentry: ConstPtr<FaxJobEntrya>): Bool =
    WindowsWin32DevicesFaxJniBridge.windowssysWindowsWin32DevicesFaxFaxSetJobA(faxhandle.rawAddress, jobid.toInt(), command.toInt(), jobentry.rawAddress)

public actual fun faxSetJobW(faxhandle: Handle, jobid: UInt, command: UInt, jobentry: ConstPtr<FaxJobEntryw>): Bool =
    WindowsWin32DevicesFaxJniBridge.windowssysWindowsWin32DevicesFaxFaxSetJobW(faxhandle.rawAddress, jobid.toInt(), command.toInt(), jobentry.rawAddress)

public actual fun faxSetLoggingCategoriesA(faxhandle: Handle, categories: ConstPtr<FaxLogCategorya>, numbercategories: UInt): Bool =
    WindowsWin32DevicesFaxJniBridge.windowssysWindowsWin32DevicesFaxFaxSetLoggingCategoriesA(faxhandle.rawAddress, categories.rawAddress, numbercategories.toInt())

public actual fun faxSetLoggingCategoriesW(faxhandle: Handle, categories: ConstPtr<FaxLogCategoryw>, numbercategories: UInt): Bool =
    WindowsWin32DevicesFaxJniBridge.windowssysWindowsWin32DevicesFaxFaxSetLoggingCategoriesW(faxhandle.rawAddress, categories.rawAddress, numbercategories.toInt())

public actual fun faxSetPortA(faxporthandle: Handle, portinfo: ConstPtr<FaxPortInfoa>): Bool =
    WindowsWin32DevicesFaxJniBridge.windowssysWindowsWin32DevicesFaxFaxSetPortA(faxporthandle.rawAddress, portinfo.rawAddress)

public actual fun faxSetPortW(faxporthandle: Handle, portinfo: ConstPtr<FaxPortInfow>): Bool =
    WindowsWin32DevicesFaxJniBridge.windowssysWindowsWin32DevicesFaxFaxSetPortW(faxporthandle.rawAddress, portinfo.rawAddress)

public actual fun faxSetRoutingInfoA(faxporthandle: Handle, routingguid: Pcstr, routinginfobuffer: ConstPtr<UByte>, routinginfobuffersize: UInt): Bool =
    WindowsWin32DevicesFaxJniBridge.windowssysWindowsWin32DevicesFaxFaxSetRoutingInfoA(faxporthandle.rawAddress, routingguid.rawAddress, routinginfobuffer.rawAddress, routinginfobuffersize.toInt())

public actual fun faxSetRoutingInfoW(faxporthandle: Handle, routingguid: Pcwstr, routinginfobuffer: ConstPtr<UByte>, routinginfobuffersize: UInt): Bool =
    WindowsWin32DevicesFaxJniBridge.windowssysWindowsWin32DevicesFaxFaxSetRoutingInfoW(faxporthandle.rawAddress, routingguid.rawAddress, routinginfobuffer.rawAddress, routinginfobuffersize.toInt())

public actual fun faxStartPrintJobA(printername: Pcstr, printinfo: ConstPtr<FaxPrintInfoa>, faxjobid: MutPtr<UInt>, faxcontextinfo: MutPtr<FaxContextInfoa>): Bool =
    WindowsWin32DevicesFaxJniBridge.windowssysWindowsWin32DevicesFaxFaxStartPrintJobA(printername.rawAddress, printinfo.rawAddress, faxjobid.rawAddress, faxcontextinfo.rawAddress)

public actual fun faxStartPrintJobW(printername: Pcwstr, printinfo: ConstPtr<FaxPrintInfow>, faxjobid: MutPtr<UInt>, faxcontextinfo: MutPtr<FaxContextInfow>): Bool =
    WindowsWin32DevicesFaxJniBridge.windowssysWindowsWin32DevicesFaxFaxStartPrintJobW(printername.rawAddress, printinfo.rawAddress, faxjobid.rawAddress, faxcontextinfo.rawAddress)

public actual fun faxUnregisterServiceProviderW(deviceprovider: Pcwstr): Bool =
    WindowsWin32DevicesFaxJniBridge.windowssysWindowsWin32DevicesFaxFaxUnregisterServiceProviderW(deviceprovider.rawAddress)

public actual fun sendToFaxRecipient(sndmode: SendToMode, lpfilename: Pcwstr): UInt =
    WindowsWin32DevicesFaxJniBridge.windowssysWindowsWin32DevicesFaxSendToFaxRecipient(sndmode, lpfilename.rawAddress).toUInt()

public actual fun stiCreateInstanceW(hinst: Hinstance, dwver: UInt, ppsti: MutPtr<MutPtr<CVoid>>, punkouter: MutPtr<CVoid>): Hresult =
    WindowsWin32DevicesFaxJniBridge.windowssysWindowsWin32DevicesFaxStiCreateInstanceW(hinst.rawAddress, dwver.toInt(), ppsti.rawAddress, punkouter.rawAddress)
