#ifndef WINDOWSSYS_WINDOWS_WIN32_SYSTEM_DEPLOYMENTSERVICES_WINDOWS_WIN32_SYSTEM_DEPLOYMENTSERVICES_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SYSTEM_DEPLOYMENTSERVICES_WINDOWS_WIN32_SYSTEM_DEPLOYMENTSERVICES_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

uint32_t windowssys_windows_win32_system_deploymentservices_pxeAsyncRecvDone(void* hclientrequest, uint32_t action);
uint32_t windowssys_windows_win32_system_deploymentservices_pxeDhcpAppendOption(void* preplypacket, uint32_t umaxreplypacketlen, void* pureplypacketlen, uint8_t boption, uint8_t boptionlen, void* pvalue);
uint32_t windowssys_windows_win32_system_deploymentservices_pxeDhcpAppendOptionRaw(void* preplypacket, uint32_t umaxreplypacketlen, void* pureplypacketlen, uint16_t ubufferlen, void* pbuffer);
uint32_t windowssys_windows_win32_system_deploymentservices_pxeDhcpGetOptionValue(void* ppacket, uint32_t upacketlen, uint32_t uinstance, uint8_t boption, void* pboptionlen, void* ppoptionvalue);
uint32_t windowssys_windows_win32_system_deploymentservices_pxeDhcpGetVendorOptionValue(void* ppacket, uint32_t upacketlen, uint8_t boption, uint32_t uinstance, void* pboptionlen, void* ppoptionvalue);
uint32_t windowssys_windows_win32_system_deploymentservices_pxeDhcpInitialize(void* precvpacket, uint32_t urecvpacketlen, void* preplypacket, uint32_t umaxreplypacketlen, void* pureplypacketlen);
uint32_t windowssys_windows_win32_system_deploymentservices_pxeDhcpIsValid(void* ppacket, uint32_t upacketlen, int32_t brequestpacket, void* pbpxeoptionpresent);
uint32_t windowssys_windows_win32_system_deploymentservices_pxeDhcpv6AppendOption(void* preply, uint32_t cbreply, void* pcbreplyused, uint16_t woptiontype, uint16_t cboption, void* poption);
uint32_t windowssys_windows_win32_system_deploymentservices_pxeDhcpv6AppendOptionRaw(void* preply, uint32_t cbreply, void* pcbreplyused, uint16_t cbbuffer, void* pbuffer);
uint32_t windowssys_windows_win32_system_deploymentservices_pxeDhcpv6CreateRelayRepl(void* prelaymessages, uint32_t nrelaymessages, void* pinnerpacket, uint32_t cbinnerpacket, void* preplybuffer, uint32_t cbreplybuffer, void* pcbreplybuffer);
uint32_t windowssys_windows_win32_system_deploymentservices_pxeDhcpv6GetOptionValue(void* ppacket, uint32_t upacketlen, uint32_t uinstance, uint16_t woption, void* pwoptionlen, void* ppoptionvalue);
uint32_t windowssys_windows_win32_system_deploymentservices_pxeDhcpv6GetVendorOptionValue(void* ppacket, uint32_t upacketlen, uint32_t dwenterprisenumber, uint16_t woption, uint32_t uinstance, void* pwoptionlen, void* ppoptionvalue);
uint32_t windowssys_windows_win32_system_deploymentservices_pxeDhcpv6Initialize(void* prequest, uint32_t cbrequest, void* preply, uint32_t cbreply, void* pcbreplyused);
uint32_t windowssys_windows_win32_system_deploymentservices_pxeDhcpv6IsValid(void* ppacket, uint32_t upacketlen, int32_t brequestpacket, void* pbpxeoptionpresent);
uint32_t windowssys_windows_win32_system_deploymentservices_pxeDhcpv6ParseRelayForw(void* prelayforwpacket, uint32_t urelayforwpacketlen, void* prelaymessages, uint32_t nrelaymessages, void* pnrelaymessages, void* ppinnerpacket, void* pcbinnerpacket);
uint32_t windowssys_windows_win32_system_deploymentservices_pxeGetServerInfo(uint32_t uinfotype, void* pbuffer, uint32_t ubufferlen);
uint32_t windowssys_windows_win32_system_deploymentservices_pxeGetServerInfoEx(uint32_t uinfotype, void* pbuffer, uint32_t ubufferlen, void* pubufferused);
void* windowssys_windows_win32_system_deploymentservices_pxePacketAllocate(void* hprovider, void* hclientrequest, uint32_t usize);
uint32_t windowssys_windows_win32_system_deploymentservices_pxePacketFree(void* hprovider, void* hclientrequest, void* ppacket);
uint32_t windowssys_windows_win32_system_deploymentservices_pxeProviderEnumClose(void* henum);
uint32_t windowssys_windows_win32_system_deploymentservices_pxeProviderEnumFirst(void* phenum);
uint32_t windowssys_windows_win32_system_deploymentservices_pxeProviderEnumNext(void* henum, void* ppprovider);
uint32_t windowssys_windows_win32_system_deploymentservices_pxeProviderFreeInfo(void* pprovider);
uint32_t windowssys_windows_win32_system_deploymentservices_pxeProviderQueryIndex(void* pszprovidername, void* puindex);
uint32_t windowssys_windows_win32_system_deploymentservices_pxeProviderRegister(void* pszprovidername, void* pszmodulepath, uint32_t arg_2_index, int32_t biscritical, void* phproviderkey);
uint32_t windowssys_windows_win32_system_deploymentservices_pxeProviderSetAttribute(void* hprovider, uint32_t attribute, void* pparameterbuffer, uint32_t uparamlen);
uint32_t windowssys_windows_win32_system_deploymentservices_pxeProviderUnRegister(void* pszprovidername);
uint32_t windowssys_windows_win32_system_deploymentservices_pxeRegisterCallback(void* hprovider, uint32_t callbacktype, void* pcallbackfunction, void* pcontext);
uint32_t windowssys_windows_win32_system_deploymentservices_pxeSendReply(void* hclientrequest, void* ppacket, uint32_t upacketlen, void* paddress);
uint32_t windowssys_windows_win32_system_deploymentservices_pxeTrace(void* hprovider, uint32_t severity, void* pszformat, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3);
uint32_t windowssys_windows_win32_system_deploymentservices_pxeTraceV(void* hprovider, uint32_t severity, void* pszformat, void* params);
uint32_t windowssys_windows_win32_system_deploymentservices_wdsBpAddOption(void* hhandle, uint32_t uoption, uint32_t uvaluelen, void* pvalue);
uint32_t windowssys_windows_win32_system_deploymentservices_wdsBpCloseHandle(void* hhandle);
uint32_t windowssys_windows_win32_system_deploymentservices_wdsBpGetOptionBuffer(void* hhandle, uint32_t ubufferlen, void* pbuffer, void* pubytes);
uint32_t windowssys_windows_win32_system_deploymentservices_wdsBpInitialize(uint8_t bpackettype, void* phhandle);
uint32_t windowssys_windows_win32_system_deploymentservices_wdsBpParseInitialize(void* ppacket, uint32_t upacketlen, void* pbpackettype, void* phhandle);
uint32_t windowssys_windows_win32_system_deploymentservices_wdsBpParseInitializev6(void* ppacket, uint32_t upacketlen, void* pbpackettype, void* phhandle);
uint32_t windowssys_windows_win32_system_deploymentservices_wdsBpQueryOption(void* hhandle, uint32_t uoption, uint32_t uvaluelen, void* pvalue, void* pubytes);
int32_t windowssys_windows_win32_system_deploymentservices_wdsCliAuthorizeSession(void* hsession, void* pcred);
int32_t windowssys_windows_win32_system_deploymentservices_wdsCliCancelTransfer(void* htransfer);
int32_t windowssys_windows_win32_system_deploymentservices_wdsCliClose(void* handle);
int32_t windowssys_windows_win32_system_deploymentservices_wdsCliCreateSession(void* pwszserver, void* pcred, void* phsession);
int32_t windowssys_windows_win32_system_deploymentservices_wdsCliFindFirstImage(void* hsession, void* phfindhandle);
int32_t windowssys_windows_win32_system_deploymentservices_wdsCliFindNextImage(void* handle);
int32_t windowssys_windows_win32_system_deploymentservices_wdsCliFreeStringArray(void* ppwszarray, uint32_t ulcount);
int32_t windowssys_windows_win32_system_deploymentservices_wdsCliGetDriverQueryXml(void* pwszwindirpath, void* ppwszdriverquery);
int32_t windowssys_windows_win32_system_deploymentservices_wdsCliGetEnumerationFlags(void* handle, void* pdwflags);
int32_t windowssys_windows_win32_system_deploymentservices_wdsCliGetImageArchitecture(void* hifh, void* pdwvalue);
int32_t windowssys_windows_win32_system_deploymentservices_wdsCliGetImageDescription(void* hifh, void* ppwszvalue);
int32_t windowssys_windows_win32_system_deploymentservices_wdsCliGetImageFiles(void* hifh, void* pppwszfiles, void* pdwcount);
int32_t windowssys_windows_win32_system_deploymentservices_wdsCliGetImageGroup(void* hifh, void* ppwszvalue);
int32_t windowssys_windows_win32_system_deploymentservices_wdsCliGetImageHalName(void* hifh, void* ppwszvalue);
int32_t windowssys_windows_win32_system_deploymentservices_wdsCliGetImageHandleFromFindHandle(void* findhandle, void* phimagehandle);
int32_t windowssys_windows_win32_system_deploymentservices_wdsCliGetImageHandleFromTransferHandle(void* htransfer, void* phimagehandle);
int32_t windowssys_windows_win32_system_deploymentservices_wdsCliGetImageIndex(void* hifh, void* pdwvalue);
int32_t windowssys_windows_win32_system_deploymentservices_wdsCliGetImageLanguage(void* hifh, void* ppwszvalue);
int32_t windowssys_windows_win32_system_deploymentservices_wdsCliGetImageLanguages(void* hifh, void* pppszvalues, void* pdwnumvalues);
int32_t windowssys_windows_win32_system_deploymentservices_wdsCliGetImageLastModifiedTime(void* hifh, void* ppsystimevalue);
int32_t windowssys_windows_win32_system_deploymentservices_wdsCliGetImageName(void* hifh, void* ppwszvalue);
int32_t windowssys_windows_win32_system_deploymentservices_wdsCliGetImageNamespace(void* hifh, void* ppwszvalue);
int32_t windowssys_windows_win32_system_deploymentservices_wdsCliGetImageParameter(void* hifh, int32_t paramtype, void* presponse, uint32_t uresponselen);
int32_t windowssys_windows_win32_system_deploymentservices_wdsCliGetImagePath(void* hifh, void* ppwszvalue);
int32_t windowssys_windows_win32_system_deploymentservices_wdsCliGetImageSize(void* hifh, void* pullvalue);
int32_t windowssys_windows_win32_system_deploymentservices_wdsCliGetImageType(void* hifh, void* pimagetype);
int32_t windowssys_windows_win32_system_deploymentservices_wdsCliGetImageVersion(void* hifh, void* ppwszvalue);
int32_t windowssys_windows_win32_system_deploymentservices_wdsCliGetTransferSize(void* hifh, void* pullvalue);
int32_t windowssys_windows_win32_system_deploymentservices_wdsCliInitializeLog(void* hsession, uint32_t ulclientarchitecture, void* pwszclientid, void* pwszclientaddress);
int32_t windowssys_windows_win32_system_deploymentservices_wdsCliLog(void* hsession, uint32_t ulloglevel, uint32_t ulmessagecode, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3);
int32_t windowssys_windows_win32_system_deploymentservices_wdsCliObtainDriverPackages(void* himage, void* ppwszservername, void* pppwszdriverpackages, void* pulcount);
int32_t windowssys_windows_win32_system_deploymentservices_wdsCliObtainDriverPackagesEx(void* hsession, void* pwszmachineinfo, void* ppwszservername, void* pppwszdriverpackages, void* pulcount);
int32_t windowssys_windows_win32_system_deploymentservices_wdsCliRegisterTrace(void* pfn);
void windowssys_windows_win32_system_deploymentservices_wdsCliSetTransferBufferSize(uint32_t ulsizeinbytes);
int32_t windowssys_windows_win32_system_deploymentservices_wdsCliTransferFile(void* pwszserver, void* pwsznamespace, void* pwszremotefilepath, void* pwszlocalfilepath, uint32_t dwflags, uint32_t dwreserved, void* pfnwdsclicallback, void* pvuserdata, void* phtransfer);
int32_t windowssys_windows_win32_system_deploymentservices_wdsCliTransferImage(void* himage, void* pwszlocalpath, uint32_t dwflags, uint32_t dwreserved, void* pfnwdsclicallback, void* pvuserdata, void* phtransfer);
int32_t windowssys_windows_win32_system_deploymentservices_wdsCliWaitForTransfer(void* htransfer);
uint32_t windowssys_windows_win32_system_deploymentservices_wdsTransportClientAddRefBuffer(void* pvbuffer);
uint32_t windowssys_windows_win32_system_deploymentservices_wdsTransportClientCancelSession(void* hsessionkey);
uint32_t windowssys_windows_win32_system_deploymentservices_wdsTransportClientCancelSessionEx(void* hsessionkey, uint32_t dwerrorcode);
uint32_t windowssys_windows_win32_system_deploymentservices_wdsTransportClientCloseSession(void* hsessionkey);
uint32_t windowssys_windows_win32_system_deploymentservices_wdsTransportClientCompleteReceive(void* hsessionkey, uint32_t ulsize, void* pulloffset);
uint32_t windowssys_windows_win32_system_deploymentservices_wdsTransportClientInitialize(void);
uint32_t windowssys_windows_win32_system_deploymentservices_wdsTransportClientInitializeSession(void* psessionrequest, void* pcallerdata, void* hsessionkey);
uint32_t windowssys_windows_win32_system_deploymentservices_wdsTransportClientQueryStatus(void* hsessionkey, void* pustatus, void* puerrorcode);
uint32_t windowssys_windows_win32_system_deploymentservices_wdsTransportClientRegisterCallback(void* hsessionkey, int32_t callbackid, void* pfncallback);
uint32_t windowssys_windows_win32_system_deploymentservices_wdsTransportClientReleaseBuffer(void* pvbuffer);
uint32_t windowssys_windows_win32_system_deploymentservices_wdsTransportClientShutdown(void);
uint32_t windowssys_windows_win32_system_deploymentservices_wdsTransportClientStartSession(void* hsessionkey);
uint32_t windowssys_windows_win32_system_deploymentservices_wdsTransportClientWaitForCompletion(void* hsessionkey, uint32_t utimeout);
void* windowssys_windows_win32_system_deploymentservices_wdsTransportServerAllocateBuffer(void* hprovider, uint32_t ulbuffersize);
int32_t windowssys_windows_win32_system_deploymentservices_wdsTransportServerCompleteRead(void* hprovider, uint32_t ulbytesread, void* pvuserdata, int32_t hreadresult);
int32_t windowssys_windows_win32_system_deploymentservices_wdsTransportServerFreeBuffer(void* hprovider, void* pvbuffer);
int32_t windowssys_windows_win32_system_deploymentservices_wdsTransportServerRegisterCallback(void* hprovider, int32_t callbackid, void* pfncallback);
int32_t windowssys_windows_win32_system_deploymentservices_wdsTransportServerTrace(void* hprovider, uint32_t severity, void* pwszformat, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3);
int32_t windowssys_windows_win32_system_deploymentservices_wdsTransportServerTraceV(void* hprovider, uint32_t severity, void* pwszformat, void* params);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SYSTEM_DEPLOYMENTSERVICES_WINDOWS_WIN32_SYSTEM_DEPLOYMENTSERVICES_WRAPPER_H */
