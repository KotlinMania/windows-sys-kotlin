#ifndef WINDOWSSYS_WINDOWS_WIN32_DEVICES_HUMANINTERFACEDEVICE_WINDOWS_WIN32_DEVICES_HUMANINTERFACEDEVICE_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_DEVICES_HUMANINTERFACEDEVICE_WINDOWS_WIN32_DEVICES_HUMANINTERFACEDEVICE_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssys_windows_win32_devices_humaninterfacedevice_directInput8Create(void* hinst, uint32_t dwversion, void* riidltf, void* ppvout, void* punkouter);
bool windowssys_windows_win32_devices_humaninterfacedevice_hidDFlushQueue(void* hiddeviceobject);
bool windowssys_windows_win32_devices_humaninterfacedevice_hidDFreePreparsedData(int64_t preparseddata);
bool windowssys_windows_win32_devices_humaninterfacedevice_hidDGetAttributes(void* hiddeviceobject, void* attributes);
bool windowssys_windows_win32_devices_humaninterfacedevice_hidDGetConfiguration(void* hiddeviceobject, void* configuration, uint32_t configurationlength);
bool windowssys_windows_win32_devices_humaninterfacedevice_hidDGetFeature(void* hiddeviceobject, void* reportbuffer, uint32_t reportbufferlength);
void windowssys_windows_win32_devices_humaninterfacedevice_hidDGetHidGuid(void* hidguid);
bool windowssys_windows_win32_devices_humaninterfacedevice_hidDGetIndexedString(void* hiddeviceobject, uint32_t stringindex, void* buffer, uint32_t bufferlength);
bool windowssys_windows_win32_devices_humaninterfacedevice_hidDGetInputReport(void* hiddeviceobject, void* reportbuffer, uint32_t reportbufferlength);
bool windowssys_windows_win32_devices_humaninterfacedevice_hidDGetManufacturerString(void* hiddeviceobject, void* buffer, uint32_t bufferlength);
bool windowssys_windows_win32_devices_humaninterfacedevice_hidDGetMsGenreDescriptor(void* hiddeviceobject, void* buffer, uint32_t bufferlength);
bool windowssys_windows_win32_devices_humaninterfacedevice_hidDGetNumInputBuffers(void* hiddeviceobject, void* numberbuffers);
bool windowssys_windows_win32_devices_humaninterfacedevice_hidDGetPhysicalDescriptor(void* hiddeviceobject, void* buffer, uint32_t bufferlength);
bool windowssys_windows_win32_devices_humaninterfacedevice_hidDGetPreparsedData(void* hiddeviceobject, void* preparseddata);
bool windowssys_windows_win32_devices_humaninterfacedevice_hidDGetProductString(void* hiddeviceobject, void* buffer, uint32_t bufferlength);
bool windowssys_windows_win32_devices_humaninterfacedevice_hidDGetSerialNumberString(void* hiddeviceobject, void* buffer, uint32_t bufferlength);
bool windowssys_windows_win32_devices_humaninterfacedevice_hidDSetConfiguration(void* hiddeviceobject, void* configuration, uint32_t configurationlength);
bool windowssys_windows_win32_devices_humaninterfacedevice_hidDSetFeature(void* hiddeviceobject, void* reportbuffer, uint32_t reportbufferlength);
bool windowssys_windows_win32_devices_humaninterfacedevice_hidDSetNumInputBuffers(void* hiddeviceobject, uint32_t numberbuffers);
bool windowssys_windows_win32_devices_humaninterfacedevice_hidDSetOutputReport(void* hiddeviceobject, void* reportbuffer, uint32_t reportbufferlength);
int32_t windowssys_windows_win32_devices_humaninterfacedevice_hidPGetButtonArray(int32_t reporttype, uint16_t usagepage, uint16_t linkcollection, uint16_t usage, void* buttondata, void* buttondatalength, int64_t preparseddata, void* report, uint32_t reportlength);
int32_t windowssys_windows_win32_devices_humaninterfacedevice_hidPGetButtonCaps(int32_t reporttype, void* buttoncaps, void* buttoncapslength, int64_t preparseddata);
int32_t windowssys_windows_win32_devices_humaninterfacedevice_hidPGetCaps(int64_t preparseddata, void* capabilities);
int32_t windowssys_windows_win32_devices_humaninterfacedevice_hidPGetData(int32_t reporttype, void* datalist, void* datalength, int64_t preparseddata, void* report, uint32_t reportlength);
int32_t windowssys_windows_win32_devices_humaninterfacedevice_hidPGetExtendedAttributes(int32_t reporttype, uint16_t dataindex, int64_t preparseddata, void* attributes, void* lengthattributes);
int32_t windowssys_windows_win32_devices_humaninterfacedevice_hidPGetLinkCollectionNodes(void* linkcollectionnodes, void* linkcollectionnodeslength, int64_t preparseddata);
int32_t windowssys_windows_win32_devices_humaninterfacedevice_hidPGetScaledUsageValue(int32_t reporttype, uint16_t usagepage, uint16_t linkcollection, uint16_t usage, void* usagevalue, int64_t preparseddata, void* report, uint32_t reportlength);
int32_t windowssys_windows_win32_devices_humaninterfacedevice_hidPGetSpecificButtonCaps(int32_t reporttype, uint16_t usagepage, uint16_t linkcollection, uint16_t usage, void* buttoncaps, void* buttoncapslength, int64_t preparseddata);
int32_t windowssys_windows_win32_devices_humaninterfacedevice_hidPGetSpecificValueCaps(int32_t reporttype, uint16_t usagepage, uint16_t linkcollection, uint16_t usage, void* valuecaps, void* valuecapslength, int64_t preparseddata);
int32_t windowssys_windows_win32_devices_humaninterfacedevice_hidPGetUsageValue(int32_t reporttype, uint16_t usagepage, uint16_t linkcollection, uint16_t usage, void* usagevalue, int64_t preparseddata, void* report, uint32_t reportlength);
int32_t windowssys_windows_win32_devices_humaninterfacedevice_hidPGetUsageValueArray(int32_t reporttype, uint16_t usagepage, uint16_t linkcollection, uint16_t usage, void* usagevalue, uint16_t usagevaluebytelength, int64_t preparseddata, void* report, uint32_t reportlength);
int32_t windowssys_windows_win32_devices_humaninterfacedevice_hidPGetUsages(int32_t reporttype, uint16_t usagepage, uint16_t linkcollection, void* usagelist, void* usagelength, int64_t preparseddata, void* report, uint32_t reportlength);
int32_t windowssys_windows_win32_devices_humaninterfacedevice_hidPGetUsagesEx(int32_t reporttype, uint16_t linkcollection, void* buttonlist, void* usagelength, int64_t preparseddata, void* report, uint32_t reportlength);
int32_t windowssys_windows_win32_devices_humaninterfacedevice_hidPGetValueCaps(int32_t reporttype, void* valuecaps, void* valuecapslength, int64_t preparseddata);
int32_t windowssys_windows_win32_devices_humaninterfacedevice_hidPInitializeReportForId(int32_t reporttype, uint8_t reportid, int64_t preparseddata, void* report, uint32_t reportlength);
uint32_t windowssys_windows_win32_devices_humaninterfacedevice_hidPMaxDataListLength(int32_t reporttype, int64_t preparseddata);
uint32_t windowssys_windows_win32_devices_humaninterfacedevice_hidPMaxUsageListLength(int32_t reporttype, uint16_t usagepage, int64_t preparseddata);
int32_t windowssys_windows_win32_devices_humaninterfacedevice_hidPSetButtonArray(int32_t reporttype, uint16_t usagepage, uint16_t linkcollection, uint16_t usage, void* buttondata, uint16_t buttondatalength, int64_t preparseddata, void* report, uint32_t reportlength);
int32_t windowssys_windows_win32_devices_humaninterfacedevice_hidPSetData(int32_t reporttype, void* datalist, void* datalength, int64_t preparseddata, void* report, uint32_t reportlength);
int32_t windowssys_windows_win32_devices_humaninterfacedevice_hidPSetScaledUsageValue(int32_t reporttype, uint16_t usagepage, uint16_t linkcollection, uint16_t usage, int32_t usagevalue, int64_t preparseddata, void* report, uint32_t reportlength);
int32_t windowssys_windows_win32_devices_humaninterfacedevice_hidPSetUsageValue(int32_t reporttype, uint16_t usagepage, uint16_t linkcollection, uint16_t usage, uint32_t usagevalue, int64_t preparseddata, void* report, uint32_t reportlength);
int32_t windowssys_windows_win32_devices_humaninterfacedevice_hidPSetUsageValueArray(int32_t reporttype, uint16_t usagepage, uint16_t linkcollection, uint16_t usage, void* usagevalue, uint16_t usagevaluebytelength, int64_t preparseddata, void* report, uint32_t reportlength);
int32_t windowssys_windows_win32_devices_humaninterfacedevice_hidPSetUsages(int32_t reporttype, uint16_t usagepage, uint16_t linkcollection, void* usagelist, void* usagelength, int64_t preparseddata, void* report, uint32_t reportlength);
int32_t windowssys_windows_win32_devices_humaninterfacedevice_hidPTranslateUsagesToI8042ScanCodes(void* changedusagelist, uint32_t usagelistlength, int32_t keyaction, void* modifierstate, void* insertcodesprocedure, void* insertcodescontext);
int32_t windowssys_windows_win32_devices_humaninterfacedevice_hidPUnsetUsages(int32_t reporttype, uint16_t usagepage, uint16_t linkcollection, void* usagelist, void* usagelength, int64_t preparseddata, void* report, uint32_t reportlength);
int32_t windowssys_windows_win32_devices_humaninterfacedevice_hidPUsageListDifference(void* previoususagelist, void* currentusagelist, void* breakusagelist, void* makeusagelist, uint32_t usagelistlength);
uint32_t windowssys_windows_win32_devices_humaninterfacedevice_joyConfigChanged(uint32_t dwflags);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_DEVICES_HUMANINTERFACEDEVICE_WINDOWS_WIN32_DEVICES_HUMANINTERFACEDEVICE_WRAPPER_H */
