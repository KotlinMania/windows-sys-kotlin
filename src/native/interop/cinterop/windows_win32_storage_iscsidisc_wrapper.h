#ifndef WINDOWSSYS_WINDOWS_WIN32_STORAGE_ISCSIDISC_WINDOWS_WIN32_STORAGE_ISCSIDISC_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_STORAGE_ISCSIDISC_WINDOWS_WIN32_STORAGE_ISCSIDISC_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

uint32_t windowssys_windows_win32_storage_iscsidisc_addISNSServerA(void* address);
uint32_t windowssys_windows_win32_storage_iscsidisc_addISNSServerW(void* address);
uint32_t windowssys_windows_win32_storage_iscsidisc_addIScsiConnectionA(void* uniquesessionid, void* reserved, uint32_t initiatorportnumber, void* targetportal, uint64_t securityflags, void* loginoptions, uint32_t keysize, void* key, void* connectionid);
uint32_t windowssys_windows_win32_storage_iscsidisc_addIScsiConnectionW(void* uniquesessionid, void* reserved, uint32_t initiatorportnumber, void* targetportal, uint64_t securityflags, void* loginoptions, uint32_t keysize, void* key, void* connectionid);
uint32_t windowssys_windows_win32_storage_iscsidisc_addIScsiSendTargetPortalA(void* initiatorinstance, uint32_t initiatorportnumber, void* loginoptions, uint64_t securityflags, void* portal);
uint32_t windowssys_windows_win32_storage_iscsidisc_addIScsiSendTargetPortalW(void* initiatorinstance, uint32_t initiatorportnumber, void* loginoptions, uint64_t securityflags, void* portal);
uint32_t windowssys_windows_win32_storage_iscsidisc_addIScsiStaticTargetA(void* targetname, void* targetalias, uint32_t targetflags, bool persist, void* mappings, void* loginoptions, void* portalgroup);
uint32_t windowssys_windows_win32_storage_iscsidisc_addIScsiStaticTargetW(void* targetname, void* targetalias, uint32_t targetflags, bool persist, void* mappings, void* loginoptions, void* portalgroup);
uint32_t windowssys_windows_win32_storage_iscsidisc_addPersistentIScsiDeviceA(void* devicepath);
uint32_t windowssys_windows_win32_storage_iscsidisc_addPersistentIScsiDeviceW(void* devicepath);
uint32_t windowssys_windows_win32_storage_iscsidisc_addRadiusServerA(void* address);
uint32_t windowssys_windows_win32_storage_iscsidisc_addRadiusServerW(void* address);
uint32_t windowssys_windows_win32_storage_iscsidisc_clearPersistentIScsiDevices(void);
uint32_t windowssys_windows_win32_storage_iscsidisc_getDevicesForIScsiSessionA(void* uniquesessionid, void* devicecount, void* devices);
uint32_t windowssys_windows_win32_storage_iscsidisc_getDevicesForIScsiSessionW(void* uniquesessionid, void* devicecount, void* devices);
uint32_t windowssys_windows_win32_storage_iscsidisc_getIScsiIKEInfoA(void* initiatorname, uint32_t initiatorportnumber, void* reserved, void* authinfo);
uint32_t windowssys_windows_win32_storage_iscsidisc_getIScsiIKEInfoW(void* initiatorname, uint32_t initiatorportnumber, void* reserved, void* authinfo);
uint32_t windowssys_windows_win32_storage_iscsidisc_getIScsiInitiatorNodeNameA(void* initiatornodename);
uint32_t windowssys_windows_win32_storage_iscsidisc_getIScsiInitiatorNodeNameW(void* initiatornodename);
uint32_t windowssys_windows_win32_storage_iscsidisc_getIScsiSessionListA(void* buffersize, void* sessioncount, void* sessioninfo);
uint32_t windowssys_windows_win32_storage_iscsidisc_getIScsiSessionListEx(void* buffersize, void* sessioncountptr, void* sessioninfo);
uint32_t windowssys_windows_win32_storage_iscsidisc_getIScsiSessionListW(void* buffersize, void* sessioncount, void* sessioninfo);
uint32_t windowssys_windows_win32_storage_iscsidisc_getIScsiTargetInformationA(void* targetname, void* discoverymechanism, int32_t infoclass, void* buffersize, void* buffer);
uint32_t windowssys_windows_win32_storage_iscsidisc_getIScsiTargetInformationW(void* targetname, void* discoverymechanism, int32_t infoclass, void* buffersize, void* buffer);
uint32_t windowssys_windows_win32_storage_iscsidisc_getIScsiVersionInformation(void* versioninfo);
uint32_t windowssys_windows_win32_storage_iscsidisc_loginIScsiTargetA(void* targetname, bool isinformationalsession, void* initiatorinstance, uint32_t initiatorportnumber, void* targetportal, uint64_t securityflags, void* mappings, void* loginoptions, uint32_t keysize, void* key, bool ispersistent, void* uniquesessionid, void* uniqueconnectionid);
uint32_t windowssys_windows_win32_storage_iscsidisc_loginIScsiTargetW(void* targetname, bool isinformationalsession, void* initiatorinstance, uint32_t initiatorportnumber, void* targetportal, uint64_t securityflags, void* mappings, void* loginoptions, uint32_t keysize, void* key, bool ispersistent, void* uniquesessionid, void* uniqueconnectionid);
uint32_t windowssys_windows_win32_storage_iscsidisc_logoutIScsiTarget(void* uniquesessionid);
uint32_t windowssys_windows_win32_storage_iscsidisc_refreshISNSServerA(void* address);
uint32_t windowssys_windows_win32_storage_iscsidisc_refreshISNSServerW(void* address);
uint32_t windowssys_windows_win32_storage_iscsidisc_refreshIScsiSendTargetPortalA(void* initiatorinstance, uint32_t initiatorportnumber, void* portal);
uint32_t windowssys_windows_win32_storage_iscsidisc_refreshIScsiSendTargetPortalW(void* initiatorinstance, uint32_t initiatorportnumber, void* portal);
uint32_t windowssys_windows_win32_storage_iscsidisc_removeISNSServerA(void* address);
uint32_t windowssys_windows_win32_storage_iscsidisc_removeISNSServerW(void* address);
uint32_t windowssys_windows_win32_storage_iscsidisc_removeIScsiConnection(void* uniquesessionid, void* connectionid);
uint32_t windowssys_windows_win32_storage_iscsidisc_removeIScsiPersistentTargetA(void* initiatorinstance, uint32_t initiatorportnumber, void* targetname, void* portal);
uint32_t windowssys_windows_win32_storage_iscsidisc_removeIScsiPersistentTargetW(void* initiatorinstance, uint32_t initiatorportnumber, void* targetname, void* portal);
uint32_t windowssys_windows_win32_storage_iscsidisc_removeIScsiSendTargetPortalA(void* initiatorinstance, uint32_t initiatorportnumber, void* portal);
uint32_t windowssys_windows_win32_storage_iscsidisc_removeIScsiSendTargetPortalW(void* initiatorinstance, uint32_t initiatorportnumber, void* portal);
uint32_t windowssys_windows_win32_storage_iscsidisc_removeIScsiStaticTargetA(void* targetname);
uint32_t windowssys_windows_win32_storage_iscsidisc_removeIScsiStaticTargetW(void* targetname);
uint32_t windowssys_windows_win32_storage_iscsidisc_removePersistentIScsiDeviceA(void* devicepath);
uint32_t windowssys_windows_win32_storage_iscsidisc_removePersistentIScsiDeviceW(void* devicepath);
uint32_t windowssys_windows_win32_storage_iscsidisc_removeRadiusServerA(void* address);
uint32_t windowssys_windows_win32_storage_iscsidisc_removeRadiusServerW(void* address);
uint32_t windowssys_windows_win32_storage_iscsidisc_reportActiveIScsiTargetMappingsA(void* buffersize, void* mappingcount, void* mappings);
uint32_t windowssys_windows_win32_storage_iscsidisc_reportActiveIScsiTargetMappingsW(void* buffersize, void* mappingcount, void* mappings);
uint32_t windowssys_windows_win32_storage_iscsidisc_reportISNSServerListA(void* buffersizeinchar, void* buffer);
uint32_t windowssys_windows_win32_storage_iscsidisc_reportISNSServerListW(void* buffersizeinchar, void* buffer);
uint32_t windowssys_windows_win32_storage_iscsidisc_reportIScsiInitiatorListA(void* buffersize, void* buffer);
uint32_t windowssys_windows_win32_storage_iscsidisc_reportIScsiInitiatorListW(void* buffersize, void* buffer);
uint32_t windowssys_windows_win32_storage_iscsidisc_reportIScsiPersistentLoginsA(void* count, void* persistentlogininfo, void* buffersizeinbytes);
uint32_t windowssys_windows_win32_storage_iscsidisc_reportIScsiPersistentLoginsW(void* count, void* persistentlogininfo, void* buffersizeinbytes);
uint32_t windowssys_windows_win32_storage_iscsidisc_reportIScsiSendTargetPortalsA(void* portalcount, void* portalinfo);
uint32_t windowssys_windows_win32_storage_iscsidisc_reportIScsiSendTargetPortalsExA(void* portalcount, void* portalinfosize, void* portalinfo);
uint32_t windowssys_windows_win32_storage_iscsidisc_reportIScsiSendTargetPortalsExW(void* portalcount, void* portalinfosize, void* portalinfo);
uint32_t windowssys_windows_win32_storage_iscsidisc_reportIScsiSendTargetPortalsW(void* portalcount, void* portalinfo);
uint32_t windowssys_windows_win32_storage_iscsidisc_reportIScsiTargetPortalsA(void* initiatorname, void* targetname, void* targetportaltag, void* elementcount, void* portals);
uint32_t windowssys_windows_win32_storage_iscsidisc_reportIScsiTargetPortalsW(void* initiatorname, void* targetname, void* targetportaltag, void* elementcount, void* portals);
uint32_t windowssys_windows_win32_storage_iscsidisc_reportIScsiTargetsA(bool forceupdate, void* buffersize, void* buffer);
uint32_t windowssys_windows_win32_storage_iscsidisc_reportIScsiTargetsW(bool forceupdate, void* buffersize, void* buffer);
uint32_t windowssys_windows_win32_storage_iscsidisc_reportPersistentIScsiDevicesA(void* buffersizeinchar, void* buffer);
uint32_t windowssys_windows_win32_storage_iscsidisc_reportPersistentIScsiDevicesW(void* buffersizeinchar, void* buffer);
uint32_t windowssys_windows_win32_storage_iscsidisc_reportRadiusServerListA(void* buffersizeinchar, void* buffer);
uint32_t windowssys_windows_win32_storage_iscsidisc_reportRadiusServerListW(void* buffersizeinchar, void* buffer);
uint32_t windowssys_windows_win32_storage_iscsidisc_sendScsiInquiry(void* uniquesessionid, uint64_t lun, uint8_t evpdcmddt, uint8_t pagecode, void* scsistatus, void* responsesize, void* responsebuffer, void* sensesize, void* sensebuffer);
uint32_t windowssys_windows_win32_storage_iscsidisc_sendScsiReadCapacity(void* uniquesessionid, uint64_t lun, void* scsistatus, void* responsesize, void* responsebuffer, void* sensesize, void* sensebuffer);
uint32_t windowssys_windows_win32_storage_iscsidisc_sendScsiReportLuns(void* uniquesessionid, void* scsistatus, void* responsesize, void* responsebuffer, void* sensesize, void* sensebuffer);
uint32_t windowssys_windows_win32_storage_iscsidisc_setIScsiGroupPresharedKey(uint32_t keylength, void* key, bool persist);
uint32_t windowssys_windows_win32_storage_iscsidisc_setIScsiIKEInfoA(void* initiatorname, uint32_t initiatorportnumber, void* authinfo, bool persist);
uint32_t windowssys_windows_win32_storage_iscsidisc_setIScsiIKEInfoW(void* initiatorname, uint32_t initiatorportnumber, void* authinfo, bool persist);
uint32_t windowssys_windows_win32_storage_iscsidisc_setIScsiInitiatorCHAPSharedSecret(uint32_t sharedsecretlength, void* sharedsecret);
uint32_t windowssys_windows_win32_storage_iscsidisc_setIScsiInitiatorNodeNameA(void* initiatornodename);
uint32_t windowssys_windows_win32_storage_iscsidisc_setIScsiInitiatorNodeNameW(void* initiatornodename);
uint32_t windowssys_windows_win32_storage_iscsidisc_setIScsiInitiatorRADIUSSharedSecret(uint32_t sharedsecretlength, void* sharedsecret);
uint32_t windowssys_windows_win32_storage_iscsidisc_setIScsiTunnelModeOuterAddressA(void* initiatorname, uint32_t initiatorportnumber, void* destinationaddress, void* outermodeaddress, bool persist);
uint32_t windowssys_windows_win32_storage_iscsidisc_setIScsiTunnelModeOuterAddressW(void* initiatorname, uint32_t initiatorportnumber, void* destinationaddress, void* outermodeaddress, bool persist);
uint32_t windowssys_windows_win32_storage_iscsidisc_setupPersistentIScsiDevices(void);
uint32_t windowssys_windows_win32_storage_iscsidisc_setupPersistentIScsiVolumes(void);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_STORAGE_ISCSIDISC_WINDOWS_WIN32_STORAGE_ISCSIDISC_WRAPPER_H */
