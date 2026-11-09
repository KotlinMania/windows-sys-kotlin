#ifndef WINDOWSSYS_WINDOWS_WDK_NETWORKMANAGEMENT_WINDOWSFILTERINGPLATFORM_WINDOWS_WDK_NETWORKMANAGEMENT_WINDOWSFILTERINGPLATFORM_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WDK_NETWORKMANAGEMENT_WINDOWSFILTERINGPLATFORM_WINDOWS_WDK_NETWORKMANAGEMENT_WINDOWSFILTERINGPLATFORM_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmBfeStateGet0(void);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmBfeStateSubscribeChanges0(void* deviceobject, void* callback, void* context, void* changehandle);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmBfeStateUnsubscribeChanges0(void* changehandle);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmCalloutAdd0(void* enginehandle, void* callout, void* sd, void* id);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmCalloutCreateEnumHandle0(void* enginehandle, void* enumtemplate, void* enumhandle);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmCalloutDeleteById0(void* enginehandle, uint32_t id);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmCalloutDeleteByKey0(void* enginehandle, void* key);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmCalloutDestroyEnumHandle0(void* enginehandle, void* enumhandle);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmCalloutEnum0(void* enginehandle, void* enumhandle, uint32_t numentriesrequested, void* entries, void* numentriesreturned);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmCalloutGetById0(void* enginehandle, uint32_t id, void* callout);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmCalloutGetByKey0(void* enginehandle, void* key, void* callout);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmCalloutGetSecurityInfoByKey0(void* enginehandle, void* key, uint32_t securityinfo, void* sidowner, void* sidgroup, void* dacl, void* sacl, void* securitydescriptor);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmCalloutSetSecurityInfoByKey0(void* enginehandle, void* key, uint32_t securityinfo, void* sidowner, void* sidgroup, void* dacl, void* sacl);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmConnectionCreateEnumHandle0(void* enginehandle, void* enumtemplate, void* enumhandle);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmConnectionDestroyEnumHandle0(void* enginehandle, void* enumhandle);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmConnectionEnum0(void* enginehandle, void* enumhandle, uint32_t numentriesrequested, void* entries, void* numentriesreturned);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmConnectionGetById0(void* enginehandle, uint64_t id, void* connection);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmConnectionGetSecurityInfo0(void* enginehandle, uint32_t securityinfo, void* sidowner, void* sidgroup, void* dacl, void* sacl, void* securitydescriptor);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmConnectionSetSecurityInfo0(void* enginehandle, uint32_t securityinfo, void* sidowner, void* sidgroup, void* dacl, void* sacl);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmEngineClose0(void* enginehandle);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmEngineGetOption0(void* enginehandle, int32_t option, void* value);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmEngineGetSecurityInfo0(void* enginehandle, uint32_t securityinfo, void* sidowner, void* sidgroup, void* dacl, void* sacl, void* securitydescriptor);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmEngineOpen0(void* servername, uint32_t authnservice, void* authidentity, void* session, void* enginehandle);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmEngineSetOption0(void* enginehandle, int32_t option, void* newvalue);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmEngineSetSecurityInfo0(void* enginehandle, uint32_t securityinfo, void* sidowner, void* sidgroup, void* dacl, void* sacl);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmFilterAdd0(void* enginehandle, void* filter, void* sd, void* id);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmFilterCreateEnumHandle0(void* enginehandle, void* enumtemplate, void* enumhandle);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmFilterDeleteById0(void* enginehandle, uint64_t id);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmFilterDeleteByKey0(void* enginehandle, void* key);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmFilterDestroyEnumHandle0(void* enginehandle, void* enumhandle);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmFilterEnum0(void* enginehandle, void* enumhandle, uint32_t numentriesrequested, void* entries, void* numentriesreturned);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmFilterGetById0(void* enginehandle, uint64_t id, void* filter);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmFilterGetByKey0(void* enginehandle, void* key, void* filter);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmFilterGetSecurityInfoByKey0(void* enginehandle, void* key, uint32_t securityinfo, void* sidowner, void* sidgroup, void* dacl, void* sacl, void* securitydescriptor);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmFilterSetSecurityInfoByKey0(void* enginehandle, void* key, uint32_t securityinfo, void* sidowner, void* sidgroup, void* dacl, void* sacl);
void windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmFreeMemory0(void* p);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmIPsecTunnelAdd0(void* enginehandle, uint32_t flags, void* mainmodepolicy, void* tunnelpolicy, uint32_t numfilterconditions, void* filterconditions, void* sd);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmIPsecTunnelAdd1(void* enginehandle, uint32_t flags, void* mainmodepolicy, void* tunnelpolicy, uint32_t numfilterconditions, void* filterconditions, void* keymodkey, void* sd);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmIPsecTunnelAdd2(void* enginehandle, uint32_t flags, void* mainmodepolicy, void* tunnelpolicy, uint32_t numfilterconditions, void* filterconditions, void* keymodkey, void* sd);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmIPsecTunnelAdd3(void* enginehandle, uint32_t flags, void* mainmodepolicy, void* tunnelpolicy, uint32_t numfilterconditions, void* filterconditions, void* keymodkey, void* sd);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmIPsecTunnelDeleteByKey0(void* enginehandle, void* key);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmLayerCreateEnumHandle0(void* enginehandle, void* enumtemplate, void* enumhandle);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmLayerDestroyEnumHandle0(void* enginehandle, void* enumhandle);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmLayerEnum0(void* enginehandle, void* enumhandle, uint32_t numentriesrequested, void* entries, void* numentriesreturned);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmLayerGetById0(void* enginehandle, uint16_t id, void* layer);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmLayerGetByKey0(void* enginehandle, void* key, void* layer);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmLayerGetSecurityInfoByKey0(void* enginehandle, void* key, uint32_t securityinfo, void* sidowner, void* sidgroup, void* dacl, void* sacl, void* securitydescriptor);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmLayerSetSecurityInfoByKey0(void* enginehandle, void* key, uint32_t securityinfo, void* sidowner, void* sidgroup, void* dacl, void* sacl);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmNetEventCreateEnumHandle0(void* enginehandle, void* enumtemplate, void* enumhandle);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmNetEventDestroyEnumHandle0(void* enginehandle, void* enumhandle);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmNetEventEnum0(void* enginehandle, void* enumhandle, uint32_t numentriesrequested, void* entries, void* numentriesreturned);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmNetEventEnum1(void* enginehandle, void* enumhandle, uint32_t numentriesrequested, void* entries, void* numentriesreturned);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmNetEventEnum2(void* enginehandle, void* enumhandle, uint32_t numentriesrequested, void* entries, void* numentriesreturned);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmNetEventEnum3(void* enginehandle, void* enumhandle, uint32_t numentriesrequested, void* entries, void* numentriesreturned);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmNetEventEnum4(void* enginehandle, void* enumhandle, uint32_t numentriesrequested, void* entries, void* numentriesreturned);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmNetEventEnum5(void* enginehandle, void* enumhandle, uint32_t numentriesrequested, void* entries, void* numentriesreturned);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmNetEventsGetSecurityInfo0(void* enginehandle, uint32_t securityinfo, void* sidowner, void* sidgroup, void* dacl, void* sacl, void* securitydescriptor);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmNetEventsSetSecurityInfo0(void* enginehandle, uint32_t securityinfo, void* sidowner, void* sidgroup, void* dacl, void* sacl);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderAdd0(void* enginehandle, void* provider, void* sd);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderContextAdd0(void* enginehandle, void* providercontext, void* sd, void* id);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderContextAdd1(void* enginehandle, void* providercontext, void* sd, void* id);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderContextAdd2(void* enginehandle, void* providercontext, void* sd, void* id);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderContextAdd3(void* enginehandle, void* providercontext, void* sd, void* id);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderContextCreateEnumHandle0(void* enginehandle, void* enumtemplate, void* enumhandle);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderContextDeleteById0(void* enginehandle, uint64_t id);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderContextDeleteByKey0(void* enginehandle, void* key);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderContextDestroyEnumHandle0(void* enginehandle, void* enumhandle);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderContextEnum0(void* enginehandle, void* enumhandle, uint32_t numentriesrequested, void* entries, void* numentriesreturned);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderContextEnum1(void* enginehandle, void* enumhandle, uint32_t numentriesrequested, void* entries, void* numentriesreturned);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderContextEnum2(void* enginehandle, void* enumhandle, uint32_t numentriesrequested, void* entries, void* numentriesreturned);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderContextEnum3(void* enginehandle, void* enumhandle, uint32_t numentriesrequested, void* entries, void* numentriesreturned);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderContextGetById0(void* enginehandle, uint64_t id, void* providercontext);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderContextGetById1(void* enginehandle, uint64_t id, void* providercontext);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderContextGetById2(void* enginehandle, uint64_t id, void* providercontext);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderContextGetById3(void* enginehandle, uint64_t id, void* providercontext);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderContextGetByKey0(void* enginehandle, void* key, void* providercontext);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderContextGetByKey1(void* enginehandle, void* key, void* providercontext);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderContextGetByKey2(void* enginehandle, void* key, void* providercontext);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderContextGetByKey3(void* enginehandle, void* key, void* providercontext);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderContextGetSecurityInfoByKey0(void* enginehandle, void* key, uint32_t securityinfo, void* sidowner, void* sidgroup, void* dacl, void* sacl, void* securitydescriptor);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderContextSetSecurityInfoByKey0(void* enginehandle, void* key, uint32_t securityinfo, void* sidowner, void* sidgroup, void* dacl, void* sacl);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderCreateEnumHandle0(void* enginehandle, void* enumtemplate, void* enumhandle);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderDeleteByKey0(void* enginehandle, void* key);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderDestroyEnumHandle0(void* enginehandle, void* enumhandle);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderEnum0(void* enginehandle, void* enumhandle, uint32_t numentriesrequested, void* entries, void* numentriesreturned);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderGetByKey0(void* enginehandle, void* key, void* provider);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderGetSecurityInfoByKey0(void* enginehandle, void* key, uint32_t securityinfo, void* sidowner, void* sidgroup, void* dacl, void* sacl, void* securitydescriptor);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderSetSecurityInfoByKey0(void* enginehandle, void* key, uint32_t securityinfo, void* sidowner, void* sidgroup, void* dacl, void* sacl);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmSessionCreateEnumHandle0(void* enginehandle, void* enumtemplate, void* enumhandle);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmSessionDestroyEnumHandle0(void* enginehandle, void* enumhandle);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmSessionEnum0(void* enginehandle, void* enumhandle, uint32_t numentriesrequested, void* entries, void* numentriesreturned);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmSubLayerAdd0(void* enginehandle, void* sublayer, void* sd);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmSubLayerCreateEnumHandle0(void* enginehandle, void* enumtemplate, void* enumhandle);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmSubLayerDeleteByKey0(void* enginehandle, void* key);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmSubLayerDestroyEnumHandle0(void* enginehandle, void* enumhandle);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmSubLayerEnum0(void* enginehandle, void* enumhandle, uint32_t numentriesrequested, void* entries, void* numentriesreturned);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmSubLayerGetByKey0(void* enginehandle, void* key, void* sublayer);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmSubLayerGetSecurityInfoByKey0(void* enginehandle, void* key, uint32_t securityinfo, void* sidowner, void* sidgroup, void* dacl, void* sacl, void* securitydescriptor);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmSubLayerSetSecurityInfoByKey0(void* enginehandle, void* key, uint32_t securityinfo, void* sidowner, void* sidgroup, void* dacl, void* sacl);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmTransactionAbort0(void* enginehandle);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmTransactionBegin0(void* enginehandle, uint32_t flags);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmTransactionCommit0(void* enginehandle);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmvSwitchEventsGetSecurityInfo0(void* enginehandle, uint32_t securityinfo, void* sidowner, void* sidgroup, void* dacl, void* sacl, void* securitydescriptor);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmvSwitchEventsSetSecurityInfo0(void* enginehandle, uint32_t securityinfo, void* sidowner, void* sidgroup, void* dacl, void* sacl);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecDospGetSecurityInfo0(void* enginehandle, uint32_t securityinfo, void* sidowner, void* sidgroup, void* dacl, void* sacl, void* securitydescriptor);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecDospGetStatistics0(void* enginehandle, void* idpstatistics);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecDospSetSecurityInfo0(void* enginehandle, uint32_t securityinfo, void* sidowner, void* sidgroup, void* dacl, void* sacl);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecDospStateCreateEnumHandle0(void* enginehandle, void* enumtemplate, void* enumhandle);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecDospStateDestroyEnumHandle0(void* enginehandle, void* enumhandle);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecDospStateEnum0(void* enginehandle, void* enumhandle, uint32_t numentriesrequested, void* entries, void* numentries);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecGetStatistics0(void* enginehandle, void* ipsecstatistics);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecGetStatistics1(void* enginehandle, void* ipsecstatistics);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecSaContextAddInbound0(void* enginehandle, uint64_t id, void* inboundbundle);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecSaContextAddInbound1(void* enginehandle, uint64_t id, void* inboundbundle);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecSaContextAddOutbound0(void* enginehandle, uint64_t id, void* outboundbundle);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecSaContextAddOutbound1(void* enginehandle, uint64_t id, void* outboundbundle);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecSaContextCreate0(void* enginehandle, void* outboundtraffic, void* inboundfilterid, void* id);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecSaContextCreate1(void* enginehandle, void* outboundtraffic, void* virtualiftunnelinfo, void* inboundfilterid, void* id);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecSaContextCreateEnumHandle0(void* enginehandle, void* enumtemplate, void* enumhandle);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecSaContextDeleteById0(void* enginehandle, uint64_t id);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecSaContextDestroyEnumHandle0(void* enginehandle, void* enumhandle);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecSaContextEnum0(void* enginehandle, void* enumhandle, uint32_t numentriesrequested, void* entries, void* numentriesreturned);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecSaContextEnum1(void* enginehandle, void* enumhandle, uint32_t numentriesrequested, void* entries, void* numentriesreturned);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecSaContextExpire0(void* enginehandle, uint64_t id);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecSaContextGetById0(void* enginehandle, uint64_t id, void* sacontext);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecSaContextGetById1(void* enginehandle, uint64_t id, void* sacontext);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecSaContextGetSpi0(void* enginehandle, uint64_t id, void* getspi, void* inboundspi);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecSaContextGetSpi1(void* enginehandle, uint64_t id, void* getspi, void* inboundspi);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecSaContextSetSpi0(void* enginehandle, uint64_t id, void* getspi, uint32_t inboundspi);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecSaContextUpdate0(void* enginehandle, uint64_t flags, void* newvalues);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecSaCreateEnumHandle0(void* enginehandle, void* enumtemplate, void* enumhandle);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecSaDbGetSecurityInfo0(void* enginehandle, uint32_t securityinfo, void* sidowner, void* sidgroup, void* dacl, void* sacl, void* securitydescriptor);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecSaDbSetSecurityInfo0(void* enginehandle, uint32_t securityinfo, void* sidowner, void* sidgroup, void* dacl, void* sacl);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecSaDestroyEnumHandle0(void* enginehandle, void* enumhandle);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecSaEnum0(void* enginehandle, void* enumhandle, uint32_t numentriesrequested, void* entries, void* numentriesreturned);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecSaEnum1(void* enginehandle, void* enumhandle, uint32_t numentriesrequested, void* entries, void* numentriesreturned);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IkeextGetStatistics0(void* enginehandle, void* ikeextstatistics);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IkeextGetStatistics1(void* enginehandle, void* ikeextstatistics);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IkeextSaCreateEnumHandle0(void* enginehandle, void* enumtemplate, void* enumhandle);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IkeextSaDbGetSecurityInfo0(void* enginehandle, uint32_t securityinfo, void* sidowner, void* sidgroup, void* dacl, void* sacl, void* securitydescriptor);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IkeextSaDbSetSecurityInfo0(void* enginehandle, uint32_t securityinfo, void* sidowner, void* sidgroup, void* dacl, void* sacl);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IkeextSaDeleteById0(void* enginehandle, uint64_t id);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IkeextSaDestroyEnumHandle0(void* enginehandle, void* enumhandle);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IkeextSaEnum0(void* enginehandle, void* enumhandle, uint32_t numentriesrequested, void* entries, void* numentriesreturned);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IkeextSaEnum1(void* enginehandle, void* enumhandle, uint32_t numentriesrequested, void* entries, void* numentriesreturned);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IkeextSaEnum2(void* enginehandle, void* enumhandle, uint32_t numentriesrequested, void* entries, void* numentriesreturned);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IkeextSaGetById0(void* enginehandle, uint64_t id, void* sa);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IkeextSaGetById1(void* enginehandle, uint64_t id, void* salookupcontext, void* sa);
int32_t windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IkeextSaGetById2(void* enginehandle, uint64_t id, void* salookupcontext, void* sa);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WDK_NETWORKMANAGEMENT_WINDOWSFILTERINGPLATFORM_WINDOWS_WDK_NETWORKMANAGEMENT_WINDOWSFILTERINGPLATFORM_WRAPPER_H */
