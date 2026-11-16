#ifndef WINDOWSSYS_WINDOWS_WIN32_DEVICES_WEBSERVICESONDEVICES_WINDOWS_WIN32_DEVICES_WEBSERVICESONDEVICES_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_DEVICES_WEBSERVICESONDEVICES_WINDOWS_WIN32_DEVICES_WEBSERVICESONDEVICES_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

void* windowssysWindowsWin32DevicesWebservicesondevicesWSDAllocateLinkedMemory(void* pparent, uint64_t cbsize);
void windowssysWindowsWin32DevicesWebservicesondevicesWSDAttachLinkedMemory(void* pparent, void* pchild);
int32_t windowssysWindowsWin32DevicesWebservicesondevicesWSDCreateDeviceHost(void* pszlocalid, void* pcontext, void* ppdevicehost);
int32_t windowssysWindowsWin32DevicesWebservicesondevicesWSDCreateDeviceHost2(void* pszlocalid, void* pcontext, void* pconfigparams, uint32_t dwconfigparamcount, void* ppdevicehost);
int32_t windowssysWindowsWin32DevicesWebservicesondevicesWSDCreateDeviceHostAdvanced(void* pszlocalid, void* pcontext, void* pphostaddresses, uint32_t dwhostaddresscount, void* ppdevicehost);
int32_t windowssysWindowsWin32DevicesWebservicesondevicesWSDCreateDeviceProxy(void* pszdeviceid, void* pszlocalid, void* pcontext, void* ppdeviceproxy);
int32_t windowssysWindowsWin32DevicesWebservicesondevicesWSDCreateDeviceProxy2(void* pszdeviceid, void* pszlocalid, void* pcontext, void* pconfigparams, uint32_t dwconfigparamcount, void* ppdeviceproxy);
int32_t windowssysWindowsWin32DevicesWebservicesondevicesWSDCreateDeviceProxyAdvanced(void* pszdeviceid, void* pdeviceaddress, void* pszlocalid, void* pcontext, void* ppdeviceproxy);
int32_t windowssysWindowsWin32DevicesWebservicesondevicesWSDCreateDiscoveryProvider(void* pcontext, void* ppprovider);
int32_t windowssysWindowsWin32DevicesWebservicesondevicesWSDCreateDiscoveryProvider2(void* pcontext, void* pconfigparams, uint32_t dwconfigparamcount, void* ppprovider);
int32_t windowssysWindowsWin32DevicesWebservicesondevicesWSDCreateDiscoveryPublisher(void* pcontext, void* pppublisher);
int32_t windowssysWindowsWin32DevicesWebservicesondevicesWSDCreateDiscoveryPublisher2(void* pcontext, void* pconfigparams, uint32_t dwconfigparamcount, void* pppublisher);
int32_t windowssysWindowsWin32DevicesWebservicesondevicesWSDCreateHttpAddress(void* ppaddress);
int32_t windowssysWindowsWin32DevicesWebservicesondevicesWSDCreateHttpMessageParameters(void* pptxparams);
int32_t windowssysWindowsWin32DevicesWebservicesondevicesWSDCreateOutboundAttachment(void* ppattachment);
int32_t windowssysWindowsWin32DevicesWebservicesondevicesWSDCreateUdpAddress(void* ppaddress);
int32_t windowssysWindowsWin32DevicesWebservicesondevicesWSDCreateUdpMessageParameters(void* pptxparams);
void windowssysWindowsWin32DevicesWebservicesondevicesWSDDetachLinkedMemory(void* pvoid);
void windowssysWindowsWin32DevicesWebservicesondevicesWSDFreeLinkedMemory(void* pvoid);
int32_t windowssysWindowsWin32DevicesWebservicesondevicesWSDGenerateFault(void* pszcode, void* pszsubcode, void* pszreason, void* pszdetail, void* pcontext, void* ppfault);
int32_t windowssysWindowsWin32DevicesWebservicesondevicesWSDGenerateFaultEx(void* pcode, void* psubcode, void* preasons, void* pszdetail, void* ppfault);
int32_t windowssysWindowsWin32DevicesWebservicesondevicesWSDGetConfigurationOption(uint32_t dwoption, void* pvoid, uint32_t cboutbuffer);
int32_t windowssysWindowsWin32DevicesWebservicesondevicesWSDSetConfigurationOption(uint32_t dwoption, void* pvoid, uint32_t cbinbuffer);
int32_t windowssysWindowsWin32DevicesWebservicesondevicesWSDUriDecode(void* source, uint32_t cchsource, void* destout, void* cchdestout);
int32_t windowssysWindowsWin32DevicesWebservicesondevicesWSDUriEncode(void* source, uint32_t cchsource, void* destout, void* cchdestout);
int32_t windowssysWindowsWin32DevicesWebservicesondevicesWSDXMLAddChild(void* pparent, void* pchild);
int32_t windowssysWindowsWin32DevicesWebservicesondevicesWSDXMLAddSibling(void* pfirst, void* psecond);
int32_t windowssysWindowsWin32DevicesWebservicesondevicesWSDXMLBuildAnyForSingleElement(void* pelementname, void* psztext, void* ppany);
int32_t windowssysWindowsWin32DevicesWebservicesondevicesWSDXMLCleanupElement(void* pany);
int32_t windowssysWindowsWin32DevicesWebservicesondevicesWSDXMLCreateContext(void* ppcontext);
int32_t windowssysWindowsWin32DevicesWebservicesondevicesWSDXMLGetNameFromBuiltinNamespace(void* psznamespace, void* pszname, void* ppname);
int32_t windowssysWindowsWin32DevicesWebservicesondevicesWSDXMLGetValueFromAny(void* psznamespace, void* pszname, void* pany, void* ppszvalue);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_DEVICES_WEBSERVICESONDEVICES_WINDOWS_WIN32_DEVICES_WEBSERVICESONDEVICES_WRAPPER_H */
