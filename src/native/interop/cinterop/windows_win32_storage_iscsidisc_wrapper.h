#ifndef WINDOWSSYS_WINDOWS_WIN32_STORAGE_ISCSIDISC_WINDOWS_WIN32_STORAGE_ISCSIDISC_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_STORAGE_ISCSIDISC_WINDOWS_WIN32_STORAGE_ISCSIDISC_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

uint32_t windowssys_windows_win32_storage_iscsidisc_AddISNSServerA(void* address);
uint32_t windowssys_windows_win32_storage_iscsidisc_AddISNSServerW(void* address);
uint32_t windowssys_windows_win32_storage_iscsidisc_AddIScsiConnectionA(void* uniquesessionid, void* reserved, uint32_t initiatorportnumber, void* targetportal, uint64_t securityflags, void* loginoptions, uint32_t keysize, void* key, void* connectionid);
uint32_t windowssys_windows_win32_storage_iscsidisc_AddIScsiConnectionW(void* uniquesessionid, void* reserved, uint32_t initiatorportnumber, void* targetportal, uint64_t securityflags, void* loginoptions, uint32_t keysize, void* key, void* connectionid);
uint32_t windowssys_windows_win32_storage_iscsidisc_AddIScsiSendTargetPortalA(void* initiatorinstance, uint32_t initiatorportnumber, void* loginoptions, uint64_t securityflags, void* portal);
uint32_t windowssys_windows_win32_storage_iscsidisc_AddIScsiSendTargetPortalW(void* initiatorinstance, uint32_t initiatorportnumber, void* loginoptions, uint64_t securityflags, void* portal);
uint32_t windowssys_windows_win32_storage_iscsidisc_AddIScsiStaticTargetA(void* targetname, void* targetalias, uint32_t targetflags, bool persist, void* mappings, void* loginoptions, void* portalgroup);
uint32_t windowssys_windows_win32_storage_iscsidisc_AddIScsiStaticTargetW(void* targetname, void* targetalias, uint32_t targetflags, bool persist, void* mappings, void* loginoptions, void* portalgroup);
uint32_t windowssys_windows_win32_storage_iscsidisc_AddPersistentIScsiDeviceA(void* devicepath);
uint32_t windowssys_windows_win32_storage_iscsidisc_AddPersistentIScsiDeviceW(void* devicepath);
uint32_t windowssys_windows_win32_storage_iscsidisc_AddRadiusServerA(void* address);
uint32_t windowssys_windows_win32_storage_iscsidisc_AddRadiusServerW(void* address);
uint32_t windowssys_windows_win32_storage_iscsidisc_ClearPersistentIScsiDevices(void);
uint32_t windowssys_windows_win32_storage_iscsidisc_GetDevicesForIScsiSessionA(void* uniquesessionid, void* devicecount, void* devices);
uint32_t windowssys_windows_win32_storage_iscsidisc_GetDevicesForIScsiSessionW(void* uniquesessionid, void* devicecount, void* devices);
uint32_t windowssys_windows_win32_storage_iscsidisc_GetIScsiIKEInfoA(void* initiatorname, uint32_t initiatorportnumber, void* reserved, void* authinfo);
uint32_t windowssys_windows_win32_storage_iscsidisc_GetIScsiIKEInfoW(void* initiatorname, uint32_t initiatorportnumber, void* reserved, void* authinfo);
uint32_t windowssys_windows_win32_storage_iscsidisc_GetIScsiInitiatorNodeNameA(void* initiatornodename);
uint32_t windowssys_windows_win32_storage_iscsidisc_GetIScsiInitiatorNodeNameW(void* initiatornodename);
uint32_t windowssys_windows_win32_storage_iscsidisc_GetIScsiSessionListA(void* buffersize, void* sessioncount, void* sessioninfo);
uint32_t windowssys_windows_win32_storage_iscsidisc_GetIScsiSessionListEx(void* buffersize, void* sessioncountptr, void* sessioninfo);
uint32_t windowssys_windows_win32_storage_iscsidisc_GetIScsiSessionListW(void* buffersize, void* sessioncount, void* sessioninfo);
uint32_t windowssys_windows_win32_storage_iscsidisc_GetIScsiTargetInformationA(void* targetname, void* discoverymechanism, int32_t infoclass, void* buffersize, void* buffer);
uint32_t windowssys_windows_win32_storage_iscsidisc_GetIScsiTargetInformationW(void* targetname, void* discoverymechanism, int32_t infoclass, void* buffersize, void* buffer);
uint32_t windowssys_windows_win32_storage_iscsidisc_GetIScsiVersionInformation(void* versioninfo);
uint32_t windowssys_windows_win32_storage_iscsidisc_LoginIScsiTargetA(void* targetname, bool isinformationalsession, void* initiatorinstance, uint32_t initiatorportnumber, void* targetportal, uint64_t securityflags, void* mappings, void* loginoptions, uint32_t keysize, void* key, bool ispersistent, void* uniquesessionid, void* uniqueconnectionid);
uint32_t windowssys_windows_win32_storage_iscsidisc_LoginIScsiTargetW(void* targetname, bool isinformationalsession, void* initiatorinstance, uint32_t initiatorportnumber, void* targetportal, uint64_t securityflags, void* mappings, void* loginoptions, uint32_t keysize, void* key, bool ispersistent, void* uniquesessionid, void* uniqueconnectionid);
uint32_t windowssys_windows_win32_storage_iscsidisc_LogoutIScsiTarget(void* uniquesessionid);
uint32_t windowssys_windows_win32_storage_iscsidisc_RefreshISNSServerA(void* address);
uint32_t windowssys_windows_win32_storage_iscsidisc_RefreshISNSServerW(void* address);
uint32_t windowssys_windows_win32_storage_iscsidisc_RefreshIScsiSendTargetPortalA(void* initiatorinstance, uint32_t initiatorportnumber, void* portal);
uint32_t windowssys_windows_win32_storage_iscsidisc_RefreshIScsiSendTargetPortalW(void* initiatorinstance, uint32_t initiatorportnumber, void* portal);
uint32_t windowssys_windows_win32_storage_iscsidisc_RemoveISNSServerA(void* address);
uint32_t windowssys_windows_win32_storage_iscsidisc_RemoveISNSServerW(void* address);
uint32_t windowssys_windows_win32_storage_iscsidisc_RemoveIScsiConnection(void* uniquesessionid, void* connectionid);
uint32_t windowssys_windows_win32_storage_iscsidisc_RemoveIScsiPersistentTargetA(void* initiatorinstance, uint32_t initiatorportnumber, void* targetname, void* portal);
uint32_t windowssys_windows_win32_storage_iscsidisc_RemoveIScsiPersistentTargetW(void* initiatorinstance, uint32_t initiatorportnumber, void* targetname, void* portal);
uint32_t windowssys_windows_win32_storage_iscsidisc_RemoveIScsiSendTargetPortalA(void* initiatorinstance, uint32_t initiatorportnumber, void* portal);
uint32_t windowssys_windows_win32_storage_iscsidisc_RemoveIScsiSendTargetPortalW(void* initiatorinstance, uint32_t initiatorportnumber, void* portal);
uint32_t windowssys_windows_win32_storage_iscsidisc_RemoveIScsiStaticTargetA(void* targetname);
uint32_t windowssys_windows_win32_storage_iscsidisc_RemoveIScsiStaticTargetW(void* targetname);
uint32_t windowssys_windows_win32_storage_iscsidisc_RemovePersistentIScsiDeviceA(void* devicepath);
uint32_t windowssys_windows_win32_storage_iscsidisc_RemovePersistentIScsiDeviceW(void* devicepath);
uint32_t windowssys_windows_win32_storage_iscsidisc_RemoveRadiusServerA(void* address);
uint32_t windowssys_windows_win32_storage_iscsidisc_RemoveRadiusServerW(void* address);
uint32_t windowssys_windows_win32_storage_iscsidisc_ReportActiveIScsiTargetMappingsA(void* buffersize, void* mappingcount, void* mappings);
uint32_t windowssys_windows_win32_storage_iscsidisc_ReportActiveIScsiTargetMappingsW(void* buffersize, void* mappingcount, void* mappings);
uint32_t windowssys_windows_win32_storage_iscsidisc_ReportISNSServerListA(void* buffersizeinchar, void* buffer);
uint32_t windowssys_windows_win32_storage_iscsidisc_ReportISNSServerListW(void* buffersizeinchar, void* buffer);
uint32_t windowssys_windows_win32_storage_iscsidisc_ReportIScsiInitiatorListA(void* buffersize, void* buffer);
uint32_t windowssys_windows_win32_storage_iscsidisc_ReportIScsiInitiatorListW(void* buffersize, void* buffer);
uint32_t windowssys_windows_win32_storage_iscsidisc_ReportIScsiPersistentLoginsA(void* count, void* persistentlogininfo, void* buffersizeinbytes);
uint32_t windowssys_windows_win32_storage_iscsidisc_ReportIScsiPersistentLoginsW(void* count, void* persistentlogininfo, void* buffersizeinbytes);
uint32_t windowssys_windows_win32_storage_iscsidisc_ReportIScsiSendTargetPortalsA(void* portalcount, void* portalinfo);
uint32_t windowssys_windows_win32_storage_iscsidisc_ReportIScsiSendTargetPortalsExA(void* portalcount, void* portalinfosize, void* portalinfo);
uint32_t windowssys_windows_win32_storage_iscsidisc_ReportIScsiSendTargetPortalsExW(void* portalcount, void* portalinfosize, void* portalinfo);
uint32_t windowssys_windows_win32_storage_iscsidisc_ReportIScsiSendTargetPortalsW(void* portalcount, void* portalinfo);
uint32_t windowssys_windows_win32_storage_iscsidisc_ReportIScsiTargetPortalsA(void* initiatorname, void* targetname, void* targetportaltag, void* elementcount, void* portals);
uint32_t windowssys_windows_win32_storage_iscsidisc_ReportIScsiTargetPortalsW(void* initiatorname, void* targetname, void* targetportaltag, void* elementcount, void* portals);
uint32_t windowssys_windows_win32_storage_iscsidisc_ReportIScsiTargetsA(bool forceupdate, void* buffersize, void* buffer);
uint32_t windowssys_windows_win32_storage_iscsidisc_ReportIScsiTargetsW(bool forceupdate, void* buffersize, void* buffer);
uint32_t windowssys_windows_win32_storage_iscsidisc_ReportPersistentIScsiDevicesA(void* buffersizeinchar, void* buffer);
uint32_t windowssys_windows_win32_storage_iscsidisc_ReportPersistentIScsiDevicesW(void* buffersizeinchar, void* buffer);
uint32_t windowssys_windows_win32_storage_iscsidisc_ReportRadiusServerListA(void* buffersizeinchar, void* buffer);
uint32_t windowssys_windows_win32_storage_iscsidisc_ReportRadiusServerListW(void* buffersizeinchar, void* buffer);
uint32_t windowssys_windows_win32_storage_iscsidisc_SendScsiInquiry(void* uniquesessionid, uint64_t lun, uint8_t evpdcmddt, uint8_t pagecode, void* scsistatus, void* responsesize, void* responsebuffer, void* sensesize, void* sensebuffer);
uint32_t windowssys_windows_win32_storage_iscsidisc_SendScsiReadCapacity(void* uniquesessionid, uint64_t lun, void* scsistatus, void* responsesize, void* responsebuffer, void* sensesize, void* sensebuffer);
uint32_t windowssys_windows_win32_storage_iscsidisc_SendScsiReportLuns(void* uniquesessionid, void* scsistatus, void* responsesize, void* responsebuffer, void* sensesize, void* sensebuffer);
uint32_t windowssys_windows_win32_storage_iscsidisc_SetIScsiGroupPresharedKey(uint32_t keylength, void* key, bool persist);
uint32_t windowssys_windows_win32_storage_iscsidisc_SetIScsiIKEInfoA(void* initiatorname, uint32_t initiatorportnumber, void* authinfo, bool persist);
uint32_t windowssys_windows_win32_storage_iscsidisc_SetIScsiIKEInfoW(void* initiatorname, uint32_t initiatorportnumber, void* authinfo, bool persist);
uint32_t windowssys_windows_win32_storage_iscsidisc_SetIScsiInitiatorCHAPSharedSecret(uint32_t sharedsecretlength, void* sharedsecret);
uint32_t windowssys_windows_win32_storage_iscsidisc_SetIScsiInitiatorNodeNameA(void* initiatornodename);
uint32_t windowssys_windows_win32_storage_iscsidisc_SetIScsiInitiatorNodeNameW(void* initiatornodename);
uint32_t windowssys_windows_win32_storage_iscsidisc_SetIScsiInitiatorRADIUSSharedSecret(uint32_t sharedsecretlength, void* sharedsecret);
uint32_t windowssys_windows_win32_storage_iscsidisc_SetIScsiTunnelModeOuterAddressA(void* initiatorname, uint32_t initiatorportnumber, void* destinationaddress, void* outermodeaddress, bool persist);
uint32_t windowssys_windows_win32_storage_iscsidisc_SetIScsiTunnelModeOuterAddressW(void* initiatorname, uint32_t initiatorportnumber, void* destinationaddress, void* outermodeaddress, bool persist);
uint32_t windowssys_windows_win32_storage_iscsidisc_SetupPersistentIScsiDevices(void);
uint32_t windowssys_windows_win32_storage_iscsidisc_SetupPersistentIScsiVolumes(void);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_STORAGE_ISCSIDISC_WINDOWS_WIN32_STORAGE_ISCSIDISC_WRAPPER_H */
