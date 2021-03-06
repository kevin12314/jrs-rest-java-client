/*
 * Copyright (C) 2005 - 2014 Jaspersoft Corporation. All rights  reserved.
 * http://www.jaspersoft.com.
 *
 * Unless you have purchased  a commercial license agreement from Jaspersoft,
 * the following license terms  apply:
 *
 * This program is free software: you can redistribute it and/or  modify
 * it under the terms of the GNU Affero General Public License  as
 * published by the Free Software Foundation, either version 3 of  the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Affero  General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public  License
 * along with this program.&nbsp; If not, see <http://www.gnu.org/licenses/>.
 */

package com.jaspersoft.jasperserver.jaxrs.client.dto.reports;

import com.jaspersoft.jasperserver.dto.common.ErrorDescriptor;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Map;

@XmlRootElement(name = "exportExecution")
public class ExportExecution {

    private String id;
    private ExportExecutionOptions options;
    private ExecutionStatus status;
    private ErrorDescriptor errorDescriptor;
    private OutputResourceDescriptor outputResource;
    private Map<String, OutputResourceDescriptor> attachments;

    @XmlElement
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ExportExecutionOptions getOptions() {
        return options;
    }

    public void setOptions(ExportExecutionOptions options) {
        this.options = options;
    }

    public ExecutionStatus getStatus() {
        return status;
    }

    public void setStatus(ExecutionStatus status) {
        this.status = status;
    }

    public ErrorDescriptor getErrorDescriptor() {
        return errorDescriptor;
    }

    public void setErrorDescriptor(ErrorDescriptor errorDescriptor) {
        this.status = ExecutionStatus.failed;
        this.errorDescriptor = errorDescriptor;
    }

    public OutputResourceDescriptor getOutputResource() {
        return outputResource;
    }

    public void setOutputResource(OutputResourceDescriptor outputResource) {
        this.outputResource = outputResource;
    }

    public void setAttachments(Map<String, OutputResourceDescriptor> attachments) {
        this.attachments = attachments;
    }

    @XmlElementWrapper(name = "attachments")
    @XmlElement(name = "attachment")
    public Map<String, OutputResourceDescriptor> getAttachments() {
        return attachments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ExportExecution)) return false;

        ExportExecution that = (ExportExecution) o;

        if (attachments != null ? !attachments.equals(that.attachments) : that.attachments != null) return false;
        if (errorDescriptor != null ? !errorDescriptor.equals(that.errorDescriptor) : that.errorDescriptor != null)
            return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (options != null ? !options.equals(that.options) : that.options != null) return false;
        if (outputResource != null ? !outputResource.equals(that.outputResource) : that.outputResource != null)
            return false;
        if (status != that.status) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (options != null ? options.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (errorDescriptor != null ? errorDescriptor.hashCode() : 0);
        result = 31 * result + (outputResource != null ? outputResource.hashCode() : 0);
        result = 31 * result + (attachments != null ? attachments.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ExportExecution{" +
                "id='" + id + '\'' +
                ", options=" + options +
                ", status=" + status +
                ", errorDescriptor=" + errorDescriptor +
                ", outputResource=" + outputResource +
                ", attachments=" + attachments +
                '}';
    }
}
