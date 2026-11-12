#ifndef WINDOWSSYS_WINDOWS_WIN32_STORAGE_ISCSIDISC_WINDOWS_WIN32_STORAGE_ISCSIDISC_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_STORAGE_ISCSIDISC_WINDOWS_WIN32_STORAGE_ISCSIDISC_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

uint32_t windowssysWindowsWin32StorageIscsidiscAddISNSServerA(void* address);
uint32_t windowssysWindowsWin32StorageIscsidiscAddISNSServerW(void* address);
uint32_t windowssysWindowsWin32StorageIscsidiscAddIScsiConnectionA(void* uniquesessionid, void* reserved, uint32_t initiatorportnumber, void* targetportal, uint64_t securityflags, void* loginoptions, uint32_t keysize, void* key, void* connectionid);
uint32_t windowssysWindowsWin32StorageIscsidiscAddIScsiConnectionW(void* uniquesessionid, void* reserved, uint32_t initiatorportnumber, void* targetportal, uint64_t securityflags, void* loginoptions, uint32_t keysize, void* key, void* connectionid);
uint32_t windowssysWindowsWin32StorageIscsidiscAddIScsiSendTargetPortalA(void* initiatorinstance, uint32_t initiatorportnumber, void* loginoptions, uint64_t securityflags, void* portal);
uint32_t windowssysWindowsWin32StorageIscsidiscAddIScsiSendTargetPortalW(void* initiatorinstance, uint32_t initiatorportnumber, void* loginoptions, uint64_t securityflags, void* portal);
uint32_t windowssysWindowsWin32StorageIscsidiscAddIScsiStaticTargetA(void* targetname, void* targetalias, uint32_t targetflags, bool persist, void* mappings, void* loginoptions, void* portalgroup);
uint32_t windowssysWindowsWin32StorageIscsidiscAddIScsiStaticTargetW(void* targetname, void* targetalias, uint32_t targetflags, bool persist, void* mappings, void* loginoptions, void* portalgroup);
uint32_t windowssysWindowsWin32StorageIscsidiscAddPersistentIScsiDeviceA(void* devicepath);
uint32_t windowssysWindowsWin32StorageIscsidiscAddPersistentIScsiDeviceW(void* devicepath);
uint32_t windowssysWindowsWin32StorageIscsidiscAddRadiusServerA(void* address);
uint32_t windowssysWindowsWin32StorageIscsidiscAddRadiusServerW(void* address);
uint32_t windowssysWindowsWin32StorageIscsidiscClearPersistentIScsiDevices(void);
uint32_t windowssysWindowsWin32StorageIscsidiscGetDevicesForIScsiSessionA(void* uniquesessionid, void* devicecount, void* devices);
uint32_t windowssysWindowsWin32StorageIscsidiscGetDevicesForIScsiSessionW(void* uniquesessionid, void* devicecount, void* devices);
uint32_t windowssysWindowsWin32StorageIscsidiscGetIScsiIKEInfoA(void* initiatorname, uint32_t initiatorportnumber, void* reserved, void* authinfo);
uint32_t windowssysWindowsWin32StorageIscsidiscGetIScsiIKEInfoW(void* initiatorname, uint32_t initiatorportnumber, void* reserved, void* authinfo);
uint32_t windowssysWindowsWin32StorageIscsidiscGetIScsiInitiatorNodeNameA(void* initiatornodename);
uint32_t windowssysWindowsWin32StorageIscsidiscGetIScsiInitiatorNodeNameW(void* initiatornodename);
uint32_t windowssysWindowsWin32StorageIscsidiscGetIScsiSessionListA(void* buffersize, void* sessioncount, void* sessioninfo);
uint32_t windowssysWindowsWin32StorageIscsidiscGetIScsiSessionListEx(void* buffersize, void* sessioncountptr, void* sessioninfo);
uint32_t windowssysWindowsWin32StorageIscsidiscGetIScsiSessionListW(void* buffersize, void* sessioncount, void* sessioninfo);
uint32_t windowssysWindowsWin32StorageIscsidiscGetIScsiTargetInformationA(void* targetname, void* discoverymechanism, int32_t infoclass, void* buffersize, void* buffer);
uint32_t windowssysWindowsWin32StorageIscsidiscGetIScsiTargetInformationW(void* targetname, void* discoverymechanism, int32_t infoclass, void* buffersize, void* buffer);
uint32_t windowssysWindowsWin32StorageIscsidiscGetIScsiVersionInformation(void* versioninfo);
uint32_t windowssysWindowsWin32StorageIscsidiscLoginIScsiTargetA(void* targetname, bool isinformationalsession, void* initiatorinstance, uint32_t initiatorportnumber, void* targetportal, uint64_t securityflags, void* mappings, void* loginoptions, uint32_t keysize, void* key, bool ispersistent, void* uniquesessionid, void* uniqueconnectionid);
uint32_t windowssysWindowsWin32StorageIscsidiscLoginIScsiTargetW(void* targetname, bool isinformationalsession, void* initiatorinstance, uint32_t initiatorportnumber, void* targetportal, uint64_t securityflags, void* mappings, void* loginoptions, uint32_t keysize, void* key, bool ispersistent, void* uniquesessionid, void* uniqueconnectionid);
uint32_t windowssysWindowsWin32StorageIscsidiscLogoutIScsiTarget(void* uniquesessionid);
uint32_t windowssysWindowsWin32StorageIscsidiscRefreshISNSServerA(void* address);
uint32_t windowssysWindowsWin32StorageIscsidiscRefreshISNSServerW(void* address);
uint32_t windowssysWindowsWin32StorageIscsidiscRefreshIScsiSendTargetPortalA(void* initiatorinstance, uint32_t initiatorportnumber, void* portal);
uint32_t windowssysWindowsWin32StorageIscsidiscRefreshIScsiSendTargetPortalW(void* initiatorinstance, uint32_t initiatorportnumber, void* portal);
uint32_t windowssysWindowsWin32StorageIscsidiscRemoveISNSServerA(void* address);
uint32_t windowssysWindowsWin32StorageIscsidiscRemoveISNSServerW(void* address);
uint32_t windowssysWindowsWin32StorageIscsidiscRemoveIScsiConnection(void* uniquesessionid, void* connectionid);
uint32_t windowssysWindowsWin32StorageIscsidiscRemoveIScsiPersistentTargetA(void* initiatorinstance, uint32_t initiatorportnumber, void* targetname, void* portal);
uint32_t windowssysWindowsWin32StorageIscsidiscRemoveIScsiPersistentTargetW(void* initiatorinstance, uint32_t initiatorportnumber, void* targetname, void* portal);
uint32_t windowssysWindowsWin32StorageIscsidiscRemoveIScsiSendTargetPortalA(void* initiatorinstance, uint32_t initiatorportnumber, void* portal);
uint32_t windowssysWindowsWin32StorageIscsidiscRemoveIScsiSendTargetPortalW(void* initiatorinstance, uint32_t initiatorportnumber, void* portal);
uint32_t windowssysWindowsWin32StorageIscsidiscRemoveIScsiStaticTargetA(void* targetname);
uint32_t windowssysWindowsWin32StorageIscsidiscRemoveIScsiStaticTargetW(void* targetname);
uint32_t windowssysWindowsWin32StorageIscsidiscRemovePersistentIScsiDeviceA(void* devicepath);
uint32_t windowssysWindowsWin32StorageIscsidiscRemovePersistentIScsiDeviceW(void* devicepath);
uint32_t windowssysWindowsWin32StorageIscsidiscRemoveRadiusServerA(void* address);
uint32_t windowssysWindowsWin32StorageIscsidiscRemoveRadiusServerW(void* address);
uint32_t windowssysWindowsWin32StorageIscsidiscReportActiveIScsiTargetMappingsA(void* buffersize, void* mappingcount, void* mappings);
uint32_t windowssysWindowsWin32StorageIscsidiscReportActiveIScsiTargetMappingsW(void* buffersize, void* mappingcount, void* mappings);
uint32_t windowssysWindowsWin32StorageIscsidiscReportISNSServerListA(void* buffersizeinchar, void* buffer);
uint32_t windowssysWindowsWin32StorageIscsidiscReportISNSServerListW(void* buffersizeinchar, void* buffer);
uint32_t windowssysWindowsWin32StorageIscsidiscReportIScsiInitiatorListA(void* buffersize, void* buffer);
uint32_t windowssysWindowsWin32StorageIscsidiscReportIScsiInitiatorListW(void* buffersize, void* buffer);
uint32_t windowssysWindowsWin32StorageIscsidiscReportIScsiPersistentLoginsA(void* count, void* persistentlogininfo, void* buffersizeinbytes);
uint32_t windowssysWindowsWin32StorageIscsidiscReportIScsiPersistentLoginsW(void* count, void* persistentlogininfo, void* buffersizeinbytes);
uint32_t windowssysWindowsWin32StorageIscsidiscReportIScsiSendTargetPortalsA(void* portalcount, void* portalinfo);
uint32_t windowssysWindowsWin32StorageIscsidiscReportIScsiSendTargetPortalsExA(void* portalcount, void* portalinfosize, void* portalinfo);
uint32_t windowssysWindowsWin32StorageIscsidiscReportIScsiSendTargetPortalsExW(void* portalcount, void* portalinfosize, void* portalinfo);
uint32_t windowssysWindowsWin32StorageIscsidiscReportIScsiSendTargetPortalsW(void* portalcount, void* portalinfo);
uint32_t windowssysWindowsWin32StorageIscsidiscReportIScsiTargetPortalsA(void* initiatorname, void* targetname, void* targetportaltag, void* elementcount, void* portals);
uint32_t windowssysWindowsWin32StorageIscsidiscReportIScsiTargetPortalsW(void* initiatorname, void* targetname, void* targetportaltag, void* elementcount, void* portals);
uint32_t windowssysWindowsWin32StorageIscsidiscReportIScsiTargetsA(bool forceupdate, void* buffersize, void* buffer);
uint32_t windowssysWindowsWin32StorageIscsidiscReportIScsiTargetsW(bool forceupdate, void* buffersize, void* buffer);
uint32_t windowssysWindowsWin32StorageIscsidiscReportPersistentIScsiDevicesA(void* buffersizeinchar, void* buffer);
uint32_t windowssysWindowsWin32StorageIscsidiscReportPersistentIScsiDevicesW(void* buffersizeinchar, void* buffer);
uint32_t windowssysWindowsWin32StorageIscsidiscReportRadiusServerListA(void* buffersizeinchar, void* buffer);
uint32_t windowssysWindowsWin32StorageIscsidiscReportRadiusServerListW(void* buffersizeinchar, void* buffer);
uint32_t windowssysWindowsWin32StorageIscsidiscSendScsiInquiry(void* uniquesessionid, uint64_t lun, uint8_t evpdcmddt, uint8_t pagecode, void* scsistatus, void* responsesize, void* responsebuffer, void* sensesize, void* sensebuffer);
uint32_t windowssysWindowsWin32StorageIscsidiscSendScsiReadCapacity(void* uniquesessionid, uint64_t lun, void* scsistatus, void* responsesize, void* responsebuffer, void* sensesize, void* sensebuffer);
uint32_t windowssysWindowsWin32StorageIscsidiscSendScsiReportLuns(void* uniquesessionid, void* scsistatus, void* responsesize, void* responsebuffer, void* sensesize, void* sensebuffer);
uint32_t windowssysWindowsWin32StorageIscsidiscSetIScsiGroupPresharedKey(uint32_t keylength, void* key, bool persist);
uint32_t windowssysWindowsWin32StorageIscsidiscSetIScsiIKEInfoA(void* initiatorname, uint32_t initiatorportnumber, void* authinfo, bool persist);
uint32_t windowssysWindowsWin32StorageIscsidiscSetIScsiIKEInfoW(void* initiatorname, uint32_t initiatorportnumber, void* authinfo, bool persist);
uint32_t windowssysWindowsWin32StorageIscsidiscSetIScsiInitiatorCHAPSharedSecret(uint32_t sharedsecretlength, void* sharedsecret);
uint32_t windowssysWindowsWin32StorageIscsidiscSetIScsiInitiatorNodeNameA(void* initiatornodename);
uint32_t windowssysWindowsWin32StorageIscsidiscSetIScsiInitiatorNodeNameW(void* initiatornodename);
uint32_t windowssysWindowsWin32StorageIscsidiscSetIScsiInitiatorRADIUSSharedSecret(uint32_t sharedsecretlength, void* sharedsecret);
uint32_t windowssysWindowsWin32StorageIscsidiscSetIScsiTunnelModeOuterAddressA(void* initiatorname, uint32_t initiatorportnumber, void* destinationaddress, void* outermodeaddress, bool persist);
uint32_t windowssysWindowsWin32StorageIscsidiscSetIScsiTunnelModeOuterAddressW(void* initiatorname, uint32_t initiatorportnumber, void* destinationaddress, void* outermodeaddress, bool persist);
uint32_t windowssysWindowsWin32StorageIscsidiscSetupPersistentIScsiDevices(void);
uint32_t windowssysWindowsWin32StorageIscsidiscSetupPersistentIScsiVolumes(void);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_STORAGE_ISCSIDISC_WINDOWS_WIN32_STORAGE_ISCSIDISC_WRAPPER_H */
