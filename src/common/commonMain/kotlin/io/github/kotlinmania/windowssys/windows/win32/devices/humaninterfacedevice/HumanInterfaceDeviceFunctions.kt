package io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PSTR

public fun interface FnCallback {
    public operator fun invoke(context: Long, newscancodes: PCSTR, length: UInt): Boolean
}

public fun DirectInput8Create(hinst: Foundation.HINSTANCE, dwversion: UInt, riidltf: Long, ppvout: Long, punkouter: Long): HRESULT {
    return Win32DynamicFfi.invoke("dinput8.dll", "DirectInput8Create", longArrayOf(Win32DynamicFfi.objectSlot(hinst), dwversion.toLong(), riidltf, ppvout, punkouter)).toInt()
}

public fun HidD_FlushQueue(hiddeviceobject: Foundation.HANDLE): Boolean {
    val rawRet = Win32DynamicFfi.invoke("hid.dll", "HidD_FlushQueue", longArrayOf(Win32DynamicFfi.objectSlot(hiddeviceobject)))
    return (rawRet and 0xFFL) != 0L
}

public fun HidD_FreePreparsedData(preparseddata: PHIDP_PREPARSED_DATA): Boolean {
    val rawRet = Win32DynamicFfi.invoke("hid.dll", "HidD_FreePreparsedData", longArrayOf(preparseddata))
    return (rawRet and 0xFFL) != 0L
}

public fun HidD_GetAttributes(hiddeviceobject: Foundation.HANDLE, attributes: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("hid.dll", "HidD_GetAttributes", longArrayOf(Win32DynamicFfi.objectSlot(hiddeviceobject), attributes))
    return (rawRet and 0xFFL) != 0L
}

public fun HidD_GetConfiguration(hiddeviceobject: Foundation.HANDLE, configuration: Long, configurationlength: UInt): Boolean {
    val rawRet = Win32DynamicFfi.invoke("hid.dll", "HidD_GetConfiguration", longArrayOf(Win32DynamicFfi.objectSlot(hiddeviceobject), configuration, configurationlength.toLong()))
    return (rawRet and 0xFFL) != 0L
}

public fun HidD_GetFeature(hiddeviceobject: Foundation.HANDLE, reportbuffer: Long, reportbufferlength: UInt): Boolean {
    val rawRet = Win32DynamicFfi.invoke("hid.dll", "HidD_GetFeature", longArrayOf(Win32DynamicFfi.objectSlot(hiddeviceobject), reportbuffer, reportbufferlength.toLong()))
    return (rawRet and 0xFFL) != 0L
}

public fun HidD_GetHidGuid(hidguid: Long) {
    Win32DynamicFfi.invoke("hid.dll", "HidD_GetHidGuid", longArrayOf(hidguid))
}

public fun HidD_GetIndexedString(hiddeviceobject: Foundation.HANDLE, stringindex: UInt, buffer: Long, bufferlength: UInt): Boolean {
    val rawRet = Win32DynamicFfi.invoke("hid.dll", "HidD_GetIndexedString", longArrayOf(Win32DynamicFfi.objectSlot(hiddeviceobject), stringindex.toLong(), buffer, bufferlength.toLong()))
    return (rawRet and 0xFFL) != 0L
}

public fun HidD_GetInputReport(hiddeviceobject: Foundation.HANDLE, reportbuffer: Long, reportbufferlength: UInt): Boolean {
    val rawRet = Win32DynamicFfi.invoke("hid.dll", "HidD_GetInputReport", longArrayOf(Win32DynamicFfi.objectSlot(hiddeviceobject), reportbuffer, reportbufferlength.toLong()))
    return (rawRet and 0xFFL) != 0L
}

public fun HidD_GetManufacturerString(hiddeviceobject: Foundation.HANDLE, buffer: Long, bufferlength: UInt): Boolean {
    val rawRet = Win32DynamicFfi.invoke("hid.dll", "HidD_GetManufacturerString", longArrayOf(Win32DynamicFfi.objectSlot(hiddeviceobject), buffer, bufferlength.toLong()))
    return (rawRet and 0xFFL) != 0L
}

public fun HidD_GetMsGenreDescriptor(hiddeviceobject: Foundation.HANDLE, buffer: Long, bufferlength: UInt): Boolean {
    val rawRet = Win32DynamicFfi.invoke("hid.dll", "HidD_GetMsGenreDescriptor", longArrayOf(Win32DynamicFfi.objectSlot(hiddeviceobject), buffer, bufferlength.toLong()))
    return (rawRet and 0xFFL) != 0L
}

public fun HidD_GetNumInputBuffers(hiddeviceobject: Foundation.HANDLE, numberbuffers: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("hid.dll", "HidD_GetNumInputBuffers", longArrayOf(Win32DynamicFfi.objectSlot(hiddeviceobject), numberbuffers))
    return (rawRet and 0xFFL) != 0L
}

public fun HidD_GetPhysicalDescriptor(hiddeviceobject: Foundation.HANDLE, buffer: Long, bufferlength: UInt): Boolean {
    val rawRet = Win32DynamicFfi.invoke("hid.dll", "HidD_GetPhysicalDescriptor", longArrayOf(Win32DynamicFfi.objectSlot(hiddeviceobject), buffer, bufferlength.toLong()))
    return (rawRet and 0xFFL) != 0L
}

public fun HidD_GetPreparsedData(hiddeviceobject: Foundation.HANDLE, preparseddata: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("hid.dll", "HidD_GetPreparsedData", longArrayOf(Win32DynamicFfi.objectSlot(hiddeviceobject), preparseddata))
    return (rawRet and 0xFFL) != 0L
}

public fun HidD_GetProductString(hiddeviceobject: Foundation.HANDLE, buffer: Long, bufferlength: UInt): Boolean {
    val rawRet = Win32DynamicFfi.invoke("hid.dll", "HidD_GetProductString", longArrayOf(Win32DynamicFfi.objectSlot(hiddeviceobject), buffer, bufferlength.toLong()))
    return (rawRet and 0xFFL) != 0L
}

public fun HidD_GetSerialNumberString(hiddeviceobject: Foundation.HANDLE, buffer: Long, bufferlength: UInt): Boolean {
    val rawRet = Win32DynamicFfi.invoke("hid.dll", "HidD_GetSerialNumberString", longArrayOf(Win32DynamicFfi.objectSlot(hiddeviceobject), buffer, bufferlength.toLong()))
    return (rawRet and 0xFFL) != 0L
}

public fun HidD_SetConfiguration(hiddeviceobject: Foundation.HANDLE, configuration: Long, configurationlength: UInt): Boolean {
    val rawRet = Win32DynamicFfi.invoke("hid.dll", "HidD_SetConfiguration", longArrayOf(Win32DynamicFfi.objectSlot(hiddeviceobject), configuration, configurationlength.toLong()))
    return (rawRet and 0xFFL) != 0L
}

public fun HidD_SetFeature(hiddeviceobject: Foundation.HANDLE, reportbuffer: Long, reportbufferlength: UInt): Boolean {
    val rawRet = Win32DynamicFfi.invoke("hid.dll", "HidD_SetFeature", longArrayOf(Win32DynamicFfi.objectSlot(hiddeviceobject), reportbuffer, reportbufferlength.toLong()))
    return (rawRet and 0xFFL) != 0L
}

public fun HidD_SetNumInputBuffers(hiddeviceobject: Foundation.HANDLE, numberbuffers: UInt): Boolean {
    val rawRet = Win32DynamicFfi.invoke("hid.dll", "HidD_SetNumInputBuffers", longArrayOf(Win32DynamicFfi.objectSlot(hiddeviceobject), numberbuffers.toLong()))
    return (rawRet and 0xFFL) != 0L
}

public fun HidD_SetOutputReport(hiddeviceobject: Foundation.HANDLE, reportbuffer: Long, reportbufferlength: UInt): Boolean {
    val rawRet = Win32DynamicFfi.invoke("hid.dll", "HidD_SetOutputReport", longArrayOf(Win32DynamicFfi.objectSlot(hiddeviceobject), reportbuffer, reportbufferlength.toLong()))
    return (rawRet and 0xFFL) != 0L
}

public fun HidP_GetButtonArray(reporttype: HIDP_REPORT_TYPE, usagepage: UShort, linkcollection: UShort, usage: UShort, buttondata: Long, buttondatalength: Long, preparseddata: PHIDP_PREPARSED_DATA, report: PCSTR, reportlength: UInt): Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("hid.dll", "HidP_GetButtonArray", longArrayOf(reporttype.toLong(), usagepage.toLong(), linkcollection.toLong(), usage.toLong(), buttondata, buttondatalength, preparseddata, report, reportlength.toLong()))
    return Foundation.NTSTATUS()
}

public fun HidP_GetButtonCaps(reporttype: HIDP_REPORT_TYPE, buttoncaps: Long, buttoncapslength: Long, preparseddata: PHIDP_PREPARSED_DATA): Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("hid.dll", "HidP_GetButtonCaps", longArrayOf(reporttype.toLong(), buttoncaps, buttoncapslength, preparseddata))
    return Foundation.NTSTATUS()
}

public fun HidP_GetCaps(preparseddata: PHIDP_PREPARSED_DATA, capabilities: Long): Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("hid.dll", "HidP_GetCaps", longArrayOf(preparseddata, capabilities))
    return Foundation.NTSTATUS()
}

public fun HidP_GetData(reporttype: HIDP_REPORT_TYPE, datalist: Long, datalength: Long, preparseddata: PHIDP_PREPARSED_DATA, report: PSTR, reportlength: UInt): Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("hid.dll", "HidP_GetData", longArrayOf(reporttype.toLong(), datalist, datalength, preparseddata, report, reportlength.toLong()))
    return Foundation.NTSTATUS()
}

public fun HidP_GetExtendedAttributes(reporttype: HIDP_REPORT_TYPE, dataindex: UShort, preparseddata: PHIDP_PREPARSED_DATA, attributes: Long, lengthattributes: Long): Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("hid.dll", "HidP_GetExtendedAttributes", longArrayOf(reporttype.toLong(), dataindex.toLong(), preparseddata, attributes, lengthattributes))
    return Foundation.NTSTATUS()
}

public fun HidP_GetLinkCollectionNodes(linkcollectionnodes: Long, linkcollectionnodeslength: Long, preparseddata: PHIDP_PREPARSED_DATA): Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("hid.dll", "HidP_GetLinkCollectionNodes", longArrayOf(linkcollectionnodes, linkcollectionnodeslength, preparseddata))
    return Foundation.NTSTATUS()
}

public fun HidP_GetScaledUsageValue(reporttype: HIDP_REPORT_TYPE, usagepage: UShort, linkcollection: UShort, usage: UShort, usagevalue: Long, preparseddata: PHIDP_PREPARSED_DATA, report: PCSTR, reportlength: UInt): Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("hid.dll", "HidP_GetScaledUsageValue", longArrayOf(reporttype.toLong(), usagepage.toLong(), linkcollection.toLong(), usage.toLong(), usagevalue, preparseddata, report, reportlength.toLong()))
    return Foundation.NTSTATUS()
}

public fun HidP_GetSpecificButtonCaps(reporttype: HIDP_REPORT_TYPE, usagepage: UShort, linkcollection: UShort, usage: UShort, buttoncaps: Long, buttoncapslength: Long, preparseddata: PHIDP_PREPARSED_DATA): Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("hid.dll", "HidP_GetSpecificButtonCaps", longArrayOf(reporttype.toLong(), usagepage.toLong(), linkcollection.toLong(), usage.toLong(), buttoncaps, buttoncapslength, preparseddata))
    return Foundation.NTSTATUS()
}

public fun HidP_GetSpecificValueCaps(reporttype: HIDP_REPORT_TYPE, usagepage: UShort, linkcollection: UShort, usage: UShort, valuecaps: Long, valuecapslength: Long, preparseddata: PHIDP_PREPARSED_DATA): Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("hid.dll", "HidP_GetSpecificValueCaps", longArrayOf(reporttype.toLong(), usagepage.toLong(), linkcollection.toLong(), usage.toLong(), valuecaps, valuecapslength, preparseddata))
    return Foundation.NTSTATUS()
}

public fun HidP_GetUsageValue(reporttype: HIDP_REPORT_TYPE, usagepage: UShort, linkcollection: UShort, usage: UShort, usagevalue: Long, preparseddata: PHIDP_PREPARSED_DATA, report: PCSTR, reportlength: UInt): Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("hid.dll", "HidP_GetUsageValue", longArrayOf(reporttype.toLong(), usagepage.toLong(), linkcollection.toLong(), usage.toLong(), usagevalue, preparseddata, report, reportlength.toLong()))
    return Foundation.NTSTATUS()
}

public fun HidP_GetUsageValueArray(reporttype: HIDP_REPORT_TYPE, usagepage: UShort, linkcollection: UShort, usage: UShort, usagevalue: PSTR, usagevaluebytelength: UShort, preparseddata: PHIDP_PREPARSED_DATA, report: PCSTR, reportlength: UInt): Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("hid.dll", "HidP_GetUsageValueArray", longArrayOf(reporttype.toLong(), usagepage.toLong(), linkcollection.toLong(), usage.toLong(), usagevalue, usagevaluebytelength.toLong(), preparseddata, report, reportlength.toLong()))
    return Foundation.NTSTATUS()
}

public fun HidP_GetUsages(reporttype: HIDP_REPORT_TYPE, usagepage: UShort, linkcollection: UShort, usagelist: Long, usagelength: Long, preparseddata: PHIDP_PREPARSED_DATA, report: PSTR, reportlength: UInt): Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("hid.dll", "HidP_GetUsages", longArrayOf(reporttype.toLong(), usagepage.toLong(), linkcollection.toLong(), usagelist, usagelength, preparseddata, report, reportlength.toLong()))
    return Foundation.NTSTATUS()
}

public fun HidP_GetUsagesEx(reporttype: HIDP_REPORT_TYPE, linkcollection: UShort, buttonlist: Long, usagelength: Long, preparseddata: PHIDP_PREPARSED_DATA, report: PCSTR, reportlength: UInt): Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("hid.dll", "HidP_GetUsagesEx", longArrayOf(reporttype.toLong(), linkcollection.toLong(), buttonlist, usagelength, preparseddata, report, reportlength.toLong()))
    return Foundation.NTSTATUS()
}

public fun HidP_GetValueCaps(reporttype: HIDP_REPORT_TYPE, valuecaps: Long, valuecapslength: Long, preparseddata: PHIDP_PREPARSED_DATA): Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("hid.dll", "HidP_GetValueCaps", longArrayOf(reporttype.toLong(), valuecaps, valuecapslength, preparseddata))
    return Foundation.NTSTATUS()
}

public fun HidP_InitializeReportForID(reporttype: HIDP_REPORT_TYPE, reportid: UByte, preparseddata: PHIDP_PREPARSED_DATA, report: PSTR, reportlength: UInt): Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("hid.dll", "HidP_InitializeReportForID", longArrayOf(reporttype.toLong(), reportid.toLong(), preparseddata, report, reportlength.toLong()))
    return Foundation.NTSTATUS()
}

public fun HidP_MaxDataListLength(reporttype: HIDP_REPORT_TYPE, preparseddata: PHIDP_PREPARSED_DATA): UInt {
    return Win32DynamicFfi.invoke("hid.dll", "HidP_MaxDataListLength", longArrayOf(reporttype.toLong(), preparseddata)).toUInt()
}

public fun HidP_MaxUsageListLength(reporttype: HIDP_REPORT_TYPE, usagepage: UShort, preparseddata: PHIDP_PREPARSED_DATA): UInt {
    return Win32DynamicFfi.invoke("hid.dll", "HidP_MaxUsageListLength", longArrayOf(reporttype.toLong(), usagepage.toLong(), preparseddata)).toUInt()
}

public fun HidP_SetButtonArray(reporttype: HIDP_REPORT_TYPE, usagepage: UShort, linkcollection: UShort, usage: UShort, buttondata: Long, buttondatalength: UShort, preparseddata: PHIDP_PREPARSED_DATA, report: PSTR, reportlength: UInt): Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("hid.dll", "HidP_SetButtonArray", longArrayOf(reporttype.toLong(), usagepage.toLong(), linkcollection.toLong(), usage.toLong(), buttondata, buttondatalength.toLong(), preparseddata, report, reportlength.toLong()))
    return Foundation.NTSTATUS()
}

public fun HidP_SetData(reporttype: HIDP_REPORT_TYPE, datalist: Long, datalength: Long, preparseddata: PHIDP_PREPARSED_DATA, report: PCSTR, reportlength: UInt): Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("hid.dll", "HidP_SetData", longArrayOf(reporttype.toLong(), datalist, datalength, preparseddata, report, reportlength.toLong()))
    return Foundation.NTSTATUS()
}

public fun HidP_SetScaledUsageValue(reporttype: HIDP_REPORT_TYPE, usagepage: UShort, linkcollection: UShort, usage: UShort, usagevalue: Int, preparseddata: PHIDP_PREPARSED_DATA, report: PSTR, reportlength: UInt): Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("hid.dll", "HidP_SetScaledUsageValue", longArrayOf(reporttype.toLong(), usagepage.toLong(), linkcollection.toLong(), usage.toLong(), usagevalue.toLong(), preparseddata, report, reportlength.toLong()))
    return Foundation.NTSTATUS()
}

public fun HidP_SetUsageValue(reporttype: HIDP_REPORT_TYPE, usagepage: UShort, linkcollection: UShort, usage: UShort, usagevalue: UInt, preparseddata: PHIDP_PREPARSED_DATA, report: PSTR, reportlength: UInt): Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("hid.dll", "HidP_SetUsageValue", longArrayOf(reporttype.toLong(), usagepage.toLong(), linkcollection.toLong(), usage.toLong(), usagevalue.toLong(), preparseddata, report, reportlength.toLong()))
    return Foundation.NTSTATUS()
}

public fun HidP_SetUsageValueArray(reporttype: HIDP_REPORT_TYPE, usagepage: UShort, linkcollection: UShort, usage: UShort, usagevalue: PCSTR, usagevaluebytelength: UShort, preparseddata: PHIDP_PREPARSED_DATA, report: PSTR, reportlength: UInt): Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("hid.dll", "HidP_SetUsageValueArray", longArrayOf(reporttype.toLong(), usagepage.toLong(), linkcollection.toLong(), usage.toLong(), usagevalue, usagevaluebytelength.toLong(), preparseddata, report, reportlength.toLong()))
    return Foundation.NTSTATUS()
}

public fun HidP_SetUsages(reporttype: HIDP_REPORT_TYPE, usagepage: UShort, linkcollection: UShort, usagelist: Long, usagelength: Long, preparseddata: PHIDP_PREPARSED_DATA, report: PCSTR, reportlength: UInt): Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("hid.dll", "HidP_SetUsages", longArrayOf(reporttype.toLong(), usagepage.toLong(), linkcollection.toLong(), usagelist, usagelength, preparseddata, report, reportlength.toLong()))
    return Foundation.NTSTATUS()
}

public fun HidP_TranslateUsagesToI8042ScanCodes(changedusagelist: Long, usagelistlength: UInt, keyaction: HIDP_KEYBOARD_DIRECTION, modifierstate: Long, insertcodesprocedure: PHIDP_INSERT_SCANCODES, insertcodescontext: Long): Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("hid.dll", "HidP_TranslateUsagesToI8042ScanCodes", longArrayOf(changedusagelist, usagelistlength.toLong(), keyaction.toLong(), modifierstate, Win32DynamicFfi.objectSlot(insertcodesprocedure), insertcodescontext))
    return Foundation.NTSTATUS()
}

public fun HidP_UnsetUsages(reporttype: HIDP_REPORT_TYPE, usagepage: UShort, linkcollection: UShort, usagelist: Long, usagelength: Long, preparseddata: PHIDP_PREPARSED_DATA, report: PCSTR, reportlength: UInt): Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("hid.dll", "HidP_UnsetUsages", longArrayOf(reporttype.toLong(), usagepage.toLong(), linkcollection.toLong(), usagelist, usagelength, preparseddata, report, reportlength.toLong()))
    return Foundation.NTSTATUS()
}

public fun HidP_UsageListDifference(previoususagelist: Long, currentusagelist: Long, breakusagelist: Long, makeusagelist: Long, usagelistlength: UInt): Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("hid.dll", "HidP_UsageListDifference", longArrayOf(previoususagelist, currentusagelist, breakusagelist, makeusagelist, usagelistlength.toLong()))
    return Foundation.NTSTATUS()
}

public fun joyConfigChanged(dwflags: UInt): UInt {
    return Win32DynamicFfi.invoke("winmm.dll", "joyConfigChanged", longArrayOf(dwflags.toLong())).toUInt()
}
