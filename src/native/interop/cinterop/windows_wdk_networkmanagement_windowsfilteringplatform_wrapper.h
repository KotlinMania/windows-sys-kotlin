#ifndef WINDOWSSYS_WINDOWS_WDK_NETWORKMANAGEMENT_WINDOWSFILTERINGPLATFORM_WINDOWS_WDK_NETWORKMANAGEMENT_WINDOWSFILTERINGPLATFORM_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WDK_NETWORKMANAGEMENT_WINDOWSFILTERINGPLATFORM_WINDOWS_WDK_NETWORKMANAGEMENT_WINDOWSFILTERINGPLATFORM_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmBfeStateGet0(void);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmBfeStateSubscribeChanges0(void* deviceobject, void* callback, void* context, void* changehandle);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmBfeStateUnsubscribeChanges0(void* changehandle);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmCalloutAdd0(void* enginehandle, void* callout, void* sd, void* id);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmCalloutCreateEnumHandle0(void* enginehandle, void* enumtemplate, void* enumhandle);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmCalloutDeleteById0(void* enginehandle, uint32_t id);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmCalloutDeleteByKey0(void* enginehandle, void* key);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmCalloutDestroyEnumHandle0(void* enginehandle, void* enumhandle);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmCalloutEnum0(void* enginehandle, void* enumhandle, uint32_t numentriesrequested, void* entries, void* numentriesreturned);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmCalloutGetById0(void* enginehandle, uint32_t id, void* callout);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmCalloutGetByKey0(void* enginehandle, void* key, void* callout);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmCalloutGetSecurityInfoByKey0(void* enginehandle, void* key, uint32_t securityinfo, void* sidowner, void* sidgroup, void* dacl, void* sacl, void* securitydescriptor);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmCalloutSetSecurityInfoByKey0(void* enginehandle, void* key, uint32_t securityinfo, void* sidowner, void* sidgroup, void* dacl, void* sacl);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmConnectionCreateEnumHandle0(void* enginehandle, void* enumtemplate, void* enumhandle);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmConnectionDestroyEnumHandle0(void* enginehandle, void* enumhandle);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmConnectionEnum0(void* enginehandle, void* enumhandle, uint32_t numentriesrequested, void* entries, void* numentriesreturned);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmConnectionGetById0(void* enginehandle, uint64_t id, void* connection);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmConnectionGetSecurityInfo0(void* enginehandle, uint32_t securityinfo, void* sidowner, void* sidgroup, void* dacl, void* sacl, void* securitydescriptor);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmConnectionSetSecurityInfo0(void* enginehandle, uint32_t securityinfo, void* sidowner, void* sidgroup, void* dacl, void* sacl);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmEngineClose0(void* enginehandle);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmEngineGetOption0(void* enginehandle, int32_t option, void* value);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmEngineGetSecurityInfo0(void* enginehandle, uint32_t securityinfo, void* sidowner, void* sidgroup, void* dacl, void* sacl, void* securitydescriptor);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmEngineOpen0(void* servername, uint32_t authnservice, void* authidentity, void* session, void* enginehandle);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmEngineSetOption0(void* enginehandle, int32_t option, void* newvalue);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmEngineSetSecurityInfo0(void* enginehandle, uint32_t securityinfo, void* sidowner, void* sidgroup, void* dacl, void* sacl);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmFilterAdd0(void* enginehandle, void* filter, void* sd, void* id);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmFilterCreateEnumHandle0(void* enginehandle, void* enumtemplate, void* enumhandle);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmFilterDeleteById0(void* enginehandle, uint64_t id);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmFilterDeleteByKey0(void* enginehandle, void* key);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmFilterDestroyEnumHandle0(void* enginehandle, void* enumhandle);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmFilterEnum0(void* enginehandle, void* enumhandle, uint32_t numentriesrequested, void* entries, void* numentriesreturned);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmFilterGetById0(void* enginehandle, uint64_t id, void* filter);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmFilterGetByKey0(void* enginehandle, void* key, void* filter);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmFilterGetSecurityInfoByKey0(void* enginehandle, void* key, uint32_t securityinfo, void* sidowner, void* sidgroup, void* dacl, void* sacl, void* securitydescriptor);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmFilterSetSecurityInfoByKey0(void* enginehandle, void* key, uint32_t securityinfo, void* sidowner, void* sidgroup, void* dacl, void* sacl);
void windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmFreeMemory0(void* p);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmIPsecTunnelAdd0(void* enginehandle, uint32_t flags, void* mainmodepolicy, void* tunnelpolicy, uint32_t numfilterconditions, void* filterconditions, void* sd);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmIPsecTunnelAdd1(void* enginehandle, uint32_t flags, void* mainmodepolicy, void* tunnelpolicy, uint32_t numfilterconditions, void* filterconditions, void* keymodkey, void* sd);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmIPsecTunnelAdd2(void* enginehandle, uint32_t flags, void* mainmodepolicy, void* tunnelpolicy, uint32_t numfilterconditions, void* filterconditions, void* keymodkey, void* sd);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmIPsecTunnelAdd3(void* enginehandle, uint32_t flags, void* mainmodepolicy, void* tunnelpolicy, uint32_t numfilterconditions, void* filterconditions, void* keymodkey, void* sd);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmIPsecTunnelDeleteByKey0(void* enginehandle, void* key);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmLayerCreateEnumHandle0(void* enginehandle, void* enumtemplate, void* enumhandle);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmLayerDestroyEnumHandle0(void* enginehandle, void* enumhandle);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmLayerEnum0(void* enginehandle, void* enumhandle, uint32_t numentriesrequested, void* entries, void* numentriesreturned);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmLayerGetById0(void* enginehandle, uint16_t id, void* layer);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmLayerGetByKey0(void* enginehandle, void* key, void* layer);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmLayerGetSecurityInfoByKey0(void* enginehandle, void* key, uint32_t securityinfo, void* sidowner, void* sidgroup, void* dacl, void* sacl, void* securitydescriptor);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmLayerSetSecurityInfoByKey0(void* enginehandle, void* key, uint32_t securityinfo, void* sidowner, void* sidgroup, void* dacl, void* sacl);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmNetEventCreateEnumHandle0(void* enginehandle, void* enumtemplate, void* enumhandle);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmNetEventDestroyEnumHandle0(void* enginehandle, void* enumhandle);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmNetEventEnum0(void* enginehandle, void* enumhandle, uint32_t numentriesrequested, void* entries, void* numentriesreturned);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmNetEventEnum1(void* enginehandle, void* enumhandle, uint32_t numentriesrequested, void* entries, void* numentriesreturned);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmNetEventEnum2(void* enginehandle, void* enumhandle, uint32_t numentriesrequested, void* entries, void* numentriesreturned);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmNetEventEnum3(void* enginehandle, void* enumhandle, uint32_t numentriesrequested, void* entries, void* numentriesreturned);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmNetEventEnum4(void* enginehandle, void* enumhandle, uint32_t numentriesrequested, void* entries, void* numentriesreturned);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmNetEventEnum5(void* enginehandle, void* enumhandle, uint32_t numentriesrequested, void* entries, void* numentriesreturned);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmNetEventsGetSecurityInfo0(void* enginehandle, uint32_t securityinfo, void* sidowner, void* sidgroup, void* dacl, void* sacl, void* securitydescriptor);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmNetEventsSetSecurityInfo0(void* enginehandle, uint32_t securityinfo, void* sidowner, void* sidgroup, void* dacl, void* sacl);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmProviderAdd0(void* enginehandle, void* provider, void* sd);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmProviderContextAdd0(void* enginehandle, void* providercontext, void* sd, void* id);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmProviderContextAdd1(void* enginehandle, void* providercontext, void* sd, void* id);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmProviderContextAdd2(void* enginehandle, void* providercontext, void* sd, void* id);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmProviderContextAdd3(void* enginehandle, void* providercontext, void* sd, void* id);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmProviderContextCreateEnumHandle0(void* enginehandle, void* enumtemplate, void* enumhandle);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmProviderContextDeleteById0(void* enginehandle, uint64_t id);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmProviderContextDeleteByKey0(void* enginehandle, void* key);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmProviderContextDestroyEnumHandle0(void* enginehandle, void* enumhandle);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmProviderContextEnum0(void* enginehandle, void* enumhandle, uint32_t numentriesrequested, void* entries, void* numentriesreturned);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmProviderContextEnum1(void* enginehandle, void* enumhandle, uint32_t numentriesrequested, void* entries, void* numentriesreturned);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmProviderContextEnum2(void* enginehandle, void* enumhandle, uint32_t numentriesrequested, void* entries, void* numentriesreturned);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmProviderContextEnum3(void* enginehandle, void* enumhandle, uint32_t numentriesrequested, void* entries, void* numentriesreturned);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmProviderContextGetById0(void* enginehandle, uint64_t id, void* providercontext);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmProviderContextGetById1(void* enginehandle, uint64_t id, void* providercontext);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmProviderContextGetById2(void* enginehandle, uint64_t id, void* providercontext);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmProviderContextGetById3(void* enginehandle, uint64_t id, void* providercontext);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmProviderContextGetByKey0(void* enginehandle, void* key, void* providercontext);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmProviderContextGetByKey1(void* enginehandle, void* key, void* providercontext);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmProviderContextGetByKey2(void* enginehandle, void* key, void* providercontext);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmProviderContextGetByKey3(void* enginehandle, void* key, void* providercontext);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmProviderContextGetSecurityInfoByKey0(void* enginehandle, void* key, uint32_t securityinfo, void* sidowner, void* sidgroup, void* dacl, void* sacl, void* securitydescriptor);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmProviderContextSetSecurityInfoByKey0(void* enginehandle, void* key, uint32_t securityinfo, void* sidowner, void* sidgroup, void* dacl, void* sacl);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmProviderCreateEnumHandle0(void* enginehandle, void* enumtemplate, void* enumhandle);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmProviderDeleteByKey0(void* enginehandle, void* key);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmProviderDestroyEnumHandle0(void* enginehandle, void* enumhandle);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmProviderEnum0(void* enginehandle, void* enumhandle, uint32_t numentriesrequested, void* entries, void* numentriesreturned);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmProviderGetByKey0(void* enginehandle, void* key, void* provider);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmProviderGetSecurityInfoByKey0(void* enginehandle, void* key, uint32_t securityinfo, void* sidowner, void* sidgroup, void* dacl, void* sacl, void* securitydescriptor);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmProviderSetSecurityInfoByKey0(void* enginehandle, void* key, uint32_t securityinfo, void* sidowner, void* sidgroup, void* dacl, void* sacl);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmSessionCreateEnumHandle0(void* enginehandle, void* enumtemplate, void* enumhandle);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmSessionDestroyEnumHandle0(void* enginehandle, void* enumhandle);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmSessionEnum0(void* enginehandle, void* enumhandle, uint32_t numentriesrequested, void* entries, void* numentriesreturned);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmSubLayerAdd0(void* enginehandle, void* sublayer, void* sd);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmSubLayerCreateEnumHandle0(void* enginehandle, void* enumtemplate, void* enumhandle);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmSubLayerDeleteByKey0(void* enginehandle, void* key);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmSubLayerDestroyEnumHandle0(void* enginehandle, void* enumhandle);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmSubLayerEnum0(void* enginehandle, void* enumhandle, uint32_t numentriesrequested, void* entries, void* numentriesreturned);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmSubLayerGetByKey0(void* enginehandle, void* key, void* sublayer);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmSubLayerGetSecurityInfoByKey0(void* enginehandle, void* key, uint32_t securityinfo, void* sidowner, void* sidgroup, void* dacl, void* sacl, void* securitydescriptor);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmSubLayerSetSecurityInfoByKey0(void* enginehandle, void* key, uint32_t securityinfo, void* sidowner, void* sidgroup, void* dacl, void* sacl);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmTransactionAbort0(void* enginehandle);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmTransactionBegin0(void* enginehandle, uint32_t flags);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmTransactionCommit0(void* enginehandle);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmvSwitchEventsGetSecurityInfo0(void* enginehandle, uint32_t securityinfo, void* sidowner, void* sidgroup, void* dacl, void* sacl, void* securitydescriptor);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmvSwitchEventsSetSecurityInfo0(void* enginehandle, uint32_t securityinfo, void* sidowner, void* sidgroup, void* dacl, void* sacl);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_iPsecDospGetSecurityInfo0(void* enginehandle, uint32_t securityinfo, void* sidowner, void* sidgroup, void* dacl, void* sacl, void* securitydescriptor);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_iPsecDospGetStatistics0(void* enginehandle, void* idpstatistics);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_iPsecDospSetSecurityInfo0(void* enginehandle, uint32_t securityinfo, void* sidowner, void* sidgroup, void* dacl, void* sacl);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_iPsecDospStateCreateEnumHandle0(void* enginehandle, void* enumtemplate, void* enumhandle);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_iPsecDospStateDestroyEnumHandle0(void* enginehandle, void* enumhandle);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_iPsecDospStateEnum0(void* enginehandle, void* enumhandle, uint32_t numentriesrequested, void* entries, void* numentries);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_iPsecGetStatistics0(void* enginehandle, void* ipsecstatistics);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_iPsecGetStatistics1(void* enginehandle, void* ipsecstatistics);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_iPsecSaContextAddInbound0(void* enginehandle, uint64_t id, void* inboundbundle);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_iPsecSaContextAddInbound1(void* enginehandle, uint64_t id, void* inboundbundle);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_iPsecSaContextAddOutbound0(void* enginehandle, uint64_t id, void* outboundbundle);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_iPsecSaContextAddOutbound1(void* enginehandle, uint64_t id, void* outboundbundle);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_iPsecSaContextCreate0(void* enginehandle, void* outboundtraffic, void* inboundfilterid, void* id);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_iPsecSaContextCreate1(void* enginehandle, void* outboundtraffic, void* virtualiftunnelinfo, void* inboundfilterid, void* id);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_iPsecSaContextCreateEnumHandle0(void* enginehandle, void* enumtemplate, void* enumhandle);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_iPsecSaContextDeleteById0(void* enginehandle, uint64_t id);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_iPsecSaContextDestroyEnumHandle0(void* enginehandle, void* enumhandle);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_iPsecSaContextEnum0(void* enginehandle, void* enumhandle, uint32_t numentriesrequested, void* entries, void* numentriesreturned);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_iPsecSaContextEnum1(void* enginehandle, void* enumhandle, uint32_t numentriesrequested, void* entries, void* numentriesreturned);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_iPsecSaContextExpire0(void* enginehandle, uint64_t id);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_iPsecSaContextGetById0(void* enginehandle, uint64_t id, void* sacontext);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_iPsecSaContextGetById1(void* enginehandle, uint64_t id, void* sacontext);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_iPsecSaContextGetSpi0(void* enginehandle, uint64_t id, void* getspi, void* inboundspi);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_iPsecSaContextGetSpi1(void* enginehandle, uint64_t id, void* getspi, void* inboundspi);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_iPsecSaContextSetSpi0(void* enginehandle, uint64_t id, void* getspi, uint32_t inboundspi);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_iPsecSaContextUpdate0(void* enginehandle, uint64_t flags, void* newvalues);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_iPsecSaCreateEnumHandle0(void* enginehandle, void* enumtemplate, void* enumhandle);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_iPsecSaDbGetSecurityInfo0(void* enginehandle, uint32_t securityinfo, void* sidowner, void* sidgroup, void* dacl, void* sacl, void* securitydescriptor);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_iPsecSaDbSetSecurityInfo0(void* enginehandle, uint32_t securityinfo, void* sidowner, void* sidgroup, void* dacl, void* sacl);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_iPsecSaDestroyEnumHandle0(void* enginehandle, void* enumhandle);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_iPsecSaEnum0(void* enginehandle, void* enumhandle, uint32_t numentriesrequested, void* entries, void* numentriesreturned);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_iPsecSaEnum1(void* enginehandle, void* enumhandle, uint32_t numentriesrequested, void* entries, void* numentriesreturned);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_ikeextGetStatistics0(void* enginehandle, void* ikeextstatistics);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_ikeextGetStatistics1(void* enginehandle, void* ikeextstatistics);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_ikeextSaCreateEnumHandle0(void* enginehandle, void* enumtemplate, void* enumhandle);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_ikeextSaDbGetSecurityInfo0(void* enginehandle, uint32_t securityinfo, void* sidowner, void* sidgroup, void* dacl, void* sacl, void* securitydescriptor);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_ikeextSaDbSetSecurityInfo0(void* enginehandle, uint32_t securityinfo, void* sidowner, void* sidgroup, void* dacl, void* sacl);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_ikeextSaDeleteById0(void* enginehandle, uint64_t id);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_ikeextSaDestroyEnumHandle0(void* enginehandle, void* enumhandle);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_ikeextSaEnum0(void* enginehandle, void* enumhandle, uint32_t numentriesrequested, void* entries, void* numentriesreturned);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_ikeextSaEnum1(void* enginehandle, void* enumhandle, uint32_t numentriesrequested, void* entries, void* numentriesreturned);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_ikeextSaEnum2(void* enginehandle, void* enumhandle, uint32_t numentriesrequested, void* entries, void* numentriesreturned);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_ikeextSaGetById0(void* enginehandle, uint64_t id, void* sa);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_ikeextSaGetById1(void* enginehandle, uint64_t id, void* salookupcontext, void* sa);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_ikeextSaGetById2(void* enginehandle, uint64_t id, void* salookupcontext, void* sa);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WDK_NETWORKMANAGEMENT_WINDOWSFILTERINGPLATFORM_WINDOWS_WDK_NETWORKMANAGEMENT_WINDOWSFILTERINGPLATFORM_WRAPPER_H */
