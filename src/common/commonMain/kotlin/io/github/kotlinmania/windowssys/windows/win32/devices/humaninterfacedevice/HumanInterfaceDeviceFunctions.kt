package io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HINSTANCE
import io.github.kotlinmania.windowssys.windows.win32.foundation.NTSTATUS

public expect fun DirectInput8Create(hinst: HINSTANCE, dwversion: UInt, riidltf: Long, ppvout: Long, punkouter: Long): HRESULT

public expect fun HidD_FlushQueue(hiddeviceobject: HANDLE): Boolean

public expect fun HidD_FreePreparsedData(preparseddata: PHIDP_PREPARSED_DATA): Boolean

public expect fun HidD_GetAttributes(hiddeviceobject: HANDLE, attributes: Long): Boolean

public expect fun HidD_GetConfiguration(hiddeviceobject: HANDLE, configuration: Long, configurationlength: UInt): Boolean

public expect fun HidD_GetFeature(hiddeviceobject: HANDLE, reportbuffer: Long, reportbufferlength: UInt): Boolean

public expect fun HidD_GetHidGuid(hidguid: Long)

public expect fun HidD_GetIndexedString(hiddeviceobject: HANDLE, stringindex: UInt, buffer: Long, bufferlength: UInt): Boolean

public expect fun HidD_GetInputReport(hiddeviceobject: HANDLE, reportbuffer: Long, reportbufferlength: UInt): Boolean

public expect fun HidD_GetManufacturerString(hiddeviceobject: HANDLE, buffer: Long, bufferlength: UInt): Boolean

public expect fun HidD_GetMsGenreDescriptor(hiddeviceobject: HANDLE, buffer: Long, bufferlength: UInt): Boolean

public expect fun HidD_GetNumInputBuffers(hiddeviceobject: HANDLE, numberbuffers: Long): Boolean

public expect fun HidD_GetPhysicalDescriptor(hiddeviceobject: HANDLE, buffer: Long, bufferlength: UInt): Boolean

public expect fun HidD_GetPreparsedData(hiddeviceobject: HANDLE, preparseddata: Long): Boolean

public expect fun HidD_GetProductString(hiddeviceobject: HANDLE, buffer: Long, bufferlength: UInt): Boolean

public expect fun HidD_GetSerialNumberString(hiddeviceobject: HANDLE, buffer: Long, bufferlength: UInt): Boolean

public expect fun HidD_SetConfiguration(hiddeviceobject: HANDLE, configuration: Long, configurationlength: UInt): Boolean

public expect fun HidD_SetFeature(hiddeviceobject: HANDLE, reportbuffer: Long, reportbufferlength: UInt): Boolean

public expect fun HidD_SetNumInputBuffers(hiddeviceobject: HANDLE, numberbuffers: UInt): Boolean

public expect fun HidD_SetOutputReport(hiddeviceobject: HANDLE, reportbuffer: Long, reportbufferlength: UInt): Boolean

public expect fun HidP_GetButtonArray(reporttype: HIDP_REPORT_TYPE, usagepage: UShort, linkcollection: UShort, usage: UShort, buttondata: Long, buttondatalength: Long, preparseddata: PHIDP_PREPARSED_DATA, report: PCSTR, reportlength: UInt): NTSTATUS

public expect fun HidP_GetButtonCaps(reporttype: HIDP_REPORT_TYPE, buttoncaps: Long, buttoncapslength: Long, preparseddata: PHIDP_PREPARSED_DATA): NTSTATUS

public expect fun HidP_GetCaps(preparseddata: PHIDP_PREPARSED_DATA, capabilities: Long): NTSTATUS

public expect fun HidP_GetData(reporttype: HIDP_REPORT_TYPE, datalist: Long, datalength: Long, preparseddata: PHIDP_PREPARSED_DATA, report: PSTR, reportlength: UInt): NTSTATUS

public expect fun HidP_GetExtendedAttributes(reporttype: HIDP_REPORT_TYPE, dataindex: UShort, preparseddata: PHIDP_PREPARSED_DATA, attributes: Long, lengthattributes: Long): NTSTATUS

public expect fun HidP_GetLinkCollectionNodes(linkcollectionnodes: Long, linkcollectionnodeslength: Long, preparseddata: PHIDP_PREPARSED_DATA): NTSTATUS

public expect fun HidP_GetScaledUsageValue(reporttype: HIDP_REPORT_TYPE, usagepage: UShort, linkcollection: UShort, usage: UShort, usagevalue: Long, preparseddata: PHIDP_PREPARSED_DATA, report: PCSTR, reportlength: UInt): NTSTATUS

public expect fun HidP_GetSpecificButtonCaps(reporttype: HIDP_REPORT_TYPE, usagepage: UShort, linkcollection: UShort, usage: UShort, buttoncaps: Long, buttoncapslength: Long, preparseddata: PHIDP_PREPARSED_DATA): NTSTATUS

public expect fun HidP_GetSpecificValueCaps(reporttype: HIDP_REPORT_TYPE, usagepage: UShort, linkcollection: UShort, usage: UShort, valuecaps: Long, valuecapslength: Long, preparseddata: PHIDP_PREPARSED_DATA): NTSTATUS

public expect fun HidP_GetUsageValue(reporttype: HIDP_REPORT_TYPE, usagepage: UShort, linkcollection: UShort, usage: UShort, usagevalue: Long, preparseddata: PHIDP_PREPARSED_DATA, report: PCSTR, reportlength: UInt): NTSTATUS

public expect fun HidP_GetUsageValueArray(reporttype: HIDP_REPORT_TYPE, usagepage: UShort, linkcollection: UShort, usage: UShort, usagevalue: PSTR, usagevaluebytelength: UShort, preparseddata: PHIDP_PREPARSED_DATA, report: PCSTR, reportlength: UInt): NTSTATUS

public expect fun HidP_GetUsages(reporttype: HIDP_REPORT_TYPE, usagepage: UShort, linkcollection: UShort, usagelist: Long, usagelength: Long, preparseddata: PHIDP_PREPARSED_DATA, report: PSTR, reportlength: UInt): NTSTATUS

public expect fun HidP_GetUsagesEx(reporttype: HIDP_REPORT_TYPE, linkcollection: UShort, buttonlist: Long, usagelength: Long, preparseddata: PHIDP_PREPARSED_DATA, report: PCSTR, reportlength: UInt): NTSTATUS

public expect fun HidP_GetValueCaps(reporttype: HIDP_REPORT_TYPE, valuecaps: Long, valuecapslength: Long, preparseddata: PHIDP_PREPARSED_DATA): NTSTATUS

public expect fun HidP_InitializeReportForID(reporttype: HIDP_REPORT_TYPE, reportid: UByte, preparseddata: PHIDP_PREPARSED_DATA, report: PSTR, reportlength: UInt): NTSTATUS

public expect fun HidP_MaxDataListLength(reporttype: HIDP_REPORT_TYPE, preparseddata: PHIDP_PREPARSED_DATA): UInt

public expect fun HidP_MaxUsageListLength(reporttype: HIDP_REPORT_TYPE, usagepage: UShort, preparseddata: PHIDP_PREPARSED_DATA): UInt

public expect fun HidP_SetButtonArray(reporttype: HIDP_REPORT_TYPE, usagepage: UShort, linkcollection: UShort, usage: UShort, buttondata: Long, buttondatalength: UShort, preparseddata: PHIDP_PREPARSED_DATA, report: PSTR, reportlength: UInt): NTSTATUS

public expect fun HidP_SetData(reporttype: HIDP_REPORT_TYPE, datalist: Long, datalength: Long, preparseddata: PHIDP_PREPARSED_DATA, report: PCSTR, reportlength: UInt): NTSTATUS

public expect fun HidP_SetScaledUsageValue(reporttype: HIDP_REPORT_TYPE, usagepage: UShort, linkcollection: UShort, usage: UShort, usagevalue: Int, preparseddata: PHIDP_PREPARSED_DATA, report: PSTR, reportlength: UInt): NTSTATUS

public expect fun HidP_SetUsageValue(reporttype: HIDP_REPORT_TYPE, usagepage: UShort, linkcollection: UShort, usage: UShort, usagevalue: UInt, preparseddata: PHIDP_PREPARSED_DATA, report: PSTR, reportlength: UInt): NTSTATUS

public expect fun HidP_SetUsageValueArray(reporttype: HIDP_REPORT_TYPE, usagepage: UShort, linkcollection: UShort, usage: UShort, usagevalue: PCSTR, usagevaluebytelength: UShort, preparseddata: PHIDP_PREPARSED_DATA, report: PSTR, reportlength: UInt): NTSTATUS

public expect fun HidP_SetUsages(reporttype: HIDP_REPORT_TYPE, usagepage: UShort, linkcollection: UShort, usagelist: Long, usagelength: Long, preparseddata: PHIDP_PREPARSED_DATA, report: PCSTR, reportlength: UInt): NTSTATUS

public expect fun HidP_TranslateUsagesToI8042ScanCodes(changedusagelist: Long, usagelistlength: UInt, keyaction: HIDP_KEYBOARD_DIRECTION, modifierstate: Long, insertcodesprocedure: PHIDP_INSERT_SCANCODES, insertcodescontext: Long): NTSTATUS

public expect fun HidP_UnsetUsages(reporttype: HIDP_REPORT_TYPE, usagepage: UShort, linkcollection: UShort, usagelist: Long, usagelength: Long, preparseddata: PHIDP_PREPARSED_DATA, report: PCSTR, reportlength: UInt): NTSTATUS

public expect fun HidP_UsageListDifference(previoususagelist: Long, currentusagelist: Long, breakusagelist: Long, makeusagelist: Long, usagelistlength: UInt): NTSTATUS

public expect fun joyConfigChanged(dwflags: UInt): UInt
