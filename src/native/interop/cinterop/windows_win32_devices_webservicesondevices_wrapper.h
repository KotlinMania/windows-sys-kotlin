#ifndef WINDOWSSYS_WINDOWS_WIN32_DEVICES_WEBSERVICESONDEVICES_WINDOWS_WIN32_DEVICES_WEBSERVICESONDEVICES_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_DEVICES_WEBSERVICESONDEVICES_WINDOWS_WIN32_DEVICES_WEBSERVICESONDEVICES_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

void* windowssys_windows_win32_devices_webservicesondevices_WSDAllocateLinkedMemory(void* pparent, uint64_t cbsize);
void windowssys_windows_win32_devices_webservicesondevices_WSDAttachLinkedMemory(void* pparent, void* pchild);
int32_t windowssys_windows_win32_devices_webservicesondevices_WSDCreateDeviceHost(void* pszlocalid, void* pcontext, void* ppdevicehost);
int32_t windowssys_windows_win32_devices_webservicesondevices_WSDCreateDeviceHost2(void* pszlocalid, void* pcontext, void* pconfigparams, uint32_t dwconfigparamcount, void* ppdevicehost);
int32_t windowssys_windows_win32_devices_webservicesondevices_WSDCreateDeviceHostAdvanced(void* pszlocalid, void* pcontext, void* pphostaddresses, uint32_t dwhostaddresscount, void* ppdevicehost);
int32_t windowssys_windows_win32_devices_webservicesondevices_WSDCreateDeviceProxy(void* pszdeviceid, void* pszlocalid, void* pcontext, void* ppdeviceproxy);
int32_t windowssys_windows_win32_devices_webservicesondevices_WSDCreateDeviceProxy2(void* pszdeviceid, void* pszlocalid, void* pcontext, void* pconfigparams, uint32_t dwconfigparamcount, void* ppdeviceproxy);
int32_t windowssys_windows_win32_devices_webservicesondevices_WSDCreateDeviceProxyAdvanced(void* pszdeviceid, void* pdeviceaddress, void* pszlocalid, void* pcontext, void* ppdeviceproxy);
int32_t windowssys_windows_win32_devices_webservicesondevices_WSDCreateDiscoveryProvider(void* pcontext, void* ppprovider);
int32_t windowssys_windows_win32_devices_webservicesondevices_WSDCreateDiscoveryProvider2(void* pcontext, void* pconfigparams, uint32_t dwconfigparamcount, void* ppprovider);
int32_t windowssys_windows_win32_devices_webservicesondevices_WSDCreateDiscoveryPublisher(void* pcontext, void* pppublisher);
int32_t windowssys_windows_win32_devices_webservicesondevices_WSDCreateDiscoveryPublisher2(void* pcontext, void* pconfigparams, uint32_t dwconfigparamcount, void* pppublisher);
int32_t windowssys_windows_win32_devices_webservicesondevices_WSDCreateHttpAddress(void* ppaddress);
int32_t windowssys_windows_win32_devices_webservicesondevices_WSDCreateHttpMessageParameters(void* pptxparams);
int32_t windowssys_windows_win32_devices_webservicesondevices_WSDCreateOutboundAttachment(void* ppattachment);
int32_t windowssys_windows_win32_devices_webservicesondevices_WSDCreateUdpAddress(void* ppaddress);
int32_t windowssys_windows_win32_devices_webservicesondevices_WSDCreateUdpMessageParameters(void* pptxparams);
void windowssys_windows_win32_devices_webservicesondevices_WSDDetachLinkedMemory(void* pvoid);
void windowssys_windows_win32_devices_webservicesondevices_WSDFreeLinkedMemory(void* pvoid);
int32_t windowssys_windows_win32_devices_webservicesondevices_WSDGenerateFault(void* pszcode, void* pszsubcode, void* pszreason, void* pszdetail, void* pcontext, void* ppfault);
int32_t windowssys_windows_win32_devices_webservicesondevices_WSDGenerateFaultEx(void* pcode, void* psubcode, void* preasons, void* pszdetail, void* ppfault);
int32_t windowssys_windows_win32_devices_webservicesondevices_WSDGetConfigurationOption(uint32_t dwoption, void* pvoid, uint32_t cboutbuffer);
int32_t windowssys_windows_win32_devices_webservicesondevices_WSDSetConfigurationOption(uint32_t dwoption, void* pvoid, uint32_t cbinbuffer);
int32_t windowssys_windows_win32_devices_webservicesondevices_WSDUriDecode(void* source, uint32_t cchsource, void* destout, void* cchdestout);
int32_t windowssys_windows_win32_devices_webservicesondevices_WSDUriEncode(void* source, uint32_t cchsource, void* destout, void* cchdestout);
int32_t windowssys_windows_win32_devices_webservicesondevices_WSDXMLAddChild(void* pparent, void* pchild);
int32_t windowssys_windows_win32_devices_webservicesondevices_WSDXMLAddSibling(void* pfirst, void* psecond);
int32_t windowssys_windows_win32_devices_webservicesondevices_WSDXMLBuildAnyForSingleElement(void* pelementname, void* psztext, void* ppany);
int32_t windowssys_windows_win32_devices_webservicesondevices_WSDXMLCleanupElement(void* pany);
int32_t windowssys_windows_win32_devices_webservicesondevices_WSDXMLCreateContext(void* ppcontext);
int32_t windowssys_windows_win32_devices_webservicesondevices_WSDXMLGetNameFromBuiltinNamespace(void* psznamespace, void* pszname, void* ppname);
int32_t windowssys_windows_win32_devices_webservicesondevices_WSDXMLGetValueFromAny(void* psznamespace, void* pszname, void* pany, void* ppszvalue);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_DEVICES_WEBSERVICESONDEVICES_WINDOWS_WIN32_DEVICES_WEBSERVICESONDEVICES_WRAPPER_H */
