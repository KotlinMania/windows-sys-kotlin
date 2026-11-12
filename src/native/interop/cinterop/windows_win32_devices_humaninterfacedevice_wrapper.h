#ifndef WINDOWSSYS_WINDOWS_WIN32_DEVICES_HUMANINTERFACEDEVICE_WINDOWS_WIN32_DEVICES_HUMANINTERFACEDEVICE_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_DEVICES_HUMANINTERFACEDEVICE_WINDOWS_WIN32_DEVICES_HUMANINTERFACEDEVICE_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssysWindowsWin32DevicesHumaninterfacedeviceDirectInput8Create(void* hinst, uint32_t dwversion, void* riidltf, void* ppvout, void* punkouter);
bool windowssysWindowsWin32DevicesHumaninterfacedeviceHidDFlushQueue(void* hiddeviceobject);
bool windowssysWindowsWin32DevicesHumaninterfacedeviceHidDFreePreparsedData(int64_t preparseddata);
bool windowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetAttributes(void* hiddeviceobject, void* attributes);
bool windowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetConfiguration(void* hiddeviceobject, void* configuration, uint32_t configurationlength);
bool windowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetFeature(void* hiddeviceobject, void* reportbuffer, uint32_t reportbufferlength);
void windowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetHidGuid(void* hidguid);
bool windowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetIndexedString(void* hiddeviceobject, uint32_t stringindex, void* buffer, uint32_t bufferlength);
bool windowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetInputReport(void* hiddeviceobject, void* reportbuffer, uint32_t reportbufferlength);
bool windowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetManufacturerString(void* hiddeviceobject, void* buffer, uint32_t bufferlength);
bool windowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetMsGenreDescriptor(void* hiddeviceobject, void* buffer, uint32_t bufferlength);
bool windowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetNumInputBuffers(void* hiddeviceobject, void* numberbuffers);
bool windowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetPhysicalDescriptor(void* hiddeviceobject, void* buffer, uint32_t bufferlength);
bool windowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetPreparsedData(void* hiddeviceobject, void* preparseddata);
bool windowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetProductString(void* hiddeviceobject, void* buffer, uint32_t bufferlength);
bool windowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetSerialNumberString(void* hiddeviceobject, void* buffer, uint32_t bufferlength);
bool windowssysWindowsWin32DevicesHumaninterfacedeviceHidDSetConfiguration(void* hiddeviceobject, void* configuration, uint32_t configurationlength);
bool windowssysWindowsWin32DevicesHumaninterfacedeviceHidDSetFeature(void* hiddeviceobject, void* reportbuffer, uint32_t reportbufferlength);
bool windowssysWindowsWin32DevicesHumaninterfacedeviceHidDSetNumInputBuffers(void* hiddeviceobject, uint32_t numberbuffers);
bool windowssysWindowsWin32DevicesHumaninterfacedeviceHidDSetOutputReport(void* hiddeviceobject, void* reportbuffer, uint32_t reportbufferlength);
int32_t windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetButtonArray(int32_t reporttype, uint16_t usagepage, uint16_t linkcollection, uint16_t usage, void* buttondata, void* buttondatalength, int64_t preparseddata, void* report, uint32_t reportlength);
int32_t windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetButtonCaps(int32_t reporttype, void* buttoncaps, void* buttoncapslength, int64_t preparseddata);
int32_t windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetCaps(int64_t preparseddata, void* capabilities);
int32_t windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetData(int32_t reporttype, void* datalist, void* datalength, int64_t preparseddata, void* report, uint32_t reportlength);
int32_t windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetExtendedAttributes(int32_t reporttype, uint16_t dataindex, int64_t preparseddata, void* attributes, void* lengthattributes);
int32_t windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetLinkCollectionNodes(void* linkcollectionnodes, void* linkcollectionnodeslength, int64_t preparseddata);
int32_t windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetScaledUsageValue(int32_t reporttype, uint16_t usagepage, uint16_t linkcollection, uint16_t usage, void* usagevalue, int64_t preparseddata, void* report, uint32_t reportlength);
int32_t windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetSpecificButtonCaps(int32_t reporttype, uint16_t usagepage, uint16_t linkcollection, uint16_t usage, void* buttoncaps, void* buttoncapslength, int64_t preparseddata);
int32_t windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetSpecificValueCaps(int32_t reporttype, uint16_t usagepage, uint16_t linkcollection, uint16_t usage, void* valuecaps, void* valuecapslength, int64_t preparseddata);
int32_t windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetUsageValue(int32_t reporttype, uint16_t usagepage, uint16_t linkcollection, uint16_t usage, void* usagevalue, int64_t preparseddata, void* report, uint32_t reportlength);
int32_t windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetUsageValueArray(int32_t reporttype, uint16_t usagepage, uint16_t linkcollection, uint16_t usage, void* usagevalue, uint16_t usagevaluebytelength, int64_t preparseddata, void* report, uint32_t reportlength);
int32_t windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetUsages(int32_t reporttype, uint16_t usagepage, uint16_t linkcollection, void* usagelist, void* usagelength, int64_t preparseddata, void* report, uint32_t reportlength);
int32_t windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetUsagesEx(int32_t reporttype, uint16_t linkcollection, void* buttonlist, void* usagelength, int64_t preparseddata, void* report, uint32_t reportlength);
int32_t windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetValueCaps(int32_t reporttype, void* valuecaps, void* valuecapslength, int64_t preparseddata);
int32_t windowssysWindowsWin32DevicesHumaninterfacedeviceHidPInitializeReportForId(int32_t reporttype, uint8_t reportid, int64_t preparseddata, void* report, uint32_t reportlength);
uint32_t windowssysWindowsWin32DevicesHumaninterfacedeviceHidPMaxDataListLength(int32_t reporttype, int64_t preparseddata);
uint32_t windowssysWindowsWin32DevicesHumaninterfacedeviceHidPMaxUsageListLength(int32_t reporttype, uint16_t usagepage, int64_t preparseddata);
int32_t windowssysWindowsWin32DevicesHumaninterfacedeviceHidPSetButtonArray(int32_t reporttype, uint16_t usagepage, uint16_t linkcollection, uint16_t usage, void* buttondata, uint16_t buttondatalength, int64_t preparseddata, void* report, uint32_t reportlength);
int32_t windowssysWindowsWin32DevicesHumaninterfacedeviceHidPSetData(int32_t reporttype, void* datalist, void* datalength, int64_t preparseddata, void* report, uint32_t reportlength);
int32_t windowssysWindowsWin32DevicesHumaninterfacedeviceHidPSetScaledUsageValue(int32_t reporttype, uint16_t usagepage, uint16_t linkcollection, uint16_t usage, int32_t usagevalue, int64_t preparseddata, void* report, uint32_t reportlength);
int32_t windowssysWindowsWin32DevicesHumaninterfacedeviceHidPSetUsageValue(int32_t reporttype, uint16_t usagepage, uint16_t linkcollection, uint16_t usage, uint32_t usagevalue, int64_t preparseddata, void* report, uint32_t reportlength);
int32_t windowssysWindowsWin32DevicesHumaninterfacedeviceHidPSetUsageValueArray(int32_t reporttype, uint16_t usagepage, uint16_t linkcollection, uint16_t usage, void* usagevalue, uint16_t usagevaluebytelength, int64_t preparseddata, void* report, uint32_t reportlength);
int32_t windowssysWindowsWin32DevicesHumaninterfacedeviceHidPSetUsages(int32_t reporttype, uint16_t usagepage, uint16_t linkcollection, void* usagelist, void* usagelength, int64_t preparseddata, void* report, uint32_t reportlength);
int32_t windowssysWindowsWin32DevicesHumaninterfacedeviceHidPTranslateUsagesToI8042ScanCodes(void* changedusagelist, uint32_t usagelistlength, int32_t keyaction, void* modifierstate, void* insertcodesprocedure, void* insertcodescontext);
int32_t windowssysWindowsWin32DevicesHumaninterfacedeviceHidPUnsetUsages(int32_t reporttype, uint16_t usagepage, uint16_t linkcollection, void* usagelist, void* usagelength, int64_t preparseddata, void* report, uint32_t reportlength);
int32_t windowssysWindowsWin32DevicesHumaninterfacedeviceHidPUsageListDifference(void* previoususagelist, void* currentusagelist, void* breakusagelist, void* makeusagelist, uint32_t usagelistlength);
uint32_t windowssysWindowsWin32DevicesHumaninterfacedeviceJoyConfigChanged(uint32_t dwflags);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_DEVICES_HUMANINTERFACEDEVICE_WINDOWS_WIN32_DEVICES_HUMANINTERFACEDEVICE_WRAPPER_H */
