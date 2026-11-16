#ifndef WINDOWSSYS_WINDOWS_WIN32_SYSTEM_DEPLOYMENTSERVICES_WINDOWS_WIN32_SYSTEM_DEPLOYMENTSERVICES_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SYSTEM_DEPLOYMENTSERVICES_WINDOWS_WIN32_SYSTEM_DEPLOYMENTSERVICES_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

uint32_t windowssysWindowsWin32SystemDeploymentservicesPxeAsyncRecvDone(void* hclientrequest, uint32_t action);
uint32_t windowssysWindowsWin32SystemDeploymentservicesPxeDhcpAppendOption(void* preplypacket, uint32_t umaxreplypacketlen, void* pureplypacketlen, uint8_t boption, uint8_t boptionlen, void* pvalue);
uint32_t windowssysWindowsWin32SystemDeploymentservicesPxeDhcpAppendOptionRaw(void* preplypacket, uint32_t umaxreplypacketlen, void* pureplypacketlen, uint16_t ubufferlen, void* pbuffer);
uint32_t windowssysWindowsWin32SystemDeploymentservicesPxeDhcpGetOptionValue(void* ppacket, uint32_t upacketlen, uint32_t uinstance, uint8_t boption, void* pboptionlen, void* ppoptionvalue);
uint32_t windowssysWindowsWin32SystemDeploymentservicesPxeDhcpGetVendorOptionValue(void* ppacket, uint32_t upacketlen, uint8_t boption, uint32_t uinstance, void* pboptionlen, void* ppoptionvalue);
uint32_t windowssysWindowsWin32SystemDeploymentservicesPxeDhcpInitialize(void* precvpacket, uint32_t urecvpacketlen, void* preplypacket, uint32_t umaxreplypacketlen, void* pureplypacketlen);
uint32_t windowssysWindowsWin32SystemDeploymentservicesPxeDhcpIsValid(void* ppacket, uint32_t upacketlen, int32_t brequestpacket, void* pbpxeoptionpresent);
uint32_t windowssysWindowsWin32SystemDeploymentservicesPxeDhcpv6AppendOption(void* preply, uint32_t cbreply, void* pcbreplyused, uint16_t woptiontype, uint16_t cboption, void* poption);
uint32_t windowssysWindowsWin32SystemDeploymentservicesPxeDhcpv6AppendOptionRaw(void* preply, uint32_t cbreply, void* pcbreplyused, uint16_t cbbuffer, void* pbuffer);
uint32_t windowssysWindowsWin32SystemDeploymentservicesPxeDhcpv6CreateRelayRepl(void* prelaymessages, uint32_t nrelaymessages, void* pinnerpacket, uint32_t cbinnerpacket, void* preplybuffer, uint32_t cbreplybuffer, void* pcbreplybuffer);
uint32_t windowssysWindowsWin32SystemDeploymentservicesPxeDhcpv6GetOptionValue(void* ppacket, uint32_t upacketlen, uint32_t uinstance, uint16_t woption, void* pwoptionlen, void* ppoptionvalue);
uint32_t windowssysWindowsWin32SystemDeploymentservicesPxeDhcpv6GetVendorOptionValue(void* ppacket, uint32_t upacketlen, uint32_t dwenterprisenumber, uint16_t woption, uint32_t uinstance, void* pwoptionlen, void* ppoptionvalue);
uint32_t windowssysWindowsWin32SystemDeploymentservicesPxeDhcpv6Initialize(void* prequest, uint32_t cbrequest, void* preply, uint32_t cbreply, void* pcbreplyused);
uint32_t windowssysWindowsWin32SystemDeploymentservicesPxeDhcpv6IsValid(void* ppacket, uint32_t upacketlen, int32_t brequestpacket, void* pbpxeoptionpresent);
uint32_t windowssysWindowsWin32SystemDeploymentservicesPxeDhcpv6ParseRelayForw(void* prelayforwpacket, uint32_t urelayforwpacketlen, void* prelaymessages, uint32_t nrelaymessages, void* pnrelaymessages, void* ppinnerpacket, void* pcbinnerpacket);
uint32_t windowssysWindowsWin32SystemDeploymentservicesPxeGetServerInfo(uint32_t uinfotype, void* pbuffer, uint32_t ubufferlen);
uint32_t windowssysWindowsWin32SystemDeploymentservicesPxeGetServerInfoEx(uint32_t uinfotype, void* pbuffer, uint32_t ubufferlen, void* pubufferused);
void* windowssysWindowsWin32SystemDeploymentservicesPxePacketAllocate(void* hprovider, void* hclientrequest, uint32_t usize);
uint32_t windowssysWindowsWin32SystemDeploymentservicesPxePacketFree(void* hprovider, void* hclientrequest, void* ppacket);
uint32_t windowssysWindowsWin32SystemDeploymentservicesPxeProviderEnumClose(void* henum);
uint32_t windowssysWindowsWin32SystemDeploymentservicesPxeProviderEnumFirst(void* phenum);
uint32_t windowssysWindowsWin32SystemDeploymentservicesPxeProviderEnumNext(void* henum, void* ppprovider);
uint32_t windowssysWindowsWin32SystemDeploymentservicesPxeProviderFreeInfo(void* pprovider);
uint32_t windowssysWindowsWin32SystemDeploymentservicesPxeProviderQueryIndex(void* pszprovidername, void* puindex);
uint32_t windowssysWindowsWin32SystemDeploymentservicesPxeProviderRegister(void* pszprovidername, void* pszmodulepath, uint32_t arg2Index, int32_t biscritical, void* phproviderkey);
uint32_t windowssysWindowsWin32SystemDeploymentservicesPxeProviderSetAttribute(void* hprovider, uint32_t attribute, void* pparameterbuffer, uint32_t uparamlen);
uint32_t windowssysWindowsWin32SystemDeploymentservicesPxeProviderUnRegister(void* pszprovidername);
uint32_t windowssysWindowsWin32SystemDeploymentservicesPxeRegisterCallback(void* hprovider, uint32_t callbacktype, void* pcallbackfunction, void* pcontext);
uint32_t windowssysWindowsWin32SystemDeploymentservicesPxeSendReply(void* hclientrequest, void* ppacket, uint32_t upacketlen, void* paddress);
uint32_t windowssysWindowsWin32SystemDeploymentservicesPxeTrace(void* hprovider, uint32_t severity, void* pszformat, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3);
uint32_t windowssysWindowsWin32SystemDeploymentservicesPxeTraceV(void* hprovider, uint32_t severity, void* pszformat, void* params);
uint32_t windowssysWindowsWin32SystemDeploymentservicesWdsBpAddOption(void* hhandle, uint32_t uoption, uint32_t uvaluelen, void* pvalue);
uint32_t windowssysWindowsWin32SystemDeploymentservicesWdsBpCloseHandle(void* hhandle);
uint32_t windowssysWindowsWin32SystemDeploymentservicesWdsBpGetOptionBuffer(void* hhandle, uint32_t ubufferlen, void* pbuffer, void* pubytes);
uint32_t windowssysWindowsWin32SystemDeploymentservicesWdsBpInitialize(uint8_t bpackettype, void* phhandle);
uint32_t windowssysWindowsWin32SystemDeploymentservicesWdsBpParseInitialize(void* ppacket, uint32_t upacketlen, void* pbpackettype, void* phhandle);
uint32_t windowssysWindowsWin32SystemDeploymentservicesWdsBpParseInitializev6(void* ppacket, uint32_t upacketlen, void* pbpackettype, void* phhandle);
uint32_t windowssysWindowsWin32SystemDeploymentservicesWdsBpQueryOption(void* hhandle, uint32_t uoption, uint32_t uvaluelen, void* pvalue, void* pubytes);
int32_t windowssysWindowsWin32SystemDeploymentservicesWdsCliAuthorizeSession(void* hsession, void* pcred);
int32_t windowssysWindowsWin32SystemDeploymentservicesWdsCliCancelTransfer(void* htransfer);
int32_t windowssysWindowsWin32SystemDeploymentservicesWdsCliClose(void* handle);
int32_t windowssysWindowsWin32SystemDeploymentservicesWdsCliCreateSession(void* pwszserver, void* pcred, void* phsession);
int32_t windowssysWindowsWin32SystemDeploymentservicesWdsCliFindFirstImage(void* hsession, void* phfindhandle);
int32_t windowssysWindowsWin32SystemDeploymentservicesWdsCliFindNextImage(void* handle);
int32_t windowssysWindowsWin32SystemDeploymentservicesWdsCliFreeStringArray(void* ppwszarray, uint32_t ulcount);
int32_t windowssysWindowsWin32SystemDeploymentservicesWdsCliGetDriverQueryXml(void* pwszwindirpath, void* ppwszdriverquery);
int32_t windowssysWindowsWin32SystemDeploymentservicesWdsCliGetEnumerationFlags(void* handle, void* pdwflags);
int32_t windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageArchitecture(void* hifh, void* pdwvalue);
int32_t windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageDescription(void* hifh, void* ppwszvalue);
int32_t windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageFiles(void* hifh, void* pppwszfiles, void* pdwcount);
int32_t windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageGroup(void* hifh, void* ppwszvalue);
int32_t windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageHalName(void* hifh, void* ppwszvalue);
int32_t windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageHandleFromFindHandle(void* findhandle, void* phimagehandle);
int32_t windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageHandleFromTransferHandle(void* htransfer, void* phimagehandle);
int32_t windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageIndex(void* hifh, void* pdwvalue);
int32_t windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageLanguage(void* hifh, void* ppwszvalue);
int32_t windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageLanguages(void* hifh, void* pppszvalues, void* pdwnumvalues);
int32_t windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageLastModifiedTime(void* hifh, void* ppsystimevalue);
int32_t windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageName(void* hifh, void* ppwszvalue);
int32_t windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageNamespace(void* hifh, void* ppwszvalue);
int32_t windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageParameter(void* hifh, int32_t paramtype, void* presponse, uint32_t uresponselen);
int32_t windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImagePath(void* hifh, void* ppwszvalue);
int32_t windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageSize(void* hifh, void* pullvalue);
int32_t windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageType(void* hifh, void* pimagetype);
int32_t windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageVersion(void* hifh, void* ppwszvalue);
int32_t windowssysWindowsWin32SystemDeploymentservicesWdsCliGetTransferSize(void* hifh, void* pullvalue);
int32_t windowssysWindowsWin32SystemDeploymentservicesWdsCliInitializeLog(void* hsession, uint32_t ulclientarchitecture, void* pwszclientid, void* pwszclientaddress);
int32_t windowssysWindowsWin32SystemDeploymentservicesWdsCliLog(void* hsession, uint32_t ulloglevel, uint32_t ulmessagecode, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3);
int32_t windowssysWindowsWin32SystemDeploymentservicesWdsCliObtainDriverPackages(void* himage, void* ppwszservername, void* pppwszdriverpackages, void* pulcount);
int32_t windowssysWindowsWin32SystemDeploymentservicesWdsCliObtainDriverPackagesEx(void* hsession, void* pwszmachineinfo, void* ppwszservername, void* pppwszdriverpackages, void* pulcount);
int32_t windowssysWindowsWin32SystemDeploymentservicesWdsCliRegisterTrace(void* pfn);
void windowssysWindowsWin32SystemDeploymentservicesWdsCliSetTransferBufferSize(uint32_t ulsizeinbytes);
int32_t windowssysWindowsWin32SystemDeploymentservicesWdsCliTransferFile(void* pwszserver, void* pwsznamespace, void* pwszremotefilepath, void* pwszlocalfilepath, uint32_t dwflags, uint32_t dwreserved, void* pfnwdsclicallback, void* pvuserdata, void* phtransfer);
int32_t windowssysWindowsWin32SystemDeploymentservicesWdsCliTransferImage(void* himage, void* pwszlocalpath, uint32_t dwflags, uint32_t dwreserved, void* pfnwdsclicallback, void* pvuserdata, void* phtransfer);
int32_t windowssysWindowsWin32SystemDeploymentservicesWdsCliWaitForTransfer(void* htransfer);
uint32_t windowssysWindowsWin32SystemDeploymentservicesWdsTransportClientAddRefBuffer(void* pvbuffer);
uint32_t windowssysWindowsWin32SystemDeploymentservicesWdsTransportClientCancelSession(void* hsessionkey);
uint32_t windowssysWindowsWin32SystemDeploymentservicesWdsTransportClientCancelSessionEx(void* hsessionkey, uint32_t dwerrorcode);
uint32_t windowssysWindowsWin32SystemDeploymentservicesWdsTransportClientCloseSession(void* hsessionkey);
uint32_t windowssysWindowsWin32SystemDeploymentservicesWdsTransportClientCompleteReceive(void* hsessionkey, uint32_t ulsize, void* pulloffset);
uint32_t windowssysWindowsWin32SystemDeploymentservicesWdsTransportClientInitialize(void);
uint32_t windowssysWindowsWin32SystemDeploymentservicesWdsTransportClientInitializeSession(void* psessionrequest, void* pcallerdata, void* hsessionkey);
uint32_t windowssysWindowsWin32SystemDeploymentservicesWdsTransportClientQueryStatus(void* hsessionkey, void* pustatus, void* puerrorcode);
uint32_t windowssysWindowsWin32SystemDeploymentservicesWdsTransportClientRegisterCallback(void* hsessionkey, int32_t callbackid, void* pfncallback);
uint32_t windowssysWindowsWin32SystemDeploymentservicesWdsTransportClientReleaseBuffer(void* pvbuffer);
uint32_t windowssysWindowsWin32SystemDeploymentservicesWdsTransportClientShutdown(void);
uint32_t windowssysWindowsWin32SystemDeploymentservicesWdsTransportClientStartSession(void* hsessionkey);
uint32_t windowssysWindowsWin32SystemDeploymentservicesWdsTransportClientWaitForCompletion(void* hsessionkey, uint32_t utimeout);
void* windowssysWindowsWin32SystemDeploymentservicesWdsTransportServerAllocateBuffer(void* hprovider, uint32_t ulbuffersize);
int32_t windowssysWindowsWin32SystemDeploymentservicesWdsTransportServerCompleteRead(void* hprovider, uint32_t ulbytesread, void* pvuserdata, int32_t hreadresult);
int32_t windowssysWindowsWin32SystemDeploymentservicesWdsTransportServerFreeBuffer(void* hprovider, void* pvbuffer);
int32_t windowssysWindowsWin32SystemDeploymentservicesWdsTransportServerRegisterCallback(void* hprovider, int32_t callbackid, void* pfncallback);
int32_t windowssysWindowsWin32SystemDeploymentservicesWdsTransportServerTrace(void* hprovider, uint32_t severity, void* pwszformat, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3);
int32_t windowssysWindowsWin32SystemDeploymentservicesWdsTransportServerTraceV(void* hprovider, uint32_t severity, void* pwszformat, void* params);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SYSTEM_DEPLOYMENTSERVICES_WINDOWS_WIN32_SYSTEM_DEPLOYMENTSERVICES_WRAPPER_H */
