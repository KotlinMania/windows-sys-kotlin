#ifndef WINDOWSSYS_WINDOWS_WDK_NETWORKMANAGEMENT_WINDOWSFILTERINGPLATFORM_WINDOWS_WDK_NETWORKMANAGEMENT_WINDOWSFILTERINGPLATFORM_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WDK_NETWORKMANAGEMENT_WINDOWSFILTERINGPLATFORM_WINDOWS_WDK_NETWORKMANAGEMENT_WINDOWSFILTERINGPLATFORM_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmBfeStateGet0(void);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmBfeStateSubscribeChanges0(void* deviceobject, void* callback, void* context, void* changehandle);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmBfeStateUnsubscribeChanges0(void* changehandle);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmCalloutAdd0(void* enginehandle, void* callout, void* sd, void* id);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmCalloutCreateEnumHandle0(void* enginehandle, void* enumtemplate, void* enumhandle);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmCalloutDeleteById0(void* enginehandle, uint32_t id);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmCalloutDeleteByKey0(void* enginehandle, void* key);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmCalloutDestroyEnumHandle0(void* enginehandle, void* enumhandle);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmCalloutEnum0(void* enginehandle, void* enumhandle, uint32_t numentriesrequested, void* entries, void* numentriesreturned);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmCalloutGetById0(void* enginehandle, uint32_t id, void* callout);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmCalloutGetByKey0(void* enginehandle, void* key, void* callout);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmCalloutGetSecurityInfoByKey0(void* enginehandle, void* key, uint32_t securityinfo, void* sidowner, void* sidgroup, void* dacl, void* sacl, void* securitydescriptor);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmCalloutSetSecurityInfoByKey0(void* enginehandle, void* key, uint32_t securityinfo, void* sidowner, void* sidgroup, void* dacl, void* sacl);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmConnectionCreateEnumHandle0(void* enginehandle, void* enumtemplate, void* enumhandle);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmConnectionDestroyEnumHandle0(void* enginehandle, void* enumhandle);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmConnectionEnum0(void* enginehandle, void* enumhandle, uint32_t numentriesrequested, void* entries, void* numentriesreturned);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmConnectionGetById0(void* enginehandle, uint64_t id, void* connection);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmConnectionGetSecurityInfo0(void* enginehandle, uint32_t securityinfo, void* sidowner, void* sidgroup, void* dacl, void* sacl, void* securitydescriptor);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmConnectionSetSecurityInfo0(void* enginehandle, uint32_t securityinfo, void* sidowner, void* sidgroup, void* dacl, void* sacl);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmEngineClose0(void* enginehandle);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmEngineGetOption0(void* enginehandle, int32_t option, void* value);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmEngineGetSecurityInfo0(void* enginehandle, uint32_t securityinfo, void* sidowner, void* sidgroup, void* dacl, void* sacl, void* securitydescriptor);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmEngineOpen0(void* servername, uint32_t authnservice, void* authidentity, void* session, void* enginehandle);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmEngineSetOption0(void* enginehandle, int32_t option, void* newvalue);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmEngineSetSecurityInfo0(void* enginehandle, uint32_t securityinfo, void* sidowner, void* sidgroup, void* dacl, void* sacl);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmFilterAdd0(void* enginehandle, void* filter, void* sd, void* id);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmFilterCreateEnumHandle0(void* enginehandle, void* enumtemplate, void* enumhandle);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmFilterDeleteById0(void* enginehandle, uint64_t id);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmFilterDeleteByKey0(void* enginehandle, void* key);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmFilterDestroyEnumHandle0(void* enginehandle, void* enumhandle);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmFilterEnum0(void* enginehandle, void* enumhandle, uint32_t numentriesrequested, void* entries, void* numentriesreturned);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmFilterGetById0(void* enginehandle, uint64_t id, void* filter);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmFilterGetByKey0(void* enginehandle, void* key, void* filter);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmFilterGetSecurityInfoByKey0(void* enginehandle, void* key, uint32_t securityinfo, void* sidowner, void* sidgroup, void* dacl, void* sacl, void* securitydescriptor);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmFilterSetSecurityInfoByKey0(void* enginehandle, void* key, uint32_t securityinfo, void* sidowner, void* sidgroup, void* dacl, void* sacl);
void windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmFreeMemory0(void* p);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmIPsecTunnelAdd0(void* enginehandle, uint32_t flags, void* mainmodepolicy, void* tunnelpolicy, uint32_t numfilterconditions, void* filterconditions, void* sd);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmIPsecTunnelAdd1(void* enginehandle, uint32_t flags, void* mainmodepolicy, void* tunnelpolicy, uint32_t numfilterconditions, void* filterconditions, void* keymodkey, void* sd);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmIPsecTunnelAdd2(void* enginehandle, uint32_t flags, void* mainmodepolicy, void* tunnelpolicy, uint32_t numfilterconditions, void* filterconditions, void* keymodkey, void* sd);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmIPsecTunnelAdd3(void* enginehandle, uint32_t flags, void* mainmodepolicy, void* tunnelpolicy, uint32_t numfilterconditions, void* filterconditions, void* keymodkey, void* sd);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmIPsecTunnelDeleteByKey0(void* enginehandle, void* key);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmLayerCreateEnumHandle0(void* enginehandle, void* enumtemplate, void* enumhandle);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmLayerDestroyEnumHandle0(void* enginehandle, void* enumhandle);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmLayerEnum0(void* enginehandle, void* enumhandle, uint32_t numentriesrequested, void* entries, void* numentriesreturned);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmLayerGetById0(void* enginehandle, uint16_t id, void* layer);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmLayerGetByKey0(void* enginehandle, void* key, void* layer);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmLayerGetSecurityInfoByKey0(void* enginehandle, void* key, uint32_t securityinfo, void* sidowner, void* sidgroup, void* dacl, void* sacl, void* securitydescriptor);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmLayerSetSecurityInfoByKey0(void* enginehandle, void* key, uint32_t securityinfo, void* sidowner, void* sidgroup, void* dacl, void* sacl);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmNetEventCreateEnumHandle0(void* enginehandle, void* enumtemplate, void* enumhandle);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmNetEventDestroyEnumHandle0(void* enginehandle, void* enumhandle);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmNetEventEnum0(void* enginehandle, void* enumhandle, uint32_t numentriesrequested, void* entries, void* numentriesreturned);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmNetEventEnum1(void* enginehandle, void* enumhandle, uint32_t numentriesrequested, void* entries, void* numentriesreturned);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmNetEventEnum2(void* enginehandle, void* enumhandle, uint32_t numentriesrequested, void* entries, void* numentriesreturned);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmNetEventEnum3(void* enginehandle, void* enumhandle, uint32_t numentriesrequested, void* entries, void* numentriesreturned);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmNetEventEnum4(void* enginehandle, void* enumhandle, uint32_t numentriesrequested, void* entries, void* numentriesreturned);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmNetEventEnum5(void* enginehandle, void* enumhandle, uint32_t numentriesrequested, void* entries, void* numentriesreturned);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmNetEventsGetSecurityInfo0(void* enginehandle, uint32_t securityinfo, void* sidowner, void* sidgroup, void* dacl, void* sacl, void* securitydescriptor);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmNetEventsSetSecurityInfo0(void* enginehandle, uint32_t securityinfo, void* sidowner, void* sidgroup, void* dacl, void* sacl);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderAdd0(void* enginehandle, void* provider, void* sd);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextAdd0(void* enginehandle, void* providercontext, void* sd, void* id);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextAdd1(void* enginehandle, void* providercontext, void* sd, void* id);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextAdd2(void* enginehandle, void* providercontext, void* sd, void* id);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextAdd3(void* enginehandle, void* providercontext, void* sd, void* id);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextCreateEnumHandle0(void* enginehandle, void* enumtemplate, void* enumhandle);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextDeleteById0(void* enginehandle, uint64_t id);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextDeleteByKey0(void* enginehandle, void* key);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextDestroyEnumHandle0(void* enginehandle, void* enumhandle);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextEnum0(void* enginehandle, void* enumhandle, uint32_t numentriesrequested, void* entries, void* numentriesreturned);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextEnum1(void* enginehandle, void* enumhandle, uint32_t numentriesrequested, void* entries, void* numentriesreturned);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextEnum2(void* enginehandle, void* enumhandle, uint32_t numentriesrequested, void* entries, void* numentriesreturned);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextEnum3(void* enginehandle, void* enumhandle, uint32_t numentriesrequested, void* entries, void* numentriesreturned);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextGetById0(void* enginehandle, uint64_t id, void* providercontext);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextGetById1(void* enginehandle, uint64_t id, void* providercontext);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextGetById2(void* enginehandle, uint64_t id, void* providercontext);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextGetById3(void* enginehandle, uint64_t id, void* providercontext);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextGetByKey0(void* enginehandle, void* key, void* providercontext);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextGetByKey1(void* enginehandle, void* key, void* providercontext);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextGetByKey2(void* enginehandle, void* key, void* providercontext);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextGetByKey3(void* enginehandle, void* key, void* providercontext);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextGetSecurityInfoByKey0(void* enginehandle, void* key, uint32_t securityinfo, void* sidowner, void* sidgroup, void* dacl, void* sacl, void* securitydescriptor);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextSetSecurityInfoByKey0(void* enginehandle, void* key, uint32_t securityinfo, void* sidowner, void* sidgroup, void* dacl, void* sacl);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderCreateEnumHandle0(void* enginehandle, void* enumtemplate, void* enumhandle);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderDeleteByKey0(void* enginehandle, void* key);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderDestroyEnumHandle0(void* enginehandle, void* enumhandle);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderEnum0(void* enginehandle, void* enumhandle, uint32_t numentriesrequested, void* entries, void* numentriesreturned);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderGetByKey0(void* enginehandle, void* key, void* provider);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderGetSecurityInfoByKey0(void* enginehandle, void* key, uint32_t securityinfo, void* sidowner, void* sidgroup, void* dacl, void* sacl, void* securitydescriptor);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderSetSecurityInfoByKey0(void* enginehandle, void* key, uint32_t securityinfo, void* sidowner, void* sidgroup, void* dacl, void* sacl);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmSessionCreateEnumHandle0(void* enginehandle, void* enumtemplate, void* enumhandle);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmSessionDestroyEnumHandle0(void* enginehandle, void* enumhandle);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmSessionEnum0(void* enginehandle, void* enumhandle, uint32_t numentriesrequested, void* entries, void* numentriesreturned);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmSubLayerAdd0(void* enginehandle, void* sublayer, void* sd);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmSubLayerCreateEnumHandle0(void* enginehandle, void* enumtemplate, void* enumhandle);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmSubLayerDeleteByKey0(void* enginehandle, void* key);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmSubLayerDestroyEnumHandle0(void* enginehandle, void* enumhandle);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmSubLayerEnum0(void* enginehandle, void* enumhandle, uint32_t numentriesrequested, void* entries, void* numentriesreturned);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmSubLayerGetByKey0(void* enginehandle, void* key, void* sublayer);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmSubLayerGetSecurityInfoByKey0(void* enginehandle, void* key, uint32_t securityinfo, void* sidowner, void* sidgroup, void* dacl, void* sacl, void* securitydescriptor);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmSubLayerSetSecurityInfoByKey0(void* enginehandle, void* key, uint32_t securityinfo, void* sidowner, void* sidgroup, void* dacl, void* sacl);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmTransactionAbort0(void* enginehandle);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmTransactionBegin0(void* enginehandle, uint32_t flags);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmTransactionCommit0(void* enginehandle);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmvSwitchEventsGetSecurityInfo0(void* enginehandle, uint32_t securityinfo, void* sidowner, void* sidgroup, void* dacl, void* sacl, void* securitydescriptor);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmvSwitchEventsSetSecurityInfo0(void* enginehandle, uint32_t securityinfo, void* sidowner, void* sidgroup, void* dacl, void* sacl);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecDospGetSecurityInfo0(void* enginehandle, uint32_t securityinfo, void* sidowner, void* sidgroup, void* dacl, void* sacl, void* securitydescriptor);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecDospGetStatistics0(void* enginehandle, void* idpstatistics);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecDospSetSecurityInfo0(void* enginehandle, uint32_t securityinfo, void* sidowner, void* sidgroup, void* dacl, void* sacl);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecDospStateCreateEnumHandle0(void* enginehandle, void* enumtemplate, void* enumhandle);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecDospStateDestroyEnumHandle0(void* enginehandle, void* enumhandle);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecDospStateEnum0(void* enginehandle, void* enumhandle, uint32_t numentriesrequested, void* entries, void* numentries);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecGetStatistics0(void* enginehandle, void* ipsecstatistics);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecGetStatistics1(void* enginehandle, void* ipsecstatistics);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextAddInbound0(void* enginehandle, uint64_t id, void* inboundbundle);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextAddInbound1(void* enginehandle, uint64_t id, void* inboundbundle);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextAddOutbound0(void* enginehandle, uint64_t id, void* outboundbundle);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextAddOutbound1(void* enginehandle, uint64_t id, void* outboundbundle);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextCreate0(void* enginehandle, void* outboundtraffic, void* inboundfilterid, void* id);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextCreate1(void* enginehandle, void* outboundtraffic, void* virtualiftunnelinfo, void* inboundfilterid, void* id);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextCreateEnumHandle0(void* enginehandle, void* enumtemplate, void* enumhandle);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextDeleteById0(void* enginehandle, uint64_t id);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextDestroyEnumHandle0(void* enginehandle, void* enumhandle);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextEnum0(void* enginehandle, void* enumhandle, uint32_t numentriesrequested, void* entries, void* numentriesreturned);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextEnum1(void* enginehandle, void* enumhandle, uint32_t numentriesrequested, void* entries, void* numentriesreturned);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextExpire0(void* enginehandle, uint64_t id);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextGetById0(void* enginehandle, uint64_t id, void* sacontext);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextGetById1(void* enginehandle, uint64_t id, void* sacontext);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextGetSpi0(void* enginehandle, uint64_t id, void* getspi, void* inboundspi);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextGetSpi1(void* enginehandle, uint64_t id, void* getspi, void* inboundspi);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextSetSpi0(void* enginehandle, uint64_t id, void* getspi, uint32_t inboundspi);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextUpdate0(void* enginehandle, uint64_t flags, void* newvalues);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaCreateEnumHandle0(void* enginehandle, void* enumtemplate, void* enumhandle);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaDbGetSecurityInfo0(void* enginehandle, uint32_t securityinfo, void* sidowner, void* sidgroup, void* dacl, void* sacl, void* securitydescriptor);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaDbSetSecurityInfo0(void* enginehandle, uint32_t securityinfo, void* sidowner, void* sidgroup, void* dacl, void* sacl);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaDestroyEnumHandle0(void* enginehandle, void* enumhandle);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaEnum0(void* enginehandle, void* enumhandle, uint32_t numentriesrequested, void* entries, void* numentriesreturned);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaEnum1(void* enginehandle, void* enumhandle, uint32_t numentriesrequested, void* entries, void* numentriesreturned);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextGetStatistics0(void* enginehandle, void* ikeextstatistics);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextGetStatistics1(void* enginehandle, void* ikeextstatistics);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextSaCreateEnumHandle0(void* enginehandle, void* enumtemplate, void* enumhandle);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextSaDbGetSecurityInfo0(void* enginehandle, uint32_t securityinfo, void* sidowner, void* sidgroup, void* dacl, void* sacl, void* securitydescriptor);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextSaDbSetSecurityInfo0(void* enginehandle, uint32_t securityinfo, void* sidowner, void* sidgroup, void* dacl, void* sacl);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextSaDeleteById0(void* enginehandle, uint64_t id);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextSaDestroyEnumHandle0(void* enginehandle, void* enumhandle);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextSaEnum0(void* enginehandle, void* enumhandle, uint32_t numentriesrequested, void* entries, void* numentriesreturned);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextSaEnum1(void* enginehandle, void* enumhandle, uint32_t numentriesrequested, void* entries, void* numentriesreturned);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextSaEnum2(void* enginehandle, void* enumhandle, uint32_t numentriesrequested, void* entries, void* numentriesreturned);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextSaGetById0(void* enginehandle, uint64_t id, void* sa);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextSaGetById1(void* enginehandle, uint64_t id, void* salookupcontext, void* sa);
int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextSaGetById2(void* enginehandle, uint64_t id, void* salookupcontext, void* sa);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WDK_NETWORKMANAGEMENT_WINDOWSFILTERINGPLATFORM_WINDOWS_WDK_NETWORKMANAGEMENT_WINDOWSFILTERINGPLATFORM_WRAPPER_H */
