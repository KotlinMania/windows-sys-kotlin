@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HINSTANCE
import io.github.kotlinmania.windowssys.windows.win32.foundation.NTSTATUS

private object WindowsWin32DevicesHumaninterfacedeviceJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_devices_humaninterfacedevice_DirectInput8Create(hinst: Long, dwversion: Int, riidltf: Long, ppvout: Long, punkouter: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_humaninterfacedevice_HidD_FlushQueue(hiddeviceobject: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_devices_humaninterfacedevice_HidD_FreePreparsedData(preparseddata: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_devices_humaninterfacedevice_HidD_GetAttributes(hiddeviceobject: Long, attributes: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_devices_humaninterfacedevice_HidD_GetConfiguration(hiddeviceobject: Long, configuration: Long, configurationlength: Int): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_devices_humaninterfacedevice_HidD_GetFeature(hiddeviceobject: Long, reportbuffer: Long, reportbufferlength: Int): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_devices_humaninterfacedevice_HidD_GetHidGuid(hidguid: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_humaninterfacedevice_HidD_GetIndexedString(hiddeviceobject: Long, stringindex: Int, buffer: Long, bufferlength: Int): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_devices_humaninterfacedevice_HidD_GetInputReport(hiddeviceobject: Long, reportbuffer: Long, reportbufferlength: Int): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_devices_humaninterfacedevice_HidD_GetManufacturerString(hiddeviceobject: Long, buffer: Long, bufferlength: Int): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_devices_humaninterfacedevice_HidD_GetMsGenreDescriptor(hiddeviceobject: Long, buffer: Long, bufferlength: Int): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_devices_humaninterfacedevice_HidD_GetNumInputBuffers(hiddeviceobject: Long, numberbuffers: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_devices_humaninterfacedevice_HidD_GetPhysicalDescriptor(hiddeviceobject: Long, buffer: Long, bufferlength: Int): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_devices_humaninterfacedevice_HidD_GetPreparsedData(hiddeviceobject: Long, preparseddata: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_devices_humaninterfacedevice_HidD_GetProductString(hiddeviceobject: Long, buffer: Long, bufferlength: Int): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_devices_humaninterfacedevice_HidD_GetSerialNumberString(hiddeviceobject: Long, buffer: Long, bufferlength: Int): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_devices_humaninterfacedevice_HidD_SetConfiguration(hiddeviceobject: Long, configuration: Long, configurationlength: Int): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_devices_humaninterfacedevice_HidD_SetFeature(hiddeviceobject: Long, reportbuffer: Long, reportbufferlength: Int): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_devices_humaninterfacedevice_HidD_SetNumInputBuffers(hiddeviceobject: Long, numberbuffers: Int): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_devices_humaninterfacedevice_HidD_SetOutputReport(hiddeviceobject: Long, reportbuffer: Long, reportbufferlength: Int): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_devices_humaninterfacedevice_HidP_GetButtonArray(reporttype: Int, usagepage: Short, linkcollection: Short, usage: Short, buttondata: Long, buttondatalength: Long, preparseddata: Long, report: Long, reportlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_humaninterfacedevice_HidP_GetButtonCaps(reporttype: Int, buttoncaps: Long, buttoncapslength: Long, preparseddata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_humaninterfacedevice_HidP_GetCaps(preparseddata: Long, capabilities: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_humaninterfacedevice_HidP_GetData(reporttype: Int, datalist: Long, datalength: Long, preparseddata: Long, report: Long, reportlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_humaninterfacedevice_HidP_GetExtendedAttributes(reporttype: Int, dataindex: Short, preparseddata: Long, attributes: Long, lengthattributes: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_humaninterfacedevice_HidP_GetLinkCollectionNodes(linkcollectionnodes: Long, linkcollectionnodeslength: Long, preparseddata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_humaninterfacedevice_HidP_GetScaledUsageValue(reporttype: Int, usagepage: Short, linkcollection: Short, usage: Short, usagevalue: Long, preparseddata: Long, report: Long, reportlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_humaninterfacedevice_HidP_GetSpecificButtonCaps(reporttype: Int, usagepage: Short, linkcollection: Short, usage: Short, buttoncaps: Long, buttoncapslength: Long, preparseddata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_humaninterfacedevice_HidP_GetSpecificValueCaps(reporttype: Int, usagepage: Short, linkcollection: Short, usage: Short, valuecaps: Long, valuecapslength: Long, preparseddata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_humaninterfacedevice_HidP_GetUsageValue(reporttype: Int, usagepage: Short, linkcollection: Short, usage: Short, usagevalue: Long, preparseddata: Long, report: Long, reportlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_humaninterfacedevice_HidP_GetUsageValueArray(reporttype: Int, usagepage: Short, linkcollection: Short, usage: Short, usagevalue: Long, usagevaluebytelength: Short, preparseddata: Long, report: Long, reportlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_humaninterfacedevice_HidP_GetUsages(reporttype: Int, usagepage: Short, linkcollection: Short, usagelist: Long, usagelength: Long, preparseddata: Long, report: Long, reportlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_humaninterfacedevice_HidP_GetUsagesEx(reporttype: Int, linkcollection: Short, buttonlist: Long, usagelength: Long, preparseddata: Long, report: Long, reportlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_humaninterfacedevice_HidP_GetValueCaps(reporttype: Int, valuecaps: Long, valuecapslength: Long, preparseddata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_humaninterfacedevice_HidP_InitializeReportForID(reporttype: Int, reportid: Byte, preparseddata: Long, report: Long, reportlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_humaninterfacedevice_HidP_MaxDataListLength(reporttype: Int, preparseddata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_humaninterfacedevice_HidP_MaxUsageListLength(reporttype: Int, usagepage: Short, preparseddata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_humaninterfacedevice_HidP_SetButtonArray(reporttype: Int, usagepage: Short, linkcollection: Short, usage: Short, buttondata: Long, buttondatalength: Short, preparseddata: Long, report: Long, reportlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_humaninterfacedevice_HidP_SetData(reporttype: Int, datalist: Long, datalength: Long, preparseddata: Long, report: Long, reportlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_humaninterfacedevice_HidP_SetScaledUsageValue(reporttype: Int, usagepage: Short, linkcollection: Short, usage: Short, usagevalue: Int, preparseddata: Long, report: Long, reportlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_humaninterfacedevice_HidP_SetUsageValue(reporttype: Int, usagepage: Short, linkcollection: Short, usage: Short, usagevalue: Int, preparseddata: Long, report: Long, reportlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_humaninterfacedevice_HidP_SetUsageValueArray(reporttype: Int, usagepage: Short, linkcollection: Short, usage: Short, usagevalue: Long, usagevaluebytelength: Short, preparseddata: Long, report: Long, reportlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_humaninterfacedevice_HidP_SetUsages(reporttype: Int, usagepage: Short, linkcollection: Short, usagelist: Long, usagelength: Long, preparseddata: Long, report: Long, reportlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_humaninterfacedevice_HidP_TranslateUsagesToI8042ScanCodes(changedusagelist: Long, usagelistlength: Int, keyaction: Int, modifierstate: Long, insertcodesprocedure: Long, insertcodescontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_humaninterfacedevice_HidP_UnsetUsages(reporttype: Int, usagepage: Short, linkcollection: Short, usagelist: Long, usagelength: Long, preparseddata: Long, report: Long, reportlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_humaninterfacedevice_HidP_UsageListDifference(previoususagelist: Long, currentusagelist: Long, breakusagelist: Long, makeusagelist: Long, usagelistlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_humaninterfacedevice_joyConfigChanged(dwflags: Int): Int
}

public actual fun DirectInput8Create(hinst: HINSTANCE, dwversion: UInt, riidltf: Long, ppvout: Long, punkouter: Long): HRESULT =
    WindowsWin32DevicesHumaninterfacedeviceJniBridge.windowssys_windows_win32_devices_humaninterfacedevice_DirectInput8Create(hinst, dwversion.toInt(), riidltf, ppvout, punkouter)

public actual fun HidD_FlushQueue(hiddeviceobject: HANDLE): Boolean =
    WindowsWin32DevicesHumaninterfacedeviceJniBridge.windowssys_windows_win32_devices_humaninterfacedevice_HidD_FlushQueue(hiddeviceobject)

public actual fun HidD_FreePreparsedData(preparseddata: PHIDP_PREPARSED_DATA): Boolean =
    WindowsWin32DevicesHumaninterfacedeviceJniBridge.windowssys_windows_win32_devices_humaninterfacedevice_HidD_FreePreparsedData(preparseddata)

public actual fun HidD_GetAttributes(hiddeviceobject: HANDLE, attributes: Long): Boolean =
    WindowsWin32DevicesHumaninterfacedeviceJniBridge.windowssys_windows_win32_devices_humaninterfacedevice_HidD_GetAttributes(hiddeviceobject, attributes)

public actual fun HidD_GetConfiguration(hiddeviceobject: HANDLE, configuration: Long, configurationlength: UInt): Boolean =
    WindowsWin32DevicesHumaninterfacedeviceJniBridge.windowssys_windows_win32_devices_humaninterfacedevice_HidD_GetConfiguration(hiddeviceobject, configuration, configurationlength.toInt())

public actual fun HidD_GetFeature(hiddeviceobject: HANDLE, reportbuffer: Long, reportbufferlength: UInt): Boolean =
    WindowsWin32DevicesHumaninterfacedeviceJniBridge.windowssys_windows_win32_devices_humaninterfacedevice_HidD_GetFeature(hiddeviceobject, reportbuffer, reportbufferlength.toInt())

public actual fun HidD_GetHidGuid(hidguid: Long) {
    WindowsWin32DevicesHumaninterfacedeviceJniBridge.windowssys_windows_win32_devices_humaninterfacedevice_HidD_GetHidGuid(hidguid)
}

public actual fun HidD_GetIndexedString(hiddeviceobject: HANDLE, stringindex: UInt, buffer: Long, bufferlength: UInt): Boolean =
    WindowsWin32DevicesHumaninterfacedeviceJniBridge.windowssys_windows_win32_devices_humaninterfacedevice_HidD_GetIndexedString(hiddeviceobject, stringindex.toInt(), buffer, bufferlength.toInt())

public actual fun HidD_GetInputReport(hiddeviceobject: HANDLE, reportbuffer: Long, reportbufferlength: UInt): Boolean =
    WindowsWin32DevicesHumaninterfacedeviceJniBridge.windowssys_windows_win32_devices_humaninterfacedevice_HidD_GetInputReport(hiddeviceobject, reportbuffer, reportbufferlength.toInt())

public actual fun HidD_GetManufacturerString(hiddeviceobject: HANDLE, buffer: Long, bufferlength: UInt): Boolean =
    WindowsWin32DevicesHumaninterfacedeviceJniBridge.windowssys_windows_win32_devices_humaninterfacedevice_HidD_GetManufacturerString(hiddeviceobject, buffer, bufferlength.toInt())

public actual fun HidD_GetMsGenreDescriptor(hiddeviceobject: HANDLE, buffer: Long, bufferlength: UInt): Boolean =
    WindowsWin32DevicesHumaninterfacedeviceJniBridge.windowssys_windows_win32_devices_humaninterfacedevice_HidD_GetMsGenreDescriptor(hiddeviceobject, buffer, bufferlength.toInt())

public actual fun HidD_GetNumInputBuffers(hiddeviceobject: HANDLE, numberbuffers: Long): Boolean =
    WindowsWin32DevicesHumaninterfacedeviceJniBridge.windowssys_windows_win32_devices_humaninterfacedevice_HidD_GetNumInputBuffers(hiddeviceobject, numberbuffers)

public actual fun HidD_GetPhysicalDescriptor(hiddeviceobject: HANDLE, buffer: Long, bufferlength: UInt): Boolean =
    WindowsWin32DevicesHumaninterfacedeviceJniBridge.windowssys_windows_win32_devices_humaninterfacedevice_HidD_GetPhysicalDescriptor(hiddeviceobject, buffer, bufferlength.toInt())

public actual fun HidD_GetPreparsedData(hiddeviceobject: HANDLE, preparseddata: Long): Boolean =
    WindowsWin32DevicesHumaninterfacedeviceJniBridge.windowssys_windows_win32_devices_humaninterfacedevice_HidD_GetPreparsedData(hiddeviceobject, preparseddata)

public actual fun HidD_GetProductString(hiddeviceobject: HANDLE, buffer: Long, bufferlength: UInt): Boolean =
    WindowsWin32DevicesHumaninterfacedeviceJniBridge.windowssys_windows_win32_devices_humaninterfacedevice_HidD_GetProductString(hiddeviceobject, buffer, bufferlength.toInt())

public actual fun HidD_GetSerialNumberString(hiddeviceobject: HANDLE, buffer: Long, bufferlength: UInt): Boolean =
    WindowsWin32DevicesHumaninterfacedeviceJniBridge.windowssys_windows_win32_devices_humaninterfacedevice_HidD_GetSerialNumberString(hiddeviceobject, buffer, bufferlength.toInt())

public actual fun HidD_SetConfiguration(hiddeviceobject: HANDLE, configuration: Long, configurationlength: UInt): Boolean =
    WindowsWin32DevicesHumaninterfacedeviceJniBridge.windowssys_windows_win32_devices_humaninterfacedevice_HidD_SetConfiguration(hiddeviceobject, configuration, configurationlength.toInt())

public actual fun HidD_SetFeature(hiddeviceobject: HANDLE, reportbuffer: Long, reportbufferlength: UInt): Boolean =
    WindowsWin32DevicesHumaninterfacedeviceJniBridge.windowssys_windows_win32_devices_humaninterfacedevice_HidD_SetFeature(hiddeviceobject, reportbuffer, reportbufferlength.toInt())

public actual fun HidD_SetNumInputBuffers(hiddeviceobject: HANDLE, numberbuffers: UInt): Boolean =
    WindowsWin32DevicesHumaninterfacedeviceJniBridge.windowssys_windows_win32_devices_humaninterfacedevice_HidD_SetNumInputBuffers(hiddeviceobject, numberbuffers.toInt())

public actual fun HidD_SetOutputReport(hiddeviceobject: HANDLE, reportbuffer: Long, reportbufferlength: UInt): Boolean =
    WindowsWin32DevicesHumaninterfacedeviceJniBridge.windowssys_windows_win32_devices_humaninterfacedevice_HidD_SetOutputReport(hiddeviceobject, reportbuffer, reportbufferlength.toInt())

public actual fun HidP_GetButtonArray(reporttype: HIDP_REPORT_TYPE, usagepage: UShort, linkcollection: UShort, usage: UShort, buttondata: Long, buttondatalength: Long, preparseddata: PHIDP_PREPARSED_DATA, report: PCSTR, reportlength: UInt): NTSTATUS =
    WindowsWin32DevicesHumaninterfacedeviceJniBridge.windowssys_windows_win32_devices_humaninterfacedevice_HidP_GetButtonArray(reporttype, usagepage.toShort(), linkcollection.toShort(), usage.toShort(), buttondata, buttondatalength, preparseddata, report, reportlength.toInt())

public actual fun HidP_GetButtonCaps(reporttype: HIDP_REPORT_TYPE, buttoncaps: Long, buttoncapslength: Long, preparseddata: PHIDP_PREPARSED_DATA): NTSTATUS =
    WindowsWin32DevicesHumaninterfacedeviceJniBridge.windowssys_windows_win32_devices_humaninterfacedevice_HidP_GetButtonCaps(reporttype, buttoncaps, buttoncapslength, preparseddata)

public actual fun HidP_GetCaps(preparseddata: PHIDP_PREPARSED_DATA, capabilities: Long): NTSTATUS =
    WindowsWin32DevicesHumaninterfacedeviceJniBridge.windowssys_windows_win32_devices_humaninterfacedevice_HidP_GetCaps(preparseddata, capabilities)

public actual fun HidP_GetData(reporttype: HIDP_REPORT_TYPE, datalist: Long, datalength: Long, preparseddata: PHIDP_PREPARSED_DATA, report: PSTR, reportlength: UInt): NTSTATUS =
    WindowsWin32DevicesHumaninterfacedeviceJniBridge.windowssys_windows_win32_devices_humaninterfacedevice_HidP_GetData(reporttype, datalist, datalength, preparseddata, report, reportlength.toInt())

public actual fun HidP_GetExtendedAttributes(reporttype: HIDP_REPORT_TYPE, dataindex: UShort, preparseddata: PHIDP_PREPARSED_DATA, attributes: Long, lengthattributes: Long): NTSTATUS =
    WindowsWin32DevicesHumaninterfacedeviceJniBridge.windowssys_windows_win32_devices_humaninterfacedevice_HidP_GetExtendedAttributes(reporttype, dataindex.toShort(), preparseddata, attributes, lengthattributes)

public actual fun HidP_GetLinkCollectionNodes(linkcollectionnodes: Long, linkcollectionnodeslength: Long, preparseddata: PHIDP_PREPARSED_DATA): NTSTATUS =
    WindowsWin32DevicesHumaninterfacedeviceJniBridge.windowssys_windows_win32_devices_humaninterfacedevice_HidP_GetLinkCollectionNodes(linkcollectionnodes, linkcollectionnodeslength, preparseddata)

public actual fun HidP_GetScaledUsageValue(reporttype: HIDP_REPORT_TYPE, usagepage: UShort, linkcollection: UShort, usage: UShort, usagevalue: Long, preparseddata: PHIDP_PREPARSED_DATA, report: PCSTR, reportlength: UInt): NTSTATUS =
    WindowsWin32DevicesHumaninterfacedeviceJniBridge.windowssys_windows_win32_devices_humaninterfacedevice_HidP_GetScaledUsageValue(reporttype, usagepage.toShort(), linkcollection.toShort(), usage.toShort(), usagevalue, preparseddata, report, reportlength.toInt())

public actual fun HidP_GetSpecificButtonCaps(reporttype: HIDP_REPORT_TYPE, usagepage: UShort, linkcollection: UShort, usage: UShort, buttoncaps: Long, buttoncapslength: Long, preparseddata: PHIDP_PREPARSED_DATA): NTSTATUS =
    WindowsWin32DevicesHumaninterfacedeviceJniBridge.windowssys_windows_win32_devices_humaninterfacedevice_HidP_GetSpecificButtonCaps(reporttype, usagepage.toShort(), linkcollection.toShort(), usage.toShort(), buttoncaps, buttoncapslength, preparseddata)

public actual fun HidP_GetSpecificValueCaps(reporttype: HIDP_REPORT_TYPE, usagepage: UShort, linkcollection: UShort, usage: UShort, valuecaps: Long, valuecapslength: Long, preparseddata: PHIDP_PREPARSED_DATA): NTSTATUS =
    WindowsWin32DevicesHumaninterfacedeviceJniBridge.windowssys_windows_win32_devices_humaninterfacedevice_HidP_GetSpecificValueCaps(reporttype, usagepage.toShort(), linkcollection.toShort(), usage.toShort(), valuecaps, valuecapslength, preparseddata)

public actual fun HidP_GetUsageValue(reporttype: HIDP_REPORT_TYPE, usagepage: UShort, linkcollection: UShort, usage: UShort, usagevalue: Long, preparseddata: PHIDP_PREPARSED_DATA, report: PCSTR, reportlength: UInt): NTSTATUS =
    WindowsWin32DevicesHumaninterfacedeviceJniBridge.windowssys_windows_win32_devices_humaninterfacedevice_HidP_GetUsageValue(reporttype, usagepage.toShort(), linkcollection.toShort(), usage.toShort(), usagevalue, preparseddata, report, reportlength.toInt())

public actual fun HidP_GetUsageValueArray(reporttype: HIDP_REPORT_TYPE, usagepage: UShort, linkcollection: UShort, usage: UShort, usagevalue: PSTR, usagevaluebytelength: UShort, preparseddata: PHIDP_PREPARSED_DATA, report: PCSTR, reportlength: UInt): NTSTATUS =
    WindowsWin32DevicesHumaninterfacedeviceJniBridge.windowssys_windows_win32_devices_humaninterfacedevice_HidP_GetUsageValueArray(reporttype, usagepage.toShort(), linkcollection.toShort(), usage.toShort(), usagevalue, usagevaluebytelength.toShort(), preparseddata, report, reportlength.toInt())

public actual fun HidP_GetUsages(reporttype: HIDP_REPORT_TYPE, usagepage: UShort, linkcollection: UShort, usagelist: Long, usagelength: Long, preparseddata: PHIDP_PREPARSED_DATA, report: PSTR, reportlength: UInt): NTSTATUS =
    WindowsWin32DevicesHumaninterfacedeviceJniBridge.windowssys_windows_win32_devices_humaninterfacedevice_HidP_GetUsages(reporttype, usagepage.toShort(), linkcollection.toShort(), usagelist, usagelength, preparseddata, report, reportlength.toInt())

public actual fun HidP_GetUsagesEx(reporttype: HIDP_REPORT_TYPE, linkcollection: UShort, buttonlist: Long, usagelength: Long, preparseddata: PHIDP_PREPARSED_DATA, report: PCSTR, reportlength: UInt): NTSTATUS =
    WindowsWin32DevicesHumaninterfacedeviceJniBridge.windowssys_windows_win32_devices_humaninterfacedevice_HidP_GetUsagesEx(reporttype, linkcollection.toShort(), buttonlist, usagelength, preparseddata, report, reportlength.toInt())

public actual fun HidP_GetValueCaps(reporttype: HIDP_REPORT_TYPE, valuecaps: Long, valuecapslength: Long, preparseddata: PHIDP_PREPARSED_DATA): NTSTATUS =
    WindowsWin32DevicesHumaninterfacedeviceJniBridge.windowssys_windows_win32_devices_humaninterfacedevice_HidP_GetValueCaps(reporttype, valuecaps, valuecapslength, preparseddata)

public actual fun HidP_InitializeReportForID(reporttype: HIDP_REPORT_TYPE, reportid: UByte, preparseddata: PHIDP_PREPARSED_DATA, report: PSTR, reportlength: UInt): NTSTATUS =
    WindowsWin32DevicesHumaninterfacedeviceJniBridge.windowssys_windows_win32_devices_humaninterfacedevice_HidP_InitializeReportForID(reporttype, reportid.toByte(), preparseddata, report, reportlength.toInt())

public actual fun HidP_MaxDataListLength(reporttype: HIDP_REPORT_TYPE, preparseddata: PHIDP_PREPARSED_DATA): UInt =
    WindowsWin32DevicesHumaninterfacedeviceJniBridge.windowssys_windows_win32_devices_humaninterfacedevice_HidP_MaxDataListLength(reporttype, preparseddata).toUInt()

public actual fun HidP_MaxUsageListLength(reporttype: HIDP_REPORT_TYPE, usagepage: UShort, preparseddata: PHIDP_PREPARSED_DATA): UInt =
    WindowsWin32DevicesHumaninterfacedeviceJniBridge.windowssys_windows_win32_devices_humaninterfacedevice_HidP_MaxUsageListLength(reporttype, usagepage.toShort(), preparseddata).toUInt()

public actual fun HidP_SetButtonArray(reporttype: HIDP_REPORT_TYPE, usagepage: UShort, linkcollection: UShort, usage: UShort, buttondata: Long, buttondatalength: UShort, preparseddata: PHIDP_PREPARSED_DATA, report: PSTR, reportlength: UInt): NTSTATUS =
    WindowsWin32DevicesHumaninterfacedeviceJniBridge.windowssys_windows_win32_devices_humaninterfacedevice_HidP_SetButtonArray(reporttype, usagepage.toShort(), linkcollection.toShort(), usage.toShort(), buttondata, buttondatalength.toShort(), preparseddata, report, reportlength.toInt())

public actual fun HidP_SetData(reporttype: HIDP_REPORT_TYPE, datalist: Long, datalength: Long, preparseddata: PHIDP_PREPARSED_DATA, report: PCSTR, reportlength: UInt): NTSTATUS =
    WindowsWin32DevicesHumaninterfacedeviceJniBridge.windowssys_windows_win32_devices_humaninterfacedevice_HidP_SetData(reporttype, datalist, datalength, preparseddata, report, reportlength.toInt())

public actual fun HidP_SetScaledUsageValue(reporttype: HIDP_REPORT_TYPE, usagepage: UShort, linkcollection: UShort, usage: UShort, usagevalue: Int, preparseddata: PHIDP_PREPARSED_DATA, report: PSTR, reportlength: UInt): NTSTATUS =
    WindowsWin32DevicesHumaninterfacedeviceJniBridge.windowssys_windows_win32_devices_humaninterfacedevice_HidP_SetScaledUsageValue(reporttype, usagepage.toShort(), linkcollection.toShort(), usage.toShort(), usagevalue, preparseddata, report, reportlength.toInt())

public actual fun HidP_SetUsageValue(reporttype: HIDP_REPORT_TYPE, usagepage: UShort, linkcollection: UShort, usage: UShort, usagevalue: UInt, preparseddata: PHIDP_PREPARSED_DATA, report: PSTR, reportlength: UInt): NTSTATUS =
    WindowsWin32DevicesHumaninterfacedeviceJniBridge.windowssys_windows_win32_devices_humaninterfacedevice_HidP_SetUsageValue(reporttype, usagepage.toShort(), linkcollection.toShort(), usage.toShort(), usagevalue.toInt(), preparseddata, report, reportlength.toInt())

public actual fun HidP_SetUsageValueArray(reporttype: HIDP_REPORT_TYPE, usagepage: UShort, linkcollection: UShort, usage: UShort, usagevalue: PCSTR, usagevaluebytelength: UShort, preparseddata: PHIDP_PREPARSED_DATA, report: PSTR, reportlength: UInt): NTSTATUS =
    WindowsWin32DevicesHumaninterfacedeviceJniBridge.windowssys_windows_win32_devices_humaninterfacedevice_HidP_SetUsageValueArray(reporttype, usagepage.toShort(), linkcollection.toShort(), usage.toShort(), usagevalue, usagevaluebytelength.toShort(), preparseddata, report, reportlength.toInt())

public actual fun HidP_SetUsages(reporttype: HIDP_REPORT_TYPE, usagepage: UShort, linkcollection: UShort, usagelist: Long, usagelength: Long, preparseddata: PHIDP_PREPARSED_DATA, report: PCSTR, reportlength: UInt): NTSTATUS =
    WindowsWin32DevicesHumaninterfacedeviceJniBridge.windowssys_windows_win32_devices_humaninterfacedevice_HidP_SetUsages(reporttype, usagepage.toShort(), linkcollection.toShort(), usagelist, usagelength, preparseddata, report, reportlength.toInt())

public actual fun HidP_TranslateUsagesToI8042ScanCodes(changedusagelist: Long, usagelistlength: UInt, keyaction: HIDP_KEYBOARD_DIRECTION, modifierstate: Long, insertcodesprocedure: PHIDP_INSERT_SCANCODES, insertcodescontext: Long): NTSTATUS =
    WindowsWin32DevicesHumaninterfacedeviceJniBridge.windowssys_windows_win32_devices_humaninterfacedevice_HidP_TranslateUsagesToI8042ScanCodes(changedusagelist, usagelistlength.toInt(), keyaction, modifierstate, insertcodesprocedure.toLong(), insertcodescontext)

public actual fun HidP_UnsetUsages(reporttype: HIDP_REPORT_TYPE, usagepage: UShort, linkcollection: UShort, usagelist: Long, usagelength: Long, preparseddata: PHIDP_PREPARSED_DATA, report: PCSTR, reportlength: UInt): NTSTATUS =
    WindowsWin32DevicesHumaninterfacedeviceJniBridge.windowssys_windows_win32_devices_humaninterfacedevice_HidP_UnsetUsages(reporttype, usagepage.toShort(), linkcollection.toShort(), usagelist, usagelength, preparseddata, report, reportlength.toInt())

public actual fun HidP_UsageListDifference(previoususagelist: Long, currentusagelist: Long, breakusagelist: Long, makeusagelist: Long, usagelistlength: UInt): NTSTATUS =
    WindowsWin32DevicesHumaninterfacedeviceJniBridge.windowssys_windows_win32_devices_humaninterfacedevice_HidP_UsageListDifference(previoususagelist, currentusagelist, breakusagelist, makeusagelist, usagelistlength.toInt())

public actual fun joyConfigChanged(dwflags: UInt): UInt =
    WindowsWin32DevicesHumaninterfacedeviceJniBridge.windowssys_windows_win32_devices_humaninterfacedevice_joyConfigChanged(dwflags.toInt()).toUInt()
