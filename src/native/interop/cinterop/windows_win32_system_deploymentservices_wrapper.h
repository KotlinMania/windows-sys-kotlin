#ifndef WINDOWSSYS_WINDOWS_WIN32_SYSTEM_DEPLOYMENTSERVICES_WINDOWS_WIN32_SYSTEM_DEPLOYMENTSERVICES_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SYSTEM_DEPLOYMENTSERVICES_WINDOWS_WIN32_SYSTEM_DEPLOYMENTSERVICES_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

uint32_t windowssys_windows_win32_system_deploymentservices_PxeAsyncRecvDone(void* hclientrequest, uint32_t action);
uint32_t windowssys_windows_win32_system_deploymentservices_PxeDhcpAppendOption(void* preplypacket, uint32_t umaxreplypacketlen, void* pureplypacketlen, uint8_t boption, uint8_t boptionlen, void* pvalue);
uint32_t windowssys_windows_win32_system_deploymentservices_PxeDhcpAppendOptionRaw(void* preplypacket, uint32_t umaxreplypacketlen, void* pureplypacketlen, uint16_t ubufferlen, void* pbuffer);
uint32_t windowssys_windows_win32_system_deploymentservices_PxeDhcpGetOptionValue(void* ppacket, uint32_t upacketlen, uint32_t uinstance, uint8_t boption, void* pboptionlen, void* ppoptionvalue);
uint32_t windowssys_windows_win32_system_deploymentservices_PxeDhcpGetVendorOptionValue(void* ppacket, uint32_t upacketlen, uint8_t boption, uint32_t uinstance, void* pboptionlen, void* ppoptionvalue);
uint32_t windowssys_windows_win32_system_deploymentservices_PxeDhcpInitialize(void* precvpacket, uint32_t urecvpacketlen, void* preplypacket, uint32_t umaxreplypacketlen, void* pureplypacketlen);
uint32_t windowssys_windows_win32_system_deploymentservices_PxeDhcpIsValid(void* ppacket, uint32_t upacketlen, int32_t brequestpacket, void* pbpxeoptionpresent);
uint32_t windowssys_windows_win32_system_deploymentservices_PxeDhcpv6AppendOption(void* preply, uint32_t cbreply, void* pcbreplyused, uint16_t woptiontype, uint16_t cboption, void* poption);
uint32_t windowssys_windows_win32_system_deploymentservices_PxeDhcpv6AppendOptionRaw(void* preply, uint32_t cbreply, void* pcbreplyused, uint16_t cbbuffer, void* pbuffer);
uint32_t windowssys_windows_win32_system_deploymentservices_PxeDhcpv6CreateRelayRepl(void* prelaymessages, uint32_t nrelaymessages, void* pinnerpacket, uint32_t cbinnerpacket, void* preplybuffer, uint32_t cbreplybuffer, void* pcbreplybuffer);
uint32_t windowssys_windows_win32_system_deploymentservices_PxeDhcpv6GetOptionValue(void* ppacket, uint32_t upacketlen, uint32_t uinstance, uint16_t woption, void* pwoptionlen, void* ppoptionvalue);
uint32_t windowssys_windows_win32_system_deploymentservices_PxeDhcpv6GetVendorOptionValue(void* ppacket, uint32_t upacketlen, uint32_t dwenterprisenumber, uint16_t woption, uint32_t uinstance, void* pwoptionlen, void* ppoptionvalue);
uint32_t windowssys_windows_win32_system_deploymentservices_PxeDhcpv6Initialize(void* prequest, uint32_t cbrequest, void* preply, uint32_t cbreply, void* pcbreplyused);
uint32_t windowssys_windows_win32_system_deploymentservices_PxeDhcpv6IsValid(void* ppacket, uint32_t upacketlen, int32_t brequestpacket, void* pbpxeoptionpresent);
uint32_t windowssys_windows_win32_system_deploymentservices_PxeDhcpv6ParseRelayForw(void* prelayforwpacket, uint32_t urelayforwpacketlen, void* prelaymessages, uint32_t nrelaymessages, void* pnrelaymessages, void* ppinnerpacket, void* pcbinnerpacket);
uint32_t windowssys_windows_win32_system_deploymentservices_PxeGetServerInfo(uint32_t uinfotype, void* pbuffer, uint32_t ubufferlen);
uint32_t windowssys_windows_win32_system_deploymentservices_PxeGetServerInfoEx(uint32_t uinfotype, void* pbuffer, uint32_t ubufferlen, void* pubufferused);
void* windowssys_windows_win32_system_deploymentservices_PxePacketAllocate(void* hprovider, void* hclientrequest, uint32_t usize);
uint32_t windowssys_windows_win32_system_deploymentservices_PxePacketFree(void* hprovider, void* hclientrequest, void* ppacket);
uint32_t windowssys_windows_win32_system_deploymentservices_PxeProviderEnumClose(void* henum);
uint32_t windowssys_windows_win32_system_deploymentservices_PxeProviderEnumFirst(void* phenum);
uint32_t windowssys_windows_win32_system_deploymentservices_PxeProviderEnumNext(void* henum, void* ppprovider);
uint32_t windowssys_windows_win32_system_deploymentservices_PxeProviderFreeInfo(void* pprovider);
uint32_t windowssys_windows_win32_system_deploymentservices_PxeProviderQueryIndex(void* pszprovidername, void* puindex);
uint32_t windowssys_windows_win32_system_deploymentservices_PxeProviderRegister(void* pszprovidername, void* pszmodulepath, uint32_t arg_2_index, int32_t biscritical, void* phproviderkey);
uint32_t windowssys_windows_win32_system_deploymentservices_PxeProviderSetAttribute(void* hprovider, uint32_t attribute, void* pparameterbuffer, uint32_t uparamlen);
uint32_t windowssys_windows_win32_system_deploymentservices_PxeProviderUnRegister(void* pszprovidername);
uint32_t windowssys_windows_win32_system_deploymentservices_PxeRegisterCallback(void* hprovider, uint32_t callbacktype, void* pcallbackfunction, void* pcontext);
uint32_t windowssys_windows_win32_system_deploymentservices_PxeSendReply(void* hclientrequest, void* ppacket, uint32_t upacketlen, void* paddress);
uint32_t windowssys_windows_win32_system_deploymentservices_PxeTraceV(void* hprovider, uint32_t severity, void* pszformat, void* params);
uint32_t windowssys_windows_win32_system_deploymentservices_WdsBpAddOption(void* hhandle, uint32_t uoption, uint32_t uvaluelen, void* pvalue);
uint32_t windowssys_windows_win32_system_deploymentservices_WdsBpCloseHandle(void* hhandle);
uint32_t windowssys_windows_win32_system_deploymentservices_WdsBpGetOptionBuffer(void* hhandle, uint32_t ubufferlen, void* pbuffer, void* pubytes);
uint32_t windowssys_windows_win32_system_deploymentservices_WdsBpInitialize(uint8_t bpackettype, void* phhandle);
uint32_t windowssys_windows_win32_system_deploymentservices_WdsBpParseInitialize(void* ppacket, uint32_t upacketlen, void* pbpackettype, void* phhandle);
uint32_t windowssys_windows_win32_system_deploymentservices_WdsBpParseInitializev6(void* ppacket, uint32_t upacketlen, void* pbpackettype, void* phhandle);
uint32_t windowssys_windows_win32_system_deploymentservices_WdsBpQueryOption(void* hhandle, uint32_t uoption, uint32_t uvaluelen, void* pvalue, void* pubytes);
int32_t windowssys_windows_win32_system_deploymentservices_WdsCliAuthorizeSession(void* hsession, void* pcred);
int32_t windowssys_windows_win32_system_deploymentservices_WdsCliCancelTransfer(void* htransfer);
int32_t windowssys_windows_win32_system_deploymentservices_WdsCliClose(void* handle);
int32_t windowssys_windows_win32_system_deploymentservices_WdsCliCreateSession(void* pwszserver, void* pcred, void* phsession);
int32_t windowssys_windows_win32_system_deploymentservices_WdsCliFindFirstImage(void* hsession, void* phfindhandle);
int32_t windowssys_windows_win32_system_deploymentservices_WdsCliFindNextImage(void* handle);
int32_t windowssys_windows_win32_system_deploymentservices_WdsCliFreeStringArray(void* ppwszarray, uint32_t ulcount);
int32_t windowssys_windows_win32_system_deploymentservices_WdsCliGetDriverQueryXml(void* pwszwindirpath, void* ppwszdriverquery);
int32_t windowssys_windows_win32_system_deploymentservices_WdsCliGetEnumerationFlags(void* handle, void* pdwflags);
int32_t windowssys_windows_win32_system_deploymentservices_WdsCliGetImageArchitecture(void* hifh, void* pdwvalue);
int32_t windowssys_windows_win32_system_deploymentservices_WdsCliGetImageDescription(void* hifh, void* ppwszvalue);
int32_t windowssys_windows_win32_system_deploymentservices_WdsCliGetImageFiles(void* hifh, void* pppwszfiles, void* pdwcount);
int32_t windowssys_windows_win32_system_deploymentservices_WdsCliGetImageGroup(void* hifh, void* ppwszvalue);
int32_t windowssys_windows_win32_system_deploymentservices_WdsCliGetImageHalName(void* hifh, void* ppwszvalue);
int32_t windowssys_windows_win32_system_deploymentservices_WdsCliGetImageHandleFromFindHandle(void* findhandle, void* phimagehandle);
int32_t windowssys_windows_win32_system_deploymentservices_WdsCliGetImageHandleFromTransferHandle(void* htransfer, void* phimagehandle);
int32_t windowssys_windows_win32_system_deploymentservices_WdsCliGetImageIndex(void* hifh, void* pdwvalue);
int32_t windowssys_windows_win32_system_deploymentservices_WdsCliGetImageLanguage(void* hifh, void* ppwszvalue);
int32_t windowssys_windows_win32_system_deploymentservices_WdsCliGetImageLanguages(void* hifh, void* pppszvalues, void* pdwnumvalues);
int32_t windowssys_windows_win32_system_deploymentservices_WdsCliGetImageLastModifiedTime(void* hifh, void* ppsystimevalue);
int32_t windowssys_windows_win32_system_deploymentservices_WdsCliGetImageName(void* hifh, void* ppwszvalue);
int32_t windowssys_windows_win32_system_deploymentservices_WdsCliGetImageNamespace(void* hifh, void* ppwszvalue);
int32_t windowssys_windows_win32_system_deploymentservices_WdsCliGetImageParameter(void* hifh, int32_t paramtype, void* presponse, uint32_t uresponselen);
int32_t windowssys_windows_win32_system_deploymentservices_WdsCliGetImagePath(void* hifh, void* ppwszvalue);
int32_t windowssys_windows_win32_system_deploymentservices_WdsCliGetImageSize(void* hifh, void* pullvalue);
int32_t windowssys_windows_win32_system_deploymentservices_WdsCliGetImageType(void* hifh, void* pimagetype);
int32_t windowssys_windows_win32_system_deploymentservices_WdsCliGetImageVersion(void* hifh, void* ppwszvalue);
int32_t windowssys_windows_win32_system_deploymentservices_WdsCliGetTransferSize(void* hifh, void* pullvalue);
int32_t windowssys_windows_win32_system_deploymentservices_WdsCliInitializeLog(void* hsession, uint32_t ulclientarchitecture, void* pwszclientid, void* pwszclientaddress);
int32_t windowssys_windows_win32_system_deploymentservices_WdsCliObtainDriverPackages(void* himage, void* ppwszservername, void* pppwszdriverpackages, void* pulcount);
int32_t windowssys_windows_win32_system_deploymentservices_WdsCliObtainDriverPackagesEx(void* hsession, void* pwszmachineinfo, void* ppwszservername, void* pppwszdriverpackages, void* pulcount);
int32_t windowssys_windows_win32_system_deploymentservices_WdsCliRegisterTrace(void* pfn);
void windowssys_windows_win32_system_deploymentservices_WdsCliSetTransferBufferSize(uint32_t ulsizeinbytes);
int32_t windowssys_windows_win32_system_deploymentservices_WdsCliTransferFile(void* pwszserver, void* pwsznamespace, void* pwszremotefilepath, void* pwszlocalfilepath, uint32_t dwflags, uint32_t dwreserved, void* pfnwdsclicallback, void* pvuserdata, void* phtransfer);
int32_t windowssys_windows_win32_system_deploymentservices_WdsCliTransferImage(void* himage, void* pwszlocalpath, uint32_t dwflags, uint32_t dwreserved, void* pfnwdsclicallback, void* pvuserdata, void* phtransfer);
int32_t windowssys_windows_win32_system_deploymentservices_WdsCliWaitForTransfer(void* htransfer);
uint32_t windowssys_windows_win32_system_deploymentservices_WdsTransportClientAddRefBuffer(void* pvbuffer);
uint32_t windowssys_windows_win32_system_deploymentservices_WdsTransportClientCancelSession(void* hsessionkey);
uint32_t windowssys_windows_win32_system_deploymentservices_WdsTransportClientCancelSessionEx(void* hsessionkey, uint32_t dwerrorcode);
uint32_t windowssys_windows_win32_system_deploymentservices_WdsTransportClientCloseSession(void* hsessionkey);
uint32_t windowssys_windows_win32_system_deploymentservices_WdsTransportClientCompleteReceive(void* hsessionkey, uint32_t ulsize, void* pulloffset);
uint32_t windowssys_windows_win32_system_deploymentservices_WdsTransportClientInitialize(void);
uint32_t windowssys_windows_win32_system_deploymentservices_WdsTransportClientInitializeSession(void* psessionrequest, void* pcallerdata, void* hsessionkey);
uint32_t windowssys_windows_win32_system_deploymentservices_WdsTransportClientQueryStatus(void* hsessionkey, void* pustatus, void* puerrorcode);
uint32_t windowssys_windows_win32_system_deploymentservices_WdsTransportClientRegisterCallback(void* hsessionkey, int32_t callbackid, void* pfncallback);
uint32_t windowssys_windows_win32_system_deploymentservices_WdsTransportClientReleaseBuffer(void* pvbuffer);
uint32_t windowssys_windows_win32_system_deploymentservices_WdsTransportClientShutdown(void);
uint32_t windowssys_windows_win32_system_deploymentservices_WdsTransportClientStartSession(void* hsessionkey);
uint32_t windowssys_windows_win32_system_deploymentservices_WdsTransportClientWaitForCompletion(void* hsessionkey, uint32_t utimeout);
void* windowssys_windows_win32_system_deploymentservices_WdsTransportServerAllocateBuffer(void* hprovider, uint32_t ulbuffersize);
int32_t windowssys_windows_win32_system_deploymentservices_WdsTransportServerCompleteRead(void* hprovider, uint32_t ulbytesread, void* pvuserdata, int32_t hreadresult);
int32_t windowssys_windows_win32_system_deploymentservices_WdsTransportServerFreeBuffer(void* hprovider, void* pvbuffer);
int32_t windowssys_windows_win32_system_deploymentservices_WdsTransportServerRegisterCallback(void* hprovider, int32_t callbackid, void* pfncallback);
int32_t windowssys_windows_win32_system_deploymentservices_WdsTransportServerTraceV(void* hprovider, uint32_t severity, void* pwszformat, void* params);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SYSTEM_DEPLOYMENTSERVICES_WINDOWS_WIN32_SYSTEM_DEPLOYMENTSERVICES_WRAPPER_H */
