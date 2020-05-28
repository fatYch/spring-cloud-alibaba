package top.yaoch.times.entity;

import java.util.List;

public class MeetingRoom {
    /**
     * Valid : true
     * Success : true
     * Msg : null
     * Result : {"PageCount":1,"PageNo":1,"PageSize":10,"RecordCount":1,"Data":[{"MeetingRoomID":"c611edb2-da76-4f23-b21e-7c462b915f3c","MeetingRoomName":"1001会议室","Category":1,"CategoryName":"中型会议室","Floors":"10","iFloors":0,"Capacity":"20","Remarks":null,"Status":1,"CompanyID":"6c3f84fe-ee8a-43d0-9774-b746507a81cf","NeedApproval":1,"ApprovalDuration":6,"Appliance":"2,1,0","ApplianceName":"电话,视频,投影","Company":"时代邻里","CreatedBy":null,"CreatedDate":"0001-01-01 00:00:00","LastUpdatedBy":null,"LastUpdatedDate":"0001-01-01 00:00:00","ID":null,"TEXT":null,"NAME":null,"AvailableTime":["10:30,2,0","11:00,2,0","11:30,2,0","08:30,1,0","09:00,1,0","09:30,1,0","10:00,1,0","17:00,1,0","17:30,1,0","16:00,1,0","16:30,1,0","13:00,1,0","13:30,1,0","14:00,1,0","14:30,1,0","15:00,1,0","15:30,1,0"],"NetGroupID":null,"SubPointID":null,"CtrlAddress":null,"PointAddress":null,"DoorAddress":null,"CategoryOrder":0,"HandlerID":null,"HandlerName":null,"DeptIDList":null,"DeptNameList":null,"VideoDeviceId":0,"VideoDeviceName":null,"IsVideoRoom":1,"IsOrdered":0,"ApproverID":"181cfdc7-e2e5-4553-913e-d7984ad16505","ApproverName":"刘诗敏"}]}
     * ErrorNo : null
     */

    private boolean Valid;
    private boolean Success;
    private Object Msg;
    private ResultBean Result;
    private Object ErrorNo;

    public boolean isValid() {
        return Valid;
    }

    public void setValid(boolean Valid) {
        this.Valid = Valid;
    }

    public boolean isSuccess() {
        return Success;
    }

    public void setSuccess(boolean Success) {
        this.Success = Success;
    }

    public Object getMsg() {
        return Msg;
    }

    public void setMsg(Object Msg) {
        this.Msg = Msg;
    }

    public ResultBean getResult() {
        return Result;
    }

    public void setResult(ResultBean Result) {
        this.Result = Result;
    }

    public Object getErrorNo() {
        return ErrorNo;
    }

    public void setErrorNo(Object ErrorNo) {
        this.ErrorNo = ErrorNo;
    }

    public static class ResultBean {
        /**
         * PageCount : 1
         * PageNo : 1
         * PageSize : 10
         * RecordCount : 1
         * Data : [{"MeetingRoomID":"c611edb2-da76-4f23-b21e-7c462b915f3c","MeetingRoomName":"1001会议室","Category":1,"CategoryName":"中型会议室","Floors":"10","iFloors":0,"Capacity":"20","Remarks":null,"Status":1,"CompanyID":"6c3f84fe-ee8a-43d0-9774-b746507a81cf","NeedApproval":1,"ApprovalDuration":6,"Appliance":"2,1,0","ApplianceName":"电话,视频,投影","Company":"时代邻里","CreatedBy":null,"CreatedDate":"0001-01-01 00:00:00","LastUpdatedBy":null,"LastUpdatedDate":"0001-01-01 00:00:00","ID":null,"TEXT":null,"NAME":null,"AvailableTime":["10:30,2,0","11:00,2,0","11:30,2,0","08:30,1,0","09:00,1,0","09:30,1,0","10:00,1,0","17:00,1,0","17:30,1,0","16:00,1,0","16:30,1,0","13:00,1,0","13:30,1,0","14:00,1,0","14:30,1,0","15:00,1,0","15:30,1,0"],"NetGroupID":null,"SubPointID":null,"CtrlAddress":null,"PointAddress":null,"DoorAddress":null,"CategoryOrder":0,"HandlerID":null,"HandlerName":null,"DeptIDList":null,"DeptNameList":null,"VideoDeviceId":0,"VideoDeviceName":null,"IsVideoRoom":1,"IsOrdered":0,"ApproverID":"181cfdc7-e2e5-4553-913e-d7984ad16505","ApproverName":"刘诗敏"}]
         */

        private int PageCount;
        private int PageNo;
        private int PageSize;
        private int RecordCount;
        private List<DataBean> Data;

        public int getPageCount() {
            return PageCount;
        }

        public void setPageCount(int PageCount) {
            this.PageCount = PageCount;
        }

        public int getPageNo() {
            return PageNo;
        }

        public void setPageNo(int PageNo) {
            this.PageNo = PageNo;
        }

        public int getPageSize() {
            return PageSize;
        }

        public void setPageSize(int PageSize) {
            this.PageSize = PageSize;
        }

        public int getRecordCount() {
            return RecordCount;
        }

        public void setRecordCount(int RecordCount) {
            this.RecordCount = RecordCount;
        }

        public List<DataBean> getData() {
            return Data;
        }

        public void setData(List<DataBean> Data) {
            this.Data = Data;
        }

        public static class DataBean {
            /**
             * MeetingRoomID : c611edb2-da76-4f23-b21e-7c462b915f3c
             * MeetingRoomName : 1001会议室
             * Category : 1
             * CategoryName : 中型会议室
             * Floors : 10
             * iFloors : 0
             * Capacity : 20
             * Remarks : null
             * Status : 1
             * CompanyID : 6c3f84fe-ee8a-43d0-9774-b746507a81cf
             * NeedApproval : 1
             * ApprovalDuration : 6.0
             * Appliance : 2,1,0
             * ApplianceName : 电话,视频,投影
             * Company : 时代邻里
             * CreatedBy : null
             * CreatedDate : 0001-01-01 00:00:00
             * LastUpdatedBy : null
             * LastUpdatedDate : 0001-01-01 00:00:00
             * ID : null
             * TEXT : null
             * NAME : null
             * AvailableTime : ["10:30,2,0","11:00,2,0","11:30,2,0","08:30,1,0","09:00,1,0","09:30,1,0","10:00,1,0","17:00,1,0","17:30,1,0","16:00,1,0","16:30,1,0","13:00,1,0","13:30,1,0","14:00,1,0","14:30,1,0","15:00,1,0","15:30,1,0"]
             * NetGroupID : null
             * SubPointID : null
             * CtrlAddress : null
             * PointAddress : null
             * DoorAddress : null
             * CategoryOrder : 0
             * HandlerID : null
             * HandlerName : null
             * DeptIDList : null
             * DeptNameList : null
             * VideoDeviceId : 0
             * VideoDeviceName : null
             * IsVideoRoom : 1
             * IsOrdered : 0
             * ApproverID : 181cfdc7-e2e5-4553-913e-d7984ad16505
             * ApproverName : 刘诗敏
             */

            private String MeetingRoomID;
            private String MeetingRoomName;
            private int Category;
            private String CategoryName;
            private String Floors;
            private int iFloors;
            private String Capacity;
            private Object Remarks;
            private int Status;
            private String CompanyID;
            private int NeedApproval;
            private double ApprovalDuration;
            private String Appliance;
            private String ApplianceName;
            private String Company;
            private Object CreatedBy;
            private String CreatedDate;
            private Object LastUpdatedBy;
            private String LastUpdatedDate;
            private Object ID;
            private Object TEXT;
            private Object NAME;
            private Object NetGroupID;
            private Object SubPointID;
            private Object CtrlAddress;
            private Object PointAddress;
            private Object DoorAddress;
            private int CategoryOrder;
            private Object HandlerID;
            private Object HandlerName;
            private Object DeptIDList;
            private Object DeptNameList;
            private int VideoDeviceId;
            private Object VideoDeviceName;
            private int IsVideoRoom;
            private int IsOrdered;
            private String ApproverID;
            private String ApproverName;
            private List<String> AvailableTime;

            public String getMeetingRoomID() {
                return MeetingRoomID;
            }

            public void setMeetingRoomID(String MeetingRoomID) {
                this.MeetingRoomID = MeetingRoomID;
            }

            public String getMeetingRoomName() {
                return MeetingRoomName;
            }

            public void setMeetingRoomName(String MeetingRoomName) {
                this.MeetingRoomName = MeetingRoomName;
            }

            public int getCategory() {
                return Category;
            }

            public void setCategory(int Category) {
                this.Category = Category;
            }

            public String getCategoryName() {
                return CategoryName;
            }

            public void setCategoryName(String CategoryName) {
                this.CategoryName = CategoryName;
            }

            public String getFloors() {
                return Floors;
            }

            public void setFloors(String Floors) {
                this.Floors = Floors;
            }

            public int getIFloors() {
                return iFloors;
            }

            public void setIFloors(int iFloors) {
                this.iFloors = iFloors;
            }

            public String getCapacity() {
                return Capacity;
            }

            public void setCapacity(String Capacity) {
                this.Capacity = Capacity;
            }

            public Object getRemarks() {
                return Remarks;
            }

            public void setRemarks(Object Remarks) {
                this.Remarks = Remarks;
            }

            public int getStatus() {
                return Status;
            }

            public void setStatus(int Status) {
                this.Status = Status;
            }

            public String getCompanyID() {
                return CompanyID;
            }

            public void setCompanyID(String CompanyID) {
                this.CompanyID = CompanyID;
            }

            public int getNeedApproval() {
                return NeedApproval;
            }

            public void setNeedApproval(int NeedApproval) {
                this.NeedApproval = NeedApproval;
            }

            public double getApprovalDuration() {
                return ApprovalDuration;
            }

            public void setApprovalDuration(double ApprovalDuration) {
                this.ApprovalDuration = ApprovalDuration;
            }

            public String getAppliance() {
                return Appliance;
            }

            public void setAppliance(String Appliance) {
                this.Appliance = Appliance;
            }

            public String getApplianceName() {
                return ApplianceName;
            }

            public void setApplianceName(String ApplianceName) {
                this.ApplianceName = ApplianceName;
            }

            public String getCompany() {
                return Company;
            }

            public void setCompany(String Company) {
                this.Company = Company;
            }

            public Object getCreatedBy() {
                return CreatedBy;
            }

            public void setCreatedBy(Object CreatedBy) {
                this.CreatedBy = CreatedBy;
            }

            public String getCreatedDate() {
                return CreatedDate;
            }

            public void setCreatedDate(String CreatedDate) {
                this.CreatedDate = CreatedDate;
            }

            public Object getLastUpdatedBy() {
                return LastUpdatedBy;
            }

            public void setLastUpdatedBy(Object LastUpdatedBy) {
                this.LastUpdatedBy = LastUpdatedBy;
            }

            public String getLastUpdatedDate() {
                return LastUpdatedDate;
            }

            public void setLastUpdatedDate(String LastUpdatedDate) {
                this.LastUpdatedDate = LastUpdatedDate;
            }

            public Object getID() {
                return ID;
            }

            public void setID(Object ID) {
                this.ID = ID;
            }

            public Object getTEXT() {
                return TEXT;
            }

            public void setTEXT(Object TEXT) {
                this.TEXT = TEXT;
            }

            public Object getNAME() {
                return NAME;
            }

            public void setNAME(Object NAME) {
                this.NAME = NAME;
            }

            public Object getNetGroupID() {
                return NetGroupID;
            }

            public void setNetGroupID(Object NetGroupID) {
                this.NetGroupID = NetGroupID;
            }

            public Object getSubPointID() {
                return SubPointID;
            }

            public void setSubPointID(Object SubPointID) {
                this.SubPointID = SubPointID;
            }

            public Object getCtrlAddress() {
                return CtrlAddress;
            }

            public void setCtrlAddress(Object CtrlAddress) {
                this.CtrlAddress = CtrlAddress;
            }

            public Object getPointAddress() {
                return PointAddress;
            }

            public void setPointAddress(Object PointAddress) {
                this.PointAddress = PointAddress;
            }

            public Object getDoorAddress() {
                return DoorAddress;
            }

            public void setDoorAddress(Object DoorAddress) {
                this.DoorAddress = DoorAddress;
            }

            public int getCategoryOrder() {
                return CategoryOrder;
            }

            public void setCategoryOrder(int CategoryOrder) {
                this.CategoryOrder = CategoryOrder;
            }

            public Object getHandlerID() {
                return HandlerID;
            }

            public void setHandlerID(Object HandlerID) {
                this.HandlerID = HandlerID;
            }

            public Object getHandlerName() {
                return HandlerName;
            }

            public void setHandlerName(Object HandlerName) {
                this.HandlerName = HandlerName;
            }

            public Object getDeptIDList() {
                return DeptIDList;
            }

            public void setDeptIDList(Object DeptIDList) {
                this.DeptIDList = DeptIDList;
            }

            public Object getDeptNameList() {
                return DeptNameList;
            }

            public void setDeptNameList(Object DeptNameList) {
                this.DeptNameList = DeptNameList;
            }

            public int getVideoDeviceId() {
                return VideoDeviceId;
            }

            public void setVideoDeviceId(int VideoDeviceId) {
                this.VideoDeviceId = VideoDeviceId;
            }

            public Object getVideoDeviceName() {
                return VideoDeviceName;
            }

            public void setVideoDeviceName(Object VideoDeviceName) {
                this.VideoDeviceName = VideoDeviceName;
            }

            public int getIsVideoRoom() {
                return IsVideoRoom;
            }

            public void setIsVideoRoom(int IsVideoRoom) {
                this.IsVideoRoom = IsVideoRoom;
            }

            public int getIsOrdered() {
                return IsOrdered;
            }

            public void setIsOrdered(int IsOrdered) {
                this.IsOrdered = IsOrdered;
            }

            public String getApproverID() {
                return ApproverID;
            }

            public void setApproverID(String ApproverID) {
                this.ApproverID = ApproverID;
            }

            public String getApproverName() {
                return ApproverName;
            }

            public void setApproverName(String ApproverName) {
                this.ApproverName = ApproverName;
            }

            public List<String> getAvailableTime() {
                return AvailableTime;
            }

            public void setAvailableTime(List<String> AvailableTime) {
                this.AvailableTime = AvailableTime;
            }
        }
    }
}
