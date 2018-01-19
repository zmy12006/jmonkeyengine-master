package com.jme3.system.jopenvr;
import com.sun.jna.Callback;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import com.sun.jna.ptr.IntByReference;
import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : headers\openvr_capi.h:1514</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class VR_IVRApplications_FnTable extends Structure {
	/** C type : AddApplicationManifest_callback* */
	public VR_IVRApplications_FnTable.AddApplicationManifest_callback AddApplicationManifest;
	/** C type : RemoveApplicationManifest_callback* */
	public VR_IVRApplications_FnTable.RemoveApplicationManifest_callback RemoveApplicationManifest;
	/** C type : IsApplicationInstalled_callback* */
	public VR_IVRApplications_FnTable.IsApplicationInstalled_callback IsApplicationInstalled;
	/** C type : GetApplicationCount_callback* */
	public VR_IVRApplications_FnTable.GetApplicationCount_callback GetApplicationCount;
	/** C type : GetApplicationKeyByIndex_callback* */
	public VR_IVRApplications_FnTable.GetApplicationKeyByIndex_callback GetApplicationKeyByIndex;
	/** C type : GetApplicationKeyByProcessId_callback* */
	public VR_IVRApplications_FnTable.GetApplicationKeyByProcessId_callback GetApplicationKeyByProcessId;
	/** C type : LaunchApplication_callback* */
	public VR_IVRApplications_FnTable.LaunchApplication_callback LaunchApplication;
	/** C type : LaunchTemplateApplication_callback* */
	public VR_IVRApplications_FnTable.LaunchTemplateApplication_callback LaunchTemplateApplication;
	/** C type : LaunchApplicationFromMimeType_callback* */
	public VR_IVRApplications_FnTable.LaunchApplicationFromMimeType_callback LaunchApplicationFromMimeType;
	/** C type : LaunchDashboardOverlay_callback* */
	public VR_IVRApplications_FnTable.LaunchDashboardOverlay_callback LaunchDashboardOverlay;
	/** C type : CancelApplicationLaunch_callback* */
	public VR_IVRApplications_FnTable.CancelApplicationLaunch_callback CancelApplicationLaunch;
	/** C type : IdentifyApplication_callback* */
	public VR_IVRApplications_FnTable.IdentifyApplication_callback IdentifyApplication;
	/** C type : GetApplicationProcessId_callback* */
	public VR_IVRApplications_FnTable.GetApplicationProcessId_callback GetApplicationProcessId;
	/** C type : GetApplicationsErrorNameFromEnum_callback* */
	public VR_IVRApplications_FnTable.GetApplicationsErrorNameFromEnum_callback GetApplicationsErrorNameFromEnum;
	/** C type : GetApplicationPropertyString_callback* */
	public VR_IVRApplications_FnTable.GetApplicationPropertyString_callback GetApplicationPropertyString;
	/** C type : GetApplicationPropertyBool_callback* */
	public VR_IVRApplications_FnTable.GetApplicationPropertyBool_callback GetApplicationPropertyBool;
	/** C type : GetApplicationPropertyUint64_callback* */
	public VR_IVRApplications_FnTable.GetApplicationPropertyUint64_callback GetApplicationPropertyUint64;
	/** C type : SetApplicationAutoLaunch_callback* */
	public VR_IVRApplications_FnTable.SetApplicationAutoLaunch_callback SetApplicationAutoLaunch;
	/** C type : GetApplicationAutoLaunch_callback* */
	public VR_IVRApplications_FnTable.GetApplicationAutoLaunch_callback GetApplicationAutoLaunch;
	/** C type : SetDefaultApplicationForMimeType_callback* */
	public VR_IVRApplications_FnTable.SetDefaultApplicationForMimeType_callback SetDefaultApplicationForMimeType;
	/** C type : GetDefaultApplicationForMimeType_callback* */
	public VR_IVRApplications_FnTable.GetDefaultApplicationForMimeType_callback GetDefaultApplicationForMimeType;
	/** C type : GetApplicationSupportedMimeTypes_callback* */
	public VR_IVRApplications_FnTable.GetApplicationSupportedMimeTypes_callback GetApplicationSupportedMimeTypes;
	/** C type : GetApplicationsThatSupportMimeType_callback* */
	public VR_IVRApplications_FnTable.GetApplicationsThatSupportMimeType_callback GetApplicationsThatSupportMimeType;
	/** C type : GetApplicationLaunchArguments_callback* */
	public VR_IVRApplications_FnTable.GetApplicationLaunchArguments_callback GetApplicationLaunchArguments;
	/** C type : GetStartingApplication_callback* */
	public VR_IVRApplications_FnTable.GetStartingApplication_callback GetStartingApplication;
	/** C type : GetTransitionState_callback* */
	public VR_IVRApplications_FnTable.GetTransitionState_callback GetTransitionState;
	/** C type : PerformApplicationPrelaunchCheck_callback* */
	public VR_IVRApplications_FnTable.PerformApplicationPrelaunchCheck_callback PerformApplicationPrelaunchCheck;
	/** C type : GetApplicationsTransitionStateNameFromEnum_callback* */
	public VR_IVRApplications_FnTable.GetApplicationsTransitionStateNameFromEnum_callback GetApplicationsTransitionStateNameFromEnum;
	/** C type : IsQuitUserPromptRequested_callback* */
	public VR_IVRApplications_FnTable.IsQuitUserPromptRequested_callback IsQuitUserPromptRequested;
	/** C type : LaunchInternalProcess_callback* */
	public VR_IVRApplications_FnTable.LaunchInternalProcess_callback LaunchInternalProcess;
	/** C type : GetCurrentSceneProcessId_callback* */
	public VR_IVRApplications_FnTable.GetCurrentSceneProcessId_callback GetCurrentSceneProcessId;
	/** <i>native declaration : headers\openvr_capi.h:1483</i> */
	public interface AddApplicationManifest_callback extends Callback {
		int apply(Pointer pchApplicationManifestFullPath, byte bTemporary);
	};
	/** <i>native declaration : headers\openvr_capi.h:1484</i> */
	public interface RemoveApplicationManifest_callback extends Callback {
		int apply(Pointer pchApplicationManifestFullPath);
	};
	/** <i>native declaration : headers\openvr_capi.h:1485</i> */
	public interface IsApplicationInstalled_callback extends Callback {
		byte apply(Pointer pchAppKey);
	};
	/** <i>native declaration : headers\openvr_capi.h:1486</i> */
	public interface GetApplicationCount_callback extends Callback {
		int apply();
	};
	/** <i>native declaration : headers\openvr_capi.h:1487</i> */
	public interface GetApplicationKeyByIndex_callback extends Callback {
		int apply(int unApplicationIndex, Pointer pchAppKeyBuffer, int unAppKeyBufferLen);
	};
	/** <i>native declaration : headers\openvr_capi.h:1488</i> */
	public interface GetApplicationKeyByProcessId_callback extends Callback {
		int apply(int unProcessId, Pointer pchAppKeyBuffer, int unAppKeyBufferLen);
	};
	/** <i>native declaration : headers\openvr_capi.h:1489</i> */
	public interface LaunchApplication_callback extends Callback {
		int apply(Pointer pchAppKey);
	};
	/** <i>native declaration : headers\openvr_capi.h:1490</i> */
	public interface LaunchTemplateApplication_callback extends Callback {
		int apply(Pointer pchTemplateAppKey, Pointer pchNewAppKey, AppOverrideKeys_t pKeys, int unKeys);
	};
	/** <i>native declaration : headers\openvr_capi.h:1491</i> */
	public interface LaunchApplicationFromMimeType_callback extends Callback {
		int apply(Pointer pchMimeType, Pointer pchArgs);
	};
	/** <i>native declaration : headers\openvr_capi.h:1492</i> */
	public interface LaunchDashboardOverlay_callback extends Callback {
		int apply(Pointer pchAppKey);
	};
	/** <i>native declaration : headers\openvr_capi.h:1493</i> */
	public interface CancelApplicationLaunch_callback extends Callback {
		byte apply(Pointer pchAppKey);
	};
	/** <i>native declaration : headers\openvr_capi.h:1494</i> */
	public interface IdentifyApplication_callback extends Callback {
		int apply(int unProcessId, Pointer pchAppKey);
	};
	/** <i>native declaration : headers\openvr_capi.h:1495</i> */
	public interface GetApplicationProcessId_callback extends Callback {
		int apply(Pointer pchAppKey);
	};
	/** <i>native declaration : headers\openvr_capi.h:1496</i> */
	public interface GetApplicationsErrorNameFromEnum_callback extends Callback {
		Pointer apply(int error);
	};
	/** <i>native declaration : headers\openvr_capi.h:1497</i> */
	public interface GetApplicationPropertyString_callback extends Callback {
		int apply(Pointer pchAppKey, int eProperty, Pointer pchPropertyValueBuffer, int unPropertyValueBufferLen, IntByReference peError);
	};
	/** <i>native declaration : headers\openvr_capi.h:1498</i> */
	public interface GetApplicationPropertyBool_callback extends Callback {
		byte apply(Pointer pchAppKey, int eProperty, IntByReference peError);
	};
	/** <i>native declaration : headers\openvr_capi.h:1499</i> */
	public interface GetApplicationPropertyUint64_callback extends Callback {
		long apply(Pointer pchAppKey, int eProperty, IntByReference peError);
	};
	/** <i>native declaration : headers\openvr_capi.h:1500</i> */
	public interface SetApplicationAutoLaunch_callback extends Callback {
		int apply(Pointer pchAppKey, byte bAutoLaunch);
	};
	/** <i>native declaration : headers\openvr_capi.h:1501</i> */
	public interface GetApplicationAutoLaunch_callback extends Callback {
		byte apply(Pointer pchAppKey);
	};
	/** <i>native declaration : headers\openvr_capi.h:1502</i> */
	public interface SetDefaultApplicationForMimeType_callback extends Callback {
		int apply(Pointer pchAppKey, Pointer pchMimeType);
	};
	/** <i>native declaration : headers\openvr_capi.h:1503</i> */
	public interface GetDefaultApplicationForMimeType_callback extends Callback {
		byte apply(Pointer pchMimeType, Pointer pchAppKeyBuffer, int unAppKeyBufferLen);
	};
	/** <i>native declaration : headers\openvr_capi.h:1504</i> */
	public interface GetApplicationSupportedMimeTypes_callback extends Callback {
		byte apply(Pointer pchAppKey, Pointer pchMimeTypesBuffer, int unMimeTypesBuffer);
	};
	/** <i>native declaration : headers\openvr_capi.h:1505</i> */
	public interface GetApplicationsThatSupportMimeType_callback extends Callback {
		int apply(Pointer pchMimeType, Pointer pchAppKeysThatSupportBuffer, int unAppKeysThatSupportBuffer);
	};
	/** <i>native declaration : headers\openvr_capi.h:1506</i> */
	public interface GetApplicationLaunchArguments_callback extends Callback {
		int apply(int unHandle, Pointer pchArgs, int unArgs);
	};
	/** <i>native declaration : headers\openvr_capi.h:1507</i> */
	public interface GetStartingApplication_callback extends Callback {
		int apply(Pointer pchAppKeyBuffer, int unAppKeyBufferLen);
	};
	/** <i>native declaration : headers\openvr_capi.h:1508</i> */
	public interface GetTransitionState_callback extends Callback {
		int apply();
	};
	/** <i>native declaration : headers\openvr_capi.h:1509</i> */
	public interface PerformApplicationPrelaunchCheck_callback extends Callback {
		int apply(Pointer pchAppKey);
	};
	/** <i>native declaration : headers\openvr_capi.h:1510</i> */
	public interface GetApplicationsTransitionStateNameFromEnum_callback extends Callback {
		Pointer apply(int state);
	};
	/** <i>native declaration : headers\openvr_capi.h:1511</i> */
	public interface IsQuitUserPromptRequested_callback extends Callback {
		byte apply();
	};
	/** <i>native declaration : headers\openvr_capi.h:1512</i> */
	public interface LaunchInternalProcess_callback extends Callback {
		int apply(Pointer pchBinaryPath, Pointer pchArguments, Pointer pchWorkingDirectory);
	};
	/** <i>native declaration : headers\openvr_capi.h:1513</i> */
	public interface GetCurrentSceneProcessId_callback extends Callback {
		int apply();
	};
	public VR_IVRApplications_FnTable() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("AddApplicationManifest", "RemoveApplicationManifest", "IsApplicationInstalled", "GetApplicationCount", "GetApplicationKeyByIndex", "GetApplicationKeyByProcessId", "LaunchApplication", "LaunchTemplateApplication", "LaunchApplicationFromMimeType", "LaunchDashboardOverlay", "CancelApplicationLaunch", "IdentifyApplication", "GetApplicationProcessId", "GetApplicationsErrorNameFromEnum", "GetApplicationPropertyString", "GetApplicationPropertyBool", "GetApplicationPropertyUint64", "SetApplicationAutoLaunch", "GetApplicationAutoLaunch", "SetDefaultApplicationForMimeType", "GetDefaultApplicationForMimeType", "GetApplicationSupportedMimeTypes", "GetApplicationsThatSupportMimeType", "GetApplicationLaunchArguments", "GetStartingApplication", "GetTransitionState", "PerformApplicationPrelaunchCheck", "GetApplicationsTransitionStateNameFromEnum", "IsQuitUserPromptRequested", "LaunchInternalProcess", "GetCurrentSceneProcessId");
	}
	public VR_IVRApplications_FnTable(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends VR_IVRApplications_FnTable implements Structure.ByReference {
		
	};
	public static class ByValue extends VR_IVRApplications_FnTable implements Structure.ByValue {
		
	};
}
