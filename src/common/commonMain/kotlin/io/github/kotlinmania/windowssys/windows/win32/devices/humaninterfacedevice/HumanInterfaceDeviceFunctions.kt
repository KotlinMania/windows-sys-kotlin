package io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hinstance
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus

public expect fun directInput8Create(hinst: Hinstance, dwversion: UInt, riidltf: ConstPtr<Guid>, ppvout: MutPtr<MutPtr<CVoid>>, punkouter: MutPtr<CVoid>): Hresult

public expect fun hidDFlushQueue(hiddeviceobject: Handle): Boolean

public expect fun hidDFreePreparsedData(preparseddata: PhidpPreparsedData): Boolean

public expect fun hidDGetAttributes(hiddeviceobject: Handle, attributes: MutPtr<HiddAttributes>): Boolean

public expect fun hidDGetConfiguration(hiddeviceobject: Handle, configuration: MutPtr<HiddConfiguration>, configurationlength: UInt): Boolean

public expect fun hidDGetFeature(hiddeviceobject: Handle, reportbuffer: MutPtr<CVoid>, reportbufferlength: UInt): Boolean

public expect fun hidDGetHidGuid(hidguid: MutPtr<Guid>)

public expect fun hidDGetIndexedString(hiddeviceobject: Handle, stringindex: UInt, buffer: MutPtr<CVoid>, bufferlength: UInt): Boolean

public expect fun hidDGetInputReport(hiddeviceobject: Handle, reportbuffer: MutPtr<CVoid>, reportbufferlength: UInt): Boolean

public expect fun hidDGetManufacturerString(hiddeviceobject: Handle, buffer: MutPtr<CVoid>, bufferlength: UInt): Boolean

public expect fun hidDGetMsGenreDescriptor(hiddeviceobject: Handle, buffer: MutPtr<CVoid>, bufferlength: UInt): Boolean

public expect fun hidDGetNumInputBuffers(hiddeviceobject: Handle, numberbuffers: MutPtr<UInt>): Boolean

public expect fun hidDGetPhysicalDescriptor(hiddeviceobject: Handle, buffer: MutPtr<CVoid>, bufferlength: UInt): Boolean

public expect fun hidDGetPreparsedData(hiddeviceobject: Handle, preparseddata: MutPtr<PhidpPreparsedData>): Boolean

public expect fun hidDGetProductString(hiddeviceobject: Handle, buffer: MutPtr<CVoid>, bufferlength: UInt): Boolean

public expect fun hidDGetSerialNumberString(hiddeviceobject: Handle, buffer: MutPtr<CVoid>, bufferlength: UInt): Boolean

public expect fun hidDSetConfiguration(hiddeviceobject: Handle, configuration: ConstPtr<HiddConfiguration>, configurationlength: UInt): Boolean

public expect fun hidDSetFeature(hiddeviceobject: Handle, reportbuffer: ConstPtr<CVoid>, reportbufferlength: UInt): Boolean

public expect fun hidDSetNumInputBuffers(hiddeviceobject: Handle, numberbuffers: UInt): Boolean

public expect fun hidDSetOutputReport(hiddeviceobject: Handle, reportbuffer: ConstPtr<CVoid>, reportbufferlength: UInt): Boolean

public expect fun hidPGetButtonArray(reporttype: HidpReportType, usagepage: UShort, linkcollection: UShort, usage: UShort, buttondata: MutPtr<HidpButtonArrayData>, buttondatalength: MutPtr<UShort>, preparseddata: PhidpPreparsedData, report: Pcstr, reportlength: UInt): Ntstatus

public expect fun hidPGetButtonCaps(reporttype: HidpReportType, buttoncaps: MutPtr<HidpButtonCaps>, buttoncapslength: MutPtr<UShort>, preparseddata: PhidpPreparsedData): Ntstatus

public expect fun hidPGetCaps(preparseddata: PhidpPreparsedData, capabilities: MutPtr<HidpCaps>): Ntstatus

public expect fun hidPGetData(reporttype: HidpReportType, datalist: MutPtr<HidpData>, datalength: MutPtr<UInt>, preparseddata: PhidpPreparsedData, report: Pstr, reportlength: UInt): Ntstatus

public expect fun hidPGetExtendedAttributes(reporttype: HidpReportType, dataindex: UShort, preparseddata: PhidpPreparsedData, attributes: MutPtr<HidpExtendedAttributes>, lengthattributes: MutPtr<UInt>): Ntstatus

public expect fun hidPGetLinkCollectionNodes(linkcollectionnodes: MutPtr<HidpLinkCollectionNode>, linkcollectionnodeslength: MutPtr<UInt>, preparseddata: PhidpPreparsedData): Ntstatus

public expect fun hidPGetScaledUsageValue(reporttype: HidpReportType, usagepage: UShort, linkcollection: UShort, usage: UShort, usagevalue: MutPtr<Int>, preparseddata: PhidpPreparsedData, report: Pcstr, reportlength: UInt): Ntstatus

public expect fun hidPGetSpecificButtonCaps(reporttype: HidpReportType, usagepage: UShort, linkcollection: UShort, usage: UShort, buttoncaps: MutPtr<HidpButtonCaps>, buttoncapslength: MutPtr<UShort>, preparseddata: PhidpPreparsedData): Ntstatus

public expect fun hidPGetSpecificValueCaps(reporttype: HidpReportType, usagepage: UShort, linkcollection: UShort, usage: UShort, valuecaps: MutPtr<HidpValueCaps>, valuecapslength: MutPtr<UShort>, preparseddata: PhidpPreparsedData): Ntstatus

public expect fun hidPGetUsageValue(reporttype: HidpReportType, usagepage: UShort, linkcollection: UShort, usage: UShort, usagevalue: MutPtr<UInt>, preparseddata: PhidpPreparsedData, report: Pcstr, reportlength: UInt): Ntstatus

public expect fun hidPGetUsageValueArray(reporttype: HidpReportType, usagepage: UShort, linkcollection: UShort, usage: UShort, usagevalue: Pstr, usagevaluebytelength: UShort, preparseddata: PhidpPreparsedData, report: Pcstr, reportlength: UInt): Ntstatus

public expect fun hidPGetUsages(reporttype: HidpReportType, usagepage: UShort, linkcollection: UShort, usagelist: MutPtr<UShort>, usagelength: MutPtr<UInt>, preparseddata: PhidpPreparsedData, report: Pstr, reportlength: UInt): Ntstatus

public expect fun hidPGetUsagesEx(reporttype: HidpReportType, linkcollection: UShort, buttonlist: MutPtr<UsageAndPage>, usagelength: MutPtr<UInt>, preparseddata: PhidpPreparsedData, report: Pcstr, reportlength: UInt): Ntstatus

public expect fun hidPGetValueCaps(reporttype: HidpReportType, valuecaps: MutPtr<HidpValueCaps>, valuecapslength: MutPtr<UShort>, preparseddata: PhidpPreparsedData): Ntstatus

public expect fun hidPInitializeReportForId(reporttype: HidpReportType, reportid: UByte, preparseddata: PhidpPreparsedData, report: Pstr, reportlength: UInt): Ntstatus

public expect fun hidPMaxDataListLength(reporttype: HidpReportType, preparseddata: PhidpPreparsedData): UInt

public expect fun hidPMaxUsageListLength(reporttype: HidpReportType, usagepage: UShort, preparseddata: PhidpPreparsedData): UInt

public expect fun hidPSetButtonArray(reporttype: HidpReportType, usagepage: UShort, linkcollection: UShort, usage: UShort, buttondata: ConstPtr<HidpButtonArrayData>, buttondatalength: UShort, preparseddata: PhidpPreparsedData, report: Pstr, reportlength: UInt): Ntstatus

public expect fun hidPSetData(reporttype: HidpReportType, datalist: MutPtr<HidpData>, datalength: MutPtr<UInt>, preparseddata: PhidpPreparsedData, report: Pcstr, reportlength: UInt): Ntstatus

public expect fun hidPSetScaledUsageValue(reporttype: HidpReportType, usagepage: UShort, linkcollection: UShort, usage: UShort, usagevalue: Int, preparseddata: PhidpPreparsedData, report: Pstr, reportlength: UInt): Ntstatus

public expect fun hidPSetUsageValue(reporttype: HidpReportType, usagepage: UShort, linkcollection: UShort, usage: UShort, usagevalue: UInt, preparseddata: PhidpPreparsedData, report: Pstr, reportlength: UInt): Ntstatus

public expect fun hidPSetUsageValueArray(reporttype: HidpReportType, usagepage: UShort, linkcollection: UShort, usage: UShort, usagevalue: Pcstr, usagevaluebytelength: UShort, preparseddata: PhidpPreparsedData, report: Pstr, reportlength: UInt): Ntstatus

public expect fun hidPSetUsages(reporttype: HidpReportType, usagepage: UShort, linkcollection: UShort, usagelist: MutPtr<UShort>, usagelength: MutPtr<UInt>, preparseddata: PhidpPreparsedData, report: Pcstr, reportlength: UInt): Ntstatus

public expect fun hidPTranslateUsagesToI8042ScanCodes(changedusagelist: ConstPtr<UShort>, usagelistlength: UInt, keyaction: HidpKeyboardDirection, modifierstate: MutPtr<HidpKeyboardModifierState>, insertcodesprocedure: PhidpInsertScancodes, insertcodescontext: ConstPtr<CVoid>): Ntstatus

public expect fun hidPUnsetUsages(reporttype: HidpReportType, usagepage: UShort, linkcollection: UShort, usagelist: MutPtr<UShort>, usagelength: MutPtr<UInt>, preparseddata: PhidpPreparsedData, report: Pcstr, reportlength: UInt): Ntstatus

public expect fun hidPUsageListDifference(previoususagelist: ConstPtr<UShort>, currentusagelist: ConstPtr<UShort>, breakusagelist: MutPtr<UShort>, makeusagelist: MutPtr<UShort>, usagelistlength: UInt): Ntstatus

public expect fun joyConfigChanged(dwflags: UInt): UInt
