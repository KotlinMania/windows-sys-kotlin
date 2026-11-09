@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HINSTANCE
import io.github.kotlinmania.windowssys.windows.win32.foundation.NTSTATUS
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun DirectInput8Create(hinst: HINSTANCE, dwversion: UInt, riidltf: Long, ppvout: Long, punkouter: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice.cinterop.windowssys_windows_win32_devices_humaninterfacedevice_DirectInput8Create(hinst.toCPointer<ByteVar>(), dwversion, riidltf.toCPointer<ByteVar>(), ppvout.toCPointer<ByteVar>(), punkouter.toCPointer<ByteVar>())

public actual fun HidD_FlushQueue(hiddeviceobject: HANDLE): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice.cinterop.windowssys_windows_win32_devices_humaninterfacedevice_HidD_FlushQueue(hiddeviceobject.toCPointer<ByteVar>())

public actual fun HidD_FreePreparsedData(preparseddata: PHIDP_PREPARSED_DATA): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice.cinterop.windowssys_windows_win32_devices_humaninterfacedevice_HidD_FreePreparsedData(preparseddata)

public actual fun HidD_GetAttributes(hiddeviceobject: HANDLE, attributes: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice.cinterop.windowssys_windows_win32_devices_humaninterfacedevice_HidD_GetAttributes(hiddeviceobject.toCPointer<ByteVar>(), attributes.toCPointer<ByteVar>())

public actual fun HidD_GetConfiguration(hiddeviceobject: HANDLE, configuration: Long, configurationlength: UInt): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice.cinterop.windowssys_windows_win32_devices_humaninterfacedevice_HidD_GetConfiguration(hiddeviceobject.toCPointer<ByteVar>(), configuration.toCPointer<ByteVar>(), configurationlength)

public actual fun HidD_GetFeature(hiddeviceobject: HANDLE, reportbuffer: Long, reportbufferlength: UInt): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice.cinterop.windowssys_windows_win32_devices_humaninterfacedevice_HidD_GetFeature(hiddeviceobject.toCPointer<ByteVar>(), reportbuffer.toCPointer<ByteVar>(), reportbufferlength)

public actual fun HidD_GetHidGuid(hidguid: Long) {
    io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice.cinterop.windowssys_windows_win32_devices_humaninterfacedevice_HidD_GetHidGuid(hidguid.toCPointer<ByteVar>())
}

public actual fun HidD_GetIndexedString(hiddeviceobject: HANDLE, stringindex: UInt, buffer: Long, bufferlength: UInt): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice.cinterop.windowssys_windows_win32_devices_humaninterfacedevice_HidD_GetIndexedString(hiddeviceobject.toCPointer<ByteVar>(), stringindex, buffer.toCPointer<ByteVar>(), bufferlength)

public actual fun HidD_GetInputReport(hiddeviceobject: HANDLE, reportbuffer: Long, reportbufferlength: UInt): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice.cinterop.windowssys_windows_win32_devices_humaninterfacedevice_HidD_GetInputReport(hiddeviceobject.toCPointer<ByteVar>(), reportbuffer.toCPointer<ByteVar>(), reportbufferlength)

public actual fun HidD_GetManufacturerString(hiddeviceobject: HANDLE, buffer: Long, bufferlength: UInt): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice.cinterop.windowssys_windows_win32_devices_humaninterfacedevice_HidD_GetManufacturerString(hiddeviceobject.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>(), bufferlength)

public actual fun HidD_GetMsGenreDescriptor(hiddeviceobject: HANDLE, buffer: Long, bufferlength: UInt): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice.cinterop.windowssys_windows_win32_devices_humaninterfacedevice_HidD_GetMsGenreDescriptor(hiddeviceobject.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>(), bufferlength)

public actual fun HidD_GetNumInputBuffers(hiddeviceobject: HANDLE, numberbuffers: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice.cinterop.windowssys_windows_win32_devices_humaninterfacedevice_HidD_GetNumInputBuffers(hiddeviceobject.toCPointer<ByteVar>(), numberbuffers.toCPointer<ByteVar>())

public actual fun HidD_GetPhysicalDescriptor(hiddeviceobject: HANDLE, buffer: Long, bufferlength: UInt): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice.cinterop.windowssys_windows_win32_devices_humaninterfacedevice_HidD_GetPhysicalDescriptor(hiddeviceobject.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>(), bufferlength)

public actual fun HidD_GetPreparsedData(hiddeviceobject: HANDLE, preparseddata: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice.cinterop.windowssys_windows_win32_devices_humaninterfacedevice_HidD_GetPreparsedData(hiddeviceobject.toCPointer<ByteVar>(), preparseddata.toCPointer<ByteVar>())

public actual fun HidD_GetProductString(hiddeviceobject: HANDLE, buffer: Long, bufferlength: UInt): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice.cinterop.windowssys_windows_win32_devices_humaninterfacedevice_HidD_GetProductString(hiddeviceobject.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>(), bufferlength)

public actual fun HidD_GetSerialNumberString(hiddeviceobject: HANDLE, buffer: Long, bufferlength: UInt): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice.cinterop.windowssys_windows_win32_devices_humaninterfacedevice_HidD_GetSerialNumberString(hiddeviceobject.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>(), bufferlength)

public actual fun HidD_SetConfiguration(hiddeviceobject: HANDLE, configuration: Long, configurationlength: UInt): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice.cinterop.windowssys_windows_win32_devices_humaninterfacedevice_HidD_SetConfiguration(hiddeviceobject.toCPointer<ByteVar>(), configuration.toCPointer<ByteVar>(), configurationlength)

public actual fun HidD_SetFeature(hiddeviceobject: HANDLE, reportbuffer: Long, reportbufferlength: UInt): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice.cinterop.windowssys_windows_win32_devices_humaninterfacedevice_HidD_SetFeature(hiddeviceobject.toCPointer<ByteVar>(), reportbuffer.toCPointer<ByteVar>(), reportbufferlength)

public actual fun HidD_SetNumInputBuffers(hiddeviceobject: HANDLE, numberbuffers: UInt): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice.cinterop.windowssys_windows_win32_devices_humaninterfacedevice_HidD_SetNumInputBuffers(hiddeviceobject.toCPointer<ByteVar>(), numberbuffers)

public actual fun HidD_SetOutputReport(hiddeviceobject: HANDLE, reportbuffer: Long, reportbufferlength: UInt): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice.cinterop.windowssys_windows_win32_devices_humaninterfacedevice_HidD_SetOutputReport(hiddeviceobject.toCPointer<ByteVar>(), reportbuffer.toCPointer<ByteVar>(), reportbufferlength)

public actual fun HidP_GetButtonArray(reporttype: HIDP_REPORT_TYPE, usagepage: UShort, linkcollection: UShort, usage: UShort, buttondata: Long, buttondatalength: Long, preparseddata: PHIDP_PREPARSED_DATA, report: PCSTR, reportlength: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice.cinterop.windowssys_windows_win32_devices_humaninterfacedevice_HidP_GetButtonArray(reporttype, usagepage, linkcollection, usage, buttondata.toCPointer<ByteVar>(), buttondatalength.toCPointer<ByteVar>(), preparseddata, report.toCPointer<ByteVar>(), reportlength)

public actual fun HidP_GetButtonCaps(reporttype: HIDP_REPORT_TYPE, buttoncaps: Long, buttoncapslength: Long, preparseddata: PHIDP_PREPARSED_DATA): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice.cinterop.windowssys_windows_win32_devices_humaninterfacedevice_HidP_GetButtonCaps(reporttype, buttoncaps.toCPointer<ByteVar>(), buttoncapslength.toCPointer<ByteVar>(), preparseddata)

public actual fun HidP_GetCaps(preparseddata: PHIDP_PREPARSED_DATA, capabilities: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice.cinterop.windowssys_windows_win32_devices_humaninterfacedevice_HidP_GetCaps(preparseddata, capabilities.toCPointer<ByteVar>())

public actual fun HidP_GetData(reporttype: HIDP_REPORT_TYPE, datalist: Long, datalength: Long, preparseddata: PHIDP_PREPARSED_DATA, report: PSTR, reportlength: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice.cinterop.windowssys_windows_win32_devices_humaninterfacedevice_HidP_GetData(reporttype, datalist.toCPointer<ByteVar>(), datalength.toCPointer<ByteVar>(), preparseddata, report.toCPointer<ByteVar>(), reportlength)

public actual fun HidP_GetExtendedAttributes(reporttype: HIDP_REPORT_TYPE, dataindex: UShort, preparseddata: PHIDP_PREPARSED_DATA, attributes: Long, lengthattributes: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice.cinterop.windowssys_windows_win32_devices_humaninterfacedevice_HidP_GetExtendedAttributes(reporttype, dataindex, preparseddata, attributes.toCPointer<ByteVar>(), lengthattributes.toCPointer<ByteVar>())

public actual fun HidP_GetLinkCollectionNodes(linkcollectionnodes: Long, linkcollectionnodeslength: Long, preparseddata: PHIDP_PREPARSED_DATA): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice.cinterop.windowssys_windows_win32_devices_humaninterfacedevice_HidP_GetLinkCollectionNodes(linkcollectionnodes.toCPointer<ByteVar>(), linkcollectionnodeslength.toCPointer<ByteVar>(), preparseddata)

public actual fun HidP_GetScaledUsageValue(reporttype: HIDP_REPORT_TYPE, usagepage: UShort, linkcollection: UShort, usage: UShort, usagevalue: Long, preparseddata: PHIDP_PREPARSED_DATA, report: PCSTR, reportlength: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice.cinterop.windowssys_windows_win32_devices_humaninterfacedevice_HidP_GetScaledUsageValue(reporttype, usagepage, linkcollection, usage, usagevalue.toCPointer<ByteVar>(), preparseddata, report.toCPointer<ByteVar>(), reportlength)

public actual fun HidP_GetSpecificButtonCaps(reporttype: HIDP_REPORT_TYPE, usagepage: UShort, linkcollection: UShort, usage: UShort, buttoncaps: Long, buttoncapslength: Long, preparseddata: PHIDP_PREPARSED_DATA): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice.cinterop.windowssys_windows_win32_devices_humaninterfacedevice_HidP_GetSpecificButtonCaps(reporttype, usagepage, linkcollection, usage, buttoncaps.toCPointer<ByteVar>(), buttoncapslength.toCPointer<ByteVar>(), preparseddata)

public actual fun HidP_GetSpecificValueCaps(reporttype: HIDP_REPORT_TYPE, usagepage: UShort, linkcollection: UShort, usage: UShort, valuecaps: Long, valuecapslength: Long, preparseddata: PHIDP_PREPARSED_DATA): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice.cinterop.windowssys_windows_win32_devices_humaninterfacedevice_HidP_GetSpecificValueCaps(reporttype, usagepage, linkcollection, usage, valuecaps.toCPointer<ByteVar>(), valuecapslength.toCPointer<ByteVar>(), preparseddata)

public actual fun HidP_GetUsageValue(reporttype: HIDP_REPORT_TYPE, usagepage: UShort, linkcollection: UShort, usage: UShort, usagevalue: Long, preparseddata: PHIDP_PREPARSED_DATA, report: PCSTR, reportlength: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice.cinterop.windowssys_windows_win32_devices_humaninterfacedevice_HidP_GetUsageValue(reporttype, usagepage, linkcollection, usage, usagevalue.toCPointer<ByteVar>(), preparseddata, report.toCPointer<ByteVar>(), reportlength)

public actual fun HidP_GetUsageValueArray(reporttype: HIDP_REPORT_TYPE, usagepage: UShort, linkcollection: UShort, usage: UShort, usagevalue: PSTR, usagevaluebytelength: UShort, preparseddata: PHIDP_PREPARSED_DATA, report: PCSTR, reportlength: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice.cinterop.windowssys_windows_win32_devices_humaninterfacedevice_HidP_GetUsageValueArray(reporttype, usagepage, linkcollection, usage, usagevalue.toCPointer<ByteVar>(), usagevaluebytelength, preparseddata, report.toCPointer<ByteVar>(), reportlength)

public actual fun HidP_GetUsages(reporttype: HIDP_REPORT_TYPE, usagepage: UShort, linkcollection: UShort, usagelist: Long, usagelength: Long, preparseddata: PHIDP_PREPARSED_DATA, report: PSTR, reportlength: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice.cinterop.windowssys_windows_win32_devices_humaninterfacedevice_HidP_GetUsages(reporttype, usagepage, linkcollection, usagelist.toCPointer<ByteVar>(), usagelength.toCPointer<ByteVar>(), preparseddata, report.toCPointer<ByteVar>(), reportlength)

public actual fun HidP_GetUsagesEx(reporttype: HIDP_REPORT_TYPE, linkcollection: UShort, buttonlist: Long, usagelength: Long, preparseddata: PHIDP_PREPARSED_DATA, report: PCSTR, reportlength: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice.cinterop.windowssys_windows_win32_devices_humaninterfacedevice_HidP_GetUsagesEx(reporttype, linkcollection, buttonlist.toCPointer<ByteVar>(), usagelength.toCPointer<ByteVar>(), preparseddata, report.toCPointer<ByteVar>(), reportlength)

public actual fun HidP_GetValueCaps(reporttype: HIDP_REPORT_TYPE, valuecaps: Long, valuecapslength: Long, preparseddata: PHIDP_PREPARSED_DATA): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice.cinterop.windowssys_windows_win32_devices_humaninterfacedevice_HidP_GetValueCaps(reporttype, valuecaps.toCPointer<ByteVar>(), valuecapslength.toCPointer<ByteVar>(), preparseddata)

public actual fun HidP_InitializeReportForID(reporttype: HIDP_REPORT_TYPE, reportid: UByte, preparseddata: PHIDP_PREPARSED_DATA, report: PSTR, reportlength: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice.cinterop.windowssys_windows_win32_devices_humaninterfacedevice_HidP_InitializeReportForID(reporttype, reportid, preparseddata, report.toCPointer<ByteVar>(), reportlength)

public actual fun HidP_MaxDataListLength(reporttype: HIDP_REPORT_TYPE, preparseddata: PHIDP_PREPARSED_DATA): UInt =
    io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice.cinterop.windowssys_windows_win32_devices_humaninterfacedevice_HidP_MaxDataListLength(reporttype, preparseddata)

public actual fun HidP_MaxUsageListLength(reporttype: HIDP_REPORT_TYPE, usagepage: UShort, preparseddata: PHIDP_PREPARSED_DATA): UInt =
    io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice.cinterop.windowssys_windows_win32_devices_humaninterfacedevice_HidP_MaxUsageListLength(reporttype, usagepage, preparseddata)

public actual fun HidP_SetButtonArray(reporttype: HIDP_REPORT_TYPE, usagepage: UShort, linkcollection: UShort, usage: UShort, buttondata: Long, buttondatalength: UShort, preparseddata: PHIDP_PREPARSED_DATA, report: PSTR, reportlength: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice.cinterop.windowssys_windows_win32_devices_humaninterfacedevice_HidP_SetButtonArray(reporttype, usagepage, linkcollection, usage, buttondata.toCPointer<ByteVar>(), buttondatalength, preparseddata, report.toCPointer<ByteVar>(), reportlength)

public actual fun HidP_SetData(reporttype: HIDP_REPORT_TYPE, datalist: Long, datalength: Long, preparseddata: PHIDP_PREPARSED_DATA, report: PCSTR, reportlength: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice.cinterop.windowssys_windows_win32_devices_humaninterfacedevice_HidP_SetData(reporttype, datalist.toCPointer<ByteVar>(), datalength.toCPointer<ByteVar>(), preparseddata, report.toCPointer<ByteVar>(), reportlength)

public actual fun HidP_SetScaledUsageValue(reporttype: HIDP_REPORT_TYPE, usagepage: UShort, linkcollection: UShort, usage: UShort, usagevalue: Int, preparseddata: PHIDP_PREPARSED_DATA, report: PSTR, reportlength: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice.cinterop.windowssys_windows_win32_devices_humaninterfacedevice_HidP_SetScaledUsageValue(reporttype, usagepage, linkcollection, usage, usagevalue, preparseddata, report.toCPointer<ByteVar>(), reportlength)

public actual fun HidP_SetUsageValue(reporttype: HIDP_REPORT_TYPE, usagepage: UShort, linkcollection: UShort, usage: UShort, usagevalue: UInt, preparseddata: PHIDP_PREPARSED_DATA, report: PSTR, reportlength: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice.cinterop.windowssys_windows_win32_devices_humaninterfacedevice_HidP_SetUsageValue(reporttype, usagepage, linkcollection, usage, usagevalue, preparseddata, report.toCPointer<ByteVar>(), reportlength)

public actual fun HidP_SetUsageValueArray(reporttype: HIDP_REPORT_TYPE, usagepage: UShort, linkcollection: UShort, usage: UShort, usagevalue: PCSTR, usagevaluebytelength: UShort, preparseddata: PHIDP_PREPARSED_DATA, report: PSTR, reportlength: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice.cinterop.windowssys_windows_win32_devices_humaninterfacedevice_HidP_SetUsageValueArray(reporttype, usagepage, linkcollection, usage, usagevalue.toCPointer<ByteVar>(), usagevaluebytelength, preparseddata, report.toCPointer<ByteVar>(), reportlength)

public actual fun HidP_SetUsages(reporttype: HIDP_REPORT_TYPE, usagepage: UShort, linkcollection: UShort, usagelist: Long, usagelength: Long, preparseddata: PHIDP_PREPARSED_DATA, report: PCSTR, reportlength: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice.cinterop.windowssys_windows_win32_devices_humaninterfacedevice_HidP_SetUsages(reporttype, usagepage, linkcollection, usagelist.toCPointer<ByteVar>(), usagelength.toCPointer<ByteVar>(), preparseddata, report.toCPointer<ByteVar>(), reportlength)

public actual fun HidP_TranslateUsagesToI8042ScanCodes(changedusagelist: Long, usagelistlength: UInt, keyaction: HIDP_KEYBOARD_DIRECTION, modifierstate: Long, insertcodesprocedure: PHIDP_INSERT_SCANCODES, insertcodescontext: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice.cinterop.windowssys_windows_win32_devices_humaninterfacedevice_HidP_TranslateUsagesToI8042ScanCodes(changedusagelist.toCPointer<ByteVar>(), usagelistlength, keyaction, modifierstate.toCPointer<ByteVar>(), insertcodesprocedure.toLong().toCPointer<ByteVar>(), insertcodescontext.toCPointer<ByteVar>())

public actual fun HidP_UnsetUsages(reporttype: HIDP_REPORT_TYPE, usagepage: UShort, linkcollection: UShort, usagelist: Long, usagelength: Long, preparseddata: PHIDP_PREPARSED_DATA, report: PCSTR, reportlength: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice.cinterop.windowssys_windows_win32_devices_humaninterfacedevice_HidP_UnsetUsages(reporttype, usagepage, linkcollection, usagelist.toCPointer<ByteVar>(), usagelength.toCPointer<ByteVar>(), preparseddata, report.toCPointer<ByteVar>(), reportlength)

public actual fun HidP_UsageListDifference(previoususagelist: Long, currentusagelist: Long, breakusagelist: Long, makeusagelist: Long, usagelistlength: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice.cinterop.windowssys_windows_win32_devices_humaninterfacedevice_HidP_UsageListDifference(previoususagelist.toCPointer<ByteVar>(), currentusagelist.toCPointer<ByteVar>(), breakusagelist.toCPointer<ByteVar>(), makeusagelist.toCPointer<ByteVar>(), usagelistlength)

public actual fun joyConfigChanged(dwflags: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice.cinterop.windowssys_windows_win32_devices_humaninterfacedevice_joyConfigChanged(dwflags)
