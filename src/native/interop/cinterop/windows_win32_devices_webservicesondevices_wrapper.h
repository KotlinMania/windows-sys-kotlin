#ifndef WINDOWSSYS_WINDOWS_WIN32_DEVICES_WEBSERVICESONDEVICES_WINDOWS_WIN32_DEVICES_WEBSERVICESONDEVICES_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_DEVICES_WEBSERVICESONDEVICES_WINDOWS_WIN32_DEVICES_WEBSERVICESONDEVICES_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

void* windowssys_windows_win32_devices_webservicesondevices_wSDAllocateLinkedMemory(void* pparent, uint64_t cbsize);
void windowssys_windows_win32_devices_webservicesondevices_wSDAttachLinkedMemory(void* pparent, void* pchild);
int32_t windowssys_windows_win32_devices_webservicesondevices_wSDCreateDeviceHost(void* pszlocalid, void* pcontext, void* ppdevicehost);
int32_t windowssys_windows_win32_devices_webservicesondevices_wSDCreateDeviceHost2(void* pszlocalid, void* pcontext, void* pconfigparams, uint32_t dwconfigparamcount, void* ppdevicehost);
int32_t windowssys_windows_win32_devices_webservicesondevices_wSDCreateDeviceHostAdvanced(void* pszlocalid, void* pcontext, void* pphostaddresses, uint32_t dwhostaddresscount, void* ppdevicehost);
int32_t windowssys_windows_win32_devices_webservicesondevices_wSDCreateDeviceProxy(void* pszdeviceid, void* pszlocalid, void* pcontext, void* ppdeviceproxy);
int32_t windowssys_windows_win32_devices_webservicesondevices_wSDCreateDeviceProxy2(void* pszdeviceid, void* pszlocalid, void* pcontext, void* pconfigparams, uint32_t dwconfigparamcount, void* ppdeviceproxy);
int32_t windowssys_windows_win32_devices_webservicesondevices_wSDCreateDeviceProxyAdvanced(void* pszdeviceid, void* pdeviceaddress, void* pszlocalid, void* pcontext, void* ppdeviceproxy);
int32_t windowssys_windows_win32_devices_webservicesondevices_wSDCreateDiscoveryProvider(void* pcontext, void* ppprovider);
int32_t windowssys_windows_win32_devices_webservicesondevices_wSDCreateDiscoveryProvider2(void* pcontext, void* pconfigparams, uint32_t dwconfigparamcount, void* ppprovider);
int32_t windowssys_windows_win32_devices_webservicesondevices_wSDCreateDiscoveryPublisher(void* pcontext, void* pppublisher);
int32_t windowssys_windows_win32_devices_webservicesondevices_wSDCreateDiscoveryPublisher2(void* pcontext, void* pconfigparams, uint32_t dwconfigparamcount, void* pppublisher);
int32_t windowssys_windows_win32_devices_webservicesondevices_wSDCreateHttpAddress(void* ppaddress);
int32_t windowssys_windows_win32_devices_webservicesondevices_wSDCreateHttpMessageParameters(void* pptxparams);
int32_t windowssys_windows_win32_devices_webservicesondevices_wSDCreateOutboundAttachment(void* ppattachment);
int32_t windowssys_windows_win32_devices_webservicesondevices_wSDCreateUdpAddress(void* ppaddress);
int32_t windowssys_windows_win32_devices_webservicesondevices_wSDCreateUdpMessageParameters(void* pptxparams);
void windowssys_windows_win32_devices_webservicesondevices_wSDDetachLinkedMemory(void* pvoid);
void windowssys_windows_win32_devices_webservicesondevices_wSDFreeLinkedMemory(void* pvoid);
int32_t windowssys_windows_win32_devices_webservicesondevices_wSDGenerateFault(void* pszcode, void* pszsubcode, void* pszreason, void* pszdetail, void* pcontext, void* ppfault);
int32_t windowssys_windows_win32_devices_webservicesondevices_wSDGenerateFaultEx(void* pcode, void* psubcode, void* preasons, void* pszdetail, void* ppfault);
int32_t windowssys_windows_win32_devices_webservicesondevices_wSDGetConfigurationOption(uint32_t dwoption, void* pvoid, uint32_t cboutbuffer);
int32_t windowssys_windows_win32_devices_webservicesondevices_wSDSetConfigurationOption(uint32_t dwoption, void* pvoid, uint32_t cbinbuffer);
int32_t windowssys_windows_win32_devices_webservicesondevices_wSDUriDecode(void* source, uint32_t cchsource, void* destout, void* cchdestout);
int32_t windowssys_windows_win32_devices_webservicesondevices_wSDUriEncode(void* source, uint32_t cchsource, void* destout, void* cchdestout);
int32_t windowssys_windows_win32_devices_webservicesondevices_wSDXMLAddChild(void* pparent, void* pchild);
int32_t windowssys_windows_win32_devices_webservicesondevices_wSDXMLAddSibling(void* pfirst, void* psecond);
int32_t windowssys_windows_win32_devices_webservicesondevices_wSDXMLBuildAnyForSingleElement(void* pelementname, void* psztext, void* ppany);
int32_t windowssys_windows_win32_devices_webservicesondevices_wSDXMLCleanupElement(void* pany);
int32_t windowssys_windows_win32_devices_webservicesondevices_wSDXMLCreateContext(void* ppcontext);
int32_t windowssys_windows_win32_devices_webservicesondevices_wSDXMLGetNameFromBuiltinNamespace(void* psznamespace, void* pszname, void* ppname);
int32_t windowssys_windows_win32_devices_webservicesondevices_wSDXMLGetValueFromAny(void* psznamespace, void* pszname, void* pany, void* ppszvalue);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_DEVICES_WEBSERVICESONDEVICES_WINDOWS_WIN32_DEVICES_WEBSERVICESONDEVICES_WRAPPER_H */
