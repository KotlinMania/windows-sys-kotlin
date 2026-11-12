#ifndef WINDOWSSYS_WINDOWS_WDK_NETWORKMANAGEMENT_NDIS_WINDOWS_WDK_NETWORKMANAGEMENT_NDIS_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WDK_NETWORKMANAGEMENT_NDIS_WINDOWS_WDK_NETWORKMANAGEMENT_NDIS_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

void windowssysWindowsWdkNetworkmanagementNdisNdisAcquireReadWriteLock(void* lock, bool fwrite, void* lockstate);
int32_t windowssysWindowsWdkNetworkmanagementNdisNdisAllocateMemoryWithTag(void* virtualaddress, uint32_t length, uint32_t tag);
void windowssysWindowsWdkNetworkmanagementNdisNdisCancelTimer(void* timer, void* timercancelled);
int32_t windowssysWindowsWdkNetworkmanagementNdisNdisClAddParty(void* ndisvchandle, void* protocolpartycontext, void* callparameters, void* ndispartyhandle);
int32_t windowssysWindowsWdkNetworkmanagementNdisNdisClCloseAddressFamily(void* ndisafhandle);
int32_t windowssysWindowsWdkNetworkmanagementNdisNdisClCloseCall(void* ndisvchandle, void* ndispartyhandle, void* buffer, uint32_t size);
int32_t windowssysWindowsWdkNetworkmanagementNdisNdisClDeregisterSap(void* ndissaphandle);
int32_t windowssysWindowsWdkNetworkmanagementNdisNdisClDropParty(void* ndispartyhandle, void* buffer, uint32_t size);
void windowssysWindowsWdkNetworkmanagementNdisNdisClIncomingCallComplete(int32_t status, void* ndisvchandle, void* callparameters);
int32_t windowssysWindowsWdkNetworkmanagementNdisNdisClMakeCall(void* ndisvchandle, void* callparameters, void* protocolpartycontext, void* ndispartyhandle);
int32_t windowssysWindowsWdkNetworkmanagementNdisNdisClModifyCallQoS(void* ndisvchandle, void* callparameters);
int32_t windowssysWindowsWdkNetworkmanagementNdisNdisClRegisterSap(void* ndisafhandle, void* protocolsapcontext, void* sap, void* ndissaphandle);
void windowssysWindowsWdkNetworkmanagementNdisNdisCloseConfiguration(void* configurationhandle);
void windowssysWindowsWdkNetworkmanagementNdisNdisCloseFile(void* filehandle);
int32_t windowssysWindowsWdkNetworkmanagementNdisNdisCmActivateVc(void* ndisvchandle, void* callparameters);
void windowssysWindowsWdkNetworkmanagementNdisNdisCmAddPartyComplete(int32_t status, void* ndispartyhandle, void* callmgrpartycontext, void* callparameters);
void windowssysWindowsWdkNetworkmanagementNdisNdisCmCloseAddressFamilyComplete(int32_t status, void* ndisafhandle);
void windowssysWindowsWdkNetworkmanagementNdisNdisCmCloseCallComplete(int32_t status, void* ndisvchandle, void* ndispartyhandle);
int32_t windowssysWindowsWdkNetworkmanagementNdisNdisCmDeactivateVc(void* ndisvchandle);
void windowssysWindowsWdkNetworkmanagementNdisNdisCmDeregisterSapComplete(int32_t status, void* ndissaphandle);
void windowssysWindowsWdkNetworkmanagementNdisNdisCmDispatchCallConnected(void* ndisvchandle);
int32_t windowssysWindowsWdkNetworkmanagementNdisNdisCmDispatchIncomingCall(void* ndissaphandle, void* ndisvchandle, void* callparameters);
void windowssysWindowsWdkNetworkmanagementNdisNdisCmDispatchIncomingCallQoSChange(void* ndisvchandle, void* callparameters);
void windowssysWindowsWdkNetworkmanagementNdisNdisCmDispatchIncomingCloseCall(int32_t closestatus, void* ndisvchandle, void* buffer, uint32_t size);
void windowssysWindowsWdkNetworkmanagementNdisNdisCmDispatchIncomingDropParty(int32_t dropstatus, void* ndispartyhandle, void* buffer, uint32_t size);
void windowssysWindowsWdkNetworkmanagementNdisNdisCmDropPartyComplete(int32_t status, void* ndispartyhandle);
void windowssysWindowsWdkNetworkmanagementNdisNdisCmMakeCallComplete(int32_t status, void* ndisvchandle, void* ndispartyhandle, void* callmgrpartycontext, void* callparameters);
void windowssysWindowsWdkNetworkmanagementNdisNdisCmModifyCallQoSComplete(int32_t status, void* ndisvchandle, void* callparameters);
void windowssysWindowsWdkNetworkmanagementNdisNdisCmOpenAddressFamilyComplete(int32_t status, void* ndisafhandle, void* callmgrafcontext);
void windowssysWindowsWdkNetworkmanagementNdisNdisCmRegisterSapComplete(int32_t status, void* ndissaphandle, void* callmgrsapcontext);
int32_t windowssysWindowsWdkNetworkmanagementNdisNdisCoAssignInstanceName(void* ndisvchandle, void* baseinstancename, void* vcinstancename);
int32_t windowssysWindowsWdkNetworkmanagementNdisNdisCoCreateVc(void* ndisbindinghandle, void* ndisafhandle, void* protocolvccontext, void* ndisvchandle);
int32_t windowssysWindowsWdkNetworkmanagementNdisNdisCoDeleteVc(void* ndisvchandle);
int32_t windowssysWindowsWdkNetworkmanagementNdisNdisCoGetTapiCallId(void* ndisvchandle, void* tapicallid);
void windowssysWindowsWdkNetworkmanagementNdisNdisCompleteDmaTransfer(void* status, void* ndisdmahandle, void* buffer, uint32_t offset, uint32_t length, bool writetodevice);
void windowssysWindowsWdkNetworkmanagementNdisNdisCopyBuffer(void* status, void* buffer, void* poolhandle, void* memorydescriptor, uint32_t offset, uint32_t length);
void windowssysWindowsWdkNetworkmanagementNdisNdisDeregisterTdiCallBack(void);
void windowssysWindowsWdkNetworkmanagementNdisNdisFreeMemory(void* virtualaddress, uint32_t length, uint32_t memoryflags);
uint8_t windowssysWindowsWdkNetworkmanagementNdisNdisGeneratePartialCancelId(void);
void windowssysWindowsWdkNetworkmanagementNdisNdisGetCurrentProcessorCounts(void* pidlecount, void* pkernelanduser, void* pindex);
void windowssysWindowsWdkNetworkmanagementNdisNdisGetCurrentProcessorCpuUsage(void* pcpuusage);
void* windowssysWindowsWdkNetworkmanagementNdisNdisGetRoutineAddress(void* ndisroutinename);
uint32_t windowssysWindowsWdkNetworkmanagementNdisNdisGetSharedDataAlignment(void);
uint32_t windowssysWindowsWdkNetworkmanagementNdisNdisGetVersion(void);
void windowssysWindowsWdkNetworkmanagementNdisNdisIMAssociateMiniport(void* driverhandle, void* protocolhandle);
int32_t windowssysWindowsWdkNetworkmanagementNdisNdisIMCancelInitializeDeviceInstance(void* driverhandle, void* deviceinstance);
int32_t windowssysWindowsWdkNetworkmanagementNdisNdisIMDeInitializeDeviceInstance(void* ndisminiporthandle);
void* windowssysWindowsWdkNetworkmanagementNdisNdisIMGetBindingContext(void* ndisbindinghandle);
int32_t windowssysWindowsWdkNetworkmanagementNdisNdisIMInitializeDeviceInstanceEx(void* driverhandle, void* driverinstance, void* devicecontext);
void windowssysWindowsWdkNetworkmanagementNdisNdisInitializeEvent(void* event);
void windowssysWindowsWdkNetworkmanagementNdisNdisInitializeReadWriteLock(void* lock);
void windowssysWindowsWdkNetworkmanagementNdisNdisInitializeString(void* destination, void* source);
void windowssysWindowsWdkNetworkmanagementNdisNdisInitializeTimer(void* timer, void* timerfunction, void* functioncontext);
void windowssysWindowsWdkNetworkmanagementNdisNdisMAllocateSharedMemory(void* miniportadapterhandle, uint32_t length, bool cached, void* virtualaddress, void* physicaladdress);
int32_t windowssysWindowsWdkNetworkmanagementNdisNdisMAllocateSharedMemoryAsync(void* miniportadapterhandle, uint32_t length, bool cached, void* context);
void windowssysWindowsWdkNetworkmanagementNdisNdisMCancelTimer(void* timer, void* timercancelled);
void windowssysWindowsWdkNetworkmanagementNdisNdisMCloseLog(void* loghandle);
int32_t windowssysWindowsWdkNetworkmanagementNdisNdisMCmActivateVc(void* ndisvchandle, void* callparameters);
int32_t windowssysWindowsWdkNetworkmanagementNdisNdisMCmCreateVc(void* miniportadapterhandle, void* ndisafhandle, void* miniportvccontext, void* ndisvchandle);
int32_t windowssysWindowsWdkNetworkmanagementNdisNdisMCmDeactivateVc(void* ndisvchandle);
int32_t windowssysWindowsWdkNetworkmanagementNdisNdisMCmDeleteVc(void* ndisvchandle);
int32_t windowssysWindowsWdkNetworkmanagementNdisNdisMCmRegisterAddressFamily(void* miniportadapterhandle, void* addressfamily, void* cmcharacteristics, uint32_t sizeofcmcharacteristics);
void windowssysWindowsWdkNetworkmanagementNdisNdisMCoActivateVcComplete(int32_t status, void* ndisvchandle, void* callparameters);
void windowssysWindowsWdkNetworkmanagementNdisNdisMCoDeactivateVcComplete(int32_t status, void* ndisvchandle);
int32_t windowssysWindowsWdkNetworkmanagementNdisNdisMCreateLog(void* miniportadapterhandle, uint32_t size, void* loghandle);
void windowssysWindowsWdkNetworkmanagementNdisNdisMDeregisterDmaChannel(void* miniportdmahandle);
void windowssysWindowsWdkNetworkmanagementNdisNdisMDeregisterIoPortRange(void* miniportadapterhandle, uint32_t initialport, uint32_t numberofports, void* portoffset);
void windowssysWindowsWdkNetworkmanagementNdisNdisMFlushLog(void* loghandle);
void windowssysWindowsWdkNetworkmanagementNdisNdisMFreeSharedMemory(void* miniportadapterhandle, uint32_t length, bool cached, void* virtualaddress, int64_t physicaladdress);
void windowssysWindowsWdkNetworkmanagementNdisNdisMGetDeviceProperty(void* miniportadapterhandle, void* physicaldeviceobject, void* functionaldeviceobject, void* nextdeviceobject, void* allocatedresources, void* allocatedresourcestranslated);
uint32_t windowssysWindowsWdkNetworkmanagementNdisNdisMGetDmaAlignment(void* miniportadapterhandle);
void windowssysWindowsWdkNetworkmanagementNdisNdisMInitializeTimer(void* timer, void* miniportadapterhandle, void* timerfunction, void* functioncontext);
int32_t windowssysWindowsWdkNetworkmanagementNdisNdisMMapIoSpace(void* virtualaddress, void* miniportadapterhandle, int64_t physicaladdress, uint32_t length);
int32_t windowssysWindowsWdkNetworkmanagementNdisNdisMQueryAdapterInstanceName(void* padapterinstancename, void* miniporthandle);
uint32_t windowssysWindowsWdkNetworkmanagementNdisNdisMReadDmaCounter(void* miniportdmahandle);
int32_t windowssysWindowsWdkNetworkmanagementNdisNdisMRegisterDmaChannel(void* miniportdmahandle, void* miniportadapterhandle, uint32_t dmachannel, bool dma32bitaddresses, void* dmadescription, uint32_t maximumlength);
int32_t windowssysWindowsWdkNetworkmanagementNdisNdisMRegisterIoPortRange(void* portoffset, void* miniportadapterhandle, uint32_t initialport, uint32_t numberofports);
int32_t windowssysWindowsWdkNetworkmanagementNdisNdisMRemoveMiniport(void* miniporthandle);
void windowssysWindowsWdkNetworkmanagementNdisNdisMSetPeriodicTimer(void* timer, uint32_t millisecondperiod);
void windowssysWindowsWdkNetworkmanagementNdisNdisMSleep(uint32_t microsecondstosleep);
void windowssysWindowsWdkNetworkmanagementNdisNdisMUnmapIoSpace(void* miniportadapterhandle, void* virtualaddress, uint32_t length);
int32_t windowssysWindowsWdkNetworkmanagementNdisNdisMWriteLogData(void* loghandle, void* logbuffer, uint32_t logbuffersize);
void windowssysWindowsWdkNetworkmanagementNdisNdisMapFile(void* status, void* mappedbuffer, void* filehandle);
void windowssysWindowsWdkNetworkmanagementNdisNdisOpenConfigurationKeyByIndex(void* status, void* configurationhandle, uint32_t arg2Index, void* keyname, void* keyhandle);
void windowssysWindowsWdkNetworkmanagementNdisNdisOpenConfigurationKeyByName(void* status, void* configurationhandle, void* subkeyname, void* subkeyhandle);
void windowssysWindowsWdkNetworkmanagementNdisNdisOpenFile(void* status, void* filehandle, void* filelength, void* filename, int64_t highestacceptableaddress);
int32_t windowssysWindowsWdkNetworkmanagementNdisNdisQueryAdapterInstanceName(void* padapterinstancename, void* ndisbindinghandle);
int32_t windowssysWindowsWdkNetworkmanagementNdisNdisQueryBindInstanceName(void* padapterinstancename, void* bindingcontext);
void windowssysWindowsWdkNetworkmanagementNdisNdisReEnumerateProtocolBindings(void* ndisprotocolhandle);
void windowssysWindowsWdkNetworkmanagementNdisNdisReadConfiguration(void* status, void* parametervalue, void* configurationhandle, void* keyword, int32_t parametertype);
void windowssysWindowsWdkNetworkmanagementNdisNdisReadNetworkAddress(void* status, void* networkaddress, void* networkaddresslength, void* configurationhandle);
void windowssysWindowsWdkNetworkmanagementNdisNdisRegisterTdiCallBack(void* registercallback, void* pnphandler);
void windowssysWindowsWdkNetworkmanagementNdisNdisReleaseReadWriteLock(void* lock, void* lockstate);
void windowssysWindowsWdkNetworkmanagementNdisNdisResetEvent(void* event);
void windowssysWindowsWdkNetworkmanagementNdisNdisSetEvent(void* event);
void windowssysWindowsWdkNetworkmanagementNdisNdisSetPeriodicTimer(void* ndistimer, uint32_t millisecondsperiod);
void windowssysWindowsWdkNetworkmanagementNdisNdisSetTimer(void* timer, uint32_t millisecondstodelay);
void windowssysWindowsWdkNetworkmanagementNdisNdisSetTimerEx(void* ndistimer, uint32_t millisecondstodelay, void* functioncontext);
void windowssysWindowsWdkNetworkmanagementNdisNdisSetupDmaTransfer(void* status, void* ndisdmahandle, void* buffer, uint32_t offset, uint32_t length, bool writetodevice);
int8_t windowssysWindowsWdkNetworkmanagementNdisNdisSystemProcessorCount(void);
void windowssysWindowsWdkNetworkmanagementNdisNdisUnmapFile(void* filehandle);
void windowssysWindowsWdkNetworkmanagementNdisNdisUpdateSharedMemory(void* ndisadapterhandle, uint32_t length, void* virtualaddress, int64_t physicaladdress);
bool windowssysWindowsWdkNetworkmanagementNdisNdisWaitEvent(void* event, uint32_t mstowait);
void windowssysWindowsWdkNetworkmanagementNdisNdisWriteConfiguration(void* status, void* configurationhandle, void* keyword, void* parametervalue);
void windowssysWindowsWdkNetworkmanagementNdisNdisWriteErrorLogEntry(void* ndisadapterhandle, uint32_t errorcode, uint32_t numberoferrorvalues, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3);
int32_t windowssysWindowsWdkNetworkmanagementNdisNdisWriteEventLogEntry(void* loghandle, int32_t eventcode, uint32_t uniqueeventvalue, uint16_t numstrings, void* stringslist, uint32_t datasize, void* data);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WDK_NETWORKMANAGEMENT_NDIS_WINDOWS_WDK_NETWORKMANAGEMENT_NDIS_WRAPPER_H */
