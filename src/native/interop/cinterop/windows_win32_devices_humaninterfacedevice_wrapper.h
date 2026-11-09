#ifndef WINDOWSSYS_WINDOWS_WIN32_DEVICES_HUMANINTERFACEDEVICE_WINDOWS_WIN32_DEVICES_HUMANINTERFACEDEVICE_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_DEVICES_HUMANINTERFACEDEVICE_WINDOWS_WIN32_DEVICES_HUMANINTERFACEDEVICE_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssys_windows_win32_devices_humaninterfacedevice_DirectInput8Create(void* hinst, uint32_t dwversion, void* riidltf, void* ppvout, void* punkouter);
bool windowssys_windows_win32_devices_humaninterfacedevice_HidD_FlushQueue(void* hiddeviceobject);
bool windowssys_windows_win32_devices_humaninterfacedevice_HidD_FreePreparsedData(int64_t preparseddata);
bool windowssys_windows_win32_devices_humaninterfacedevice_HidD_GetAttributes(void* hiddeviceobject, void* attributes);
bool windowssys_windows_win32_devices_humaninterfacedevice_HidD_GetConfiguration(void* hiddeviceobject, void* configuration, uint32_t configurationlength);
bool windowssys_windows_win32_devices_humaninterfacedevice_HidD_GetFeature(void* hiddeviceobject, void* reportbuffer, uint32_t reportbufferlength);
void windowssys_windows_win32_devices_humaninterfacedevice_HidD_GetHidGuid(void* hidguid);
bool windowssys_windows_win32_devices_humaninterfacedevice_HidD_GetIndexedString(void* hiddeviceobject, uint32_t stringindex, void* buffer, uint32_t bufferlength);
bool windowssys_windows_win32_devices_humaninterfacedevice_HidD_GetInputReport(void* hiddeviceobject, void* reportbuffer, uint32_t reportbufferlength);
bool windowssys_windows_win32_devices_humaninterfacedevice_HidD_GetManufacturerString(void* hiddeviceobject, void* buffer, uint32_t bufferlength);
bool windowssys_windows_win32_devices_humaninterfacedevice_HidD_GetMsGenreDescriptor(void* hiddeviceobject, void* buffer, uint32_t bufferlength);
bool windowssys_windows_win32_devices_humaninterfacedevice_HidD_GetNumInputBuffers(void* hiddeviceobject, void* numberbuffers);
bool windowssys_windows_win32_devices_humaninterfacedevice_HidD_GetPhysicalDescriptor(void* hiddeviceobject, void* buffer, uint32_t bufferlength);
bool windowssys_windows_win32_devices_humaninterfacedevice_HidD_GetPreparsedData(void* hiddeviceobject, void* preparseddata);
bool windowssys_windows_win32_devices_humaninterfacedevice_HidD_GetProductString(void* hiddeviceobject, void* buffer, uint32_t bufferlength);
bool windowssys_windows_win32_devices_humaninterfacedevice_HidD_GetSerialNumberString(void* hiddeviceobject, void* buffer, uint32_t bufferlength);
bool windowssys_windows_win32_devices_humaninterfacedevice_HidD_SetConfiguration(void* hiddeviceobject, void* configuration, uint32_t configurationlength);
bool windowssys_windows_win32_devices_humaninterfacedevice_HidD_SetFeature(void* hiddeviceobject, void* reportbuffer, uint32_t reportbufferlength);
bool windowssys_windows_win32_devices_humaninterfacedevice_HidD_SetNumInputBuffers(void* hiddeviceobject, uint32_t numberbuffers);
bool windowssys_windows_win32_devices_humaninterfacedevice_HidD_SetOutputReport(void* hiddeviceobject, void* reportbuffer, uint32_t reportbufferlength);
int32_t windowssys_windows_win32_devices_humaninterfacedevice_HidP_GetButtonArray(int32_t reporttype, uint16_t usagepage, uint16_t linkcollection, uint16_t usage, void* buttondata, void* buttondatalength, int64_t preparseddata, void* report, uint32_t reportlength);
int32_t windowssys_windows_win32_devices_humaninterfacedevice_HidP_GetButtonCaps(int32_t reporttype, void* buttoncaps, void* buttoncapslength, int64_t preparseddata);
int32_t windowssys_windows_win32_devices_humaninterfacedevice_HidP_GetCaps(int64_t preparseddata, void* capabilities);
int32_t windowssys_windows_win32_devices_humaninterfacedevice_HidP_GetData(int32_t reporttype, void* datalist, void* datalength, int64_t preparseddata, void* report, uint32_t reportlength);
int32_t windowssys_windows_win32_devices_humaninterfacedevice_HidP_GetExtendedAttributes(int32_t reporttype, uint16_t dataindex, int64_t preparseddata, void* attributes, void* lengthattributes);
int32_t windowssys_windows_win32_devices_humaninterfacedevice_HidP_GetLinkCollectionNodes(void* linkcollectionnodes, void* linkcollectionnodeslength, int64_t preparseddata);
int32_t windowssys_windows_win32_devices_humaninterfacedevice_HidP_GetScaledUsageValue(int32_t reporttype, uint16_t usagepage, uint16_t linkcollection, uint16_t usage, void* usagevalue, int64_t preparseddata, void* report, uint32_t reportlength);
int32_t windowssys_windows_win32_devices_humaninterfacedevice_HidP_GetSpecificButtonCaps(int32_t reporttype, uint16_t usagepage, uint16_t linkcollection, uint16_t usage, void* buttoncaps, void* buttoncapslength, int64_t preparseddata);
int32_t windowssys_windows_win32_devices_humaninterfacedevice_HidP_GetSpecificValueCaps(int32_t reporttype, uint16_t usagepage, uint16_t linkcollection, uint16_t usage, void* valuecaps, void* valuecapslength, int64_t preparseddata);
int32_t windowssys_windows_win32_devices_humaninterfacedevice_HidP_GetUsageValue(int32_t reporttype, uint16_t usagepage, uint16_t linkcollection, uint16_t usage, void* usagevalue, int64_t preparseddata, void* report, uint32_t reportlength);
int32_t windowssys_windows_win32_devices_humaninterfacedevice_HidP_GetUsageValueArray(int32_t reporttype, uint16_t usagepage, uint16_t linkcollection, uint16_t usage, void* usagevalue, uint16_t usagevaluebytelength, int64_t preparseddata, void* report, uint32_t reportlength);
int32_t windowssys_windows_win32_devices_humaninterfacedevice_HidP_GetUsages(int32_t reporttype, uint16_t usagepage, uint16_t linkcollection, void* usagelist, void* usagelength, int64_t preparseddata, void* report, uint32_t reportlength);
int32_t windowssys_windows_win32_devices_humaninterfacedevice_HidP_GetUsagesEx(int32_t reporttype, uint16_t linkcollection, void* buttonlist, void* usagelength, int64_t preparseddata, void* report, uint32_t reportlength);
int32_t windowssys_windows_win32_devices_humaninterfacedevice_HidP_GetValueCaps(int32_t reporttype, void* valuecaps, void* valuecapslength, int64_t preparseddata);
int32_t windowssys_windows_win32_devices_humaninterfacedevice_HidP_InitializeReportForID(int32_t reporttype, uint8_t reportid, int64_t preparseddata, void* report, uint32_t reportlength);
uint32_t windowssys_windows_win32_devices_humaninterfacedevice_HidP_MaxDataListLength(int32_t reporttype, int64_t preparseddata);
uint32_t windowssys_windows_win32_devices_humaninterfacedevice_HidP_MaxUsageListLength(int32_t reporttype, uint16_t usagepage, int64_t preparseddata);
int32_t windowssys_windows_win32_devices_humaninterfacedevice_HidP_SetButtonArray(int32_t reporttype, uint16_t usagepage, uint16_t linkcollection, uint16_t usage, void* buttondata, uint16_t buttondatalength, int64_t preparseddata, void* report, uint32_t reportlength);
int32_t windowssys_windows_win32_devices_humaninterfacedevice_HidP_SetData(int32_t reporttype, void* datalist, void* datalength, int64_t preparseddata, void* report, uint32_t reportlength);
int32_t windowssys_windows_win32_devices_humaninterfacedevice_HidP_SetScaledUsageValue(int32_t reporttype, uint16_t usagepage, uint16_t linkcollection, uint16_t usage, int32_t usagevalue, int64_t preparseddata, void* report, uint32_t reportlength);
int32_t windowssys_windows_win32_devices_humaninterfacedevice_HidP_SetUsageValue(int32_t reporttype, uint16_t usagepage, uint16_t linkcollection, uint16_t usage, uint32_t usagevalue, int64_t preparseddata, void* report, uint32_t reportlength);
int32_t windowssys_windows_win32_devices_humaninterfacedevice_HidP_SetUsageValueArray(int32_t reporttype, uint16_t usagepage, uint16_t linkcollection, uint16_t usage, void* usagevalue, uint16_t usagevaluebytelength, int64_t preparseddata, void* report, uint32_t reportlength);
int32_t windowssys_windows_win32_devices_humaninterfacedevice_HidP_SetUsages(int32_t reporttype, uint16_t usagepage, uint16_t linkcollection, void* usagelist, void* usagelength, int64_t preparseddata, void* report, uint32_t reportlength);
int32_t windowssys_windows_win32_devices_humaninterfacedevice_HidP_TranslateUsagesToI8042ScanCodes(void* changedusagelist, uint32_t usagelistlength, int32_t keyaction, void* modifierstate, void* insertcodesprocedure, void* insertcodescontext);
int32_t windowssys_windows_win32_devices_humaninterfacedevice_HidP_UnsetUsages(int32_t reporttype, uint16_t usagepage, uint16_t linkcollection, void* usagelist, void* usagelength, int64_t preparseddata, void* report, uint32_t reportlength);
int32_t windowssys_windows_win32_devices_humaninterfacedevice_HidP_UsageListDifference(void* previoususagelist, void* currentusagelist, void* breakusagelist, void* makeusagelist, uint32_t usagelistlength);
uint32_t windowssys_windows_win32_devices_humaninterfacedevice_joyConfigChanged(uint32_t dwflags);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_DEVICES_HUMANINTERFACEDEVICE_WINDOWS_WIN32_DEVICES_HUMANINTERFACEDEVICE_WRAPPER_H */
