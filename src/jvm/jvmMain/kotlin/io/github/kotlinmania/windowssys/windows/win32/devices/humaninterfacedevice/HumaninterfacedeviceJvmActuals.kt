@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hinstance
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus

private object WindowsWin32DevicesHumaninterfacedeviceJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_devices_humaninterfacedevice_directInput8Create(hinst: Long, dwversion: Int, riidltf: Long, ppvout: Long, punkouter: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_humaninterfacedevice_hidDFlushQueue(hiddeviceobject: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_devices_humaninterfacedevice_hidDFreePreparsedData(preparseddata: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_devices_humaninterfacedevice_hidDGetAttributes(hiddeviceobject: Long, attributes: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_devices_humaninterfacedevice_hidDGetConfiguration(hiddeviceobject: Long, configuration: Long, configurationlength: Int): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_devices_humaninterfacedevice_hidDGetFeature(hiddeviceobject: Long, reportbuffer: Long, reportbufferlength: Int): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_devices_humaninterfacedevice_hidDGetHidGuid(hidguid: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_humaninterfacedevice_hidDGetIndexedString(hiddeviceobject: Long, stringindex: Int, buffer: Long, bufferlength: Int): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_devices_humaninterfacedevice_hidDGetInputReport(hiddeviceobject: Long, reportbuffer: Long, reportbufferlength: Int): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_devices_humaninterfacedevice_hidDGetManufacturerString(hiddeviceobject: Long, buffer: Long, bufferlength: Int): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_devices_humaninterfacedevice_hidDGetMsGenreDescriptor(hiddeviceobject: Long, buffer: Long, bufferlength: Int): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_devices_humaninterfacedevice_hidDGetNumInputBuffers(hiddeviceobject: Long, numberbuffers: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_devices_humaninterfacedevice_hidDGetPhysicalDescriptor(hiddeviceobject: Long, buffer: Long, bufferlength: Int): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_devices_humaninterfacedevice_hidDGetPreparsedData(hiddeviceobject: Long, preparseddata: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_devices_humaninterfacedevice_hidDGetProductString(hiddeviceobject: Long, buffer: Long, bufferlength: Int): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_devices_humaninterfacedevice_hidDGetSerialNumberString(hiddeviceobject: Long, buffer: Long, bufferlength: Int): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_devices_humaninterfacedevice_hidDSetConfiguration(hiddeviceobject: Long, configuration: Long, configurationlength: Int): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_devices_humaninterfacedevice_hidDSetFeature(hiddeviceobject: Long, reportbuffer: Long, reportbufferlength: Int): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_devices_humaninterfacedevice_hidDSetNumInputBuffers(hiddeviceobject: Long, numberbuffers: Int): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_devices_humaninterfacedevice_hidDSetOutputReport(hiddeviceobject: Long, reportbuffer: Long, reportbufferlength: Int): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_devices_humaninterfacedevice_hidPGetButtonArray(reporttype: Int, usagepage: Short, linkcollection: Short, usage: Short, buttondata: Long, buttondatalength: Long, preparseddata: Long, report: Long, reportlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_humaninterfacedevice_hidPGetButtonCaps(reporttype: Int, buttoncaps: Long, buttoncapslength: Long, preparseddata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_humaninterfacedevice_hidPGetCaps(preparseddata: Long, capabilities: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_humaninterfacedevice_hidPGetData(reporttype: Int, datalist: Long, datalength: Long, preparseddata: Long, report: Long, reportlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_humaninterfacedevice_hidPGetExtendedAttributes(reporttype: Int, dataindex: Short, preparseddata: Long, attributes: Long, lengthattributes: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_humaninterfacedevice_hidPGetLinkCollectionNodes(linkcollectionnodes: Long, linkcollectionnodeslength: Long, preparseddata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_humaninterfacedevice_hidPGetScaledUsageValue(reporttype: Int, usagepage: Short, linkcollection: Short, usage: Short, usagevalue: Long, preparseddata: Long, report: Long, reportlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_humaninterfacedevice_hidPGetSpecificButtonCaps(reporttype: Int, usagepage: Short, linkcollection: Short, usage: Short, buttoncaps: Long, buttoncapslength: Long, preparseddata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_humaninterfacedevice_hidPGetSpecificValueCaps(reporttype: Int, usagepage: Short, linkcollection: Short, usage: Short, valuecaps: Long, valuecapslength: Long, preparseddata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_humaninterfacedevice_hidPGetUsageValue(reporttype: Int, usagepage: Short, linkcollection: Short, usage: Short, usagevalue: Long, preparseddata: Long, report: Long, reportlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_humaninterfacedevice_hidPGetUsageValueArray(reporttype: Int, usagepage: Short, linkcollection: Short, usage: Short, usagevalue: Long, usagevaluebytelength: Short, preparseddata: Long, report: Long, reportlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_humaninterfacedevice_hidPGetUsages(reporttype: Int, usagepage: Short, linkcollection: Short, usagelist: Long, usagelength: Long, preparseddata: Long, report: Long, reportlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_humaninterfacedevice_hidPGetUsagesEx(reporttype: Int, linkcollection: Short, buttonlist: Long, usagelength: Long, preparseddata: Long, report: Long, reportlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_humaninterfacedevice_hidPGetValueCaps(reporttype: Int, valuecaps: Long, valuecapslength: Long, preparseddata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_humaninterfacedevice_hidPInitializeReportForId(reporttype: Int, reportid: Byte, preparseddata: Long, report: Long, reportlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_humaninterfacedevice_hidPMaxDataListLength(reporttype: Int, preparseddata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_humaninterfacedevice_hidPMaxUsageListLength(reporttype: Int, usagepage: Short, preparseddata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_humaninterfacedevice_hidPSetButtonArray(reporttype: Int, usagepage: Short, linkcollection: Short, usage: Short, buttondata: Long, buttondatalength: Short, preparseddata: Long, report: Long, reportlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_humaninterfacedevice_hidPSetData(reporttype: Int, datalist: Long, datalength: Long, preparseddata: Long, report: Long, reportlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_humaninterfacedevice_hidPSetScaledUsageValue(reporttype: Int, usagepage: Short, linkcollection: Short, usage: Short, usagevalue: Int, preparseddata: Long, report: Long, reportlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_humaninterfacedevice_hidPSetUsageValue(reporttype: Int, usagepage: Short, linkcollection: Short, usage: Short, usagevalue: Int, preparseddata: Long, report: Long, reportlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_humaninterfacedevice_hidPSetUsageValueArray(reporttype: Int, usagepage: Short, linkcollection: Short, usage: Short, usagevalue: Long, usagevaluebytelength: Short, preparseddata: Long, report: Long, reportlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_humaninterfacedevice_hidPSetUsages(reporttype: Int, usagepage: Short, linkcollection: Short, usagelist: Long, usagelength: Long, preparseddata: Long, report: Long, reportlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_humaninterfacedevice_hidPTranslateUsagesToI8042ScanCodes(changedusagelist: Long, usagelistlength: Int, keyaction: Int, modifierstate: Long, insertcodesprocedure: Long, insertcodescontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_humaninterfacedevice_hidPUnsetUsages(reporttype: Int, usagepage: Short, linkcollection: Short, usagelist: Long, usagelength: Long, preparseddata: Long, report: Long, reportlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_humaninterfacedevice_hidPUsageListDifference(previoususagelist: Long, currentusagelist: Long, breakusagelist: Long, makeusagelist: Long, usagelistlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_humaninterfacedevice_joyConfigChanged(dwflags: Int): Int
}

public actual fun directInput8Create(hinst: Hinstance, dwversion: UInt, riidltf: COpaquePointer?, ppvout: COpaquePointer?, punkouter: COpaquePointer?): Hresult =
    WindowsWin32DevicesHumaninterfacedeviceJniBridge.windowssys_windows_win32_devices_humaninterfacedevice_directInput8Create((hinst?.value ?: 0L), dwversion.toInt(), (riidltf?.value ?: 0L), (ppvout?.value ?: 0L), (punkouter?.value ?: 0L))

public actual fun hidDFlushQueue(hiddeviceobject: Handle): Boolean =
    WindowsWin32DevicesHumaninterfacedeviceJniBridge.windowssys_windows_win32_devices_humaninterfacedevice_hidDFlushQueue((hiddeviceobject?.value ?: 0L))

public actual fun hidDFreePreparsedData(preparseddata: PhidpPreparsedData): Boolean =
    WindowsWin32DevicesHumaninterfacedeviceJniBridge.windowssys_windows_win32_devices_humaninterfacedevice_hidDFreePreparsedData(preparseddata.toLong())

public actual fun hidDGetAttributes(hiddeviceobject: Handle, attributes: COpaquePointer?): Boolean =
    WindowsWin32DevicesHumaninterfacedeviceJniBridge.windowssys_windows_win32_devices_humaninterfacedevice_hidDGetAttributes((hiddeviceobject?.value ?: 0L), (attributes?.value ?: 0L))

public actual fun hidDGetConfiguration(hiddeviceobject: Handle, configuration: COpaquePointer?, configurationlength: UInt): Boolean =
    WindowsWin32DevicesHumaninterfacedeviceJniBridge.windowssys_windows_win32_devices_humaninterfacedevice_hidDGetConfiguration((hiddeviceobject?.value ?: 0L), (configuration?.value ?: 0L), configurationlength.toInt())

public actual fun hidDGetFeature(hiddeviceobject: Handle, reportbuffer: COpaquePointer?, reportbufferlength: UInt): Boolean =
    WindowsWin32DevicesHumaninterfacedeviceJniBridge.windowssys_windows_win32_devices_humaninterfacedevice_hidDGetFeature((hiddeviceobject?.value ?: 0L), (reportbuffer?.value ?: 0L), reportbufferlength.toInt())

public actual fun hidDGetHidGuid(hidguid: COpaquePointer?) {
    WindowsWin32DevicesHumaninterfacedeviceJniBridge.windowssys_windows_win32_devices_humaninterfacedevice_hidDGetHidGuid((hidguid?.value ?: 0L))
}

public actual fun hidDGetIndexedString(hiddeviceobject: Handle, stringindex: UInt, buffer: COpaquePointer?, bufferlength: UInt): Boolean =
    WindowsWin32DevicesHumaninterfacedeviceJniBridge.windowssys_windows_win32_devices_humaninterfacedevice_hidDGetIndexedString((hiddeviceobject?.value ?: 0L), stringindex.toInt(), (buffer?.value ?: 0L), bufferlength.toInt())

public actual fun hidDGetInputReport(hiddeviceobject: Handle, reportbuffer: COpaquePointer?, reportbufferlength: UInt): Boolean =
    WindowsWin32DevicesHumaninterfacedeviceJniBridge.windowssys_windows_win32_devices_humaninterfacedevice_hidDGetInputReport((hiddeviceobject?.value ?: 0L), (reportbuffer?.value ?: 0L), reportbufferlength.toInt())

public actual fun hidDGetManufacturerString(hiddeviceobject: Handle, buffer: COpaquePointer?, bufferlength: UInt): Boolean =
    WindowsWin32DevicesHumaninterfacedeviceJniBridge.windowssys_windows_win32_devices_humaninterfacedevice_hidDGetManufacturerString((hiddeviceobject?.value ?: 0L), (buffer?.value ?: 0L), bufferlength.toInt())

public actual fun hidDGetMsGenreDescriptor(hiddeviceobject: Handle, buffer: COpaquePointer?, bufferlength: UInt): Boolean =
    WindowsWin32DevicesHumaninterfacedeviceJniBridge.windowssys_windows_win32_devices_humaninterfacedevice_hidDGetMsGenreDescriptor((hiddeviceobject?.value ?: 0L), (buffer?.value ?: 0L), bufferlength.toInt())

public actual fun hidDGetNumInputBuffers(hiddeviceobject: Handle, numberbuffers: COpaquePointer?): Boolean =
    WindowsWin32DevicesHumaninterfacedeviceJniBridge.windowssys_windows_win32_devices_humaninterfacedevice_hidDGetNumInputBuffers((hiddeviceobject?.value ?: 0L), (numberbuffers?.value ?: 0L))

public actual fun hidDGetPhysicalDescriptor(hiddeviceobject: Handle, buffer: COpaquePointer?, bufferlength: UInt): Boolean =
    WindowsWin32DevicesHumaninterfacedeviceJniBridge.windowssys_windows_win32_devices_humaninterfacedevice_hidDGetPhysicalDescriptor((hiddeviceobject?.value ?: 0L), (buffer?.value ?: 0L), bufferlength.toInt())

public actual fun hidDGetPreparsedData(hiddeviceobject: Handle, preparseddata: COpaquePointer?): Boolean =
    WindowsWin32DevicesHumaninterfacedeviceJniBridge.windowssys_windows_win32_devices_humaninterfacedevice_hidDGetPreparsedData((hiddeviceobject?.value ?: 0L), (preparseddata?.value ?: 0L))

public actual fun hidDGetProductString(hiddeviceobject: Handle, buffer: COpaquePointer?, bufferlength: UInt): Boolean =
    WindowsWin32DevicesHumaninterfacedeviceJniBridge.windowssys_windows_win32_devices_humaninterfacedevice_hidDGetProductString((hiddeviceobject?.value ?: 0L), (buffer?.value ?: 0L), bufferlength.toInt())

public actual fun hidDGetSerialNumberString(hiddeviceobject: Handle, buffer: COpaquePointer?, bufferlength: UInt): Boolean =
    WindowsWin32DevicesHumaninterfacedeviceJniBridge.windowssys_windows_win32_devices_humaninterfacedevice_hidDGetSerialNumberString((hiddeviceobject?.value ?: 0L), (buffer?.value ?: 0L), bufferlength.toInt())

public actual fun hidDSetConfiguration(hiddeviceobject: Handle, configuration: COpaquePointer?, configurationlength: UInt): Boolean =
    WindowsWin32DevicesHumaninterfacedeviceJniBridge.windowssys_windows_win32_devices_humaninterfacedevice_hidDSetConfiguration((hiddeviceobject?.value ?: 0L), (configuration?.value ?: 0L), configurationlength.toInt())

public actual fun hidDSetFeature(hiddeviceobject: Handle, reportbuffer: COpaquePointer?, reportbufferlength: UInt): Boolean =
    WindowsWin32DevicesHumaninterfacedeviceJniBridge.windowssys_windows_win32_devices_humaninterfacedevice_hidDSetFeature((hiddeviceobject?.value ?: 0L), (reportbuffer?.value ?: 0L), reportbufferlength.toInt())

public actual fun hidDSetNumInputBuffers(hiddeviceobject: Handle, numberbuffers: UInt): Boolean =
    WindowsWin32DevicesHumaninterfacedeviceJniBridge.windowssys_windows_win32_devices_humaninterfacedevice_hidDSetNumInputBuffers((hiddeviceobject?.value ?: 0L), numberbuffers.toInt())

public actual fun hidDSetOutputReport(hiddeviceobject: Handle, reportbuffer: COpaquePointer?, reportbufferlength: UInt): Boolean =
    WindowsWin32DevicesHumaninterfacedeviceJniBridge.windowssys_windows_win32_devices_humaninterfacedevice_hidDSetOutputReport((hiddeviceobject?.value ?: 0L), (reportbuffer?.value ?: 0L), reportbufferlength.toInt())

public actual fun hidPGetButtonArray(reporttype: HidpReportType, usagepage: UShort, linkcollection: UShort, usage: UShort, buttondata: COpaquePointer?, buttondatalength: COpaquePointer?, preparseddata: PhidpPreparsedData, report: Pcstr, reportlength: UInt): Ntstatus =
    WindowsWin32DevicesHumaninterfacedeviceJniBridge.windowssys_windows_win32_devices_humaninterfacedevice_hidPGetButtonArray(reporttype, usagepage.toShort(), linkcollection.toShort(), usage.toShort(), (buttondata?.value ?: 0L), (buttondatalength?.value ?: 0L), preparseddata.toLong(), (report?.value ?: 0L), reportlength.toInt())

public actual fun hidPGetButtonCaps(reporttype: HidpReportType, buttoncaps: COpaquePointer?, buttoncapslength: COpaquePointer?, preparseddata: PhidpPreparsedData): Ntstatus =
    WindowsWin32DevicesHumaninterfacedeviceJniBridge.windowssys_windows_win32_devices_humaninterfacedevice_hidPGetButtonCaps(reporttype, (buttoncaps?.value ?: 0L), (buttoncapslength?.value ?: 0L), preparseddata.toLong())

public actual fun hidPGetCaps(preparseddata: PhidpPreparsedData, capabilities: COpaquePointer?): Ntstatus =
    WindowsWin32DevicesHumaninterfacedeviceJniBridge.windowssys_windows_win32_devices_humaninterfacedevice_hidPGetCaps(preparseddata.toLong(), (capabilities?.value ?: 0L))

public actual fun hidPGetData(reporttype: HidpReportType, datalist: COpaquePointer?, datalength: COpaquePointer?, preparseddata: PhidpPreparsedData, report: Pstr, reportlength: UInt): Ntstatus =
    WindowsWin32DevicesHumaninterfacedeviceJniBridge.windowssys_windows_win32_devices_humaninterfacedevice_hidPGetData(reporttype, (datalist?.value ?: 0L), (datalength?.value ?: 0L), preparseddata.toLong(), (report?.value ?: 0L), reportlength.toInt())

public actual fun hidPGetExtendedAttributes(reporttype: HidpReportType, dataindex: UShort, preparseddata: PhidpPreparsedData, attributes: COpaquePointer?, lengthattributes: COpaquePointer?): Ntstatus =
    WindowsWin32DevicesHumaninterfacedeviceJniBridge.windowssys_windows_win32_devices_humaninterfacedevice_hidPGetExtendedAttributes(reporttype, dataindex.toShort(), preparseddata.toLong(), (attributes?.value ?: 0L), (lengthattributes?.value ?: 0L))

public actual fun hidPGetLinkCollectionNodes(linkcollectionnodes: COpaquePointer?, linkcollectionnodeslength: COpaquePointer?, preparseddata: PhidpPreparsedData): Ntstatus =
    WindowsWin32DevicesHumaninterfacedeviceJniBridge.windowssys_windows_win32_devices_humaninterfacedevice_hidPGetLinkCollectionNodes((linkcollectionnodes?.value ?: 0L), (linkcollectionnodeslength?.value ?: 0L), preparseddata.toLong())

public actual fun hidPGetScaledUsageValue(reporttype: HidpReportType, usagepage: UShort, linkcollection: UShort, usage: UShort, usagevalue: COpaquePointer?, preparseddata: PhidpPreparsedData, report: Pcstr, reportlength: UInt): Ntstatus =
    WindowsWin32DevicesHumaninterfacedeviceJniBridge.windowssys_windows_win32_devices_humaninterfacedevice_hidPGetScaledUsageValue(reporttype, usagepage.toShort(), linkcollection.toShort(), usage.toShort(), (usagevalue?.value ?: 0L), preparseddata.toLong(), (report?.value ?: 0L), reportlength.toInt())

public actual fun hidPGetSpecificButtonCaps(reporttype: HidpReportType, usagepage: UShort, linkcollection: UShort, usage: UShort, buttoncaps: COpaquePointer?, buttoncapslength: COpaquePointer?, preparseddata: PhidpPreparsedData): Ntstatus =
    WindowsWin32DevicesHumaninterfacedeviceJniBridge.windowssys_windows_win32_devices_humaninterfacedevice_hidPGetSpecificButtonCaps(reporttype, usagepage.toShort(), linkcollection.toShort(), usage.toShort(), (buttoncaps?.value ?: 0L), (buttoncapslength?.value ?: 0L), preparseddata.toLong())

public actual fun hidPGetSpecificValueCaps(reporttype: HidpReportType, usagepage: UShort, linkcollection: UShort, usage: UShort, valuecaps: COpaquePointer?, valuecapslength: COpaquePointer?, preparseddata: PhidpPreparsedData): Ntstatus =
    WindowsWin32DevicesHumaninterfacedeviceJniBridge.windowssys_windows_win32_devices_humaninterfacedevice_hidPGetSpecificValueCaps(reporttype, usagepage.toShort(), linkcollection.toShort(), usage.toShort(), (valuecaps?.value ?: 0L), (valuecapslength?.value ?: 0L), preparseddata.toLong())

public actual fun hidPGetUsageValue(reporttype: HidpReportType, usagepage: UShort, linkcollection: UShort, usage: UShort, usagevalue: COpaquePointer?, preparseddata: PhidpPreparsedData, report: Pcstr, reportlength: UInt): Ntstatus =
    WindowsWin32DevicesHumaninterfacedeviceJniBridge.windowssys_windows_win32_devices_humaninterfacedevice_hidPGetUsageValue(reporttype, usagepage.toShort(), linkcollection.toShort(), usage.toShort(), (usagevalue?.value ?: 0L), preparseddata.toLong(), (report?.value ?: 0L), reportlength.toInt())

public actual fun hidPGetUsageValueArray(reporttype: HidpReportType, usagepage: UShort, linkcollection: UShort, usage: UShort, usagevalue: Pstr, usagevaluebytelength: UShort, preparseddata: PhidpPreparsedData, report: Pcstr, reportlength: UInt): Ntstatus =
    WindowsWin32DevicesHumaninterfacedeviceJniBridge.windowssys_windows_win32_devices_humaninterfacedevice_hidPGetUsageValueArray(reporttype, usagepage.toShort(), linkcollection.toShort(), usage.toShort(), (usagevalue?.value ?: 0L), usagevaluebytelength.toShort(), preparseddata.toLong(), (report?.value ?: 0L), reportlength.toInt())

public actual fun hidPGetUsages(reporttype: HidpReportType, usagepage: UShort, linkcollection: UShort, usagelist: COpaquePointer?, usagelength: COpaquePointer?, preparseddata: PhidpPreparsedData, report: Pstr, reportlength: UInt): Ntstatus =
    WindowsWin32DevicesHumaninterfacedeviceJniBridge.windowssys_windows_win32_devices_humaninterfacedevice_hidPGetUsages(reporttype, usagepage.toShort(), linkcollection.toShort(), (usagelist?.value ?: 0L), (usagelength?.value ?: 0L), preparseddata.toLong(), (report?.value ?: 0L), reportlength.toInt())

public actual fun hidPGetUsagesEx(reporttype: HidpReportType, linkcollection: UShort, buttonlist: COpaquePointer?, usagelength: COpaquePointer?, preparseddata: PhidpPreparsedData, report: Pcstr, reportlength: UInt): Ntstatus =
    WindowsWin32DevicesHumaninterfacedeviceJniBridge.windowssys_windows_win32_devices_humaninterfacedevice_hidPGetUsagesEx(reporttype, linkcollection.toShort(), (buttonlist?.value ?: 0L), (usagelength?.value ?: 0L), preparseddata.toLong(), (report?.value ?: 0L), reportlength.toInt())

public actual fun hidPGetValueCaps(reporttype: HidpReportType, valuecaps: COpaquePointer?, valuecapslength: COpaquePointer?, preparseddata: PhidpPreparsedData): Ntstatus =
    WindowsWin32DevicesHumaninterfacedeviceJniBridge.windowssys_windows_win32_devices_humaninterfacedevice_hidPGetValueCaps(reporttype, (valuecaps?.value ?: 0L), (valuecapslength?.value ?: 0L), preparseddata.toLong())

public actual fun hidPInitializeReportForId(reporttype: HidpReportType, reportid: UByte, preparseddata: PhidpPreparsedData, report: Pstr, reportlength: UInt): Ntstatus =
    WindowsWin32DevicesHumaninterfacedeviceJniBridge.windowssys_windows_win32_devices_humaninterfacedevice_hidPInitializeReportForId(reporttype, reportid.toByte(), preparseddata.toLong(), (report?.value ?: 0L), reportlength.toInt())

public actual fun hidPMaxDataListLength(reporttype: HidpReportType, preparseddata: PhidpPreparsedData): UInt =
    WindowsWin32DevicesHumaninterfacedeviceJniBridge.windowssys_windows_win32_devices_humaninterfacedevice_hidPMaxDataListLength(reporttype, preparseddata.toLong()).toUInt()

public actual fun hidPMaxUsageListLength(reporttype: HidpReportType, usagepage: UShort, preparseddata: PhidpPreparsedData): UInt =
    WindowsWin32DevicesHumaninterfacedeviceJniBridge.windowssys_windows_win32_devices_humaninterfacedevice_hidPMaxUsageListLength(reporttype, usagepage.toShort(), preparseddata.toLong()).toUInt()

public actual fun hidPSetButtonArray(reporttype: HidpReportType, usagepage: UShort, linkcollection: UShort, usage: UShort, buttondata: COpaquePointer?, buttondatalength: UShort, preparseddata: PhidpPreparsedData, report: Pstr, reportlength: UInt): Ntstatus =
    WindowsWin32DevicesHumaninterfacedeviceJniBridge.windowssys_windows_win32_devices_humaninterfacedevice_hidPSetButtonArray(reporttype, usagepage.toShort(), linkcollection.toShort(), usage.toShort(), (buttondata?.value ?: 0L), buttondatalength.toShort(), preparseddata.toLong(), (report?.value ?: 0L), reportlength.toInt())

public actual fun hidPSetData(reporttype: HidpReportType, datalist: COpaquePointer?, datalength: COpaquePointer?, preparseddata: PhidpPreparsedData, report: Pcstr, reportlength: UInt): Ntstatus =
    WindowsWin32DevicesHumaninterfacedeviceJniBridge.windowssys_windows_win32_devices_humaninterfacedevice_hidPSetData(reporttype, (datalist?.value ?: 0L), (datalength?.value ?: 0L), preparseddata.toLong(), (report?.value ?: 0L), reportlength.toInt())

public actual fun hidPSetScaledUsageValue(reporttype: HidpReportType, usagepage: UShort, linkcollection: UShort, usage: UShort, usagevalue: Int, preparseddata: PhidpPreparsedData, report: Pstr, reportlength: UInt): Ntstatus =
    WindowsWin32DevicesHumaninterfacedeviceJniBridge.windowssys_windows_win32_devices_humaninterfacedevice_hidPSetScaledUsageValue(reporttype, usagepage.toShort(), linkcollection.toShort(), usage.toShort(), usagevalue, preparseddata.toLong(), (report?.value ?: 0L), reportlength.toInt())

public actual fun hidPSetUsageValue(reporttype: HidpReportType, usagepage: UShort, linkcollection: UShort, usage: UShort, usagevalue: UInt, preparseddata: PhidpPreparsedData, report: Pstr, reportlength: UInt): Ntstatus =
    WindowsWin32DevicesHumaninterfacedeviceJniBridge.windowssys_windows_win32_devices_humaninterfacedevice_hidPSetUsageValue(reporttype, usagepage.toShort(), linkcollection.toShort(), usage.toShort(), usagevalue.toInt(), preparseddata.toLong(), (report?.value ?: 0L), reportlength.toInt())

public actual fun hidPSetUsageValueArray(reporttype: HidpReportType, usagepage: UShort, linkcollection: UShort, usage: UShort, usagevalue: Pcstr, usagevaluebytelength: UShort, preparseddata: PhidpPreparsedData, report: Pstr, reportlength: UInt): Ntstatus =
    WindowsWin32DevicesHumaninterfacedeviceJniBridge.windowssys_windows_win32_devices_humaninterfacedevice_hidPSetUsageValueArray(reporttype, usagepage.toShort(), linkcollection.toShort(), usage.toShort(), (usagevalue?.value ?: 0L), usagevaluebytelength.toShort(), preparseddata.toLong(), (report?.value ?: 0L), reportlength.toInt())

public actual fun hidPSetUsages(reporttype: HidpReportType, usagepage: UShort, linkcollection: UShort, usagelist: COpaquePointer?, usagelength: COpaquePointer?, preparseddata: PhidpPreparsedData, report: Pcstr, reportlength: UInt): Ntstatus =
    WindowsWin32DevicesHumaninterfacedeviceJniBridge.windowssys_windows_win32_devices_humaninterfacedevice_hidPSetUsages(reporttype, usagepage.toShort(), linkcollection.toShort(), (usagelist?.value ?: 0L), (usagelength?.value ?: 0L), preparseddata.toLong(), (report?.value ?: 0L), reportlength.toInt())

public actual fun hidPTranslateUsagesToI8042ScanCodes(changedusagelist: COpaquePointer?, usagelistlength: UInt, keyaction: HidpKeyboardDirection, modifierstate: COpaquePointer?, insertcodesprocedure: PhidpInsertScancodes, insertcodescontext: COpaquePointer?): Ntstatus =
    WindowsWin32DevicesHumaninterfacedeviceJniBridge.windowssys_windows_win32_devices_humaninterfacedevice_hidPTranslateUsagesToI8042ScanCodes((changedusagelist?.value ?: 0L), usagelistlength.toInt(), keyaction, (modifierstate?.value ?: 0L), 0L, (insertcodescontext?.value ?: 0L))

public actual fun hidPUnsetUsages(reporttype: HidpReportType, usagepage: UShort, linkcollection: UShort, usagelist: COpaquePointer?, usagelength: COpaquePointer?, preparseddata: PhidpPreparsedData, report: Pcstr, reportlength: UInt): Ntstatus =
    WindowsWin32DevicesHumaninterfacedeviceJniBridge.windowssys_windows_win32_devices_humaninterfacedevice_hidPUnsetUsages(reporttype, usagepage.toShort(), linkcollection.toShort(), (usagelist?.value ?: 0L), (usagelength?.value ?: 0L), preparseddata.toLong(), (report?.value ?: 0L), reportlength.toInt())

public actual fun hidPUsageListDifference(previoususagelist: COpaquePointer?, currentusagelist: COpaquePointer?, breakusagelist: COpaquePointer?, makeusagelist: COpaquePointer?, usagelistlength: UInt): Ntstatus =
    WindowsWin32DevicesHumaninterfacedeviceJniBridge.windowssys_windows_win32_devices_humaninterfacedevice_hidPUsageListDifference((previoususagelist?.value ?: 0L), (currentusagelist?.value ?: 0L), (breakusagelist?.value ?: 0L), (makeusagelist?.value ?: 0L), usagelistlength.toInt())

public actual fun joyConfigChanged(dwflags: UInt): UInt =
    WindowsWin32DevicesHumaninterfacedeviceJniBridge.windowssys_windows_win32_devices_humaninterfacedevice_joyConfigChanged(dwflags.toInt()).toUInt()
